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
