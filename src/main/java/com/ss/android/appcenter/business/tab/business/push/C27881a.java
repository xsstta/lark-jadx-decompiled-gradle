package com.ss.android.appcenter.business.tab.business.push;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.CommonGadgetPushRequest;
import com.bytedance.lark.pb.openplatform.v1.PushAppsNeedUpdateRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.appcenter.business.tab.business.widget.WidgetData;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.push.a */
public class C27881a {

    /* renamed from: a */
    public final List<AbstractC27890a> f69694a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC27891b> f69695b = new ArrayList();

    /* renamed from: com.ss.android.appcenter.business.tab.business.push.a$a */
    public interface AbstractC27890a {
        /* renamed from: a */
        void mo99412a(String str);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.push.a$b */
    public interface AbstractC27891b {
        /* renamed from: a */
        void mo99413a(List<WidgetData> list);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.push.a$c */
    public static class C27892c {

        /* renamed from: a */
        static C27881a f69706a = new C27881a();
    }

    /* renamed from: a */
    public static C27881a m101794a() {
        return C27892c.f69706a;
    }

    /* renamed from: b */
    public void mo99408b(AbstractC27890a aVar) {
        C53246j.m205911b(this.f69694a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278852 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_OP_APP_CENTER_UPDATE_V2);
            }
        });
    }

    /* renamed from: a */
    public void mo99406a(AbstractC27890a aVar) {
        C28184h.m103250d("AppCenterPushManager", "registerAppCenterPush");
        C53246j.m205910a(this.f69694a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278821 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_OP_APP_CENTER_UPDATE_V2, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278821.C278831 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C28184h.m103250d("AppCenterPushManager", "registerAppCenterPush onPush");
                        try {
                            final PushAppsNeedUpdateRequest decode = PushAppsNeedUpdateRequest.ADAPTER.decode(bArr);
                            UICallbackExecutor.post(new Runnable() {
                                /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278821.C278831.RunnableC278841 */

                                public void run() {
                                    for (AbstractC27890a aVar : C27881a.this.f69694a) {
                                        aVar.mo99412a(decode.timestamp);
                                    }
                                }
                            });
                        } catch (IOException e) {
                            C28184h.m103250d("AppCenter_Common", "workplace onPush decode error" + e);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo99409b(AbstractC27891b bVar) {
        C53246j.m205911b(this.f69695b, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278894 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.GADGET_COMMON_PUSH);
            }
        });
    }

    /* renamed from: a */
    public void mo99407a(final AbstractC27891b bVar) {
        C28184h.m103250d("AppCenterPushManager", "registerWidgetPushListener");
        C53246j.m205910a(this.f69695b, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278863 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.GADGET_COMMON_PUSH, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278863.C278871 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C28184h.m103250d("AppCenterPushManager", "GADGET_COMMON_PUSH onPush");
                        try {
                            CommonGadgetPushRequest decode = CommonGadgetPushRequest.ADAPTER.decode(bArr);
                            if (TextUtils.equals(decode.biz, "widget")) {
                                List<WidgetPushData> list = (List) new Gson().fromJson(decode.data, new TypeToken<List<WidgetPushData>>() {
                                    /* class com.ss.android.appcenter.business.tab.business.push.C27881a.C278863.C278871.C278881 */
                                }.getType());
                                if (!C28182f.m103238c(list)) {
                                    ArrayList arrayList = new ArrayList();
                                    for (WidgetPushData widgetPushData : list) {
                                        if (widgetPushData.isPushValid()) {
                                            arrayList.add(widgetPushData.getWidgetData());
                                        } else {
                                            C28184h.m103250d("AppCenterPushManager", "widgetpush invalid:" + widgetPushData);
                                        }
                                    }
                                    bVar.mo99413a(arrayList);
                                    return;
                                }
                                C28184h.m103250d("AppCenterPushManager", "widgetpush empty:" + decode);
                                return;
                            }
                            C28184h.m103250d("AppCenterPushManager", "widgetpush biz not widget:" + decode);
                        } catch (IOException e) {
                            C28184h.m103250d("AppCenterPushManager", "widgetpush error:" + e);
                        }
                    }
                });
            }
        });
    }
}
