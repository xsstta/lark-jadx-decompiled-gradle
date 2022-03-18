package com.larksuite.component.openplatform.core.plugin.applink;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.falcon.OPSSBPlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;

public class OpenSchemaAsyncHandlerPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.applink.OpenSchemaAsyncHandlerPlugin$a */
    public static class C24578a {

        /* renamed from: a */
        private static long f60563a;

        /* renamed from: b */
        public static void m89615b() {
            f60563a = 0;
        }

        /* renamed from: a */
        public static boolean m89614a() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f60563a < 500) {
                return true;
            }
            f60563a = currentTimeMillis;
            return false;
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        super.addEvents(gVar);
        gVar.mo92192a("killGadgetOnBackground");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        if ("killGadgetOnBackground".equals(m)) {
            if (!C66612a.m260235b(getEventContext(lKEvent).getAppId())) {
                return lKEvent.mo92155v();
            }
            ILogger b = lKEvent.mo92134c().mo92190b();
            b.mo92224i("OpenSchemaAsyncHandlerP", "jumpApp so need intercept " + m);
        }
        return super.handleEvent(lKEvent);
    }

    private void onFailWhenOpenSchema(ApiCode apiCode, AbstractC25897h<OpenPlatform.OpenSchemaAsyncHandlerResponse> hVar) {
        C24578a.m89615b();
        OpenPlatform.OpenSchemaAsyncHandlerResponse openSchemaAsyncHandlerResponse = new OpenPlatform.OpenSchemaAsyncHandlerResponse();
        openSchemaAsyncHandlerResponse.mErrorCode = apiCode.code;
        openSchemaAsyncHandlerResponse.mErrorMessage = apiCode.msg;
        hVar.callback(openSchemaAsyncHandlerResponse);
    }

    @LKPluginFunction(async = true, eventName = {"openSchema"})
    public void openSchemaAsync(OpenPlatform.OpenSchemaAsyncHandlerRequest openSchemaAsyncHandlerRequest, AbstractC25897h<OpenPlatform.OpenSchemaAsyncHandlerResponse> hVar) {
        OpenPlatform.OpenSchemaAsyncHandlerResponse openSchemaAsyncHandlerResponse = new OpenPlatform.OpenSchemaAsyncHandlerResponse();
        boolean z = false;
        AppBrandLogger.m52828d("OpenSchemaAsyncHandlerP", "openSchema mArgs:", openSchemaAsyncHandlerRequest.toString());
        if (C24578a.m89614a()) {
            openSchemaAsyncHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            openSchemaAsyncHandlerResponse.mErrorMessage = "invoke openSchema too fast";
            hVar.callback(openSchemaAsyncHandlerResponse);
            return;
        }
        Activity f = getApiDependency().mo235051f();
        if (f == null) {
            onFailWhenOpenSchema(ApiCode.GENERAL_UNKONW_ERROR, hVar);
            return;
        }
        String str = openSchemaAsyncHandlerRequest.mSchema;
        boolean z2 = openSchemaAsyncHandlerRequest.mExternal;
        if (TextUtils.isEmpty(str)) {
            onFailWhenOpenSchema(ApiCode.OPENSCHEMA_EMPTY_SCHEMA, hVar);
        } else if (!getApiDependency().mo235037a("schema_host", str)) {
            onFailWhenOpenSchema(ApiCode.OPENSCHEMA_NOT_WHITE, hVar);
        } else if (TextUtils.equals("microapp", Uri.parse(str).getHost())) {
            String appId = getAppContext().getAppId();
            if (AppType.GadgetAPP == getAppContext().getAppType()) {
                z = true;
            }
            int i = -1;
            if (z) {
                try {
                    IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType = AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().sandBoxEnvType;
                    if (sandBoxEnvType != null) {
                        i = sandBoxEnvType.ordinal();
                    }
                } catch (Exception e) {
                    Log.m165384e("OpenSchemaAsyncHandlerP", "Exception", e);
                }
            }
            ((AbstractC67724a) getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50436a("inner_open_miniapp", CrossProcessDataEntity.C67574a.m263013a().mo234760a("inner_open_miniapp_fromid", (Object) appId).mo234760a("inner_open_miniapp_schema", (Object) str).mo234760a("inner_open_miniapp_isNormalGadgetContainer", (Object) Boolean.valueOf(C25529d.m91165f(getAppContext()))).mo234760a("inner_open_miniapp_is_gadget_appType", (Object) Boolean.valueOf(z)).mo234760a("inner_open_miniapp_from_sandbox_type", (Object) Integer.valueOf(i)).mo234763b());
            getApiDependency().mo235062m();
            hVar.callback(openSchemaAsyncHandlerResponse);
        } else if (openSchema(f, str, z2)) {
            hVar.callback(openSchemaAsyncHandlerResponse);
        } else {
            onFailWhenOpenSchema(ApiCode.OPENSCHEMA_OPEN_FAILED, hVar);
        }
    }

    private boolean openSchema(Context context, String str, boolean z) {
        boolean z2;
        boolean z3;
        AbstractC67724a aVar = (AbstractC67724a) getAppContext().findServiceByInterface(AbstractC67724a.class);
        Uri parse = Uri.parse(str);
        try {
            if (parse.getQueryParameter("appId") != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (AppType.GadgetAPP == getAppContext().getAppType()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i = -1;
                if (z3) {
                    OPSSBPlugin.ConvertSchema.Request request = new OPSSBPlugin.ConvertSchema.Request();
                    request.mAppIdentify = getAppId();
                    request.mScheme = str;
                    request.isFromNormalGadgetContainer = C25529d.m91165f(getAppContext());
                    IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType = AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().sandBoxEnvType;
                    if (sandBoxEnvType != null) {
                        i = sandBoxEnvType.ordinal();
                    }
                    request.mFromSandboxType = i;
                    OPSSBPlugin.ConvertSchema.Response convertSchemaInSSBIfNeed = OPSSBPlugin.get().convertSchemaInSSBIfNeed(request);
                    if (convertSchemaInSSBIfNeed != null && !TextUtils.isEmpty(convertSchemaInSSBIfNeed.mScheme)) {
                        str = convertSchemaInSSBIfNeed.mScheme;
                    }
                }
            }
        } catch (Exception e) {
            Log.m165384e("OpenSchemaAsyncHandlerP", "Exception", e);
        }
        if (aVar.mo50464f(str)) {
            aVar.mo50442a(context, str);
            return true;
        } else if (z) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e2) {
                AppBrandLogger.eWithThrowable("OpenSchemaAsyncHandlerP", "openSchema", e2);
                return false;
            }
        } else {
            aVar.mo50440a((Activity) context, str, (String) null);
            return true;
        }
    }
}
