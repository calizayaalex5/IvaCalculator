
# IVA CALCULATOR


Readme · MD
# Overview
 
As a software engineer, I wanted to strengthen my understanding of Java's core language features by building a small, complete application from scratch rather than isolated exercises. This project gave me hands-on practice with object-oriented design, the Java Collections Framework, and file persistence — concepts that come up constantly in real-world software development.
 
The software I wrote is a **VAT/IVA Calculator**. It lets a user enter a product price, and the application calculates the 19% VAT amount and the final total price. Every calculation is stored in memory using an `ArrayList`, displayed in the interface, and automatically saved to a local text file so the calculation history persists between sessions.
 
My purpose for writing this software was both practical and educational: I need to calculate VAT regularly for products I sell in my current job, so I wanted a small tool that does this quickly and accurately. At the same time, it let me practice classes, encapsulation, collections, file I/O, and building a graphical interface with Java Swing.
 
[Software Demo Video](http://youtube.link.goes.here)
 
# Development Environment
 
I developed this project using **NetBeans IDE**, including its built-in visual GUI Builder to design the Swing interface (JFrame, JLabel, JTextField, JButton, JTextArea, JScrollPane). Version control and code hosting were done through **Git** and **GitHub**.
 
**Programming language:** Java (JDK).
 
**Libraries/frameworks used:**
- `java.util.ArrayList` — from the Java Collections Framework, to store the calculation history in memory.
- `java.io` (`BufferedWriter`, `FileWriter`, `BufferedReader`, `FileReader`, `File`) — to read and write the calculation history to a local `.txt` file.
- `javax.swing` — for the graphical user interface (JFrame, JTextField, JButton, JTextArea, JScrollPane, JOptionPane for error dialogs).

# Useful Websites
 
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)
- [Apache NetBeans Documentation](https://netbeans.apache.org/front/main/documentation/)
- [Youtube - CURSO GRATIS JAVA PARA PRINCIPIANTES ☕👩🏻‍💻 By TodoCode](https://youtu.be/qxXcI56NfnE?si=FjAENDp3GnVrpPan)
- [Codedex - Course of Java](https://www.codedex.io/java)

# Future Work
 
- Add input validation to prevent negative prices, not just non-numeric input.
- Allow the user to change the VAT rate instead of having it fixed at 19%.
- Add a button to clear the entire calculation history (not just the current input field).
- Improve the file format (e.g. use CSV) to make the saved history easier to parse and extend later.
- Add unit tests for the `Calculation` and `IVACalculator` classes. 