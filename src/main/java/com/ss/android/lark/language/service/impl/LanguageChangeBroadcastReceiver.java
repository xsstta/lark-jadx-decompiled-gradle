package com.ss.android.lark.language.service.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;

public class LanguageChangeBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private CopyOnWriteArrayList<AbstractC29540ab> f104893a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public void mo148350a(AbstractC29540ab abVar) {
        if (!this.f104893a.contains(abVar)) {
            this.f104893a.add(abVar);
        }
    }

    /* renamed from: b */
    public void mo148351b(AbstractC29540ab abVar) {
        if (abVar != null) {
            this.f104893a.remove(abVar);
        }
    }

    /* renamed from: b */
    public static String m163139b(Context context) {
        return context.getPackageName() + ".language.permissions.LANGUAGE_BROADCAST";
    }

    /* renamed from: c */
    public static LanguageChangeBroadcastReceiver m163140c(Context context) {
        LanguageChangeBroadcastReceiver languageChangeBroadcastReceiver = new LanguageChangeBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m163138a(context));
        m163137a(context, languageChangeBroadcastReceiver, intentFilter, m163139b(context), null);
        return languageChangeBroadcastReceiver;
    }

    /* renamed from: a */
    public static String m163138a(Context context) {
        return context.getPackageName() + ".language.action.LANGUAGE_BROADCAST";
    }

    public void onReceive(Context context, Intent intent) {
        try {
            Locale locale = (Locale) intent.getSerializableExtra("KEY_ORIGIN_LOCALE");
            Locale locale2 = (Locale) intent.getSerializableExtra("KEY_NEW_LOCALE");
            Iterator<AbstractC29540ab> it = this.f104893a.iterator();
            while (it.hasNext()) {
                AbstractC29540ab next = it.next();
                if (next != null) {
                    next.onLanguageChange(locale, locale2);
                }
            }
        } catch (Exception e) {
            Log.m165383e("LanguageChangeBroadcast", "language broadcast receiver occurs error: " + e.getMessage());
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m163137a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e;
        }
    }
}
