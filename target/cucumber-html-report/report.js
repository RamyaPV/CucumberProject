$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RamyaPV/Desktop/Ajira/Crater/src/main/java/crater/qa/Features/PIM.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ***Ramya***"
    },
    {
      "line": 2,
      "value": "#Application : OrangeHRM"
    }
  ],
  "line": 3,
  "name": "OrangeHRM PIM page validations",
  "description": "",
  "id": "orangehrm-pim-page-validations",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13700565400,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "login the OrangeCRM with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User login with \"username\" ,\"password\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 17
    },
    {
      "val": "password",
      "offset": 29
    }
  ],
  "location": "Loginstep.user_login_with(String,String)"
});
formatter.result({
  "duration": 9347366700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "verify whether the user is able to add an Employee",
  "description": "",
  "id": "orangehrm-pim-page-validations;verify-whether-the-user-is-able-to-add-an-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User Clicks the Add Employee Link and fills the employee details",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName"
      ],
      "line": 13
    },
    {
      "cells": [
        "Raj",
        "Rajan"
      ],
      "line": 14
    },
    {
      "cells": [
        "Hema",
        "Hemaa"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Employee should be added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.user_Clicks_the_Add_Employee_Link_and_fills_the_employee_details(DataTable)"
});
formatter.result({
  "duration": 11036426300,
  "status": "passed"
});
formatter.match({
  "location": "Loginstep.employee_should_be_added_successfully()"
});
formatter.result({
  "duration": 125007800,
  "status": "passed"
});
formatter.after({
  "duration": 110000,
  "status": "passed"
});
formatter.before({
  "duration": 14207519500,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "login the OrangeCRM with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User login with \"username\" ,\"password\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 17
    },
    {
      "val": "password",
      "offset": 29
    }
  ],
  "location": "Loginstep.user_login_with(String,String)"
});
formatter.result({
  "duration": 10243415400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "verify whether the user is able to Edit the Employee Profile",
  "description": "",
  "id": "orangehrm-pim-page-validations;verify-whether-the-user-is-able-to-edit-the-employee-profile",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "User Clicks the Edit  and fills the employee Personal details",
  "rows": [
    {
      "cells": [
        "empname",
        "gender",
        "nationality",
        "Marital status",
        "DOB"
      ],
      "line": 21
    },
    {
      "cells": [
        "Raj Rajan",
        "1",
        "India",
        "Single",
        "1990-10-05"
      ],
      "line": 22
    },
    {
      "cells": [
        "Hema Hema",
        "2",
        "Greek",
        "Maried",
        "1989-02-20"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Employee details should be edited and successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.user_Clicks_the_Edit_and_fills_the_employee_Personal_details(DataTable)"
});
formatter.result({
  "duration": 57553322100,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: India\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-SM2UC3MS\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat crater.qa.cucumber.pages.PIMPage.editPersonaldetails(PIMPage.java:110)\r\n\tat crater.qa.stepDefinition.Loginstep.user_Clicks_the_Edit_and_fills_the_employee_Personal_details(Loginstep.java:61)\r\n\tat ✽.When User Clicks the Edit  and fills the employee Personal details(C:/Users/RamyaPV/Desktop/Ajira/Crater/src/main/java/crater/qa/Features/PIM.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Loginstep.employee_details_should_be_edited_and_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 394530400,
  "status": "passed"
});
});