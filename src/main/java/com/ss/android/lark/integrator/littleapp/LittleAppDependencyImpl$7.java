package com.ss.android.lark.integrator.littleapp;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.larksuite.suite.R;

class LittleAppDependencyImpl$7 extends BinderMenuAction.Stub {
    final /* synthetic */ C39801b this$0;
    final /* synthetic */ Context val$context;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.AbstractC5143a
    public void action(Bundle bundle) {
        Context context = this.val$context;
        if (context != null) {
            Toast.showText(context.getApplicationContext(), this.val$context.getResources().getString(R.string.OpenPlatform_Workplace_SafetyWarning_OpenFailed));
        }
    }

    LittleAppDependencyImpl$7(C39801b bVar, Context context) {
        this.this$0 = bVar;
        this.val$context = context;
    }
}
