package com.alia.database;

public class StartBase {
    ManageWords manageWords;
    String[] base;

    public StartBase(ManageWords manageWords) {
        this.manageWords = manageWords;
    }

    public void fill() {
        base = new String[]{
                "abonament", "absorbować", "abstrakcja", "absurd", "adept", "adopcja", "adoracja", "adresat", "adwokat",
                "afera", "agencja", "agonia", "agresja", "agresywny", "akademia", "akcent", "akceptacja", "aksamit", "aktor",
                "aktualny", "aktywny", "akwarium", "alarm", "alarmować", "album", "alejka", "alergia", "alibi", "alkohol",
                "aloes", "amatorski", "ambicja", "ameba", "amok", "analizować", "ananas", "anarchia", "anioł", "animacja",
                "ankieta", "anomalia", "anonimowy", "antyk", "antykwariat", "aparat", "aplikacja", "apokalipsa", "apteka",
                "arbuz", "arena", "areszt", "argument", "aromat", "artykuł", "arystokrata", "aseksualny", "asteroida", "astma",
                "asystent", "atak", "atrament", "autobus", "automat", "autor", "awantura", "awaria", "babcia", "badać", "bagaż",
                "bakteria", "bal", "balerina", "balet", "balkon", "balsam", "bambus", "banał", "bandażować", "bandyta", "bank",
                "baran", "barwnik", "basen", "bawić", "baza", "bazylia", "bestia", "bezbarwny", "bezbronny", "bezczelny",
                "bezdomny", "bezsilny", "beztroska", "biały", "bić", "bieda", "biegać", "bierny", "bilans", "bilet", "biskup",
                "bitwa", "biurko", "biżuteria", "błąd", "blady", "błagać", "błoto", "błysk", "błyskawica", "bohater", "bójka",
                "bok", "bomba", "bóg", "brama", "bransoletka", "brednia", "broda", "broń", "bronić", "brudny", "bryła",
                "brzeg", "brzoza", "brzuch", "budzić", "bukiet", "bunt", "butelka", "bzdura", "całkowity", "całodniowy",
                "całość", "całować", "cegła", "cel", "celny", "cena", "cenny", "centaur", "ceremonia", "chaos", "charytatywny",
                "chciwy", "chemikalia", "chętny", "chłód", "chłopak", "chmura", "chochlik", "chomik", "chory", "chrapać",
                "chronić", "chrypa", "chustka", "chwast", "ciąć", "ciągły", "ciasny", "ciasto", "cicho", "ciekły", "ciemność",
                "cień", "cienki", "ciepło", "cierń", "cierpieć", "cierpliwość", "ciężki", "cisza", "ćma", "cmentarz", "cnota",
                "cofać", "córka", "cud", "cukierek", "cyfra", "cykl", "cynamon", "cyrk", "cytat", "cytryna", "czarny", "czarownik",
                "czas", "czcić", "czekać", "czerwony", "część", "częsty", "człowiek", "czterdzieści", "cztery", "czujny", "czwartek",
                "czyścić", "czytać", "dąb", "dach", "daleki", "dama", "dar", "darmowy", "data", "dawać", "dawka", "dawny", "dbać",
                "debil", "debiut", "decyzja", "deficyt", "degradacja", "dekada", "dekoder", "dekolt", "dekoracja", "delfin",
                "delegować", "delikatny", "demaskować", "demo", "demolować", "demon", "depresja", "deseń", "desperacja",
                "destrukcja", "deszcz", "detal", "detektor", "detonacja", "dewastować", "dezaktywacja", "dezynfekcja", "diabeł",
                "diadem", "diagnoza", "diament", "dieta", "diler", "dinozaur", "dioda", "dławić", "dłoń", "dług", "długi", "długopis",
                "dmuchać", "dno", "dobijać", "dobrobyt", "dochód", "doczepić", "dodać", "doić", "dojazd", "dojrzały", "dokładka",
                "dokończyć", "doktor", "dokument", "dół", "dolina", "dom", "domino", "domofon", "domyślny", "doniczka", "dopływ",
                "doradzać", "dostarczać", "dostęp", "doświadczenie", "doszczętnie", "dotyk", "dowcip", "dowód", "dożylny",
                "drabina", "dramat", "drapieżca", "dręczyć", "dres", "drgać", "driada", "droga", "drukarka", "drwal", "dryfować",
                "drzemka", "dubler", "duch", "duet", "duma", "dusić", "dusza", "dwadzieścia", "dwa", "dworski", "dygać", "dykcja",
                "dyktafon", "dylemat", "dym", "dynastia", "dynia", "dyrekcja", "dysk", "dyskoteka", "dyskretny", "dyskusja",
                "dywan", "dyżur", "dzbanek", "dżem", "dziadek", "dział", "dziecko", "dziękować", "dzielić", "dziennik",
                "dziewczęcy", "dziewica", "dziób", "dziura", "dziwak", "dziwka", "dżuma", "dżungla", "dźwig", "dzwonić",
                "echo", "edycja", "efekt", "ego", "egoista", "egzamin", "egzekucja", "egzorcyzm", "ekipa", "ekierka", "ekran",
                "ekspert", "eksperyment", "eksponat", "ekspresjonizm", "ekstaza", "ekstremalny", "ekwipunek", "elastyczny",
                "elegancki", "elektroda", "element", "elf", "elita", "emeryt", "emigrować", "emocja", "emulsja", "energia",
                "entuzjasta", "epicki", "epizod", "era", "esej", "eskorta", "etap", "etykieta", "euforia", "eutanazja",
                "ewangelia", "ewakuacja", "ewolucja", "fabryka", "fabuła", "facet", "fajerwerk", "fakt", "fala", "falbana",
                "fałsz", "fan", "fanatyk", "fantazjować", "farba", "farma", "fatum", "fatalny", "faza", "feminizm", "feniks",
                "fenomen", "festiwal", "figura", "fikcja", "filar", "film", "filtr", "finał", "finansować", "fiołek", "fiolet",
                "firana", "fizyczny", "flaming", "flirt", "fobia", "foka", "folia", "forma", "format", "formuła", "fortuna",
                "fotel", "fragment", "fruwać", "fryzura", "fundament", "funkcja", "furia", "futro", "gabinet", "gąbka", "gałąź",
                "gang", "garaż", "gardło", "garnek", "gatunek", "gejsza", "gen", "genialny", "gęsty", "giełda", "gigant", "gips",
                "gitara", "gładki", "głaz", "globalny", "głód", "głodzić", "głos", "głośnik", "głosować", "główny", "głuchy",
                "glut", "godło", "godzina", "gołąb", "golf", "góra", "gorączka", "góral", "gorzki", "gość", "gotować", "grabić",
                "grać", "gracz", "grafik", "gramofon", "granat", "granica", "gratis", "grób", "gromada", "grosz", "groźba",
                "gruby", "grupa", "grymas", "gryźć", "grzech", "grzejnik", "grzmieć", "grzyb", "guma", "gust", "guz.guzik",
                "gwałt", "gwarantować", "gwizdać", "haczyk", "haft", "hałas", "halucynować", "hamak", "hamulec", "harfa",
                "harmonia", "harpia", "hasło", "hazard", "helikopter", "herbata", "heros", "hiena", "hipnoza", "honor", "horoskop",
                "horror", "hotel", "humor", "hybryda", "hymn", "idea", "ideał", "idiota", "idol", "igła", "ignorować", "ilość",
                "iluzja", "impreza", "impuls", "incydent", "indywidualny", "infekcja", "informacja", "informator", "inicjał",
                "inspekcja", "instalacja", "instrument", "instynkt", "instytucja", "inteligentny", "intencja", "interes",
                "internat", "intruz", "intuicja", "inwestować", "ironia", "irytować", "iskra", "islam", "istota", "izolatka",
                "jabłko", "jacht", "jad", "jagoda", "jajecznica", "jamnik", "jaskinia", "jaskrawy", "jaśmin", "jasny", "jeden",
                "jedenaście", "jednorożec", "jedwab", "jędza", "jemioła", "jesień", "jeż", "joga", "jubiler", "kabel", "kaktus",
                "kalendarz", "kałuża", "kamera", "kanapa", "kąpiel", "kapłan", "kara", "kariera", "karmel", "karmić", "karta",
                "karton", "karuzela", "kasa", "kask", "kaszel", "kasztan", "kąt", "katastrofa", "kawa", "kawiarnia", "kazać",
                "kielich", "kiepski", "kieszeń", "kij", "kilogram", "kino", "kłamać", "klasa", "klasyk", "klatka", "klątwa",
                "klawiatura", "klęczeć", "klepsydra", "klient", "klimat", "kłopot", "klub", "koala", "kobiecy", "koc", "kochać",
                "kod", "kokarda", "kok", "kołdra", "koliber", "koło", "kolor", "komar", "komedia", "komentarz", "komfort",
                "komiks", "komisja", "komórka", "kompas", "komplet", "kompromis", "komputer", "komunikat", "koń", "koncert",
                "koniczyna", "koniec", "konkurs", "kontakt", "konto", "kontrakt", "kontrolować", "kontuzja", "kontynent",
                "kopia", "koralik", "korona", "koronka", "korzeń", "kosa", "kość", "kosmita", "kosmyk", "kosz", "koszmar",
                "koszula", "koszyk", "kot", "krawędź", "krawat", "kreacja", "krem", "kreska", "krew", "krok", "król", "królik",
                "kropka", "krótki", "krowa", "kryształ", "krytykować", "krzesło", "krzyk", "krzyżówka", "księga", "księżyc",
                "kubek", "kupić", "kwadrans", "kwaśny", "kwestia", "kwiat", "kwiecień", "łabędź", "labirynt", "łącze", "ląd",
                "ład", "ładny", "ładować", "łagodny", "łąka", "lakier", "lalka", "łamać", "las", "laser", "łaska", "latać",
                "lato", "łatwy", "lawa", "ławka", "leczyć", "lęk", "lekarz", "lekcja", "liczba", "lilia", "linia", "lipiec",
                "liść", "list", "litania", "litość", "lód", "losować", "łóżko", "lupa", "lustro", "łza", "machać", "mądry",
                "magazyn", "magia", "maj", "malina", "mały", "malować", "mandat", "mapa", "marker", "marzyć", "materac",
                "matka", "matowy", "mebel", "męczyć", "medalion", "meduza", "medytacja", "melancholia", "melodia", "metal",
                "metamorfoza", "metoda", "metr", "mężatka", "mgła", "miasteczko", "miauczeć", "miejsce", "miękki", "miesiąc",
                "mieszać", "mięta", "miętowy", "mikrofon", "miliard", "miły", "miłość", "mina", "miniaturka", "miód", "miś",
                "misja", "mistrz", "młotek", "moc", "moda", "model", "moment", "morał", "morderca", "most", "motor", "motyw",
                "motyl", "motywować", "mówić", "mózg", "mrok", "mrówka", "mroźny", "mścić", "mur", "musical", "muzeum", "muzyk",
                "myśleć", "mysz", "nabożeństwo", "nadawca", "nadmiar", "nagrać", "nagroda", "namiot", "namierzyć", "napój",
                "naprawić", "narkotyk", "narzeczony", "nastrój", "naszyjnik", "natura", "nerwowy", "niania", "nić", "niebo",
                "nieśmiały", "niestały", "nieszczery", "niewolnik", "nimfa", "nitka", "norma", "notatka", "nów", "nuda", "numer",
                "nuta", "oaza", "obiekt", "objaw", "oblać", "obrączka", "obraza", "obrót", "obuwie", "ocalić", "ocean", "ocena",
                "ochota", "ochraniać", "oczy", "oczyszczenie", "oddział", "odfiltrować", "odgryźć", "odjąć", "odklejać", "odłam",
                "odmładzać", "odmówić", "odtrutka", "odważny", "odwrót", "ofiara", "ogień", "oglądać", "ogłosić", "ognisko",
                "ogród", "ogrodnik", "ojczym", "okazja", "okład", "okładka", "okno", "okolica", "okres", "okręt", "okruch",
                "okrutny", "okulary", "olbrzym", "opalenizna", "opatrunek", "opcja", "opera", "opętać", "opieka", "opinia",
                "opona", "oprawca", "optymista", "order", "organizować", "orientacja", "orkiestra", "oryginał", "osądzać",
                "osiedle", "osiem", "osiemdziesiąt", "oślepić", "osłona", "ośmielać", "osoba", "ostateczność", "oswajać",
                "oświadczyny", "oszacować", "oszaleć", "oszczędzać", "oszust", "otchłań", "otępienie", "otruć", "owca", "owoc",
                "owocowy", "ożywać", "pachnieć", "pakt", "pamięć", "pamiętnik", "panika", "panna", "papier", "paranoja", "parapet",
                "park", "parodia", "parter", "pasek", "pasja", "paskudny", "pasożyt", "patrol", "patrzeć", "patyk", "pauza", "pazur",
                "pech", "pedał", "pejzaż", "pękać", "pełnia", "pensja", "perfekcyjnie", "perła", "peruka", "petycja", "piana",
                "piasek", "piątek", "piec", "piękny", "pionek", "piórko", "piorun", "piosenka", "pirat", "piruet", "pisać", "pisak",
                "pistolet", "plac", "płakać", "plan", "płaski", "plastik", "plaża", "plecak", "płomień", "pochmurny", "pochwalić",
                "pociąg", "początek", "podatek", "podkowa", "podłoga", "podlizywać", "podmuch", "podobny", "podpis", "podręcznik",
                "podsłuchać", "podstawa", "podstęp", "poduszka", "podwójny", "podwyżka", "podzielić", "pogoda", "pogrążyć",
                "pogrzeb", "pojawić", "pojedynek", "pokaz", "pokój", "pokrzywa", "pół", "polecać", "polewa", "policjant", "polityk",
                "półka", "półkula", "północ", "połowa", "południe", "pomadka", "pomarańcz", "pomnik", "pomoc", "pomyłka", "poniedziałek",
                "popiół", "poplątane", "poprawiać", "poradnia", "porazić", "porcja", "portal", "portret", "porwać", "porzucić",
                "posąg", "pośpieszać", "poświata", "potajemny", "potencjał", "potężny", "potulny", "potwór", "potykać", "poważny",
                "powiadomienie", "powiększać", "powietrze", "powiew", "powód", "powoli", "powtarzać", "powtórka", "poza", "pożar",
                "pozbyć", "poziom", "poznawać", "późny", "pożreć", "pozycja", "pożyczać", "praca", "pracować", "prąd", "pralka",
                "prawda", "premia", "presja", "prezent", "prezentować", "próba", "problem", "procent", "proces", "profesjonalny",
                "projekt", "promieniować", "promocja", "prośba", "prosić", "prosty", "prostować", "protestować", "przebłysk",
                "przebój", "przebrać", "przeciwieństwo", "przeciwstawić", "przedmiot", "przegrać", "przejażdżka", "przelew",
                "przepis", "przepowiednia", "przerwa", "przesadzać", "przesiadka", "przestać", "przeszkoda", "przeszłość",
                "przeszukać", "przewaga", "przeznaczenie", "przezroczysty", "przeżyć", "przycisk", "przyczepa", "przyczyna",
                "przydatny", "przydział", "przyjaciel", "przyjąć", "przyjść", "przyklejać", "przymus", "przynęta", "przypadek",
                "przyprawa", "przysługa", "przyszłość", "przyszły", "przytulać", "przywiązać", "przywódca", "deska", "determinacja",
                "delegacja", "dedykacja", "doniczka", "dominacja", "dochodzenie", "dorabiać", "dokarmiać", "długoterminowy",
                "dysk", "dyrektor", "dyplom", "dyskrecja", "ekranizacja", "epoka", "egzotyczny", "egzamin", "epidemia",
                "epicentrum", "elektryczność", "ekologiczny", "esencja", "forma", "firma", "firana", "framuga", "farma",
                "fascynacja", "fikcja", "film", "grymas", "gruszka", "generator", "godło", "gorset", "gra", "gepard", "geografia",
                "garnitur", "gość", "garnek", "historia", "choroba", "hańba", "hala", "hak", "harfa", "hotel", "hostessa",
                "chodnik", "chata", "chomik", "pseudonim", "psychiatra", "ptak", "puchar", "pudel", "pudełko", "pukać", "pułapka",
                "puls", "punkt", "pusty", "pustynia", "puszka", "pytać", "rachunek", "radio", "radość", "raj", "rakieta", "rano",
                "ratować", "rdza", "razem", "reakcja", "recenzja", "ręcznik", "recytować", "ręcznik", "redukcja", "refleks", "regał",
                "regulamin", "rejestrować", "ręka", "rękawiczka", "reklama", "rekord", "relacja", "relaks", "religia", "remis",
                "reszta", "rodzeństwo", "rodzina", "rogalik", "rola", "romans", "roślina", "rower", "róża", "rozdawać", "rozkaz",
                "rozkład", "rozlać", "rozmawiać", "rozmowa", "rozmyślać", "różnica", "rozrywka", "rozsądek", "rozum", "ruch",
                "rutyna", "ryba", "rycerz", "rynek", "rysa", "rysować", "rytm", "rytuał", "ryzyko", "rzucać", "sala", "samiec",
                "samochód", "samodzielny", "samolot", "sarkazm", "sąsiad", "satelita", "scena", "schody", "schronienie", "schudnąć",
                "ściana", "ścieżka", "sędzia", "sejf", "sekret", "sekunda", "sen", "sens", "sentyment", "serce", "serdeczny",
                "serial", "sesja", "sezon", "siać", "sieć", "siedem", "siła", "siodło", "siostra", "sito", "siwy", "skakać",
                "skakanka", "skala", "skała", "skamielina", "skandal", "skaner", "skarb", "skarpeta", "skaza", "skład", "skleić",
                "sklep", "skok", "skomleć", "skończyć", "skóra", "skręcać", "skromny", "skrót", "skrzydło", "skrzynia", "skrzypce",
                "skupiać", "słaby", "ślad", "sława", "śledzić", "ślepy", "śliczny", "ślimak", "słodki", "słoik", "słoń", "słońce",
                "słownik", "ślub", "słuchać", "służący", "słyszeć", "smak", "śmiech", "śmierć", "śmiertelnik", "smok", "smuga",
                "smutek", "śnieg", "spać", "spacer", "spadać", "specjalny", "śpiączka", "śpiewać", "spis", "spódniczka", "spokój",
                "sposób", "spotykać", "spowiedź", "spowolnić", "sprawdzać", "sprzątać", "sprzeciw", "sprzedać", "srebrny", "średni",
                "środa", "środkowy", "śruba", "stacja", "standardowy", "starość", "stary", "statek", "staw", "sto", "stokrotka",
                "stół", "stopień", "stopa", "stos", "stosować", "strach", "straszny", "strata", "strategia", "strefa", "strażnik",
                "stres", "stresować.strój", "strona", "strona", "stróż", "struktura", "strumień", "strych", "strzała", "student",
                "studia", "studio", "studnia", "stukać", "stwór", "stwórca", "stworzyć", "styczeń", "styl", "stylowy", "stypendium",
                "subskrypcja", "subtelny", "suchy", "sufit", "sugestia", "sukces", "suknia", "suma", "susza", "świadek", "światło",
                "świątynia", "świeca", "święta", "świeży", "świr", "sygnał", "sylaba", "symbol", "syn", "syrena", "system", "szablon",
                "szacować", "szafka", "szal", "szampan", "szansa", "szary", "szarpać", "szatan", "szczegół", "szczelina", "szczepionka",
                "szczęśliwy", "szczotka", "szczur", "szczyt", "szeptać", "sześcian", "szkarłatny", "szkic", "szkielet", "szkło", "szkoda",
                "szkoła", "szlaban", "szminka", "sznur", "szok", "szorstki", "szpieg", "sztuka", "sztylet", "szuflada", "szukać", "szum",
                "szyba", "szyć", "szyszka", "tabela", "tablica", "tajemnica", "tajny", "takt", "talia", "talerz", "tancerz", "tani",
                "tapeta", "targ", "taśma", "tatuaż", "teatr", "tęcza", "tekst", "telepatia", "telewizja", "temat", "temperatura",
                "teraz", "testament", "tłumacz", "tortura", "towar", "tradycja", "tragedia", "trasa", "trening", "treść", "troskliwy",
                "trucizna", "tryb", "tunel", "turysta", "twardy", "tyran", "typ", "tyran", "tytuł", "ubierać", "ubogi", "uchwyt",
                "uciążliwy", "uciekać", "ucisk", "ucinać", "uczciwy", "uczta", "uderzyć", "udział", "ujarzmić", "ukarać", "układ",
                "ukłon", "ukryć", "uleczalny", "ulepszyć", "ulewa", "ulica", "ulotka", "umiar", "umierać", "umowa", "umysł", "unikać",
                "uniwersalny", "upadek", "upał", "upiorny", "upodobnić", "uraz", "urlop", "uroda", "urok", "urząd", "usługa", "uśmiech",
                "uśpić", "usprawiedliwiać", "usuwać", "uszczerbek", "utwór", "uwaga", "uwięzić", "uwolnić", "uzależnienie", "uzdrawiać",
                "używać", "wąchać", "wada", "wadliwy", "walentynki", "walizka", "wampir", "wanilia", "wanna", "warcaby", "wariat",
                "warkocz", "warstwa", "wartość", "warunek", "wątpić", "wers", "wersja", "wesele", "westchnienie", "wiadro", "wianek",
                "wiara", "wiatr", "widelec", "wideo", "widmo", "widok", "widzenie", "wieczór", "wiedza", "wiedźma", "wiek", "wielokrotny",
                "wiercić", "wierny", "wierzba", "wieś", "wieszać", "więź", "więzień", "wieżowiec", "winda", "wino", "wiosna", "wirus",
                "wiśnia", "witamina", "wizja", "włączać", "władca", "właściciel", "włos", "wniosek", "woda", "wodospad", "wojna",
                "wojsko", "wrażliwy", "wróg", "wróżba", "wschód", "wstęp", "wstyd", "wulkan", "wybić", "wybieg", "wybuch", "wychowanek",
                "wychować", "wycieczka", "wyczyn", "wydech", "wydłużać", "wyglądać", "wygnać", "wygrana", "wyjątek", "wyjazd", "wyjść",
                "wykład", "wykopać", "wykres", "wykryć", "wylać", "wyłączyć", "wylizać", "wymagać", "wymiar", "wymyślać", "wynająć",
                "wynalazca", "wynik", "wyobrażać", "wypad", "wypić", "wypis", "wypłata", "wypożyczyć", "wyrzucać", "wyścig", "wysiłek",
                "wysłać", "wysoki", "wyspa", "wystawa", "występ", "wyświetlić", "wyszkolić", "wyszukać", "wywiad", "wywołać", "wyznanie",
                "wyzywać", "wzór", "żaba", "ząb", "zabawka", "zabić", "zabieg", "zabłądzić", "zabójca", "zachęcić", "zadowolenie",
                "zagadka", "zagłada", "zagroda", "zakaz", "zakład", "zakon", "zakręt", "zakryć", "żal", "załamanie", "zamach", "zamówić",
                "zaniedbać", "zapamiętać", "zapis", "zapiąć", "zaproszenie", "zarażać", "zaręczyny", "żart", "zarys", "zasada", "zasłona",
                "zasługa", "zastępstwo", "zaszczyt", "zaufać", "zawód", "zawsze", "zbawca", "zbierać", "zbrodnia", "zbroja",
                "zdenerwowany", "zdrada", "zdrajca", "zegar", "zero", "zespół", "zestaw", "zgadywać", "zgoda", "zgubić", "zielony",
                "ziemia", "zimny", "zima", "ziołowy", "zjawa", "zjednoczyć", "złamać", "zlecenie", "złoty", "złoto", "zły", "zmiana",
                "zmusić", "znak", "znicz", "znikać", "zostawić", "zranić", "zwiadowca", "związek", "zwierzak", "zwykły", "życie"
        };
        manageWords.addALL(base);
    }
}