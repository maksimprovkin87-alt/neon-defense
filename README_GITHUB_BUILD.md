# NEON DEFENSE 1.0 — сборка APK через GitHub Actions

## Что внутри
- Android-проект с Gradle-конфигурацией (AGP 8.7.3, Gradle 8.9, JDK 17)
- GitHub Actions workflow: `.github/workflows/build-apk.yml`
- APK собирается командой `gradle assembleDebug`

## Как получить APK
1. Создайте новый пустой репозиторий на https://github.com (например, `neon-defense`). Не добавляйте README, лицензию или `.gitignore` при создании.
2. Распакуйте этот архив на компьютере.
3. Загрузите **содержимое** распакованной папки в корень репозитория GitHub. В корне должны быть видны `settings.gradle`, `build.gradle`, `gradle.properties`, папка `app` и папка `.github`.
4. Откройте вкладку **Actions** репозитория. Если GitHub попросит разрешить Actions, подтвердите.
5. Выберите workflow **Build NEON DEFENSE APK** → **Run workflow** → **Run workflow**.
6. Дождитесь зелёного статуса завершения. Откройте выполненный запуск и внизу страницы найдите **Artifacts**.
7. Скачайте `NEON-DEFENSE-debug-apk.zip`, распакуйте его. Внутри будет `app-debug.apk`.
8. Перенесите APK на Android-телефон и установите. Если Android спросит разрешение, разрешите установку приложений из этого источника.

## Автоматические сборки
После первой загрузки проекта в ветку `main` или `master` workflow также запускается автоматически при каждом push.

## Важно
Это debug APK для тестирования, не релизная подписанная версия для Google Play. Сборка ещё не была выполнена в GitHub Actions, поэтому успешность компиляции пока не подтверждена.
