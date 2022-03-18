package com.ss.android.lark.notification.p2382e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.larksuite.framework.utils.C26326z;
import com.ss.android.lark.biz.core.api.AbstractC29539aa;
import com.ss.android.lark.biz.core.api.NotificationSettingDetail;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.ChannelSettingDetail;
import com.ss.android.lark.notification.dto.NotificationSettingItem;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.e.k */
public class C48468k implements AbstractC29539aa {

    /* renamed from: a */
    private Context f121948a;

    /* renamed from: b */
    private AbstractC48407a.AbstractC48427o f121949b;

    /* renamed from: c */
    private AbstractC48407a.AbstractC48421j f121950c;

    /* renamed from: d */
    private AbstractC48407a.AbstractC48414f f121951d;

    /* renamed from: e */
    private AbstractC48407a.AbstractC48425m f121952e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.e.k$a */
    public static class C48470a {

        /* renamed from: a */
        static C48468k f121953a = new C48468k();
    }

    /* renamed from: a */
    public static C48468k m191156a() {
        return C48470a.f121953a;
    }

    private C48468k() {
        this.f121948a = C48398a.m190922a().mo169335a();
        this.f121949b = C48398a.m190922a().mo169341d();
        this.f121950c = C48398a.m190922a().mo169344g();
        this.f121951d = C48398a.m190922a().mo169343f();
        this.f121952e = C48398a.m190922a().mo169340c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m191157a(Bundle bundle) {
        bundle.putBoolean(this.f121950c.mo169388a(), true);
        this.f121952e.mo169398b(bundle);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29539aa
    /* renamed from: b */
    public boolean mo105561b(String str) {
        if (C26326z.m95343g()) {
            try {
                return C57823a.m224448a(this.f121948a).mo196172a(str).shouldVibrate();
            } catch (Exception e) {
                Log.m165383e("NotificationSetting", "error for parse notification channel " + e.getMessage());
                return true;
            }
        } else {
            NotificationSettingItem a = C48398a.m190922a().mo169341d().mo169400a(str);
            if (a == null) {
                return true;
            }
            if (!a.isNotificationOn() || !a.isVibrateOn()) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29539aa
    /* renamed from: c */
    public boolean mo105562c(String str) {
        boolean z = false;
        if (C26326z.m95343g()) {
            try {
                if (C57823a.m224448a(this.f121948a).mo196172a(str).getSound() != null) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                Log.m165383e("NotificationSetting", "error for parse notification channel " + e.getMessage());
                return true;
            }
        } else {
            NotificationSettingItem a = C48398a.m190922a().mo169341d().mo169400a(str);
            if (a == null) {
                return true;
            }
            if (a.isNotificationOn() && a.isSoundOn()) {
                z = true;
            }
            return z;
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29539aa
    /* renamed from: a */
    public NotificationSettingDetail mo105560a(String str) {
        if (C26326z.m95343g()) {
            try {
                return new ChannelSettingDetail(C57823a.m224448a(this.f121948a).mo196172a(str));
            } catch (Exception e) {
                Log.m165383e("NotificationSetting", "error for parse notification channel " + e.getMessage());
                return new NotificationSettingDetail(true, true, true);
            }
        } else {
            AbstractC48407a.AbstractC48427o d = C48398a.m190922a().mo169341d();
            NotificationSettingItem a = d.mo169400a(str);
            if (a == null) {
                return new NotificationSettingDetail(d.mo169418b(), d.mo169421c(), d.mo169423d());
            }
            return new NotificationSettingDetail(a.isNotificationOn(), a.isVibrateOn(), a.isSoundOn());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m191158a(Message message, Bundle bundle) {
        bundle.putBoolean(this.f121950c.mo169388a(), true);
        this.f121952e.mo169397a(bundle);
        bundle.putString(this.f121951d.mo169370a(), message.getThreadId());
        bundle.putInt(this.f121951d.mo169372b(), message.getThreadPosition());
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29539aa
    /* renamed from: a */
    public PendingIntent mo105559a(Message message, boolean z, boolean z2) {
        Intent intent;
        Bundle bundle;
        boolean a = this.f121949b.mo169411a(true);
        if (z || (a && !message.isDing())) {
            if (z2) {
                bundle = this.f121951d.mo169369a(message.getChatId(), true, message.getId(), "Notification", new AbstractC48407a.AbstractC48412d(message) {
                    /* class com.ss.android.lark.notification.p2382e.$$Lambda$k$95fdpKeRUddHhtgEUcjeMOHllg */
                    public final /* synthetic */ Message f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48412d
                    public final void inject(Bundle bundle) {
                        C48468k.this.m191158a(this.f$1, bundle);
                    }
                });
            } else {
                bundle = this.f121951d.mo169368a(message.getChatId(), message.getPosition(), new AbstractC48407a.AbstractC48412d() {
                    /* class com.ss.android.lark.notification.p2382e.$$Lambda$k$gxz514ygblokdq4fsyRUxw8yA */

                    @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48412d
                    public final void inject(Bundle bundle) {
                        C48468k.this.m191157a((C48468k) bundle);
                    }
                });
            }
            intent = this.f121952e.mo169396a(this.f121948a, this.f121950c.mo169389b(), bundle);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("from_notification", true);
            bundle2.putBoolean(this.f121950c.mo169388a(), true);
            intent = this.f121952e.mo169396a(this.f121948a, this.f121950c.mo169389b(), bundle2);
        }
        return PendingIntent.getActivity(this.f121948a, (int) SystemClock.uptimeMillis(), intent, 134217728);
    }
}
