package com.larksuite.component.dybrid.router.p1087d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24260b;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24262d;
import com.larksuite.component.dybrid.router.p1084a.C24261c;
import com.larksuite.component.dybrid.router.p1085b.C24268b;
import com.larksuite.component.dybrid.router.p1085b.C24269c;
import com.larksuite.component.dybrid.router.p1086c.AbstractC24271b;
import com.larksuite.component.dybrid.router.p1088e.C24274a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.larksuite.component.dybrid.router.d.a */
public class C24272a extends AbstractC24260b implements AbstractC24271b {

    /* renamed from: b */
    static Map<String, String> f59928b = new HashMap();

    /* renamed from: c */
    static Map<String, Class<? extends Activity>> f59929c = new HashMap();

    /* renamed from: d */
    private static boolean f59930d = true;

    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    public boolean ab_() {
        return f59930d;
    }

    public C24272a() {
        this.f59922a = "";
    }

    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    /* renamed from: a */
    public boolean mo86850a(String str) {
        if (str.startsWith("http") || str.startsWith("https")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public String mo86910b(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || parse.isOpaque()) {
            return str;
        }
        return str.replace(parse.getScheme() + ":", "");
    }

    @Override // com.larksuite.component.dybrid.router.p1086c.AbstractC24271b
    /* renamed from: a */
    public void mo86909a(String str, String str2) {
        if (!f59928b.containsKey(str)) {
            f59928b.put(str, str2);
        }
    }

    /* renamed from: a */
    private Bundle m88619a(Bundle bundle, String str) {
        for (String str2 : bundle.keySet()) {
            Map<String, Class<? extends Activity>> map = f59929c;
            Class<? extends Activity> cls = map.get(str + "_" + str2);
            if (!(cls == null || bundle.getString(str2) == null)) {
                m88620a(bundle, str2, bundle.getString(str2), cls);
            }
        }
        return bundle;
    }

    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    /* renamed from: a */
    public C24269c mo86848a(Context context, C24269c cVar, AbstractC24262d dVar) {
        String str;
        if (("NativeRouterHandler url = " + cVar) == null) {
            str = "empty ";
        } else {
            str = C24274a.m88628a(cVar.mo86903a());
        }
        Log.m165389i("NativeRouterHandler", str);
        if (cVar == null) {
            return cVar;
        }
        if (cVar instanceof C24268b) {
            cVar = ((C24268b) cVar).mo86906d();
        }
        String str2 = f59928b.get(cVar.mo86903a());
        if (str2 == null) {
            str2 = f59928b.get(mo86910b(cVar.mo86903a()));
        }
        boolean z = false;
        if (str2 == null) {
            Log.m165383e("", "start " + cVar.mo86903a() + " failed: not found " + cVar.mo86903a());
            if (dVar != null) {
                int a = C24261c.m88602a();
                dVar.mo86897a(a, "start " + cVar.mo86903a() + " failed: not found " + cVar.mo86903a());
            }
            f59930d = false;
            return cVar;
        }
        Intent intent = new Intent();
        intent.setClassName(context, str2);
        if (cVar.mo86904b().get("for_result") != null) {
            z = true;
        }
        int i = cVar.mo86904b().getInt("for_result_code");
        if (z) {
            cVar.mo86904b().remove("for_result");
            cVar.mo86904b().remove("for_result_code");
        }
        boolean z2 = context instanceof Activity;
        if (!z2) {
            intent.addFlags(268435456);
        }
        intent.putExtras(m88619a(cVar.mo86904b(), str2));
        if (!z || !z2) {
            context.startActivity(intent);
        } else {
            ((Activity) context).startActivityForResult(intent, i);
        }
        if (dVar != null) {
            dVar.mo86898a(Integer.valueOf(C24261c.m88602a()));
        }
        return cVar;
    }

    /* renamed from: a */
    private void m88620a(Bundle bundle, String str, String str2, Class cls) {
        if (cls == Boolean.class) {
            bundle.putBoolean(str, Boolean.getBoolean(str2));
        } else if (cls == Byte.class) {
            bundle.putByte(str, Byte.valueOf(str2).byteValue());
        } else if (cls == Double.class) {
            bundle.putDouble(str, Double.valueOf(str2).doubleValue());
        } else if (cls == Float.class) {
            bundle.putFloat(str, Float.valueOf(str2).floatValue());
        } else if (cls == Integer.class) {
            bundle.putInt(str, Integer.valueOf(str2).intValue());
        } else if (cls == String.class) {
            bundle.putString(str, str2);
        } else if (cls == Long.class) {
            bundle.putLong(str, Long.valueOf(str2).longValue());
        } else if (cls == Short.class) {
            bundle.putShort(str, Short.valueOf(str2).shortValue());
        }
    }
}
