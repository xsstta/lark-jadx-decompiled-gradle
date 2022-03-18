package com.ss.android.vc.meeting.module.preview.guest;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.meeting.module.preview.AbstractC62710d;
import com.ss.android.vc.meeting.module.preview.guest.C62733a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XProcess;

public class MeetingPreviewGuestModel extends AbstractC62710d<C62733a.AbstractC62734a.AbstractC62735a> implements C62733a.AbstractC62734a {

    @XClass(autoRelease = true, runOnProcess = XProcess.Original)
    public interface IGuestLoginCallback {
    }

    @XClass(autoRelease = true, runOnProcess = XProcess.Original)
    public interface ILogoutCallback {
        void onResult(boolean z);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62710d, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: a */
    public void mo216505a() {
        ((C62733a.AbstractC62734a.AbstractC62735a) this.f157788a).mo216513a((OpenChatter) null);
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62734a
    /* renamed from: e */
    public boolean mo216717e() {
        return ((C62733a.AbstractC62734a.AbstractC62735a) this.f157788a).mo216517a();
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62734a
    /* renamed from: f */
    public boolean mo216718f() {
        return ((C62733a.AbstractC62734a.AbstractC62735a) this.f157788a).mo216518b();
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62734a
    /* renamed from: g */
    public boolean mo216719g() {
        return ((C62733a.AbstractC62734a.AbstractC62735a) this.f157788a).mo216519c();
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62734a
    /* renamed from: h */
    public String mo216720h() {
        return ((C62733a.AbstractC62734a.AbstractC62735a) this.f157788a).mo216523g();
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62734a
    /* renamed from: i */
    public String mo216721i() {
        return ((C62733a.AbstractC62734a.AbstractC62735a) this.f157788a).mo216524h();
    }
}
