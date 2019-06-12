package jcn.deduce.client.view

import tornadofx.*

class MenuBarView : View() {
    override val root = menubar {
        menu("Configure") {
            item("Set API Root")
        }
        menu("About") {
            item("Copyright")
            item("Contact")
        }
    }
}
