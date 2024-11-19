package com.devpaul.patrones

fun main(){
    val dialog: Dialog = WindowsDialog()
    dialog.render()

    val webDialog: Dialog = WebDialog()
    webDialog.render()
}

interface Button {
    fun render()
}

class WindowsButton : Button {
    override fun render() {
        println("Render a button in Windows style.")
    }
}

class HTMLButton : Button {
    override fun render() {
        println("Render a button in HTML style.")
    }
}

class AppButton : Button {
    override fun render() {
        println("Render a button in App style.")
    }
}

abstract class Dialog {
    abstract fun createButton(): Button

    fun render() {
        val button = createButton()
        button.render()
    }
}

class WindowsDialog : Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}

class WebDialog : Dialog() {
    override fun createButton(): Button {
        return HTMLButton()
    }
}
class AppDialog : Dialog() {
    override fun createButton(): Button {
        return AppButton()
    }
}