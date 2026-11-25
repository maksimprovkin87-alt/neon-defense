# NEON DEFENSE — Android project v0.8

Portrait Android Tower Defense prototype (Android WebView + HTML Canvas).

## v0.8 changes
- Procedurally rendered, animated alien silhouettes with glowing cores and health bars.
- More detailed, distinct laser, cannon and cryo turret designs.
- Tower upgrade by tapping an already placed turret; levels increase its damage.
- Improved visual combat readability and retained particle bursts, audio toggle and local progress saving from v0.7.
- Five sector environments and route layouts retained.

## Build
Open in Android Studio with JDK 17 and Android Gradle Plugin 8.7.3. Sync Gradle, then Build > Build Bundle(s) / APK(s) > Build APK(s).

## Limitations
This remains a prototype. Art is procedurally drawn with Canvas rather than imported sprite sheets; animation is procedural, not frame-based. No authored soundtrack, polished campaign progression or device QA has been completed. APK has not been built or tested on a physical device.


## v0.9 — Campaign update
- Added a 25-mission campaign map across five sectors, mission unlocks and completion records.
- Added Easy / Normal / Hard difficulty selection.
- Added mission rewards (credits and research points) and a persistent technology tree (tower damage, range, core armor).
- Campaign progress and technology upgrades are stored in localStorage alongside the game save.
- Mission objective: survive five waves; boss appears on wave five.
- Visuals remain procedural Canvas graphics; no external sprite sheets or audio assets are included.
- This is an Android Studio WebView project source archive. APK has not been built or device-tested.


## v1.0 — Visual combat pass
- Reworked the Canvas battlefield with layered terrain, a subtle tactical grid, animated route markings and a glowing core endpoint.
- Replaced simple circles with procedural armored tower silhouettes and animated alien figures, including a distinct boss silhouette.
- Added glow/bloom styling to laser bolts, tower cores and impact particles.
- Preserved the 25-mission campaign, difficulty selection, rewards, technology tree and local save data from v0.9.
- Art remains generated procedurally at runtime in Canvas; this release does not contain imported sprite sheets or recorded soundtracks.
- Android Studio source project only. APK has not been built or tested on a physical device.
