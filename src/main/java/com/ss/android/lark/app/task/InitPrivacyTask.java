package com.ss.android.lark.app.task;

import android.content.Context;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.PrivacyDetectionDynamicInitializer;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.app.util.FileFgCenter;
import com.ss.android.lark.larkconfig.larksetting.handler.privacydetection.PrivacyDetectionSetting;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/app/task/InitPrivacyTask;", "Lcom/larksuite/framework/launch/task/AbstractLaunchTask;", "", "()V", "execute", "", "context", "Landroid/content/Context;", "isAsync", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitPrivacyTask extends AbstractLaunchTask<Object> {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: d */
    public boolean mo92546d() {
        return true;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        if (FileFgCenter.f72896c.mo103172a().mo103171a("privacy_detection_dynamic")) {
            PrivacyDetectionDynamicInitializer.init(new InitPrivacyTask$execute$1(), new InitPrivacyTask$execute$2(), new InitPrivacyTask$execute$3(PrivacyDetectionSetting.m163449a().getAnchors()));
        }
    }
}
