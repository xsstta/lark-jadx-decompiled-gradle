package com.ss.android.lark.openplatform.webapp.tab.plugin;

import android.os.RemoteException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.webapp.v2.WebAppDelegateBinder;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.plugins.utils.ApiCode;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.openplatform.webapp.tab.C48898e;
import com.ss.android.lark.openplatform.webapp.tab.plugin.SetMainNavRightItemsPlugin;

public class SetMainNavRightItemsPlugin extends OPPlugin {
    private WebAppDelegateBinder mWebAppDelegateBinder;
    private C48898e mWebAppTitleInfo;

    public static class Item {
        @JSONField(name = "iconURL")
        @LKRequiredParam
        public String iconURL;
        @JSONField(name = "id")
        @LKRequiredParam
        public String id;
        public Runnable onClick;
    }

    public static class Items extends C25920a {
        @JSONField(name = "items")
        @LKRequiredParam
        public Item[] items;
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mWebAppTitleInfo = null;
        this.mWebAppDelegateBinder = null;
    }

    public /* synthetic */ void lambda$setMainNavRightItems$0$SetMainNavRightItemsPlugin(Item item) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) item.id);
        try {
            this.mWebAppDelegateBinder.fireEvent("onMainNavRightItemClick", jSONObject.toJSONString());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public SetMainNavRightItemsPlugin(C48898e eVar, WebAppDelegateBinder webAppDelegateBinder) {
        this.mWebAppTitleInfo = eVar;
        this.mWebAppDelegateBinder = webAppDelegateBinder;
    }

    @LKPluginFunction(async = true, eventName = {"setMainNavRightItems"})
    public void setMainNavRightItems(Items items, AbstractC25897h<C25921b> hVar) {
        if (items == null || items.items.length > 3) {
            C25921b bVar = new C25921b();
            bVar.mErrorCode = ApiCode.GENERAL_PARAM.code;
            bVar.mErrorMessage = ApiCode.GENERAL_PARAM.msg;
            hVar.callback(bVar);
        }
        Item[] itemArr = items.items;
        for (Item item : itemArr) {
            item.onClick = new Runnable(item) {
                /* class com.ss.android.lark.openplatform.webapp.tab.plugin.$$Lambda$SetMainNavRightItemsPlugin$r0uMT1fkj6K4BTE3j7JsTJWyd1Y */
                public final /* synthetic */ SetMainNavRightItemsPlugin.Item f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    SetMainNavRightItemsPlugin.this.lambda$setMainNavRightItems$0$SetMainNavRightItemsPlugin(this.f$1);
                }
            };
        }
        this.mWebAppTitleInfo.mo170742a(items.items);
    }
}
