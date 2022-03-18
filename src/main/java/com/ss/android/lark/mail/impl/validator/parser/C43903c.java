package com.ss.android.lark.mail.impl.validator.parser;

import com.ss.android.lark.mail.impl.validator.lexer.C43897a;
import com.ss.android.lark.mail.impl.validator.lexer.Tokens;
import com.ss.android.lark.mail.impl.validator.parser.exception.DotAtEnd;
import com.ss.android.lark.mail.impl.validator.parser.exception.DotAtStart;
import com.ss.android.lark.mail.impl.validator.parser.exception.ExpectedAT;
import com.ss.android.lark.mail.impl.validator.parser.exception.ExpectedATEXT;
import com.ss.android.lark.mail.impl.validator.parser.exception.InvalidEmail;
import com.ss.android.lark.mail.impl.validator.parser.exception.UnclosedComment;
import java.util.ArrayList;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.validator.parser.c */
public final class C43903c extends AbstractC43905e {

    /* renamed from: f */
    private static int f111369f = 64;

    /* renamed from: d */
    private boolean f111370d;

    /* renamed from: e */
    private boolean f111371e = true;

    /* renamed from: g */
    private String f111372g;

    @Override // com.ss.android.lark.mail.impl.validator.parser.AbstractC43905e
    /* renamed from: a */
    public String mo156297a() {
        return this.f111372g;
    }

    /* renamed from: j */
    private void m173997j() {
        if (this.f111378b.mo156293f().length() > f111369f) {
            this.f111377a.add(Warnings.RFC5321_LOCALPART_TOO_LONG);
        }
    }

    /* renamed from: k */
    private boolean m173998k() throws InvalidEmail {
        boolean z = true;
        ArrayList arrayList = new ArrayList(Arrays.asList(Tokens.CR, Tokens.HTAB, Tokens.LF, Tokens.NUL));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(Tokens.CR, Tokens.HTAB, Tokens.LF));
        boolean z2 = true;
        while (!this.f111378b.mo156284a().equals(Tokens.DQUOTE) && !this.f111378b.mo156290c()) {
            if (arrayList2.contains(this.f111378b.mo156284a()) && z2) {
                this.f111377a.add(Warnings.CFWS_FWS);
                z2 = false;
            }
            if (mo156312c() || !arrayList.contains(this.f111378b.mo156284a())) {
                this.f111378b.mo156288b();
                z = false;
            } else {
                throw new ExpectedATEXT("Invalid token without escaping");
            }
        }
        if (this.f111378b.mo156291d().equals(Tokens.BACKSLASH)) {
            mo156308a(false);
        } else if (!this.f111378b.mo156286a(Tokens.AT)) {
            throw new ExpectedAT("Expected AT after quoted part");
        }
        return z;
    }

    C43903c(C43897a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    private void m173996d(boolean z) throws InvalidEmail {
        if (new ArrayList(Arrays.asList(Tokens.COMMA, Tokens.CLOSEBRACKET, Tokens.OPENBRACKET, Tokens.GREATERTHAN, Tokens.LOWERTHAN, Tokens.COLON, Tokens.SEMICOLON)).contains(this.f111378b.mo156284a()) && !z) {
            throw new ExpectedATEXT(String.format("Found %s, expeted ATEXT", this.f111378b.mo156284a().getName()));
        }
    }

    /* renamed from: a */
    public boolean mo156306a(String str) throws InvalidEmail {
        String str2;
        this.f111378b.mo156285a(str);
        if (!this.f111378b.mo156284a().equals(Tokens.DOT)) {
            int i = 0;
            while (!this.f111378b.mo156284a().equals(Tokens.AT) && !this.f111378b.mo156290c()) {
                boolean a = mo156308a(this.f111370d);
                this.f111370d = a;
                if (a && this.f111371e) {
                    this.f111378b.mo156288b();
                    this.f111371e = m173998k();
                }
                if (this.f111378b.mo156284a().equals(Tokens.OPENPARETHESIS)) {
                    mo156314e();
                    i += mo156313d();
                }
                if (this.f111378b.mo156284a().equals(Tokens.CLOSEPARENTHESIS)) {
                    if (i != 0) {
                        i--;
                    } else {
                        throw new UnclosedComment("Missing closing parenthesis");
                    }
                }
                mo156316g();
                m173996d(this.f111370d);
                if (mo156317h()) {
                    mo156318i();
                }
                if (!this.f111378b.mo156291d().equals(Tokens.BACKSLASH) || mo156312c()) {
                    this.f111372g = this.f111378b.mo156293f();
                    this.f111378b.mo156288b();
                } else {
                    throw new ExpectedATEXT("Found BACKSLASH");
                }
            }
            if (!this.f111378b.mo156291d().equals(Tokens.DOT)) {
                if (this.f111377a.contains(Warnings.CFWS_FWS) && (str2 = this.f111372g) != null) {
                    String trim = str2.trim();
                    if ((!trim.startsWith(Tokens.DQUOTE.getText()) || !trim.endsWith(Tokens.DQUOTE.getText())) && (!trim.startsWith(Tokens.SINGLEDQUOTE.getText()) || !trim.endsWith(Tokens.SINGLEDQUOTE.getText()))) {
                        throw new ExpectedATEXT("Folding White Space but not quote");
                    }
                }
                m173997j();
                return false;
            }
            throw new DotAtEnd("Dot at the end of localpart");
        }
        throw new DotAtStart("Found DOT at start");
    }
}
