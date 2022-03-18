package com.bytedance.ee.bear.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ee.bear.permission.AbstractBinderC10473a;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.ee.bear.permission.d */
public class C10477d {

    /* renamed from: a */
    public static String f28179a = "permission";

    /* renamed from: b */
    public static String f28180b = "permission_map";

    /* renamed from: c */
    public static String f28181c = "need_show_deny_dialog";

    /* renamed from: d */
    public static String f28182d = "request_id";

    /* renamed from: e */
    public final HashMap<String, C10479a> f28183e = new HashMap<>();

    /* renamed from: f */
    private AbstractBinderC10473a f28184f;

    /* renamed from: g */
    private C10476c f28185g;

    public C10477d() {
        m43469a();
    }

    /* renamed from: a */
    private void m43469a() {
        this.f28185g = new C10476c();
        this.f28184f = new AbstractBinderC10473a() {
            /* class com.bytedance.ee.bear.permission.C10477d.BinderC104781 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.permission.AbstractBinderC10473a
            /* renamed from: a */
            public void mo39792a(AbstractBinderC10473a.C10474a aVar) {
                C13479a.m54772d("PermissionCheck", "PermissionManager onCallback: result=" + aVar);
                if (C10477d.this.f28183e.get(aVar.mo39795b()) == null || C10477d.this.f28183e.get(aVar.mo39795b()).f28189c == null) {
                    C13479a.m54772d("PermissionCheck", "PermissionManager onCallback: no handler");
                    return;
                }
                int a = aVar.mo39794a();
                if (a == -1) {
                    C10477d.this.f28183e.remove(aVar.mo39795b());
                } else if (a == 100) {
                    C10477d.this.f28183e.get(aVar.mo39795b()).f28189c.mo39797a(true);
                } else if (a == 101) {
                    C10477d.this.f28183e.get(aVar.mo39795b()).f28189c.mo39797a(false);
                } else if (a == 200) {
                    C10477d.this.f28183e.get(aVar.mo39795b()).f28189c.mo39798b(true);
                } else if (a == 201) {
                    C10477d.this.f28183e.get(aVar.mo39795b()).f28189c.mo39798b(false);
                }
            }
        };
    }

    /* renamed from: a */
    private String[] m43471a(Map<String, String> map) {
        return (String[]) new ArrayList(map.keySet()).toArray(new String[map.size()]);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.permission.d$a */
    public class C10479a {

        /* renamed from: a */
        Context f28187a;

        /* renamed from: b */
        String[] f28188b;

        /* renamed from: c */
        AbstractC10475b f28189c;

        /* renamed from: d */
        String f28190d;

        private C10479a(Context context, String[] strArr, AbstractC10475b bVar) {
            this.f28187a = context;
            this.f28188b = strArr;
            this.f28189c = bVar;
            this.f28190d = UUID.randomUUID().toString();
        }
    }

    /* renamed from: a */
    public void mo39802a(Context context, HashMap<String, String> hashMap, boolean z, AbstractC10475b bVar) {
        if (Build.VERSION.SDK_INT < 23) {
            C13479a.m54772d("PermissionCheck", "checkRequestedPermissions: api is " + Build.VERSION.SDK_INT);
            if (bVar != null) {
                bVar.mo39797a(true);
                return;
            }
            return;
        }
        C13479a.m54772d("PermissionCheck", "PermissionManager checkRequestedPermissions: ");
        String[] a = m43471a(hashMap);
        if (!this.f28185g.mo39801a(context, a)) {
            C13479a.m54772d("PermissionCheck", "PermissionManager checkRequestedPermissions: do check");
            m43470a(context, hashMap, a, z, bVar);
            return;
        }
        bVar.mo39797a(true);
        C13479a.m54772d("PermissionCheck", "PermissionManager checkRequestedPermissions: successful");
    }

    /* renamed from: a */
    private void m43470a(Context context, HashMap<String, String> hashMap, String[] strArr, boolean z, AbstractC10475b bVar) {
        C13479a.m54764b("PermissionCheck", "PermissionManager redirectToPermissionGuideUI: ");
        try {
            C10479a aVar = new C10479a(context, strArr, bVar);
            Intent intent = new Intent(context, PermissionGuideActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("callback", new BinderParcelable(this.f28184f));
            bundle.putStringArray(f28179a, strArr);
            bundle.putSerializable(f28180b, hashMap);
            bundle.putString(f28182d, aVar.f28190d);
            bundle.putBoolean(f28181c, z);
            intent.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bundle);
            this.f28183e.put(aVar.f28190d, aVar);
            context.startActivity(intent);
        } catch (Exception e) {
            C13479a.m54769c("PermissionCheck", "redirectToPermissionGuideUI: ", e);
            e.printStackTrace();
        }
    }
}
