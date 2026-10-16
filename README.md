# XMLFilterTest — SAX XML Filter Demo

Small Java demo showing how to chain a SAX `XMLFilter` with a `ContentHandler` to transform and inspect an XML document while it is being parsed.

## How it works

- `src/SimpleXMLFilter.java` — extends `XMLFilterImpl` and renames the `libro`/`autor` elements to `LIBRO`/`AUTOR` as the document streams through.
- `src/TestHandler.java` — a `DefaultHandler` that prints the renamed elements, their attribute values (uppercased), and their text content.
- `src/XMLFilterTest.java` — wires the filter between a `SAXParser`'s `XMLReader` and the handler, then parses `libro.xml`.
- `libro.xml` — sample input document used by the demo.

## Requirements

- JDK 8 or later (uses `javax.xml.parsers` from the standard library, no external dependencies).

## Usage

```sh
# Compile all sources into classes/
javac -d classes src/*.java

# Run from the repository root (libro.xml must be in the working directory)
java -cp classes XMLFilterTest
```

The program parses `libro.xml`, renames each `libro`/`autor` element to uppercase on the fly, and prints the element labels, their uppercased attribute values, and their text content.

## License

This repository is licensed under the [GNU General Public License v3.0](LICENSE).
