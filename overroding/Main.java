class Parent{
    void show(){
        System.out.println("Sadashiv Pawar");
    }
}

class Child extends Parent {
    void show(){
        System.out.println("Pratik Pawar");
    }
}

class Main {
    public static void main(String[]args){
        Parent sp =new Parent();
        sp.show();

        Parent pp=new Child();
        pp.show();
    }
}