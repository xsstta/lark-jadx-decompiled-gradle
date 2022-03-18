package com.tt.refer.impl.business.meta;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.impl.business.meta.GadgetSchema;
import java.util.ArrayList;
import java.util.Map;

public class GadgetBeanConverter {
    public static GadgetSchema.C67943Entity convertAppInfoEntityToSchemaEntity(AppInfoEntity appInfoEntity) {
        GadgetSchema.C67943Entity entity = new GadgetSchema.C67943Entity(appInfoEntity.appId);
        entity.setToken(appInfoEntity.token);
        entity.setLaunchQuery(appInfoEntity.bdpLaunchQuery);
        entity.setVersionType(appInfoEntity.versionType);
        entity.setIcon(appInfoEntity.icon);
        entity.setName(appInfoEntity.appName);
        entity.setStartPage(appInfoEntity.startPage);
        entity.setShareTicket(appInfoEntity.shareTicket);
        entity.setSubScene(appInfoEntity.subScene);
        entity.setScene(appInfoEntity.scene);
        entity.setLaunchActionAbility(appInfoEntity.launchActionAbility);
        return entity;
    }

    public static PackageEntity convertAppInfoEntityToPackageEntity(AppInfoEntity appInfoEntity, IAppContext iAppContext) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setAppId(appInfoEntity.appId);
        packageEntity.setIdentifier(appInfoEntity.appId);
        packageEntity.setJsonMeta(appInfoEntity.toString());
        if (iAppContext.getAppType() == AppType.WebGadgetAPP) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(appInfoEntity.mWebApp.mo234351b());
            packageEntity.setUrls(arrayList);
            packageEntity.setMd5(appInfoEntity.mWebApp.mo234349a());
            packageEntity.setPackageName(appInfoEntity.mWebApp.mo234353c());
        } else {
            packageEntity.setPackageName(appInfoEntity.version);
            packageEntity.setUrls(appInfoEntity.appUrls);
            packageEntity.setMd5(appInfoEntity.md5);
        }
        packageEntity.setCompileVersion(appInfoEntity.compileVersion);
        if (appInfoEntity.packageComponents != null) {
            Map<String, PackageComponent> map = appInfoEntity.packageComponents;
            ArrayList arrayList2 = new ArrayList();
            if (map != null && !map.isEmpty()) {
                arrayList2.addAll(map.keySet());
            }
            packageEntity.setRootPaths(arrayList2);
            packageEntity.setPackageComponents(map);
        }
        return packageEntity;
    }

    public static PackageEntity convertAppInfoEntityToPackageEntity(GadgetAppInfo gadgetAppInfo, IAppContext iAppContext) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setAppId(gadgetAppInfo.getAppId());
        packageEntity.setIdentifier(gadgetAppInfo.getIdentifier());
        packageEntity.setJsonMeta(gadgetAppInfo.toString());
        if (iAppContext.getAppType() == AppType.WebGadgetAPP) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(gadgetAppInfo.getWebUrl());
            packageEntity.setUrls(arrayList);
            packageEntity.setMd5(gadgetAppInfo.getWebMd5());
            packageEntity.setPackageName(gadgetAppInfo.getWebVersionCode());
        } else {
            packageEntity.setPackageName(gadgetAppInfo.getAppVersion());
            packageEntity.setUrls(gadgetAppInfo.getPaths());
            packageEntity.setMd5(gadgetAppInfo.getDecodeMd5());
        }
        packageEntity.setCompileVersion(gadgetAppInfo.getCompileVersion());
        if (gadgetAppInfo.getPackageComponents() != null) {
            Map<String, PackageComponent> packageComponents = gadgetAppInfo.getPackageComponents();
            ArrayList arrayList2 = new ArrayList();
            if (packageComponents != null && !packageComponents.isEmpty()) {
                arrayList2.addAll(packageComponents.keySet());
            }
            packageEntity.setRootPaths(arrayList2);
            packageEntity.setPackageComponents(packageComponents);
        }
        return packageEntity;
    }

    public static AppInfoEntity convertGadgetAppInfoToAppInfoEntity(GadgetAppInfo gadgetAppInfo, GadgetSchema.C67943Entity entity) {
        AppInfoEntity appInfoEntity = new AppInfoEntity();
        appInfoEntity.scene = entity.getScene();
        appInfoEntity.subScene = entity.getSubScene();
        appInfoEntity.bdpLaunchQuery = entity.getLaunchQuery();
        appInfoEntity.startPage = entity.getStartPage();
        appInfoEntity.shareTicket = entity.getShareTicket();
        appInfoEntity.token = entity.getToken();
        appInfoEntity.versionType = entity.getVersionType();
        appInfoEntity.appId = gadgetAppInfo.getAppId();
        appInfoEntity.appName = gadgetAppInfo.getName();
        appInfoEntity.icon = gadgetAppInfo.getIcon();
        appInfoEntity.version = gadgetAppInfo.getAppVersion();
        appInfoEntity.domains = gadgetAppInfo.getDecodeDomains();
        if (!TextUtils.isEmpty(gadgetAppInfo.getWebUrl())) {
            AppInfoEntity.WebApp webApp = new AppInfoEntity.WebApp();
            webApp.mo234350a(gadgetAppInfo.getWebMd5());
            webApp.mo234352b(gadgetAppInfo.getWebUrl());
            webApp.mo234354c(gadgetAppInfo.getWebVersionCode());
            appInfoEntity.mWebApp = webApp;
        }
        appInfoEntity.appUrls = gadgetAppInfo.getPaths();
        appInfoEntity.md5 = gadgetAppInfo.getDecodeMd5();
        appInfoEntity.state = gadgetAppInfo.getState();
        appInfoEntity.versionState = gadgetAppInfo.getVersionState();
        appInfoEntity.minJssdk = gadgetAppInfo.getMinJsSdk();
        appInfoEntity.shareLevel = gadgetAppInfo.getShareLevel();
        appInfoEntity.encryptextra = gadgetAppInfo.getDecodeExtra();
        appInfoEntity.versionCode = gadgetAppInfo.getVersionCode();
        appInfoEntity.supportMessageAction = gadgetAppInfo.isSupportMessageAction();
        appInfoEntity.supportChatAction = gadgetAppInfo.isSupportChatAction();
        appInfoEntity.compileVersion = gadgetAppInfo.getCompileVersion();
        appInfoEntity.launchActionAbility = entity.getLaunchActionAbility();
        appInfoEntity.type = gadgetAppInfo.getType();
        int i = 1;
        if (gadgetAppInfo.getMetaSource() != 1) {
            i = 0;
        }
        appInfoEntity.getFromType = i;
        appInfoEntity.jsComponents = gadgetAppInfo.getJsComponents();
        appInfoEntity.mGadgetSafeDomains = gadgetAppInfo.getGadgetSafeDomains();
        appInfoEntity.packageComponents = gadgetAppInfo.getPackageComponents();
        return appInfoEntity;
    }

    public static void requestAppMeta(Context context, IAppContext iAppContext, final GadgetSchema.C67943Entity entity, int i, final C66375a.AbstractC66376a aVar) {
        new GadgetMetaFetcher(iAppContext).mo235274a(context, entity, i, new AbstractC67788b.AbstractC67792b<GadgetAppInfo>() {
            /* class com.tt.refer.impl.business.meta.GadgetBeanConverter.C679411 */

            /* renamed from: a */
            public void onRequestAppMetaSuccess(int i, GadgetAppInfo gadgetAppInfo) {
                aVar.mo148970a(i, GadgetBeanConverter.convertGadgetAppInfoToAppInfoEntity(gadgetAppInfo, entity));
            }

            @Override // com.tt.refer.common.meta.AbstractC67788b.AbstractC67792b
            public void onRequestAppMetaFail(int i, String str, String str2) {
                aVar.mo148972a(i, str, str2);
            }

            /* renamed from: a */
            public void onAppMetaInvalid(int i, GadgetAppInfo gadgetAppInfo, int i2) {
                aVar.mo148971a(i, GadgetBeanConverter.convertGadgetAppInfoToAppInfoEntity(gadgetAppInfo, entity), i2);
            }
        });
    }
}
