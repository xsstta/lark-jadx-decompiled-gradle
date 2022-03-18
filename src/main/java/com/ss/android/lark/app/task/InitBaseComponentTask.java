package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.app.taskv2.central.InitLogTask;
import com.ss.android.lark.exception.crash.C37008a;
import com.ss.android.lark.utils.rxjava.C57877e;
import io.reactivex.plugins.RxJavaPlugins;

public class InitBaseComponentTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        new InitLogTask().mo43817a(context);
        C37008a.m146044a().mo136534a(context);
        RxJavaPlugins.setErrorHandler(C57877e.m224588a());
    }
}
