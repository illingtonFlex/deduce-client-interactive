package jcn.deduce.client

import javafx.stage.Stage
import jcn.deduce.client.view.MainView
import tornadofx.App

class InteractiveClientApp : App(MainView::class) {
    companion object {
        var knownLetters = arrayOfNulls<String>(21)
    }

    override fun init() {
        knownLetters[4] = "T"
        knownLetters[9] = "G"
        knownLetters[17] = "Z"
    }

    override fun start(stage: Stage) {
        stage.minHeight = 200.0
        stage.minWidth = 400.0
        super.start(stage)
    }
}