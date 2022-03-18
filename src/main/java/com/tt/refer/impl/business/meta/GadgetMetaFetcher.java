package com.tt.refer.impl.business.meta;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.impl.business.meta.GadgetSchema;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class GadgetMetaFetcher extends AbstractC67788b<GadgetSchema.C67943Entity, GadgetAppInfo> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface GadgetMetaLegalityCheckResultType {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67788b
    /* renamed from: a */
    public boolean mo50336a(int i) {
        return i != 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67788b
    /* renamed from: b */
    public boolean mo235277b(int i) {
        return (i == 7 || i == 8) ? false : true;
    }

    /* renamed from: a */
    public long mo235770a() {
        return AppbrandUtil.convertVersionStrToCode(AppbrandUtil.convertFourToThreeVersion(C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), this.f170741c)));
    }

    public GadgetMetaFetcher(final IAppContext iAppContext) {
        super((C67948b) iAppContext.findServiceByInterface(IAppMetaService.class), iAppContext);
        if (iAppContext.getAppType() == AppType.GadgetAPP) {
            mo235275a(new GadgetMonitorCreator(iAppContext));
        }
        mo235276a(new AbstractC67788b.AbstractC67791a<GadgetAppInfo>() {
            /* class com.tt.refer.impl.business.meta.GadgetMetaFetcher.C679421 */

            /* renamed from: a */
            public void mo235280a(int i, GadgetAppInfo gadgetAppInfo) {
                AppBrandLogger.m52830i("gadget_app_start_load_fetcher", "onMetaGet->requestType:", Integer.valueOf(i), "appInfo:", gadgetAppInfo);
                if (gadgetAppInfo != null && gadgetAppInfo.getJsComponents() != null && !gadgetAppInfo.getJsComponents().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(gadgetAppInfo.getJsComponents().keySet());
                    C66399c.m259608a().mo231920a(arrayList, 0, iAppContext);
                }
            }
        });
    }

    /* renamed from: a */
    public PackageEntity mo50334a(GadgetAppInfo gadgetAppInfo) {
        return GadgetBeanConverter.convertAppInfoEntityToPackageEntity(gadgetAppInfo, this.f170741c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo50332a(GadgetAppInfo gadgetAppInfo, GadgetSchema.C67943Entity entity, Context context) {
        AppBrandLogger.m52830i("gadget_app_start_load_fetcher", " check meta state -> appId:", gadgetAppInfo.getAppId(), "version_state:", Integer.valueOf(gadgetAppInfo.getVersionState()), "state:", Integer.valueOf(gadgetAppInfo.getState()), "version:", gadgetAppInfo.getAppVersion());
        if (gadgetAppInfo.getState() == 2) {
            return 1;
        }
        if (!(entity == null || entity.getLaunchActionAbility() == null)) {
            if ("chat_action".equals(entity.getLaunchActionAbility())) {
                if (!gadgetAppInfo.isSupportChatAction()) {
                    return 8;
                }
            } else if ("message_action".equals(entity.getLaunchActionAbility()) && !gadgetAppInfo.isSupportMessageAction()) {
                return 7;
            }
        }
        if (gadgetAppInfo.getVersionState() == 1) {
            return 3;
        }
        if (gadgetAppInfo.getVersionState() == 2) {
            return 4;
        }
        if (gadgetAppInfo.getVersionState() == 4) {
            return 5;
        }
        if (!TextUtils.isEmpty(gadgetAppInfo.getMinJsSdk())) {
            String[] split = gadgetAppInfo.getMinJsSdk().split("\\.");
            if (split.length == 3) {
                long intFromStr = (long) AppbrandUtil.getIntFromStr(split);
                AppBrandLogger.m52830i("gadget_app_start_load_fetcher", "js sdk version = ", Long.valueOf(intFromStr));
                long a = mo235770a();
                if (a < intFromStr) {
                    AppBrandLogger.m52829e("gadget_app_start_load_fetcher", "appId: " + gadgetAppInfo.getAppId() + ", name: " + gadgetAppInfo.getName() + ", localJsSdkVer: " + a + ", minRequireJsSdkVer: " + intFromStr);
                    return 2;
                }
            }
        }
        try {
            if (this.f170741c.getAppType() == AppType.WebGadgetAPP) {
                AppBrandLogger.m52830i("gadget_app_start_load_fetcher", "current app type is WebGadget appId:", gadgetAppInfo.getAppId());
                if (TextUtils.isEmpty(gadgetAppInfo.getWebUrl()) || TextUtils.isEmpty(gadgetAppInfo.getWebVersionCode())) {
                    AppBrandLogger.m52829e("gadget_app_start_load_fetcher", "current app type is WebGadget,has no webapp node, appId:", gadgetAppInfo.getAppId());
                    return 6;
                } else if (!Patterns.WEB_URL.matcher(gadgetAppInfo.getWebUrl()).matches()) {
                    AppBrandLogger.m52829e("gadget_app_start_load_fetcher", "current app type is WebGadget,webUrl or webVersionCode info not correct, appId:", gadgetAppInfo.getAppId(), "weburl:", gadgetAppInfo.getWebUrl());
                    return 6;
                }
            }
            return 0;
        } catch (Exception e) {
            AppBrandLogger.m52829e("gadget_app_start_load_fetcher", "current app type is WebGadget,error:", e.getMessage(), "appId:", gadgetAppInfo.getAppId());
            return 6;
        }
    }
}
