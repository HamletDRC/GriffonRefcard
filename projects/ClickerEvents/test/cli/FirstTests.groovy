import griffon.test.AbstractCliTestCase

/**
 * Test case for the "First" Griffon command.
 */
class FirstTests extends AbstractCliTestCase {
    void testDefault() {
        execute([ "First" ])

        assertEquals 0, waitForProcess()
        verifyHeader()

        // Make sure that the script was found.
        assertFalse "First script not found.", output.contains("Script not found:")
    }
}
