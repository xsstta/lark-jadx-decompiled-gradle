package com.bytedance.ee.bear.bitable.card.view.cell;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.performance.EditRecordPerformanceTracker;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e;
import com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.b */
public abstract class AbstractC4597b<V, E> extends RecyclerView.ViewHolder implements AbstractC4609e<V, E>, AbstractC10549e {

    /* renamed from: a */
    protected C4533g f13584a;

    /* renamed from: b */
    protected boolean f13585b;

    /* renamed from: c */
    public boolean f13586c;

    /* renamed from: d */
    protected boolean f13587d;

    /* renamed from: e */
    public AbstractC4712d f13588e;

    /* renamed from: f */
    protected AbstractC10550f f13589f;

    /* renamed from: g */
    private final String f13590g = "BaseCellViewHolder";

    /* renamed from: h */
    private AbstractC4609e.AbstractC4610a f13591h;

    /* renamed from: i */
    private View f13592i;

    /* renamed from: j */
    private final Runnable f13593j = new Runnable() {
        /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$EuYfcjl5mRfHNi8mWaz0PYWjnk8 */

        public final void run() {
            AbstractC4597b.this.mo17996h();
        }
    };

    /* renamed from: k */
    private RunnableC4599a f13594k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo17991a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo18115d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo18119j() {
        return false;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: k */
    public void mo18016k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17995a(boolean z, EFieldUneditableReason eFieldUneditableReason) {
        this.f13585b = z;
        if (this.f13586c && !z) {
            mo17997i();
        }
        View a = mo17991a();
        if (a != null) {
            a.setFocusable(z);
            a.setClickable(z);
            if (z) {
                mo18113b();
            }
            a.setBackgroundResource(z ? R.drawable.bitable_card_field_item_bg_selector : R.drawable.bitable_card_uneditable_field_item_bg);
            mo18112a(z && !this.f13587d);
            if (!z) {
                mo18108a(eFieldUneditableReason);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18112a(boolean z) {
        View a = mo17991a();
        if (a != null) {
            if (mo18116e()) {
                z = false;
                a.setBackgroundResource(R.drawable.bitable_card_uneditable_field_item_bg);
                a.setOnClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$b$0CUV_bM62fBcw6IUWhBnWJecqQ */

                    public final void onClick(View view) {
                        AbstractC4597b.this.m19083a((AbstractC4597b) view);
                    }
                });
            }
            if (a instanceof EditText) {
                ((EditText) a).setCursorVisible(z);
            }
            a.setFocusableInTouchMode(z);
        }
    }

    /* renamed from: a */
    public void mo18110a(Object obj) {
        AbstractC4609e.AbstractC4610a aVar = this.f13591h;
        if (aVar != null) {
            aVar.mo17899a(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18111a(Object obj, String str) {
        AbstractC4609e.AbstractC4610a aVar = this.f13591h;
        if (aVar != null) {
            aVar.mo17900a(obj, str);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: c */
    public void mo18114c() {
        if (this.f13586c) {
            mo17997i();
        }
    }

    /* renamed from: f */
    public void mo18117f() {
        AbstractC10550f fVar = this.f13589f;
        if (fVar != null) {
            fVar.mo39924a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo17996h() {
        mo18017l();
        this.f13586c = true;
    }

    /* renamed from: n */
    private void mo18256n() {
        RunnableC4599a aVar = this.f13594k;
        if (aVar != null) {
            C13742g.m55710c(aVar);
            this.f13594k = null;
        }
    }

    /* renamed from: g */
    public void mo18118g() {
        AbstractC10550f fVar = this.f13589f;
        if (fVar != null) {
            fVar.mo39928b(this);
        }
        mo18256n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo17997i() {
        this.f13586c = false;
        View a = mo17991a();
        if (a != null) {
            a.clearFocus();
        }
    }

    /* renamed from: l */
    private void mo18017l() {
        mo18255m();
        if (mo17991a() != null) {
            mo17991a().setHovered(false);
        }
    }

    /* renamed from: o */
    private void m19092o() {
        if (this.f13592i == null) {
            this.f13592i = this.f13588e.mo17875h().findViewById(R.id.multi_text_tool_bar_layout);
        }
        View view = this.f13592i;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m19093p() {
        EditRecordPerformanceTracker.f13261a.mo17434a().mo17433d(System.currentTimeMillis());
        EditRecordPerformanceTracker.f13261a.mo17434a().mo17427a(this.f13588e.mo17877j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo18116e() {
        C4533g gVar = this.f13584a;
        if (gVar == null || gVar.mo17752i() == null) {
            return false;
        }
        return this.f13584a.mo17752i().isReferenceType();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.b$1 */
    public static /* synthetic */ class C45981 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13595a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason[] r0 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b.C45981.f13595a = r0
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason.SUITE_NO_EDIT_PERM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b.C45981.f13595a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason.FIELD_NOT_SUPPORT_EDIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b.C45981.f13595a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason.LANDSCAPE_READONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b.C45981.f13595a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason.ATTACHMENT_FORBIDDEN_IN_PRO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b.C45981.f13595a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason.OTHERS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b.C45981.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.b$a */
    public static class RunnableC4599a implements Runnable {

        /* renamed from: a */
        private WeakReference<View> f13596a;

        public void run() {
            if (this.f13596a.get() != null && this.f13596a.get().isActivated()) {
                this.f13596a.get().setActivated(false);
            }
        }

        public RunnableC4599a(View view) {
            this.f13596a = new WeakReference<>(view);
        }
    }

    /* renamed from: m */
    private void mo18255m() {
        TextView textView = (TextView) this.itemView.findViewById(R.id.cell_error_msg);
        if (textView != null && (this.itemView instanceof ViewGroup)) {
            ((ViewGroup) this.itemView).removeView(textView);
        }
        this.f13584a.mo17746c(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18113b() {
        View a = mo17991a();
        if (a != null) {
            a.setOnFocusChangeListener(new View.OnFocusChangeListener(a) {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$b$WFdTzt001Hql4gtKwPpbBg3m1s8 */
                public final /* synthetic */ View f$1;

                {
                    this.f$1 = r2;
                }

                public final void onFocusChange(View view, boolean z) {
                    AbstractC4597b.this.m19084a(this.f$1, view, z);
                }
            });
            a.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$b$AGeUFVtYybmbx8JGGoVIA7y7yGo */

                public final void onClick(View view) {
                    AbstractC4597b.this.m19087b((AbstractC4597b) view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19083a(View view) {
        this.f13588e.mo17860a();
    }

    /* renamed from: a */
    private void m19081a(long j) {
        RunnableC4599a aVar = new RunnableC4599a(mo17991a());
        this.f13594k = aVar;
        C13742g.m55706a(aVar, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19087b(View view) {
        if (this.f13587d) {
            if (this.f13588e != null && !mo18119j()) {
                this.f13588e.mo17870c();
            }
        } else if (this.f13585b && !this.f13586c) {
            mo17996h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18108a(EFieldUneditableReason eFieldUneditableReason) {
        View a = mo17991a();
        if (eFieldUneditableReason != null && a != null && this.f13588e != null) {
            a.setOnClickListener(new View.OnClickListener(eFieldUneditableReason) {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$b$riXMBJJAJy0KePUlKaRbxLgWG6c */
                public final /* synthetic */ EFieldUneditableReason f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC4597b.this.m19085a((AbstractC4597b) this.f$1, (EFieldUneditableReason) view);
                }
            });
        }
    }

    /* renamed from: b */
    private void m19088b(C4537a<V> aVar) {
        boolean z;
        int d = aVar.mo17836d();
        if (d != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m19086a(aVar, d);
        } else {
            mo18017l();
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: b */
    public void mo18015b(boolean z) {
        boolean z2;
        if (!C13653a.m55399c(this.itemView.getContext())) {
            if (this.f13587d != z && z && this.f13586c) {
                mo17997i();
            }
            this.f13587d = z;
            if (!this.f13585b || z) {
                z2 = false;
            } else {
                z2 = true;
            }
            mo18112a(z2);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<V> aVar) {
        if (aVar != null) {
            this.f13584a = aVar.mo17829a();
            mo17995a(aVar.mo17837e(), aVar.mo17839f());
            if (mo17991a() != null) {
                m19088b(aVar);
                mo17991a().post(new Runnable() {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$b$rC8T18RN_PGL8o0RkNvIREJ0WU */

                    public final void run() {
                        AbstractC4597b.this.m19093p();
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo18109a(AbstractC4609e.AbstractC4610a aVar) {
        this.f13591h = aVar;
    }

    public AbstractC4597b(View view, AbstractC4712d dVar) {
        super(view);
        this.f13588e = dVar;
        Context context = view.getContext();
        if (context instanceof Activity) {
            this.f13589f = AbstractC10550f.AbstractC10551a.m43717b((Activity) context);
        }
    }

    /* renamed from: a */
    private void m19082a(Context context, String str) {
        if (this.itemView instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) this.itemView;
            if (((TextView) linearLayout.findViewById(R.id.cell_error_msg)) == null && !TextUtils.isEmpty(str)) {
                TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.bitable_cell_error_msg, (ViewGroup) null);
                textView.setText(str);
                textView.setId(R.id.cell_error_msg);
                linearLayout.addView(textView);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19085a(EFieldUneditableReason eFieldUneditableReason, View view) {
        int i = C45981.f13595a[eFieldUneditableReason.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.f13588e.mo17870c();
            } else if (i == 4) {
                this.f13588e.mo17872e();
            } else if (i == 5) {
                this.f13588e.mo17871d();
            }
        } else if (mo18115d()) {
            this.f13588e.mo17866b();
        } else {
            this.f13588e.mo17860a();
        }
    }

    /* renamed from: a */
    private void m19086a(C4537a<V> aVar, int i) {
        View a = mo17991a();
        if (i == 1) {
            mo18256n();
            mo18255m();
            a.setHovered(false);
            a.setActivated(true);
            m19081a(3000);
            aVar.mo17831a(0);
        } else if (i == 2) {
            a.setHovered(true);
            a.setActivated(false);
            m19082a(a.getContext(), aVar.mo17829a().mo17754k());
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        View a = mo17991a();
        if (a != null && !(this instanceof C4689e) && !this.f13586c && a.hasFocus() && i == 0) {
            C13742g.m55710c(this.f13593j);
            C13742g.m55706a(this.f13593j, 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19084a(View view, View view2, boolean z) {
        if (!z) {
            mo17997i();
        } else if ((this instanceof C4689e) || this.f13589f.mo39934h() == 0) {
            mo17996h();
        } else {
            C10548d.m43696a(view.getContext());
            m19092o();
        }
    }
}
