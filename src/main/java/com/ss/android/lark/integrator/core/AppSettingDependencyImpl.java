package com.ss.android.lark.integrator.core;

import android.app.Application;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.appsetting.api.IAppSettingDependency;
import com.ss.android.lark.utils.LarkContext;

@ClaymoreImpl(IAppSettingDependency.class)
public class AppSettingDependencyImpl implements IAppSettingDependency {
    @Override // com.ss.android.lark.appsetting.api.IAppSettingDependency
    public Application getContext() {
        return LarkContext.getApplication();
    }
}
