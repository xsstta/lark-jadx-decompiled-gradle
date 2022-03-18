package com.ss.android.lark.larkconfig.larksetting.handler.helpdesk;

import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.helpdesk.a */
public class C41196a extends AbstractBaseSettingHandler {

    /* renamed from: a */
    private HelpDeskSettingBean f104976a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.helpdesk.a$a */
    public static class C41198a {

        /* renamed from: a */
        public static C41196a f104977a = new C41196a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "helpdesk_common";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "HelpDeskSettingHandler";
    }

    /* renamed from: d */
    public static C41196a m163419d() {
        return C41198a.f104977a;
    }

    /* renamed from: e */
    public HelpDeskSettingBean mo107775e() {
        return this.f104976a;
    }

    private C41196a() {
        this.f104976a = new HelpDeskSettingBean();
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.larkconfig.larksetting.handler.helpdesk.$$Lambda$a$DopM_BmQPIv5GxQ95a7ZSPPzGW4 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41196a.lambda$DopM_BmQPIv5GxQ95a7ZSPPzGW4(C41196a.this, (String) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m163418a(String str) {
        this.f104976a = (HelpDeskSettingBean) C38760a.m153056a(str, HelpDeskSettingBean.class);
        return null;
    }
}
