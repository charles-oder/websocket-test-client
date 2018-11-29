package us.oder.websocketclient

import tornadofx.*


fun main(args: Array<String>) {
    launch<Application>(args)
}

class Application: App(WindowView::class) {
}

class WindowView() : View() {

    override val root = vbox {
        button("Press Me")
        label("Waiting")
    }
}