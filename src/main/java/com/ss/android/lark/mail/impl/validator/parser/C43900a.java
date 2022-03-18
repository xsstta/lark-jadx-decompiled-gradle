package com.ss.android.lark.mail.impl.validator.parser;

import com.ss.android.lark.mail.impl.validator.lexer.AbstractC43899c;
import com.ss.android.lark.mail.impl.validator.lexer.C43897a;
import com.ss.android.lark.mail.impl.validator.lexer.C43898b;
import com.ss.android.lark.mail.impl.validator.lexer.Tokens;
import com.ss.android.lark.mail.impl.validator.p2224a.C43862a;
import com.ss.android.lark.mail.impl.validator.parser.exception.CRLFAtEnd;
import com.ss.android.lark.mail.impl.validator.parser.exception.ConsecutiveAT;
import com.ss.android.lark.mail.impl.validator.parser.exception.ConsecutiveGeneric;
import com.ss.android.lark.mail.impl.validator.parser.exception.DomainHyphen;
import com.ss.android.lark.mail.impl.validator.parser.exception.DomainNotAllowedCharacter;
import com.ss.android.lark.mail.impl.validator.parser.exception.DotAtEnd;
import com.ss.android.lark.mail.impl.validator.parser.exception.DotAtStart;
import com.ss.android.lark.mail.impl.validator.parser.exception.ExpectedATEXT;
import com.ss.android.lark.mail.impl.validator.parser.exception.InvalidEmail;
import com.ss.android.lark.mail.impl.validator.parser.exception.UnclosedDomainLiteral;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.validator.parser.a */
public final class C43900a extends AbstractC43905e {

    /* renamed from: d */
    private static final Pattern f111362d = Pattern.compile("[^a-zA-Z0-9\\-\\x00007F-\\u10FFFF]");

    /* renamed from: e */
    private String f111363e;

    /* renamed from: f */
    private final HashSet<AbstractC43899c> f111364f = new HashSet<AbstractC43899c>(2) {
        /* class com.ss.android.lark.mail.impl.validator.parser.C43900a.C439011 */

        {
            add(Tokens.BACKSLASH);
            add(Tokens.SLASH);
        }
    };

    @Override // com.ss.android.lark.mail.impl.validator.parser.AbstractC43905e
    /* renamed from: a */
    public String mo156297a() {
        return this.f111363e;
    }

    /* renamed from: k */
    private void m173983k() {
        if (this.f111378b.mo156284a().equals(Tokens.DOT) && this.f111378b.mo156291d().equals(Tokens.get("GENERIC")) && this.f111378b.mo156291d().getText().length() > 63) {
            this.f111377a.add(Warnings.RFC1035_LABEL_TOO_LONG);
        }
    }

    /* renamed from: n */
    private boolean m173986n() {
        if (this.f111378b.mo156284a().equals(new C43898b("INVALID", "")) || this.f111378b.mo156284a().equals(Tokens.LF)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m173982j() throws com.ss.android.lark.mail.impl.validator.parser.exception.InvalidEmail {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.validator.parser.C43900a.m173982j():void");
    }

    /* renamed from: l */
    private void m173984l() throws InvalidEmail {
        if (this.f111378b.mo156284a().equals(Tokens.COMMA)) {
            throw new DomainNotAllowedCharacter(String.format("%s is not allowed in domain part", this.f111378b.mo156284a().getName()));
        } else if (this.f111378b.mo156284a().equals(Tokens.AT)) {
            throw new ConsecutiveAT("Consecuitive AT found");
        } else if (this.f111378b.mo156284a().equals(Tokens.OPENBRACKET) && !this.f111378b.mo156291d().equals(Tokens.AT)) {
            throw new ExpectedATEXT("Found OPENBRACKET");
        } else if (this.f111378b.mo156284a().equals(Tokens.HYPHEN) && this.f111378b.mo156286a(Tokens.DOT)) {
            throw new DomainHyphen("Hypen found near dot");
        } else if (this.f111378b.mo156284a().equals(Tokens.BACKSLASH) && this.f111378b.mo156286a(Tokens.get("GENERIC"))) {
            throw new ExpectedATEXT("Found BACKSLASH");
        } else if (this.f111378b.mo156284a().equals(Tokens.get("GENERIC")) && this.f111378b.mo156286a(Tokens.get("GENERIC"))) {
            this.f111378b.mo156288b();
            throw new ConsecutiveGeneric("Found " + this.f111378b.mo156284a().getText());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m173985m() throws com.ss.android.lark.mail.impl.validator.parser.exception.InvalidEmail {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.validator.parser.C43900a.m173985m():void");
    }

    C43900a(C43897a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private void m173978a(AbstractC43899c cVar) throws DomainNotAllowedCharacter, DomainHyphen {
        if (!this.f111364f.contains(cVar)) {
            m173979b(cVar);
        } else {
            throw new DomainNotAllowedCharacter(String.format("%s is not allowed in domain part", cVar.getName()));
        }
    }

    /* renamed from: d */
    private boolean m173981d(boolean z) throws UnclosedDomainLiteral {
        if (!this.f111378b.mo156284a().equals(Tokens.CLOSEBRACKET) || z) {
            return this.f111378b.mo156284a().equals(Tokens.OPENBRACKET);
        }
        throw new UnclosedDomainLiteral("Missing open bracket [");
    }

    /* renamed from: b */
    private void m173979b(AbstractC43899c cVar) throws DomainHyphen, DomainNotAllowedCharacter {
        if ("GENERIC".equals(cVar.getName())) {
            String text = cVar.getText();
            if (text.charAt(0) == '-') {
                throw new DomainHyphen("Sub-domains cannot start with hyphen");
            } else if (text.charAt(Math.max(0, text.length() - 1)) != '-') {
                Matcher matcher = f111362d.matcher(text);
                if (matcher.find()) {
                    try {
                        if (!C43862a.m173870b(text)) {
                            throw new DomainNotAllowedCharacter(matcher.group());
                        }
                    } catch (Exception unused) {
                        throw new DomainNotAllowedCharacter(matcher.group());
                    }
                }
            } else {
                throw new DomainHyphen("Sub-domains cannot end with hyphen");
            }
        }
    }

    /* renamed from: b */
    private void m173980b(String str) {
        Pattern compile = Pattern.compile(":[0-9A-Fa-f]{4}");
        Pattern compile2 = Pattern.compile("[^0-9A-Fa-f:]");
        Pattern compile3 = Pattern.compile(".+::.+");
        Pattern compile4 = Pattern.compile("(^::)|(.*::$)");
        int i = 0;
        str.substring(0, 6);
        String substring = str.substring(5, str.length());
        while (compile.matcher(substring).find()) {
            i++;
        }
        if (!mo156309b().contains(Warnings.RFC5322_IPV6_START_WITH_COLON)) {
            if (compile2.matcher(substring).find()) {
                this.f111377a.add(Warnings.RFC5322_IPV6_BAD_CHAR);
                i++;
            }
            if (this.f111378b.mo156284a().equals(Tokens.COLON)) {
                this.f111377a.add(Warnings.RFC5322_IPV6_END_WITH_COLON);
            } else if (compile3.matcher(substring).find()) {
                this.f111377a.add(Warnings.RFC5322_IPV6_DOUBLE_COLON);
            } else {
                boolean find = compile4.matcher(substring).find();
                if (find) {
                    i++;
                }
                if (i != 8) {
                    this.f111377a.add(Warnings.RFC5322_IPV6_GROUP_COUNT);
                }
                if (i > 8) {
                    this.f111377a.add(Warnings.RFC5322_IPV6_MAX_GROUPS);
                } else if (i == 8 && find) {
                    this.f111377a.add(Warnings.RFC5321_IPV6_DEPRECATED);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo156298a(String str) throws InvalidEmail {
        this.f111378b.mo156285a(str);
        if (this.f111378b.mo156284a().equals(Tokens.DOT)) {
            throw new DotAtStart("Dot at the beggining of the domain part");
        } else if (!str.contains(Tokens.DOT.getText()) && !str.contains(Tokens.OPENBRACKET.getText())) {
            throw new DomainHyphen("Dot not found");
        } else if (!this.f111378b.mo156284a().equals(Tokens.HYPHEN)) {
            m173982j();
            if (this.f111378b.mo156291d().equals(Tokens.DOT)) {
                throw new DotAtEnd("");
            } else if (this.f111378b.mo156291d().equals(Tokens.SP)) {
                throw new CRLFAtEnd("");
            } else if (this.f111378b.mo156293f().length() <= 255) {
                return false;
            } else {
                this.f111377a.add(Warnings.RFC5321_DOMAIN_TOO_LONG);
                return false;
            }
        } else {
            throw new DomainHyphen("Found -  in domain part");
        }
    }
}
