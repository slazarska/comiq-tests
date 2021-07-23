# Autotests for [comiq.fi](https://comiq.fi/)
## Technology Stack
| GitHub | Java | Gradle | Junit5 | Selenide |
|:----:|:----:|:------:|:------:|:--------:|
| <img src="img/GitHub.svg" width="40" height="40"> | <img src="img/Java.svg" width="40" height="40"> | <img src="img/Gradle.svg" width="40" height="40"> | <img src="img/JUnit5.svg" width="40" height="40"> | <img src="img/Selenide.svg" width="40" height="40"> |

| Jenkins | Selenoid | Allure Report | Allure TestOps | 
|:--------:|:-------------:|:---------:|:-------:|
| <img src="img/Jenkins.svg" width="40" height="40"> | <img src="img/Selenoid.svg" width="40" height="40"> | <img src="img/Allure_Report.svg" width="40" height="40"> | <img src="img/Allure_EE.svg" width="40" height="40"> 

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
![image]()
<br />
<br />
<br />
#### *Jenkins was used as a CI system*
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/jenkins.png)
<br />
<br />
<br />
#### *Allure Report is connected to build reports:*
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/allure00.png)
![image](https://github.com/slazarska/comiq-tests/blob/master/src/test/resources/img/allure01.png)
<br />
<br />
<br />
#### *Allure TestOps was used as a Test Management system:*
![image]()
<br />
<br />
<br />
#### *Telegram notification configured:*
![screenshot]()
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

Thanks :pray:
:purple_heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:purple_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>


