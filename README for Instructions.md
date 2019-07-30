# cafeTownsend

This project encompasses the test automation framework for the Cafe Townsend app. The app is based on Angular and Rails, while the framework uses Java, Selenium and Cucumber to automate functional tests.

Follow these next steps to import the project:
  1. Go to the repository on Github (you probably found it already, but here's the URL: https://github.com/tnged/cafeTownsend)
  2. Download the project to your computer
  3. Open your IDE
  4. From the IDE, open or import the project folder 

You can run the tests in two ways. First, you can use your IDE to run one or multiple scenarios. For example in IntelliJ 
  1. Go to feature file (/src/test/resource/test.feature)
  2. Right click on the feature or scenario, and select Run 'Feature:login'
  3. Watch the tests execute
  
Alternatively, if you have Maven installed, you can also run the tests from the command line. To do this:
  1. Go to the folder containing the project in Explorer
  2. Hold shift + right click on the project folder (cafeTownsend)
  3. Select 'Open command window here' (or 'Open Powershell window here')
  4. Write 'mvn clean test' (without the quotation marks) and hit enter
