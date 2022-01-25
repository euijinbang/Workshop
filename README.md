# Workshop



Language, Code, Java and Other things...





## Terminology

### Program

a sequence of instructions, which are executed one after another in a predictable manner.

### Statement

a single action terminated by semi-colon(;)

### Block

a group of zero, one or more statements enclosed by a pair of braces {...}; 

### Method

a sequence of statements that represents a high-level operation.

### Identifier

a word that has a special meaning in the programming language.



## Contents (some of them)

### Literals

values performed by operations

- Integer numbers, Characters, Strings



### Types

Kinds of values that can be stored and manipulated.

- boolean, int, double, String 



### Variables

Named location that stores a value of one particular type.



### Operators

Symbols that perform simple computations





## Workshop1 Feedback

### Methods 의 Access Control 에 관하여 - 'public static' vs. 'static' 

public 의 핵심은 클래스 내부가 아닌 외부에서 접근이 가능한지입니다. 클래스가 싱글일 경우는 상관 없지만, 외부에서 접근이 되지 않도록 private method 를 만드는 것이 좋습니다.

같은 클래스 내에 있는 변수들은 private이던 public이던 신경쓰지 않습니다. Access Control(public/private)이 무엇이던, 같은 클래스 내에 있으므로 상관없이 사용할 수 있습니다.

그러면 왜 외부로부터 보호해햐 하는 경우가 있을까요? 우리는 클래스를 하나 만들고 외부 클래스에서 그 클래스의 메서드를 사용할 때 그 내부가 어떻게 되었는지 신경쓰지 않게 만들기 위해서입니다. 이것을 캡슐화라고 부르며, 견고한 객체지향성을 보장하는 프로그램을 작성하기 위한 개념입니다.



### 메서드 Recursion에 관하여

Argument를 넘기는 메서드를 recursion 하는 경우는 주의해야 합니다. 



#### Self

```
   public static void test() {
        while (true) {
            int answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            } else {
                System.out.println("Please, try again.");
                test();
            }
        }
    }
```

#### Guide

```
    static void test() {        
        int answer = scanner.nextInt();
        while (answer != 2) {
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
        }
    }
    
    static void end() {
    		System.out.println("Congratulations, have a nice day!");
    }
```





### 총평

> 구획화 해서 main 메서드를 단순하게 만듭시다. 하나하나의 메서드가 최대한 독립적일 수 있도록 합시다.



> 변수명은 r 보다는 rem (remainder) 를 사용해서 의미가 있도록 합시다.



> final static Scanner scanner = new Scanner(Sysyem.io)  는 필드에 해당하며, 맨 앞쪽에 위치해 놓는 것이 가독성에 있어서 좋습니다.



>while true를 쓰는 상황은 최대한 지양하는 것이 좋습니다. 의도가 명확한 상황(ex. 죽으면 큰일나는 게임서버) 가 아니라면 피하고 다른 방안을 쓰는 것이 좋습니다. 



>실행 흐름적으로는 while(true or 1) 을 피하고 break 를 덜 쓰는것이 코드 흐름 파악에 좋습니다.



