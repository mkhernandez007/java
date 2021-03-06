import java.lang.String;
//===========================================================================
public class Person {
//----------------------------------------------------------------------------------------------------------------------------------------
    private int     birthday = 1;
    private String  name;
    private int     age;
//----------------------------------------------------------------------------------------------------------------------------------------
    public Person(String name, int age){

        this.name=name;
        this.age=age;
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    public String getName(){

    return (name);
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    public int getAge(){

    return (age);
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    public void display(){

    String name = getName();
    int age     = getAge();

    System.out.println(name + " is " +  age + " years old.");
    }
//----------------------------------------------------------------------------------------------------------------------------------------
    public int incrementAge(){

        age++;
        return (age);
    }
//----------------------------------------------------------------------------------------------------------------------------------------
}
//===========================================================================
