package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.ss.android.lark.app.taskv2.preload.InitUgSdkTask;
import com.ss.android.lark.ug.facade.UgReachSdk;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/app/taskv2/preload/InitUgSdkTask$UgReachSdkHelper$setup$1", "Lcom/ss/android/lark/ug/facade/UgReachSdk$UgSdkDependency;", "openUrl", "", "url", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitUgSdkTask$UgReachSdkHelper$setup$1 implements UgReachSdk.UgSdkDependency {

    /* renamed from: a */
    final /* synthetic */ Context f72801a;

    InitUgSdkTask$UgReachSdkHelper$setup$1(Context context) {
        this.f72801a = context;
    }

    @Override // com.ss.android.lark.ug.facade.UgReachSdk.UgSdkDependency
    /* renamed from: a */
    public void mo103094a(String str) {
        InitUgSdkTask.UgReachSdkHelper.f72797a.mo103090a(this.f72801a, str);
    }
}
