package com.ss.android.vc.meeting.module.xiaomivoip;

import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.meeting.module.xiaomivoip.C63460a;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.service.impl.VideoChatService;

/* access modifiers changed from: package-private */
public class XiaoMiVoipManager$1$2 implements VideoChatService.OnInitFinishListener {

    /* renamed from: a */
    final /* synthetic */ ax f160312a;

    /* renamed from: b */
    final /* synthetic */ C63460a.C634611 f160313b;

    @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
    public void onInited() {
        VideoChatManager.m249444a().mo220105a(this.f160312a.f152663a);
    }

    XiaoMiVoipManager$1$2(C63460a.C634611 r1, ax axVar) {
        this.f160313b = r1;
        this.f160312a = axVar;
    }
}
