job('email_example') {
    publishers {
        extendedEmail {
            recipientList('fen.ye@tietoevry.com')
            triggers {
                success {
                    attachBuildLog(true)
                    subject('Subject')
                    content('Body')
                    sendTo {
                        recipientList()
                    }
                }
            }
        }
    }
}