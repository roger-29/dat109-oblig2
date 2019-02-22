[![Build Status](https://travis-ci.org/sondregj/dat109-oblig2.svg?branch=master)](https://travis-ci.org/sondregj/dat109-oblig2)
<img src="https://img.shields.io/badge/it's%20lit-%F0%9F%94%A5%F0%9F%94%A5%F0%9F%94%A5-green.svg">

# Obligatory exercise 2

> DAT109

## Oppgave 1

Prosjektet er bygget ved hjelp av *Gradle*.

Kjør programmet med `gradle run --console=plain` i rotmappen.

## Oppgave 2

I prosjektet er det tatt i bruk ulike prinsipper fra GRASP og SOLID:

- **Single Responsibility Principle:** Alle klassene har ett spesifikt ansvar.
- **Low Coupling:** Hver klasse brukes kun av andre klasser gjennom et bestemt grensesnitt, uten avhengigheter mellom klassene.
- **High Cohesion:** Ansvaret for hver klasse er fokusert.
- **Creator:** Kun en klasse har ansvaret for å lage instanser av en annen klasse.
- **Controller:** Applikasjonen er koordinert av en klasse som delegerer ansvar til view-klassen og modellene, uten å gjøre mye selv.
