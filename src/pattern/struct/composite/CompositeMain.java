package pattern.struct.composite;

public class CompositeMain {
    /**
     * 组合模式: CompositeMain 结构型设计模式
     * 可以把对象组合成树形结构
     * @param args
     */
    public static void main(String[] args) {
        Component root = new Composite("root");/*根*/
        Component branch1 = new Composite("branch1");/*其他节点*/
        Component branch2 = new Composite("branch2");/*其他节点*/
        Component leaf1 = new Composite("leaf1");/*叶子*/
        Component leaf2 = new Composite("leaf2");/*叶子*/
        Component leaf3 = new Composite("leaf3");/*叶子*/
        root.add(branch1);
        root.add(branch2);
        branch1.add(leaf1);
        branch2.add(leaf2);
        branch2.add(leaf3);
        root.display();
    }
}
