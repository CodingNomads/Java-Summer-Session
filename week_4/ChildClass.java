package week_4;

public class ChildClass extends ParentClass{

    int childVar;
    int var;

    public ChildClass(){
        super(12);

        super.var = 14;
        this.var = 78;

        this.parentVar = 789;
        super.parentVar = 678;

        childVar = 124;
    }

}
