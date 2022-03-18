package com.tt.miniapp.video.p3341d.p3344c.p3345a;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.util.HandlerC67025ad;
import com.tt.miniapp.video.p3341d.p3342a.AbstractC67099e;
import com.tt.miniapp.video.p3341d.p3342a.C67095a;
import com.tt.miniapp.video.p3341d.p3344c.p3345a.C67103a;

/* renamed from: com.tt.miniapp.video.d.c.a.b */
public class C67106b extends C67095a implements HandlerC67025ad.AbstractC67026a {

    /* renamed from: a */
    private C67103a f169165a;

    /* renamed from: b */
    private HandlerC67025ad f169166b = new HandlerC67025ad(this);

    /* renamed from: e */
    private boolean m261605e() {
        if (this.f169165a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo233330d() {
        if (this.f169165a == null) {
            C67103a aVar = new C67103a();
            this.f169165a = aVar;
            aVar.mo233321a(mo233312c(), mo233310b());
            this.f169165a.mo233322a(new C67103a.AbstractC67105a() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3345a.C67106b.C671071 */

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3345a.C67103a.AbstractC67105a
                /* renamed from: a */
                public void mo233327a() {
                    C67106b.this.mo233329b(false);
                    C67106b.this.mo233328a(true);
                    if (C67106b.this.mo233307a() != null) {
                        C67106b.this.mo233307a().mo233305d(2012);
                    }
                }
            });
        }
    }

    @Override // com.tt.miniapp.util.HandlerC67025ad.AbstractC67026a
    /* renamed from: a */
    public void mo233141a(Message message) {
        if (message.what == 2001) {
            mo233328a(true);
        }
    }

    /* renamed from: b */
    public void mo233329b(boolean z) {
        C67103a aVar;
        if (m261605e() && (aVar = this.f169165a) != null) {
            aVar.mo233324b(z);
        }
    }

    /* renamed from: a */
    public void mo233328a(boolean z) {
        C67103a aVar;
        if (m261605e() && (aVar = this.f169165a) != null) {
            aVar.mo233323a(z);
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67097c, com.tt.miniapp.video.p3341d.p3342a.C67095a
    /* renamed from: a */
    public boolean mo233309a(AbstractC67099e eVar) {
        if (eVar != null) {
            AppBrandLogger.m52830i("tma_VideoLoadingPlugin", "handleVideoEvent ", Integer.valueOf(eVar.mo233317a()));
            Bundle b = eVar.mo233318b();
            int a = eVar.mo233317a();
            if (a == 105) {
                mo233328a(true);
            } else if (a == 110) {
                mo233328a(false);
                this.f169166b.removeMessages(2001);
                mo233329b(true);
            } else if (a != 200) {
                if (a != 202) {
                    if (a != 107) {
                        if (a != 108) {
                            switch (a) {
                                case 100:
                                    HandlerC67025ad adVar = this.f169166b;
                                    if (adVar != null) {
                                        adVar.sendEmptyMessageDelayed(2001, 0);
                                        break;
                                    }
                                    break;
                                case 101:
                                    this.f169166b.removeMessages(2001);
                                    mo233328a(false);
                                    mo233329b(false);
                                    break;
                                case 103:
                                    mo233329b(false);
                                    break;
                            }
                        } else {
                            HandlerC67025ad adVar2 = this.f169166b;
                            if (adVar2 != null) {
                                adVar2.removeMessages(2001);
                                mo233328a(false);
                            }
                        }
                    }
                    mo233328a(false);
                } else {
                    boolean z = b.getBoolean("fullscreen");
                    C67103a aVar = this.f169165a;
                    if (aVar != null) {
                        aVar.mo233325c(z);
                    }
                }
            } else if (!m261605e()) {
                mo233330d();
                return true;
            }
        }
        return super.mo233309a(eVar);
    }
}
