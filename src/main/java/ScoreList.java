// Fernando Branco
// CIS 2353
// Fall 2021
// Project 2

public class ScoreList {

    private ScoreNode head;

    ScoreList() {
        head = null;
    }

    public void setHead(ScoreNode head) {
        this.head = head;
    }
    public ScoreNode getHead(){
        return head;
    }

    ScoreList(ScoreList scoreCopy) {
        for(ScoreNode pointer = scoreCopy.head; pointer != null; pointer = pointer.getNextNode()){
            addToList(pointer.getName(),pointer.getScore());
        }
    }


    public void addToList( String name, int score) {
        ScoreNode newNode = new ScoreNode(name, score);
        if (head == null){
            head = newNode;
        }else {
            ScoreNode pointer = head;
            while (pointer.getNextNode()!= null && pointer.getNextNode().getScore() > newNode.getScore()){
                pointer = pointer.getNextNode();
            }
            if (pointer == head && pointer.getScore() < newNode.getScore()){
                newNode.getNextNode().setNextNode(head);
                head = newNode;
            }else {
                newNode.setNextNode(pointer);
                pointer.setNextNode(newNode);
            }
        }
    }


    public void remove (String name){
        ScoreNode tempNode = head, preview = null;
        if(tempNode != null && tempNode.getName().equalsIgnoreCase(name)){
            head = tempNode.getNextNode();
            return;
        }

        while(tempNode != null && !tempNode.getName().equalsIgnoreCase(name)){
            preview = tempNode;
            tempNode = tempNode.getNextNode();
        }

        if (tempNode == null){
            System.out.println("NAME NOT FOUND");
            return;
        }

        preview.getNextNode().setNextNode(tempNode);
    }

    public boolean verifyToUpdate(String name){
        ScoreNode tempNode = head;
        while (tempNode.getNextNode()!=null){
            if(tempNode.getName().equalsIgnoreCase(name)) {
                return true;
            }
            tempNode = tempNode.getNextNode();
        }
        return false;
    }

    public void print(){
        ScoreNode node = this.getHead();
        while (node != null)
        {
            System.out.print(node.getName()+ " " + node.getScore()+ "\n");
            node = node.getNextNode();
        }
    }

}
