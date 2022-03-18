package com.ss.android.lark.appcenter.wrapper.vote.statistics;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/appcenter/wrapper/vote/statistics/VoteHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.appcenter.wrapper.b.a.a */
public final class VoteHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f72953a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/appcenter/wrapper/vote/statistics/VoteHitPoint$Companion;", "", "()V", "sendVoteClickSubmit", "", "itemCount", "", "isSingleVote", "", "voteId", "sendVoteItemClick", "selectStatus", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.appcenter.wrapper.b.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo103335a(String str, boolean z, String str2) {
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "itemCount");
            Intrinsics.checkParameterIsNotNull(str2, "voteId");
            JSONObject put = new JSONObject().put("item_count", str);
            if (z) {
                str3 = "single";
            } else {
                str3 = "multi";
            }
            Statistics.sendEvent("ex_platform_click_vote_submit", put.put("vote_type", str3).put("vote_id", str2));
        }

        /* renamed from: a */
        public final void mo103336a(boolean z, String str, boolean z2) {
            String str2;
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "voteId");
            JSONObject jSONObject = new JSONObject();
            if (z2) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            JSONObject put = jSONObject.put("select_status", str2);
            if (z) {
                str3 = "single";
            } else {
                str3 = "multi";
            }
            Statistics.sendEvent("ex_platform_click_vote_items", put.put("vote_type", str3).put("vote_id", str));
        }
    }
}
