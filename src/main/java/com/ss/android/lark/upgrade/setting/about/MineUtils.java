package com.ss.android.lark.upgrade.setting.about;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.utils.C57887w;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/MineUtils;", "", "()V", "Companion", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.c */
public final class MineUtils {

    /* renamed from: a */
    public static final Companion f142185a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/MineUtils$Companion;", "", "()V", "getLogFile", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/io/File;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.upgrade.setting.about.c$a$a */
        public static final class RunnableC57703a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ IGetDataCallback f142186a;

            RunnableC57703a(IGetDataCallback iGetDataCallback) {
                this.f142186a = iGetDataCallback;
            }

            public final void run() {
                AbstractC57608a a = C57607a.m223662a();
                Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
                AbstractC57608a.AbstractC57617i q = a.mo177723q();
                Intrinsics.checkExpressionValueIsNotNull(q, "UpgradeModule.getDependency().profileDependency");
                String a2 = q.mo177730a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "UpgradeModule.getDepende…Dependency.loginUserEmail");
                AbstractC57608a a3 = C57607a.m223662a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "UpgradeModule.getDependency()");
                AbstractC57608a.AbstractC57616h n = a3.mo177720n();
                Intrinsics.checkExpressionValueIsNotNull(n, "UpgradeModule.getDependency().loginDependency");
                String a4 = n.mo177746a();
                AbstractC57608a a5 = C57607a.m223662a();
                Intrinsics.checkExpressionValueIsNotNull(a5, "UpgradeModule.getDependency()");
                AbstractC57608a.AbstractC57611c j = a5.mo177716j();
                Intrinsics.checkExpressionValueIsNotNull(j, "UpgradeModule.getDependency().chatDependency");
                String a6 = j.mo177733a();
                AbstractC57608a a7 = C57607a.m223662a();
                Intrinsics.checkExpressionValueIsNotNull(a7, "UpgradeModule.getDependency()");
                Context a8 = a7.mo177704a();
                AbstractC57608a a9 = C57607a.m223662a();
                Intrinsics.checkExpressionValueIsNotNull(a9, "UpgradeModule.getDependency()");
                AbstractC57608a.AbstractC57612d p = a9.mo177722p();
                Intrinsics.checkExpressionValueIsNotNull(p, "UpgradeModule.getDependency().deviceDependency");
                String a10 = p.mo177729a();
                AbstractC57608a a11 = C57607a.m223662a();
                Intrinsics.checkExpressionValueIsNotNull(a11, "UpgradeModule.getDependency()");
                File a12 = C57887w.m224666a(a8, a2, a4, a10, a6, a11.mo177713g());
                IGetDataCallback iGetDataCallback = this.f142186a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(a12);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo195853a(IGetDataCallback<File> iGetDataCallback) {
            C57865c.m224576a(new RunnableC57703a(iGetDataCallback));
        }
    }
}
