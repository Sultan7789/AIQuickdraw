# 🤠 AI-Powered Quickdraw

Howdy! This is a Java based terminal game that tests your reaction time against an A.I. Cowboy. Inspired by 1-2 Switch, and Western Standoffs, this game measures your reflexes and dynamically adjusts the difficulty based on your performance. 


## 🎮 How to Play

1. Run the program.
2. When prompted with **"DRAW NOW!"**, press Enter **as fast as possible**.
3. The AI will "draw" with a randomized reaction time based on your recent performance.
4. You play **5 rounds**, and the fastest draw wins each one.
5. Win the most rounds, you win the game.

Beware:
- Drawing too early results in a **false start loss**. You shot the dirt.
- Drawing too late? It's too late for you. You get **blasted by the AI**. 

## 🧠 AI Behavior

The AI:
- Adjusts its speed based on your last 10 valid reaction times.
- Ignores **reaction times < 100ms or > 700ms** to prevent cheating or misfires.
- Gets **more lenient** if you keep losing — up to 150ms bonus time added. (To keep it fun for the slower triggered cowboys)

---

## 📁 Files Overview

- `Main.java` – Entry point that starts the game.
- `ReactionGame.java` – Manages the game rounds and scoring.
- `ReactionAI.java` – Contains AI logic, leniency, and adaptation mechanism. 

---

## 🛫 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/YOUR_REPO_NAME.git

Created by: Sultan Alnuaimi
