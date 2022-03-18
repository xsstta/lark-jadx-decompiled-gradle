package com.ss.android.vc.service.impl;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.C60874a;
import com.ss.android.vc.dependency.IAccountInterceptor;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.UpdateVideoChatEntityRequest;
import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class AccountLogoutInterceptor implements IAccountInterceptor {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.service.impl.AccountLogoutInterceptor$a */
    public static class C63647a {

        /* renamed from: a */
        public static AccountLogoutInterceptor f160666a = new AccountLogoutInterceptor();
    }

    @Override // com.ss.android.vc.dependency.IAccountInterceptor
    /* renamed from: a */
    public int mo208724a() {
        return 0;
    }

    private AccountLogoutInterceptor() {
    }

    @XSingleton
    /* renamed from: b */
    public static AccountLogoutInterceptor m249558b() {
        return C63647a.f160666a;
    }

    @Override // com.ss.android.vc.dependency.IAccountInterceptor
    @XMethod
    public int interceptOnConfirm() {
        m249559c();
        VideoChatService.m249602d().mo220082b();
        return 1;
    }

    @Override // com.ss.android.vc.dependency.IAccountInterceptor
    @XMethod
    public boolean needIntercept() {
        return VideoChatService.m249602d().isOngoing(true);
    }

    /* renamed from: c */
    private void m249559c() {
        UpdateVideoChatEntityRequest.Action action;
        List<AbstractC61294b> b = MeetingManager.m238341a().mo211894b();
        if (b != null && b.size() > 0) {
            for (AbstractC61294b bVar : b) {
                if (!(bVar == null || bVar.mo212056e() == null)) {
                    if (bVar.mo212064m()) {
                        action = UpdateVideoChatEntityRequest.Action.CANCEL;
                    } else if (bVar.mo212063l()) {
                        action = UpdateVideoChatEntityRequest.Action.REFUSE;
                    } else {
                        action = UpdateVideoChatEntityRequest.Action.LEAVE;
                    }
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    VcBizSender.m249155a(action, bVar.mo212056e().getId()).mo219893b(new AbstractC63598b<ax>() {
                        /* class com.ss.android.vc.service.impl.AccountLogoutInterceptor.C636461 */

                        /* renamed from: a */
                        public void onSuccess(ax axVar) {
                            C60700b.m235851b("AccountLogoutInterceptor", "[refuseOrLeaveCurrentMeeting]", "success");
                            countDownLatch.countDown();
                        }

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            C60700b.m235864f("AccountLogoutInterceptor", "[refuseOrLeaveCurrentMeeting2]", "error: " + eVar.toString());
                            countDownLatch.countDown();
                        }
                    });
                    C60735ab.m236004a(countDownLatch);
                }
            }
        }
    }

    @Override // com.ss.android.vc.dependency.IAccountInterceptor
    @XMethod
    public C60874a getDetail() {
        int i;
        Context a = ar.m236694a();
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar == null || kVar.mo212057f() != VideoChat.Type.MEET) {
            i = R.string.View_G_LeaveCallIfSwitchInfo;
        } else if (kVar.mo212100R()) {
            i = R.string.View_MV_IfSwitchIdentityLeaveMeetingScreenShare_PopUpWindow;
        } else {
            i = R.string.View_M_LeaveIfSwitchInfo;
        }
        return new C60874a(null, a.getString(i), a.getString(R.string.View_G_LeaveAndLogOut), a.getString(R.string.View_G_CancelButton));
    }
}
