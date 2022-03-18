package com.ss.android.vc.meeting.module.preview.facade;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.calender.MeetingPreviewCalendarFragment;
import com.ss.android.vc.meeting.module.preview.guest.C62738b;
import com.ss.android.vc.meeting.module.preview.interview.MeetingPreviewInterviewFragment;
import com.ss.android.vc.meeting.module.preview.launch.C62765b;
import com.ss.android.vc.meeting.module.preview.openplatform.MeetingPreviewOpenPlatformFragment;
import com.ss.android.vc.meeting.module.preview.p3152a.C62661b;
import com.ss.android.vc.meeting.module.preview.p3153b.C62675b;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vc.statistics.p3180a.C63697g;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;

@XClass(isStatic = true, runOnProcess = XProcess.VC)
public class MeetingPreviewLauncher {
    /* renamed from: a */
    public static AbstractC62684c m245463a(int i) {
        switch (i) {
            case 1:
                return new C62765b();
            case 2:
                return new C62675b();
            case 3:
                return new MeetingPreviewCalendarFragment();
            case 4:
                return new MeetingPreviewInterviewFragment();
            case 5:
                return new C62661b();
            case 6:
                return new C62738b();
            case 7:
                return new MeetingPreviewOpenPlatformFragment();
            default:
                return null;
        }
    }

    /* renamed from: a */
    private static void m245464a(Context context, Bundle bundle) {
        if (context == null) {
            C63697g.m249707e();
            return;
        }
        C63690d.m249677a();
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, MeetingPreviewActivity.class);
            if (context instanceof Application) {
                intent.setFlags(268435456);
                C60700b.m235851b("MeetingPreviewLauncher", "[goToPreviewPage]", "context is not Activity");
            }
            intent.putExtras(bundle);
            context.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(context, MeetingPreviewDesktopActivity.class);
        if (context instanceof Application) {
            intent2.setFlags(268435456);
            C60700b.m235851b("MeetingPreviewLauncher", "[goToPreviewPage2]", "context is not Activity");
        }
        intent2.putExtras(bundle);
        context.startActivity(intent2);
    }

    /* renamed from: a */
    public static void m245465a(Context context, String str, VideoChat.VendorType vendorType, String str2) {
        if (context == null) {
            context = ar.m236694a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("param_preview_type", 5);
        bundle.putInt("param_start_source", 1);
        bundle.putString("param_env_id", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("param_meeting_no", str2);
        }
        if (vendorType != null) {
            bundle.putInt("param_vendor_type", vendorType.getNumber());
        }
        m245464a(context, bundle);
    }

    /* renamed from: a */
    public static void m245466a(Context context, String str, String str2, VideoChat.VendorType vendorType) {
        if (context == null) {
            context = ar.m236694a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("param_start_source", 1);
        bundle.putInt("param_preview_type", 1);
        bundle.putString("param_launch_chat_id", str);
        bundle.putString("param_env_id", str2);
        if (vendorType != null) {
            bundle.putInt("param_vendor_type", vendorType.getNumber());
        }
        m245464a(context, bundle);
    }

    /* renamed from: b */
    public static void m245470b(Context context, String str, String str2, String str3, boolean z) {
        if (context == null) {
            context = ar.m236694a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("param_preview_type", 6);
        bundle.putInt("param_start_source", 1);
        bundle.putString("param_env_id", str);
        bundle.putString("param_web_id", str3);
        bundle.putBoolean("param_enter_from_url", z);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("param_meeting_no", str2);
        }
        m245464a(context, bundle);
    }

    /* renamed from: a */
    public static void m245468a(Context context, String str, String str2, String str3, boolean z) {
        if (context == null) {
            context = ar.m236694a();
        }
        C60700b.m235851b("MeetingPreviewLauncher", "[showInterviewJoinPreviewPage]", "showInterviewJoinPreviewPage");
        Bundle bundle = new Bundle();
        bundle.putInt("param_preview_type", 4);
        bundle.putInt("param_start_source", 1);
        bundle.putString("param_meeting_title", UIHelper.getString(R.string.View_M_VideoInterview));
        bundle.putString("param_interview_id", str);
        bundle.putBoolean("param_enter_from_url", z);
        bundle.putString("param_interview_role", str2);
        bundle.putString("param_env_id", str3);
        m245464a(context, bundle);
    }

    @XMethod
    public static void showJoinPreviewPage(Context context, String str, String str2, boolean z, String str3, VideoChat.VendorType vendorType) {
        if (context == null) {
            context = ar.m236694a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("param_start_source", 1);
        bundle.putInt("param_preview_type", 2);
        bundle.putString("param_meeting_title", str);
        bundle.putString("param_card_meeting_id", str2);
        bundle.putBoolean("param_calendar_force", z);
        bundle.putString("param_env_id", str3);
        if (vendorType != null) {
            bundle.putInt("param_vendor_type", vendorType.getNumber());
        }
        m245464a(context, bundle);
    }

    @XMethod
    public static void showCalendarJoinPreviewPage(Context context, String str, String str2, String str3, int i, String str4, VideoChat.VendorType vendorType) {
        if (context == null) {
            context = ar.m236694a();
        }
        m245467a(context, str, str2, str3, i, str4, vendorType, false);
    }

    /* renamed from: a */
    public static void m245469a(Context context, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4) {
        if (context == null) {
            context = ar.m236694a();
        }
        C60700b.m235851b("MeetingPreviewLauncher", "[showOpenPlatformJoinPreviewPage]", "showOpenPlatformJoinPreviewPage");
        Bundle bundle = new Bundle();
        bundle.putInt("param_preview_type", 7);
        bundle.putInt("param_start_source", 1);
        bundle.putBoolean("param_enter_from_url", z4);
        bundle.putBoolean("param_open_platform_mic_mute", z);
        bundle.putBoolean("param_open_platform_camera_mute", z2);
        bundle.putBoolean("param_open_platform_speaker", z3);
        bundle.putString("param_open_platform_reserve_id", str);
        bundle.putString("param_env_id", str2);
        m245464a(context, bundle);
    }

    /* renamed from: a */
    public static void m245467a(Context context, String str, String str2, String str3, int i, String str4, VideoChat.VendorType vendorType, boolean z) {
        if (context == null) {
            context = ar.m236694a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("param_preview_type", 3);
        bundle.putInt("param_start_source", 1);
        bundle.putString("param_meeting_title", str);
        bundle.putInt("param_calendar_entry_source", i);
        bundle.putBoolean("param_enter_from_url", z);
        bundle.putString("param_calendar_unique_id", str2);
        bundle.putString("param_calendar_chat_id", str3);
        bundle.putString("param_env_id", str4);
        if (vendorType != null) {
            bundle.putInt("param_vendor_type", vendorType.getNumber());
        }
        m245464a(context, bundle);
    }
}
