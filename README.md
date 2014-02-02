Simple multi-module project in which tests are seperated from the main project.
===============================================================================

* Note that currently that the test project adds `src/main/resources/EMPTY` so
  creation of `target/classes` is enforced.
* The compiled classes of `junit` and `app` are unpacked in `test/target/classes`.
* Additionally `app/src/main/java` and sources of `junit` are added as source folders
  in the phase `prepare-package`.

By means of this, coverage for `app` and used `junit` classes are included in coverage.



