import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Tree<T> {
  public TreeNode<T> root;

  public Tree(T rootData) {
    this.root = new TreeNode<T>(rootData);
  }

  private class TreeNode<T> {
    public T data;
    public List<TreeNode<T>> children;

    public TreeNode(T data) {
      this.data = data;
      this.children = new ArrayList<>();
    }

    public TreeNode<T> addChild(T data) {
      TreeNode<T> childNode = new TreeNode<T>(data);
      this.children.add(childNode);
      return childNode;
    }
  }

  public String getTree() {
    StringBuilder sb = new StringBuilder();
    Stack<TreeNode<T>> files = new Stack<>();
    files.add(root);
    sb.append(files.peek().toString() + "]\n");
  }


}