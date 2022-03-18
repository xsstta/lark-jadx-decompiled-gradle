package com.ss.android.lark.app.taskv2.preload;

import com.ss.android.lark.app.taskv2.preload.InitUgSdkTask;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
final class InitUgSdkTask$SwitchTenantListener$onUserSwitchFailed$1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InitUgSdkTask.SwitchTenantListener f72799a;

    InitUgSdkTask$SwitchTenantListener$onUserSwitchFailed$1(InitUgSdkTask.SwitchTenantListener switchTenantListener) {
        this.f72799a = switchTenantListener;
    }

    public final void run() {
        InitUgSdkTask.UgReachSdkHelper.f72797a.mo103089a(this.f72799a.f72796a);
    }
}
