package com.bytedance.ee.bear.p398i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7836h;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10464d;
import com.bytedance.ee.bear.p519p.C10465e;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.i.h */
public class C7836h<T extends C7827a> implements Function<T, C7835g> {

    /* renamed from: a */
    protected Context f21148a;

    /* renamed from: b */
    protected AbstractC10460a.AbstractC10461a f21149b;

    /* renamed from: c */
    public TextView f21150c;

    /* renamed from: d */
    private String f21151d;

    /* renamed from: a */
    public boolean mo30619a(int i, int i2, int i3) {
        return i3 >= i2 && i2 <= i && i3 <= i && i2 >= 0 && i3 >= 0;
    }

    public C7836h(TextView textView) {
        this(textView, "", null);
    }

    /* renamed from: a */
    public C7835g apply(T t) throws Exception {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t.f21134a);
        C4517a[] aVarArr = t.f21135b;
        C10599b.m43902a(String.valueOf(16));
        C10599b.m43902a(String.valueOf(22));
        for (int i = 0; i < aVarArr.length; i++) {
            C4517a aVar = aVarArr[i];
            if (aVar.f13214c == 0) {
                C13479a.m54772d("FormatFun", "apply: set user span");
                C10468i a = mo30618a(t, aVar);
                if (!TextUtils.isEmpty(this.f21151d) && !TextUtils.isEmpty(aVar.f13215d) && TextUtils.equals(this.f21151d, aVar.f13215d)) {
                    C10465e eVar = new C10465e(this.f21148a);
                    spannableStringBuilder.setSpan(eVar, aVar.f13212a, aVar.f13212a + aVar.f13217f.length(), eVar.mo39738o());
                }
                spannableStringBuilder.setSpan(a, aVar.f13212a, aVar.f13212a + aVar.f13217f.length(), a.mo39738o());
            } else if (aVar.f13214c == 6) {
                C13479a.m54772d("FormatFun", "apply: set user span");
                C10464d dVar = new C10464d(this.f21148a, aVar.f13215d, null);
                spannableStringBuilder.setSpan(dVar, aVar.f13212a, aVar.f13212a + aVar.f13217f.length(), dVar.mo39738o());
            } else if (C10599b.m43907c(aVar.f13214c)) {
                C13479a.m54772d("FormatFun", "apply: set doc span type = " + aVar.f13214c);
                spannableStringBuilder.replace(aVar.f13212a, aVar.f13213b, (CharSequence) ("<doc.at.~#_%=`>" + aVar.f13217f));
                aVar.f13213b = aVar.f13213b + 15;
                C10463c b = mo30620b(t, aVar);
                C10462b a2 = m31373a(spannableStringBuilder, aVar, C10599b.m43908d(aVar.f13214c));
                spannableStringBuilder.setSpan(a2, aVar.f13212a, aVar.f13212a + 15, a2.mo39738o());
                spannableStringBuilder.setSpan(b, aVar.f13212a, aVar.f13213b, b.mo39738o());
                for (int i2 = i + 1; i2 < aVarArr.length; i2++) {
                    aVarArr[i2].f13212a += 15;
                    aVarArr[i2].f13213b += 15;
                }
                for (int i3 = 0; i3 < t.f21136c.length; i3++) {
                    C7838i iVar = t.f21136c[i3];
                    if (iVar.f21154a > aVar.f13212a) {
                        iVar.f21154a += 15;
                        iVar.f21155b += 15;
                    }
                }
            } else {
                HyperLinkSpan fVar = new HyperLinkSpan(this.f21148a, aVar.f13216e, this.f21149b);
                spannableStringBuilder.setSpan(fVar, aVar.f13212a, aVar.f13212a + aVar.f13217f.length(), fVar.mo39738o());
            }
        }
        C10599b.m43901a();
        for (int i4 = 0; i4 < t.f21136c.length; i4++) {
            C7838i iVar2 = t.f21136c[i4];
            HyperLinkSpan a3 = mo30617a(t, iVar2);
            spannableStringBuilder.setSpan(a3, iVar2.f21154a, iVar2.f21155b, a3.mo39738o());
        }
        return new C7835g(spannableStringBuilder);
    }

    public C7836h(TextView textView, AbstractC10460a.AbstractC10461a aVar) {
        this(textView, "", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HyperLinkSpan mo30617a(T t, C7838i iVar) {
        return new HyperLinkSpan(this.f21148a, iVar.f21157d, this.f21149b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10468i mo30618a(T t, C4517a aVar) {
        return new C10468i(this.f21148a, aVar.f13215d, null, aVar.f13218g, aVar.f13219h, aVar.f13225n, aVar.f13226o, aVar.f13228q, this.f21149b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10463c mo30620b(T t, C4517a aVar) {
        return new C10463c(this.f21148a, aVar.f13215d, aVar.f13214c, aVar.f13216e, aVar.f13224m, aVar.f13223l, aVar.f13222k, this.f21149b);
    }

    public C7836h(TextView textView, String str, AbstractC10460a.AbstractC10461a aVar) {
        this.f21150c = textView;
        this.f21148a = textView.getContext();
        this.f21151d = str;
        this.f21149b = aVar;
    }

    /* renamed from: a */
    private C10462b m31373a(final SpannableStringBuilder spannableStringBuilder, C4517a aVar, int i) {
        if (!C4227b.m17586a().mo16662a() || TextUtils.isEmpty(aVar.f13223l) || TextUtils.isEmpty(aVar.f13222k)) {
            return new C10462b(this.f21148a, i, aVar.f13214c, aVar.f13215d);
        }
        Drawable a = C4227b.m17589b().mo16659b().mo16661a(this.f21148a, aVar.f13223l, aVar.f13222k, i);
        a.setCallback(new Drawable.Callback() {
            /* class com.bytedance.ee.bear.p398i.C7836h.C78371 */

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            public void invalidateDrawable(Drawable drawable) {
                C13479a.m54772d("FormatFun", "invalidateDrawable");
                C13742g.m55711d(new Runnable(spannableStringBuilder) {
                    /* class com.bytedance.ee.bear.p398i.$$Lambda$h$1$sf1qSwdN0RaQoZwQBNaSKkWk6is */
                    public final /* synthetic */ SpannableStringBuilder f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7836h.C78371.this.m31379a(this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m31379a(SpannableStringBuilder spannableStringBuilder) {
                int selectionStart = C7836h.this.f21150c.getSelectionStart();
                int selectionEnd = C7836h.this.f21150c.getSelectionEnd();
                C7836h.this.f21150c.setText(spannableStringBuilder);
                if ((C7836h.this.f21150c instanceof EditText) && C7836h.this.mo30619a(spannableStringBuilder.length(), selectionStart, selectionEnd)) {
                    ((EditText) C7836h.this.f21150c).setSelection(selectionStart, selectionEnd);
                }
            }
        });
        return new C10462b(this.f21148a, a, aVar.f13214c, aVar.f13215d);
    }
}
