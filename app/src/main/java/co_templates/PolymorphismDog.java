package co_templates;

public class PolymorphismDog extends PolymorphismAnimal{ // PolymorphismAnimal의 자손이라고 명시(상속) => 펑션과 변수를 사용가능
    // 상속된 method 수정 : overrinding
    // public void animalSound() {
    //     System.out.println("The dog says: bow wow");
    // }
    public int speed(int kmeter) {
        int result = (int) (kmeter * 1000) ;
        System.out.println(result);
        return result;
    }
    
}
