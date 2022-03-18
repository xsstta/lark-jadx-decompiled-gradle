package com.tt.miniapp.video.p3341d.p3344c.p3346b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.tt.miniapp.video.base.ITTVideoController;
import com.tt.miniapp.video.p3341d.p3342a.AbstractC67099e;
import com.tt.miniapp.video.p3341d.p3342a.C67095a;
import com.tt.miniapp.video.p3341d.p3344c.p3346b.C67108a;

/* renamed from: com.tt.miniapp.video.d.c.b.b */
public class C67111b extends C67095a {

    /* renamed from: a */
    private C67108a f169179a;

    /* renamed from: e */
    private boolean m261624e() {
        if (this.f169179a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo233343d() {
        if (this.f169179a == null) {
            C67108a aVar = new C67108a();
            this.f169179a = aVar;
            aVar.mo233332a(mo233312c(), mo233310b());
            this.f169179a.mo233333a(new C67108a.AbstractC67110a() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3346b.C67111b.C671121 */

                @Override // com.tt.miniapp.video.p3341d.p3344c.p3346b.C67108a.AbstractC67110a
                /* renamed from: a */
                public void mo233342a(View view) {
                    C67111b.this.mo233307a().mo233305d(2007);
                }
            });
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3342a.AbstractC67097c, com.tt.miniapp.video.p3341d.p3342a.C67095a
    /* renamed from: a */
    public boolean mo233309a(AbstractC67099e eVar) {
        ITTVideoController.ShowStateEntity showStateEntity;
        if (eVar != null) {
            boolean z = false;
            AppBrandLogger.m52830i("tma_PosterPlugin", "handleVideoEvent ", Integer.valueOf(eVar.mo233317a()));
            Bundle b = eVar.mo233318b();
            int a = eVar.mo233317a();
            String str = null;
            if (a != 103) {
                if (a != 200) {
                    if (a == 208) {
                        C67108a aVar = this.f169179a;
                        if (aVar != null) {
                            aVar.mo233340d(true);
                            C67108a aVar2 = this.f169179a;
                            if (b != null) {
                                str = b.getString("poster");
                            }
                            aVar2.mo233336b(str);
                        }
                    } else if (a != 108) {
                        if (a != 109) {
                            switch (a) {
                                case 202:
                                    C67108a aVar3 = this.f169179a;
                                    if (!(aVar3 == null || b == null)) {
                                        aVar3.mo233339c(b.getBoolean("fullscreen"));
                                        break;
                                    }
                                case SmEvents.EVENT_HBRESET:
                                    if (!(this.f169179a == null || (showStateEntity = (ITTVideoController.ShowStateEntity) b.getParcelable("showState")) == null)) {
                                        this.f169179a.mo233334a(showStateEntity.mo233213e());
                                        this.f169179a.mo233335a(showStateEntity.mo233206b());
                                        break;
                                    }
                                case 204:
                                    C67108a aVar4 = this.f169179a;
                                    if (aVar4 != null) {
                                        aVar4.mo233331a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else {
                        C67108a aVar5 = this.f169179a;
                        if (aVar5 != null) {
                            aVar5.mo233337b(false);
                        }
                    }
                } else if (!m261624e()) {
                    mo233343d();
                    return true;
                }
            }
            C67108a aVar6 = this.f169179a;
            if (aVar6 != null) {
                aVar6.mo233340d(false);
                this.f169179a.mo233336b((String) null);
                if (b != null && b.getBoolean("fullscreen", false)) {
                    z = true;
                }
                if (!this.f169179a.mo233338b() && z) {
                    mo233307a().mo233305d(1003);
                }
            }
        }
        return super.mo233309a(eVar);
    }
}
