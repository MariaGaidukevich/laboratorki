import com.sun.deploy.panel.ITreeNode;

public class Tree {
    private int ageTree;
    boolean alive;
    private String treeName;

    public Tree(int ageTree, boolean alive, String treeName) {
        this.ageTree = ageTree;
        this.alive = alive;
        this.treeName = treeName;
        System.out.printf("Age of tree:%d Alive:%b Name:%s\n", this.ageTree, this.alive, this.treeName);
    }

    public Tree(int ageTree, String treeName) {
        this.ageTree = ageTree;
        this.treeName = treeName;
        System.out.printf("Age of tree:%d Name:%s\n", this.ageTree, this.treeName);
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

}
