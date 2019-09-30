node {

    withMaven(maven:'maven-3.6.2') {
          stage ('Final') {
            build job: 'discovery-pipeline', wait: false
        }  
    }

}