package com.ss.android.lark.create.groupchat.impl.statistics;

import android.text.TextUtils;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/PublicGroupHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.d */
public final class PublicGroupHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f93891a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/PublicGroupHitPoint$Companion;", "", "()V", "ADD_DES", "", "GROUP_CREATE", "GROUP_CREATE_MOBILE_NEXTPAGE_CLICK", "GROUP_TYPE", "MEMBERS_NUMBER", "MODE", "TYPE", "sendGroupCreateEvent", "", "isPublic", "", "isCrossTenant", "mode", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "description", "memberNumber", "", "sendGroupCreateNameErrorEvent", "sendGroupCreateNextPageClickEvent", "groupType", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo134222a() {
            Statistics.sendEvent("group_create_publicgroup_namerepeat_err");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo134223a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "groupType");
            Statistics.sendEvent("group_create_mobile_nextpage_click", new JSONObject().put("group_type", str));
        }

        /* renamed from: a */
        public final void mo134224a(boolean z, boolean z2, CreateGroupMode createGroupMode, String str, Number number) {
            String str2;
            String str3;
            String str4;
            Intrinsics.checkParameterIsNotNull(createGroupMode, "mode");
            Intrinsics.checkParameterIsNotNull(str, "description");
            Intrinsics.checkParameterIsNotNull(number, "memberNumber");
            if (z2) {
                str2 = "external";
            } else if (z) {
                str2 = "public";
            } else {
                str2 = "private";
            }
            int i = C36399e.f93892a[createGroupMode.ordinal()];
            if (i == 1) {
                str3 = "classic";
            } else if (i == 2) {
                str3 = ChatTypeStateKeeper.f135670e;
            } else if (i == 3) {
                str3 = "secret";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            JSONObject put = new JSONObject().put(ShareHitPoint.f121869d, str2).put("mode", str3);
            if (TextUtils.isEmpty(str)) {
                str4 = C64034n.f161683a;
            } else {
                str4 = "y";
            }
            Statistics.sendEvent("group_create", put.put("add_description", str4).put("members_number", number));
        }
    }
}
