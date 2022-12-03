package strategy;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "Hello, %NAME. You're the chosen one!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
