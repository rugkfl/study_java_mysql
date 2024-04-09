package co_templates;

public class ConstructorAnimal {
    public int firstNum ; //(public)이 생략 되어있는 것
    public int secondNum ;
    private int result ; // 아래의 변수와 다름 

    public void setResult(int number) { //result의 값을 바꿔 줄 수 있는 method
        this.result = number; 
    }

    public int getResult() { // 값을 가져오는 method이므로 param필요 x / 펑션 이름에는 해당 값의 변수와 동일하게 넣음
        return this.result;
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void byPass(int firstNumber, int secondNumber) {
        this.firstNum = firstNumber; // this는 이 class를 가르키는 말
        this.secondNum = secondNumber; 
        this.result = firstNumber + secondNumber ;
        // this.result = result ; (이 방법은 쓰지 x)
        return;
    }
}


