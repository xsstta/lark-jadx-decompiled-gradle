package com.ss.android.lark.mail.impl.validator.parser;

import com.ss.android.lark.mail.impl.validator.lexer.C43897a;
import com.ss.android.lark.mail.impl.validator.lexer.Tokens;
import com.ss.android.lark.mail.impl.validator.parser.exception.ATEXTAfterCFWS;
import com.ss.android.lark.mail.impl.validator.parser.exception.ATEXTAfterComment;
import com.ss.android.lark.mail.impl.validator.parser.exception.CRLFAtEnd;
import com.ss.android.lark.mail.impl.validator.parser.exception.CRWithoutLF;
import com.ss.android.lark.mail.impl.validator.parser.exception.ConsecutiveCRLF;
import com.ss.android.lark.mail.impl.validator.parser.exception.ConsecutiveDots;
import com.ss.android.lark.mail.impl.validator.parser.exception.ExpectedCTEXT;
import com.ss.android.lark.mail.impl.validator.parser.exception.InvalidEmail;
import com.ss.android.lark.mail.impl.validator.parser.exception.UnclosedComment;
import com.ss.android.lark.mail.impl.validator.parser.exception.UnclosedDQUOTE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.validator.parser.e */
abstract class AbstractC43905e {

    /* renamed from: a */
    protected List<Warnings> f111377a = new ArrayList();

    /* renamed from: b */
    protected C43897a f111378b;

    /* renamed from: c */
    protected int f111379c = 0;

    /* renamed from: a */
    public String mo156297a() {
        return null;
    }

    /* renamed from: b */
    public List<Warnings> mo156309b() {
        return this.f111377a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo156313d() {
        return this.f111379c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo156317h() {
        return mo156310b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo156318i() throws InvalidEmail {
        mo156311c(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo156315f() throws InvalidEmail {
        if (!this.f111378b.mo156289b(Tokens.CLOSEPARENTHESIS)) {
            throw new UnclosedComment("Unclosed Comment");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo156312c() {
        if (!this.f111378b.mo156291d().equals(Tokens.BACKSLASH) || this.f111378b.mo156284a().equals(Tokens.get("GENERIC"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo156316g() throws InvalidEmail {
        if (this.f111378b.mo156284a().equals(Tokens.DOT) && this.f111378b.mo156286a(Tokens.DOT)) {
            throw new ConsecutiveDots("Consecutive dots");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo156314e() throws InvalidEmail {
        this.f111379c = 1;
        mo156315f();
        this.f111377a.add(Warnings.COMMENT);
        while (!this.f111378b.mo156284a().equals(Tokens.CLOSEPARENTHESIS)) {
            if (this.f111378b.mo156286a(Tokens.OPENPARETHESIS)) {
                this.f111379c++;
            }
            this.f111378b.mo156288b();
        }
        if (this.f111378b.mo156286a(Tokens.get("GENERIC"))) {
            throw new ATEXTAfterComment("");
        } else if (this.f111378b.mo156286a(Tokens.AT)) {
            this.f111377a.add(Warnings.DEPRECATED_CFWS_NEAR_AT);
        }
    }

    public AbstractC43905e(C43897a aVar) {
        this.f111378b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo156310b(boolean z) {
        ArrayList arrayList = new ArrayList(Arrays.asList(Tokens.HTAB, Tokens.CR, Tokens.LF, Tokens.CRLF));
        if (z) {
            arrayList.add(Tokens.SP);
        }
        if (mo156312c() || !arrayList.contains(this.f111378b.mo156284a())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m174006d(boolean z) throws InvalidEmail {
        if (this.f111378b.mo156284a().equals(Tokens.CRLF)) {
            if (this.f111378b.mo156284a().equals(Tokens.CRLF) && this.f111378b.mo156286a(Tokens.CRLF)) {
                throw new ConsecutiveCRLF("Consecutive CRLF");
            } else if (z) {
                if (!this.f111378b.mo156287a(new ArrayList(Arrays.asList(Tokens.SP, Tokens.HTAB)))) {
                    throw new CRLFAtEnd("CRLF at the end");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo156308a(boolean z) throws InvalidEmail {
        if (!this.f111378b.mo156284a().equals(Tokens.DQUOTE) || z) {
            return z;
        }
        if (this.f111378b.mo156286a(Tokens.get("GENERIC"))) {
            this.f111378b.mo156291d().equals(Tokens.get("GENERIC"));
        }
        this.f111377a.add(Warnings.RFC5321_QUOTEDSTRING);
        boolean b = this.f111378b.mo156289b(Tokens.DQUOTE);
        if (b) {
            return b;
        }
        throw new UnclosedDQUOTE("Unclosed DQUOTE");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo156311c(boolean z) throws InvalidEmail {
        m174006d(z);
        if (this.f111378b.mo156284a().equals(Tokens.CR)) {
            throw new CRWithoutLF("Found CR but no LF");
        } else if (this.f111378b.mo156286a(Tokens.get("GENERIC")) && !this.f111378b.mo156291d().equals(Tokens.AT)) {
            throw new ATEXTAfterCFWS("ATEXT found after CFWS");
        } else if (this.f111378b.mo156284a().equals(Tokens.LF) || this.f111378b.mo156284a().equals(Tokens.NUL)) {
            throw new ExpectedCTEXT("Expecting CTEXT");
        } else if (this.f111378b.mo156286a(Tokens.AT) || this.f111378b.mo156291d().equals(Tokens.AT)) {
            this.f111377a.add(Warnings.DEPRECATED_CFWS_NEAR_AT);
        } else {
            this.f111377a.add(Warnings.CFWS_FWS);
        }
    }
}
