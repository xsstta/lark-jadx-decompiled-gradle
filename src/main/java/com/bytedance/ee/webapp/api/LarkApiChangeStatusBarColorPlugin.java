package com.bytedance.ee.webapp.api;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.lark.webview.container.impl.p836b.AbstractC19856a;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.multitask.task.ActivityLifecycle;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/webapp/api/LarkApiChangeStatusBarColorPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "TAG", "", "logger", "Lcom/ss/android/lark/optrace/api/ILogger;", "changeStatusBarColor", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "request", "Lcom/bytedance/ee/webapp/api/ChangeStatusBarColorPluginRequest;", "iLogger", "invokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/bytedance/ee/webapp/api/ChangeStatusBarColorResponse;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LarkApiChangeStatusBarColorPlugin extends OPPlugin {
    private final String TAG = "LarkApiChangeStatusBarColorPlugin";
    private ILogger logger;

    @LKPluginFunction(async = true, eventName = {"setStatusBarColor"})
    public final void changeStatusBarColor(LKEvent lKEvent, ChangeStatusBarColorPluginRequest changeStatusBarColorPluginRequest, ILogger aVar, AbstractC25897h<ChangeStatusBarColorResponse> hVar) {
        String str;
        String str2;
        Activity activity;
        Activity activity2;
        String str3;
        Intrinsics.checkParameterIsNotNull(hVar, "invokeCallback");
        this.logger = aVar;
        Activity activity3 = null;
        if (aVar != null) {
            String str4 = this.TAG;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("request?.color is --");
            if (changeStatusBarColorPluginRequest != null) {
                str3 = changeStatusBarColorPluginRequest.getColor();
            } else {
                str3 = null;
            }
            sb.append(str3);
            objArr[0] = sb.toString();
            aVar.mo92224i(str4, objArr);
        }
        ChangeStatusBarColorResponse changeStatusBarColorResponse = new ChangeStatusBarColorResponse();
        if (changeStatusBarColorPluginRequest == null || (str = changeStatusBarColorPluginRequest.getColor()) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            changeStatusBarColorResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
            changeStatusBarColorResponse.mErrorMessage = " request?.color is empty.";
            hVar.callback(changeStatusBarColorResponse);
            ILogger aVar2 = this.logger;
            if (aVar2 != null) {
                aVar2.mo92224i(this.TAG, "request?.color is empty");
                return;
            }
            return;
        }
        if (changeStatusBarColorPluginRequest != null) {
            try {
                str2 = changeStatusBarColorPluginRequest.getColor();
            } catch (Throwable th) {
                ILogger aVar3 = this.logger;
                if (aVar3 != null) {
                    aVar3.mo92223e(this.TAG, th);
                }
                changeStatusBarColorResponse.mErrorCode = ApiCode.GENERAL_UNABLE.code;
                changeStatusBarColorResponse.mErrorMessage = "client caused exception.";
                hVar.callback(changeStatusBarColorResponse);
                return;
            }
        } else {
            str2 = null;
        }
        int parseColor = Color.parseColor(str2);
        IAppContext appContext = getAppContext();
        if (appContext != null) {
            activity = appContext.getCurrentActivity();
        } else {
            activity = null;
        }
        if (!(activity instanceof AbstractC19856a)) {
            activity = null;
        }
        AbstractC19856a aVar4 = (AbstractC19856a) activity;
        if (aVar4 != null) {
            aVar4.mo67225a(parseColor);
        } else {
            LarkApiChangeStatusBarColorPlugin larkApiChangeStatusBarColorPlugin = this;
            ILogger aVar5 = larkApiChangeStatusBarColorPlugin.logger;
            if (aVar5 != null) {
                String str5 = larkApiChangeStatusBarColorPlugin.TAG;
                Object[] objArr2 = new Object[1];
                StringBuilder sb2 = new StringBuilder();
                sb2.append("appContext?.currentActivity--");
                IAppContext appContext2 = larkApiChangeStatusBarColorPlugin.getAppContext();
                if (appContext2 != null) {
                    activity2 = appContext2.getCurrentActivity();
                } else {
                    activity2 = null;
                }
                sb2.append(activity2);
                objArr2[0] = sb2.toString();
                aVar5.mo92224i(str5, objArr2);
            }
            List<Activity> a = ActivityLifecycle.f121792a.mo169205a();
            Activity activity4 = a.get(a.size() - 1);
            if (activity4 instanceof AbstractC19856a) {
                activity3 = activity4;
            }
            AbstractC19856a aVar6 = (AbstractC19856a) activity3;
            if (aVar6 != null) {
                aVar6.mo67225a(parseColor);
            } else {
                changeStatusBarColorResponse.mErrorCode = ApiCode.GENERAL_UNABLE.code;
                changeStatusBarColorResponse.mErrorMessage = "find not webContainer, change statusBar fail.";
                hVar.callback(changeStatusBarColorResponse);
                return;
            }
        }
        changeStatusBarColorResponse.mErrorCode = ApiCode.GENERAL_OK.code;
        changeStatusBarColorResponse.mErrorMessage = "change statusBar success";
        hVar.callback(changeStatusBarColorResponse);
    }
}
