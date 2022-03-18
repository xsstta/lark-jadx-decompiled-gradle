package com.ss.android.vc.meeting.module.preview.launch;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.C60978l;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.meeting.module.livestream.C62075j;
import com.ss.android.vc.meeting.module.preview.launch.C62760a;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vcxp.annotation.XMethod;
import io.reactivex.p3457e.C68296b;

/* access modifiers changed from: package-private */
public class MeetingPreviewLaunchView$3 implements XConsumer<MeetingCheckData> {

    /* renamed from: a */
    final /* synthetic */ C68296b f157900a;

    /* renamed from: b */
    final /* synthetic */ String f157901b;

    /* renamed from: c */
    final /* synthetic */ C62771d f157902c;

    @XMethod
    public void accept(MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue()) {
            TimeConsumeUtils.m248928a(this.f157900a);
            if (C62075j.m242554d()) {
                C63693e.m249686c();
                this.f157902c.mo216538k();
                VcBizSender.m249175a(((C62760a.AbstractC62763b.AbstractC62764a) this.f157902c.f157821d).mo216770f(), IDTypeEntity.GROUP_ID, false).mo219889a(new AbstractC63598b<C60978l>() {
                    /* class com.ss.android.vc.meeting.module.preview.launch.MeetingPreviewLaunchView$3.C627591 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        MeetingPreviewLaunchView$3.this.f157902c.f157807K.mo214799a(MeetingPreviewLaunchView$3.this.f157902c.f157810N, MeetingPreviewLaunchView$3.this.f157902c.f157811O, MeetingPreviewLaunchView$3.this.f157901b);
                    }

                    /* renamed from: a */
                    public void onSuccess(C60978l lVar) {
                        VideoChat videoChat;
                        C63693e.m249688d();
                        if (lVar != null) {
                            MeetingPreviewLaunchView$3.this.f157902c.f157807K.mo214803c(lVar.f152697b);
                            if (!(lVar.f152696a == null || lVar.f152696a.size() <= 0 || (videoChat = lVar.f152696a.get(0)) == null)) {
                                MeetingPreviewLaunchView$3.this.f157902c.f157807K.mo214797a(videoChat.getId());
                            }
                            MeetingPreviewLaunchView$3.this.f157902c.f157807K.mo214799a(MeetingPreviewLaunchView$3.this.f157902c.f157810N, MeetingPreviewLaunchView$3.this.f157902c.f157811O, MeetingPreviewLaunchView$3.this.f157901b);
                            return;
                        }
                        MeetingPreviewLaunchView$3.this.f157902c.f157807K.mo214799a(MeetingPreviewLaunchView$3.this.f157902c.f157810N, MeetingPreviewLaunchView$3.this.f157902c.f157811O, MeetingPreviewLaunchView$3.this.f157901b);
                    }
                });
                return;
            }
            this.f157902c.f157807K.mo214799a(this.f157902c.f157810N, this.f157902c.f157811O, this.f157901b);
        }
    }

    MeetingPreviewLaunchView$3(C62771d dVar, C68296b bVar, String str) {
        this.f157902c = dVar;
        this.f157900a = bVar;
        this.f157901b = str;
    }
}
