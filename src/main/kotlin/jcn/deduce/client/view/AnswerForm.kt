package jcn.deduce.client.view

import javafx.beans.property.SimpleStringProperty
import javafx.stage.StageStyle
import jcn.deduce.client.TornadoFxApplication.Companion.apiBaseUrl
import jcn.deduce.client.TornadoFxApplication.Companion.currentMatchId
import khttp.put
import tornadofx.*

class AnswerForm : View() {

    private var answer = SimpleStringProperty()

    override val root = hbox {
        textfield {

            bind(answer)

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
                val response = put("$apiBaseUrl/$currentMatchId/solve/${answer.value}")

                println(response.jsonObject.toString())

                if(response.jsonObject.getJSONObject("entity").getBoolean("isSolved")) {
                    find<YouWinModal>().openModal(stageStyle = StageStyle.UTILITY)
                }
                else {
                    find<YouLoseModal>().openModal(stageStyle = StageStyle.UTILITY)
                }
            }
        }


    }
}

class YouWinModal: Fragment() {
    override val root = label("You win!")
}

class YouLoseModal: Fragment() {
    override val root = label("You LOSE!")
}