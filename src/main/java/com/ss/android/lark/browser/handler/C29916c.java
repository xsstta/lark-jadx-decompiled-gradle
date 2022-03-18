package com.ss.android.lark.browser.handler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.log.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.browser.handler.c */
public class C29916c extends AbstractBaseSettingHandler {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.handler.c$a */
    public static class C29918a {

        /* renamed from: a */
        public static C29916c f74642a = new C29916c();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "ttwebview_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "TTWebViewConfigHandler";
    }

    /* renamed from: d */
    public static C29916c m110618d() {
        return C29918a.f74642a;
    }

    /* renamed from: com.ss.android.lark.browser.handler.c$b */
    public static class C29919b implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "TTWebViewConfigHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C29916c.m110618d()));
        }
    }

    private C29916c() {
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.browser.handler.$$Lambda$c$eKdrtc4reOURlyMie96s8OylPh4 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C29916c.this.m110619d((String) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m110619d(String str) {
        m110617a(str);
        return null;
    }

    /* renamed from: a */
    private void m110617a(String str) {
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            JSONArray jSONArray = parseObject.getJSONArray("sdk_api_blacklist");
            JSONArray jSONArray2 = parseObject.getJSONArray("model_whitelist");
            String string = parseObject.getString("ttwebview_init_setting");
            mo148404a(jSONArray, "sdk_api_blacklist");
            mo148404a(jSONArray2, "model_whitelist");
            mo148403a(string, "ttwebview_init_setting");
        } catch (JSONException e) {
            Log.m165391i("TTWebViewConfigHandler", e);
        } catch (Exception e2) {
            Log.m165391i("TTWebViewConfigHandler", e2);
        }
    }
}
