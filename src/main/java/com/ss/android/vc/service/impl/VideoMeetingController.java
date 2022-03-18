package com.ss.android.vc.service.impl;

import android.app.Activity;
import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.JoinCalendarGroupMeetingEntityRequest;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewLauncher;
import com.ss.android.vc.statistics.p3180a.C63697g;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;

@XClass(isStatic = true, runOnProcess = XProcess.VC)
public class VideoMeetingController {
    /* renamed from: a */
    private static Activity m249636a() {
        if (DesktopUtil.m144301a(ar.m236694a())) {
            return C36519d.m144080a().mo134826h();
        }
        return VideoChatModuleDependency.getLifeCycleDependency().mo196414b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.service.impl.VideoMeetingController$1 */
    public static /* synthetic */ class C636811 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160760a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.entity.response.IDTypeEntity[] r0 = com.ss.android.vc.entity.response.IDTypeEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.service.impl.VideoMeetingController.C636811.f160760a = r0
                com.ss.android.vc.entity.response.IDTypeEntity r1 = com.ss.android.vc.entity.response.IDTypeEntity.UNIQUE_ID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.service.impl.VideoMeetingController.C636811.f160760a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.response.IDTypeEntity r1 = com.ss.android.vc.entity.response.IDTypeEntity.GROUP_ID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.service.impl.VideoMeetingController.C636811.f160760a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.response.IDTypeEntity r1 = com.ss.android.vc.entity.response.IDTypeEntity.MEETING_ID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.service.impl.VideoMeetingController.C636811.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m249637a(Context context, String str, String str2, VideoChat.VendorType vendorType) {
        if (context == null) {
            C63697g.m249707e();
        } else if (context == null || C60785x.m236238b()) {
            C60700b.m235851b("VideoMeetingController", "[joinVideoMeeting]", "start ...");
            launchPreviewPage(m249636a(), null, null, str, IDTypeEntity.MEETING_ID, "", str2, vendorType);
        } else {
            LKUIToast.show(context.getApplicationContext(), (int) R.string.View_G_NoConnection);
            C63697g.m249707e();
        }
    }

    /* renamed from: a */
    public static void m249638a(Context context, String str, String str2, IDTypeEntity iDTypeEntity, String str3, String str4, VideoChat.VendorType vendorType) {
        if (context == null) {
            C63697g.m249707e();
        } else if (context == null || C60785x.m236238b()) {
            C60700b.m235851b("VideoMeetingController", "[launchVideoMeeting]", "start ...");
            launchPreviewPage(m249636a(), str, str2, null, iDTypeEntity, str3, str4, vendorType);
        } else {
            LKUIToast.show(context.getApplicationContext(), (int) R.string.View_G_NoConnection);
            C63697g.m249707e();
        }
    }

    @XMethod
    private static void launchPreviewPage(Context context, String str, String str2, String str3, IDTypeEntity iDTypeEntity, String str4, String str5, VideoChat.VendorType vendorType) {
        C60700b.m235851b("VideoMeetingController", "[launchPreviewPage]", "start " + iDTypeEntity);
        int i = C636811.f160760a[iDTypeEntity.ordinal()];
        if (i == 1) {
            MeetingPreviewLauncher.showCalendarJoinPreviewPage(context, str4, str, str2, JoinCalendarGroupMeetingEntityRequest.EntrySource.FROM_GROUP.getNumber(), str5, vendorType);
        } else if (i == 2) {
            MeetingPreviewLauncher.m245466a(context, str2, str5, vendorType);
        } else if (i != 3) {
            C60700b.m235864f("VideoMeetingController", "[launchPreviewPage2]", "Unknown id type " + iDTypeEntity);
        } else {
            MeetingPreviewLauncher.showJoinPreviewPage(context, str4, str3, false, str5, vendorType);
        }
    }
}
