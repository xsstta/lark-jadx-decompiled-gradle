package com.ss.android.vc.service;

import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.vc.service.c */
public class C63634c {

    /* renamed from: a */
    private static final Map<String, Boolean> f160621a;

    /* renamed from: a */
    public static Set<String> m249494a() {
        return f160621a.keySet();
    }

    static {
        HashMap hashMap = new HashMap();
        f160621a = hashMap;
        hashMap.put("byteview.callmeeting.android.magic_share_new_docs", false);
        hashMap.put("byteview.callmeeting.android.magic_share_new_sheets", false);
        hashMap.put("byteview.callmeeting.android.magic_share_new_mindnotes", false);
        hashMap.put("byteview.meeting.android.magic_share_docx", false);
        hashMap.put("byteview.meeting.android.magic_share_docx_beta", false);
        hashMap.put("lark.client.vctab.opt", false);
        hashMap.put("lark.client.vctab.opt.v2", false);
        hashMap.put("lark.client.vctab.statistics", false);
        hashMap.put("byteview.call.encrypted.android", false);
        hashMap.put("byteview.meeting.android.recording", true);
        hashMap.put("byteview.meeting.android.live_meeting", true);
        hashMap.put("byteview.meeting.android.live_legal", false);
        hashMap.put("byteview.meeting.android.live_anonymous_setting", false);
        hashMap.put("byteview.meeting.android.live_layout_setting", true);
        hashMap.put("byteview.meeting.android.live_livechat_setting", true);
        hashMap.put("lark.mobile.display_textsize", false);
        hashMap.put("byteview.meeting.android.mute_when_diff", false);
        hashMap.put("byteview.meeting.android.muteonentry", false);
        hashMap.put("byteview.asr.subtitle", true);
        hashMap.put("byteview.callmeeting.android.subtitle_recordinghint", true);
        hashMap.put("byteview.meeting.android.simu_interpretation", false);
        hashMap.put("byteview.uplog", false);
        hashMap.put("byteview.meeting.android.lc_log_notice", false);
        hashMap.put("byteview.meeting.android.background_decorate", false);
        hashMap.put("byteview.callmeeting.android.magic_share_presenter_position_guide", false);
        hashMap.put("byteview.meeting.android.tab", false);
        hashMap.put("byteview.callmeeting.android.see_annotation", false);
        hashMap.put("byteview.callmeeting.android.make_annotation", false);
        hashMap.put("byteview.meeting.android.setting", false);
        hashMap.put("byteview.call.android.status_connecting", false);
        hashMap.put("byteview.meeting.android.copymeetinglink", true);
        hashMap.put("byteview.meeting.android.chat", true);
        hashMap.put("byteview.meeting.android.copyinvitation", false);
        hashMap.put("byteview.meeting.android.invitepstn", false);
        hashMap.put("byteview.callmeeting.android.subtitle.spokenlangsetting", false);
        hashMap.put("byteview.callmeeting.android.magic_share_new_ccm", false);
        hashMap.put("byteview.meeting.android.mute_prompt", false);
        hashMap.put("lark.client.contact.opt", false);
        hashMap.put("byteview.meeting.android.copysipinvitation", false);
        hashMap.put("byteview.meeting.android.invitesip", false);
        hashMap.put("byteview.meeting.android.meeting_lobby", false);
        hashMap.put("byteview.meeting.android.forced_mute", false);
        hashMap.put("byteview.meeting.android.vc_labs", true);
        hashMap.put("byteview.callmeeting.android.lm_tab", false);
        hashMap.put("byteview.callmeeting.android.feedback_display", false);
        hashMap.put("byteview.meeting.android.virtual_background", true);
        hashMap.put("byteview.meeting.android.vc_xp_config_isenabled", false);
        hashMap.put("byteview.meeting.android.vc_monitor_mainlooper", false);
        hashMap.put("byteview.meeting.android.vc_sketch_gl", false);
        hashMap.put("lark.newguide.switch.vc", false);
        hashMap.put("byteview.meeting.android.live.tab", false);
        hashMap.put("byteview.meeting.android.live.float_window", false);
        hashMap.put("byteview.meeting.android.animoji", false);
        hashMap.put("byteview.meeting.android.filter", false);
        hashMap.put("byteview.meeting.android.touchup", false);
        hashMap.put("byteview.meeting.android.auto_record", false);
        hashMap.put("byteview.callmeeting.android.screenshare_entry", false);
        hashMap.put("byteview.meeting.android.mirror", true);
        hashMap.put("byteview.callmeeting.android.record_reconfirm", false);
        hashMap.put("byteview.callmeeting.android.magic_share_google_drive", false);
        hashMap.put("byteview.meeting.android.share_audio", true);
        hashMap.put("byteview.meeting.copyh323invitation", false);
        hashMap.put("byteview.meeting.android.speakerdisconnect", false);
        hashMap.put("byteview.meeting.android.rtc.is_render_optimize", false);
        hashMap.put("byteview.meeting.android.single_instance", false);
        hashMap.put("byteview.callmeeting.android.subtitle_delete_spoken_language", false);
        hashMap.put("byteview.meeting.dialpad", false);
        hashMap.put("byteview.meeting.android.proximity_opt", false);
        hashMap.put("byteview.meeting.android.remove_surface", false);
        hashMap.put("byteview.callmeeting.android.meetingstab_rename", false);
        hashMap.put("byteview.meeting.businessphone", false);
        hashMap.put("byteview.pstn.android.businessphone_mobile", false);
        hashMap.put("byteview.callmeeting.android.back_to_last_location", false);
        hashMap.put("byteview.meeting.android.dynamicdegrade", false);
        hashMap.put("byteview.meeting.android.echo_detection", false);
        hashMap.put("byteview.meeting.android.periodic_task_schedule_pool", false);
        hashMap.put("byteview.meeting.android.magic_share_bitable", false);
        hashMap.put("vc.share.mobile.rooms.mute.audio.device", false);
    }

    /* renamed from: a */
    public static boolean m249495a(String str) {
        Boolean bool = f160621a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m249496b(String str) {
        if (GuestJoinMeetingUtil.m245480b()) {
            return m249497c(str);
        }
        if (VideoChatModule.m235645a() != null) {
            return VideoChatModule.m235645a().mo196393a(str);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m249497c(String str) {
        if (VideoChatModule.m235645a() != null) {
            return VideoChatModule.m235645a().mo196395b(str);
        }
        return false;
    }
}
