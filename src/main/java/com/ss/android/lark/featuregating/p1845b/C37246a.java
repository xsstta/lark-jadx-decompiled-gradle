package com.ss.android.lark.featuregating.p1845b;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.log.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.featuregating.b.a */
public class C37246a extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    public IGetDataCallback<Map<String, Boolean>> f95642a;

    /* renamed from: c */
    private IGetDataCallback<Map<String, Boolean>> f95643c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.featuregating.b.a$b */
    public static class C37249b {

        /* renamed from: a */
        public static C37246a f95645a = new C37246a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "lark_features";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: b */
    public String mo107773b() {
        return "cache_setting_feature_gating";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "FeatureGatingHandler";
    }

    /* renamed from: d */
    public static C37246a m146666d() {
        return C37249b.f95645a;
    }

    /* renamed from: com.ss.android.lark.featuregating.b.a$a */
    public static class C37248a implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "FeatureGatingHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C37246a.m146666d()));
        }
    }

    private C37246a() {
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.featuregating.p1845b.$$Lambda$a$UCZ9MGAtd37H41TDKVn8iHxwwp8 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37246a.this.m146667d((String) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m146667d(String str) {
        if (this.f95642a == null || this.f95643c == null) {
            Log.m165397w("FeatureGatingHandler", "fetch data too early, will do init before callback.");
            C37239a.m146648b().mo136950a();
        }
        C37239a.m146644a().mo136943a(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.featuregating.p1845b.C37246a.C372471 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C37246a aVar = C37246a.this;
                aVar.mo136948a(str, aVar.f95642a);
            }
        });
        mo136948a(str, this.f95643c);
        return null;
    }

    /* renamed from: a */
    private HashMap<String, Boolean> m146665a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap<String, Boolean> hashMap = new HashMap<>();
            JSONArray jSONArray = JSON.parseObject(str).getJSONArray("online");
            if (jSONArray == null) {
                Log.m165397w("FeatureGatingHandler", "parse feature gating json failed");
                return null;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it != null && it.hasNext()) {
                hashMap.put(it.next().toString(), true);
            }
            return hashMap;
        } catch (Exception unused) {
            Log.m165397w("FeatureGatingHandler", "parse feature gating json failed");
            return null;
        }
    }

    /* renamed from: a */
    public void mo136947a(IGetDataCallback<Map<String, Boolean>> iGetDataCallback, IGetDataCallback<Map<String, Boolean>> iGetDataCallback2) {
        this.f95642a = iGetDataCallback;
        this.f95643c = iGetDataCallback2;
    }

    /* renamed from: a */
    public void mo136948a(String str, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        HashMap<String, Boolean> a = m146665a(str);
        if (a == null || iGetDataCallback == null) {
            Log.m165383e("FeatureGatingHandler", "notifyFgChanged callback is null.");
        } else {
            iGetDataCallback.onSuccess(a);
        }
    }
}
