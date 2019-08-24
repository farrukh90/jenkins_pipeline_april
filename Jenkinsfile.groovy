node {
    stage("Say Hello"){
        properties([parameters([string(defaultValue: 'Farrukh', description: 'Paste your name', name: 'NAME', trim: true)]), pipelineTriggers([cron('* * * * * ')])])
        sh "echo Hello ${NAME}"
    }
}