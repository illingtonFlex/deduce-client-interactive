package jcn.deduce.client.view

import tornadofx.*
import jcn.deduce.client.InteractiveClientApp.Companion.knownLetters


class LettersGridView : View() {
    override val root = gridpane {

        knownLetters.forEachIndexed { index, element ->

            if (index == 0 || index % 7 == 0) {
                row {
                    button(element?.toString() ?: index.toString()) {
                        useMaxWidth = true
                        gridpaneConstraints {
                            marginBottom = 10.0
                        }
                    }
                }
            } else {
                button(element?.toString() ?: index.toString()) {
                    useMaxWidth = true
                    gridpaneConstraints {
                        marginBottom = 10.0
                    }
                }
            }
        }
    }
}