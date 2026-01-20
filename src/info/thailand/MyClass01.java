//Access Modifier of class -> default, public
//Access Modifier of member -> default. public,privete, protected
package info.thailand;

public class MyClass01 {
    //องค์ประกอบของคลาส member of class มีแค่ 2 อย่่าง
    //data member (data, filed, sttribute, property)
    int dataA = 20;
    public int dataB = 0;
    private int dataC = 0;
    protected int dataD = 0;


    //method member คือฟังก์ชั่นแบบหนึ่ง------------------
    void met1(){
        int score = 0; //ตัวแปร
    }

    public void met2( ){ }

    private void met3(){ }

    protected void met4(){ }
}
