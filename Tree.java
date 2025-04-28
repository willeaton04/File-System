package Project;

import java.util.ArrayList;
import java.util.List;


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
    getTreeHelper(root, sb, 0);
    return sb.toString();
  }

  private void getTreeHelper(TreeNode<T> node, StringBuilder sb, int level) {
    for(int i = 0; i < level; i++) {
      sb.append("--");
    }

    sb.append(node.data).append("\n");

    for (TreeNode<T> child : node.children) {
      getTreeHelper(child, sb, level + 1);
    }
  }


}