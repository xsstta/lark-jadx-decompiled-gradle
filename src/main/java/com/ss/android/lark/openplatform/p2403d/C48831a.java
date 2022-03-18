package com.ss.android.lark.openplatform.p2403d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.plus.C48835a;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.activity.OpbActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.lark.openplatform.d.a */
public class C48831a {

    /* renamed from: a */
    private Map<String, C48835a> f122665a = new HashMap();

    /* renamed from: b */
    private Map<String, C48833b> f122666b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.openplatform.d.a$a */
    public static class C48832a {

        /* renamed from: a */
        static C48831a f122667a = new C48831a();
    }

    /* renamed from: com.ss.android.lark.openplatform.d.a$b */
    public static class C48833b {

        /* renamed from: a */
        private String f122668a;

        /* renamed from: b */
        private List<String> f122669b;

        /* renamed from: c */
        private List<Integer> f122670c;

        /* renamed from: d */
        private long f122671d;

        /* renamed from: a */
        public String mo170582a() {
            return this.f122668a;
        }

        /* renamed from: b */
        public List<String> mo170583b() {
            return this.f122669b;
        }

        /* renamed from: c */
        public long mo170584c() {
            return this.f122671d;
        }

        public C48833b(String str, List<String> list, List<Integer> list2, long j) {
            this.f122668a = str;
            this.f122669b = list;
            this.f122670c = list2;
            this.f122671d = j;
        }
    }

    /* renamed from: a */
    public static C48831a m192403a() {
        return C48832a.f122667a;
    }

    /* renamed from: a */
    public C48835a mo170578a(String str) {
        return this.f122665a.get(str);
    }

    /* renamed from: b */
    public C48833b mo170581b(String str) {
        return this.f122666b.get(str);
    }

    /* renamed from: a */
    public void mo170579a(Context context, int i, C48835a aVar) {
        OpbScene opbScene;
        OpenPlatformModule.m192198d().getAppCenterDependency().mo144967a(context);
        String uuid = UUID.randomUUID().toString();
        this.f122665a.put(uuid, aVar);
        Intent intent = new Intent(context, OpbActivity.class);
        Bundle bundle = new Bundle();
        if (aVar.mo170618a().mo202944d()) {
            opbScene = OpbScene.PLUS_MENU_GROUP;
        } else {
            opbScene = OpbScene.PLUS_MENU_SINGLE;
        }
        bundle.putSerializable("scene", opbScene);
        bundle.putString("uuid", uuid);
        intent.putExtras(bundle);
        boolean z = context instanceof Activity;
        if (!z) {
            intent.setFlags(268435456);
        }
        if (i == -1 || !z) {
            context.startActivity(intent);
        } else {
            ((Activity) context).startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public void mo170580a(Context context, List<String> list, List<Integer> list2, String str) {
        OpenPlatformModule.m192198d().getAppCenterDependency().mo144967a(context);
        String uuid = UUID.randomUUID().toString();
        this.f122666b.put(uuid, new C48833b(str, list, list2, System.currentTimeMillis() / 1000));
        Intent intent = new Intent(context, OpbActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("scene", OpbScene.MESSAGE_ACTION);
        bundle.putString("uuid", uuid);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }
}
