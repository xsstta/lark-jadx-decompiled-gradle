package com.ss.android.lark.create.groupchat.impl.statistics;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/P2PCreateGroupHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.c */
public final class P2PCreateGroupHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f93890a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/P2PCreateGroupHitPoint$Companion;", "", "()V", "sendP2PCreateGroupClickEvent", "", "location", "", "isSecret", "", "isExternal", "sendP2PCreateGroupSelectMemberConfirmEvent", "memberCount", "", "syncHistory", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo134220a(int i, boolean z, boolean z2) {
            String str;
            String str2;
            if (z2) {
                str = "secret";
            } else {
                str = "classic";
            }
            if (z) {
                str2 = "y";
            } else {
                str2 = C64034n.f161683a;
            }
            Statistics.sendEvent("single_to_group_select_member_confirm", new JSONObject().put(ShareHitPoint.f121869d, str).put("group_member_count", i).put("sync_history", str2));
        }

        /* renamed from: a */
        public final void mo134221a(String str, boolean z, boolean z2) {
            String str2;
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "location");
            if (z2) {
                str2 = "external";
            } else {
                str2 = "private";
            }
            if (z) {
                str3 = "secret";
            } else {
                str3 = "classic";
            }
            Statistics.sendEvent("single_to_group", new JSONObject().put("location", str).put(ShareHitPoint.f121868c, "single_setting").put(ShareHitPoint.f121869d, str2).put("mode", str3));
        }
    }
}
