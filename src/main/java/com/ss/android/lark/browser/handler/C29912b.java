package com.ss.android.lark.browser.handler;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.log.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.browser.handler.b */
public class C29912b extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    private Map<String, String> f74640a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.handler.b$a */
    public static class C29914a {

        /* renamed from: a */
        public static C29912b f74641a = new C29912b();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "schema_manage_config";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: b */
    public String mo107773b() {
        return "schema_manage_sp_key";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "SchemaListConfigHandler";
    }

    /* renamed from: d */
    public static C29912b m110607d() {
        return C29914a.f74641a;
    }

    /* renamed from: com.ss.android.lark.browser.handler.b$b */
    public static class C29915b implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "SchemaListConfigHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C29912b.m110607d()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Unit m110609f() {
        this.f74640a = m110606a(mo148410h());
        return null;
    }

    /* renamed from: e */
    public Map<String, String> mo107775e() {
        Map<String, String> map = this.f74640a;
        if (map != null) {
            return map;
        }
        Log.m165389i("SchemaListConfigHandler", "handleSchemaList should not be empty something wrong");
        return new HashMap();
    }

    private C29912b() {
        this.f74640a = new HashMap();
        mo148402a(mo148412j().mo148421a(new Function1() {
            /* class com.ss.android.lark.browser.handler.$$Lambda$b$RsETHwGd9p7b5bF8ZN_nDTlJb0 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C29912b.this.m110608d((String) obj);
            }
        }).mo148428e(new Function0() {
            /* class com.ss.android.lark.browser.handler.$$Lambda$b$Wm8j5CwcCNZ195tXl1dKWNQTwtY */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29912b.this.m110609f();
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m110608d(String str) {
        this.f74640a = m110606a(str);
        return null;
    }

    /* renamed from: a */
    private Map<String, String> m110606a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new HashMap();
            }
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                return new HashMap();
            }
            JSONArray jSONArray = parseObject.getJSONArray("schema_handle_list");
            if (jSONArray != null) {
                if (!jSONArray.isEmpty()) {
                    JSONObject jSONObject = parseObject.getJSONObject("download_site_list");
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    int size = jSONArray.size();
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < size; i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, jSONObject.getString(string));
                        }
                    }
                    return hashMap;
                }
            }
            return new HashMap();
        } catch (Exception e) {
            Log.m165391i("SchemaListConfigHandler", e);
            return new HashMap();
        }
    }
}
