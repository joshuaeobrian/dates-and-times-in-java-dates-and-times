---
# This section is used to configure this assignment on Newline.
# `token` can not be changed; however, the rest can be edited
# as needed. Changes you make here will overwrite the
# existing content on Newline when you push to the master
# branch of the path's GitHub repo.

# Begin the body of the assignment below the final `---`.

token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb250ZW50X2lkIjoxMzg0MCwiY29udGVudF90eXBlIjoiQXNzaWdubWVudCJ9.MFhxp38dfS8orGlYPHWZtZ6MWeo479OV3Pkljbwz0cY

# Everything below this line can be edited.
title: >-
  [Exercise] Dates and Times
description: >-
  [Exercise] Dates and Times
---
# [Exercise] Dates and Times

In this exercise we will do the following:

* Fork a Github repository
* Clone a Git repository into your Projects folder
* Create static methods
* Make use of several classes and enums in the `java.time` package.
    * java.time.Month
    * java.time.MonthDay
    * java.time.LocalDate
    * java.time.format.DateTimeFormatter
    * java.time.temporal.ChronoUnit.DAYS
* Run tests

## Instructions

1. Go to Github and create a fork of [this repository](https://github.com/tiy-raleigh-java/dates-and-times-in-java-dates-and-times). This will create a copy of this repository in your Github account named `dates-and-times-in-java-dates-and-times`.

2. Open a new Terminal session.

3. Change into your Projects directory using the `cd` command:

	`cd ~/Projects`

4. Clone your forked repository using the `git clone` command:

	`git clone git@github.com:<your github username>/dates-and-times-in-java-dates-and-times.git`

	**Warning:** Be sure to replace `<your github username>` in the command above with your actual Github username.

	This should create a new directory at `~/Projects/dates-and-times-in-java-dates-and-times`.

5. Open this project in IntelliJ

6. Find the `SignificantDate` class, open it, and follow the instructions in the comments therein.

7. Find the `Main` class, open it, and follow the instructions in the comments therein.

8. When you're ready to run this code, select "Run all tests (All in dates-and-times-in-java-dates-and-times)" in the drop down menu at the top of the screen and click the green Run button to the right.

9. When the tests pass, then you're done!

10. Commit your code and push it to Github.

11. Finally, submit the link to your repository using the 'Submit Assignment' form below.
