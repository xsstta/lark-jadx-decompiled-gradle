package com.ss.android.vc.meeting.module.tab;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.AbstractC60885b;
import com.ss.android.vc.meeting.module.tab.history.view.VideoChatNavigationTabView;
import com.ss.android.vc.meeting.module.tab.history.view.VideoChatTabView;
import com.ss.android.vc.meeting.module.tab.p3168a.C63219b;
import com.ss.android.vc.meeting.module.tab3.list.mvp.VideoChatMainTabFragment3;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b;
import com.ss.android.vc.statistics.event.ce;

/* renamed from: com.ss.android.vc.meeting.module.tab.b */
public class C63228b implements AbstractC44552i, AbstractC60885b {

    /* renamed from: a */
    public Context f159413a;

    /* renamed from: b */
    public VideoChatTabView f159414b;

    /* renamed from: c */
    public VideoChatNavigationTabView f159415c;

    /* renamed from: d */
    public VideoChatMainTabFragment3 f159416d;

    /* renamed from: e */
    public volatile Runnable f159417e;

    /* renamed from: f */
    private AbstractC44548e f159418f;

    /* renamed from: g */
    private ITitleController f159419g;

    /* renamed from: h */
    private AbstractC44552i.AbstractC44553a f159420h = new AbstractC44552i.AbstractC44553a() {
        /* class com.ss.android.vc.meeting.module.tab.C63228b.C632291 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean equals = TextUtils.equals("videochat", str);
            boolean equals2 = TextUtils.equals("videochat", str2);
            if (C63228b.this.f159416d != null) {
                C63228b.this.f159416d.mo219319a(str2);
            }
            if (equals2) {
                ce.m250264a(C63219b.m247574a().mo218812c());
                C63219b.m247574a().mo218814e();
                if (C63228b.this.f159416d != null && C63228b.this.f159417e == null) {
                    C63228b.this.f159416d.mo219320b();
                }
            }
            if (C63228b.this.f159414b != null) {
                if (equals && !equals2) {
                    C63228b.this.f159414b.mo110683b();
                    if (C63228b.this.f159414b.mo137108c()) {
                        C63219b.m247574a().mo218814e();
                    }
                }
                if (!equals && equals2) {
                    C63228b.this.f159414b.mo110677a();
                }
            }
            if (C63228b.this.f159415c != null && equals && !equals2 && C63228b.this.f159415c.mo153395a()) {
                C63219b.m247574a().mo218814e();
            }
        }
    };

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "videochat";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f159420h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m247603p() {
        this.f159417e = null;
        VideoChatMainTabFragment3 cVar = this.f159416d;
        if (cVar != null) {
            cVar.mo219317a();
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f159414b == null) {
            this.f159414b = new VideoChatTabView(this.f159413a);
        }
        return this.f159414b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f159415c == null) {
            this.f159415c = new VideoChatNavigationTabView(this.f159413a);
        }
        return this.f159415c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        VideoChatMainTabFragment3 cVar = this.f159416d;
        if (cVar != null) {
            return cVar.mo219321c();
        }
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        C60700b.m235851b("VideoChatTab_VideoChatTabPageSpec", "[destroy]", "destroy");
        VideoChatModule.m235665i().mo208198b(this);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: i */
    public Fragment mo31318i() {
        if (this.f159416d == null) {
            VideoChatMainTabFragment3 cVar = new VideoChatMainTabFragment3();
            this.f159416d = cVar;
            cVar.mo219318a(this.f159419g);
        }
        return this.f159416d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public synchronized void mo31323n() {
        C63389b.m248367b().mo219366c();
        if (this.f159417e != null) {
            this.f159417e.run();
        } else {
            this.f159417e = new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.$$Lambda$b$MVd6crs3NqNOsqo0KpJOfAZzxNU */

                public final void run() {
                    C63228b.this.m247602o();
                }
            };
            C60735ab.m235994a().postDelayed(this.f159417e, 5000);
        }
    }

    @Override // com.ss.android.vc.dependency.AbstractC60885b
    public synchronized void onAccountChange(String str) {
        if (this.f159417e != null) {
            C60735ab.m235994a().removeCallbacks(this.f159417e);
            C60735ab.m235994a().post(this.f159417e);
        } else {
            this.f159417e = new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.$$Lambda$b$X3KHXCxbhjA05UsRroqBlRb28wo */

                public final void run() {
                    C63228b.this.m247603p();
                }
            };
        }
    }

    public C63228b(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        this.f159413a = context;
        this.f159418f = eVar;
        this.f159419g = iTitleController;
        VideoChatModule.m235665i().mo208190a(this);
    }
}
