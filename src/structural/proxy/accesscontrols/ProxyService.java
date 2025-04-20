package structural.proxy.accesscontrols;

public class ProxyService implements IContentService {

    private final Role userRole;
    private final IContentService contentService;

    public ProxyService(Role userRole, ContentService contentService) {
        this.userRole = userRole;
        this.contentService = contentService;
    }

    @Override
    public void createPost(String content) {
        if (Role.ADMIN == userRole || Role.EDITOR == userRole) {
            contentService.createPost(content);
        } else {
            System.out.println("ACCESS DENIED: Only admins or editors can create posts");
        }
    }

    @Override
    public void deletePost(String postId) {
        if (Role.ADMIN == userRole) {
            contentService.deletePost(postId);
        } else {
            System.out.println("ACCESS DENIED: Only admins can delete posts");
        }
    }
}
