Framework Format

Create Java packages: 

**PAGES (POM)**
1. LoginPages and LogoutPages(java class) are where we create and store some reusable methods and annotations , objects and variables if needed.  
2. When we want to add any logic to LoginPages and LogoutPages, we need to make sure it is applicable to all of tests. 
3. What is Page Object Design pattern (POM) ?
4. Creating java class for each page of the web application.
5. All of related web elements to current page will be stored to its own .java class

**runners** 
1. CukesRunner(java class)

**step_definitions**
1. This step definitions is one of the class which can apply scenario snippets and implements the codes. 
2. Has also hooks class which can do screenshot of the failed test

****utilities**** 
1. BrowserUtils class has a method which you can wait during the automation.
2. ConfigurationReader(java class) ( to create a utility method and be able to read from configuration.properties file by just calling our configurationReader.getProperty("key"); method.
3. Driver class has a method that can manage your driver.

**resources**
1. Resources directory with same level with java directory (this directory is where we put our features -scenarios for the project in Gherkin language)


**configuration.properties** 
1. To avoid hard coding some of the important test data in our project.
2. Centralised location.We can easily do cross browser testing which means we can run the same test against different browsers just by changing the value of "browser" key from "chrome" to "firefox" and our test will be running in different browser.
3. We can easily do DATA DRIVEN TESTING (running the same set of tests against different set of data. since we are entering our test data from configuration.properties, we can change the value from there and we will be able to run same tests against different test data)
