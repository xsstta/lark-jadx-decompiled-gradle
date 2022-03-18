package com.ss.android.lark.browser.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.browser.handler.a */
public class C29908a extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    private List<String> f74636a;

    /* renamed from: c */
    private List<String> f74637c;

    /* renamed from: d */
    private List<String> f74638d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.handler.a$b */
    public static class C29911b {

        /* renamed from: a */
        public static C29908a f74639a = new C29908a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "domain_manage_policy";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: b */
    public String mo107773b() {
        return "BizDomainAllowListConfigHandler";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "BizDomainAllowListConfigHandler";
    }

    /* renamed from: d */
    public static C29908a m110593d() {
        return C29911b.f74639a;
    }

    /* renamed from: com.ss.android.lark.browser.handler.a$a */
    public static class C29910a implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "BizDomainAllowListConfigHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C29908a.m110593d()));
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return !C29638a.m109622a().isFeatureGatingEnable("lark.browser.security.link");
        }
    }

    /* renamed from: e */
    public List<String> mo107775e() {
        if (!CollectionUtils.isEmpty(this.f74636a)) {
            return new CopyOnWriteArrayList(this.f74636a);
        }
        Log.m165389i("BizDomainAllowListConfigHandler", "mSecLinkWhiteList should not be empty something wrong");
        return m110595p();
    }

    /* renamed from: f */
    public List<String> mo107776f() {
        if (!CollectionUtils.isEmpty(this.f74638d)) {
            return new CopyOnWriteArrayList(this.f74638d);
        }
        Log.m165389i("BizDomainAllowListConfigHandler", "mJSApiWhiteList should not be empty something wrong");
        return new ArrayList();
    }

    /* renamed from: g */
    public List<String> mo107777g() {
        if (!CollectionUtils.isEmpty(this.f74637c)) {
            return new CopyOnWriteArrayList(this.f74637c);
        }
        Log.m165389i("BizDomainAllowListConfigHandler", "mJSApiTrustList should not be empty something wrong");
        return new ArrayList();
    }

    private C29908a() {
        this.f74636a = new ArrayList();
        this.f74637c = new ArrayList();
        this.f74638d = new ArrayList();
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.browser.handler.$$Lambda$a$5eomilfqtLc5ZxquwGuOyjclAiE */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C29908a.this.m110594d((String) obj);
            }
        }).mo148428e(new Function0() {
            /* class com.ss.android.lark.browser.handler.$$Lambda$a$Vor_LtovE62We3JE6IXMb9KPKUc */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29908a.this.m110596q();
            }
        }));
    }

    /* renamed from: p */
    private List<String> m110595p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(".*\\.feishu-staging\\.cn$");
        arrayList.add(".*\\\\.larksuite-staging\\\\.com$");
        arrayList.add(".*\\.feishu\\.cn$");
        arrayList.add("^feishu\\.cn$");
        arrayList.add(".*\\.larksuite\\.com$");
        arrayList.add(".*\\.feishu-pre\\.cn$");
        arrayList.add(".*\\.larksuite-pre\\.com$");
        arrayList.add("^larksuite\\.help$");
        arrayList.add("^getfeishu\\.cn$");
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Unit m110596q() {
        List<String> a = m110590a("sec_link_whitelist_sp_key");
        if (a != null && !a.isEmpty()) {
            this.f74636a.clear();
            this.f74636a.addAll(a);
        }
        List<String> a2 = m110590a("js_api_host_trust_list_sp_key");
        if (a2 != null && !a2.isEmpty()) {
            this.f74637c.clear();
            this.f74637c.addAll(a2);
        }
        List<String> a3 = m110590a("js_api_white_list_sp_key");
        if (a3 == null || a3.isEmpty()) {
            return null;
        }
        this.f74638d.clear();
        this.f74638d.addAll(a3);
        return null;
    }

    /* renamed from: a */
    private List<String> m110590a(String str) {
        return mo148400a(str, String.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m110594d(String str) {
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                return null;
            }
            m110591a(parseObject.getJSONArray("sec_link_whitelist"), this.f74636a);
            m110591a(parseObject.getJSONArray("js_api_white_list"), this.f74638d);
            m110591a(parseObject.getJSONArray("js_api_host_trust_list"), this.f74637c);
            m110592a("sec_link_whitelist_sp_key", this.f74636a);
            m110592a("js_api_host_trust_list_sp_key", this.f74637c);
            m110592a("js_api_white_list_sp_key", this.f74638d);
            return null;
        } catch (JSONException e) {
            Log.m165391i("BizDomainAllowListConfigHandler", e);
        } catch (Exception e2) {
            Log.m165391i("BizDomainAllowListConfigHandler", e2);
        }
    }

    /* renamed from: a */
    private void m110592a(String str, List<String> list) {
        mo148404a(list, str);
    }

    /* renamed from: a */
    private void m110591a(JSONArray jSONArray, List list) {
        if (!(jSONArray == null || jSONArray.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            list.clear();
            list.addAll(arrayList);
        }
    }
}
