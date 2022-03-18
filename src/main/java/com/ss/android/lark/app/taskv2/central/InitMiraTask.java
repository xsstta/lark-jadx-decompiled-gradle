package com.ss.android.lark.app.taskv2.central;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.app.util.FileFgCenter;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.mira.IMiraModuleDependency;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/app/taskv2/central/InitMiraTask;", "Lcom/larksuite/framework/launch/task/AbstractLaunchTask;", "", "()V", "execute", "", "context", "Landroid/content/Context;", "Companion", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitMiraTask extends AbstractLaunchTask<Object> {

    /* renamed from: a */
    public static final Companion f72738a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/app/taskv2/central/InitMiraTask$Companion;", "", "()V", "DOC_PROCESS_SUFFIX", "", "MEEGO_PROCESS_SUFFIX", "TAG", "WS_CHANNEL_PROCESS_SUFFIX", "getDependency", "Lcom/ss/android/lark/mira/IMiraModuleDependency;", "application", "Landroid/app/Application;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final IMiraModuleDependency mo103036a(Application application) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            return new InitMiraTask$Companion$getDependency$1(application);
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            MiraModule.Companion aVar = MiraModule.f130883a;
            IMiraModuleDependency a = f72738a.mo103036a((Application) applicationContext);
            if (a != null) {
                aVar.mo180975a(a);
                if (C26252ad.m94993b(context) && FileFgCenter.f72896c.mo103172a().mo103171a("lark.mira.delay.hook.classloader")) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerBootMileStoneListener(new InitMiraTask$execute$1());
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mira.IMiraModuleDependency");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
    }
}
