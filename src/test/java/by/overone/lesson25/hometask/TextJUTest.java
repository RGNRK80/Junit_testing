package by.overone.lesson25.hometask;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TextJUTest {


        String str = new String(" mAsha myla ramu i razbila snova");
        TextJU stest = new TextJU();


        @Test
        @DisplayName("TEST: number of words")
        @RepeatedTest(5)
        void isNumOfWordsWorks () {
            assertEquals(new TextJU().numOfWords(" mAsha myla ramu i razbila "), 5);
            assertEquals(stest.numOfWords(str), 6);

        }

        @Test
        @Disabled("for try")
        @DisplayName("TEST: Trim And Change A(a) ")
        void isTrimAndChangeAWorks () {
            assertEquals(new TextJU().trimAndChangeA(" mAsha myla ramu i razbila "), "m%sh% myl% r%mu i r%zbil%");
            assertEquals(stest.trimAndChangeA(str), "m%sh% myl% r%mu i r%zbil% snov%");
        }


        @Test
        @RepeatedTest(7)
        @DisplayName("TEST: is String is void ")
        void isStrvoidWorks () {
            assertTrue(stest.strvoid(""));
            assertFalse(stest.strvoid("k"));
            assertTrue(new TextJU().strvoid(""));

        }


        @Test
        @DisplayName("TEST: is StrEq Work? ")
        void isStrEqWork () {
            ArrayList<String> st = new ArrayList<>();
            st.add("testing1");
            stest.valArr.add("testing1");

            assertEquals(stest.strEq(st), "Cool");
            st.add("testing2");
            assertEquals(stest.strEq(st), "Bad");

        }


}