class Main {
    public static void main(String[] args) {
        UserDB userDB = new UserDB();
        EmailSender emailSender = new EmailSender();

        User user = userDB.getUserInfo(123);
        emailSender.sendEmail(user, "Hello!");
    }
}