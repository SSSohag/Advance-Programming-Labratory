public class EmailSender {
    public void sendEmail(User user, String message) {
        // Code to send an email
        System.out.println("Email sent to " + user.getName() + " at " + user.getEmail() + ": " + message);
    }
}