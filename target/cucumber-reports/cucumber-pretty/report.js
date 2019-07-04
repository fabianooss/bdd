$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:hello2/is_it_friday_yet.feature");
formatter.feature({
  "name": "Is it Friday yet?",
  "description": "  Everybody wants to know when it\u0027s Friday",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Today is or is not Friday",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "today is \"\u003cday\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.step({
  "name": "I should be told \"\u003canswer\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "day",
        "answer"
      ]
    },
    {
      "cells": [
        "Friday",
        "TGIF"
      ]
    },
    {
      "cells": [
        "Sunday",
        "Nope"
      ]
    },
    {
      "cells": [
        "anything else!",
        "Nope"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Today is or is not Friday",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "today is \"Friday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "IsFridaySteps.today_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.match({
  "location": "IsFridaySteps.i_ask_whether_it_s_Friday_yet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be told \"TGIF\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IsFridaySteps.i_should_be_told(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Today is or is not Friday",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "today is \"Sunday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "IsFridaySteps.today_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.match({
  "location": "IsFridaySteps.i_ask_whether_it_s_Friday_yet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be told \"Nope\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IsFridaySteps.i_should_be_told(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Today is or is not Friday",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "today is \"anything else!\"",
  "keyword": "Given "
});
formatter.match({
  "location": "IsFridaySteps.today_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.match({
  "location": "IsFridaySteps.i_ask_whether_it_s_Friday_yet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be told \"Nope\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IsFridaySteps.i_should_be_told(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("classpath:hello2/login.feature");
formatter.feature({
  "name": "Test Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Success and Failure",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open Gestum Application",
  "keyword": "Given "
});
formatter.step({
  "name": "I try to login with \"\u003cuser\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should see page with title \"\u003cresult_page\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "password",
        "result_page"
      ]
    },
    {
      "cells": [
        "admin",
        "admin",
        "gestum 6"
      ]
    },
    {
      "cells": [
        "invalid",
        "1",
        "gestum 6 [login]"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Success and Failure",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open Gestum Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_the_Gestum_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I try to login with \"admin\" and \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_try_to_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page with title \"gestum 6\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_see_page_with_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Success and Failure",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open Gestum Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_the_Gestum_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I try to login with \"invalid\" and \"1\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_try_to_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page with title \"gestum 6 [login]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_see_page_with_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});