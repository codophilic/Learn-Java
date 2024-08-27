abstract class AI{

    public abstract void MLModel();

    public abstract void DLModel();

    public void AllProblems(){
        System.out.println("AI Solves All the problems but requires both ML and DL model");
    }
}

abstract class DeveloperCommunity extends AI{

    @Override
    public void DLModel(){
        System.out.println("I think only DL Model will perfectly work for AI");
    }

}

class futureMLModelPlugin extends DeveloperCommunity{

    @Override
    public void MLModel() {
        // TODO Auto-generated method stub
        System.out.println("Only ML plugin can built AI");
    }

    
}

public class AboutAbstract{
    public static void main(String[] args) {
        
        AI ai=new futureMLModelPlugin(); // Dynamic method dispatch
        ai.DLModel();
        ai.MLModel();
    }
}