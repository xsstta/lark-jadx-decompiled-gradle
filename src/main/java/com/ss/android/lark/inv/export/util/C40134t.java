package com.ss.android.lark.inv.export.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.dybrid.router.C24258a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.inv.export.router.AbstractC40091a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.inv.export.util.t */
public class C40134t {

    /* renamed from: a */
    public static final Map<String, AbstractC40091a> f101976a = m159129b();

    /* renamed from: b */
    private static final Map<String, AbstractC40091a> f101977b = m159127a();

    /* renamed from: b */
    private static Map<String, AbstractC40091a> m159129b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, AbstractC40091a> entry : f101977b.entrySet()) {
            AbstractC40091a value = entry.getValue();
            hashMap.put(value.f101886a, value);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, AbstractC40091a> m159127a() {
        ArrayList<C40139b> arrayList = new ArrayList();
        arrayList.add(new C40139b("/invite/unified"));
        arrayList.add(new C40139b("/invite/unifiedSmart") {
            /* class com.ss.android.lark.inv.export.util.C40134t.C401351 */

            @Override // com.ss.android.lark.inv.export.router.AbstractC40091a, com.ss.android.lark.inv.export.util.C40134t.C40139b
            /* renamed from: a */
            public void mo145602a(Context context, Map<String, String> map) {
                C40147z.m159163c().openInvitationUnionPage(context, map.get("from_scenes"));
            }
        });
        arrayList.add(new C40139b("/invite/member"));
        arrayList.add(new C40139b("/invite/memberSmart") {
            /* class com.ss.android.lark.inv.export.util.C40134t.C401362 */

            @Override // com.ss.android.lark.inv.export.router.AbstractC40091a, com.ss.android.lark.inv.export.util.C40134t.C40139b
            /* renamed from: a */
            public void mo145602a(Context context, Map<String, String> map) {
                C40147z.m159163c().openInviteMemberPageSmart(context, map.get("from_scenes"));
            }
        });
        arrayList.add(new C40139b("/invite/member/channel"));
        arrayList.add(new C40139b("/invite/member/channelLark"));
        arrayList.add(new C40139b("/invite/member/share"));
        arrayList.add(new C40139b("/invite/member/teamcode"));
        arrayList.add(new C40139b("/invite/external") {
            /* class com.ss.android.lark.inv.export.util.C40134t.C401373 */

            @Override // com.ss.android.lark.inv.export.router.AbstractC40091a, com.ss.android.lark.inv.export.util.C40134t.C40139b
            /* renamed from: a */
            public void mo145602a(Context context, Map<String, String> map) {
                String str = map.get("from_scenes");
                String str2 = map.get("IS_MY_QR");
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                C40147z.m159163c().openInviteExternalPage(context, str, Boolean.parseBoolean(str2));
            }
        });
        arrayList.add(new C40139b("/invite/external/search"));
        arrayList.add(new C40139b("/invite/b2b"));
        HashMap hashMap = new HashMap();
        for (C40139b bVar : arrayList) {
            hashMap.put(bVar.f101886a, bVar);
        }
        Log.m165389i("InvitationModule", hashMap.toString());
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.inv.export.util.t$b */
    public static class C40139b extends AbstractC40091a {
        C40139b(String str) {
            super(str);
        }

        @Override // com.ss.android.lark.inv.export.router.AbstractC40091a
        /* renamed from: a */
        public void mo145602a(Context context, Map<String, String> map) {
            C24258a dynamicRouter = C40147z.m159160a().getDynamicRouter();
            if (dynamicRouter == null) {
                Log.m165383e("InvitationModule", "getDynamicRouter is null");
                return;
            }
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            dynamicRouter.mo86894a(context, this.f101888c, bundle);
        }
    }

    /* renamed from: a */
    public static Map<String, AbstractC29186b> m159128a(Context context) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, AbstractC40091a> entry : f101977b.entrySet()) {
            AbstractC40091a value = entry.getValue();
            hashMap.put(value.f101887b, new C40138a(context, value));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.inv.export.util.t$a */
    public static class C40138a extends AbstractC29186b {

        /* renamed from: a */
        private Context f101978a;

        /* renamed from: b */
        private AbstractC40091a f101979b;

        @Override // com.ss.android.lark.applink.AbstractC29194f
        /* renamed from: a */
        public boolean mo103482a() {
            return true;
        }

        @Override // com.ss.android.lark.applink.AbstractC29194f
        /* renamed from: d */
        public boolean mo103484d(Context context, AppLink appLink) {
            return true;
        }

        C40138a(Context context, AbstractC40091a aVar) {
            this.f101978a = context;
            this.f101979b = aVar;
        }

        @Override // com.ss.android.lark.applink.AbstractC29194f
        /* renamed from: c */
        public boolean mo103483c(Context context, AppLink appLink) {
            if (context == null) {
                context = this.f101978a;
            }
            String a = appLink.mo103435a();
            Log.m165389i("InvitationModule", "appLink handle url: " + a);
            this.f101979b.mo145603b(context, AbstractC40091a.m158939a(a));
            return true;
        }
    }
}
