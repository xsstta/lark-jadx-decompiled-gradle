package com.bytedance.push.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.notification.C20223b;
import com.bytedance.notification.NotificationStyle;
import com.bytedance.notification.p857a.AbstractC20222a;
import com.bytedance.push.C20384b;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.AbstractC20441d;
import com.bytedance.push.interfaze.AbstractC20444g;
import com.bytedance.push.interfaze.AbstractC20449l;
import com.bytedance.push.notification.AbstractC20474a;
import com.bytedance.push.p881c.AbstractC20390a;
import com.bytedance.push.p881c.C20392c;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.PushOnlineSettings;
import com.ss.android.ug.bus.C60442b;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.notification.j */
public class C20500j extends AbstractC20474a {

    /* renamed from: a */
    private final AbstractC20441d f50021a;

    /* renamed from: b */
    private final C20477b f50022b;

    /* renamed from: c */
    private final AbstractC20444g f50023c;

    /* renamed from: d */
    private final C20485f f50024d;

    @Override // com.bytedance.push.notification.AbstractC20474a
    /* renamed from: a */
    public void mo68963a(String str, AbstractC20474a.AbstractC20476a aVar) {
        this.f50022b.mo68968a(new C20392c(Uri.parse(str), 0, 0, null), aVar);
    }

    /* renamed from: c */
    private boolean m74577c(Context context, int i, PushBody pushBody) {
        return m74578d(context, i, pushBody);
    }

    public C20500j(AbstractC20441d dVar, AbstractC20444g gVar, AbstractC20390a aVar) {
        this.f50021a = dVar;
        this.f50023c = gVar;
        this.f50022b = new C20477b(aVar);
        this.f50024d = new C20485f(gVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.push.notification.AbstractC20474a
    /* renamed from: a */
    public void mo68961a(Context context, int i, PushBody pushBody) {
        boolean a = this.f50024d.mo68977a(context, i, pushBody);
        if (a || !m74577c(context, i, pushBody)) {
            AbstractC20444g gVar = this.f50023c;
            if (gVar != null && !a) {
                a = gVar.mo68918a(context, i, pushBody);
            }
            if (!a) {
                super.mo68961a(context, i, pushBody);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r5 = mo68965b(r4, r5, r6);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m74578d(final android.content.Context r4, int r5, final com.bytedance.push.PushBody r6) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L_0x003c
            com.bytedance.notification.PushNotificationExtra r1 = r6.f49753u
            if (r1 == 0) goto L_0x003c
            com.bytedance.notification.PushNotificationExtra r1 = r6.f49753u
            boolean r1 = r1.f49389t
            if (r1 != 0) goto L_0x000e
            goto L_0x003c
        L_0x000e:
            android.content.Intent r5 = r3.mo68965b(r4, r5, r6)
            if (r5 != 0) goto L_0x0015
            return r0
        L_0x0015:
            com.bytedance.notification.PushNotificationExtra r0 = r6.f49753u
            int r0 = r0.f49380k
            com.bytedance.notification.NotificationStyle r1 = com.bytedance.notification.NotificationStyle.SMALL_PICTURE
            int r1 = r1.styleIndex
            r2 = 0
            if (r0 != r1) goto L_0x0037
            java.lang.String r0 = r6.f49746n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x002c
            r3.mo68998a(r4, r2, r6, r5)
            goto L_0x003a
        L_0x002c:
            java.lang.String r0 = r6.f49746n
            com.bytedance.push.notification.j$1 r1 = new com.bytedance.push.notification.j$1
            r1.<init>(r4, r6, r5)
            r3.mo68963a(r0, r1)
            goto L_0x003a
        L_0x0037:
            r3.mo68998a(r4, r2, r6, r5)
        L_0x003a:
            r4 = 1
            return r4
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C20500j.m74578d(android.content.Context, int, com.bytedance.push.PushBody):boolean");
    }

    @Override // com.bytedance.push.notification.AbstractC20474a
    /* renamed from: b */
    public Intent mo68965b(Context context, int i, PushBody pushBody) {
        Class cls;
        if (((PushOnlineSettings) C20520j.m74724a(context.getApplicationContext(), PushOnlineSettings.class)).mo69062m()) {
            cls = PassThoughActivity.class;
        } else {
            cls = PushActivity.class;
        }
        Intent intent = new Intent(context.getApplicationContext(), cls);
        intent.putExtra("push_body", pushBody.mo68711b());
        intent.putExtra("from_notification", true);
        intent.putExtra("message_from", i);
        intent.addFlags(268435456);
        return intent;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.notification.AbstractC20474a
    /* renamed from: b */
    public Notification mo68964b(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        AbstractC20441d dVar = this.f50021a;
        if (dVar != null) {
            return dVar.mo68912a(context, i, pushBody, bitmap);
        }
        return super.mo68964b(context, i, pushBody, bitmap);
    }

    /* renamed from: a */
    public void mo68998a(final Context context, Bitmap bitmap, final PushBody pushBody, Intent intent) {
        NotificationStyle notificationStyle;
        if (pushBody != null && pushBody.f49753u != null) {
            String a = pushBody.mo68710a();
            if (!C20494h.m74563a(context, a)) {
                a = "push";
            }
            intent.putExtra("from_banner_notification", true);
            int i = (int) (pushBody.f49734b % 2147483647L);
            C20223b.C20225a a2 = new C20223b.C20225a(context, a).setContentTitle(pushBody.f49745m).setContentText(pushBody.f49744l).mo68439a(intent).setContentIntent(PendingIntent.getActivity(context, i, intent, 134217728));
            if (bitmap == null) {
                notificationStyle = NotificationStyle.NORMAL;
            } else {
                notificationStyle = NotificationStyle.SMALL_PICTURE;
            }
            C20223b a3 = ((C20223b.C20225a) a2.mo68441a(notificationStyle).mo68443a(new AbstractC20222a() {
                /* class com.bytedance.push.notification.C20500j.C205022 */

                @Override // com.bytedance.notification.p857a.AbstractC20222a
                /* renamed from: a */
                public void mo68431a() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("click_position", "banner");
                        jSONObject.put("push_style", pushBody.f49753u.f49370a);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C20384b.m74260a().mo68803a(context, pushBody.f49734b, null, null, false, jSONObject);
                }

                @Override // com.bytedance.notification.p857a.AbstractC20222a
                /* renamed from: a */
                public void mo68432a(boolean z, String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("startSuccess", z);
                        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    ((AbstractC20449l) C60442b.m234863a(AbstractC20449l.class)).mo68867a("banner_click_result", jSONObject, (JSONObject) null, (JSONObject) null);
                }
            }).setLargeIcon(bitmap).mo68442a(pushBody.f49753u).setAutoCancel(true)).mo68446a();
            if (a3 != null) {
                try {
                    a3.mo68434a("app_notify", i);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
