package com.ss.android.lark.ug.dyflow.steps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.dyflow.common.data.FlowContext;
import com.ss.android.lark.ug.dyflow.steps.spotlight.Spotlight;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/StepsUtils;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.a */
public final class StepsUtils {

    /* renamed from: a */
    public static final Companion f141524a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/StepsUtils$Companion;", "", "()V", "hasOpenedMainPageInFlow", "", "flow", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "markOpenedMainPageInFlow", "", "openInvitePage", "context", "Landroid/content/Context;", "btnText", "", "openMainPage", "tabName", "bundle", "Landroid/os/Bundle;", "openMainPageIfNeed", "openSpotlightFromIntentIfNeed", "activity", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.steps.a$a$a */
        public static final class RunnableC57446a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Activity f141525a;

            /* renamed from: b */
            final /* synthetic */ Intent f141526b;

            RunnableC57446a(Activity activity, Intent intent) {
                this.f141525a = activity;
                this.f141526b = intent;
            }

            public final void run() {
                Spotlight.f141535c.mo194988a(this.f141525a, this.f141526b);
            }
        }

        /* renamed from: a */
        public final void mo194967a() {
            AbstractC57392a a = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
            Activity e = a.mo194673e();
            if (e == null || !C57345a.m222261a().mo194670b(e)) {
                mo194970a("");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo194969a(IFlow dVar) {
            Bundle b;
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            FlowContext b2 = dVar.mo194743b();
            if (b2 != null && (b = b2.mo194857b()) != null) {
                b.getBoolean("extra_has_opened_main_act", true);
            }
        }

        /* renamed from: b */
        public final boolean mo194973b(IFlow dVar) {
            Bundle b;
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            FlowContext b2 = dVar.mo194743b();
            if (b2 == null || (b = b2.mo194857b()) == null || !b.getBoolean("extra_has_opened_main_act")) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo194970a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tabName");
            mo194971a(str, new Bundle());
        }

        /* renamed from: a */
        public final void mo194968a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C57345a.m222261a().mo194666a(context, "ug_flow", str);
        }

        /* renamed from: a */
        public final void mo194971a(String str, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(str, "tabName");
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            C57345a.m222261a().mo194667a(str, bundle);
        }

        /* renamed from: a */
        public final boolean mo194972a(Activity activity, Intent intent) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            if (!Spotlight.f141535c.mo194990a(intent)) {
                return false;
            }
            try {
                UICallbackExecutor.executeDelayed(new RunnableC57446a(activity, intent), 660);
                return true;
            } catch (Exception e) {
                Log.m165384e("DyFlow", "openSpotlightFromIntentIfNeed error", e);
                return false;
            }
        }
    }
}
