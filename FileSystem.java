package Project;

import java.util.stream.Stream;

public class FileSystem {

  private Tree<File> root;

  public FileSystem() {
    root = new Tree<File>(null);
  }

  public FileSystem(Tree<File> root) {
    this.root = root;
  }

  public String display() {
    return "";
    // TODO
  }

  public String createFile(String fileName) {
    return "";
    //TODO
  }

  public String createFile(String fileName, Stream<String> data) {return "";}
  public void deleteFile(String fileName) {}




}