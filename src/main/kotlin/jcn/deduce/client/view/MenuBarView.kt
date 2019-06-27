package jcn.deduce.client.view

import jcn.deduce.client.TornadoFxApplication.Companion.currentMatchId
import tornadofx.*

class MenuBarView : View() {
    override val root = menubar {
        menu (currentMatchId)
        menu("Configure") {
            item("Set API Root")
        }
        menu("About") {
            item("Copyright")
            item("Contact")
        }
    }
}
