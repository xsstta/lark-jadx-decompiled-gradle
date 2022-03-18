package com.ss.android.lark.platform.p2503t.p2504a;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.safetynet.inhouse.C53215a;
import com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.t.a.a */
public class C52004a {

    /* renamed from: a */
    private static volatile C53215a f129165a;

    /* renamed from: b */
    private static AbstractC53217a m201776b() {
        return new AbstractC53217a() {
            /* class com.ss.android.lark.platform.p2503t.p2504a.C52004a.C520051 */

            @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a
            /* renamed from: a */
            public String mo178245a() {
                return DynamicConfigModule.m145551a(DomainSettings.Alias.SUITE_SECSDK);
            }

            @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a
            /* renamed from: b */
            public AbstractC53217a.AbstractC53218a mo178247b() {
                return new AbstractC53217a.AbstractC53218a() {
                    /* class com.ss.android.lark.platform.p2503t.p2504a.C52004a.C520051.C520061 */

                    @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a.AbstractC53218a
                    /* renamed from: a */
                    public boolean mo178251a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a
            /* renamed from: c */
            public Context mo178248c() {
                return LarkContext.getApplication().getApplicationContext();
            }

            @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a
            /* renamed from: d */
            public int mo178249d() {
                return C29410a.m108287a().mo104277a();
            }

            @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a
            /* renamed from: e */
            public boolean mo178250e() {
                return C26284k.m95186b(LarkContext.getApplication());
            }

            @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a
            /* renamed from: a */
            public void mo178246a(final AbstractC53217a.AbstractC53219b bVar) {
                C36083a.m141486a().getPassportDependency().mo133057a(LarkContext.getApplication(), new IGetDataCallback<DeviceId>() {
                    /* class com.ss.android.lark.platform.p2503t.p2504a.C52004a.C520051.C520072 */

                    /* renamed from: a */
                    public void onSuccess(DeviceId deviceId) {
                        bVar.mo181671a(deviceId.getDeviceId());
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        bVar.mo181672b(errorResult.getDisplayMsg());
                    }
                });
            }
        };
    }

    /* renamed from: a */
    public static C53215a m201775a() {
        if (f129165a == null) {
            synchronized (C53215a.class) {
                if (f129165a == null) {
                    f129165a = new C53215a(m201776b());
                }
            }
        }
        return f129165a;
    }
}
