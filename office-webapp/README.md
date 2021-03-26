# Download Tomcat

Go to https://tomcat.apache.org/download-90.cgi
Choose a preferrable mirror to download
You'll need the core .zip file.

## How to check SHA512 checksum?
If you have Linux or WSL (Windows Subsystem for Linux) sha512sum util should be pre-installed
Download checksum file and place it in the same directory with your tomcat zip. Checksum file will have following structure:

```
0bf948b56d634125cf8e5e6cbf160974f88deb294205e064ff66b2cf6bb0208d4a5b9a1214ae909d920c8b3bd75cbcc28b93524befcc8e8d57b91be707f60874 *apache-tomcat-9.0.44.zip
```
Run the command below to verify integrity of the download

```Shell
    sha512sum -c apache-tomcat-9.0.44.zip.sha512
```

If you want to use PowerShell on Windows then your command will be little bit more sophisticated:

```PowerShell
    (Get-Content .\apache-tomcat-9.0.44.zip.sha512).Split(" ")[0].ToUpper().Equals((Get-FileHash -Path .\apache-tomcat-9.0.44.zip -Algorithm SHA512).Hash)
```

# Install Tomcat

Unzip your distribution to a convenient place on the disk (I used C:\Tools for Windows or /opt Linux). Note that after unzip your distribution should reside in its own directory (`apache-tomcat-<VERSION>` by convention)

Open terminal/command line. Now you need to set up environment variables (use your locations)

```batch
    set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_192
    set CATALINA_HOME=C:\Tools\apache-tomcat-9.0.44
```

You can save this to a .bat script

Go to bin directory and give it a try :)

```batch
    catalina.bat run
```

Use `Ctrl+C` to stop tomcat

# Deploy an app

Generate new maven module with WebApplication:

```batch
    mvn archetype:generate -DgroupId=by.educ.nikita -DartifactId=office-webapp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

It has packaging `war` by default
To deploy your application copy war archive from the `target` directory of your module to `%CATALINA_HOME%\webapps` and run tomcat. It runs with default port 8080 and your app can be found on `http://localhost:8080/<project-name>`

Good luck and have fun :slightly_smiling_face:!