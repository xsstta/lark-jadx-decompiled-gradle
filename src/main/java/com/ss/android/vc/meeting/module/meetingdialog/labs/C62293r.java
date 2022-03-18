package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.mvp.C26033a;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.background.FileStatus;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.AnimojiEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.BeautifyEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.FilterEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vc.statistics.event2.MeetingPreEvent;
import com.ss.android.vc.statistics.event2.MeetingSettingEvent2;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.r */
public class C62293r extends C26033a<AbstractC62216c.AbstractC62217a, AbstractC62216c.AbstractC62218b> {

    /* renamed from: a */
    private final C61303k f156521a;

    /* renamed from: b */
    private final Context f156522b;

    /* renamed from: c */
    private LabsScene f156523c = LabsScene.LABS_SETTING_PAGE;

    /* renamed from: c */
    public void mo215441c(VirtualBackgroundInfo virtualBackgroundInfo) {
    }

    /* renamed from: k */
    public void mo215452k() {
    }

    /* renamed from: c */
    public Context mo215440c() {
        return this.f156522b;
    }

    /* renamed from: d */
    public LabsScene mo215443d() {
        return this.f156523c;
    }

    /* renamed from: g */
    public void mo215448g() {
        C63732ac.m249961a(this.f156523c, this.f156521a);
    }

    /* renamed from: h */
    public void mo215449h() {
        C63732ac.m249973b(this.f156523c, this.f156521a);
    }

    /* renamed from: i */
    public void mo215450i() {
        C63732ac.m249978c(this.f156523c, this.f156521a);
    }

    /* renamed from: j */
    public void mo215451j() {
        C63732ac.m249982d(this.f156523c, this.f156521a);
    }

    /* renamed from: l */
    public void mo215453l() {
        C63732ac.m249984e(this.f156523c, this.f156521a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m243330m() {
        ((AbstractC62216c.AbstractC62218b) mo92551a()).mo215208b();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m243331n() {
        ((AbstractC62216c.AbstractC62218b) mo92551a()).mo215199a();
    }

    /* renamed from: e */
    public void mo215445e() {
        ((AbstractC62216c.AbstractC62218b) mo92551a()).mo215208b();
    }

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        if (mo92551a() != null) {
            ((AbstractC62216c.AbstractC62218b) mo92551a()).destroy();
            mo92552a((IView) null);
        }
    }

    /* renamed from: f */
    public void mo215447f() {
        C60700b.m235851b("LabsPresenter@", "[enterEditBackgroundState]", "enter edit background state");
        if (mo92551a() != null) {
            ((AbstractC62216c.AbstractC62218b) mo92551a()).mo215209c();
        } else {
            C60700b.m235851b("LabsPresenter@", "[enterEditBackgroundState]", "getView is null");
        }
    }

    /* renamed from: a */
    public void mo215428a(C61303k kVar) {
        C63732ac.m249980d(kVar);
    }

    /* renamed from: a */
    public void mo215425a(FileStatus fileStatus) {
        C63732ac.m249951a(this.f156521a, fileStatus);
    }

    /* renamed from: a */
    public void mo215429a(LabsScene labsScene) {
        this.f156523c = labsScene;
    }

    /* renamed from: b */
    public void mo215438b(EffectModel effectModel) {
        if (mo92554b() != null) {
            ((AbstractC62216c.AbstractC62217a) mo92554b()).mo215245b(effectModel);
        }
    }

    /* renamed from: b */
    public void mo215439b(AbstractC62283d dVar) {
        C63732ac.m249979c(this.f156523c, this.f156521a, dVar);
    }

    /* renamed from: e */
    public void mo215446e(EffectModel effectModel) {
        boolean z;
        C63732ac.m249974b(this.f156523c, this.f156521a, effectModel);
        if (this.f156523c == LabsScene.LABS_SETTING_PAGE) {
            C61303k kVar = this.f156521a;
            if (kVar == null || kVar.mo212092J().mo212504A()) {
                z = false;
            } else {
                z = true;
            }
            C63732ac.m249968a(z);
            C63732ac.m249957a(this.f156521a, effectModel);
        }
        if (effectModel instanceof BeautifyEffect) {
            mo215444d(effectModel);
        } else if (effectModel instanceof FilterEffect) {
            m243329f(effectModel);
        }
    }

    /* renamed from: f */
    private void m243329f(EffectModel effectModel) {
        String str;
        boolean z;
        if (TextUtils.isEmpty(((AbstractC62216c.AbstractC62218b) mo92551a()).getEnvId())) {
            str = "";
        } else {
            str = ((AbstractC62216c.AbstractC62218b) mo92551a()).getEnvId();
        }
        int tagUserValue = effectModel.getTagUserValue();
        if (effectModel.getTagDefaultValue() == tagUserValue) {
            z = true;
        } else {
            z = false;
        }
        if (this.f156521a != null) {
            MeetingSettingEvent2.m249883a().mo220355a(str, z, tagUserValue, this.f156521a.mo212056e());
        } else {
            MeetingPreEvent.m249851a().mo220336b(str, z, tagUserValue);
        }
    }

    /* renamed from: a */
    public void mo215426a(VirtualBackgroundInfo virtualBackgroundInfo) {
        C60700b.m235851b("LabsPresenter@", "[changeBackground0]", virtualBackgroundInfo.name);
        if (virtualBackgroundInfo.isCustomize) {
            if (mo92551a() == null) {
                C60700b.m235851b("LabsPresenter@", "[changeBackground]", "getView is null");
                return;
            }
            mo215448g();
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$r$xV7w36Dug6OXrsxoF1D7fUGFn7w */

                public final void run() {
                    C62293r.this.m243331n();
                }
            });
        } else if (virtualBackgroundInfo.isUpload) {
            if (mo92551a() == null) {
                C60700b.m235851b("LabsPresenter@", "[changeBackground2]", "getView is null");
                return;
            }
            mo215453l();
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$r$NJddZKWirFGAYCUBcuzTbgPrsQ */

                public final void run() {
                    C62293r.this.m243330m();
                }
            });
        } else if (mo92554b() == null) {
            C60700b.m235851b("LabsPresenter@", "[changeBackground3]", "getModel is null");
        } else {
            ((AbstractC62216c.AbstractC62217a) mo92554b()).mo215241a(virtualBackgroundInfo);
        }
    }

    /* renamed from: a */
    public void mo215431a(EffectModel.BeautifyStyle beautifyStyle) {
        C63732ac.m249955a(this.f156521a, this.f156523c, beautifyStyle);
    }

    /* renamed from: b */
    public void mo215436b(VirtualBackgroundInfo virtualBackgroundInfo) {
        String str;
        C63732ac.m249962a(this.f156523c, this.f156521a, virtualBackgroundInfo);
        boolean z = true;
        if (this.f156523c == LabsScene.LABS_SETTING_PAGE) {
            C61303k kVar = this.f156521a;
            if (kVar == null || kVar.mo212092J().mo212504A()) {
                z = false;
            }
            C63732ac.m249949a(virtualBackgroundInfo, z);
            C63732ac.m249952a(this.f156521a, virtualBackgroundInfo);
            if (this.f156521a != null) {
                MeetingSettingEvent2.m249883a().mo220353a(C63732ac.m249948a(virtualBackgroundInfo.isBlur, virtualBackgroundInfo.materialSource), C63732ac.m249946a(virtualBackgroundInfo), this.f156521a.mo212056e());
            }
        } else if ((this.f156523c == LabsScene.PAGE_PREVIEW || this.f156523c == LabsScene.PRE_WAITING_ROOM) && mo92551a() != null) {
            if (TextUtils.isEmpty(((AbstractC62216c.AbstractC62218b) mo92551a()).getEnvId())) {
                str = "";
            } else {
                str = ((AbstractC62216c.AbstractC62218b) mo92551a()).getEnvId();
            }
            if (this.f156523c != LabsScene.PRE_WAITING_ROOM) {
                z = false;
            }
            MeetingPreEvent.m249851a().mo220338b(str, z, C63732ac.m249948a(virtualBackgroundInfo.isBlur, virtualBackgroundInfo.materialSource), C63732ac.m249946a(virtualBackgroundInfo));
        }
    }

    /* renamed from: c */
    public void mo215442c(EffectModel effectModel) {
        String str;
        String str2;
        String str3;
        C63732ac.m249963a(this.f156523c, this.f156521a, effectModel);
        boolean z = true;
        if (this.f156523c == LabsScene.LABS_SETTING_PAGE) {
            C61303k kVar = this.f156521a;
            if (kVar == null || kVar.mo212092J().mo212504A()) {
                z = false;
            }
            C63732ac.m249968a(z);
            C63732ac.m249957a(this.f156521a, effectModel);
            VideoChat videoChat = null;
            if (effectModel instanceof AnimojiEffect) {
                MeetingSettingEvent2 a = MeetingSettingEvent2.m249883a();
                if (effectModel.isDisabled) {
                    str3 = "no_avatar";
                } else {
                    str3 = effectModel.getName();
                }
                C61303k kVar2 = this.f156521a;
                if (kVar2 != null) {
                    videoChat = kVar2.mo212056e();
                }
                a.mo220358b(str3, videoChat);
            } else if (effectModel instanceof FilterEffect) {
                MeetingSettingEvent2 a2 = MeetingSettingEvent2.m249883a();
                if (effectModel.isDisabled) {
                    str2 = "no_filter";
                } else {
                    str2 = effectModel.getName();
                }
                C61303k kVar3 = this.f156521a;
                if (kVar3 != null) {
                    videoChat = kVar3.mo212056e();
                }
                a2.mo220351a(str2, videoChat);
            } else if (effectModel instanceof BeautifyEffect) {
                mo215444d(effectModel);
            }
        } else if ((this.f156523c == LabsScene.PAGE_PREVIEW || this.f156523c == LabsScene.PRE_WAITING_ROOM) && mo92551a() != null) {
            if (TextUtils.isEmpty(((AbstractC62216c.AbstractC62218b) mo92551a()).getEnvId())) {
                str = "";
            } else {
                str = ((AbstractC62216c.AbstractC62218b) mo92551a()).getEnvId();
            }
            String str4 = "close";
            if (effectModel instanceof AnimojiEffect) {
                if (this.f156523c != LabsScene.PRE_WAITING_ROOM) {
                    z = false;
                }
                MeetingPreEvent a3 = MeetingPreEvent.m249851a();
                if (!effectModel.isDisabled) {
                    str4 = effectModel.getName();
                }
                a3.mo220337b(str, z, str4);
            } else if (effectModel instanceof FilterEffect) {
                if (this.f156523c != LabsScene.PRE_WAITING_ROOM) {
                    z = false;
                }
                MeetingPreEvent a4 = MeetingPreEvent.m249851a();
                if (!effectModel.isDisabled) {
                    str4 = effectModel.getName();
                }
                a4.mo220330a(str, z, str4);
            } else if (effectModel instanceof BeautifyEffect) {
                mo215444d(effectModel);
            }
        }
    }

    /* renamed from: a */
    public void mo215432a(EffectModel effectModel) {
        if (mo92554b() != null) {
            ((AbstractC62216c.AbstractC62217a) mo92554b()).mo215242a(effectModel);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        if (r8.equals("6920046832198357517") == false) goto L_0x0042;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo215444d(com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel r8) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.labs.C62293r.mo215444d(com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel):void");
    }

    /* renamed from: a */
    public void mo215433a(AbstractC62283d dVar) {
        C63732ac.m249964a(this.f156523c, this.f156521a, dVar);
        C63732ac.m249975b(this.f156523c, this.f156521a, dVar);
    }

    /* renamed from: a */
    public void mo215434a(boolean z) {
        ((AbstractC62216c.AbstractC62217a) mo92554b()).mo215243a(z);
    }

    /* renamed from: b */
    public void mo215437b(LabsScene labsScene, boolean z) {
        C63732ac.m249965a(labsScene, z, false);
    }

    /* renamed from: a */
    public void mo215430a(LabsScene labsScene, boolean z) {
        C63732ac.m249965a(labsScene, z, true);
    }

    /* renamed from: a */
    public void mo215427a(VirtualBackgroundInfo virtualBackgroundInfo, C62239f.AbstractC62249d dVar) {
        C60700b.m235851b("LabsPresenter@", "[deleteVirtualBackground]", "deleteBackground: " + virtualBackgroundInfo.name);
        if (!virtualBackgroundInfo.isPreset()) {
            ((AbstractC62216c.AbstractC62218b) mo92551a()).mo215200a(virtualBackgroundInfo, dVar);
        }
    }

    /* renamed from: a */
    public void mo215435a(boolean z, AbstractC63598b<C62260i> bVar) {
        ((AbstractC62216c.AbstractC62217a) mo92554b()).mo215244a(z, bVar);
    }

    public C62293r(Context context, C61303k kVar, LabsUtils.AbstractC62209b bVar, AbstractC62216c.AbstractC62218b bVar2) {
        this.f156521a = kVar;
        this.f156522b = context;
        mo92553a(bVar2, new C62269o(bVar));
        bVar2.setViewDelegate(new C62298u(this));
    }
}
