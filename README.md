# EMI Ma BlockGame

This mod is an extension to [EMI](https://github.com/emilyploszaj/emi), the featureful and accessible item and recipe viewer for Minecraft. It shows [BlockGame](https://blockgame.info/) vendor recipes and items. That's all it's supposed to do.

## Disclaimer

This is not associated in any official way with [BlockGame](https://blockgame.info/), its merely a fan creation.

## Features

Makes learned [Blockgame Journal](https://modrinth.com/mod/blockgame-journal) recipes show up in EMI.

## Mod Dependencies

- [Fabric API](https://modrinth.com/mod/fabric-api) or [QFAPI](https://modrinth.com/mod/qsl)
- [Blockgame Journal](https://modrinth.com/mod/blockgame-journal)
  - [Cloth Config API](https://modrinth.com/mod/cloth-config)
- [EMI](https://modrinth.com/mod/emi)

## Contributing and support

Pull requests are welcome. I am no _Java_ dev. (May rewrite it in Rust later... 🦀)

### TODOs

- Items
  - Gold (money)
- Dynamically update EMI
  - Create and register EMI items that are learned
    - IMPORTANT: is it even possible to dynamically do this?
  - Create categories for each vendor
  - Register recipes

## Special Thanks

- bnjc, the author of [Blockgame Journal](https://modrinth.com/mod/blockgame-journal)
- Nelas, the author of [BlockGame Wiki](https://blockgame.piratesoftware.wiki) for help with recipes before
- [BlockGame](https://piratesoftware.wiki/wiki/Blockgame) [Java](https://piratesoftware.wiki/wiki/Java) devs: **Jake** and [Thor](https://piratesoftware.wiki/wiki/Thor)
- [PenguinTheFluffy](https://piratesoftware.wiki/wiki/PenguinTheFluffy) (and previously Notker) for the [Unofficial BlockGame resource pack](https://modrinth.com/resourcepack/unofficial-blockgame-texture-pack)  
  (which contains item IDs which made this project easier to start)
