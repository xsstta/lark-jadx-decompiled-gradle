package com.ss.android.lark.live;

import android.view.View;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.larksuite.suite.R;
import com.ss.android.lark.live.VcLiveFloatView;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.minifloatwindow.C46509b;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.live.c */
public class C41506c {

    /* renamed from: a */
    public View.OnClickListener f105522a;

    /* renamed from: b */
    private VcLiveFloatView f105523b;

    /* renamed from: c */
    private final LarkWebView f105524c;

    /* renamed from: d */
    private Runnable f105525d;

    /* renamed from: e */
    private final C46509b f105526e = new C46509b();

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m164729d() {
        Runnable runnable = this.f105525d;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public boolean mo149377a() {
        if (this.f105523b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo149378b() {
        if (this.f105523b != null) {
            C45855f.m181664c("WebFloatWindowManager", "[removeLiveViewFromFloatWindow] removeLiveViewFromFloatWindow");
            this.f105526e.mo163402a();
            this.f105523b.mo149264b(this.f105524c);
        }
    }

    /* renamed from: c */
    private void m164728c() {
        if (this.f105523b == null) {
            VcLiveFloatView vcLiveFloatView = new VcLiveFloatView(C45899c.m181859a().getContextDepend().mo144557a());
            this.f105523b = vcLiveFloatView;
            vcLiveFloatView.setCloseListener(new VcLiveFloatView.AbstractC41472a() {
                /* class com.ss.android.lark.live.$$Lambda$c$nEkP0qNL7ZkqY2guq65FMJfre4 */

                @Override // com.ss.android.lark.live.VcLiveFloatView.AbstractC41472a
                public final void onClose() {
                    C41506c.m270713lambda$nEkP0qNL7ZkqY2guq65FMJfre4(C41506c.this);
                }
            });
            this.f105523b.findViewById(R.id.v_bg_border).setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.live.C41506c.C415082 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (C41506c.this.f105522a != null) {
                        C41506c.this.f105522a.onClick(view);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo149374a(View.OnClickListener onClickListener) {
        this.f105522a = onClickListener;
    }

    /* renamed from: a */
    public void mo149376a(Runnable runnable) {
        this.f105525d = runnable;
    }

    public C41506c(LarkWebView larkWebView) {
        this.f105524c = larkWebView;
    }

    /* renamed from: a */
    public void mo149375a(final C46509b.AbstractC46515a aVar) {
        C45855f.m181664c("WebFloatWindowManager", "[showFloatView] enter");
        if (this.f105524c.getParent() == null) {
            m164728c();
            this.f105523b.mo149263a(this.f105524c);
            this.f105526e.mo163403a(this.f105523b, MiniType.LIVE, false, new C46509b.AbstractC46515a() {
                /* class com.ss.android.lark.live.C41506c.C415071 */

                @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
                /* renamed from: a */
                public /* synthetic */ void mo149313a(boolean z) {
                    C46509b.AbstractC46515a.CC.$default$a(this, z);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
                /* renamed from: a */
                public void mo149312a() {
                    aVar.mo149312a();
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
                public void onCreatedResultCallBack(boolean z) {
                    if (z) {
                        C45855f.m181664c("WebFloatWindowManager", "[showFloatView2] showFloatView success");
                    } else {
                        C45855f.m181664c("WebFloatWindowManager", "[showFloatView2] showFloatView failed");
                    }
                    aVar.onCreatedResultCallBack(z);
                }
            });
            return;
        }
        C45855f.m181664c("WebFloatWindowManager", "[showFloatView3] failed, webview already has a parent");
    }
}
