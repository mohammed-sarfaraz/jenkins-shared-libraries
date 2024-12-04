def call(String Project, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dcokerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
  sh "docker login -u ${dockerHubUser} -p ${dockerhubpass}"
}
sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
