package club.plus1.forcetaxi.stub;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ConstantStubTest {

    @Test
    public void createConstantStub() {
        ConstantStub constantStub = new ConstantStub();
        assertNotNull(constantStub);
    }
}