package jcn.deduce.client

import javafx.stage.Stage
import jcn.deduce.client.view.MainView
import tornadofx.App
import khttp.post

class TornadoFxApplication : App(MainView::class) {
    companion object {
        const val endpoint = "http://deduce-api.ws:8080/deduceMatch"

        var knownLetters = arrayOfNulls<String>(21)
        var currentMatchId = "";
    }

    override fun init() {
        currentMatchId = post("$endpoint/createMatch").jsonObject.getJSONObject("entity").get("id").toString()
    }

    override fun start(stage: Stage) {
        stage.minHeight = 200.0
        stage.minWidth = 400.0
        super.start(stage)
    }
}