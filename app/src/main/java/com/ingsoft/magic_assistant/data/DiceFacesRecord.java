package com.ingsoft.magic_assistant.data;
import java.io.Serializable;


public class DiceFacesRecord implements Serializable {

    public int one 	= 0;
    public int two 	= 0;
    public int three 	= 0;
    public int four 	= 0;
    public int five 	= 0;
    public int six 	= 0;

    public void sum(DiceFacesRecord other){
        one += other.one;
        two += other.two;
        three += other.three;
        four += other.four;
        five += other.five;
        six += other.six;
    }

}
