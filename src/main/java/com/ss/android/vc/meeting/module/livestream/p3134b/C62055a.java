package com.ss.android.vc.meeting.module.livestream.p3134b;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.event.aq;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.livestream.b.a */
public class C62055a {
    /* renamed from: a */
    private static void m242447a(String str, VideoChat videoChat) {
        String str2;
        if ("View_G_AuthenticationInputError".equals(str) || "View_G_AuthenticationMinor".equals(str) || "View_G_AuthenticationIdAssociated".equals(str)) {
            if ("View_G_AuthenticationInputError".equals(str)) {
                str2 = "wrong_id";
            } else if ("View_G_AuthenticationMinor".equals(str)) {
                str2 = "underage";
            } else if ("View_G_AuthenticationIdAssociated".equals(str)) {
                str2 = "linked_id";
            } else {
                str2 = "";
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", "identity_verification_error");
                jSONObject.put("error_name", str2);
                C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if ("View_G_TooManyAuthenticationAttempts".equals(str)) {
            aq.m250043a("vc_meeting_popup", "failed_five_times", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, videoChat);
        }
    }

    /* renamed from: a */
    private static void m242449a(String str, boolean z, VideoChat videoChat) {
        String str2;
        String str3;
        if ("View_G_AuthenticationMinor".equals(str)) {
            str2 = "underage";
        } else if ("View_G_AuthenticationIdAssociated".equals(str)) {
            str2 = "linked_id";
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z) {
                str3 = "finish";
            } else {
                str3 = "cancel";
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", str2);
                jSONObject.put("action_name", str3);
                C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m242444a(Activity activity, C63602e eVar, VideoChat videoChat) {
        String str;
        if (eVar != null && eVar.f160598a != null && !TextUtils.isEmpty(eVar.f160598a.message)) {
            String str2 = eVar.f160598a.message;
            if (eVar.f160598a.msg_i18n_key != null) {
                str = eVar.f160598a.msg_i18n_key.newKey;
            } else {
                str = "";
            }
            switch (eVar.mo219899a()) {
                case 238202:
                    m242446a(activity, str2, str, videoChat);
                    break;
                case 238203:
                    m242451b(activity, str2, str, videoChat);
                    break;
                case 238204:
                    m242453c(activity, str2, str, videoChat);
                    break;
            }
            m242447a(str, videoChat);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m242448a(String str, VideoChat videoChat, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m242449a(str, false, videoChat);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m242452b(String str, VideoChat videoChat, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m242449a(str, true, videoChat);
    }

    /* renamed from: b */
    private static void m242451b(Activity activity, String str, String str2, VideoChat videoChat) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.View_G_Quit).mo90712e(C60773o.m236126d(R.color.ud_R500)).mo90703a(new DialogInterface.OnClickListener(activity, str2, videoChat) {
            /* class com.ss.android.vc.meeting.module.livestream.p3134b.$$Lambda$a$5mQmR_GflCne0P2C_XLBPsgczU */
            public final /* synthetic */ Activity f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ VideoChat f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62055a.m271279lambda$5mQmR_GflCne0P2C_XLBPsgczU(this.f$0, this.f$1, this.f$2, dialogInterface, i);
            }
        }))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_secondary).mo90706b(R.string.View_G_CancelButton).mo90703a(new DialogInterface.OnClickListener(str2, videoChat) {
            /* class com.ss.android.vc.meeting.module.livestream.p3134b.$$Lambda$a$a2eHI1h3KdkhFZBxa7duW3jw2AI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ VideoChat f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62055a.lambda$a2eHI1h3KdkhFZBxa7duW3jw2AI(this.f$0, this.f$1, dialogInterface, i);
            }
        }))).titleBold(true)).titleLineCount(1)).title(R.string.View_VM_NotificationDefault)).message(str)).cancelable(false)).show();
    }

    /* renamed from: c */
    private static void m242453c(Activity activity, String str, String str2, VideoChat videoChat) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.View_G_Quit).mo90712e(C60773o.m236126d(R.color.ud_R500)).mo90703a(new DialogInterface.OnClickListener(activity, str2, videoChat) {
            /* class com.ss.android.vc.meeting.module.livestream.p3134b.$$Lambda$a$oyEVqAz2PNmxB6IPKQgQ9DYAcsE */
            public final /* synthetic */ Activity f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ VideoChat f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62055a.lambda$oyEVqAz2PNmxB6IPKQgQ9DYAcsE(this.f$0, this.f$1, this.f$2, dialogInterface, i);
            }
        }))).title(activity.getString(R.string.View_VM_NotificationDefault))).message(str)).cancelOnTouchOutside(false)).cancelable(false)).show();
    }

    /* renamed from: a */
    private static void m242446a(Activity activity, String str, String str2, VideoChat videoChat) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.View_G_OkButton).mo90712e(C60773o.m236126d(R.color.ud_B400)).mo90703a(new DialogInterface.OnClickListener(str2, videoChat) {
            /* class com.ss.android.vc.meeting.module.livestream.p3134b.$$Lambda$a$7cm6TJR0Xrq02MVgP9Pw3YMinY */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ VideoChat f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62055a.m271280lambda$7cm6TJR0Xrq02MVgP9Pw3YMinY(this.f$0, this.f$1, dialogInterface, i);
            }
        }))).title(activity.getString(R.string.View_VM_NotificationDefault))).message(str)).cancelOnTouchOutside(false)).cancelable(false)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m242445a(Activity activity, String str, VideoChat videoChat, DialogInterface dialogInterface, int i) {
        activity.finish();
        m242449a(str, true, videoChat);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m242450b(Activity activity, String str, VideoChat videoChat, DialogInterface dialogInterface, int i) {
        activity.finish();
        m242449a(str, true, videoChat);
    }
}
