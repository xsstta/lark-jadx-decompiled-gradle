package com.ss.android.lark.mail.impl.validator.lexer;

import java.util.HashMap;
import java.util.regex.Pattern;

public enum Tokens implements AbstractC43899c {
    OPENPARETHESIS("OPENPARETHESIS", "("),
    CLOSEPARENTHESIS("CLOSEPARENTHESIS", ")"),
    LOWERTHAN("LOWERTHAN", "<"),
    GREATERTHAN("GREATERTHAN", ">"),
    OPENBRACKET("OPENBRACKET", "["),
    CLOSEBRACKET("CLOSEBRACKET", "]"),
    COLON("COLON", ":"),
    SEMICOLON("SEMICOLON", ";"),
    AT("AT", "@"),
    BACKSLASH("BACKSLASH", "\\"),
    SLASH("SLASH", "/"),
    COMMA("COMMA", ","),
    DOT("DOT", "."),
    DQUOTE("DQUOTE", "\""),
    SINGLEDQUOTE("SINGLEDQUOTE", "'"),
    HYPHEN("HYPHEN", "-"),
    DOUBLECOLON("DOUBLECOLON", "::"),
    SP("SP", " "),
    HTAB("HTAB", "\t"),
    CR("CR", "\r"),
    LF("LF", "\n"),
    CRLF("CRLF", "\r\n"),
    IPV6TAG("IPV6TAG", "IPv6"),
    OPENQBRACKET("OPENQBRACKET", "{"),
    CLOSEQBRACKET("CLOSEQBRACKET", "}"),
    NUL("NUL", "\u0000");
    
    private static final Pattern invalidUTF8 = Pattern.compile("\\p{Cc}+", 66);
    private static final HashMap<String, AbstractC43899c> tokensMap = new HashMap<>();
    private final String name;
    private final String text;

    @Override // com.ss.android.lark.mail.impl.validator.lexer.AbstractC43899c
    public String getName() {
        return this.name;
    }

    @Override // com.ss.android.lark.mail.impl.validator.lexer.AbstractC43899c
    public String getText() {
        return this.text;
    }

    static {
        Tokens[] values = values();
        for (Tokens tokens : values) {
            tokensMap.put(tokens.text, tokens);
        }
    }

    private static boolean isUTF8Invalid(String str) {
        return invalidUTF8.matcher(str).find();
    }

    public boolean equals(AbstractC43899c cVar) {
        if (!this.name.equals(cVar.getName()) || !this.text.equals(cVar.getText())) {
            return false;
        }
        return true;
    }

    public static AbstractC43899c get(String str) {
        AbstractC43899c cVar = tokensMap.get(str);
        if (cVar != null) {
            return cVar;
        }
        if (isUTF8Invalid(str)) {
            return new C43898b("INVALID", str);
        }
        return new C43898b("GENERIC", str);
    }

    private Tokens(String str, String str2) {
        this.name = str;
        this.text = str2;
    }
}
