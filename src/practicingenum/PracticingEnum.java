//Complete Topic of Enum covered in this class.
package practicingenum;
        //Imp: enum class is final static implicitly,so it can never be extended.
        //1: enum can be defined with-in Class and Outside the Class but not with-in Local Method.
    enum BirdsNames{        // for outer enum we can use public 
        Sparrow,Eagle,Mosqito
    }
public class PracticingEnum {
        //2:  enum is a Child Class of java.lang.Enum.
    enum Season{            // for inner enum we can use public,protected,static,private
        WINTER,SPRING,SUMMER,FALL   ; // This semicolon is Optional if thr's one statement.
        public static void main(String[] arg){System.out.println("main");}
    }
        public static void main(String[] args) {
    //3: Every member in enum class is implicitly public ,static ,final so we call it with its class name.
        Season call=Season.SPRING;   // we can call enum constants with enum's name,and it can only be stored in enum type of varible i.e call.
    
    //4: values() function is used to iterate through all the values of enum.
    //5: Ordinal() prints all the indexs of the values in the enum
        for(Season printAllValues : Season.values()){
            System.out.println(printAllValues+ "  "+ printAllValues.ordinal());
        }
    //6: we cant compare enum with primitive values directly.
        //if(Season.FALL== 3){} Compilation Error.
    //7: enum is Case-sensitive ,if the String doesnot matches the exact String in enum it will give Exception.
        //BirdsNames b=BirdsNames.valueOf("eagle");// it will through ILlegalArgumentException.
    //8: Use of enum in Switch.
        Season switchCase=Season.SPRING;
        switch(switchCase){
            case FALL:
            case SPRING:
                break;
            //case Season.SPRING: it will not compile as compiler knows that values of switch must be enum type so its implicitly defined.
            default:    System.out.println("Funny- Switch");
        }
        //Calling No-Argument Constructor will run for all four Objects of Enum.
        //One Argument Constructor will run two times 
        //Keep in mind that Constructors will run only once for every Object.
        Season1 first=Season1.FALL;     //all the constructors will run at first call
        first.printExcpectedVisitors(); 
        Season1 second=Season1.Garmi;
        second.printExcpectedVisitors();
        
        //Calling seanson3
        Season3.Spring.printHours();
         
        
    }
}
