pipeline {
    agent any

    stages {
        stage("Preparation") {
            steps {
                echo 'Download updates'
                git 'https://github.com/VladimirCW/group4.git'
            }
        }
        stage("Unit tests") {
            steps {
                bat 'mvn clean -DsuiteXmlFile=unit-testng.xml test'
            }
        }
        stage("UI tests") {
            steps {
                bat 'mvn clean -DsuiteXmlFile=ui.xml test'
            }
        }
    }
}