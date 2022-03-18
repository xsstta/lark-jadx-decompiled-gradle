package com.tt.miniapphost.p3362a.p3367e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.lark.infra.foundation.utils.C12787e;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12886a;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.refer.common.base.AppType;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.a.e.d */
public class C67458d extends AbstractC67456b {
    @Override // com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    /* renamed from: l */
    public void mo234196l() {
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext
    public AppType getAppType() {
        return AppType.BlockitApp;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void initTrace() {
        super.initTrace();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void startDestroy() {
        super.startDestroy();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void unRegisterOnResultAllPlugin() {
        super.unRegisterOnResultAllPlugin();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKOpenApiAccessConfig getApiAccessConfig() {
        return super.getApiAccessConfig();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ AbstractC25891b getAppContainer() {
        return super.getAppContainer();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String getAppId() {
        return super.getAppId();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String getAppIdentify() {
        return super.getAppIdentify();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ AbstractC25905b getBridgeContext() {
        return super.getBridgeContext();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String getContainerType() {
        return super.getContainerType();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Activity getCurrentActivity() {
        return super.getCurrentActivity();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ AbstractC25891b getCurrentNode() {
        return super.getCurrentNode();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ int getCurrentTheme() {
        return super.getCurrentTheme();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ AbstractC25576a getDefaultPluginContainer() {
        return super.getDefaultPluginContainer();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Object getExtra() {
        return super.getExtra();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ AbstractC12888c getGadgetInteractiveProxy() {
        return super.getGadgetInteractiveProxy();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String getTraceId() {
        return super.getTraceId();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ OPTrace getTracingSpan() {
        return super.getTracingSpan();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isDestroyed() {
        return super.isDestroyed();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isDestroying() {
        return super.isDestroying();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isEmbedContainer() {
        return super.isEmbedContainer();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isInParallelWindow() {
        return super.isInParallelWindow();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean isNewContainer() {
        return super.isNewContainer();
    }

    @Override // com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void bindAppContainer(AbstractC25891b bVar) {
        super.bindAppContainer(bVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void putExtras(AbstractC12886a aVar) {
        super.putExtras(aVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void removeExtra(String str) {
        super.removeExtra(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setApiAccessConfig(LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        super.setApiAccessConfig(lKOpenApiAccessConfig);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setAppId(String str) {
        super.setAppId(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setAppIdentify(String str) {
        super.setAppIdentify(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setContainerType(String str) {
        super.setContainerType(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setCurrentActivity(Activity activity) {
        super.setCurrentActivity(activity);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setCurrentTheme(int i) {
        super.setCurrentTheme(i);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setDefaultPluginContainer(AbstractC25576a aVar) {
        super.setDefaultPluginContainer(aVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setExtra(Object obj) {
        super.setExtra(obj);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setGadgetInteractiveProxy(AbstractC12888c cVar) {
        super.setGadgetInteractiveProxy(cVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void setInParallelWindow(boolean z) {
        super.setInParallelWindow(z);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void unRegisterOnResultPlugin(AbstractC25937e eVar) {
        super.unRegisterOnResultPlugin(eVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ IBaseService findServiceByInterface(Class cls) {
        return super.findServiceByInterface(cls);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(LKEvent lKEvent) {
        return super.sendEvent(lKEvent);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ Object getExtra(String str) {
        return super.getExtra(str);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(String str) {
        return super.sendEvent(str);
    }

    public C67458d(Context context) {
        super(context);
        putExtra("basic_lib_version", "1.6.0");
        putExtra("larkAppVersion", C12787e.m52853a(context));
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void putExtra(String str, Object obj) {
        super.putExtra(str, obj);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void sendEvent(String str, Bundle bundle) {
        super.sendEvent(str, bundle);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ boolean registerService(Class cls, IBaseService iBaseService) {
        return super.registerService(cls, iBaseService);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(String str, JSONObject jSONObject) {
        return super.sendEvent(str, jSONObject);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.tt.miniapphost.p3362a.p3367e.AbstractC67456b
    public /* bridge */ /* synthetic */ LKBasePluginResult sendEvent(String str, JSONObject jSONObject, AbstractC25894e eVar) {
        return super.sendEvent(str, jSONObject, eVar);
    }
}
