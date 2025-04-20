package structural.proxy;

public class ContentService implements IContentService {

    @Override
    public void createPost(String content) {
        System.out.println("Post created: " + content);
    }

    @Override
    public void deletePost(String postId) {
        System.out.println("Post deleted: " + postId);
    }
}
