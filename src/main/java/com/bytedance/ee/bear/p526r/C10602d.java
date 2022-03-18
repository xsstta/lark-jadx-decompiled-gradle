package com.bytedance.ee.bear.p526r;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7835g;
import com.bytedance.ee.bear.p398i.C7836h;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widget.C11768b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.Single;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.r.d */
public class C10602d {

    /* renamed from: a */
    private C10606e f28451a;

    /* renamed from: b */
    private AtEditText f28452b;

    /* renamed from: c */
    private C11768b f28453c;

    /* renamed from: d */
    private AbstractC10460a.AbstractC10461a f28454d;

    /* renamed from: e */
    private int f28455e;

    /* renamed from: f */
    private int f28456f;

    /* renamed from: g */
    private int f28457g;

    /* renamed from: h */
    private int f28458h;

    /* renamed from: i */
    private AbstractC10605a f28459i;

    /* renamed from: j */
    private C68289a f28460j = new C68289a();

    /* renamed from: com.bytedance.ee.bear.r.d$a */
    public interface AbstractC10605a {
        /* renamed from: a */
        boolean mo18361a(String str);
    }

    /* renamed from: a */
    public void mo40068a() {
        this.f28460j.mo237935a();
    }

    /* renamed from: b */
    public void mo40073b(SpannableStringBuilder spannableStringBuilder) {
        this.f28451a.mo40088b(spannableStringBuilder);
    }

    /* renamed from: a */
    public void mo40071a(SpannableStringBuilder spannableStringBuilder) {
        this.f28451a.mo40082a(spannableStringBuilder);
    }

    /* renamed from: b */
    private void m43922b(int i, int i2) {
        m43919a(i, i2);
        this.f28451a.mo40090c(i);
    }

    /* renamed from: a */
    private void m43919a(int i, int i2) {
        if (i2 > 0) {
            HyperLinkSpan[] fVarArr = (HyperLinkSpan[]) this.f28452b.getText().getSpans(i, i2, HyperLinkSpan.class);
            for (HyperLinkSpan fVar : fVarArr) {
                this.f28452b.getText().removeSpan(fVar);
            }
        }
    }

    /* renamed from: a */
    private void m43921a(String str, int i, int i2) {
        m43924b(str, i, i2);
        this.f28451a.mo40083a(new C7838i(i, i2, str));
    }

    /* renamed from: a */
    private String m43918a(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i >= 0 && i <= length && i2 <= length && i <= i2) {
            return String.valueOf(charSequence.subSequence(i, i2));
        }
        C13479a.m54758a("HyperLinkProcessor", "subSequence failed  start " + i + " end " + i2 + " size " + length);
        return "";
    }

    /* renamed from: b */
    private void m43924b(String str, final int i, final int i2) {
        this.f28460j.mo237937a(Single.just(new C7827a(str, new C4517a[0], new C7838i[]{new C7838i(0, str.length(), str)})).map(new C7836h(this.f28452b, this.f28454d)).subscribe(new Consumer<C7835g>() {
            /* class com.bytedance.ee.bear.p526r.C10602d.C106031 */

            /* renamed from: a */
            public void accept(C7835g gVar) throws Exception {
                C10602d.this.mo40070a(i, i2, gVar.f21147a);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.p526r.C10602d.C106042 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("HyperLinkProcessor", "replace failed", th);
            }
        }));
    }

    /* renamed from: a */
    public void mo40069a(int i, int i2, int i3) {
        this.f28451a.mo40080a(i, i3, i2);
    }

    /* renamed from: a */
    public void mo40070a(int i, int i2, CharSequence charSequence) {
        Editable text = this.f28452b.getText();
        if (i < 0 || i > text.length() || i2 > text.length() || i > i2) {
            C13479a.m54758a("HyperLinkProcessor", "replace entire failed");
            return;
        }
        this.f28453c.mo16677b();
        text.replace(i, i2, charSequence);
        this.f28453c.mo16676a();
    }

    public C10602d(AtEditText atEditText, C11768b bVar, AbstractC10460a.AbstractC10461a aVar, AbstractC10605a aVar2) {
        this.f28452b = atEditText;
        this.f28453c = bVar;
        this.f28454d = aVar;
        this.f28451a = new C10606e();
        this.f28459i = aVar2;
    }

    /* renamed from: b */
    private void m43923b(CharSequence charSequence, int i, int i2, int i3) {
        int a = this.f28451a.mo40076a();
        if (a == 0) {
            m43934l(charSequence, i, i2, i3);
        } else if (a == 1) {
            m43926d(charSequence, i, i2, i3);
        } else if (a == 2) {
            m43928f(charSequence, i, i2, i3);
        } else if (a == 3) {
            m43932j(charSequence, i, i2, i3);
        }
    }

    /* renamed from: c */
    private void m43925c(CharSequence charSequence, int i, int i2, int i3) {
        int a = this.f28451a.mo40076a();
        if (a == 0) {
            m43935m(charSequence, i, i2, i3);
        } else if (a == 1) {
            m43927e(charSequence, i, i2, i3);
        } else if (a == 2) {
            m43931i(charSequence, i, i2, i3);
        } else if (a == 3) {
            m43933k(charSequence, i, i2, i3);
        }
    }

    /* renamed from: g */
    private void m43929g(CharSequence charSequence, int i, int i2, int i3) {
        int a = this.f28451a.mo40078a(i, charSequence);
        String a2 = m43918a(charSequence, a, i);
        if (this.f28451a.mo40085a(a2)) {
            m43921a(a2, a, i);
        }
        C13479a.m54772d("HyperLinkProcessor", "left is " + m43918a(charSequence, a, i));
    }

    /* renamed from: h */
    private void m43930h(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = i + i3;
        int b = this.f28451a.mo40087b(i4, charSequence);
        String a = m43918a(charSequence, i4, b);
        if (this.f28451a.mo40085a(a)) {
            m43921a(a, i4, b);
        }
        C13479a.m54772d("HyperLinkProcessor", "right is " + m43918a(charSequence, i4, b));
    }

    /* renamed from: e */
    private void m43927e(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "delete at start " + i + " count " + i3 + " string ");
        this.f28455e = this.f28451a.mo40078a(i, charSequence);
        int b = this.f28451a.mo40087b(i, charSequence);
        this.f28456f = b;
        String a = m43918a(charSequence, this.f28455e, b);
        if (this.f28451a.mo40085a(a)) {
            m43922b(i, this.f28451a.mo40077a(i));
            m43921a(a, this.f28455e, this.f28456f);
            C13479a.m54772d("HyperLinkProcessor", "update input  start " + this.f28455e + " end " + this.f28456f);
        }
    }

    /* renamed from: f */
    private void m43928f(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "input in center ");
        String a = m43918a(charSequence, i, i + i3);
        int d = this.f28451a.mo40092d(i);
        this.f28457g = d;
        this.f28458h = this.f28451a.mo40077a(d);
        if (this.f28451a.mo40084a((CharSequence) a)) {
            if (!this.f28451a.mo40085a(m43918a(charSequence, this.f28457g, this.f28458h))) {
                m43920a(charSequence, i, i2, i3, this.f28457g, this.f28458h);
                return;
            }
            return;
        }
        m43920a(charSequence, i, i2, i3, this.f28457g, this.f28458h);
    }

    /* renamed from: i */
    private void m43931i(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "delete in center ");
        int d = this.f28451a.mo40092d(i);
        this.f28457g = d;
        this.f28458h = this.f28451a.mo40077a(d);
        C13479a.m54764b("HyperLinkProcessor", "delete in center start " + this.f28457g + " end " + this.f28458h);
        if (!this.f28451a.mo40085a(m43918a(charSequence, this.f28457g, this.f28458h))) {
            m43922b(this.f28457g, this.f28458h);
        }
    }

    /* renamed from: j */
    private void m43932j(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "input at end");
        int i4 = i + i3;
        if (this.f28451a.mo40084a((CharSequence) m43918a(charSequence, i, i4))) {
            int b = this.f28451a.mo40086b(i);
            this.f28457g = b;
            this.f28458h = i4;
            String a = m43918a(charSequence, b, i4);
            C13479a.m54772d("HyperLinkProcessor", "inputAtSpanEnd urlString " + a);
            if (this.f28451a.mo40085a(a)) {
                m43919a(this.f28457g, i);
                m43924b(a, this.f28457g, this.f28458h);
                this.f28451a.mo40081a(this.f28457g, i3, this.f28458h, a);
                return;
            }
            m43922b(this.f28457g, i);
        }
    }

    /* renamed from: k */
    private void m43933k(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "delete at end");
        int d = this.f28451a.mo40092d(i);
        this.f28457g = d;
        this.f28458h = i;
        String a = m43918a(charSequence, d, i);
        C13479a.m54772d("HyperLinkProcessor", "deleteAtSpanEnd spanStart " + this.f28457g + " spanEnd " + this.f28458h + " url " + a);
        if (!this.f28451a.mo40085a(a)) {
            m43922b(this.f28457g, this.f28458h);
        }
    }

    /* renamed from: l */
    private void m43934l(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "input in common position");
        if (this.f28451a.mo40084a((CharSequence) m43918a(charSequence, i, i3 + i))) {
            this.f28455e = this.f28451a.mo40078a(i, charSequence);
            int b = this.f28451a.mo40087b(i, charSequence);
            this.f28456f = b;
            String a = m43918a(charSequence, this.f28455e, b);
            C13479a.m54772d("HyperLinkProcessor", "inputAtCommonPosition " + a + " start " + this.f28455e + " end " + this.f28456f);
            if (this.f28451a.mo40085a(a)) {
                m43921a(a, this.f28455e, this.f28456f);
            }
        }
    }

    /* renamed from: m */
    private void m43935m(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "delete in common position");
        this.f28455e = this.f28451a.mo40078a(i, charSequence);
        int b = this.f28451a.mo40087b(i, charSequence);
        this.f28456f = b;
        String a = m43918a(charSequence, this.f28455e, b);
        C13479a.m54772d("HyperLinkProcessor", "update input  start " + this.f28455e + " end " + this.f28456f);
        if (this.f28451a.mo40085a(a)) {
            this.f28451a.mo40090c(i);
            m43921a(a, this.f28455e, this.f28456f);
        }
    }

    /* renamed from: d */
    private void m43926d(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("HyperLinkProcessor", "input at start " + i + " count " + i3);
        int i4 = i + i3;
        if (!this.f28451a.mo40084a((CharSequence) m43918a(charSequence, i, i4))) {
            int i5 = (i3 - i2) + i;
            this.f28457g = i5;
            int a = this.f28451a.mo40077a(i5);
            this.f28458h = a;
            m43919a(i, a);
            String a2 = m43918a(charSequence, this.f28457g, this.f28458h);
            C13479a.m54772d("HyperLinkProcessor", "urlString " + a2 + " span start " + this.f28457g + " span end " + this.f28458h);
            m43924b(a2, this.f28457g, this.f28458h);
            return;
        }
        this.f28457g = i;
        int a3 = this.f28451a.mo40077a(i4);
        this.f28458h = a3;
        String a4 = m43918a(charSequence, this.f28457g, a3);
        C13479a.m54772d("HyperLinkProcessor", "urlString " + a4 + " span start " + this.f28457g + " span end " + this.f28458h);
        if (!this.f28451a.mo40085a(a4)) {
            m43922b(this.f28457g + i3, this.f28458h);
        } else {
            this.f28451a.mo40079a(this.f28458h, this.f28457g);
        }
    }

    /* renamed from: a */
    public void mo40072a(CharSequence charSequence, int i, int i2, int i3) {
        AbstractC10605a aVar;
        C13479a.m54772d("HyperLinkProcessor", "handleInput start " + i + " before " + i2 + " count " + i3);
        if (!this.f28451a.mo40089b(i2, i3) || (aVar = this.f28459i) == null || !aVar.mo18361a(m43918a(charSequence, i, (i3 - i2) + i))) {
            this.f28451a.mo40080a(i, i3, i2);
            this.f28457g = i;
            this.f28458h = i;
            if (this.f28451a.mo40089b(i2, i3)) {
                m43923b(charSequence, i, i2, i3);
            } else if (this.f28451a.mo40091c(i2, i3)) {
                m43925c(charSequence, i, i2, i3);
            }
        } else {
            C13479a.m54764b("HyperLinkProcessor", "is suit url return");
        }
    }

    /* renamed from: a */
    private void m43920a(CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        m43922b(i4, i5);
        m43929g(charSequence, i, i2, i3);
        m43930h(charSequence, i, i2, i3);
    }
}
