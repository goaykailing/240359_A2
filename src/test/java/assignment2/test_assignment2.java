//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #240359
//Name: #Goay Kai Ling
package assignment2;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class test_assignment2 extends assignment2 {

    @Test
    public void test_countStatic() throws IOException {
        assignment2 a2 = new assignment2();
        a2.result();
        int expectedSTATIC1 = 1;
        int actualSTATIC1 = content1[9];

        int expectedSTATIC0 = 1;
        int actualSTATIC0 = content0[9];

        Assert.assertEquals(expectedSTATIC0, actualSTATIC0);
        Assert.assertEquals(expectedSTATIC1, actualSTATIC1);
    }

    @Test
    public void test_countNew() throws IOException {
        int expectedNEW1 = 2;
        int actualNEW1 = content1[10];

        int expectedNEW0 = 1;
        int actualNEW0 = content0[10];

        Assert.assertEquals(expectedNEW0, actualNEW0);
        Assert.assertEquals(expectedNEW1, actualNEW1);
    }

    @Test
    public void test_loc() throws IOException {
        int expectedLOC1 = 30;
        int actualLOC1 = content1[0];

        int expectedLOC0 = 24;
        int actualLOC0 = content0[0];

        Assert.assertEquals(expectedLOC0, actualLOC0);
        Assert.assertEquals(expectedLOC1, actualLOC1);
    }

    @Test
    public void test_blank() throws IOException {
        int expectedBLANK1 = 6;
        int actualBLANK1 = content1[1];

        int expectedBLANK0 = 4;
        int actualBLANK0 = content0[1];

        Assert.assertEquals(expectedBLANK0, actualBLANK0);
        Assert.assertEquals(expectedBLANK1, actualBLANK1);
    }

    @Test
    public void test_comment() throws IOException {
        int expectedCOMMENT1 = 7;
        int actualCOMMENT1 = content1[2];

        int expectedCOMMENT0 = 6;
        int actualCOMMENT0 = content0[2];

        Assert.assertEquals(expectedCOMMENT0, actualCOMMENT0);
        Assert.assertEquals(expectedCOMMENT1, actualCOMMENT1);
    }

    @Test
    public void test_actualLOC() throws IOException {
        int expectedACTUALLOC1 = 17;
        int actualACTUALLOC1 = content1[3];

        int expectedACTUALLOC0 = 14;
        int actualACTUALLOC0 = content0[3];

        Assert.assertEquals(expectedACTUALLOC0, actualACTUALLOC0);
        Assert.assertEquals(expectedACTUALLOC1, actualACTUALLOC1);
    }

    @Test
    public void test_countPackage() throws IOException {
        int expectedPACKAGE1 = 1;
        int actualPACKAGE1 = content1[4];

        int expectedPACKAGE0 = 1;
        int actualPACKAGE0 = content0[4];

        Assert.assertEquals(expectedPACKAGE0, actualPACKAGE0);
        Assert.assertEquals(expectedPACKAGE1, actualPACKAGE1);
    }

    @Test
    public void test_countClass() throws IOException {
        int expectedCLASS1 = 1;
        int actualCLASS1 = content1[5];

        int expectedCLASS0 = 1;
        int actualCLASS0 = content0[5];

        Assert.assertEquals(expectedCLASS0, actualCLASS0);
        Assert.assertEquals(expectedCLASS1, actualCLASS1);
    }

    @Test
    public void test_countExtends() throws IOException {
        int expectedEXTENDS1 = 1;
        int actualEXTENDS1 = content1[6];

        int expectedEXTENDS0 = 1;
        int actualEXTENDS0 = content0[6];

        Assert.assertEquals(expectedEXTENDS0, actualEXTENDS0);
        Assert.assertEquals(expectedEXTENDS1, actualEXTENDS1);
    }

    @Test
    public void test_countPublic() throws IOException {
        int expectedPUBLIC1 = 2;
        int actualPUBLIC1 = content1[7];

        int expectedPUBLIC0 = 2;
        int actualPUBLIC0 = content0[7];

        Assert.assertEquals(expectedPUBLIC0, actualPUBLIC0);
        Assert.assertEquals(expectedPUBLIC1, actualPUBLIC1);
    }

    @Test
    public void test_countVoid() throws IOException {
        int expectedVOID1 = 2;
        int actualVOID1 = content1[8];

        int expectedVOID0 = 2;
        int actualVOID0 = content0[8];

        Assert.assertEquals(expectedVOID0, actualVOID0);
        Assert.assertEquals(expectedVOID1, actualVOID1);
    }

    @Test
    public void test_countTotal() throws IOException {
        int expectedTOTAL1 = 27;
        int actualTOTAL1 = content1[11];

        int expectedTOTAL0 = 23;
        int actualTOTAL0 = content0[11];

        Assert.assertEquals(expectedTOTAL0, actualTOTAL0);
        Assert.assertEquals(expectedTOTAL1, actualTOTAL1);
    }

    @Test
    public void test_matric() throws IOException {
        String expectedMATRIC1 = "898989";
        String actualMATRIC1 = matricNo[1];

        String expectedMATRIC0 = "123456";
        String actualMATRIC0 = matricNo[0];

        Assert.assertEquals(expectedMATRIC0, actualMATRIC0);
        Assert.assertEquals(expectedMATRIC1, actualMATRIC1);
    }

    @Test
    public void test_header() throws IOException {
        String expectedSEMESTER = "A171";
        String actualSEMESTER = header[0];

        String expectedCOURSE = "STIW3054";
        String actualCOURSE = header[1];

        String expectedGROUP = "A";
        String actualGROUP = header[2];

        String expectedTASK = "Assignment1";
        String actualTASK = header[3];

        Assert.assertEquals(expectedSEMESTER, actualSEMESTER);
        Assert.assertEquals(expectedCOURSE, actualCOURSE);
        Assert.assertEquals(expectedGROUP, actualGROUP);
        Assert.assertEquals(expectedTASK, actualTASK);
    }

}
