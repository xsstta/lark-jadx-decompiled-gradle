package com.ss.android.lark.mm.module.player.core.layer.p2320k;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.videoshop.api.AbstractC64101i;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3194a.C64087a;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3196c.C64118b;
import com.ss.android.videoshop.p3196c.C64119c;
import com.ss.android.videoshop.p3196c.C64122f;
import com.ss.android.videoshop.p3196c.C64127k;
import com.ss.android.videoshop.p3197d.AbstractC64152a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.k.b */
public class C46672b extends AbstractC46619b implements AbstractC46669a.AbstractC46671b {

    /* renamed from: c */
    public boolean f117381c;

    /* renamed from: d */
    public AbstractC46669a.AbstractC46670a f117382d;

    /* renamed from: f */
    private ArrayList<Integer> f117383f = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2320k.C46672b.C466731 */

        {
            add(101);
            add(106);
            add(104);
            add(Integer.valueOf((int) ActivityIdentificationData.WALKING));
            add(Integer.valueOf((int) SmEvents.EVENT_NR));
            add(108);
            add(Integer.valueOf((int) LocationRequest.PRIORITY_HD_ACCURACY));
            add(102);
            add(Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR));
            add(100);
            add(Integer.valueOf((int) SmEvents.EVENT_RS));
            add(Integer.valueOf((int) LocationRequest.PRIORITY_NO_POWER));
            add(1004);
            add(1006);
            add(1007);
            add(1008);
            add(1005);
        }
    };

    /* renamed from: g */
    private AbstractC46675c f117384g = new AbstractC46675c() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2320k.C46672b.C466742 */
    };

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: k */
    public AbstractC64152a mo163919k() {
        return this;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117305h;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117383f;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: j */
    public AbstractC46626a mo163918j() {
        return this.f117320a;
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: l */
    public boolean mo163922l() {
        return this.f117381c;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: m */
    public AbstractC64101i mo163923m() {
        return this.f117384g;
    }

    /* renamed from: A */
    private void m184603A() {
        this.f117382d.mo163896a();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: i */
    public void mo163917i() {
        m184607f(false);
    }

    /* renamed from: B */
    private void m184604B() {
        AbstractC46669a.AbstractC46670a aVar = this.f117382d;
        if (aVar != null) {
            aVar.mo163903b();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: e */
    public int mo163913e() {
        return (int) (this.f117320a.mo163725a().mo163691g() * 100.0f);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: f */
    public void mo163914f() {
        m184607f(false);
        mo222206b(new C64119c(1003));
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: g */
    public boolean mo163915g() {
        AbstractC64108o s = mo222211s();
        if (s == null || !s.mo221912d()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public void mo163924n() {
        if (this.f162049e != null) {
            this.f162049e.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED);
        }
    }

    /* renamed from: o */
    public int mo163925o() {
        AbstractC64108o s = mo222211s();
        if (s != null) {
            return s.mo221909a();
        }
        return 0;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: d */
    public void mo163912d() {
        AbstractC64108o s = mo222211s();
        if (s != null && s.mo221917i()) {
            mo222202a(new C64087a(104));
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: h */
    public void mo163916h() {
        if (this.f162049e != null) {
            this.f162049e.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED);
            this.f162049e.sendMessageDelayed(this.f162049e.obtainMessage(CommonCode.StatusCode.API_CLIENT_EXPIRED), 5000);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: a */
    public void mo163909a() {
        AbstractC64108o s = mo222211s();
        if (s == null) {
            return;
        }
        if (s.mo221912d()) {
            C47083e.m186423a(mo222223x(), "vc_mm_click_button", C47086i.m186432a().mo165409a("video_pause").mo165417b("player").mo165421c());
            mo222202a(new C64087a(208));
            return;
        }
        C47083e.m186423a(mo222223x(), "vc_mm_click_button", C47086i.m186432a().mo165409a("video_play").mo165417b("player").mo165421c());
        mo222202a(new C64087a(207));
    }

    /* renamed from: e */
    private void m184606e(boolean z) {
        this.f117382d.mo163904b(z);
    }

    /* renamed from: a */
    public void mo163920a(float f) {
        AbstractC46669a.AbstractC46670a aVar = this.f117382d;
        if (aVar != null) {
            aVar.mo163897a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: b */
    public void mo163784b(boolean z) {
        AbstractC46669a.AbstractC46670a aVar = this.f117382d;
        if (aVar != null) {
            aVar.mo163908d(z);
        }
    }

    /* renamed from: a */
    private void m184605a(int i) {
        AbstractC46669a.AbstractC46670a aVar = this.f117382d;
        if (aVar != null) {
            aVar.mo163898a(i);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: c */
    public void mo163911c(boolean z) {
        mo222206b(new C64119c(1005, Boolean.valueOf(z)));
    }

    public C46672b(AbstractC46626a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46671b
    /* renamed from: a */
    public void mo163910a(long j) {
        mo222202a(new C64087a(209, Long.valueOf(j)));
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        super.handleMsg(message);
        int i = message.what;
        if (i == 1001) {
            m184607f(false);
        } else if (i == 1002) {
            m184607f(true);
        }
    }

    /* renamed from: f */
    private void m184607f(boolean z) {
        int i;
        AbstractC64108o s;
        this.f117381c = z;
        this.f117382d.mo163902a(z);
        if (z && (s = mo222211s()) != null) {
            if (s.mo221912d()) {
                mo163916h();
            } else {
                mo163924n();
            }
        }
        if (z) {
            mo163918j().mo163725a().mo163698p();
        } else {
            mo163918j().mo163725a().mo163697o();
        }
        if (z) {
            i = 1000;
        } else {
            i = CommonCode.StatusCode.API_CLIENT_EXPIRED;
        }
        mo222206b(new C64119c(i));
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: a */
    public void mo163780a(HightlightTimeLine hightlightTimeLine) {
        AbstractC46669a.AbstractC46670a aVar = this.f117382d;
        if (aVar != null) {
            aVar.mo163901a(hightlightTimeLine);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: a */
    public void mo163781a(boolean z) {
        AbstractC46669a.AbstractC46670a aVar = this.f117382d;
        if (aVar != null) {
            aVar.mo163906c(z);
        }
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        if (gVar != null) {
            C45855f.m181663b("MmToolbarLayer", "handleVideoEvent " + gVar.mo221968b());
            AbstractC64108o s = mo222211s();
            int b = gVar.mo221968b();
            if (b != 101) {
                if (b != 102) {
                    if (b == 108) {
                        m184605a(((C64118b) gVar).mo221967a());
                    } else if (b == 200) {
                        C64127k kVar = (C64127k) gVar;
                        mo163921a(kVar.mo221971a(), kVar.mo221974d());
                    } else if (b != 300) {
                        switch (b) {
                            case 104:
                                m184603A();
                                mo163916h();
                                break;
                            case LocationRequest.PRIORITY_NO_POWER:
                                this.f117382d.mo163899a((long) mo163925o());
                                m184603A();
                                break;
                            case 106:
                                mo163924n();
                                m184603A();
                                break;
                            default:
                                switch (b) {
                                    case 1005:
                                        this.f117382d.mo163907d();
                                        break;
                                    case 1006:
                                    case 1008:
                                        if (s != null && (s.mo221912d() || s.mo221913e() || s.mo221916h())) {
                                            m184607f(!this.f117381c);
                                            break;
                                        }
                                    case 1007:
                                        this.f117382d.mo163905c();
                                        break;
                                }
                                break;
                        }
                    } else {
                        m184606e(((C64122f) gVar).mo221970a());
                    }
                }
                m184607f(false);
            } else {
                m184607f(false);
                m184604B();
            }
        }
        return super.mo163782a(gVar);
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        if (context == null || layoutInflater == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.f117382d == null) {
            this.f117382d = new View$OnClickListenerC46676d(context, this);
        }
        return Collections.singletonList(new Pair(mo163802a(context, (View) this.f117382d), layoutParams));
    }

    /* renamed from: a */
    public void mo163921a(long j, long j2) {
        AbstractC46669a.AbstractC46670a aVar = this.f117382d;
        if (aVar != null) {
            aVar.mo163900a(j, j2);
        }
    }
}
