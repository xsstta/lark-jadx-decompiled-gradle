package com.bytedance.push.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.push.PushBody;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.interfaze.AbstractC20439b;
import com.bytedance.push.interfaze.AbstractC20444g;
import com.bytedance.push.interfaze.AbstractC20448k;
import com.bytedance.push.p883e.C20403a;
import com.bytedance.push.p887h.AbstractC20434a;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.ss.android.pushmanager.p3019a.C59959a;
import com.ss.android.ug.bus.C60442b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.notification.f */
public final class C20485f {

    /* renamed from: a */
    public final AbstractC20444g f49982a;

    public C20485f(AbstractC20444g gVar) {
        this.f49982a = gVar;
    }

    /* renamed from: a */
    private List<C20403a> m74535a(Context context) {
        long millis = TimeUnit.DAYS.toMillis(1);
        ArrayList arrayList = new ArrayList();
        List<C20403a> m = ((LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class)).mo69039m();
        long currentTimeMillis = System.currentTimeMillis();
        if (m != null) {
            for (C20403a aVar : m) {
                if (aVar != null && aVar.f49864c + millis > currentTimeMillis) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private C20403a m74534a(PushBody pushBody, List<C20403a> list) {
        if (list == null) {
            return null;
        }
        for (C20403a aVar : list) {
            if (aVar != null && aVar.f49863b == pushBody.f49734b) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo68978a(Context context, PushBody pushBody) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            int i = (int) (pushBody.f49755w % 2147483647L);
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 23) {
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                if (activeNotifications != null) {
                    int length = activeNotifications.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        StatusBarNotification statusBarNotification = activeNotifications[i2];
                        if (statusBarNotification != null) {
                            if (statusBarNotification.getId() == i) {
                                break;
                            }
                        }
                        i2++;
                    }
                }
                z = false;
            }
            notificationManager.cancel("app_notify", i);
            return z;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean mo68977a(final Context context, final int i, final PushBody pushBody) {
        List<C20403a> a = m74535a(context);
        boolean z = true;
        if (pushBody.f49755w <= 0) {
            C20403a a2 = m74534a(pushBody, a);
            if (a2 != null) {
                mo68976a(pushBody, (PushBody) null, i, a2.f49865d);
            }
            if (a2 == null) {
                z = false;
            }
            return z;
        }
        m74536a(context, pushBody, a, i);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.bytedance.push.notification.C20485f.RunnableC204861 */

            public void run() {
                boolean z;
                boolean z2 = true;
                if (C20485f.this.f49982a == null || !C20485f.this.f49982a.mo68919b(context, i, pushBody)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!C20485f.this.mo68978a(context, pushBody) && !z) {
                    z2 = false;
                }
                if (z2) {
                    AbstractC20434a aVar = (AbstractC20434a) C60442b.m234863a(AbstractC20434a.class);
                    PushBody a = aVar.mo68895a(pushBody.f49755w);
                    int a2 = aVar.mo68894a(a);
                    if (a2 == 0) {
                        a2 = i;
                    }
                    C20485f.this.mo68976a(a, pushBody, a2, i);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo68976a(final PushBody pushBody, final PushBody pushBody2, final int i, final int i2) {
        ThreadPlus.submitRunnable(new Runnable() {
            /* class com.bytedance.push.notification.C20485f.RunnableC204872 */

            public void run() {
                long j;
                int i;
                String str;
                String str2;
                C59959a.AbstractC59961b bVar = (C59959a.AbstractC59961b) C60442b.m234863a(C59959a.AbstractC59961b.class);
                AbstractC20439b bVar2 = (AbstractC20439b) C60442b.m234863a(AbstractC20439b.class);
                if (bVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        PushBody pushBody = pushBody;
                        if (pushBody != null) {
                            j = pushBody.f49734b;
                        } else {
                            PushBody pushBody2 = pushBody2;
                            if (pushBody2 != null) {
                                j = pushBody2.f49755w;
                            } else {
                                j = 0;
                            }
                        }
                        jSONObject.put("from_rule_id", j);
                        jSONObject.put("to_rule_id", "");
                        jSONObject.put("from_push_channel", i);
                        jSONObject.put("to_push_channel", i2);
                        jSONObject.put("withdraw_type", 1);
                        PushBody pushBody3 = pushBody;
                        if (pushBody3 != null) {
                            i = pushBody3.f49736d;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("from_group_id", i);
                        jSONObject.put("user_id", bVar2.mo68906a());
                        PushBody pushBody4 = pushBody;
                        String str3 = "0";
                        if (pushBody4 != null) {
                            str = pushBody4.f49738f;
                        } else {
                            str = str3;
                        }
                        if (C20497i.m74576a(str)) {
                            str2 = "1";
                        } else {
                            str2 = str3;
                        }
                        jSONObject.put("is_self", str2);
                        if (!TextUtils.isEmpty(bVar2.mo68906a())) {
                            str3 = "1";
                        }
                        jSONObject.put("is_login", str3);
                        AbstractC20448k kVar = PushSupporter.get().getConfiguration().f49773D;
                        if (kVar != null) {
                            kVar.mo68921a(jSONObject, pushBody, pushBody2);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    bVar.mo68799a("push_withdraw", jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    private void m74536a(Context context, PushBody pushBody, List<C20403a> list, int i) {
        if (list != null) {
            for (C20403a aVar : list) {
                if (aVar != null && aVar.f49863b == pushBody.f49755w) {
                    return;
                }
            }
        }
        C20403a aVar2 = new C20403a();
        aVar2.f49862a = pushBody.f49734b;
        aVar2.f49863b = pushBody.f49755w;
        aVar2.f49865d = i;
        aVar2.f49864c = System.currentTimeMillis();
        list.add(aVar2);
        ((LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class)).mo69023b(list);
    }
}
