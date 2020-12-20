# mobile-tse-resultado
Esse repositório contém a solução de automação proposta como trabalho de conclusão da disciplina Testes Mobile da especialização em
Testes Ágeis da CESAR School, turma ETA2019.2, pelos alunos:

* Bruno Baima
* Marlon Almeida
* Rodrigo Souza

## **Aplicação testada:**
TSE Resultados apk (https://play.google.com/store/apps/details?id=br.jus.tse.resultados)

## **Pré-requisitos para execução:**
* Java Development Kit 1.8 (JDK)
* Appium
* Android Emulator

## **Instruções para execução:**
Para executar o projeto é preciso seguir os passos abaixo:

Obs: Recomendamos a utilização da IDE IntelliJ IDEA para execução do projeto.

1. Verificar que o build do Gradle foi executado após abrir o projeto na IDE
2. Iniciar o Android Emulator
2. Iniciar o Appium   
3. Adicionar o path para a pasta da apk na sua máquina. Para isso é preciso ir na
classe DriverManager.java (src/test/java/util/DriverManager.java) e alterar a variável APK_PATH de acordo com o seu OS.
4. Executar a classe CucumberRunner.java (src/test/java/runner/CucumberRunner.java)
5. No final da execução, um relatório html será gerado com os resultados em: target/cucumber-execution-report.html