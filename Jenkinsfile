pipeline{
    agent any

    stages{
        stage('clean'){
            steps
            {   
                bat 'C:/Build/apache-maven-3.9.8/bin/mvn clean'
            }
        }
 stage('validate'){
            steps
            {   
                bat 'C:/Build/apache-maven-3.9.8/bin/mvn validate'
            }
        }
stage('compile'){
            steps
            {   
                bat 'C:/Build/apache-maven-3.9.8/bin/mvn compile'
            }
        }
stage('test'){
            steps
            {   
                bat 'C:/Build/apache-maven-3.9.8/bin/mvn test'
            }
        }
stage('package'){
            steps
            {   
                bat 'C:/Build/apache-maven-3.9.8/bin/mvn package'
            }
        }
stage('install'){
            steps
            {   
                bat 'C:/Build/apache-maven-3.9.8/bin/mvn install'
            }
        }

    }
}
