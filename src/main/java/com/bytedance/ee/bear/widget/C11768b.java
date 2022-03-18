package com.bytedance.ee.bear.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.SuggestionSpan;
import android.widget.TextView;
import com.bytedance.ee.bear.at.AbstractC4246j;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.facade.common.C7707f;
import com.bytedance.ee.bear.p398i.C7832d;
import com.bytedance.ee.bear.p398i.C7833e;
import com.bytedance.ee.bear.p398i.C7834f;
import com.bytedance.ee.bear.p398i.C7835g;
import com.bytedance.ee.bear.p398i.C7836h;
import com.bytedance.ee.bear.p398i.C7839j;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10464d;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.p526r.C10602d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widget.C11766a;
import com.bytedance.ee.bear.widget.C11768b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.widget.b */
public class C11768b extends C7707f<AtEditText> implements AbstractC4246j {

    /* renamed from: a */
    private C11766a f31648a;

    /* renamed from: b */
    protected final Context f31649b;

    /* renamed from: c */
    protected final AtEditText f31650c;

    /* renamed from: d */
    public C10602d f31651d;

    /* renamed from: e */
    private C11773c f31652e;

    /* renamed from: f */
    private final C11772a f31653f = new C11772a();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo45043h() {
        mo45045j().mo45035c();
    }

    /* renamed from: k */
    public void mo45046k() {
        mo45045j().mo45036d();
    }

    /* renamed from: c */
    private C11773c mo18345c() {
        if (this.f31652e == null) {
            this.f31652e = new C11773c(this);
        }
        return this.f31652e;
    }

    /* renamed from: j */
    public C11766a mo45045j() {
        if (this.f31648a == null) {
            this.f31648a = new C11766a();
        }
        return this.f31648a;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4246j
    /* renamed from: a */
    public final void mo16676a() {
        C13479a.m54772d("DocEditTextPresenter", "beginMonitorText: ");
        AtEditText atEditText = (AtEditText) mo30187g();
        if (atEditText != null) {
            atEditText.addTextChangedListener(this.f31653f);
            atEditText.addTextChangedListener(mo18345c());
        }
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4246j
    /* renamed from: b */
    public void mo16677b() {
        C13479a.m54772d("DocEditTextPresenter", "endMonitorText: ");
        AtEditText atEditText = (AtEditText) mo30187g();
        if (atEditText != null) {
            atEditText.removeTextChangedListener(mo18345c());
            atEditText.removeTextChangedListener(this.f31653f);
        }
    }

    /* renamed from: i */
    public Single<String> mo45044i() {
        return Single.just(new C7835g((SpannableStringBuilder) ((AtEditText) mo30187g()).getText())).map(new C7839j()).map(new C7834f()).map(new C7833e());
    }

    /* renamed from: a */
    public void mo45039a(C10602d dVar) {
        this.f31651d = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widget.b$a */
    public class C11772a implements TextWatcher {

        /* renamed from: a */
        boolean f31659a;

        public void afterTextChanged(Editable editable) {
        }

        private C11772a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f31659a = true;
            if (C11768b.this.f31651d != null) {
                C11768b.this.f31651d.mo40073b((SpannableStringBuilder) charSequence);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f31659a) {
                C13479a.m54772d("DocEditTextPresenter", "beforeTextChanged not execute, return!!!");
                return;
            }
            this.f31659a = false;
            C11768b.this.mo45045j().mo45033a(charSequence, i, i2, i3);
            if (C11768b.this.f31651d != null) {
                C11768b.this.f31651d.mo40072a(charSequence, i, i2, i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45040a(C11766a.AbstractC11767a aVar) {
        mo45045j().mo45032a(aVar);
    }

    public C11768b(AtEditText atEditText) {
        super(atEditText);
        this.f31650c = atEditText;
        this.f31649b = atEditText.getContext();
        mo16676a();
    }

    /* renamed from: b */
    public void mo45041b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (mo30187g() == null || (((AtEditText) mo30187g()).getText() != null && TextUtils.equals(((AtEditText) mo30187g()).getText().toString(), str))) {
            C13479a.m54772d("DocEditTextPresenter", "setRichText richtext is same");
        } else {
            AbstractC68307f.m265083a(str).mo238020d(new C7832d()).mo238020d(new C7836h((TextView) mo30187g())).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<C7835g>() {
                /* class com.bytedance.ee.bear.widget.C11768b.C117691 */

                /* renamed from: a */
                public void accept(C7835g gVar) throws Exception {
                    C11768b.this.mo42825a(gVar);
                }
            }, new Consumer<Throwable>() {
                /* class com.bytedance.ee.bear.widget.C11768b.C117702 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C13479a.m54773d("DocEditTextPresenter", "doAccept: set comment error", th);
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo45042b(SpannableStringBuilder spannableStringBuilder) {
        C13479a.m54772d("DocEditTextPresenter", "filterCopiedText: ");
        AbstractC10466g[] gVarArr = (AbstractC10466g[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AbstractC10466g.class);
        if (gVarArr.length == 0) {
            return false;
        }
        for (AbstractC10466g gVar : gVarArr) {
            if (gVar instanceof C10462b) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(gVar), spannableStringBuilder.getSpanEnd(gVar));
            }
            spannableStringBuilder.removeSpan(gVar);
        }
        for (SuggestionSpan suggestionSpan : (SuggestionSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), SuggestionSpan.class)) {
            spannableStringBuilder.removeSpan(suggestionSpan);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45038a(C4517a aVar) {
        Context context = ((AtEditText) mo30187g()).getContext();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((AtEditText) mo30187g()).getText();
        aVar.f13212a = this.f31648a.mo45031a();
        aVar.f13213b = this.f31648a.mo45034b();
        this.f31648a.mo45035c();
        if (aVar.f13212a < 0 || aVar.f13213b < 0) {
            C13479a.m54775e("DocEditTextPresenter", "markAt: at mode is canceled.");
            return;
        }
        mo16677b();
        if (C10599b.m43907c(aVar.f13214c)) {
            spannableStringBuilder.replace(aVar.f13212a, aVar.f13213b, aVar.f13217f);
            aVar.f13213b = aVar.f13212a + aVar.f13217f.length();
        } else {
            int i = aVar.f13212a;
            int i2 = aVar.f13213b;
            spannableStringBuilder.replace(i, i2, "@" + aVar.f13217f);
            aVar.f13213b = aVar.f13212a + aVar.f13217f.length() + 1;
        }
        if (aVar.f13212a < 0 || aVar.f13213b > spannableStringBuilder.length()) {
            C13479a.m54775e("DocEditTextPresenter", "markAt: at start and end is wrong.");
            return;
        }
        C13479a.m54772d("DocEditTextPresenter", "markAt: at.start = " + aVar.f13212a + " | at.end = " + aVar.f13213b);
        if (aVar.f13214c == 0) {
            C13479a.m54772d("DocEditTextPresenter", "markAt: add user span");
            C10468i b = mo42829b(spannableStringBuilder, aVar, context);
            spannableStringBuilder.setSpan(b, aVar.f13212a, aVar.f13213b, b.mo39738o());
        } else if (aVar.f13214c == 6) {
            C13479a.m54772d("DocEditTextPresenter", "markAt: add group span");
            C10464d dVar = new C10464d(context, aVar.f13215d, null);
            spannableStringBuilder.setSpan(dVar, aVar.f13212a, aVar.f13213b, dVar.mo39738o());
        } else if (C10599b.m43907c(aVar.f13214c)) {
            C13479a.m54772d("DocEditTextPresenter", "markAt: add doc span");
            int i3 = aVar.f13212a;
            int i4 = aVar.f13213b;
            spannableStringBuilder.replace(i3, i4, "<doc.at.~#_%=`>" + aVar.f13217f);
            aVar.f13213b = aVar.f13213b + 15;
            C10463c a = mo42824a(spannableStringBuilder, aVar, context);
            C10462b a2 = m48798a(spannableStringBuilder, aVar, C10599b.m43908d(aVar.f13214c));
            spannableStringBuilder.setSpan(a2, aVar.f13212a, aVar.f13212a + 15, a2.mo39738o());
            spannableStringBuilder.setSpan(a, aVar.f13212a, aVar.f13213b, a.mo39738o());
        } else {
            C13479a.m54758a("DocEditTextPresenter", "markAt: unkow at type");
        }
        ((AtEditText) mo30187g()).getEditableText().insert(aVar.f13213b, " ");
        mo16676a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42825a(C7835g gVar) {
        AtEditText atEditText = (AtEditText) mo30187g();
        if (atEditText != null) {
            mo16677b();
            atEditText.setText(gVar.f21147a);
            atEditText.setSelection(gVar.f21147a.length());
            C10602d dVar = this.f31651d;
            if (dVar != null) {
                dVar.mo40071a(gVar.f21147a);
            }
            mo16676a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45037a(int i, int i2) {
        C13479a.m54772d("DocEditTextPresenter", "onSelectionChanged: start = " + i + ", end = " + i2);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((AtEditText) mo30187g()).getText();
        AbstractC10466g[] gVarArr = (AbstractC10466g[]) spannableStringBuilder.getSpans(i, i2, AbstractC10466g.class);
        int i3 = i;
        int i4 = i2;
        for (AbstractC10466g gVar : gVarArr) {
            if (!gVar.mo39745e()) {
                int spanStart = spannableStringBuilder.getSpanStart(gVar);
                int spanEnd = spannableStringBuilder.getSpanEnd(gVar);
                if (!(i == i2 && (spanStart == i || spanEnd == i2))) {
                    i3 = Math.min(spanStart, i3);
                    i4 = Math.max(spanEnd, i4);
                }
            }
        }
        int length = ((AtEditText) mo30187g()).getText().length();
        if (i3 < i4 && i3 >= 0 && i4 <= length) {
            if (i == i2) {
                ((AtEditText) mo30187g()).setSelection(i4);
            } else {
                ((AtEditText) mo30187g()).setSelection(i3, i4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10463c mo42824a(Spannable spannable, C4517a aVar, Context context) {
        return new C10463c(context, aVar.f13215d, aVar.f13214c, aVar.f13216e, aVar.f13224m, aVar.f13223l, aVar.f13222k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10468i mo42829b(Spannable spannable, C4517a aVar, Context context) {
        return new C10468i(context, aVar.f13215d, null, aVar.f13218g, aVar.f13219h, aVar.f13228q);
    }

    /* renamed from: a */
    private C10462b m48798a(final SpannableStringBuilder spannableStringBuilder, final C4517a aVar, int i) {
        if (!C4227b.m17586a().mo16662a() || TextUtils.isEmpty(aVar.f13223l) || TextUtils.isEmpty(aVar.f13222k)) {
            return new C10462b(this.f31649b, i, aVar.f13214c, aVar.f13215d);
        }
        Drawable a = C4227b.m17589b().mo16659b().mo16661a(this.f31649b, aVar.f13223l, aVar.f13222k, i);
        a.setCallback(new Drawable.Callback() {
            /* class com.bytedance.ee.bear.widget.C11768b.C117713 */

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            public void invalidateDrawable(Drawable drawable) {
                C13479a.m54772d("DocEditTextPresenter", "invalidateDrawable");
                C11768b.this.f31650c.post(new Runnable(spannableStringBuilder, aVar) {
                    /* class com.bytedance.ee.bear.widget.$$Lambda$b$3$GiBN_LkrXSgS9ycjh6yPKX4dMHs */
                    public final /* synthetic */ SpannableStringBuilder f$1;
                    public final /* synthetic */ C4517a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C11768b.C117713.this.m48817a(this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m48817a(SpannableStringBuilder spannableStringBuilder, C4517a aVar) {
                C11768b.this.f31650c.setText(spannableStringBuilder);
                C11768b.this.f31650c.setSelection(Math.min(aVar.f13213b, spannableStringBuilder.length()));
            }
        });
        return new C10462b(this.f31649b, a, aVar.f13214c, aVar.f13215d);
    }
}
