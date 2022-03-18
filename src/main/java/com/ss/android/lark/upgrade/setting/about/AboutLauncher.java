package com.ss.android.lark.upgrade.setting.about;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.statistics.UpgradeHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/AboutLauncher;", "", "()V", "Companion", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.b */
public final class AboutLauncher {

    /* renamed from: a */
    public static final Companion f142147a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/AboutLauncher$Companion;", "", "()V", "startAboutLark", "", "context", "Landroid/content/Context;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.upgrade.setting.about.b$a$a */
        public static final class RunnableC57684a implements Runnable {

            /* renamed from: a */
            public static final RunnableC57684a f142148a = new RunnableC57684a();

            RunnableC57684a() {
            }

            public final void run() {
                UpgradeHitPoint.f141994a.mo195623a();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo195791a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (DesktopUtil.m144301a(context)) {
                MainWindowParams.C36570a aVar = new MainWindowParams.C36570a(ContainerType.Right);
                AbstractC57608a a = C57607a.m223662a();
                Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
                MainWindowParams a2 = aVar.mo134958a(a.mo177726t()).mo134930b();
                C36512a.m144041a().mo134763a(new AboutFragment(), a2);
            } else {
                Intent intent = new Intent(context, AboutActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
            }
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(RunnableC57684a.f142148a);
        }
    }
}
