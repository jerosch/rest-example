Rest-Beispiel mit resteasy
--------------------------
Das Projekt soll in einem sehr einfachen Rahmen die Verwendung von JAX-RS Annotationen zum Erzeugen von REST-basierten
Webservices aufzeigen und wie man diesen mit resteasy (http://resteasy.jboss.org) konsumieren kann.

Gebaut werden kann das Projekt ganz normal mit Maven. Das Konsumieren des Services ist im client-Modul als
Integration-Test implementiert. Zum Ausführen des Tests muss ein Application-Server auf `localhost:8080` laufen in dem
die rest-example-webapp deployed ist und das Profile `integration-test` aktiviert werden:

    > mvn clean install -Pintegration-test

