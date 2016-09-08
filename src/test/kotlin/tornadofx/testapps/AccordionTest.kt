package tornadofx.testapps

import javafx.scene.control.Label
import tornadofx.*

class AccordionTest : App(Main::class) {
    class Main : View("Accordion Test") {
        override val root = accordion {
            prefHeight = 200.0
            titledpane("Test 1") {
                content = vbox {
                    label("First")
                    label("Test")
                }
            }
            val tp = titledpane("Test 2") {
                vbox {
                    label("Second")
                    label("Test")
                }
                isExpanded = true  // FIXME: Won't work since the TitledPane is added to the Accordion before this op is invoked (see opcr)
            }
            println(tp.isExpanded)
            titledpane("Test 3", Label("Third Test"))
        }
    }
}
