package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.bytedance.ee.bear.lark.p414b.AbstractC7988a;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.a */
public class C39279a implements AbstractC7988a {

    /* renamed from: a */
    private Map<Object, AbstractC49379a> f100615a = new HashMap();

    /* renamed from: b */
    private IPassportApi f100616b = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7988a
    /* renamed from: b */
    public boolean mo30979b() {
        return this.f100616b.isCustomer();
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7988a
    /* renamed from: c */
    public String mo30980c() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantCode();
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7988a
    /* renamed from: a */
    public boolean mo30978a() {
        if (this.f100616b.getUser().getTenantTag() != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Chatter m154946a(String str) {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChatterById(str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC7988a
    /* renamed from: a */
    public void mo30977a(Context context, String str, String str2, String str3) {
        C57865c.m224574a(new C57865c.AbstractC57873d(str) {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$a$h4jgd9PVXSzNGll81Co0cESUVo */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C39279a.m270609lambda$h4jgd9PVXSzNGll81Co0cESUVo(this.f$0);
            }
        }, new C57865c.AbstractC57871b(str2, context, str, str3) {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$a$o2pnh1PwIsvcfGlUGpJQgCO1aQo */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C39279a.lambda$o2pnh1PwIsvcfGlUGpJQgCO1aQo(this.f$0, this.f$1, this.f$2, this.f$3, (Chatter) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154947a(String str, Context context, String str2, String str3, Chatter chatter) {
        if (chatter != null && !chatter.isBot()) {
            ContactSource contactSource = new ContactSource();
            contactSource.setSourceType(4);
            contactSource.setSourceName(str);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(context, str2, str3, contactSource);
        }
    }
}
