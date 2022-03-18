package com.ss.android.vc.meeting.module.meetingdialog.sip;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.PSTNInfo;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.d */
public class C62440d implements ISIPInviteContract.AbstractC62429a {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract.AbstractC62429a
    /* renamed from: a */
    public void mo215828a(String str, String str2, ParticipantType participantType) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ByteviewUser(str, "0", ParticipantType.valueOf(participantType.getNumber())));
        VcBizSender.m249240b(arrayList, str2).mo219896d();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract.AbstractC62429a
    /* renamed from: a */
    public void mo215829a(String str, String str2, ParticipantType participantType, AbstractC63598b<C60955ab> bVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new PSTNInfo(str, "", participantType, ""));
        VcBizSender.m249201a(arrayList, str2).mo219893b(bVar);
    }
}
