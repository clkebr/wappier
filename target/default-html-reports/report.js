$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userList.feature");
formatter.feature({
  "name": "User should able to manage  wappier Users Management",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "go to url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.go_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify functionality of app",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user hover over each row",
  "keyword": "When "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_hover_over_each_row()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"St Charles Hansen\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_click_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see \"St Charles Hansen\" as header on userView page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_should_able_to_see_as_header_on_userView_page(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[1]/h4\"}\n  (Session info: chrome\u003d88.0.4324.190)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-AJ1I10C\u0027, ip: \u0027192.168.2.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:54165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 883a4a0f45b7c2b921058c0253e6fac5\n*** Element info: {Using\u003dxpath, value\u003d/html/body/wua-root/wua-layout/div/div/div[1]/wua-user-details/div/div/div[1]/h4}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat com.wappier.step_definitions.userManagement.user_should_able_to_see_as_header_on_userView_page(userManagement.java:152)\r\n\tat ✽.user should able to see \"St Charles Hansen\" as header on userView page(file:///C:/Users/user/IdeaProjects/wappier/src/test/resources/features/userList.feature:62)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click edit button",
  "keyword": "And "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_click_edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can write \"Charles Halsen \" as user\u0027s name",
  "keyword": "And "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_can_write_as_user_s_name(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user able to click save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_able_to_click_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "history table contains \"Charles Halsen \"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.history_table_contains(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can go userList page by clicking list button",
  "keyword": "And "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_can_go_userList_page_by_clicking_list_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can sort the table based on \"name\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_can_sort_the_table_based_on(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can see \"St Charles Halsen \" on history on userList page",
  "keyword": "And "
});
formatter.match({
  "location": "com.wappier.step_definitions.userManagement.user_can_see_on_history_on_userList_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});