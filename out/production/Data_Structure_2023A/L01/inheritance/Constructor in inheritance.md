# Constructor only in the parent (without parameters)
```java
import static java.lang.System.out;

    class A
    {
        public A()
        {
            System.out.println("constructor of A");
        }
    }


    class B extends A
    {
       
    }
    class Main
    {
        public static void main(String[] args)
        {
            B myB = new B();
        }
    }


```


output:
```
constructor of A
```


# Constructor in the parent and in the child (without parameters)
```java
import static java.lang.System.out;




    class A
    {
        public A()
        {
            System.out.println("constructor of A");
        }
    }


    class B extends A
    {
        public B()
        {
            System.out.println("constructor of B");
        }
    }
    class Main
    {
        static void Main(string[] args)
        {

            B myB = new B();
           
        }
    }


```


output:
```
constructor of A
constructor of B
```
# Constructor in the parent and in the child (with parameters)
```java
import static java.lang.System.out;



    class A
    {
        public A(int num1)
        {
            System.out.println("constructor of A , num1="+num1);
        }
    }


    class B extends A
    {
        public B(int num1, int num2)
        {
            super(num1);
            System.out.println("constructor of B, num1="+num1+", num2="+num2);
        }
    }
    class Main
    {
        public static void main(String[] args)
        {

            B myB = new B(3,6);
           
        }
    }

```

output:
```
constructor of A , num1=3
constructor of B, num1=3, num2=6
```
