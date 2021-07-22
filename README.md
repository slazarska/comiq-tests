# Autotests for [comiq.fi](https://comiq.fi/)
## Technology Stack
|  <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40" height="40"  alt="Java"/></a> |<a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40" height="40"  alt="Gradle"/></a> |<a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="40" height="40"  alt="Selenide"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg" width="40" height="40"  alt="Selenoid"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg" width="40" height="40"  alt="Allure"/></a> |<a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40" height="40"  alt="Allure TestOps"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>
| :---------: | :---------: | :---------: | :---------: | :---------: | :---------: | :---------: | :---------: | 
| Java | Junit5 | Gradle | Selenide | Selenoid |  Allure | Allure TO | Jenkins | 

## Checks are implemented::

- [X] - Opening the main page
- [X] - Check the default state of the main page (title, default language, errors in console log)
- [X] - Transition to the customers page from the main page
- [X] - Transition to the recruitment page from the main page
- [X] - Check the list of vacancies has a vacancy for Automation Test Engineer

## Added video with tests run 

<br><br>
## Screenshots
#### *Selenoid is used to implement the Selenium protocol::*

<br />
<br />
<br />
#### *Jenkins was used as a CI system*
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/jenkins.png)
<br />
<br />
<br />
#### *Allure Report is connected to build reports:*
![screenshot](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/allure00.png)
![screenshot](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/allure01.png)
<br />
<br />
<br />
#### *Allure TestOps was used as a Test Management system:*
<br />
<br />
<br />
#### *Telegram notification configured:*

Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>


