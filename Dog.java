public class Dog {
  private String name;
  private String color;
  private String breed;
  private double age;
  private boolean isTrained;

  public Dog(String name, String color, String breed, double age, boolean isTrained){
    this.name = name;
    this.color = color;
    this.breed = breed;
    this.age = age;
    this.isTrained = isTrained;
  }

  public String getName(){
    return name;
  }

  public String getColor(){
    return color;
  }

  public String getBreed(){
    return breed;
  }

  public double getAge(){
    return age;
  }

  public boolean getTrained(){
    return isTrained;
  }

  public String toString(){
    return this.name + "🐶";
  }
}