package com.ss.android.lark.mail.impl.validator.parser;

import com.ss.android.lark.mail.impl.validator.base.Optional;
import com.ss.android.lark.mail.impl.validator.lexer.C43897a;
import com.ss.android.lark.mail.impl.validator.lexer.Tokens;
import com.ss.android.lark.mail.impl.validator.parser.exception.ExpectedAT;
import com.ss.android.lark.mail.impl.validator.parser.exception.InvalidCharacters;
import com.ss.android.lark.mail.impl.validator.parser.exception.InvalidEmail;
import com.ss.android.lark.mail.impl.validator.parser.exception.NoLocalPart;

/* renamed from: com.ss.android.lark.mail.impl.validator.parser.b */
public class C43902b {

    /* renamed from: a */
    private final C43897a f111365a;

    /* renamed from: b */
    private final C43904d f111366b;

    /* renamed from: c */
    private final C43903c f111367c;

    /* renamed from: d */
    private final C43900a f111368d;

    /* renamed from: c */
    public String mo156303c() {
        return this.f111368d.mo156297a();
    }

    /* renamed from: b */
    public String mo156301b() {
        return mo156304c(this.f111367c.mo156297a());
    }

    /* renamed from: a */
    public String mo156299a() {
        String c = mo156304c(this.f111366b.mo156297a());
        if (c == null) {
            return null;
        }
        return c.trim();
    }

    /* renamed from: d */
    public String mo156305d() {
        return mo156301b() + "@" + mo156303c();
    }

    public C43902b(C43897a aVar) {
        this.f111365a = aVar;
        this.f111366b = new C43904d(aVar);
        this.f111367c = new C43903c(aVar);
        this.f111368d = new C43900a(aVar);
    }

    /* renamed from: b */
    public String mo156302b(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        if (str.endsWith(",") || str.endsWith(";")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: c */
    public String mo156304c(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            return str.substring(1, str.length() - 1);
        }
        if (!str.startsWith("'") || !str.endsWith("'")) {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }

    /* renamed from: a */
    public void mo156300a(String str) throws Throwable {
        Optional fromNullable = Optional.fromNullable(str);
        if (fromNullable.orNull() != null) {
            this.f111365a.mo156285a((String) fromNullable.get());
            if (!this.f111365a.mo156289b(Tokens.AT)) {
                throw new NoLocalPart("No local part found");
            } else if (!this.f111365a.mo156292e()) {
                boolean a = this.f111366b.mo156307a(str);
                boolean z = false;
                if (this.f111365a.mo156284a().equals(Tokens.LOWERTHAN)) {
                    this.f111365a.mo156288b();
                    z = true;
                }
                C43903c cVar = this.f111367c;
                if (!a) {
                    str = this.f111365a.toString();
                }
                cVar.mo156306a(str);
                if (this.f111365a.mo156284a().equals(Tokens.AT)) {
                    this.f111365a.mo156288b();
                    this.f111368d.mo156298a(this.f111365a.toString());
                    if (this.f111365a.mo156284a().equals(Tokens.GREATERTHAN)) {
                        if (z) {
                            this.f111365a.mo156288b();
                            if (!this.f111365a.mo156290c()) {
                                throw new InvalidEmail("> next has word ");
                            }
                            return;
                        }
                        throw new InvalidEmail("miss < ");
                    } else if (z) {
                        throw new InvalidEmail("miss >");
                    }
                } else {
                    throw new ExpectedAT("Missing AT token");
                }
            } else {
                throw new InvalidCharacters("Found invalid or malformed characters");
            }
        } else {
            throw new InvalidEmail("Empty email");
        }
    }
}
