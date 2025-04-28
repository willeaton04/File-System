
public class FileSystem {

  private Tree<File> root;

  public FileSystem() {
    root = new Tree<File>(null);
  }

  public FileSystem(Tree<File> root) {
    this.root = root;
  }

  public String display() {
    return root.postOrderTraversal()
  }
}