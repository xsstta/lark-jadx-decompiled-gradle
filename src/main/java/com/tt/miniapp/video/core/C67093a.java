package com.tt.miniapp.video.core;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;
import com.tt.miniapp.video.base.C67084a;
import com.tt.miniapp.video.p3339b.AbstractC67081a;
import com.tt.miniapp.video.p3341d.p3342a.AbstractC67098d;
import com.tt.miniapp.video.p3341d.p3343b.C67102b;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.video.core.a */
public class C67093a extends C67084a implements AbstractC67081a {

    /* renamed from: a */
    private boolean f169147a;

    /* renamed from: o */
    protected PluginMediaViewLayout f169148o;

    /* renamed from: p */
    private WeakReference<Context> f169149p;

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo233300G() {
    }

    /* renamed from: a */
    public void mo230773a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo233302I() {
        return mo233275o();
    }

    /* renamed from: A */
    public void mo233294A() {
        if (!this.f169147a) {
            this.f169147a = true;
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f, com.tt.miniapp.video.p3341d.p3342a.C67096b
    /* renamed from: C */
    public ViewGroup mo233296C() {
        PluginMediaViewLayout pluginMediaViewLayout = this.f169148o;
        if (pluginMediaViewLayout != null) {
            return pluginMediaViewLayout.getPluginMainContainer();
        }
        return null;
    }

    /* renamed from: E */
    public TextureView mo233298E() {
        PluginMediaViewLayout pluginMediaViewLayout = this.f169148o;
        if (pluginMediaViewLayout != null) {
            return pluginMediaViewLayout.getVideoView().getRenderView();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo233299F() {
        WeakReference<Context> weakReference = this.f169149p;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo233301H() {
        mo233314b(new C67102b(207));
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.base.C67084a
    /* renamed from: b */
    public void mo230776b() {
        super.mo230776b();
        mo233314b(new C67102b(LocationRequest.PRIORITY_NO_POWER));
    }

    @Override // com.tt.miniapp.video.base.C67084a
    /* renamed from: i */
    public void mo233269i() {
        super.mo233269i();
        mo233314b(new C67102b(SmEvents.EVENT_RE));
    }

    @Override // com.tt.miniapp.video.base.C67084a
    /* renamed from: j */
    public void mo233270j() {
        super.mo233270j();
        mo233314b(new C67102b(101));
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.base.C67084a
    /* renamed from: r */
    public void mo233278r() {
        super.mo233278r();
        mo233314b(new C67102b(ActivityIdentificationData.WALKING));
    }

    /* renamed from: J */
    private void m261548J() {
        mo233314b(new C67102b(204));
        this.f169113b.setStartTime(0);
        mo233283w();
    }

    /* renamed from: B */
    public void mo233295B() {
        if (this.f169147a) {
            this.f169147a = false;
            if (mo233276p()) {
                m261548J();
            }
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f, com.tt.miniapp.video.p3341d.p3342a.C67096b
    /* renamed from: D */
    public Context mo233297D() {
        if (!mo233299F()) {
            return null;
        }
        return this.f169149p.get();
    }

    public C67093a(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
    public void onError(Error error) {
        super.onError(error);
        mo233314b(new C67102b(SmEvents.EVENT_NO));
    }

    @Override // com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        super.onRenderStart(tTVideoEngine);
        mo233314b(new C67102b(SmEvents.EVENT_NR));
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f, com.tt.miniapp.video.p3341d.p3342a.C67096b
    /* renamed from: a */
    public void mo233304a(AbstractC67098d dVar) {
        int intValue;
        if (dVar != null && dVar.mo233315a() == 2009 && (intValue = ((Integer) dVar.mo233316b()).intValue()) >= 0) {
            mo233262c(intValue);
        }
        super.mo233304a(dVar);
    }

    @Override // com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
    public void onPrepare(TTVideoEngine tTVideoEngine) {
        Bundle bundle;
        super.onPrepare(tTVideoEngine);
        mo233314b(new C67102b(100));
        if (this.f169124m != null) {
            bundle = new Bundle();
            bundle.putString("poster", this.f169124m.mo233240h());
        } else {
            bundle = null;
        }
        mo233314b(new C67102b(208, bundle));
    }

    @Override // com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
    public void onPrepared(TTVideoEngine tTVideoEngine) {
        super.onPrepared(tTVideoEngine);
        C67102b bVar = new C67102b(108);
        if (this.f169113b != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("duration", this.f169113b.getDuration());
            bVar.mo233319a(bundle);
        }
        mo233314b(bVar);
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67100f, com.tt.miniapp.video.p3341d.p3342a.C67096b
    /* renamed from: d */
    public void mo233305d(int i) {
        if (i == 2007) {
            mo230773a();
            mo233267g();
        } else if (i == 2008) {
            mo233268h();
        } else if (i != 2010) {
            switch (i) {
                case 1002:
                    if (!mo233275o()) {
                        mo230777c();
                        break;
                    } else {
                        mo230778d();
                        break;
                    }
                case 1003:
                    if (!mo233275o()) {
                        mo230777c();
                        break;
                    }
                    break;
                case 1004:
                    if (mo233275o()) {
                        mo230778d();
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case 2012:
                            mo233271k();
                            break;
                        case 2013:
                            mo233258a(true);
                            break;
                        case 2014:
                            mo233258a(false);
                            break;
                    }
            }
        } else {
            mo233284x();
        }
        super.mo233305d(i);
    }

    @Override // com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
    public void onCompletion(TTVideoEngine tTVideoEngine) {
        super.onCompletion(tTVideoEngine);
        if (mo233276p()) {
            C67102b bVar = new C67102b(102);
            if (this.f169113b != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("duration", this.f169113b.getDuration());
                bVar.mo233319a(bundle);
            }
            mo233314b(bVar);
            C67102b bVar2 = new C67102b(208);
            if (this.f169124m != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("poster", this.f169124m.mo233240h());
                bVar2.mo233319a(bundle2);
            }
            mo233314b(bVar2);
            if (!this.f169147a) {
                m261548J();
            }
        }
    }

    @Override // com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        super.onBufferingUpdate(tTVideoEngine, i);
        Bundle bundle = new Bundle();
        bundle.putInt("percent", i);
        mo233314b(new C67102b(106, bundle));
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.base.C67084a
    /* renamed from: a */
    public void mo230774a(int i, int i2) {
        super.mo230774a(i, i2);
        C67102b bVar = new C67102b(SmEvents.EVENT_NT);
        Bundle bundle = new Bundle();
        bundle.putInt("duration", this.f169116e);
        bundle.putInt("position", this.f169115d);
        bVar.mo233319a(bundle);
        mo233314b(bVar);
    }

    @Override // com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        super.onPlaybackStateChanged(tTVideoEngine, i);
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fullscreen", this.f169119h);
            mo233314b(new C67102b(103, bundle));
        } else if (i == 2) {
            mo233314b(new C67102b(104));
        }
    }

    /* renamed from: a */
    public void mo233303a(Context context, ViewGroup viewGroup) {
        this.f169149p = new WeakReference<>(context);
        if (this.f169148o == null) {
            this.f169148o = new PluginMediaViewLayout(context);
        }
        mo233256a(this.f169148o.getVideoView());
        mo233265e().setFullScreenCallback(this);
        mo233314b(new C67102b(LocationRequest.PRIORITY_HD_ACCURACY));
        PluginMediaViewLayout pluginMediaViewLayout = this.f169148o;
        if (!(pluginMediaViewLayout == null || pluginMediaViewLayout.getPluginMainContainer() == null)) {
            this.f169148o.getPluginMainContainer().setOnTouchListener(new View.OnTouchListener() {
                /* class com.tt.miniapp.video.core.C67093a.View$OnTouchListenerC670941 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        C67093a.this.mo233300G();
                        if (!C67093a.this.mo233302I()) {
                            C67093a.this.mo233301H();
                        }
                    } else if (action == 1) {
                        C67093a.this.mo233301H();
                    }
                    return C67093a.this.mo233302I();
                }
            });
        }
        viewGroup.addView(this.f169148o, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.tt.miniapp.video.p3339b.AbstractC67081a
    /* renamed from: a */
    public void mo230775a(boolean z, int i) {
        C67102b bVar = new C67102b(202);
        Bundle bundle = new Bundle();
        bundle.putBoolean("fullscreen", z);
        bundle.putInt("orientation", i);
        bVar.mo233319a(bundle);
        mo233314b(bVar);
    }
}
