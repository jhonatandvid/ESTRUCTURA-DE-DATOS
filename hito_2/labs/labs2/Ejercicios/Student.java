package Ejercicios;

public class Student {

    private String fullname;
    private String lastname;
    private int age;

    public Student(String fname, String lname,int age) {
        this.fullname = fname;
        this.lastname = lname;
        this.age = age;
    }
    //metodo get y set
    //get: me permite obtener un valor
    //set: permiten cambiar el metodo de una clase
    public String getFullName()
    {
        return this.fullname;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;

    }

    public String getLastname()
    {
        return this.lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;

    }

    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
      this.age = age;
    }

}
