package structural.facade;

public class KYCService {
    public boolean verifyUser(String userId) {
        System.out.println("Verifying user KYC for ID: " + userId);
        return true; // Dummy logic
    }
}
