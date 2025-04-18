# INSY5 - Mitarbeitsübung 3. Trimester

**Thema:** MySQL Server Konfiguration  

**Team:** Erlisa Elbasani & Olger Peraj

##  Aufgabenteilung
MySQL-Server aufsetzen-Olger&Erlisa
Mit einem Cloud-Server (Ubuntu Linux) über SSH verbinden-Olger&Erlisa

MySQL installieren und aufsetzen-Olger

MySQL konfigurieren-Erlisa

MySQL muss von außen erreichbar sein-Erlisa

Verbindung mit DataGrip (Eine Tabelle books erstellen und 3 Datensätze anlegene)-Olger

Bonus: * Verbindung mit Java (Books zeigen)-Olger


##  Dokumentation aller Schritte

| Datum      | Uhrzeit von - bis | Dauer (Min) | Name            | Arbeitsschritte & Beschreibung                |
|------------|-------------------|-------------|-----------------|-----------------------------------------------|
| 01-04-2025 | 13.45 - 15.25     | 90          | Erlisa Elbasani | Recherche der Konfigurationen                 |
| 07-04-2025 | 9.35 - 11.10      | 90          | Erlisa Elbasani | Server Konfiguartion                          |
| 08-04-2025 | 13.45 - 15.25     | 90          | Erlisa Elbasani | Problembehebung und neue Server Konfiguration  (Benutzer, Firewall, bind-address etc.)|
| 14-04-2025 | 9.35 - 10.20      | 45          | Erlisa Elbasani | ReadMe.md file                                |


| Datum      | Uhrzeit von - bis | Dauer (Min) | Name         | Arbeitsschritte & Beschreibung                    |
|------------|-------------------|-------------|--------------|---------------------------------------------------|
| 01-04-2025 | 13.45 - 15.25     | 90          | Olger Peraj  | MySQL Installation und erste Tests                |
| 07-04-2025 | 9.35 - 11.10      | 90          | Olger Peraj  | Erstellung von Tabelle ‘books’ in DataGrip        |
| 08-04-2025 | 13.45 - 15.25     | 90          | Olger Peraj  | Tests mit DataGrip und Java-Verbindung/testen     |
| 14-04-2025 | 9.35 - 10.20      | 45          | Olger Peraj  | ReadMe.md file                                    |

---

## ⚙️ Konfigurationsschritte


sudo apt install mysql-server
sudo systemctl status mysql
sudo systemctl start MySQL


ssh root@167.99.141.104


sudo apt update && sudo apt upgrade -y
➡ Aktualisiert die Paketliste und installiert verfügbare Updates automatisch.


CREATE USER 'erlisa'@'%' IDENTIFIED BY 'pass';
GRANT ALL PRIVILEGES ON *.* TO 'erlisa'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;


CREATE USER 'olger'@'%' IDENTIFIED BY 'pass!';
GRANT ALL PRIVILEGES ON *.* TO 'olger'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;


sudo ufw allow 3306
➡ Öffnet Port 3306in der Firewall für eingehende Verbindungen.

sudo nano /etc/mysql/mysql.conf.
-> Das ist die Konfigurationsdatei, in der du Einstellungen für den MySQL-Server ändern kannst.

bind-address = 0.0.0.0
bind-address bestimmt, an welche IP-Adresse(n) der MySQL-Server gebunden ist – also auf welchen Netzwerkschnittstellen er Verbindungen annimmt.
Erlaube Verbindungen von jeder IP-Adresse

sudo systemctl restart MySQL
