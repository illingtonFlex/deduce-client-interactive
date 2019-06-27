package jcn.deduce.client.view

import tornadofx.View
import tornadofx.borderpane

class MainView : View() {
    override val root = borderpane {
        top<MenuBarView>()
        center<LettersGridView>()
        bottom<AnswerForm>()
    }
}