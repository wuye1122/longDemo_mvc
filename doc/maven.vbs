Set shell = CreateObject("Shell.Application")
Set selFolder = shell.BrowseForFolder(0, "Please choose the path of : MAVEN_HOME", 0, ssfDRIVES)
Set selFolderItem = selFolder.Self
selPath = selFolderItem.Path
msgbox "maven "+selPath+" confirm?"
dim wsh 
Set wsh = WScript.CreateObject("WScript.Shell")
dosome1="cmd /c "
dosome2="@echo off&"
dosome3="setx MAVEN_HOME "+ Chr(34) +selPath+ Chr(34)+" /M&"
dosome4="setx path "+Chr(34)+"%path%;%MAVEN_HOME%\bin;"+Chr(34)+" /M&"
dosome5="echo please input cmd and use mvn -version to check&"
dosome6="pause&"
begindo =  dosome1+dosome2+dosome3+dosome4+dosome5+dosome6
wsh.run begindo