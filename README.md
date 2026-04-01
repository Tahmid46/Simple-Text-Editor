# Simple Text Editor

A feature-rich text editor built with Java Swing, developed using NetBeans IDE.

## Features

- **File Operations** – Create new documents, open existing files, and save your work
- **Supported Formats** – Read and write `.txt`, `.rtf`, and `.java` files
- **Text Formatting** – Change font family, font size, and text color
- **Clipboard Support** – Cut, copy, and paste via toolbar, menu, or right-click context menu
- **Image Insertion** – Embed PNG images directly into your document
- **Syntax Highlighting** – Keywords from C/C++/Java are highlighted automatically as you type
- **Cursor Position** – Status bar displays the current row and column
- **Windows Look & Feel** – Native Windows UI theme applied on startup

## Getting Started

### Prerequisites

- Java Runtime Environment (JRE) 7 or later

### Running the Application

Navigate to the `dist` folder and run:

```bash
java -jar "MyTextEditor2.jar"
```

### Building from Source

The project uses Apache Ant (via NetBeans). Open the project in **NetBeans 8.2** (or later) and use **Run > Build Project**, or run from the command line:

```bash
ant jar
```

The compiled JAR will be placed in the `dist/` directory.

## Project Structure

```
Simple-Text-Editor/
├── src/
│   └── mytextform/
│       ├── mytextform.java   # Application entry point
│       ├── myform.java       # Main editor UI and logic
│       ├── TextFilter.java   # File-chooser filter (.txt, .rtf, .java)
│       └── *.png             # Toolbar icon assets
├── build/                    # Compiled class files (generated)
├── dist/                     # Distribution JAR (generated)
├── nbproject/                # NetBeans project metadata
├── build.xml                 # Ant build script
└── manifest.mf               # JAR manifest
```

## Dependencies

| Library | Purpose |
|---------|---------|
| `jai_codec.jar` | Image codec support for importing PNG images |

## Authors

- **Maj. Mahfuz**
- **Tahmid**
