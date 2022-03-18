package com.ss.android.lark.member_manage.impl.statistics;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/MessageHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.statistics.c */
public final class MessageHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f114608a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/MessageHitPoint$Companion;", "", "()V", "CHOICE_TYPE_KEY", "", "CHOICE_TYPE_VALUE_GUESS", "CHOICE_TYPE_VALUE_NORMAL", "GUESS_TYPE", "IS_QUERY", "MEMBER_TYPE", "MEMBER_TYPE_EXTERNAL", "MEMBER_TYPE_INTERNAL", "MESSAGE_NOTICE_ATALLL", "MESSAGE_NOTICE_ATOTHER", "MESSAGE_NOTICE_KEY", "MESSAGE_NOTICE_ME", "SEARCH_LOCATION", "sendAtSomebody", "", "isFromGuess", "", "atId", "loginUserId", "isOutChatUser", "isQuery", "searchLocation", "guessType", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.statistics.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo159948a(boolean z, String str, String str2, boolean z2, boolean z3, String str3, String str4) {
            String str5;
            String str6;
            String str7;
            String str8;
            Intrinsics.checkParameterIsNotNull(str, "atId");
            Intrinsics.checkParameterIsNotNull(str2, "loginUserId");
            Intrinsics.checkParameterIsNotNull(str3, "searchLocation");
            Intrinsics.checkParameterIsNotNull(str4, "guessType");
            if (z) {
                str5 = "guess";
            } else {
                str5 = "normal";
            }
            if (Intrinsics.areEqual(str, str2)) {
                str6 = "me";
            } else if (Intrinsics.areEqual(str, "all")) {
                str6 = "atall";
            } else {
                str6 = "atother";
            }
            if (z2) {
                str7 = "external";
            } else {
                str7 = "internal";
            }
            if (z3) {
                str8 = "y";
            } else {
                str8 = C64034n.f161683a;
            }
            Statistics.sendEvent("noticelist_choice", new JSONObject().put("choicetype", str5).put("notice", str6).put("member_type", str7).put("is_query", str8).put("search_location", str3).put("guess_type", str4));
        }
    }
}
