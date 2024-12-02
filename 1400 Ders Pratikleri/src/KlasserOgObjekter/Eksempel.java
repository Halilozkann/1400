<!--When we choise HTML Element, we took advantage of link= https://www.w3schools.com/html/html_blocks.asp-->
<!DOCTYPE html>
<!-- Set the language of the page to Norwegian for compatibility with Norwegian characters -->
<html lang="no">

<head>
    <!-- Meta tags for encoding and responsive design -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><!--for responsiveness-->

    <!--SEO meta tags-->
    <!-- Keywords for better search engine optimization -->
    <meta name="keywords" content="Oslomet, Mathematisk Modellering, Datavitenskap, Ingeniør" />
    <!-- Page description for search engines -->
    <meta name="description"
content="The page contains information about OslaMet's Matematisk Modellering og Datavitenskap - Ingeniør" />

    <!-- Title of the webpage -->
<title>Mathematisk Modellering og Datavitenskap - Ingeniør</title>

    <!-- Link to Font Awesome for icons used in the menu. Icons used in Hamburber menu symbol, "X" symbol, searching and sosial media links-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <!-- Link to external CSS for page styling -->
    <link rel="stylesheet" href="./css/styles.css">
</head>


<!--Header Section -->
<header>
    <!-- Navigation Bar-->
    <nav class="navbar" id="navbar">
        <!--Logo Section-->
        <section class="logo" id="logo">
            <!--Link til hjem side from the logo-->
            <a href="index.html">
                <img class="header-logo" src="./images/oslometlogo2.jpg" alt="Oslomet Logo"><!--Oslomet LOgo-->
            </a>
        </section>

        <!--Search Box-->
        <section class="search-box">
            <input type="text" placeholder="Search..." aria-label="Search Field">
            <button type="submit" aria-label="Search">
                <i class="fas fa-search" aria-hidden="true"></i>
            </button>
        </section>


        <!-- Hamburger Menu Section -->
        <section class="Hamburger-menu" id="Hamburger-menu">
            <!-- Checkbox for toggling the menu -->
            <input type="checkbox" id="kontrol">
            <!-- Label with hamburger and closs icons on Navbar -->
            <label for="kontrol" class="kontrol">
                <i class="fa fa-bars"></i><!-- Hamburger icon -->
                <i class="fa fa-times"></i><!-- Close icon -->
            </label>
            <!-- Navigation Menu -->
            <section class="menu">
                <ul><!--List of navigation links-->
                    <li><a href="index.html">Hjem</a></li>
                    <li><a href="accessibility.html">Tilgjengelighet</a></li>
                    <li><a href="github.html" class = "active">GitHub</a></li>
                    <li><a href="activity.html">Aktivitet</a></li>
                </ul>
            </section>
        </section>
    </nav>
</header>

<main class="GitHubPageMain">
    <h1 class="GitHubPageHeader1">GitHub Page Edits:</h1>

    <section class="GitHubPageImages">
        <figure class="GitHubPageFigure">
            <img src="./images/commits_1.png" alt="Description of image 1" class="GitHubPageimage">
            <figcaption class="GitHubPageFigcaption">Commit historikk vises med detaljerte tidsstempler.</figcaption>
        </figure>
        <figure class="GitHubPageFigure">
            <img src="./images/commits_2.png" alt="Description of image 2" class="GitHubPageimage">
            <figcaption class="GitHubPageFigcaption">Commit historikk vises med detaljerte tidsstempler.</figcaption>
        </figure>
        <figure class="GitHubPageFigure">
            <img src="./images/changes_1.png" alt="Description of image 3" class="GitHubPageimage">
            <figcaption class="GitHubPageFigcaption">Et eksempel på en spesifikk endring i en Commit.</figcaption>
        </figure>
        <figure class="GitHubPageFigure">
            <img src="./images/changes_2.png" alt="Description of image 4" class="GitHubPageimage">
            <figcaption class="GitHubPageFigcaption">Et eksempel på en spesifikk endring i en Commit.</figcaption>
        </figure>
    </section>


    <section class="GitHubPageTextContent">
        <!--Benefited this nettside for texts:
https://www.kode24.no/artikkel/her-er-vs-code-tilleggene-norske-utviklere-ikke-klarer-seg-uten/80963445 -->

<h3>Benefits of Git</h3>
        <p>
Git var et kraftig versjonskontrollsystem som lar oss effektivt spore endringer i kodebasen vår. En av de
største fordelene var forgrening, som gjorde det mulig for team å jobbe med flere funksjoner eller fikser
samtidig uten å påvirke hovedkoden. I tillegg ga Gits forpliktelseshistorikk en detaljert logg over hvem som
hadde gjort endringer og hvorfor, noe som forbedret samarbeid og ansvarlighet. Den fungerte svært pålitelig
og fleksibelt for utviklere som jobbet eksternt eller i områder med lav tilkobling. I dette prosjektet fikk
vi muligheten til å samle prosjektene våre og gjøre endringer ved hjelp av Git.
        </p>
<h3>Fordeler med GitHub</h3>
        <p>
GitHub utvidet Gits evner ved å tilby en sentralisert plattform for hosting, deling og samarbeid om
prosjekter. Utviklere kunne enkelt administrere pull-forespørsler og muliggjøre fagfellevurderinger før
koden ble slått sammen i hovedgrenen. I dette prosjektet, som det kan sees fra GitHub-bildene, ga det oss
kritiske fordeler som å klone prosjektene våre, oppdatere dem, legge til og fjerne filer, og legge til
grenen vi jobbet med til hovedgrenen vår.
        </p>
<h3>Fordeler med Live Share i VS-kode</h3>
<p>Live Share i Visual Studio Code revolusjonerte parprogrammering ved å muliggjøre samarbeid i sanntid. Vi
delte arbeidsområdet vårt, inkludert kode, terminaler og feilsøkingsøkter, uten å måtte kopiere filer eller
sette opp miljøer. Det var spesielt gunstig for teamet vårt, siden det reduserte kommunikasjonsforsinkelser
og fremmet umiddelbar tilbakemelding. Muligheten til å redigere og gjennomgå kode samtidig sikret bedre
teamarbeid og raskere løsninger på kodingsutfordringer.</p>
    </section>

</main>
</body>