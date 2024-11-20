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


    }
}
