# Autotests for [comiq.fi](https://comiq.fi/)
## Technology Stack
| Java | Gradle | Junit5 | Selenide | Jenkins | Selenoid | Allure Report | Allure TestOps | 
|:----:|:------:|:------:|:--------:|:-------:|:--------:|:---------------:|:--------------:|
| <img src="src/test/resources/img/Java.svg" width="40" height="40"> | <img src="src/test/resources/img/Gradle.svg" width="40" height="40"> | <img src="src/test/resources/img/JUnit5.svg" width="40" height="40"> | <img src="src/test/resources/img/Selenide.svg" width="40" height="40"> | <img src="src/test/resources/img/Jenkins.svg" width="40" height="40"> | <img src="src/test/resources/img/Selenoid.svg" width="40" height="40"> | <img src="src/test/resources/img/Allure_Report.svg" width="40" height="40"> | <img src="src/test/resources/img/Allure_EE.svg" width="40" height="40"> | 

## Checks are implemented::

- [X] - Opening the main page
- [X] - Check the default state of the main page (title, default language, errors in console log)
- [X] - Transition to the customers page from the main page
- [X] - Transition to the recruitment page from the main page
- [X] - Check the list of vacancies has a vacancy for Automation Test Engineer

## Added video with tests run 
![video](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/video/checkAQAtest.gif)
<br><br>
## Screenshots
#### *Selenoid is used to implement the Selenium protocol::*
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/selenoid.png)
<br />
<br />
#### *Jenkins was used as a CI system*
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/jenkins.png)
<br />
<br />
#### *Allure Report is connected to build reports:*
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/allure00.png)
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/allure01.png)
<br />
<br />
#### *Allure TestOps was used as a Test Management system:*
![image]()
<br />
<br />
#### *Telegram notification configured:*
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/bot.png)
<br />
<br />
Run tests with filled local.properties:
```bash
gradle clean test
```

Run tests with not filled local.properties:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve allure report:
```bash
allure serve build/allure-results
```

Thanks :pray:<br/>
:purple_heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:purple_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>


