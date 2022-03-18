package com.ss.android.lark.mail.impl.validator.lexer;

import com.ss.android.lark.mail.impl.validator.base.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.mail.impl.validator.lexer.a */
public class C43897a {

    /* renamed from: a */
    private boolean f111355a;

    /* renamed from: b */
    private String f111356b = "";

    /* renamed from: c */
    private int f111357c;

    /* renamed from: d */
    private Optional<AbstractC43899c> f111358d = Optional.absent();

    /* renamed from: e */
    private final List<AbstractC43899c> f111359e = new ArrayList();

    /* renamed from: e */
    public boolean mo156292e() {
        return this.f111355a;
    }

    /* renamed from: f */
    public String mo156293f() {
        return this.f111356b;
    }

    /* renamed from: a */
    public AbstractC43899c mo156284a() {
        return this.f111358d.or(new C43898b("", ""));
    }

    /* renamed from: g */
    private void m173967g() {
        this.f111356b = "";
        this.f111357c = 0;
        this.f111358d = Optional.absent();
        this.f111359e.clear();
        this.f111355a = false;
    }

    /* renamed from: c */
    public boolean mo156290c() {
        if (this.f111357c >= this.f111359e.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public AbstractC43899c mo156291d() {
        int i;
        int i2 = this.f111357c;
        if (i2 - 1 >= 0) {
            i = i2 - 1;
        } else {
            i = 0;
        }
        return this.f111359e.get(i);
    }

    public String toString() {
        String str = "";
        for (int i = this.f111357c; i < this.f111359e.size(); i++) {
            str = str + this.f111359e.get(i).getText();
        }
        return str;
    }

    /* renamed from: b */
    public void mo156288b() {
        this.f111357c++;
        if (mo156290c()) {
            this.f111357c = this.f111359e.size();
            return;
        }
        this.f111358d = Optional.of(this.f111359e.get(this.f111357c));
        this.f111356b += this.f111359e.get(this.f111357c).getText();
    }

    /* renamed from: c */
    private boolean m173966c(AbstractC43899c cVar) {
        return cVar.getName().equals("INVALID");
    }

    /* renamed from: a */
    public boolean mo156286a(AbstractC43899c cVar) {
        int size = this.f111359e.size();
        int i = this.f111357c;
        if (size <= i + 1) {
            return false;
        }
        return this.f111359e.get(i + 1).equals(cVar);
    }

    /* renamed from: a */
    public boolean mo156287a(List<AbstractC43899c> list) {
        for (AbstractC43899c cVar : list) {
            if (mo156286a(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo156289b(AbstractC43899c cVar) {
        int size = this.f111359e.size();
        int i = this.f111357c;
        if (size <= i + 1) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f111359e.size(); i2++) {
            if (cVar.equals(this.f111359e.get(i2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo156285a(String str) {
        Matcher matcher = Pattern.compile("(([a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~]|[^\\u0000-\\u007F])+[46]?)|([0-9]+)|(\r\n)|(::)|(\\s+?)|(.)|(\\p{Cc}+)", 66).matcher(str);
        m173967g();
        while (matcher.find()) {
            String substring = str.substring(matcher.start(), matcher.end());
            if (m173966c(Tokens.get(substring))) {
                this.f111355a = true;
            }
            this.f111359e.add(Tokens.get(substring));
        }
        if (!this.f111359e.isEmpty()) {
            this.f111358d = Optional.of(this.f111359e.get(this.f111357c));
            this.f111356b += this.f111359e.get(this.f111357c).getText();
        }
    }
}
