fun readLine() {

}

fun main(args: Array<String>) {
    print("Enter an objects mass: ")
    val mass = readLine()
    val massInNewtons = 9.8 * mass
    if ('massInNewtons > 1,000') {
        println("The object is too heavy")
        if ('massInNewtons < 10') println("The object is too light")
