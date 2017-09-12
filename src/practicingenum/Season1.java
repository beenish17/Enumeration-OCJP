
package practicingenum;
    public enum Season1{
        WINTER(),SPRING(),SUMMER(),FALL(),Garmi("high"),Sardi("Low");// these are six objects in enum;
        
        private String expectedVisitors;
        
        private Season1(){
            this.expectedVisitors=expectedVisitors;
            System.out.println("constructor-0");
        }
        private Season1(String expectedVisitors){
            
            this.expectedVisitors=expectedVisitors;
            System.out.println("constructor-1");
        }
        public void printExcpectedVisitors(){
            System.out.println("expected Visitors");
        }
    }
    enum Season2{
        Winter{public void printHours(){System.out.println("9-3pm");}},
        Spring{public void printHours(){System.out.println("9-5pm");}},
        Summer{public void printHours(){System.out.println("9-7pm");}},
        Fall{public void printHours(){System.out.println("9-6pm");}};
        public abstract void printHours();
    // this means that every object has to implement this abstract method.othervise it will be a compile time error.
    //  but let me define another enum in a good way i.e Season3
    }
    enum Season3{
        Winter{public void printHours(){System.out.println("9-3pm");}},
        Spring{public void printHours(){System.out.println("9-5pm");}},
        Summer{public void printHours(){System.out.println("9-7pm");}},
        Fall{public void printHours(){System.out.println("9-6pm");}};
        public void printHours(){System.out.println("default-Hours");}// This one looks better
    }