package cz.sazel.hellokotlin.console

/**
 * Console shared code declaration. Class is used to output something on screen.
 */
expect open class Console : IConsole {

    override fun println(s: String)

}