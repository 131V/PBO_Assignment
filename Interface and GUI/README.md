# Aku Buat Swing - Birthday Greeting App

A simple Java Swing desktop application that demonstrates the use of **5 core GUI components/parts**. The application prompts the user to enter their name and displays a personalized birthday greeting when the button is pressed.

## Overview

When launched, the application opens a centered window titled **"Aku Ulang Tahun"** (It's My Birthday). Users can type their name into the input field and click the **"Klik Aku"** (Click Me) button to dynamically update the greeting message below. If the input is left blank, a reminder message is displayed instead.

## Screenshots

### 1. Initial State
When the application starts, it prompts the user to enter their name:

![Initial State](Screenshot%202026-11-21%20143415.png)

### 2. Greeting Displayed
After entering a name (e.g., "Bayu") and clicking **"Klik Aku"**, the birthday greeting appears:

![Greeting Output](Screenshot%202026-11-21%20143433.png)

## The 5 GUI Components / Parts

This code serves as a practical example of the following five Java Swing (`javax.swing`) components:

1. **`JFrame` (Top-Level Window)**
   * **Usage in code:** `JFrame frame = new JFrame("Aku Ulang Tahun");`
   * **Role:** Acts as the main application window with a title bar, borders, and window controls (minimize, maximize, close). It holds all other panels and components.

2. **`JPanel` (Container)**
   * **Usage in code:** `JPanel panelInput` and `JPanel panelHasil`
   * **Role:** Lightweight containers used to group and organize other GUI elements. `panelInput` arranges the input widgets horizontally using `BoxLayout`, while `panelHasil` manages the output label using `OverlayLayout`.

3. **`JLabel` (Text Display)**
   * **Usage in code:** `JLabel labelNama` and `JLabel labelHasil`
   * **Role:** Displays non-editable text on the screen. `labelNama` serves as an instructional prompt ("Masukkan Nama:"), while `labelHasil` dynamically updates to show the final greeting or validation message.

4. **`JTextField` (Text Input)**
   * **Usage in code:** `JTextField fieldNama = new JTextField(15);`
   * **Role:** Provides a single-line input box allowing the user to type their name into the application.

5. **`JButton` (Interactive Button)**
   * **Usage in code:** `JButton tombolSapa = new JButton("Klik Aku");`
   * **Role:** A clickable push-button that triggers an event. Attached to a `ChangeListener`, it checks the button's pressed state to read the text field and update the output label.

## Prerequisites

* **Java Development Kit (JDK):** JDK 8 or higher installed on your system.

## How to Run

1. Save the source code in a file named `akubuatswing.java`.
2. Open your terminal or command prompt and navigate to the directory containing the file.
3. Compile the Java file:
   ```bash
   javac akubuatswing.java
   ```
4. Run the compiled program:
   ```bash
   java akubuatswing
   ```