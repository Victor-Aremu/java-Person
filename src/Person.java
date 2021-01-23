public class Person {
    String firstName;
    String lastName;
    int age;
    public String getFirstName() {
            return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if ((age<0)||(age>100)){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }
    public boolean isTeen(){
        if ((getAge()>12)&&(getAge()<20)){
            return true;
        }
        else {
            return false;
        }
    }
    public String getFullName(){
            return (getFirstName()+" "+getLastName());
    }
}
