pipeline{
    agent any
    environment {
        TIMESTAMP = "${currentBuild.startTimeInMillis}"
        registryCredential = 'dockerhub'
        registry = 'kvmass/stuform'
    }
    stages{
        //lol
        stage("Build war file") {
            steps {
                script {
                    checkout scm
                    bat 'mvn package'
                    bat 'cd target'
                    bat 'dir'
                }
            }
        }
        stage("build docker") {
            steps {
                script {
                    dockerImageBuild = docker.build registry + ":${env.TIMESTAMP}"
                }
            }
        }
        stage("deploy docker") {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImageBuild.push()
                    }
                }
            }
        }
        // stage("Deploying to  pod"){
        //     steps{
        //         bat "kubectl set image deployment/hw2-645-swe container-0=kvmass/stusurvey:${env.TIMESTAMP}"
        //     }
        // }
    }
}