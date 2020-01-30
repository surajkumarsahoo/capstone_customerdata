node {
  stage('Git-Checkout') {
   git 'https://github.com/surajkumarsahoo/capstone_bankdata.git'
  }
    
 def project_path="codingchallenegejan8/bankdata"
 
 dir(project_path) {
    
  stage('Maven-Clean') {
   sh label: '', script: 'mvn clean'
  }
    
 stage('Maven-Compile') {
   sh label: '', script: 'mvn compile'
  }
  
   stage('Maven-Test') {
   sh label: '', script: 'mvn test'
  }
  
   stage('Maven-Package') {
   sh label: '', script: 'mvn package'
  }
   stage('Archive-Artifacts') {
   archiveArtifacts 'target/*.war'
  }
 }    
}
