package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String foldeName;
    private List<FileSystemComponent> contents = new ArrayList<>();

    public Folder(String folderName) {
        this.foldeName = folderName;
    }

    public void add(FileSystemComponent component) {
        contents.add(component);
    }

    public void remove(FileSystemComponent component) {
        contents.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Folder : " + foldeName);
        for (FileSystemComponent component : contents) {
            component.display();
        }
    }

}
