package OOP.Abstracts;

public abstract class Actor  implements  ActorBehaviour {

    private String name;
    private boolean isMakeOrder;
    private boolean isTakeOrder;

    public Actor(String xName,boolean xMakeOrder, boolean xTakeOrder){
        this.name = xName;
        this.isMakeOrder = xMakeOrder;
        this.isTakeOrder = xTakeOrder;
    };


}

