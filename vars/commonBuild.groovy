def call() {
    stage('Checkout') {
        checkout scm
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'  
    }

    stage('Deploy') {
        echo "Deploying application to environment..."
        
    }
}
