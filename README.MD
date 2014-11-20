This repository shows a not working Android Annotations example with the current android-gradle pluign 1.4 and Android Annotations 3.2

The app is composed of a main app module and a library module.
Both use Android Annotations (AA). The lib module has a workaround to find the AndroidManifest.xml in debug builds (it refers to the release manifest, because gradle does not build the debug variant for libs).

However, the manifest is found for the library module but not for the main app.

Could someone please point me in the right direction on how to build this simplified project to have a controller Bean in the lib module and reference it successfully in the main app activity by using AA?

I appreciate any help.
