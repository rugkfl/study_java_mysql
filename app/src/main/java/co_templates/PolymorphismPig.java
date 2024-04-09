package co_templates;

public class PolymorphismPig extends PolymorphismAnimal{ // PolymorphismAnimal의 자손이라고 명시(상속)
    // 상속된 method 수정 : overrinding
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    } 
    
}
