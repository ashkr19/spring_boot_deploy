pipeline {
    agent any

    parameters {
        string(name: 'BRANCH_NAME', defaultValue: 'main', description: 'Git branch to build')
    }

    stages {

        stage('Clone') {
            steps {
                git branch: "${params.BRANCH_NAME}",
                    url: 'https://github.com/ashkr19/spring_boot_deploy.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building branch: ${params.BRANCH_NAME}"
            }
        }
    }
}