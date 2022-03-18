package com.ss.android.vc.meeting.module.meetingdialog.pstn;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.PSTNInfo;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.d */
public class C62419d implements IPstnInviteContract.AbstractC62388a {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62388a
    /* renamed from: a */
    public void mo215703a(List<String> list, AbstractC63598b<List<Participant>> bVar) {
        VcBizSender.m249255c(list).mo219889a(bVar);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62388a
    /* renamed from: a */
    public void mo215701a(String str, String str2) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ByteviewUser(str, "0", ParticipantType.PSTN_USER));
        VcBizSender.m249240b(arrayList, str2).mo219896d();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62388a
    /* renamed from: a */
    public void mo215702a(String str, String str2, String str3, AbstractC63598b<C60955ab> bVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new PSTNInfo(str2, "", ParticipantType.PSTN_USER, str));
        VcBizSender.m249201a(arrayList, str3).mo219893b(bVar);
    }
}
