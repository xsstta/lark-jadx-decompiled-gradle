package org.apache.commons.net.imap;

public enum IMAPCommand {
    CAPABILITY(0),
    NOOP(0),
    LOGOUT(0),
    STARTTLS(0),
    AUTHENTICATE(1),
    LOGIN(2),
    XOAUTH(1),
    SELECT(1),
    EXAMINE(1),
    CREATE(1),
    DELETE(1),
    RENAME(2),
    SUBSCRIBE(1),
    UNSUBSCRIBE(1),
    LIST(2),
    LSUB(2),
    STATUS(2),
    APPEND(2, 4),
    CHECK(0),
    CLOSE(0),
    EXPUNGE(0),
    SEARCH(1, Integer.MAX_VALUE),
    FETCH(2),
    STORE(3),
    COPY(2),
    UID(2, Integer.MAX_VALUE);
    
    private final String imapCommand;
    private final int maxParamCount;
    private final int minParamCount;

    public String getIMAPCommand() {
        String str = this.imapCommand;
        if (str != null) {
            return str;
        }
        return name();
    }

    public static final String getCommand(IMAPCommand iMAPCommand) {
        return iMAPCommand.getIMAPCommand();
    }

    private IMAPCommand() {
        this((String) null);
    }

    private IMAPCommand(int i) {
        this(null, i, i);
    }

    private IMAPCommand(String str) {
        this(str, 0);
    }

    private IMAPCommand(int i, int i2) {
        this(null, i, i2);
    }

    private IMAPCommand(String str, int i) {
        this(str, i, i);
    }

    private IMAPCommand(String str, int i, int i2) {
        this.imapCommand = str;
        this.minParamCount = i;
        this.maxParamCount = i2;
    }
}
