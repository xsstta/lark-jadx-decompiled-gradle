package com.ss.android.lark.mine.impl.statistics;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/JoinTeamHitPoint;", "", "()V", "Companion", "NodePath", "UserType", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class JoinTeamHitPoint {

    /* renamed from: a */
    public static final Companion f115571a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/JoinTeamHitPoint$UserType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", ShareHitPoint.f121869d, "getType", "()Ljava/lang/String;", "StandardUser", "SimpleUser", "Customer", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum UserType {
        StandardUser("B"),
        SimpleUser(C63954b.f161494a),
        Customer("C");
        
        private String value;

        public final String getType() {
            return this.value;
        }

        private UserType(String str) {
            this.value = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/JoinTeamHitPoint$Companion;", "", "()V", "sendJoinTeamClickEvent", "", "userType", "Lcom/ss/android/lark/mine/impl/statistics/JoinTeamHitPoint$UserType;", "sendMenuTeamJoinClickEvent", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.statistics.JoinTeamHitPoint$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo161016a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", "sidebar_menu");
            Statistics.sendEvent("click_use_by_orgs", jSONObject);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
