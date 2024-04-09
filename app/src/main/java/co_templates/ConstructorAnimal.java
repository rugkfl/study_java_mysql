package co_templates;

public class ConstructorAnimal { //Constructors는 return 값이 없음 
    public int firstNum ; 
    public int secondNum ;
    private int result ;

    public ConstructorAnimal() {
        System.out.println("ConstructorAnimal()");
    }

    public ConstructorAnimal(int firstNumber, int secondNumber) {
        System.out.println("ConstructorAnimal(int firstNumber, int secondNumber)");
        this.firstNum = firstNumber; // 생성자로 초기화 시키는 방법
        this.secondNum = secondNumber;
    }

    public void setResult(int number) { 
        this.result = number; 
    }

    public int getResult() {
        return this.result;
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void byPass(int firstNumber, int secondNumber) {
        this.firstNum = firstNumber; 
        this.secondNum = secondNumber; 
        this.result = firstNumber + secondNumber ;
       
        return;
    }
}


