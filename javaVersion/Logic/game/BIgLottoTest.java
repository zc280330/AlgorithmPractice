package Logic.game;

import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class BIgLottoTest {

    BigLotto bi = new BigLotto();

    @Test
    public void testlotto() {
        bi.congratulations(source01, Data0805_0810);
        bi.congratulations(source02, Data0805_0810);
        bi.congratulations(source03, Data0805_0810);
    }

    String[] Data0805_0810 = {
            "11 15 18 20 27 05 06",//8.5
            "04 10 12 23 27 08 09",//8.8
            "03 09 10 12 21 04 11", //8.10
            "02 09 10 21 35 01 07",//8.12
            "01 08 18 28 30 10 12",//8.15
            "17 23 28 29 32 01 03",//8.17
            "14 18 20 28 34 10 11",//8.19
            "04 16 24 29 35 02 12"//8.22
    };
    
    String[] s02 = {
            "01 12 16 28 33 03 12", //8.3
            "01 22 30 31 32 04 12", //8.1
            "05 07 26 30 31 07 10", //7.29
            "15 20 23 26 33 02 08", //7.27
            "01 08 14 16 28 04 10",//7.25
            "06 14 21 34 35 03 10",//7.22
            "13 15 26 32 33 05 07", //7.20
            "05 10 23 34 35 01 11",//7.18
            "11 18 20 21 33 06 07"//7.15
    };

    int[][] source01 = {
            {05, 07, 20, 24, 26, 02, 04},
            {01, 05, 10, 13, 25, 10, 11},
            {01, 02, 03, 16, 33, 02, 06},
    };
    int[][] source02 = {
            {05, 15, 24, 26, 28, 04,  9},
            { 8, 19, 20, 21, 29,  7, 12},
            {11, 17, 18, 25, 28, 02,  04},
    };
    int[][] source03 = {
            {12, 19, 21, 27, 34, 01, 05},
            {06,  9, 11, 28, 30, 03, 12},
            {01, 12, 18, 19, 32, 03,  8},
    };


    int[][] source04 = {
            {04, 21, 25, 26, 31, 8, 12},
            {8, 11, 15, 22, 23, 07, 10},
            {14, 15, 19, 21, 32, 01, 9},
            {05, 07, 8, 17, 32, 06, 9},
            {04, 8, 26, 32, 35, 02, 9}
    };
}
