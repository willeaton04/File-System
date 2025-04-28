package Project;

public class File {
  private String path;
  private String name;

  public File(String path, String name) {
    this.path = path;
    this.name = name;
  }
  public String getPath() {
    return path;
  }
  public String getName() {
    return name;
  }
}