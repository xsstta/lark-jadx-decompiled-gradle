package com.bytedance.ee.bear.basesdk.services;

import com.bytedance.ee.bear.drive.services.AbstractC7180h;
import com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.services.d */
public class C4503d extends AbstractC7180h {

    /* renamed from: a */
    private static volatile AbstractC4505a f13188a;

    /* renamed from: com.bytedance.ee.bear.basesdk.services.d$a */
    public interface AbstractC4505a {
        /* renamed from: a */
        void mo17333a(String str, AbstractC4506b bVar);
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.services.d$b */
    public interface AbstractC4506b {
        /* renamed from: a */
        void mo17331a();

        /* renamed from: a */
        void mo17332a(int i, String str);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    /* renamed from: a */
    public static void m18563a(AbstractC4505a aVar) {
        f13188a = aVar;
        C13479a.m54764b("SdkPluginServiceImpl", "setPluginCallback, cb=" + aVar);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n
    public void onPluginUpdate(String str, final BinderIPluginUpdateCallback binderIPluginUpdateCallback) {
        if (f13188a != null) {
            try {
                C13479a.m54764b("SdkPluginServiceImpl", "onPluginUpdate, name=" + str + ", cb=" + binderIPluginUpdateCallback);
                f13188a.mo17333a(str, new AbstractC4506b() {
                    /* class com.bytedance.ee.bear.basesdk.services.C4503d.C45041 */

                    @Override // com.bytedance.ee.bear.basesdk.services.C4503d.AbstractC4506b
                    /* renamed from: a */
                    public void mo17331a() {
                        BinderIPluginUpdateCallback binderIPluginUpdateCallback = binderIPluginUpdateCallback;
                        if (binderIPluginUpdateCallback != null) {
                            try {
                                binderIPluginUpdateCallback.onSuccess();
                            } catch (Throwable th) {
                                C13479a.m54761a("SdkPluginServiceImpl", th);
                            }
                        }
                    }

                    @Override // com.bytedance.ee.bear.basesdk.services.C4503d.AbstractC4506b
                    /* renamed from: a */
                    public void mo17332a(int i, String str) {
                        BinderIPluginUpdateCallback binderIPluginUpdateCallback = binderIPluginUpdateCallback;
                        if (binderIPluginUpdateCallback != null) {
                            try {
                                binderIPluginUpdateCallback.onFailed(i, str);
                            } catch (Throwable th) {
                                C13479a.m54761a("SdkPluginServiceImpl", th);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                C13479a.m54761a("SdkPluginServiceImpl", th);
            }
        } else {
            C13479a.m54775e("SdkPluginServiceImpl", "onPluginUpdate sPluginCallback is null");
        }
    }
}
