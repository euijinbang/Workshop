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





## Workshop2

### Good Programming Style

좋은 프로그래밍 스타일이란 내가 읽기 쉽고, 다른 사람이 읽기 쉬운 스타일을 말합니다.

내가 짠 코드는 몇 주, 몇 달 후의 내가 다시 읽어볼 확률이 높습니다.

어떻게 짜야 좋은 프로그래밍 스타일이 될까요?

#### Rule 1. use good (meaningful) names for variables and methods

#### Rule 2. Use indentation

#### Rule 3. Usee whitespaces

#### Rule 4. Do not duplicate tests



메인 메서드에서 깔끔하게 메서드를 호출하는 코드를 생각해 보십시오.

흐름이 명확하고 코드는 재사용 가능합니다.



## Workshop3

### 슈더코드를 짭시다

코드의 흐름을 미리 생각합시다. 메인 함수가 실행되면 어떤 클래스의 어떤 메서드가 실행될지, 흐름을 파악합시다.

Let's design a Pseudo-code.

Scrap paper is useful.



### 라이브러리를 활용하는 법

인터페이스와 메서드가 많다고 무작정 좋은 것은 아닙니다. 우리가 구현하고자 하는 기능을 생각해봅시다. 

그 기능에 맞는 라이브러리를 찾아 활용하면 됩니다.  꾸준히 업데이트 되고 있는지, 보안은 잘 이루어지고 있는지 확인합시다.



### 잘 짜여진 코드란

잘 짜여진 코드는 읽기 쉬운 코드입니다. 명확하고, 재사용 가능한 코드입니다.

오류가 없는 코드입니다. 



### 어떻게 하면 빠르게 실력을 향상시킬 수 있을까

공식 문서를 보는 것은 좋습니다. 어렵다면 한국어로 번역하여 보되, 영어와 다른 부분을 확인해보셔도 좋습니다.

결국 언젠가는 공식 문서를 원어로 읽어야 합니다. 해당 언어는 그 언어를 만든 사람들의 사고방식, 언어방식을 반영하고 있습니다. 

한국, 일본 사람들이 루비 언어를 보다 편하다고 인식하는 것도 그 때문입니다. 루비는 일본인이 만들었습니다.



### 이렇게 해보세요

잘 만들어진 라이브러리를 3개 만이라도 똑같이 따라서 코딩해보세요. 실력이 쑥쑥 늘거에요!



### Access Controller 

기본으로 Private 이라고 생각하세요. 부득이한 경우에만 변경하세요. 원칙적으로 Private 을 지키도록 노력하세요.



### 컴퓨터사이언스 대학원에 관하여

대학원은 열려 있습니다. 석사 외 박사학위는 100% full - cover 됩니다.



### 구글과 페이스북, 그리고 엔비디아

오픈 소스에 기여해보세요. 좋은 기회가 올지도 모릅니다.



---



##### All Regards to...

>Alan
>
>Research Scientist @Protopia AI inc.
>
>Research Assistant @High Performance and Intelligence Computing Lab. Korea University

