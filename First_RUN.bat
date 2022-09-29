:: admin privilege idea -> https://superuser.com/a/391779

echo %path% >> path.bkp.txt
echo %path% >> "%USERPROFILE%\path.bkp.txt"

set path=%path%%cd%\MinGW\bin;
reg.exe ADD "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment" /v Path /t REG_EXPAND_SZ /d "%path%" /f

:: move "Sublime Text 3.lnk" "%USERPROFILE%\Desktop"

pause