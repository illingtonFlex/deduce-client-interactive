package jcn.deduce.client.view

import tornadofx.*

class AnswerForm : View() {

    override val root = hbox {
        textfield {

            hboxConstraints {
                marginTopBottom(10.00)
                marginLeftRight(10.00)
            }

        }

        button("Submit Answer") {

            hboxConstraints {
                marginTopBottom(10.00)
                marginLeftRight(10.00)
            }

            minWidth = 80.00

            action {
            // do stuff
            }
        }


    }
}