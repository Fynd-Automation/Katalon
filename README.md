# Katalon
Katalon

Windows:

katalon -runMode=console -projectPath="<YOUR PROJECT>" -reportFolder="Reports" -reportFileName="report" -retry=0 -testSuitePath=<YOUR TEST SUITE PATH> -browserType="Chrome"
  
Example:
katalon -noSplash  -runMode=console -consoleLog 
-projectPath="C:\Users\Sana Mulla\Katalon Studio\test\test.prj" 
-retry=0 
-testSuitePath="Test Suites/New Test Suite" 
-executionProfile="default" 
-browserType="Chrome"

***************************************
Mac OS:

cd /Applications

./Katalon\ Studio.app/Contents/MacOS/katalon --args -runMode=console -projectPath="/Users/admin/Katalon Studio/Samples/Sample Project.prj" -reportFolder="Reports" -reportFileName="report" -retry=0 -testSuitePath="Test Suites/TS_RegressionTest" -browserType="Chrome"

****************************************

https://www.toolsqa.com/katalon-studio/integration-with-jenkins-and-other-ci-tools/
https://docs.katalon.com/katalon-studio/docs/console-mode-execution.html#katalon-studio-plugins-in-console-mode
