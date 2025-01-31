# softwaretechnik

Name: Marc Rennefort Matrikelnummer: 7421290
Name: Daniel Schnicke Vaz Matrikelnummer: 7424816
Name: Yves-Pierre Weselek Matrikelnummer: 7418442

# Grading

| Sheet       | Ex. 1    | Ex. 2    | Ex. 3    | Ex. 4    | Ex. 5    | Sum      |
| ----------- | -------- | -------- | -------- | -------- | -------- | -------- |
| Homework 01 | 4/4      | 6/6      | 3.75/5   | 4.25/5   | -        | 18/20    |
| Homework 02 | 4.25/4.5 | 4/4.5    | 5/6      | 5/5      | -        | 18.25/20 |
| Homework 03 | 7.5/8    | 5/5.5    | 6.25/6.5 | -        | -        | 18.75/20 |
| Homework 04 | 4.5/5    | 5/5      | 4.5/7    | 2.5/3    | -        | 16.5/20  |
| Homework 05 | 5/5      | 6.5/7    | 7/8      | -        | -        | 18.5/20  |
| Homework 06 | 7.5/8    | 7/8      | 4/4      | -        | -        | 18.5/20  |
| Homework 07 | 4/4      | 4/4      | 7/8      | 4/4      | -        | 19/20    |
| Homework 08 | -        | -        | -        | -        | -        | Skipped  |
| Homework 09 | 4/4      | 8/8      | 3/8      | -        | -        | 15/20    |
| Homework 10 | 3/3      | 4.5/5    | 12/12    | -        | -        | 19.5/20  |

### Erläuterungen zur Bewertung

HW10:
- Ex. 2: Vermutlicher kleiner Verständnisfehler: Die 4 unbearbeiteten Issues sollten in dem Sprint auch nicht bearbeitet werden, sonst wären sie im Sprint Backlog und nicht im Product Backlog gewesen \[-0.5p\].


HW09:
- Ex. 3: Aus welchem Reporitory stammt der Screenshot? In eurem Repository ist nämlich keine CI/CD pipeline in GitHub Actions angelegt. +2p für die main.yml Datei und weitere +1p für die darin stehende Verwendung von JaCoCo. 

HW07:
- Ex. 3: Die @Autowired-Annotation sollte besser an einem Konstruktor und nicht direkt am StudentRepository-Attribut stehen \[-1p\].

HW06:
- Ex. 1: Auch die weiteren Tests hätten mit @ParameterizedTest zusammengefasst werden können, indem man das erwartete Ergebnis ebenfalls als Eingabeparameter an die Testmethode übergibt \[-0.5p\].
- Ex. 2 a): Fehlende Mocks für die Liste courses und die Methode stream(), die in generateStudentDistribution() aufgerufen wird \[-1p\]. Das tatsächliche Course-Objekt in Zeile 43 sollte hier nicht mehr auftauchen.

HW04, HW05: Siehe Bemerkungen im Ordner *Correction Files*.

HW03:
- Ex. 1 a): Siehe Bemerkungen im Ordner *Correction Files*.
- Ex. 1 b): Doppelte Methode getLID() in Lecture-Klasse.
- Ex. 2: Das zweite T in der folgenden Methodensignatur fehlt: public T getEntityByCriterion(Predicate<T> criterion) \[-0.25p\]. Achtung: Das Kriterium, nach dem die Liste entities durchsucht werden soll, muss nicht eindeutig sein. In dem Fall gibt getEntityByCriterion() aktuell aber nur das erste gefundene Objekt zurück \[-0.25p\].
- Ex. 3: Aussagekräftigere Titel als test1, test2 usw. wählen. Zunächst muss ein Objekt von ExerciseGroupManager erstellt werden (am besten in einer mit @BeforeEach annotierten Methode) \[-0.25p\]. Das erwartete Ergebnis von test5 ist anders als die Methode checkGroupCapacities() gedacht war, passt aber zu eurer Implementation. 

HW02:
- Ex. 1: Der Adjustment-Branch führt eigentlich in eine Schleife, die wieder vor den (ersten und dann einzigen) Fork zurückführt.
- Ex. 2: Benutzt "Enrolled" als Composite State, in dem dann "Not Assigned", "Assigned" und "In Conflict" Substates sind.
- Ex. 3: Gebt den Interfaces Namen und schreibt an die Delegates "delegate" dran. Fügt noch dieses Components-Symbol (siehe VL) in euren Rechtecken hinzu, um diese nach UML Standard als Components kenntlich zu machen.

HW01:
- Ex. 3: Die Functional Requirements 3 und 5 könnten ebenfalls noch präzisiert werden, um dann auch leichter überprüfbar zu sein: Gruppenerstellung (per Formular?) mit welchen konkreten Rahmenbedingungen? Wie soll die Benachrichtung erfolgen? Die Quality Requirements 1 und 2 könnten ebenfalls noch präzisiert werden: "mehrere tausend Benutzer" ist recht unkonkret und die Benutzerfreundlichkeit kann durch Ansätze wie "in maximal X Schritten sollten Kernaufgaben erledigt werden können" verbessert werden. Welche Funktionalität soll in der Testversion bereits möglich sein und wie sollen die Studierenden miteinbezogen werden? (Precision)
- Ex. 4: Die Aufforderung, den Konflikt mit dem Kurskoordinator zu klären, aus Szenario 2 fehlt. Schritt 6 und die Postcondition doppeln sich in Bezug auf die E-Mail. Eigene Annahmen sollten als solche markiert werden.
