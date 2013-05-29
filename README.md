pastebin
========

Just a pastebin project for Maven projects, everything of interest may be found in the branches.

Branch: `surefire-reportonly-test`

Invoke:
* `mvn -Dmaven-surefire-plugin.version=2.14.1` runs phase `validate` additionally during `site`.
* `mvn -Dmaven-surefire-plugin.version=2.15-SNAPSHOT` does not run phase `validate` additionally during `site`.


