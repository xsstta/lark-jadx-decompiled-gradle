package com.ss.android.lark.larkconfig.larksetting.handler.p2111e;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.e.a */
public class C41185a extends AbstractBaseSettingHandler {

    /* renamed from: a */
    private int f104964a = 50;

    /* renamed from: c */
    private String f104965c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.e.a$a */
    public static class C41186a {

        /* renamed from: a */
        public static final C41185a f104966a = new C41185a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "contacts_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "ContactSettingHandler";
    }

    /* renamed from: d */
    public static C41185a m163389d() {
        return C41186a.f104966a;
    }

    /* renamed from: e */
    public int mo107775e() {
        return this.f104964a;
    }

    /* renamed from: f */
    public String mo107776f() {
        return this.f104965c;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Unit m163391g() {
        m163388a(mo148410h());
        return null;
    }

    public C41185a() {
        mo148402a(mo148412j().mo148421a(new Function1() {
            /* class com.ss.android.lark.larkconfig.larksetting.handler.p2111e.$$Lambda$a$G1iCvwrYF8u1wjntTzmHtIrMpt4 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41185a.lambda$G1iCvwrYF8u1wjntTzmHtIrMpt4(C41185a.this, (String) obj);
            }
        }).mo148428e(new Function0() {
            /* class com.ss.android.lark.larkconfig.larksetting.handler.p2111e.$$Lambda$a$rQsDXDmXY9Lk9K5rsWKck3dH58 */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41185a.m270687lambda$rQsDXDmXY9Lk9K5rsWKck3dH58(C41185a.this);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m163390d(String str) {
        m163388a(str);
        return null;
    }

    /* renamed from: a */
    private void m163388a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f104964a = jSONObject.optInt("max_unauth_external_contacts_select_number");
            this.f104965c = jSONObject.optString("contact_organize_department_adminURL");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
