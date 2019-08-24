node {
    stage("Say Hello"){
        properties([parameters([string(defaultValue: '3.19.57.239', description: '''Dev: 3.19.57.239 QA: 3.15.185.26 Prod: 18.220.129.131''', name: 'Remote_instances', trim: true)])])
        git 'https://github.com/farrukh90/jenkins_april.git'
    }
}