public class Person{
   private int age;
   private String name;
   private String lastname;

   /*Contructor with parameters*/
   public Person(int age,String name,String lastname){
	this.age=age;
        this.name=name;
        this.lastname=lastname;
   }

   public getName(){
	return this.name;
   }

   public int getAge(){
    return this.age;
   }
}
