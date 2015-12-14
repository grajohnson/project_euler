class ProblemTwo {

  public static void main(String[] args) {

    int firstNum = 1;
    int secondNum = 2;
    int ans = 2;

    while(secondNum <= 4000000) {

      int sum = firstNum + secondNum;

      if(sum % 2 == 0) {
        answer += sum;
      }

      firstNum = secondNum;
      secondNum = sum;

    }

    System.out.println(ans);

  }
}
