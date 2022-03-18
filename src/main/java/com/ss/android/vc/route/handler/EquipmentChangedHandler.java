package com.ss.android.vc.route.handler;

import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.net.request.VcBizSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/route/handler/EquipmentChangedHandler;", "", "()V", "onRequest", "", "meetingId", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.i.a.a */
public final class EquipmentChangedHandler {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.i.a.a$a */
    static final class RunnableC61011a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f152869a;

        RunnableC61011a(String str) {
            this.f152869a = str;
        }

        public final void run() {
            boolean z;
            MeetingManager a = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
            AbstractC61294b l = a.mo211908l();
            String str = this.f152869a;
            if (str == null) {
                if (l != null) {
                    str = l.mo212055d();
                } else {
                    str = null;
                }
            }
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && l != null && l.mo212065n()) {
                String c = VideoChatModuleDependency.m236630c();
                String b = VideoChatModuleDependency.m236629b();
                String k = C60776r.m236153k();
                Intrinsics.checkExpressionValueIsNotNull(k, "VCDeviceUtils.getMicrophoneName()");
                String l2 = C60776r.m236154l();
                Intrinsics.checkExpressionValueIsNotNull(l2, "VCDeviceUtils.getSpeakerName()");
                String m = C60776r.m236155m();
                Intrinsics.checkExpressionValueIsNotNull(m, "VCDeviceUtils.getCameraName()");
                VcBizSender.m249222a(str, c, b, k, l2, m);
            }
        }
    }

    /* renamed from: a */
    public final void mo210471a(String str) {
        C60735ab.m236018e(new RunnableC61011a(str));
    }
}
