package com.bytedance.ee.bear.slide.browse.sidebar;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.slide.browse.navbar.C11376a;

/* renamed from: com.bytedance.ee.bear.slide.browse.sidebar.b */
public class C11381b {

    /* renamed from: a */
    public C11376a f30573a;

    /* renamed from: b */
    public SlideSideBar f30574b;

    /* renamed from: c */
    private AbstractC4931i f30575c;

    /* renamed from: d */
    private C11380a f30576d;

    /* renamed from: e */
    private DocBridgeWebViewV2.AbstractC5605c f30577e;

    /* renamed from: f */
    private View.OnTouchListener f30578f;

    /* renamed from: g */
    private GestureDetector f30579g;

    /* renamed from: c */
    public void mo43558c() {
        C11380a aVar = this.f30576d;
        if (aVar != null) {
            aVar.mo43554a();
        }
    }

    /* renamed from: k */
    private int m47239k() {
        AbstractC4931i iVar = this.f30575c;
        if (iVar == null) {
            return 0;
        }
        return iVar.mo19435b().getHeight();
    }

    /* renamed from: f */
    public void mo43561f() {
        AbstractC4931i iVar = this.f30575c;
        if (iVar != null) {
            iVar.mo19436b(this.f30578f);
        }
    }

    /* renamed from: g */
    public void mo43562g() {
        AbstractC4931i iVar = this.f30575c;
        if (iVar != null) {
            ((DocBridgeWebViewV2) iVar.mo19435b()).mo22339b(this.f30577e);
        }
    }

    /* renamed from: i */
    private void m47237i() {
        this.f30579g = new GestureDetector(this.f30574b.getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.slide.browse.sidebar.C11381b.C113832 */

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!C11381b.this.mo43557b()) {
                    return false;
                }
                C11381b.this.f30574b.mo43541a();
                return false;
            }
        });
    }

    /* renamed from: j */
    private int m47238j() {
        AbstractC4931i iVar = this.f30575c;
        if (iVar == null) {
            return 0;
        }
        return ((DocBridgeWebViewV2) iVar.mo19435b()).computeVerticalScrollRange() - m47239k();
    }

    /* renamed from: b */
    public boolean mo43557b() {
        AbstractC4931i iVar = this.f30575c;
        if (iVar == null) {
            return false;
        }
        if (iVar.mo19435b().canScrollVertically(1) || this.f30575c.mo19435b().canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo43559d() {
        if (this.f30578f == null) {
            this.f30578f = new View.OnTouchListener() {
                /* class com.bytedance.ee.bear.slide.browse.sidebar.$$Lambda$b$B0WYLv4637B1fXj8sRWfdr6mdcE */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C11381b.lambda$B0WYLv4637B1fXj8sRWfdr6mdcE(C11381b.this, view, motionEvent);
                }
            };
        }
        AbstractC4931i iVar = this.f30575c;
        if (iVar != null) {
            iVar.mo19422a(this.f30578f);
        }
    }

    /* renamed from: e */
    public void mo43560e() {
        if (this.f30577e == null) {
            this.f30577e = new DocBridgeWebViewV2.AbstractC5605c() {
                /* class com.bytedance.ee.bear.slide.browse.sidebar.$$Lambda$b$iWcObXnRgjMla04oolU29nFY0EQ */

                @Override // com.bytedance.ee.bear.document.DocBridgeWebViewV2.AbstractC5605c
                public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    C11381b.lambda$iWcObXnRgjMla04oolU29nFY0EQ(C11381b.this, view, i, i2, i3, i4);
                }
            };
        }
        AbstractC4931i iVar = this.f30575c;
        if (iVar != null) {
            ((DocBridgeWebViewV2) iVar.mo19435b()).mo22327a(this.f30577e);
        }
    }

    /* renamed from: h */
    public void mo43563h() {
        mo43561f();
        mo43562g();
        this.f30574b.mo43549d();
        this.f30575c = null;
        this.f30578f = null;
        this.f30577e = null;
        this.f30576d = null;
    }

    /* renamed from: a */
    public void mo43555a() {
        mo43559d();
        mo43560e();
        m47235a(false);
        m47237i();
        this.f30574b.setSlideSideBarListener(new AbstractC11384c() {
            /* class com.bytedance.ee.bear.slide.browse.sidebar.C11381b.C113821 */

            @Override // com.bytedance.ee.bear.slide.browse.sidebar.AbstractC11384c
            /* renamed from: a */
            public void mo43564a() {
                C11381b.this.f30573a.mo43529a(false);
            }

            @Override // com.bytedance.ee.bear.slide.browse.sidebar.AbstractC11384c
            /* renamed from: a */
            public void mo43565a(float f, int i) {
                C11381b.this.mo43556a(true, f, i);
            }

            @Override // com.bytedance.ee.bear.slide.browse.sidebar.AbstractC11384c
            /* renamed from: b */
            public void mo43566b(float f, int i) {
                C11381b.this.mo43556a(false, f, i);
                C11381b.this.mo43558c();
            }
        });
    }

    /* renamed from: a */
    private void m47235a(boolean z) {
        AbstractC4931i iVar = this.f30575c;
        if (iVar != null) {
            iVar.mo19435b().setVerticalScrollBarEnabled(z);
        }
    }

    /* renamed from: a */
    private void m47233a(int i) {
        this.f30574b.mo43546b((((float) i) / ((float) m47238j())) * ((float) this.f30574b.getDragHandleMaxY()));
        this.f30574b.mo43547c();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m47236a(View view, MotionEvent motionEvent) {
        return this.f30579g.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo43556a(boolean z, float f, int i) {
        if (this.f30575c != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isPressed", (Object) Boolean.valueOf(z));
            jSONObject.put("percent", (Object) Float.valueOf(f));
            jSONObject.put("position", (Object) Integer.valueOf(i));
            this.f30575c.mo19428a("window.lark.biz.slide.onScrollBarMove", jSONObject);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47234a(View view, int i, int i2, int i3, int i4) {
        m47233a(i2);
    }

    public C11381b(SlideSideBar slideSideBar, C11376a aVar, AbstractC4931i iVar, DocViewModel docViewModel, AbstractC5233x xVar) {
        this.f30574b = slideSideBar;
        this.f30575c = iVar;
        this.f30576d = new C11380a(docViewModel, xVar);
        this.f30573a = aVar;
        mo43555a();
    }
}
