package com.bytedance.ee.bear.sheet.inputbar.subpanel;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.subpanel.c */
public class C11238c extends AbstractC11233a implements C11239d.AbstractC11241a {

    /* renamed from: c */
    private SheetNumKeyboardView f30241c;

    /* renamed from: d */
    private C11239d f30242d;

    /* renamed from: e */
    private C11088a f30243e;

    /* renamed from: f */
    private boolean f30244f;

    /* renamed from: g */
    private AbstractC1178x<Editable> f30245g;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.AbstractC11233a
    /* renamed from: a */
    public int mo43069a() {
        return R.layout.sheet_num_keyboard_fragment;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.AbstractC11241a
    /* renamed from: s */
    public void mo43093s() {
        this.f30244f = true;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.AbstractC11241a
    /* renamed from: o */
    public void mo43089o() {
        this.f30243e.mo42294o();
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.AbstractC11241a
    /* renamed from: p */
    public void mo43090p() {
        this.f30243e.mo42296q();
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.AbstractC11241a
    /* renamed from: q */
    public void mo43091q() {
        this.f30243e.mo42295p();
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.AbstractC11241a
    /* renamed from: r */
    public void mo43092r() {
        this.f30243e.mo42293n();
    }

    /* renamed from: i */
    public void mo43085i() {
        SheetNumKeyboardView sheetNumKeyboardView = (SheetNumKeyboardView) getView().findViewById(R.id.keyboard_view);
        this.f30241c = sheetNumKeyboardView;
        sheetNumKeyboardView.setGray(mo43078h());
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.AbstractC11241a
    /* renamed from: k */
    public void mo43087k() {
        Editable b = mo43072b().mo5927b();
        if (!mo43078h() && b != null) {
            mo43070a(b).subscribe(new Consumer() {
                /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$c$GsRWKhA07eLY655FhtUKEZVCvpc */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11238c.lambda$GsRWKhA07eLY655FhtUKEZVCvpc(C11238c.this, (List) obj);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.AbstractC11241a
    /* renamed from: l */
    public void mo43088l() {
        Editable b = mo43072b().mo5927b();
        if (!mo43078h() && b != null) {
            mo43070a(b).subscribe(new Consumer() {
                /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$c$IEDtOED_wGqfSHuA66yOQssHefk */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11238c.lambda$IEDtOED_wGqfSHuA66yOQssHefk(C11238c.this, (List) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f30244f) {
            this.f30243e.mo42273c(mo43078h());
        }
        mo43072b().mo5928b(this.f30245g);
    }

    /* renamed from: j */
    public void mo43086j() {
        this.f30245g = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$c$PjEnVrEG9ydnvijHAj_xKYPfA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11238c.m269948lambda$PjEnVrEG9ydnvijHAj_xKYPfA(C11238c.this, (Editable) obj);
            }
        };
        mo43072b().mo5923a(this, this.f30245g);
        mo43073c().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$c$MTdk15S_DndtW0w9_HmEV7Zfw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11238c.m269947lambda$MTdk15S_DndtW0w9_HmEV7Zfw(C11238c.this, (Boolean) obj);
            }
        });
        mo43074d().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$c$vF8kJ7fArRpJuNctB0oCzoA6GFs */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11238c.lambda$vF8kJ7fArRpJuNctB0oCzoA6GFs(C11238c.this, (String) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46750a(Boolean bool) {
        this.f30241c.setGray(mo43078h());
        this.f30241c.invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46753b(Editable editable) {
        if (editable != null) {
            C11239d dVar = new C11239d(this.f30241c, editable);
            this.f30242d = dVar;
            dVar.mo43095a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46751a(String str) {
        if (!str.equals("number") && this.f30244f) {
            this.f30243e.mo42273c(mo43078h());
            this.f30244f = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46754b(List list) throws Exception {
        mo43071a(4, list, mo43074d().mo5927b(), "");
        this.f30243e.mo42292m();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.inputbar.subpanel.AbstractC11233a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30243e = new C11088a();
        this.f30243e.mo42260a(((DocViewModel) C4950k.m20474a(this, DocViewModel.class)).getBearUrl());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46752a(List list) throws Exception {
        mo43071a(1, list, mo43074d().mo5927b(), "");
        this.f30243e.mo42291l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo43085i();
        mo43086j();
    }
}
