import com.altitude3190.enigma.Alphabet
import com.altitude3190.enigma.Rotor
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class RotorTest {

    private val rotcfg = mapOf(
            0 to 1,
            1 to 3,
            2 to 2,
            3 to 0
    )
    private lateinit var cp1: Rotor
    private lateinit var cp2: Rotor
    private lateinit var cp3: Rotor

    @Before
    fun setUp() {

        val alph = Alphabet("ABCD")

        cp3 = Rotor(0, 2, alph, rotcfg)

        cp2 = Rotor(0, 2, alph, rotcfg)
        cp2.next = cp3

        cp1 = Rotor(0, 1, alph, rotcfg)
        cp1.next = cp2
    }

    @Test
    fun rotate() {

        cp1.rotate()
        assertEquals(2, cp1.latchPos)
        assertEquals(true, cp1.latchLock)

        assertEquals(2, cp2.latchPos)
        assertEquals(false, cp2.latchLock)

        assertEquals(2, cp3.latchPos)
        assertEquals(false, cp3.latchLock)

        cp1.rotate()
        assertEquals(3, cp1.latchPos)
        assertEquals(true, cp1.latchLock)

        assertEquals(3, cp2.latchPos)
        assertEquals(true, cp2.latchLock)

        assertEquals(3, cp3.latchPos)
        assertEquals(true, cp3.latchLock)

        cp1.rotate()
        assertEquals(0, cp1.latchPos)
        assertEquals(true, cp1.latchLock)

        assertEquals(3, cp2.latchPos)
        assertEquals(false, cp2.latchLock)

        assertEquals(3, cp3.latchPos)
        assertEquals(true, cp3.latchLock)

    }

}