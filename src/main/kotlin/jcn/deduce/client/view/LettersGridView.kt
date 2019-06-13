package jcn.deduce.client.view

import tornadofx.*
import jcn.deduce.client.TornadoFxApplication.Companion.knownLetters


class LettersGridView : View() {
    companion object {
        const val NUM_OF_ROWS = 3
    }

    override val root = gridpane {

        val rowSize = knownLetters.size/NUM_OF_ROWS

        val rows = knownLetters.toList().chunked(rowSize)

        rows.forEachIndexed { rowIndex, elements ->
            row {

                elements.forEachIndexed { buttonIndex, element ->
                    val displayIndex = rowSize * rowIndex + buttonIndex

                    button("${element ?: displayIndex}") {
                        minWidth = 80.00
                        minHeight = 80.00

                        action {
                            this.isDisable = true
                            this.text = "X"
                        }

                        gridpaneConstraints {
                            marginTopBottom(10.00)
                            marginLeftRight(10.00)
                        }
                    }
                }
            }
        }
    }
}