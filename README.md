"# zadanieHibernate"
Zadanie
1. Zaprojektuj encję JPA Car modelującą samochód.
 Samochód powinien posiadać:
    a. unikalny identyfikator (int id)
    b. markę (String brand)
    c. model (String model)
    d. typ nadwozia (CarBodyType carBodyType) będący enumem (np. SEDAN, COMBI, CABRIO);
   przechowywanym w bazie jako String
    e. data produkcji (LocalDate productionDate)
    f. ilość lat (int age)
 2. Zaprojektuj encję JPA Person modelującą właściciela.
    Właściciel powinien posiadać:
     a. unikalny identyfikator (int id)
     b. imię (String name) c. nazwisko (String surname)
 3. Utwórz relacje między właścicielem a samochodem OneToMany
 4. Zaimplementuj klasę DAO umożliwiającą:
     a. tworzenie aut i właścicieli
     b. odczytywanie auta/właściciela po id
     c. zmianę danych d. usuwanie danych
     e. odczytywanie wszystkich danych – z uwzględnieniem sortowań
     f. odczytywanie aut wg. marki, typu nadwozia, daty produkcji - wyszukanie najstarszego/najmłodszego
  samochodu - wyszukanie samochodu o największym/najmniejszym przebiegu
