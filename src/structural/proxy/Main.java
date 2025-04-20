package structural.proxy;

public class Main {
    public static void main(String[] args) {
        IContentService guest = new ProxyService(Role.GUEST, new ContentService());
        IContentService editor = new ProxyService(Role.EDITOR, new ContentService());
        IContentService admin = new ProxyService(Role.ADMIN, new ContentService());

        guest.createPost("Guest Post");    // ❌ Denied
        editor.createPost("Editor Post");  // ✅ Allowed
        admin.createPost("Admin Post");    // ✅ Allowed

        editor.deletePost("101");          // ❌ Denied
        admin.deletePost("101");           // ✅ Allowed

    }
}
