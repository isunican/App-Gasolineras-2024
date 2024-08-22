# Proyecto Base

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=coverage)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=bugs)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=App-Gasolineras-2024&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=App-Gasolineras-2024)

Este repositorio contiene el código inicial para el Proyecto Integrado 2024.

La información relativa al Proyecto Integrado, y las asignaturas que lo componen, se puede encontrar en la [Wiki](https://github.com/isunican/docsProyectoIntegrado/wiki).

La aplicación inicial incluye funcionalidad básica para descargar y mostrar información sobre gasolineras, utilizando el servicio REST oficial del [Ministerio](https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/help).

Información sobre este servicio REST puede encontrarse en [este documento](servicio-gasolineras.md).

La aplicación utiliza el patrón Model-View-Presenter. El diagrama de arquitectura inicial es el siguiente:

![](Docs/Models/arquitectura.svg)

La actividad principal está compuesta por una vista (MainView) y un presenter (MainPresenter) que muestran una lista de gasolineras de Cantabria. La siguiente figura muestra el proceso de inicialización y obtención de las gasolineras.

![](Docs/Models/main-secuencia.svg)
