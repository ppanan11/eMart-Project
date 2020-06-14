pipeline {
    agent any
    environment {
		dockerImage = ''
    }
    stages {
    	stage('CheckOut Code'){
         	steps{
            	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ppanan11/eMart-Project']]])
            }
        }
        stage('Maven Build'){
        	steps{
        	    bat 'mvn clean package -test'
        	}
        }
        stage('Image Build'){
        	steps{
        	    bat 'mvn dockerfile:build'
        	}
        }


    }
}