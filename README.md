Teste automatizados
====================


Criar novo projeto
====================

mvn archetype:generate  
-DarchetypeGroupId=io.cucumber 
-DarchetypeArtifactId=cucumber-archetype  
-DarchetypeVersion=4.2.6.1  
-DgroupId=hellocucumber  
-DartifactId=hellocucumber  
-Dpackage=hellocucumber     
-Dversion=1.0.0-SNAPSHOT   
-DinteractiveMode=false

Keywords
=========



Testar
===============

Testar todas features
mvn test

Testar algumas tags

mvn test -Dcucumber.options="--tags @Cadastro"
