package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.screen.p2581a.p2582a.AbstractC53224b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

@ClaymoreImpl(AbstractC53224b.class)
public class ScreenshotDependencyImpl implements AbstractC53224b {
    public Context getContext() {
        return LarkContext.getApplication();
    }

    public Activity getTopActivity() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTopActivity();
    }

    @Override // com.ss.android.lark.screen.p2581a.p2582a.AbstractC53224b
    public boolean isLogin() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin();
    }

    public void auditScreenRecordingEvent(String str) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).auditScreenRecordingEvent(str);
    }

    public void auditScreenShotEvent(String str) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).auditScreenShotEvent(str);
    }
}
