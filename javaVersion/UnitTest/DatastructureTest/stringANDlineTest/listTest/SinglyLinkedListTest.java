package UnitTest.DatastructureTest.stringANDlineTest.listTest;

import DataStructure.stringANDline.list.listrealize.SinglyLinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 单链表测试案例
 */
public class SinglyLinkedListTest {

    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    /**
     * 链表的插入: Testinsert
     * 链表输出为数组 :TesttoArray
     * 链表输出: Testprint
     */
    @Test
    public void testinsert() {
        singlyLinkedList.clear();
        singlyLinkedList.insert(true, array01);
        int[] target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, new int[]{});
        singlyLinkedList.clear();

        singlyLinkedList.insert(true, array02);
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, array02);
        singlyLinkedList.clear();

        singlyLinkedList.insert(true, array02_1);
        target = singlyLinkedList.toArray();
        assert target[0] == array02_1;
        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array02_1);
        target = singlyLinkedList.toArray();
        assert target[0] == array02_1;
        singlyLinkedList.clear();

        for (int i = 0; i < array03.length; i++) {
            singlyLinkedList.insert(true, array03[i]);
        }
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, array03_head);
        singlyLinkedList.clear();

        for (int i = 0; i < array03.length; i++) {
            singlyLinkedList.insert(false, array03[i]);
        }
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, array03_tail);
        singlyLinkedList.clear();

        singlyLinkedList.insert(true, array04);
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, array04_head);
        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, array04_tail);
        singlyLinkedList.clear();

        singlyLinkedList.insert(false, array01);
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, new int[]{});
        singlyLinkedList.clear();

        singlyLinkedList.insert(true, array05);
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, array05_head);
        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array05);
        target = singlyLinkedList.toArray();
        Assert.assertArrayEquals(target, array05_tail);
        singlyLinkedList.clear();
    }

    /**
     * 链表删除特定值的函数
     */
    @Test
    public void testdeletex() {
        singlyLinkedList.clear();
        singlyLinkedList.insert(true, array04);
        boolean flag = singlyLinkedList.deletex(5);
        assert flag;
        flag = singlyLinkedList.deletex(986);
        assert flag;
        flag = singlyLinkedList.deletex(666);
        assert !flag;
    }

    /**
     * 链表删除特定索引的函数
     */
    @Test
    public void testdeleteindex() {
        singlyLinkedList.clear();
        singlyLinkedList.insert(true, array04);
        boolean flag = singlyLinkedList.deleteindex(5);
        assert flag;
        flag = singlyLinkedList.deleteindex(986);
        assert !flag;
        flag = singlyLinkedList.deleteindex(10);
        assert flag;
    }

    /**
     * 链表查找函数
     */
    @Test
    public void testsearchx() {
        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        int flag = singlyLinkedList.searchx(5);
        assert flag == 5;
        flag = singlyLinkedList.searchx(986);
        assert flag == 6;
        flag = singlyLinkedList.searchx(666);
        assert flag == -1;
    }

    /**
     * 链表查找函数
     */
    @Test
    public void testsearchindex() {
        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        int target = singlyLinkedList.searchindex(5);
        assert target == 5;
        target = singlyLinkedList.searchindex(10);
        assert target == 8;
        target = singlyLinkedList.searchindex(200);
        assert target == Integer.MIN_VALUE;
    }

    int[] array01 = null;
    int[] array02 = {};
    int array02_1 = 4;

    int[] array03 = {2, 54, 76, 3, 40, 598, 473, 6, 2};
    int[] array03_head = {2, 6, 473, 598, 40, 3, 76, 54, 2};
    int[] array03_tail = {2, 54, 76, 3, 40, 598, 473, 6, 2};

    int[] array04 = {2, 54, 76, 3, 40, 5, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};
    int[] array04_head = {2, 6, 473, 8, 9, 8, 854, 89, 56, 986, 5, 40, 3, 76, 54, 2};
    int[] array04_tail = {2, 54, 76, 3, 40, 5, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};

    int[] array05 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int[] array05_head = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] array05_tail = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
}