package com.bytedance.ee.bear.bitable.card.view.cell.text;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.at.C4233d;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.document.at.C5664d;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.p526r.C10602d;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.text.e */
public class C4689e extends AbstractC4597b<C7827a, C7827a> implements AbstractC4607d, AbstractC4686b, AbstractC10460a.AbstractC10461a, AbstractC10549e {

    /* renamed from: g */
    protected AtEditText f13828g;

    /* renamed from: h */
    protected C4678a f13829h;

    /* renamed from: i */
    public AbstractC4712d f13830i;

    /* renamed from: j */
    public View f13831j;

    /* renamed from: k */
    public int f13832k;

    /* renamed from: l */
    public AbstractC4548e f13833l;

    /* renamed from: m */
    public int f13834m;

    /* renamed from: n */
    public Map<String, String> f13835n;

    /* renamed from: o */
    public C7827a f13836o;

    /* renamed from: p */
    private boolean f13837p = true;

    /* renamed from: q */
    private ViewStub f13838q;

    /* renamed from: r */
    private View f13839r;

    /* renamed from: s */
    private View f13840s;

    /* renamed from: t */
    private TextView f13841t;

    /* renamed from: u */
    private Context f13842u;

    /* renamed from: v */
    private Disposable f13843v;

    /* renamed from: w */
    private boolean f13844w;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: j */
    public boolean mo18119j() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13828g;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        m19433d(false);
    }

    /* renamed from: l */
    private void mo18017l() {
        this.f13828g.addTextChangedListener(new TextWatcher() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e.C46934 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                int lineCount = C4689e.this.f13828g.getLineCount();
                if (!(lineCount == C4689e.this.f13834m || C4689e.this.f13833l == null)) {
                    C4689e.this.f13833l.mo17908a(C4689e.this.f13828g, C4689e.this);
                }
                C4689e.this.f13834m = lineCount;
            }
        });
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: g */
    public void mo18118g() {
        super.mo18118g();
        this.f13829h.mo18348f();
    }

    /* renamed from: m */
    private void m19436m() {
        ViewStub viewStub = this.f13838q;
        if (viewStub != null && viewStub.getParent() != null) {
            View inflate = this.f13838q.inflate();
            this.f13839r = inflate;
            if (inflate == null) {
                C13479a.m54758a("TextCellViewHolder", "inflate multi text tool bar view stub failed");
            }
        }
    }

    /* renamed from: n */
    private void m19437n() {
        this.f13839r = this.f13830i.mo17875h().findViewById(R.id.multi_text_tool_bar_layout);
        this.f13841t = (TextView) this.f13830i.mo17875h().findViewById(R.id.st_text_edit_complete);
        this.f13840s = this.f13830i.mo17875h().findViewById(R.id.st_text_edit_toolbar);
        this.f13831j = this.f13830i.mo17875h().findViewById(R.id.toolbar_divider);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        AbstractC4548e eVar;
        super.mo17996h();
        this.f13836o = null;
        this.f13844w = false;
        this.f13834m = this.f13828g.getLineCount();
        if (!(this.f13589f.mo39934h() == 0 || (eVar = this.f13833l) == null)) {
            eVar.mo17908a(this.f13828g, this);
        }
        TextView textView = this.f13841t;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.text.$$Lambda$e$kzhlnJvo4ANSnhRY6kgISliMSRQ */

                public final void onClick(View view) {
                    C4689e.this.m19432a((C4689e) view);
                }
            });
        }
        m19438o();
    }

    /* renamed from: o */
    private void m19438o() {
        DocumentInfo k = this.f13830i.mo17878k();
        if (k != null && this.f13828g.getAtWindow() == null) {
            C5664d.m22980a();
            this.f13828g.mo44988a(new C4233d(this.f13830i.mo17873f(), C4227b.m17586a().mo16664c(), C10599b.m43898a(C8275a.m34052b(k.getType())), k.getObjToken(), "fx_bar", "text").mo16652a((int) (((double) C13749l.m55748b()) * 0.15d)).mo16653a(this.f13840s).mo16654a(C4227b.m17586a().mo16663b()));
            this.f13828g.getAtWindow().mo16629a(new AbstractC4230c.AbstractC4232b() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e.C46945 */

                @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
                /* renamed from: a */
                public void mo16651a(boolean z) {
                    int i = 0;
                    if (!z) {
                        C4689e.this.f13832k = 0;
                    }
                    View view = C4689e.this.f13831j;
                    if (!z) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }

                @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
                /* renamed from: a */
                public void mo16650a(int i, int i2) {
                    C4689e.this.f13832k = i2;
                    if (C4689e.this.f13833l != null) {
                        C4689e.this.f13833l.mo17908a(C4689e.this.f13828g, C4689e.this);
                    }
                }
            });
            this.f13828g.getAtWindow().mo16640a(new AbstractC4230c.AbstractC4231a() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e.C46956 */

                @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
                /* renamed from: a */
                public void mo16648a(String str) {
                }

                @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
                /* renamed from: b */
                public void mo16649b(String str) {
                }

                @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
                /* renamed from: a */
                public void mo16647a(C4517a aVar, boolean z) {
                    C4689e.this.f13828g.mo44989a(aVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public /* synthetic */ void m19432a(View view) {
        m19433d(true);
        m19434e(false);
        C10548d.m43696a(this.f13842u);
    }

    /* renamed from: e */
    private void m19434e(boolean z) {
        int i;
        View view = this.f13839r;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: d */
    private void m19433d(boolean z) {
        super.mo17997i();
        AbstractC4548e eVar = this.f13833l;
        if (eVar != null) {
            eVar.mo17910b(this.f13828g, this);
        }
        mo18360c(z);
        this.f13828g.m48738p();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.text.AbstractC4686b
    /* renamed from: a */
    public void mo18356a(TextView textView) {
        if (textView.isFocusableInTouchMode()) {
            C10548d.m43702b(this.f13842u);
        }
        if (this.f13587d) {
            this.f13830i.mo17870c();
        }
    }

    /* renamed from: c */
    public void mo18360c(final boolean z) {
        if (!this.f13844w) {
            this.f13844w = true;
            this.f13843v = this.f13829h.mo18345c().subscribe(new Consumer<C7827a>() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e.C46912 */

                /* renamed from: a */
                public void accept(C7827a aVar) throws Exception {
                    SpannableStringBuilder d = C4689e.this.f13829h.mo18346d();
                    SpannableStringBuilder e = C4689e.this.f13829h.mo18347e();
                    if (!TextUtils.equals(d, e)) {
                        C4689e.this.mo18110a(aVar);
                        C4689e.this.f13829h.mo18338a(e);
                    } else if (C4689e.this.f13836o != null) {
                        C4689e.this.f13829h.mo18340a(C4689e.this.f13836o);
                    }
                    C4689e.this.f13835n.clear();
                    C4689e.this.f13835n.put("click_done_btn", String.valueOf(z));
                    C4689e.this.f13830i.mo17864a("text", C4689e.this.f13835n);
                }
            }, new Consumer<Throwable>() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e.C46923 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C13479a.m54759a("TextCellViewHolder", "sync text failed ", th);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d
    /* renamed from: a */
    public int mo17990a(Context context) {
        if (this.f13586c) {
            return this.f13589f.mo39934h() + this.f13832k + context.getResources().getDimensionPixelSize(R.dimen.bitable_multi_text_toolbar_height) + C13746i.m55721a((Activity) this.f13830i.mo17873f());
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<C7827a> aVar) {
        C7827a aVar2;
        C7827a aVar3;
        super.mo17993a((C4537a) aVar);
        if (this.f13586c) {
            if (aVar.mo17835c() != null) {
                aVar3 = aVar.mo17835c();
            } else {
                aVar3 = new C7827a();
            }
            this.f13836o = aVar3;
            return;
        }
        C4678a aVar4 = this.f13829h;
        if (aVar.mo17835c() != null) {
            aVar2 = aVar.mo17835c();
        } else {
            aVar2 = new C7827a();
        }
        aVar4.mo18340a(aVar2);
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10460a.AbstractC10461a
    /* renamed from: a */
    public void mo18121a(AbstractC10460a aVar) {
        if (!this.f13837p) {
            C13479a.m54775e("TextCellViewHolder", "onSpanClick, disable span click");
        }
        AbstractC4712d dVar = this.f13830i;
        if (dVar != null) {
            if (aVar instanceof C10463c) {
                dVar.mo17869b(((C10463c) aVar).mo39749g());
            } else if (aVar instanceof HyperLinkSpan) {
                dVar.mo17869b(((HyperLinkSpan) aVar).mo39763g());
            } else if (aVar instanceof C10468i) {
                dVar.mo17863a(((C10468i) aVar).mo39767g());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo17995a(boolean z, EFieldUneditableReason eFieldUneditableReason) {
        super.mo17995a(z, eFieldUneditableReason);
        if (z) {
            this.f13838q = (ViewStub) this.f13830i.mo17875h().findViewById(R.id.st_multi_text_toolbar_view_stub);
            m19436m();
            m19437n();
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        if (i > 0 && this.f13586c) {
            AbstractC4548e eVar = this.f13833l;
            if (eVar != null) {
                eVar.mo17908a(this.f13828g, this);
            }
            m19434e(true);
        }
        if (this.f13586c && i == 0) {
            mo18114c();
        }
    }

    public C4689e(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar);
        this.f13830i = dVar;
        this.f13833l = eVar;
        this.f13835n = new HashMap();
        this.f13842u = view.getContext();
        AtEditText atEditText = (AtEditText) view.findViewById(R.id.cell_edit_text);
        this.f13828g = atEditText;
        atEditText.setLinkTextColor(this.f13842u.getResources().getColor(R.color.primary_pri_500));
        C4687c cVar = new C4687c();
        this.f13828g.setMovementMethod(cVar);
        cVar.mo18357a(this);
        this.f13828g.mo44991a(true, (AbstractC10460a.AbstractC10461a) this, (C10602d.AbstractC10605a) new C10602d.AbstractC10605a() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e.C46901 */

            @Override // com.bytedance.ee.bear.p526r.C10602d.AbstractC10605a
            /* renamed from: a */
            public boolean mo18361a(String str) {
                return C6313i.m25327a().mo25392c(str);
            }
        });
        C4678a aVar = (C4678a) this.f13828g.getPresenter();
        this.f13829h = aVar;
        aVar.mo18339a(dVar);
        this.f13829h.mo18341a((AbstractC10460a.AbstractC10461a) this);
        this.f13828g.setOnPasteListener(this.f13829h);
        C10548d.m43699a((EditText) this.f13828g);
        mo18017l();
    }
}
