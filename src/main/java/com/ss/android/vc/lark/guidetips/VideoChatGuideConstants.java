package com.ss.android.vc.lark.guidetips;

import java.util.ArrayList;
import java.util.List;

public class VideoChatGuideConstants {

    /* renamed from: a */
    private static final List<String> f152998a;

    public enum GuideType {
        Normal,
        Livestream,
        Subtitle,
        LiveSetting,
        LanguageInterpretation,
        chatAndReaction,
        BreakoutRoom
    }

    /* renamed from: a */
    public static List<String> m237575a() {
        return f152998a;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f152998a = arrayList;
        arrayList.add("all_lark_view_video_meeting_moved");
        arrayList.add("all_vc_subtitles");
        arrayList.add("all_vc_meet_live");
        arrayList.add("all_vc_meet_live_entrance");
        arrayList.add("mobile_vc_follow_free_browse");
        arrayList.add("mobile_vc_magic_share_back");
        arrayList.add("mobile_magic_share_free_browse");
        arrayList.add("mobile_magic_share_to_presenter");
        arrayList.add("mobile_magic_share_lanscape");
        arrayList.add("android_vc_new_onboarding");
        arrayList.add("all_vc_subtitles_history");
        arrayList.add("all_vc_subtitles_setting");
        arrayList.add("pc_vc_hide_controlbar");
        arrayList.add("all_vc_live_layout_setting");
        arrayList.add("android_vc_tab_recentmeetings_onboarding");
        arrayList.add("vc_follower_start_annotate");
        arrayList.add("mobile_vc_magic_share_hide_video");
        arrayList.add("mobile_vc_chatandreaction");
        arrayList.add("mobile_vc_beautyandfilterandanimoji");
    }
}
