package com.tt.miniapphost.p3369c;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.C67485a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.c.a */
public class C67472a {

    /* renamed from: a */
    private Map<String, AbstractC67474b> f170106a = new HashMap();

    /* renamed from: com.tt.miniapphost.c.a$a */
    public interface AbstractC67473a {
    }

    /* renamed from: a */
    public static C67472a m262437a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234271A();
    }

    /* renamed from: a */
    public boolean mo234221a(String str, JSONObject jSONObject) {
        try {
            AbstractC67474b bVar = this.f170106a.get(str);
            if (bVar != null) {
                return bVar.mo234225a(jSONObject);
            }
            return false;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e.getStackTrace());
            return false;
        }
    }

    /* renamed from: a */
    public String mo234218a(Activity activity, String str, JSONObject jSONObject) {
        try {
            AbstractC67474b bVar = this.f170106a.get(str);
            if (bVar != null) {
                return bVar.mo234222a(activity, jSONObject);
            }
            return null;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e.getStackTrace());
            return null;
        }
    }

    /* renamed from: a */
    public void mo234219a(Activity activity, String str, JSONObject jSONObject, AbstractC67473a aVar) {
        try {
            AbstractC67474b bVar = this.f170106a.get(str);
            if (bVar != null) {
                bVar.mo234223a(activity, jSONObject, aVar);
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e.getStackTrace());
        }
    }

    /* renamed from: a */
    public boolean mo234220a(String str, int i, int i2, Intent intent) {
        try {
            AbstractC67474b bVar = this.f170106a.get(str);
            if (bVar != null) {
                return bVar.mo234224a(i, i2, intent);
            }
            return false;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e.getStackTrace());
            return false;
        }
    }
}
