package com.bytedance.ee.bear.bitable.card.view.cell.text;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7835g;
import com.bytedance.ee.bear.p398i.C7836h;
import com.bytedance.ee.bear.p398i.C7839j;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widget.C11768b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.text.a */
public class C4678a extends C11768b implements AtEditText.AbstractC11758b {

    /* renamed from: a */
    protected AbstractC10460a.AbstractC10461a f13810a;

    /* renamed from: e */
    private AbstractC4712d f13811e;

    /* renamed from: f */
    private boolean f13812f = true;

    /* renamed from: g */
    private SpannableStringBuilder f13813g = new SpannableStringBuilder();

    /* renamed from: h */
    private SpannableStringBuilder f13814h = new SpannableStringBuilder();

    /* renamed from: i */
    private Disposable f13815i;

    /* renamed from: d */
    public SpannableStringBuilder mo18346d() {
        return this.f13813g;
    }

    /* renamed from: e */
    public SpannableStringBuilder mo18347e() {
        return this.f13814h;
    }

    /* renamed from: l */
    private int m19409l() {
        Editable text;
        AtEditText atEditText = (AtEditText) mo30187g();
        if (atEditText == null || (text = atEditText.getText()) == null) {
            return 0;
        }
        return Math.abs(Selection.getSelectionEnd(text) - Selection.getSelectionStart(text));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo18348f() {
        Disposable disposable = this.f13815i;
        if (disposable != null) {
            disposable.dispose();
        }
        if (this.f31651d != null) {
            this.f31651d.mo40068a();
        }
    }

    /* renamed from: c */
    public Single<C7827a> mo18345c() {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((AtEditText) mo30187g()).getText();
        this.f13814h = spannableStringBuilder;
        return Single.just(new C7835g(spannableStringBuilder)).map(new C7839j());
    }

    /* renamed from: a */
    public void mo18339a(AbstractC4712d dVar) {
        this.f13811e = dVar;
    }

    /* renamed from: a */
    public void mo18341a(AbstractC10460a.AbstractC10461a aVar) {
        this.f13810a = aVar;
    }

    public C4678a(AtEditText atEditText) {
        super(atEditText);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m19408a(Object obj) throws Exception {
        if (((AtEditText) mo30187g()) != null) {
            return true;
        }
        C13479a.m54758a("BitableAtEditTextPres", "setRichText, owner is null!");
        return false;
    }

    /* renamed from: a */
    public void mo18338a(SpannableStringBuilder spannableStringBuilder) {
        mo16677b();
        this.f13813g.clear();
        this.f13813g.append((CharSequence) spannableStringBuilder);
        mo16676a();
    }

    /* renamed from: b */
    public void mo18344b(C7827a aVar) {
        AbstractC68307f.m265083a(aVar.clone()).mo238020d(new C7836h((TextView) mo30187g(), this.f13810a)).mo237998a((AbstractC68322n) new AbstractC68322n<C7835g>() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a.C46835 */

            /* renamed from: a */
            public boolean test(C7835g gVar) throws Exception {
                AtEditText atEditText = (AtEditText) C4678a.this.mo30187g();
                if (atEditText == null) {
                    C13479a.m54758a("BitableAtEditTextPres", "setRichText, owner is null!");
                    return false;
                } else if (!TextUtils.equals(gVar.f21147a, atEditText.getText())) {
                    return true;
                } else {
                    C13479a.m54775e("BitableAtEditTextPres", "setRichText, content unchanged");
                    return false;
                }
            }
        }).mo238001b(new Consumer<C7835g>() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a.C46813 */

            /* renamed from: a */
            public void accept(C7835g gVar) throws Exception {
                C4678a.this.mo16677b();
                ((AtEditText) C4678a.this.mo30187g()).setText(gVar.f21147a);
                C4678a.this.mo16676a();
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a.C46824 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("BitableAtEditTextPres", "setRichText fail", th);
            }
        });
    }

    /* renamed from: a */
    public void mo18340a(C7827a aVar) {
        AbstractC68307f.m265083a(aVar).mo238020d(new C7836h((TextView) mo30187g(), this.f13810a)).mo237998a((AbstractC68322n) new AbstractC68322n() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.$$Lambda$a$FQ79_LNVLkom8xvG22uCyrPq8Tw */

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return C4678a.this.m19408a(obj);
            }
        }).mo238001b(new Consumer<C7835g>() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a.C46791 */

            /* renamed from: a */
            public void accept(C7835g gVar) throws Exception {
                C4678a.this.mo18338a(gVar.f21147a);
                C4678a.this.mo16677b();
                ((AtEditText) C4678a.this.mo30187g()).setText(gVar.f21147a);
                ((AtEditText) C4678a.this.mo30187g()).setSelection(gVar.f21147a.length());
                if (C4678a.this.f31651d != null) {
                    C4678a.this.f31651d.mo40071a(gVar.f21147a);
                }
                C4678a.this.mo16676a();
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a.C46802 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("BitableAtEditTextPres", "setRichText fail", th);
            }
        });
    }

    @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11758b
    /* renamed from: a */
    public boolean mo18343a(final String str) {
        if (this.f13811e == null) {
            C13479a.m54758a("BitableAtEditTextPres", "paste failed, delegate is null");
            return false;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            NetService netService = (NetService) KoinJavaComponent.m268610a(NetService.class);
            if (C6313i.m25327a().mo25392c(str)) {
                BearUrl g = C6313i.m25327a().mo25399g(str);
                NetService.C5077f fVar = new NetService.C5077f("api/meta/");
                fVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(C8275a.m34051b(g.f17446a)));
                fVar.mo20145a("token", g.f17447b);
                NetService.AbstractC5075d a = netService.mo20118a(MentionTitleResult.class);
                final int l = m19409l();
                this.f13815i = a.mo20141a(fVar).mo238020d(new C4688d(this.f31649b, g)).mo238020d(new C7836h((TextView) mo30187g(), this.f13810a)).mo238001b(new Consumer<C7835g>() {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a.C46846 */

                    /* renamed from: a */
                    public void accept(C7835g gVar) throws Exception {
                        C4678a.this.mo18342a(str, gVar.f21147a, l);
                    }
                }, new Consumer<Throwable>() {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a.C46857 */

                    /* renamed from: a */
                    public void accept(Throwable th) throws Exception {
                        C13479a.m54759a("BitableAtEditTextPres", "onPaste，error: ", th);
                    }
                });
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo18342a(String str, CharSequence charSequence, int i) {
        Editable text = this.f31650c.getText();
        int indexOf = text.toString().indexOf(str);
        mo16677b();
        text.replace(indexOf, str.length() + indexOf, charSequence);
        if (this.f31651d != null) {
            this.f31651d.mo40069a(indexOf, 0, charSequence.length() - i);
        }
        mo16676a();
    }
}
