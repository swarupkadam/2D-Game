# Adventure Time Project

A Java-based 2D top-down action RPG built with Swing/AWT.  
This project features tile-based world exploration, combat, NPC interaction, trading, inventory/equipment, projectiles, map transitions, save/load, and a day-night lighting cycle.

## Genre
- Indie game
- 2D top-down action RPG
- Adventure / Zelda-like style

## Project Structure

```text
Adventure_time-project/
+-- Adventure Time.exe      # Windows executable (run directly)
+-- 2D Game/
    +-- src/                # Java source code
    |   +-- main/           # Game loop, input, UI, bootstrapping
    |   +-- entity/         # Player, NPCs, base entity logic
    |   +-- monster/        # Enemy implementations
    |   +-- object/         # Weapons, consumables, keys, chests, etc.
    |   +-- tile/           # Tile system, map rendering, minimap
    |   +-- tile_interactive/ # Breakable/interactable world tiles
    |   +-- environment/    # Lighting and day-night system
    |   +-- ai/             # Pathfinding (A*)
    |   +-- data/           # Save/load serialization
    +-- res/                # Runtime resources (maps, sprites, sound, fonts)
    +-- bin/                # Compiled classes + copied assets
    +-- config.txt          # Runtime config (fullscreen/music/sfx)
    +-- save.dat            # Save-game file
```

## Core Features

### 1. Game Engine Loop
- Fixed target FPS game loop (`60 FPS`) in `GamePanel`.
- State-driven rendering/update pipeline (title, play, pause, dialogue, inventory, options, trade, game over, transition, sleep, map).

### 2. Player Systems
- 4-direction movement.
- Melee combat with animation phases.
- Guard/parry behavior.
- Projectile casting (`Fireball`) with mana cost.
- Stats and progression (level, exp, attack/defense scaling).

### 3. World and Maps
- Tile-based world (`50 x 50`) with collision tiles.
- Multiple maps, including an interior map.
- Full-screen map and minimap support.

### 4. NPC and Interaction
- Dialogue progression system.
- Merchant NPC with buy/sell flow.
- Event tiles (pit damage, healing pool, teleport points).

### 5. Enemies and AI
- Enemy types: Green Slime and Orc.
- Random movement and conditional chase behavior.
- A* pathfinding via `PathFinder`/`Node`.
- Enemy attacks, knockback, and drop tables.

### 6. Inventory and Items
- Weapons (sword, axe), shields, lantern, keys, potions, tent, loot items.
- Equipment switching and stat updates.
- Stackable items and inventory capacity.
- Contextual object interactions (chests, doors).

### 7. Environment and Effects
- Day/dusk/night/dawn cycle with alpha-based overlay.
- Dynamic radial lighting around player when carrying a light source.
- Particle effects for impacts/destruction.

### 8. Audio and UX
- Background music loop + sound effects.
- Configurable music and SFX volume.
- Title screen, pause menu, options, dialogue windows, trade UI.

### 9. Save and Load
- Save/load implemented via Java serialization (`save.dat`).
- Persists:
  - Player stats
  - Inventory and amounts
  - Equipped items
  - Object states/positions/opened chests across maps

## Controls

### In-game
- `W A S D`: Move
- `Enter`: Interact / Confirm / Attack
- `F`: Shoot / Cast projectile
- `Space`: Guard / Parry
- `C`: Character/Inventory screen
- `P`: Pause
- `Esc`: Options
- `M`: Full map toggle
- `X`: Minimap toggle

### Menus
- Arrow keys: Navigate
- `Enter`: Confirm
- `Esc`: Back (context dependent)

## Tech Stack
- Java 17+ (project compiles/runs on newer JDKs as well)
- Java Swing / AWT
- Eclipse project metadata included (`.project`, `.classpath`, `.settings`)

## How to Run

### Option 1: Run the executable (Windows)
From the project root:

```powershell
.\Adventure Time.exe
```

### Option 2: Run compiled output
From `2D Game`:

```powershell
java -cp bin main.Main
```

### Option 3: Compile then run
From `2D Game`:

```powershell
javac -d bin -sourcepath src src/main/Main.java
java -cp bin main.Main
```

## Notes
- This repository includes source (`src`), compiled output (`bin`), and a Windows executable (`Adventure Time.exe`).
- `config.txt` and `save.dat` are runtime-generated/updated files.
- Assets are loaded from classpath resource folders (maps, sprites, sounds, fonts).

## Credits
- Project title: Adventure Time
- Author credit shown in-game: Swarup
