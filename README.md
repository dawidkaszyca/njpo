
# Nowoczesne języki programowania obiektowego

# Composite
Z punktu widzenia systemu plików systemu operacyjnego, zapis dotyczący samego pliku jak i folderu (katalogu) jest dość podobny. Plik oraz katalog mają swoją nazwę, przy listowaniu zawartości dysku takie nazwy są wypisywane, niezależnie od tego, czy mamy doczynienia z plikiem czy folderem, przy czym nazwy folderów są w pewien sposób wyróżniane (proszę sprawdzić zlecenia listowania zawartości dysku/folderów w swoim ulubionym systemie operacyjnym). Foldery mogą zawierać w sobie pliki i/lub podfoldery. W analogiczny sposób można potraktować dysk, który ma swój literowy identyfikator oraz nazwę. Proszę zidentyfikować prosty wzorzec projektowy pozwalający na opisanie powyższych zależności oraz, z wykorzystaniem tego wzorca, napisać program pozwalający na:
Założenie hipotetycznego systemu plików, struktura może być zdefiniowana sztywno w programie (zapisana w kodzie). Proszę programowo zbudować przykładową strukturę.
Symulowanie „linii poleceń” — program ma pozwalać użytkownikowi na sprowadzanie poleceń typu dir, cd .., cd <nazwa podkatalogu>. A zatem użytkownik może poruszać się po zdefiniowanej strukturze dysku, mając możliwość przeglądania zawartości odwiedzanych katalogów. Zakładamy, że na starcie katalogiem domyślnym jest główny katalog symulowanego systemu plików.

# Decorator
W języku HTML każdy fragment tekstu może być na różne sposoby „otagowany”, 
czyli otoczony odpowiednimi znacznikami. Załóżmy, że mamy klasę PlainText przechowującą fragment tekstu. 
Klasa ta posiada funkcję składową void write(), która wypisuje do strumienia wyjściowego programu tekst 
zapisany w obiekcie tej klasy. Obiekt klasy PlainText może być „otagowany” znacznikami <p.>, <strong.>, <em.>, <mark.>. 
Każdy dozwolony w HTML układ „otagowania” tekstu tymi znacznikami jest możliwy.
„Otagowany” tekst ma być wyprowadzany do strumienia wyjściowego funkcją składową posiada funkcję składową void write(). 
Proszę zidentyfikować prosty wzorzec projektowy pozwalający na wyprowadzenie do strumienia wyjściowego „otagowanego” 
w dowolny sposób tekstu obiektu klasy PlainText. Bazując na zidentyfikowanym wzorcu proszę napisać program (może być konsola),
który:
* Pozwoli użytkownikowi na wprowadzenie jednolinijkowego tekstu.
* Pozwoli na wybranie jakimi znacznikami ma być „otagowany” wprowadzony tekst (znaczniki wskazane wyżej), 
dozwolona jest dowolna kombinacja znaczników.
* Wyprowadzi do strumienia wyjściowego odpowiednio „otagowany” tekst HTML.

# Factory&Decorator
Jak opisano w zadaniu poprzednim, w języku HTML każdy fragment tekstu może być na różne sposoby „otagowany”. 
Proszę napisać prosty program (może być konsola), który:
Pozwoli użytkownikowi na wprowadzenie jednolinijkowego tekstu.
Wyświetli proste menu zawierające wybrane znaczniki HTML (np. strong, p, em, mark), 
menu ma pozwolić użytkownikowi na jednokrotny wybór znacznika jakim ma być otoczony wcześniej wprowadzony tekst.
Wyprowadzi do strumienia wyjściowego tekst otoczony wybranym w menu znacznikiem.
Program ma zostać zaimplementowany z wykorzystaniem wzorca Prosta Fabryka lub Metod Fabrykująca.


# Observer
Załóżmy, że istnieje klasa CzujnikTemperatury, posiadająca prywatne pole temperatura, przechowujące zarejestrowaną wartość temperatury zapisaną w stopniach Celsiusza. Załóżmy również, że klasa posiada metodę ustaw(nowaWartość) pozwalającą na zmianę wartości temperatury. Wartość temperatury pokazują trzy programowe wyświetlacze, reagując na każdą zmianę temperatury spowodowaną wywołaniem metody ustaw obiektu klasy CzujnikTemperatury. Każdy z wyświetlaczy pokazuje temperaturę w innej skali temperatur: Celsiusza, Kelvina i Fahrenheit’a. Proszę zidentyfikować jaki wzorzec projektowy dobrze opisuje przedstawioną sytuację oraz napisać prosty program demonstracyjny implementujący zidentyfikowany wzorzec.

# Author: Dawid Kaszyca
