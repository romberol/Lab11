package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String generate() {
        return mailCode.generate(client);
    }
}
