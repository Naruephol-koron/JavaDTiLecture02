//access modifier ของ Member -----------------
//default ใช้ได้เฉพาะใน package เดียกันเท่านั้น
//public เรียกใช้ที่ไหนก็ได้
//private เรียกใช้ได้เฉพาะใน Class ตัวเองเท่านั้น
//protected เรียกใช้ได้เฉพาะ Class ที่อยู่ใน package เดียวกันเท่านั้น หากเป็น Class อยู่ต่าง package จะต้องเป็น Class ที่สืบทอดกัน (inheritance)

package net.wee.dti;

public class Dti01 {
    int dataA = 10;
    private int dataB = 20;

    public void metDti01(){

    }
}
