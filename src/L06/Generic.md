# Overloading - העמסה

```java

class Main {
    static boolean IsEq(int n1, int n2) {
        return n1 == n2;
    }
    static boolean IsEq(String n1, String n2) {
        return n1.equals(n2);
    }
    static boolean IsEq(boolean n1, boolean n2) {
        return n1 == n2;
    }
    public static void main(String[] args) {

        System.out.println(IsEq(2, 2));
        System.out.println(IsEq("bob", "bob"));
        System.out.println(IsEq(true, true));

    }
}

```

# Generic

```java



class Main {
    static <T> void Print(T n1, T n2) {
        System.out.println("n1 = " + n1 + " , n2 = " + n2);
    }
    static <T> void sWAP(T[] arr,int i,int j ) {
        
    }
    public static void main(String[] args) {
        IsEq(2, 2);
        IsEq("bob", "bob");
        IsEq(true, true);
        IsEq(true, "Bob");

    }
}


```

output:

```
n1 = 2 , n2 = 2
n1 = bob , n2 = bob
n1 = True , n2 = True
```

# Generics - withe few types - implicit call

```java


class Main {
    static <T, S> void Print(T n1, S n2) {
        System.out.println("n1 = " + n1 + " , n2 = " + n2);
    }

    public static void main(String[] args) {
        //IS CALLED AS: static void IsEq<int,String>(int n1, string n2)
        IsEq(2, "bob");

        //IS CALLED AS: static void IsEq<String,boolean>(string n1, bool n2)
        IsEq("bob", false);

    }
}


```

output:

```
n1 = 2 , n2 = bob
n1 = bob , n2 = False
```

# Generic - with rules

```java


class Person {
}

class Student extends Person {
}

class Cat {
}


class Main {

    /*
        T must be or class "Person" or a sub-class of "Person"
    */
    static <T> void Test(Person n1) {

    }

    public static void main(String[] args) {
        Test(new Person());
        Test(new Student());
        //Test(new Cat());  --> COMPILATION ERROR

    }
}


```

# Generic class

```java

class Sms<T> {
    public String PhoneAddressee;
    public T Msg;

    public void SendSms() {
        System.out.println("Sending to " + PhoneAddressee + ", msg: " + Msg);
    }
}


class Main {
    public static void main(String[] args) {

        Sms<Integer> sms1 = new Sms<>();
        sms1.Msg = 3;
        sms1.PhoneAddressee = "0553335566";
        sms1.SendSms();

        Sms<String> sms2 = new Sms<>();
        sms2.Msg = "HAVE A PERFECT DAY";
        sms2.PhoneAddressee = "0551115566";
        sms2.SendSms();

    }
}


```

output:

```
Sending to 0553335566, msg: 3
Sending to 0551115566, msg: HAVE A PERFECT DAY
```

# Generic class - implicit call

```java

class Sms<T> {
    public String PhoneAddressee;
    public T Msg;


    public Sms(T msg) {
        Msg = msg;
    }

    public void SendSms() {
        System.out.println("Sending to " + PhoneAddressee + ", msg: " + Msg);
    }
}


class Main {
    public static void main(String[] args) {

        Sms<Integer> sms1 = new Sms(3);
        sms1.PhoneAddressee = "0553335566";
        sms1.SendSms();

        Sms<String> sms2 = new Sms("HAVE A PERFECT DAY");
        sms2.PhoneAddressee = "0551115566";
        sms2.SendSms();

    }
}

```

output:

```
Sending to 0553335566, msg: 3
Sending to 0551115566, msg: HAVE A PERFECT DAY
```
