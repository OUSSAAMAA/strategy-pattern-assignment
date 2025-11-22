package org.example;

public class Context {

    Strategy strategy = new StrategyImlDefault();

    public void makeOperation(){
        System.out.println("***********************************************************************");
        strategy.operationStrategy();
        System.out.println("=======================================================================");
    }


    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
