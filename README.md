# 🚗 Vehicle Registration

A Java console application for capturing vehicle registration details, with validation for South African (Gauteng) number plates and 17-character VINs. I built it to practise Java fundamentals, OOP and input validation.

`Java` `OOP` `Console I/O` `BlueJ`

---

## ✅ Features

- Start-up menu (register, view or exit). Registration works now, and view and exit are next on the list (see Next steps)
- Captures **make, model, VIN, licence plate, year of manufacture and mileage**
- **VIN validation:** must be exactly 17 characters (automatically uppercased)
- **Licence plate validation** for both Gauteng formats:
  - Old format: `ABC123GP` (3 letters, 3 digits, GP)
  - New format: `AB12CDGP` (2 letters, 2 digits, 2 letters, GP)
- Register several vehicles in one session

---

## 📁 Project structure

| File | Purpose |
|---|---|
| `Main.java` | Entry point: menu, user input and validation logic |
| `Car.java` | Vehicle model with private fields, a constructor, getters and setters |
| `package.bluej`, `README.TXT` | BlueJ project files |

---

## 🔧 How to run

**Terminal**

```bash
javac Main.java Car.java
java Main
```

**BlueJ:** open the project folder, right-click `Main`, then choose `void main(String[] args)`.

---

## 🚀 Next steps

- Store each vehicle as a `Car` object in an `ArrayList` so that menu option 2 (view registered vehicles) can list them
- Make menu option 3 exit straight away
- Validate the year of manufacture and mileage as numbers

---

## 👩🏾‍💻 Author

**Sharon Galela** · [LinkedIn](https://www.linkedin.com/in/sharon-galela-6998bb265) · [GitHub](https://github.com/ShariieG)
