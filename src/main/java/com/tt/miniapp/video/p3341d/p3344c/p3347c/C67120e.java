package com.tt.miniapp.video.p3341d.p3344c.p3347c;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.tt.miniapp.util.HandlerC67025ad;
import com.tt.miniapp.video.base.ITTVideoController;
import com.tt.miniapp.video.p3340c.C67090b;
import com.tt.miniapp.video.p3341d.p3342a.AbstractC67099e;
import com.tt.miniapp.video.p3341d.p3342a.C67095a;
import com.tt.miniapp.video.p3341d.p3343b.C67101a;
import com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c;
import com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67118d;
import com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67124f;

/* renamed from: com.tt.miniapp.video.d.c.c.e */
public class C67120e extends C67095a implements HandlerC67025ad.AbstractC67026a {

    /* renamed from: a */
    public boolean f169207a;

    /* renamed from: b */
    private boolean f169208b;

    /* renamed from: c */
    private View$OnClickListenerC67124f f169209c;

    /* renamed from: d */
    private View$OnClickListenerC67118d f169210d;

    /* renamed from: e */
    private C67114b f169211e;

    /* renamed from: f */
    private View$OnClickListenerC67115c f169212f;

    /* renamed from: g */
    private boolean f169213g;

    /* renamed from: h */
    private boolean f169214h;

    /* renamed from: i */
    private boolean f169215i;

    /* renamed from: j */
    private boolean f169216j;

    /* renamed from: k */
    private HandlerC67025ad f169217k = new HandlerC67025ad(this);

    /* renamed from: l */
    private ITTVideoController.ShowStateEntity f169218l;

    /* renamed from: m */
    private IAppContext f169219m;

    /* renamed from: i */
    private void m261677i() {
        View$OnClickListenerC67115c cVar = this.f169212f;
        if (cVar != null) {
            cVar.mo233362f(this.f169215i);
        }
    }

    /* renamed from: g */
    public void mo233384g() {
        HandlerC67025ad adVar = this.f169217k;
        if (adVar != null) {
            adVar.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED);
        }
    }

    /* renamed from: j */
    private boolean m261678j() {
        if (this.f169209c == null || this.f169210d == null || this.f169212f == null || this.f169211e == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo233381d() {
        View$OnClickListenerC67118d dVar = this.f169210d;
        if (dVar != null) {
            dVar.mo233375a(this.f169214h, this.f169207a);
        }
        View$OnClickListenerC67115c cVar = this.f169212f;
        if (cVar != null) {
            cVar.mo233355a(this.f169214h, this.f169207a);
        }
    }

    /* renamed from: f */
    public void mo233383f() {
        if (this.f169214h) {
            HandlerC67025ad adVar = this.f169217k;
            if (adVar != null) {
                adVar.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED);
                this.f169217k.sendMessageDelayed(this.f169217k.obtainMessage(CommonCode.StatusCode.API_CLIENT_EXPIRED), 3000);
                return;
            }
            return;
        }
        mo233384g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo233382e() {
        if (this.f169210d == null) {
            View$OnClickListenerC67118d dVar = new View$OnClickListenerC67118d();
            this.f169210d = dVar;
            dVar.mo233345a(mo233312c(), mo233310b());
            this.f169210d.mo233374a(new View$OnClickListenerC67118d.AbstractC67119a() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3347c.C67120e.C671211 */

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67118d.AbstractC67119a
                /* renamed from: a */
                public void mo233379a(boolean z) {
                    if (z) {
                        C67120e.this.mo233307a().mo233305d(2007);
                    } else {
                        C67120e.this.mo233307a().mo233305d(2008);
                    }
                }
            });
        }
        if (this.f169209c == null) {
            View$OnClickListenerC67124f fVar = new View$OnClickListenerC67124f(this.f169219m);
            this.f169209c = fVar;
            fVar.mo233345a(mo233312c(), mo233310b());
            this.f169209c.mo233386a(new View$OnClickListenerC67124f.AbstractC67125a() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3347c.C67120e.C671222 */

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67124f.AbstractC67125a
                /* renamed from: a */
                public void mo233385a() {
                    if (C67120e.this.mo233307a() != null) {
                        C67120e.this.mo233307a().mo233305d(1004);
                    }
                }
            });
        }
        if (this.f169212f == null) {
            View$OnClickListenerC67115c cVar = new View$OnClickListenerC67115c(this.f169219m);
            this.f169212f = cVar;
            cVar.mo233345a(mo233312c(), mo233310b());
            this.f169212f.mo233354a(new View$OnClickListenerC67115c.AbstractC67117a() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3347c.C67120e.C671233 */

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c.AbstractC67117a
                /* renamed from: a */
                public void mo233368a() {
                    if (C67120e.this.mo233307a() != null) {
                        C67120e.this.mo233307a().mo233305d(1002);
                    }
                }

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c.AbstractC67117a
                /* renamed from: b */
                public void mo233372b() {
                    C67120e.this.mo233384g();
                    if (C67120e.this.mo233307a() != null) {
                        C67120e.this.mo233307a().mo233305d(2010);
                    }
                    if (C67120e.this.f169207a) {
                        C67120e.this.f169207a = false;
                        C67120e.this.mo233381d();
                    }
                }

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c.AbstractC67117a
                /* renamed from: b */
                public void mo233373b(boolean z) {
                    if (z) {
                        C67120e.this.mo233307a().mo233305d(2013);
                    } else {
                        C67120e.this.mo233307a().mo233305d(2014);
                    }
                }

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c.AbstractC67117a
                /* renamed from: a */
                public void mo233371a(boolean z) {
                    if (z) {
                        C67120e.this.mo233307a().mo233305d(2007);
                    } else {
                        C67120e.this.mo233307a().mo233305d(2008);
                    }
                }

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c.AbstractC67117a
                /* renamed from: a */
                public void mo233369a(int i, int i2) {
                    C67120e.this.mo233383f();
                }

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c.AbstractC67117a
                /* renamed from: a */
                public void mo233370a(int i, boolean z) {
                    int a = C67120e.this.mo233380a(i);
                    if (C67120e.this.mo233307a() != null) {
                        C67120e.this.mo233307a().mo233304a(new C67101a(2009, Integer.valueOf(a)));
                    }
                }
            });
        }
        if (this.f169211e == null) {
            C67114b bVar = new C67114b();
            this.f169211e = bVar;
            bVar.mo233345a(mo233312c(), mo233310b());
        }
        m261675a(false);
    }

    /* renamed from: h */
    private void m261676h() {
        boolean z;
        boolean z2;
        if (this.f169209c != null && this.f169210d != null && this.f169212f != null && this.f169211e != null) {
            boolean z3 = this.f169213g;
            ITTVideoController.ShowStateEntity showStateEntity = this.f169218l;
            boolean z4 = true;
            if (showStateEntity != null) {
                if (!z3 || !showStateEntity.mo233206b()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                this.f169210d.mo233376c(this.f169218l.mo233216g());
                this.f169212f.mo233357c(this.f169218l.mo233217h());
                this.f169212f.mo233361e(this.f169218l.mo233215f());
                this.f169212f.mo233360d(this.f169218l.mo233218i());
                if (this.f169212f.mo233359d() > 0) {
                    this.f169212f.mo233353a(this.f169218l.mo233200a() * 1000, this.f169212f.mo233359d());
                }
                this.f169211e.mo233346a(this.f169218l.mo233206b());
            }
            this.f169209c.mo233346a(z3);
            this.f169210d.mo233346a(z3);
            this.f169212f.mo233346a(z3);
            View$OnClickListenerC67118d dVar = this.f169210d;
            if (!this.f169208b || !z3) {
                z = false;
            } else {
                z = true;
            }
            dVar.mo233348b(z);
            View$OnClickListenerC67115c cVar = this.f169212f;
            if (!this.f169208b || !z3) {
                z2 = false;
            } else {
                z2 = true;
            }
            cVar.mo233348b(z2);
            C67114b bVar = this.f169211e;
            if (!this.f169208b || z3) {
                z4 = false;
            }
            bVar.mo233348b(z4);
        }
    }

    public C67120e(IAppContext iAppContext) {
        this.f169219m = iAppContext;
    }

    @Override // com.tt.miniapp.util.HandlerC67025ad.AbstractC67026a
    /* renamed from: a */
    public void mo233141a(Message message) {
        if (message.what == 1001) {
            m261675a(false);
        }
    }

    /* renamed from: a */
    private void m261675a(boolean z) {
        if (m261678j()) {
            if (!this.f169216j || !z) {
                this.f169213g = z;
                mo233384g();
                m261676h();
                if (this.f169213g) {
                    mo233383f();
                }
            }
        }
    }

    /* renamed from: a */
    public int mo233380a(int i) {
        if (C67090b.m261540a().mo233290b() > 0) {
            return (int) ((((float) (i * C67090b.m261540a().mo233290b())) * 1.0f) / 100.0f);
        }
        return 0;
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67097c, com.tt.miniapp.video.p3341d.p3342a.C67095a
    /* renamed from: a */
    public boolean mo233309a(AbstractC67099e eVar) {
        if (eVar != null) {
            int i = 0;
            AppBrandLogger.m52830i("tma_ToolbarPlugin", "handleVideoEvent ", Integer.valueOf(eVar.mo233317a()));
            Bundle b = eVar.mo233318b();
            int a = eVar.mo233317a();
            if (a == 111) {
                View$OnClickListenerC67115c cVar = this.f169212f;
                if (cVar != null) {
                    cVar.mo233353a(b.getInt("position"), b.getInt("duration"));
                }
                C67114b bVar = this.f169211e;
                if (bVar != null) {
                    bVar.mo233351a(b.getInt("position"), b.getInt("duration"));
                }
            } else if (a != 200) {
                if (a == 207) {
                    m261675a(!this.f169213g);
                    return true;
                } else if (a == 113) {
                    View$OnClickListenerC67118d dVar = this.f169210d;
                    if (dVar != null) {
                        dVar.mo233349c();
                    }
                    View$OnClickListenerC67115c cVar2 = this.f169212f;
                    if (cVar2 != null) {
                        cVar2.mo233349c();
                    }
                    C67114b bVar2 = this.f169211e;
                    if (bVar2 != null) {
                        bVar2.mo233349c();
                    }
                    this.f169216j = false;
                    this.f169214h = false;
                    m261675a(true);
                } else if (a != 114) {
                    switch (a) {
                        case 100:
                            this.f169216j = true;
                            m261675a(false);
                            break;
                        case 101:
                            m261675a(false);
                            View$OnClickListenerC67118d dVar2 = this.f169210d;
                            if (dVar2 != null) {
                                dVar2.mo233349c();
                            }
                            View$OnClickListenerC67115c cVar3 = this.f169212f;
                            if (cVar3 != null) {
                                cVar3.mo233349c();
                            }
                            C67114b bVar3 = this.f169211e;
                            if (bVar3 != null) {
                                bVar3.mo233349c();
                            }
                            this.f169214h = false;
                            break;
                        case 102:
                            this.f169214h = false;
                            this.f169207a = true;
                            mo233384g();
                            m261675a(true);
                            mo233381d();
                            if (eVar.mo233318b() != null) {
                                i = eVar.mo233318b().getInt("duration");
                            }
                            View$OnClickListenerC67115c cVar4 = this.f169212f;
                            if (cVar4 != null) {
                                cVar4.mo233353a(i, i);
                            }
                            C67114b bVar4 = this.f169211e;
                            if (bVar4 != null) {
                                bVar4.mo233351a(i, i);
                                break;
                            }
                            break;
                        case 103:
                            this.f169208b = true;
                            this.f169214h = true;
                            this.f169207a = false;
                            mo233381d();
                            m261676h();
                            mo233383f();
                            break;
                        case 104:
                            this.f169214h = false;
                            this.f169207a = false;
                            mo233381d();
                            mo233384g();
                            break;
                        case LocationRequest.PRIORITY_NO_POWER:
                            View$OnClickListenerC67118d dVar3 = this.f169210d;
                            if (dVar3 != null) {
                                dVar3.mo233348b(false);
                                break;
                            }
                            break;
                        case 106:
                            View$OnClickListenerC67115c cVar5 = this.f169212f;
                            if (cVar5 != null) {
                                cVar5.mo233356b(b.getInt("percent"));
                            }
                            C67114b bVar5 = this.f169211e;
                            if (bVar5 != null) {
                                bVar5.mo233350a(b.getInt("percent"));
                                break;
                            }
                            break;
                        case ActivityIdentificationData.WALKING:
                            View$OnClickListenerC67118d dVar4 = this.f169210d;
                            if (dVar4 != null) {
                                dVar4.mo233348b(true);
                                break;
                            }
                            break;
                        case 108:
                            this.f169216j = false;
                            if (eVar.mo233318b() != null) {
                                i = eVar.mo233318b().getInt("duration");
                            }
                            View$OnClickListenerC67115c cVar6 = this.f169212f;
                            if (cVar6 != null) {
                                cVar6.mo233352a(i);
                            }
                            m261675a(true);
                            break;
                        default:
                            switch (a) {
                                case 202:
                                    boolean z = b.getBoolean("fullscreen");
                                    View$OnClickListenerC67124f fVar = this.f169209c;
                                    if (fVar != null) {
                                        fVar.mo233387c(z);
                                        this.f169209c.mo233348b(z);
                                    }
                                    View$OnClickListenerC67118d dVar5 = this.f169210d;
                                    if (dVar5 != null) {
                                        dVar5.mo233377d(z);
                                    }
                                    View$OnClickListenerC67115c cVar7 = this.f169212f;
                                    if (cVar7 != null) {
                                        cVar7.mo233363g(z);
                                        break;
                                    }
                                    break;
                                case SmEvents.EVENT_HBRESET:
                                    this.f169218l = (ITTVideoController.ShowStateEntity) b.getParcelable("showState");
                                    m261676h();
                                    break;
                                case 204:
                                    this.f169208b = false;
                                    this.f169207a = false;
                                    View$OnClickListenerC67118d dVar6 = this.f169210d;
                                    if (dVar6 != null) {
                                        dVar6.mo233349c();
                                    }
                                    View$OnClickListenerC67115c cVar8 = this.f169212f;
                                    if (cVar8 != null) {
                                        cVar8.mo233349c();
                                    }
                                    C67114b bVar6 = this.f169211e;
                                    if (bVar6 != null) {
                                        bVar6.mo233349c();
                                    }
                                    m261675a(false);
                                    break;
                                default:
                                    AppBrandLogger.m52829e("tma_ToolbarPlugin", "handleVideoEvent->no match any event...");
                                    break;
                            }
                    }
                } else {
                    boolean z2 = b.getBoolean("muted");
                    if (this.f169215i != z2) {
                        this.f169215i = z2;
                        m261677i();
                    }
                }
            } else if (!m261678j()) {
                mo233382e();
                return true;
            }
        }
        return super.mo233309a(eVar);
    }
}
