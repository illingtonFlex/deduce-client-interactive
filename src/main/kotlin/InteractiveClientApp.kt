import javafx.stage.Stage
import tornadofx.App

class InteractiveClientApp : App(MainView::class) {
    override fun start(stage: Stage) {
        stage.minHeight = 200.0
        stage.minWidth = 400.0
        super.start(stage)
    }
}