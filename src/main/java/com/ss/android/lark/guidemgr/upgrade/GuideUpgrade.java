package com.ss.android.lark.guidemgr.upgrade;

import android.text.TextUtils;
import com.ss.android.lark.guidemgr.C38700a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/guidemgr/upgrade/GuideUpgrade;", "", "()V", "guideKeyFgKeyMap", "", "", "guideKeyFgValueMap", "", "getNewGuideFgEnable", "guideKey", "initImFg", "", "initVcFg", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guidemgr.g.a */
public final class GuideUpgrade {

    /* renamed from: a */
    public static final GuideUpgrade f99623a;

    /* renamed from: b */
    private static final Map<String, String> f99624b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, Boolean> f99625c = new LinkedHashMap();

    private GuideUpgrade() {
    }

    static {
        GuideUpgrade aVar = new GuideUpgrade();
        f99623a = aVar;
        aVar.m152970b();
        aVar.m152969a();
    }

    /* renamed from: b */
    private final void m152970b() {
        Map<String, String> map = f99624b;
        map.put("all_vc_subtitles", "lark.newguide.switch.vc");
        map.put("all_vc_meet_live_entrance", "lark.newguide.switch.vc");
        map.put("all_vc_meet_live_entrance", "lark.newguide.switch.vc");
        map.put("mobile_vc_magic_share_back", "lark.newguide.switch.vc");
        map.put("mobile_magic_share_free_browse", "lark.newguide.switch.vc");
        map.put("mobile_magic_share_to_presenter", "lark.newguide.switch.vc");
        map.put("mobile_magic_share_lanscape", "lark.newguide.switch.vc");
        map.put("all_vc_subtitall_vc_subtitles_historyles", "lark.newguide.switch.vc");
        map.put("all_vc_subtitles_setting", "lark.newguide.switch.vc");
        map.put("all_vc_live_layout_setting", "lark.newguide.switch.vc");
        map.put("all_lark_view_video_meeting_moved", "lark.newguide.switch.vc");
    }

    /* renamed from: a */
    private final void m152969a() {
        Map<String, String> map = f99624b;
        map.put("mobile_read_status", "lark.newguide.switch.im");
        map.put("mobile_mention_status", "lark.newguide.switch.im");
        map.put("mobile_sync_message", "lark.newguide.switch.im");
        map.put("mobile_sidebar", "lark.newguide.switch.im");
        map.put("all_feed_mention_you", "lark.newguide.switch.im");
        map.put("all_feed_mention_all", "lark.newguide.switch.im");
        map.put("all_add_pin", "lark.newguide.switch.im");
        map.put("all_view_pin", "lark.newguide.switch.im");
        map.put("mobile_setting_sidebar", "lark.newguide.switch.im");
        map.put("all_auto_translation_setting", "lark.newguide.switch.im");
        map.put("all_notification_messenger_toggle", "lark.newguide.switch.im");
        map.put("meeting_notes_create", "lark.newguide.switch.im");
        map.put("all_helpdesk_chat_sidebar_mini_program", "lark.newguide.switch.im");
        map.put("mobile_suite_ai_smart_compose", "lark.newguide.switch.im");
        map.put("mobile_chat_ai_suggestions", "lark.newguide.switch.im");
        map.put("all_create_topic_group", "lark.newguide.switch.im");
        map.put("all_on_leave_status", "lark.newguide.switch.im");
        map.put("pc_multi_tenant", "lark.newguide.switch.im");
        map.put("all_badge_change_setting", "lark.newguide.switch.im");
        map.put("all_new_onboarding_guide", "lark.newguide.switch.im");
        map.put("all_new_onboarding_video", "lark.newguide.switch.im");
        map.put("mobile_switch_team_guidance_v2", "lark.newguide.switch.im");
        map.put("all_profile_nonfriend_chatcta", "lark.newguide.switch.im");
    }

    /* renamed from: a */
    public final boolean mo141920a(String str) {
        if (str == null) {
            return true;
        }
        String str2 = f99624b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        Map<String, Boolean> map = f99625c;
        if (!map.containsKey(str)) {
            boolean a = C38700a.m152832a().mo141835a(str2);
            map.put(str, Boolean.valueOf(a));
            return a;
        }
        Boolean bool = map.get(str);
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        return bool.booleanValue();
    }
}
