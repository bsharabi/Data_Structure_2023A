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


# Override

```java


class A {
    public String SayBye() {
        return " Bye I am A";
    }

    public String SayHello() {
        return " Hello I am A";
    }
}


class B extends A {
    public String SayHello() {
        return " Hello I am B";
    }
}

class Main {
    public static void main(String[] args) {
        B myB = new B();
        System.out.println(myB.SayHello());
        System.out.println(myB.SayBye());
    }
}


```

output:

```
 Hello I am B
 Bye I am A
```

# Use `base` to access parent ovrrided function

```java


class A {
    public String SayBye() {
        return " Bye I am A";
    }

    public String SayHello() {
        return " Hello I am A";
    }
}


class B extends A {
    public String SayHello() {
        return super.SayHello() + " Hello I am B";
    }
}

class Main {
    public static void main(String[] args) {
        B myB = new B();
        System.out.println(myB.SayHello());
        System.out.println(myB.SayBye());
    }
}


```

output:

```
 Hello I am A Hello I am B
 Bye I am A
```




# polymorphism
```java


    class A
    {

    }


    class B extends A
    {

    }
    class Main
    {
        public static void main(String[] args)
        {
            A myA1 = new A();


            // a base can point to a sub instance
            A myA2 = new B();

            // a sub can not point to a base instance
            // B myB1 = new A();  //--> COMPILATION ERROR
            B myB2 = new B();
           
        }
    }


```
# polymorphism - can not access child property with parent pointer
```java


    class A
    {
        public int Num1=1;
    }


    class B extends A
    {
        public int Num2=2;
    }
    class Main
    {
        public static void main(String[] args)
        {
            A myA = new B();

            System.out.println(myA.Num1);

            //'A' does not contain a definition for 'Num2'
            //System.out.println(myA.Num2);  //CONPILATION ERROR

            B myB = new B();

            System.out.println(myB.Num1);
            System.out.println(myB.Num2);

        }
    }


```
OUTPUT:
```
1
1
2
```

# polymorphism - access child property with parent pointer by casting
```java


    class A
    {
        public int Num1= 1;
    }


    class B extends A
    {
        public int Num2 = 2;
    }
    class Main
    {
        public static void main(String[] args)
        {
            A myA = new B();

            if(myA instanceof B)
            {
                System.out.println(((B)myA).Num2);
            }

        }
    }


```
output:
```
2
```
