# Nutrition

Nutrition is a highly configurable mod to enable the creation of health systems in Minecraft.

See [releases tab for downloads](https://github.com/WesCook/Nutrition/releases), and [Wiki for documentation](https://github.com/WesCook/Nutrition/wiki).

![Nutrition GUI](screenshots/gui.png "Nutrition GUI")

Through its [config files](https://github.com/WesCook/Nutrition/wiki/Configuration), Nutrition allows you to define custom food groups (called [nutrients](https://github.com/WesCook/Nutrition/wiki/Nutrients)) which apply [effects](https://github.com/WesCook/Nutrition/wiki/Effects) based on nutrition levels.

By default, Nutrition comes configured with the classic five food group system: dairy, fruit, grain, protein, and vegetables.  However many different systems are possible.  Some examples include:

* A spicy tolerance bar, where eating enough spicy foods will grant a permanent resistance to fire.
* A zombie simulation where you must constantly eat brains/flesh to avoid negative effects.
* Gluten intolerance.  Eat bread, get sick.

## Mods Supported

Mods that are supported with the default five-food group system include:

* [Aether Legacy](https://minecraft.curseforge.com/projects/aether-legacy)
* [Animalium](https://minecraft.curseforge.com/projects/animalium)
* [Animania](https://minecraft.curseforge.com/projects/animania)
* [Aquaculture](https://minecraft.curseforge.com/projects/aquaculture)
* [Better with Mods](https://minecraft.curseforge.com/projects/better-with-mods)
* [Biomes O' Plenty](https://minecraft.curseforge.com/projects/biomes-o-plenty)
* [Edible Bugs](https://minecraft.curseforge.com/projects/edible-bugs)
* [Food Expansion](https://minecraft.curseforge.com/projects/food-expansion)
* [Forestry](https://minecraft.curseforge.com/projects/forestry)
* [Grim Pack](https://minecraft.curseforge.com/projects/grim-pack)
* [Ice and Fire](https://minecraft.curseforge.com/projects/ice-and-fire-dragons-in-a-whole-new-light)
* [Jurassicraft](https://minecraft.curseforge.com/projects/jurassicraft2)
* [Natura](https://minecraft.curseforge.com/projects/natura)
* [Pam's HarvestCraft](https://minecraft.curseforge.com/projects/pams-harvestcraft)
* [Plants](https://minecraft.curseforge.com/projects/plants)
* [Roots](https://minecraft.curseforge.com/projects/roots)
* [Rustic](https://minecraft.curseforge.com/projects/rustic)
* [Simple Corn](https://minecraft.curseforge.com/projects/simple-corn)
* [Simply Tea!](https://minecraft.curseforge.com/projects/simply-tea)
* [Tinkers Construct](https://minecraft.curseforge.com/projects/tinkers-construct)

Mod support contributions are welcome!  Please create a [Pull Request](https://github.com/WesCook/Nutrition/pulls) or an [Issue](https://github.com/WesCook/Nutrition/issues) with the related .json files.

When updating the mod, please clear your /nutrition/ config directory to receive new mod support (point releases will not require this).

## Changelog

[v1.5.0](https://github.com/WesCook/Nutrition/releases/tag/v1.5.0) - 2017-06-28
* Added nourished and malnourished effects.  Each adds or subtracts one heart per amplifier level.
* Added `cumulative_modifier` property to effects.  In cumulative detection mode, this will increase the amplifier by the provided value for each cumulative level.  

[v1.4.0](https://github.com/WesCook/Nutrition/releases/tag/v1.4.0) - 2017-06-22
* Added support for Aether Legacy, Animalium, Aquaculture, Ice and Fire, Jurassicraft, Plants, and Rustic (contribution from Sunconure11)

[v1.3.1](https://github.com/WesCook/Nutrition/releases/tag/v1.3.1) - 2017-06-13
* Enabled Nutrition key to both open and close GUI
* Fixed severe nutrition decay bug in multiplayer

[v1.3.0](https://github.com/WesCook/Nutrition/releases/tag/v1.3.0) - 2017-06-10
* Corrected packet sync error which resulted in clients showing incorrect data under some conditions 
* Added Dutch localizations (contribution from Arthur Dent)
* Added Spanish localizations (contribution from Rougito)

[v1.2.0](https://github.com/WesCook/Nutrition/releases/tag/v1.2.0) - 2017-06-03
* Updated HarvestCraft support on 1.10
* Added German localizations (contribution from ACGaming)
* Added Swedish localizations (contribution from John "Rufus" Lundström)
* Added Norwegian localizations (contribution from Marcus "Rex" Holm)

[v1.1.0](https://github.com/WesCook/Nutrition/releases/tag/v1.1.0) - 2017-05-31
* Added support for Biomes O' Plenty, Forestry, Natura, Roots, Simply Tea!, and Tinkers Construct (contribution from KnightMiner)
* Nutrient field can now be negated from other detection modes (contribution from KnightMiner)

[v1.0.1](https://github.com/WesCook/Nutrition/releases/tag/v1.0.1) - 2017-05-28
* Improved detection when attaching capability

[v1.0.0](https://github.com/WesCook/Nutrition/releases/tag/v1.0.0) - 2017-05-28
* Initial release
