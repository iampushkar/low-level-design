package structural.composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------- File System Structure ----------------");

        File file1 = new File("Image.jpg");
        File file2 = new File("Doc1.txt");
        File file3 = new File("Doc2.txt");

        Folder folder1 = new Folder("Personal Project");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Project");
        folder2.add(file3);
        folder2.add(folder1);
        

        folder2.display();
    }
}