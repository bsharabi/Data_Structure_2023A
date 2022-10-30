


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
