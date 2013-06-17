pastebin
========

Just a pastebin project for Maven projects, everything of interest may be found in the branches.

Branch: `surefire-encoding-test` relates to [SUREFIRE-998](https://jira.codehaus.org/browse/SUREFIRE-998).

Switch between different `file.encoding`

**surefire-2.14.1**


```
env JAVA_TOOL_OPTIONS="-Dfile.encoding=ISO-8859-1" mvn -Dmaven-surefire-plugin.version=2.14.1
```

* Umlauts are encoded (correctly) as ISO-8859-1 in 
`target/surefire-reports/net.friedenhagen.surefireencodingtest.EncodingTest-output.txt` and 
* (correctly as stated by the XML-declaration) as UTF-8 in 
`target/surefire-reports/TEST-net.friedenhagen.surefireencodingtest.EncodingTest.xml`

**surefire-2.15**


```
env JAVA_TOOL_OPTIONS="-Dfile.encoding=ISO-8859-1" mvn -Dmaven-surefire-plugin.version=2.15
```

* Umlauts are encoded (correctly) as ISO-8859-1 in 
`target/surefire-reports/net.friedenhagen.surefireencodingtest.EncodingTest-output.txt` and 
* (*incorrectly* as the XML-declaration state they should be UTF-8) as well as ISO-8859-1 in 
`target/surefire-reports/TEST-net.friedenhagen.surefireencodingtest.EncodingTest.xml`


