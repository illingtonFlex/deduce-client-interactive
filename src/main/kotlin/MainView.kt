import javafx.scene.paint.Color
import javafx.stage.Stage
import tornadofx.*

class MainView : View() {
    override val root = borderpane {
        top<LettersGridView>()

    }
}

class TornadoApp : App(MainView::class) {
    override fun start(stage: Stage) {
        stage.minHeight = 200.0
        stage.minWidth = 400.0
        super.start(stage)
    }
}