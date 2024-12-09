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

### Erläuterungen zur Bewertung

HW04: Siehe Bemerkungen im Ordner *Correction Files*.

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
