pipeline{
    agent any
    environment {
        TIMESTAMP = "${currentBuild.startTimeInMillis}"
        registryCredential = 'dockerhub'
        registry = 'kvmass/stuform'
    }
    stages{
        stage("Build war file") {
            steps {
                script {
                    checkout scm
                    bat 'mvn package'
                    dir('/Users/go2go/.jenkins/workspace/swe-645-hw3/target') {
                        bat 'dir'
                        bat 'del app.jar'
                        bat 'ren swe645-hw3-0.0.1-SNAPSHOT.jar app.jar'
                    }
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
        stage("Deploying to  pod"){
            steps{
                bat "kubectl set image deployment/swe-645-hw3 container-0=kvmass/stuform:${env.TIMESTAMP}"
            }
        }
    }
}