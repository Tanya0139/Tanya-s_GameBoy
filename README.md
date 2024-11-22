
---
# Card Game 🎴

A SwiftUI-based card game app where players compete against the CPU by drawing random cards. This project highlights the use of SwiftUI components, state management, and interactive UI design for a simple yet engaging gaming experience.

---

## Table of Contents

- [Features](#features)
- [Gameplay](#gameplay)
- [Project Structure](#project-structure)
- [Requirements](#requirements)
- [Installation](#installation)
- [Screenshots](#screenshots)
- [Credits](#credits)
- [License](#license)

---

## Features

- **Random Card Dealing**: Cards for the player and the CPU are randomized with each deal.
- **Score Tracking**: Scores are updated dynamically based on the card values.
- **User-Friendly Interface**: Engaging visuals and smooth interactions with buttons and animations.
- **SwiftUI Best Practices**: Demonstrates state management, reusable views, and responsive layouts.

---

## Gameplay

1. Launch the app.
2. Tap the **Deal** button to draw cards for the player and CPU.
3. The app determines the winner based on card values:
   - The player with the higher card value scores a point.
4. Play as many rounds as you like to achieve the highest score!

---

## Project Structure

- **ContentView.swift**: The main view containing the UI and game logic.
- **Assets.xcassets**: Contains images for cards, buttons, and the background.
- **Logic**:
  - Randomized card values using `Int.random(in:)`.
  - Conditional logic to determine the winner and update scores.

---

## Requirements

- **iOS**: 15.0 or later  
- **Xcode**: 14.0 or later  
- **Swift**: 5.7 or later  

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/card-game.git
   ```
2. Open the project in Xcode:
   ```bash
   cd card-game
   open card-game.xcodeproj
   ```
3. Build and run the app on a simulator or a connected device.

---

## Screenshots
<img width="330" alt="Screenshot 2024-11-22 at 5 29 17 PM" src="https://github.com/user-attachments/assets/7349b3cb-81d7-48c1-a1b0-1761666885cf">

![final](https://github.com/user-attachments/assets/af28f37b-a67f-4850-83df-cf91e962fdbb)

---

## Credits

- **Developer**: Tanya Tripathi  
- **Framework**: SwiftUI  
- **Images**: Custom card and background designs.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.  

---
