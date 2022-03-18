package com.ss.android.lark.larkconfig.larksetting.handler.p2107a;

import android.text.TextUtils;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.C41163b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.a.a */
public class C41170a extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    private String f104956a;

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "AbTestHandler";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return this.f104956a;
    }

    /* renamed from: d */
    public static Collection<C41170a> m163360d() {
        return C41172a.f104957a.values();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.a.a$a */
    public static class C41172a {

        /* renamed from: a */
        public static Map<String, C41170a> f104957a = new HashMap();

        static {
            for (String str : C41163b.m163326a().getAllAbTestKeys()) {
                f104957a.put(str, new C41170a(str));
            }
        }
    }

    private C41170a(String str) {
        this.f104956a = str;
        mo148402a(mo148412j());
    }

    /* renamed from: a */
    public static <T> T m163359a(String str, Class<T> cls, T t) {
        T t2;
        C41170a aVar = C41172a.f104957a.get(str);
        if (aVar == null || TextUtils.isEmpty(aVar.mo148410h()) || (t2 = (T) C38760a.m153056a(aVar.mo148410h(), cls)) == null) {
            return t;
        }
        return t2;
    }
}
