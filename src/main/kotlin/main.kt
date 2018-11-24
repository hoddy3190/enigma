import com.altitude3190.enigma.SimpleEnigma

fun main(args: Array<String>) {

    val enigma = SimpleEnigma()

    if (args.size > 0) {
        for (input in args) {
            for (ch in input.toCharArray()) {
                println(enigma.keystroke(ch))
            }
        }
    } else {
        println(enigma.keystroke('A'))
        println(enigma.keystroke('C'))
        println(enigma.keystroke('C'))
        println(enigma.keystroke('C'))
    }

}