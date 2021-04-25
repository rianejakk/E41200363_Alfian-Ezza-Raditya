package com.clas.assignment;

    class A {
        void callthis() {
            System.out.println("Inside class A method");
        }
    }
    class B extends A {
        void callthis() {
            System.out.println("Inside class B method");
        }
    }
    class C extends A {
        void callthis() {
            System.out.println("Inside class C method");
        }
    }
    class DynamicDispatch {
        public static void main(String[] args) {
            A a = new A();
            B b = new B();
            C c = new C();
            A ref;

            ref = b;
            ref.callthis();

            ref = c;
            ref.callthis();

            ref = a;
            ref.callthis();
        }
    }

