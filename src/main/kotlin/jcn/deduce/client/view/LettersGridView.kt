package jcn.deduce.client.view

import jcn.deduce.client.TornadoFxApplication.Companion.currentMatchId
import jcn.deduce.client.TornadoFxApplication.Companion.endpoint
import tornadofx.*
import jcn.deduce.client.TornadoFxApplication.Companion.knownLetters
import khttp.get


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
                            this.text = get("$endpoint/$currentMatchId/letterAtIndex/$displayIndex").jsonObject.getString("entity")
                            this.isDisable = true
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