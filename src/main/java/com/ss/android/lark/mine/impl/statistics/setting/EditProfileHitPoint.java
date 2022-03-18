package com.ss.android.lark.mine.impl.statistics.setting;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/setting/EditProfileHitPoint;", "", "()V", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.statistics.c.a */
public final class EditProfileHitPoint {

    /* renamed from: a */
    public static final Companion f115575a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m181472a() {
        f115575a.mo161020b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m181473a(boolean z) {
        f115575a.mo161022c(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/setting/EditProfileHitPoint$Companion;", "", "()V", "getPermissionValue", "", "isPermission", "", "sendEditNameEntranceEvent", "", "sendEditProfileEvent", "sendSettingPersonClick", "sendSettingPersonView", "isMedalWallEntryShow", "sendTenantCertificationClick", "isTenantCertification", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.statistics.c.a$a */
    public static final class Companion {
        /* renamed from: d */
        private final String m181474d(boolean z) {
            return z ? "yes" : "no";
        }

        private Companion() {
        }

        /* renamed from: a */
        public final void mo161018a() {
            Statistics.sendEvent("edit_profile");
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo161020b() {
            Statistics.sendEvent("setting_main_personal_link_click", new JSONObject().put("click", "my_medal").put("target", "profile_avatar_medal_wall_view"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo161019a(boolean z) {
            Statistics.sendEvent("edit_name_entrance", new JSONObject().put("is_permission", m181474d(z)));
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo161022c(boolean z) {
            Statistics.sendEvent("setting_main_personal_link_view", new JSONObject().put("is_medal_wall_entry_shown", String.valueOf(z)));
        }

        /* renamed from: b */
        public final void mo161021b(boolean z) {
            Statistics.sendEvent("other_certification_click", new JSONObject().put("is_verified", z));
        }
    }
}
