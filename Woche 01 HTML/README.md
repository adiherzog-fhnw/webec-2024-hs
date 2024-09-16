# Woche 1: Einführung & HTML


## Vorlesungsfolien

* [Einführung](01a%20Einführung.pdf)
* [History and rendering approaches](01b%20History%20and%20Rendering%20Approaches.pdf)
* [HTML](01c%20HTML.pdf)


## IDE, JDK, Git

Als IDE wird [IntelliJ Ultimate Edition](https://www.jetbrains.com/idea/download/) empfohlen, welche für Web-Technologien (HTML, CSS, JS), für Java und für weitere Technologien wie Spring, Datenbanken, etc. hervorragende Unterstützung bietet. Studierende können eine kostenlose Lizenz über das [JetBrains Studentenprogramm](https://www.jetbrains.com/community/education/#students) erhalten.

Als Programmiersprache für das Backend wird Java verwendet. Installieren Sie also das aktuellste JDK.

Ausserdem sollten Sie eine aktuelle Version von Git installiert haben.


## Übungen

### 1. Brief strukturieren

*Diese Übung wurde von [Mozilla](https://developer.mozilla.org/en-US/docs/Learn/HTML/Introduction_to_HTML/Marking_up_a_letter) entwickelt.*

Die notwendigen Dateien finden Sie auch [hier](exercise-letter).

1) Erstellen Sie eine HTML-Datei und fügen Sie den Text aus `letter-text.txt` ein.
2) Erstellen Sie das HTML Grundgerüst und binden Sie das CSS Stylesheet `style.css` ein (Sie müssen selber für diese Übung kein CSS schreiben). Sie können die im Stylesheet definierte Klasse `sender-column` verwenden, um den Absender rechts auszurichten.
3) Strukturieren Sie den Brief mit HTML gemäss [Vorlage](exercise-letter/letter.png). 
4) Verwenden Sie auch semantische HTML Element, um Screenreader zu unterstützen (z.B. das `<time>` Element).
5) Validieren Sie Ihr HTML mit dem _Nu HTML Checker_: https://validator.w3.org/nu/.

[HTML-Referenz](https://developer.mozilla.org/en-US/docs/Web/HTML/Element)

### 2. Browser Dev Tools

1. Schauen Sie sich den HTML Sourcecode und den DOM von ausgewählten Webseiten an.
2. Schauen Sie auch, was im Netzwerk-Tab in den Dev Tools passiert wenn Sie die Seite neu laden oder auf der Seite navigieren.
3. Versuchen Sie herauszufinden, ob eine Seite Server Rendering oder Client Side Rendering verwendet, oder ob es eine Hybrid-Lösung ist.


## Übungen zur Festigung

### 3. Mini-Übungen von w3schools.com

Unter https://www.w3schools.com/html/exercise.asp finden Sie eine Reihe von kleinen Übungen, um die Grundlagen von HTML zu festigen.

### 4. HTML-Quiz

Hier können Sie ihr Wissen in einem Quiz testen: https://www.w3schools.com/html/html_quiz.asp

Gerne dürfen Sie mir ihr Resultat per E-Mail senden.

Nutzen Sie die falschen Antworten, um diese Themen nochmals zu studieren.

Bei Bedarf finden Sie viele weitere HTML-Übungen und Quizze im Internet.


## Übungsideen für Neugierige

Aber vergessen Sie Ihre anderen Vorlesungen nicht!

### 5. Eigene Website

Versuchen Sie ein HTML Dokument mit möglichst wenig Nachschauen von Grund auf zu schreiben. Als Vorlage können Sie eine beliebige Webseite nehmen (z.B. eine Wikipedia-Seite) oder Sie können selber etwas erfinden (vielleicht eine persönliche Webseite, falls Sie noch keine haben).

### 6. Screenreader

Probieren Sie das Internet über einen Screenreader "blind" zu verwenden. Probieren Sie auch aus, was für einen Einfluss semantische Elemente in der Brief-Übung auf die Screenreader-Ausgabe haben.

* _ChromeVox_ in Google Chrome
* _JAWS_ oder _NVDA_ auf Windows
* _VoiceOver_ wird mit MacOS geliefert

### 7. AI Chatbot

Zeichnen Sie ein Websiten-Layout oder ein Web-Formular auf ein Blatt Papier, machen Sie davon ein Foto und instruieren Sie den Chatbot ihres Vertrauens, daraus HTML zu erzeugen.

* Studieren Sie den erzeugten HTML-Code. Verstehen Sie alles?
* Entspricht der Code ihren Vorstellungen? Falls nicht, können Sie das Ergebnis mit einem besseren Prompt verbessern?
* Sie können auch mehrere Chatbots miteinander vergleichen. Wo bekommen Sie die beste Ausgabe?

### 8. AI IDE

* Installieren Sie die AI-basierte [Cursor](https://www.cursor.com) IDE. Erstellen Sie damit ein _Tic Tac Toe_ Spiel in _React_, wie im Tutorial-Projekt angegeben.
* Wie weit kommen Sie, ohne selber eine Zeile Code zu schreiben?
Können Sie das Spiel nach ihren Vorstellungen anpassen?
* Ich bin gespannt, von Ihren Erfahrungen zu hören, besonders wenn Sie noch keine React und wenig JavaScript Erfahrung haben.