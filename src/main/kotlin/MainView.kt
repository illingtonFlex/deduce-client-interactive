import javafx.stage.Stage
import tornadofx.*

class MainView : View() {
    override val root = gridpane {
        row {
            button("0") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("1") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("2") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("3") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("4") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("5") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("6") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
        }
        row {
            button("7") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("8") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("9") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("10") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("11") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("12") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("13") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
        }
        row {
            button("14") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("15") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("16") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("17") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("18") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("19") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
            button("20") {
                useMaxWidth = true
                gridpaneConstraints {
                    marginBottom = 10.0
                }
            }
        }
    }
}

class TornadoApp : App(MainView::class) {
    override fun start(stage: Stage) {
        stage.minHeight = 200.0
        stage.minWidth = 400.0
        super.start(stage)
    }
}