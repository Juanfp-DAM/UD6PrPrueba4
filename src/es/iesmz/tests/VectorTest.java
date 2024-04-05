package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @org.junit.jupiter.api.Test
    void reverso() {
        //ARRANGE
        int v[] = {1,2,3,4,5,6};
        //ASSERT
        int vRev[]=Vector.reverso(v);
        //ACT
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, vRev);
    }

    @org.junit.jupiter.api.Test
    void reverso2(){
        //ARRANGE
        int v2[]={10,12,5,221,6,7};
        //ASSERT
        int vRev2[]=Vector.reverso(v2);
        //ACT
        assertArrayEquals(new int[]{7,6,221,5,12,10}, vRev2);
    }

    @org.junit.jupiter.api.Test
    void reverso3(){
        //ARRANGE
        int v3[]={5};
        //ASSERT
        int vRev3[]=Vector.reverso(v3);
        //ACT
        assertArrayEquals(new int[]{5}, vRev3);
    }

    @org.junit.jupiter.api.Test
    void reverso4(){
        //ARRANGE
        int v4[]={5,10,20};
        //ASSERT
        int vRev4[]=Vector.reverso(v4);
        //ACT
        assertArrayEquals(new int[]{20,10,5}, vRev4);
    }

}