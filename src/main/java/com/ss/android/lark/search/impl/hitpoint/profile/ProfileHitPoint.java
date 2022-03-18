package com.ss.android.lark.search.impl.hitpoint.profile;

import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/profile/ProfileHitPoint;", "", "()V", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.c.d.a */
public final class ProfileHitPoint {

    /* renamed from: a */
    public static final Companion f131905a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/profile/ProfileHitPoint$Companion;", "", "()V", "PROFILE_LOCATION", "", "PROFILE_POSITION", "PROFILE_QUERY_LENGTH", "PROFILE_SESSION_ID", "PROFILE_USER_ID", "TAG", "sendClickProfile", "", SearchIntents.EXTRA_QUERY, "userId", "position", "", "location", "page", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.c.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo182048a(String str, String str2, int i, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str3, "location");
            Intrinsics.checkParameterIsNotNull(str4, "page");
            Log.m165379d("ProfileHitPoint", "jump to profile from " + str4 + ", position: " + i);
            JSONObject jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put("query_length", str.length());
            }
            if (str2 != null) {
                jSONObject.put("user_id", str2);
            }
            jSONObject.put("result_position", i);
            jSONObject.put("search_location", str3);
            C53883a a = C53883a.m208794a();
            Intrinsics.checkExpressionValueIsNotNull(a, "NetSearchSessionManager.getInstance()");
            jSONObject.put("search_session_ID", a.mo183799b());
            Statistics.sendEvent("search_view_profile", jSONObject);
        }
    }
}
