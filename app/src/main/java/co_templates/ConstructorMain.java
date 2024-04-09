package co_templates;

public class ConstructorMain {
    public static void main(String[] args) {
        ConstructorAnimal animal = new ConstructorAnimal();
        animal.animalSound();

        ConstructorAnimal animalWithParams = new ConstructorAnimal(2, 3);
        // animal.byPass(4, 5);
        // // System.out.println("animal.firstNumber : "+animal.firstNum);
        // // System.out.println("animal.secondNumber : "+animal.secondNum);
        // // System.out.println("animal.result : "+animal.result);

        // animal.setResult(6);
        // System.out.println("animal.getResult() : "+animal.getResult());
        // // System.out.println("++ animal.result : "+(++animal.result)); // 해당 변수가 있는 class에서 접근자를 public 대신 private으로 해줘야지 외부에서 값을 바꿔줄 수 없다.
        // // get/ set은 데이터베이스와 연관될 때 많이 사용됨
        return ;
    }
}