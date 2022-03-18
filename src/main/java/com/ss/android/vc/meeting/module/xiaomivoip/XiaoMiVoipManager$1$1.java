package com.ss.android.vc.meeting.module.xiaomivoip;

import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61273c;
import com.ss.android.vc.meeting.module.xiaomivoip.C63460a;
import com.ss.android.vc.service.impl.VideoChatService;

/* access modifiers changed from: package-private */
public class XiaoMiVoipManager$1$1 implements VideoChatService.OnInitFinishListener {

    /* renamed from: a */
    final /* synthetic */ ax f160310a;

    /* renamed from: b */
    final /* synthetic */ C63460a.C634611 f160311b;

    @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
    public void onInited() {
        C61273c.m238400a(this.f160310a.f152663a, this.f160310a.f152664b);
    }

    XiaoMiVoipManager$1$1(C63460a.C634611 r1, ax axVar) {
        this.f160311b = r1;
        this.f160310a = axVar;
    }
}
