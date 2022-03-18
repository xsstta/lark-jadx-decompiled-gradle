package com.ss.android.lark.ug.dyflow.feat;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.guide.biz.fg.GuideFG;
import com.ss.android.lark.guide.biz.p1915a.p1920c.C38576b;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.data.elements.ConfigElementData;
import com.ss.android.lark.ug.dyflow.common.service.FlowServiceUtils;
import com.ss.android.lark.ug.dyflow.feat.reminder.JoinTeamReminderData;
import com.ss.android.lark.ug.dyflow.feat.reminder.JoinTeamReminderHandler;
import com.ss.android.lark.ug.dyflow.feat.reminder.JoinTeamReminderView;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import com.ss.android.lark.utils.UIHelper;
import com.tt.frontendapiinterface.ApiHandler;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager;", "", "()V", "joinTeamReminderController", "Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController;", "mainActRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "setMainActRef", "", "activity", "updateData", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "ApmUtils", "Companion", "JoinTeamReminderController", "ReminderController", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReminderManager {

    /* renamed from: b */
    public static final Lazy f141468b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C57438c.INSTANCE);

    /* renamed from: c */
    public static final Companion f141469c = new Companion(null);

    /* renamed from: a */
    public WeakReference<Activity> f141470a;

    /* renamed from: d */
    private final JoinTeamReminderController f141471d = new JoinTeamReminderController();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e*\u0001\u0004\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0003J\u001a\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0003J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0003J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController;", "Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$ReminderController;", "()V", "onResumeEvent", "com/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$onResumeEvent$1", "Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$onResumeEvent$1;", "reminderHandler", "Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderHandler;", "state", "Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$State;", "teamJoinNotifyInfo", "Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$TeamJoinNotifyInfo;", "willShowUserId", "", "actively", "", "getMainAct", "Landroidx/fragment/app/FragmentActivity;", "isCurMainAct", "isMatched", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "removeCard", "", "removeReminderIfNeed", "reportEvent", "slotId", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reset", "showReminder", "showReminderIfNeed", "triggerSwitchTenant", "triggerTenantSwitchTipIfNeed", "updateData", "Companion", "State", "TeamJoinNotifyInfo", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class JoinTeamReminderController {

        /* renamed from: e */
        public static final Companion f141472e = new Companion(null);

        /* renamed from: a */
        public TeamJoinNotifyInfo f141473a;

        /* renamed from: b */
        public JoinTeamReminderHandler f141474b;

        /* renamed from: c */
        public State f141475c;

        /* renamed from: d */
        public String f141476d;

        /* renamed from: f */
        private final ReminderManager$JoinTeamReminderController$onResumeEvent$1 f141477f = new ReminderManager$JoinTeamReminderController$onResumeEvent$1(this);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$State;", "", "(Ljava/lang/String;I)V", "Ready", "Showing", "Removed", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        public enum State {
            Ready,
            Showing,
            Removed
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$Companion;", "", "()V", "CONFIG_KEY_IS_ACTIVE", "", "CONFIG_KEY_TENANT_ID", "CONFIG_KEY_TENANT_NAME", "CONFIG_KEY_TYPE", "CONFIG_KEY_USER_ID", "FLOW_ID", "", "RES_TEAM_JOIN_NOTIFY", "SLOT_ID_TEAM_JOIN_NOTIFY_MOBILE_LATER", "SLOT_ID_TEAM_JOIN_NOTIFY_MOBILE_SWITCH", "STEP_NAME", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$JoinTeamReminderController$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$TeamJoinNotifyInfo;", "", "userId", "", "tenantId", "tenantName", ShareHitPoint.f121869d, "isActive", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "getTenantId", "getTenantName", "getType", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$JoinTeamReminderController$b */
        public static final class TeamJoinNotifyInfo {

            /* renamed from: a */
            private final String f141478a;

            /* renamed from: b */
            private final String f141479b;

            /* renamed from: c */
            private final String f141480c;

            /* renamed from: d */
            private final String f141481d;

            /* renamed from: e */
            private final String f141482e;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TeamJoinNotifyInfo)) {
                    return false;
                }
                TeamJoinNotifyInfo bVar = (TeamJoinNotifyInfo) obj;
                return Intrinsics.areEqual(this.f141478a, bVar.f141478a) && Intrinsics.areEqual(this.f141479b, bVar.f141479b) && Intrinsics.areEqual(this.f141480c, bVar.f141480c) && Intrinsics.areEqual(this.f141481d, bVar.f141481d) && Intrinsics.areEqual(this.f141482e, bVar.f141482e);
            }

            public int hashCode() {
                String str = this.f141478a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f141479b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f141480c;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.f141481d;
                int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String str5 = this.f141482e;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                return "TeamJoinNotifyInfo(userId=" + this.f141478a + ", tenantId=" + this.f141479b + ", tenantName=" + this.f141480c + ", type=" + this.f141481d + ", isActive=" + this.f141482e + ")";
            }

            /* renamed from: a */
            public final String mo194933a() {
                return this.f141478a;
            }

            /* renamed from: b */
            public final String mo194934b() {
                return this.f141480c;
            }

            /* renamed from: c */
            public final String mo194935c() {
                return this.f141482e;
            }

            public TeamJoinNotifyInfo(String str, String str2, String str3, String str4, String str5) {
                Intrinsics.checkParameterIsNotNull(str, "userId");
                Intrinsics.checkParameterIsNotNull(str2, "tenantId");
                Intrinsics.checkParameterIsNotNull(str3, "tenantName");
                Intrinsics.checkParameterIsNotNull(str4, ShareHitPoint.f121869d);
                Intrinsics.checkParameterIsNotNull(str5, "isActive");
                this.f141478a = str;
                this.f141479b = str2;
                this.f141480c = str3;
                this.f141481d = str4;
                this.f141482e = str5;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$triggerSwitchTenant$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$JoinTeamReminderController$f */
        public static final class C57436f implements IGetDataCallback<Boolean> {
            C57436f() {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165384e("ReminderManager", "switch Tenant error", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165379d("ReminderManager", "onSuccess: data=" + bool);
                AbstractC57392a a = C57345a.m222261a();
                Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
                a.mo194674f().mo194680a(false);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$JoinTeamReminderController$c */
        public static final class RunnableC57433c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f141483a;

            RunnableC57433c(String str) {
                this.f141483a = str;
            }

            public final void run() {
                C36644b.m144618a().mo135215a(this.f141483a);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$JoinTeamReminderController$e */
        public static final class RunnableC57435e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JoinTeamReminderController f141486a;

            RunnableC57435e(JoinTeamReminderController joinTeamReminderController) {
                this.f141486a = joinTeamReminderController;
            }

            public final void run() {
                C36644b.m144618a().mo135214a(this.f141486a.f141474b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$showReminder$1", "Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView$OnReminderClickListener;", "onDetailClick", "", "view", "Landroid/view/View;", "onLaterClick", "onShow", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$JoinTeamReminderController$d */
        public static final class C57434d implements JoinTeamReminderView.OnReminderClickListener {

            /* renamed from: a */
            final /* synthetic */ JoinTeamReminderController f141484a;

            /* renamed from: b */
            final /* synthetic */ boolean f141485b;

            @Override // com.ss.android.lark.ug.dyflow.feat.reminder.JoinTeamReminderView.OnReminderClickListener
            /* renamed from: a */
            public void mo194940a() {
                Log.m165389i("ReminderManager", "onShow");
                this.f141484a.f141475c = State.Showing;
                OnboardingHitPoint.f99379a.mo141613c(this.f141485b);
            }

            @Override // com.ss.android.lark.ug.dyflow.feat.reminder.JoinTeamReminderView.OnReminderClickListener
            /* renamed from: a */
            public void mo194941a(View view) {
                Log.m165389i("ReminderManager", "onLaterClick");
                TeamJoinNotifyInfo bVar = this.f141484a.f141473a;
                this.f141484a.mo194930e();
                this.f141484a.mo194932g();
                this.f141484a.mo194924a("team_join_notify_mobile_later", bVar);
                OnboardingHitPoint.f99379a.mo141617d(this.f141485b);
            }

            @Override // com.ss.android.lark.ug.dyflow.feat.reminder.JoinTeamReminderView.OnReminderClickListener
            /* renamed from: b */
            public void mo194942b(View view) {
                Log.m165389i("ReminderManager", "onDetailClick");
                TeamJoinNotifyInfo bVar = this.f141484a.f141473a;
                this.f141484a.mo194930e();
                this.f141484a.mo194923a(bVar);
                this.f141484a.mo194924a("team_join_notify_mobile_switch", bVar);
                OnboardingHitPoint.f99379a.mo141621e(this.f141485b);
            }

            C57434d(JoinTeamReminderController joinTeamReminderController, boolean z) {
                this.f141484a = joinTeamReminderController;
                this.f141485b = z;
            }
        }

        /* renamed from: h */
        private final boolean m222803h() {
            String str;
            TeamJoinNotifyInfo bVar = this.f141473a;
            if (bVar != null) {
                str = bVar.mo194935c();
            } else {
                str = null;
            }
            return Intrinsics.areEqual(str, "true");
        }

        /* renamed from: i */
        private final boolean m222804i() {
            AbstractC57392a a = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
            Activity e = a.mo194673e();
            if (e != null) {
                return C57345a.m222261a().mo194670b(e);
            }
            return false;
        }

        /* renamed from: a */
        public final void mo194922a() {
            Log.m165389i("ReminderManager", "reset");
            mo194928c();
            this.f141475c = null;
            this.f141473a = null;
        }

        /* renamed from: b */
        public final void mo194926b() {
            Lifecycle lifecycle;
            if (m222804i()) {
                mo194929d();
                return;
            }
            FragmentActivity f = mo194931f();
            if (f != null && (lifecycle = f.getLifecycle()) != null) {
                lifecycle.addObserver(this.f141477f);
            }
        }

        /* renamed from: c */
        public final void mo194928c() {
            FragmentActivity f;
            Lifecycle lifecycle;
            if (!(!m222804i() || (f = mo194931f()) == null || (lifecycle = f.getLifecycle()) == null)) {
                lifecycle.removeObserver(this.f141477f);
            }
            mo194930e();
        }

        /* renamed from: f */
        public final FragmentActivity mo194931f() {
            Context context;
            WeakReference<Activity> weakReference = ReminderManager.f141469c.mo194947a().f141470a;
            Context context2 = null;
            if (weakReference != null) {
                context = (Activity) weakReference.get();
            } else {
                context = null;
            }
            if (context instanceof FragmentActivity) {
                context2 = context;
            }
            return (FragmentActivity) context2;
        }

        /* renamed from: g */
        public final void mo194932g() {
            AbstractC57392a a = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
            a.mo194674f().mo194680a(true);
        }

        /* renamed from: e */
        public final void mo194930e() {
            String a;
            JoinTeamReminderHandler bVar = this.f141474b;
            if (bVar != null && (a = bVar.mo117929a()) != null) {
                UICallbackExecutor.post(new RunnableC57433c(a));
                this.f141475c = State.Removed;
                this.f141473a = null;
                Log.m165389i("ReminderManager", "removeCard");
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$JoinTeamReminderController$g */
        public static final class RunnableC57437g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JoinTeamReminderController f141487a;

            /* renamed from: b */
            final /* synthetic */ String f141488b;

            /* renamed from: c */
            final /* synthetic */ String f141489c;

            /* renamed from: d */
            final /* synthetic */ String f141490d;

            /* renamed from: e */
            final /* synthetic */ String f141491e;

            /* renamed from: f */
            final /* synthetic */ String f141492f;

            /* renamed from: g */
            final /* synthetic */ String f141493g;

            RunnableC57437g(JoinTeamReminderController joinTeamReminderController, String str, String str2, String str3, String str4, String str5, String str6) {
                this.f141487a = joinTeamReminderController;
                this.f141488b = str;
                this.f141489c = str2;
                this.f141490d = str3;
                this.f141491e = str4;
                this.f141492f = str5;
                this.f141493g = str6;
            }

            public final void run() {
                if (!TextUtils.equals(this.f141487a.f141476d, this.f141488b)) {
                    this.f141487a.mo194922a();
                }
                this.f141487a.f141476d = this.f141488b;
                if (Intrinsics.areEqual(this.f141489c, "1")) {
                    this.f141487a.f141475c = State.Removed;
                    this.f141487a.f141473a = null;
                    this.f141487a.mo194928c();
                } else if (this.f141487a.f141475c != State.Showing) {
                    this.f141487a.f141473a = new TeamJoinNotifyInfo(this.f141490d, this.f141491e, this.f141492f, this.f141489c, this.f141493g);
                    this.f141487a.f141475c = State.Ready;
                    this.f141487a.mo194926b();
                }
            }
        }

        /* renamed from: d */
        public final void mo194929d() {
            int i;
            String str;
            C38576b a = C38576b.m152148a();
            Intrinsics.checkExpressionValueIsNotNull(a, "TenantPickGuide.getInstance()");
            if (!a.mo141330b() && this.f141475c == State.Ready) {
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Guide_SwitchTeamsMessageLarkTeam);
                boolean h = m222803h();
                if (h) {
                    i = R.string.Lark_Guide_SwitchTeamsMessageNoApprovalMobile;
                } else {
                    i = R.string.Lark_Guide_SwitchTeamsMessageApprovedMobile;
                }
                TeamJoinNotifyInfo bVar = this.f141473a;
                if (bVar == null || (str = bVar.mo194934b()) == null) {
                    str = "";
                }
                JoinTeamReminderData aVar = new JoinTeamReminderData(mustacheFormat, UIHelper.mustacheFormat(i, "TEAM_NAME", str));
                JoinTeamReminderHandler bVar2 = new JoinTeamReminderHandler(new C57434d(this, h));
                bVar2.mo194962a(aVar);
                this.f141474b = bVar2;
                UICallbackExecutor.post(new RunnableC57435e(this));
                Log.m165389i("ReminderManager", "showReminder");
            }
        }

        /* renamed from: a */
        public final void mo194923a(TeamJoinNotifyInfo bVar) {
            String a;
            if (bVar != null && (a = bVar.mo194933a()) != null) {
                AbstractC57392a a2 = C57345a.m222261a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "UGModule.getDependency()");
                a2.mo194675g().mo194681a(a, new C57436f());
            }
        }

        /* renamed from: a */
        public boolean mo194925a(FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            if (flowStepData.mo194847i("team_join_notify_config") != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void mo194927b(FlowStepData flowStepData) {
            Map<String, String> a;
            String str;
            boolean z;
            String str2;
            String str3;
            boolean z2;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            ConfigElementData i = flowStepData.mo194847i("team_join_notify_config");
            if (i != null && (a = i.mo194886a()) != null && (str = a.get("user_id")) != null) {
                boolean z3 = true;
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                if (str2 != null && (str3 = a.get("tenant_id")) != null) {
                    if (str3.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str4 = str3;
                    } else {
                        str4 = null;
                    }
                    if (str4 != null && (str5 = a.get("tenant_name")) != null) {
                        if (str5.length() <= 0) {
                            z3 = false;
                        }
                        if (z3) {
                            str6 = str5;
                        } else {
                            str6 = null;
                        }
                        if (str6 != null && (str7 = a.get(ShareHitPoint.f121869d)) != null && (str8 = a.get("is_active")) != null) {
                            Log.m165389i("ReminderManager", "updateData, type=" + str7 + ", isActive=" + str8);
                            AbstractC57392a a2 = C57345a.m222261a();
                            Intrinsics.checkExpressionValueIsNotNull(a2, "UGModule.getDependency()");
                            String b = a2.mo194668b();
                            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                            coreThreadPool.getUIExecutor().execute(new RunnableC57437g(this, b, str7, str2, str4, str6, str8));
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo194924a(String str, TeamJoinNotifyInfo bVar) {
            String str2;
            FlowServiceUtils.Companion aVar = FlowServiceUtils.f141408a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?user_id=");
            if (bVar != null) {
                str2 = bVar.mo194933a();
            } else {
                str2 = null;
            }
            sb.append(str2);
            aVar.mo194780a(5, "team_join_notify", sb.toString());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final ReminderManager m222800a() {
        return f141469c.mo194947a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$ApmUtils;", "", "()V", "reportError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$a */
    public static final class ApmUtils {

        /* renamed from: a */
        public static final ApmUtils f141494a = new ApmUtils();

        private ApmUtils() {
        }

        /* renamed from: a */
        public final void mo194946a(String str, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            UGApm.DyFlow bVar = UGApm.DyFlow.f141198a;
            bVar.mo194474a(-1, "push_stepData_invalid, " + str, String.valueOf(flowStepData.mo194828a()), flowStepData.mo194834b(), flowStepData.mo194837c());
            OnBoardingAppreciable aVar = OnBoardingAppreciable.f141195a;
            aVar.mo194463a(-1, "push_stepData_invalid, " + str, String.valueOf(flowStepData.mo194828a()), flowStepData.mo194834b(), flowStepData.mo194837c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager;", "getInstance", "()Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager;", "instance$delegate", "Lkotlin/Lazy;", "inst", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$b */
    public static final class Companion {
        /* renamed from: b */
        private final ReminderManager m222824b() {
            Lazy lazy = ReminderManager.f141468b;
            Companion bVar = ReminderManager.f141469c;
            return (ReminderManager) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ReminderManager mo194947a() {
            return m222824b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/dyflow/feat/ReminderManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.ReminderManager$c */
    static final class C57438c extends Lambda implements Function0<ReminderManager> {
        public static final C57438c INSTANCE = new C57438c();

        C57438c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ReminderManager invoke() {
            return new ReminderManager();
        }
    }

    /* renamed from: a */
    public final void mo194920a(Activity activity) {
        if (activity != null) {
            this.f141470a = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    public final void mo194921a(FlowStepData flowStepData) {
        if (!GuideFG.f99144b.mo141341a().mo141339b()) {
            Log.m165389i("ReminderManager", "fg not enable");
        } else if (flowStepData == null) {
        } else {
            if (this.f141471d.mo194925a(flowStepData)) {
                this.f141471d.mo194927b(flowStepData);
            } else {
                ApmUtils.f141494a.mo194946a("params is invalid", flowStepData);
            }
        }
    }
}
