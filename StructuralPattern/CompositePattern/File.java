public class File implements FileSystemComponent {
    private String fileName;

    public File (String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("file : " + fileName);
    }
}
