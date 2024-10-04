# test-mvn-gpg-plugin

This repo tries to sign a simple maven artefact
using the `maven-gpg-plugin` within the GitHub workflow
[build-and-sign](./.github/workflows/build-and-sign.yml).

This works well for the `maven-gpg-plugin` version `v3.1.0` for
all runners.

However, starting with version `v3.2.0` the signing
fails for the `windows` runners. They fail for all combinations
of `windows-2019`, `windows-2022`, `jdk17` and `jdk21`.

---

> This issue was resolved with `maven-gpg-plugin` version `v3.2.7`
> See https://github.com/ralfkonrad/test-mvn-gpg-plugin/pull/30 for more details.
