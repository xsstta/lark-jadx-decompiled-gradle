package com.ss.android.lark.mail.impl.message.plugin;

import android.app.Activity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a;
import com.ss.android.lark.mail.impl.p2195i.C42699a;

/* renamed from: com.ss.android.lark.mail.impl.message.plugin.c */
public class C42959c extends AbstractC42954a {
    /* renamed from: a */
    public boolean mo154079a(String str) {
        Log.m165389i("OuterLargeAttachmentHandler", "tryProcessClickUrl");
        if (str == null || !str.contains("?source=larkmail_largefile")) {
            return false;
        }
        Log.m165389i("OuterLargeAttachmentHandler", "try open large attachment");
        if (!C42699a.m170292k(this.f109389a, str.replace("?source=larkmail_largefile", ""))) {
            return false;
        }
        Log.m165389i("OuterLargeAttachmentHandler", "open success");
        return true;
    }

    public C42959c(Activity activity, AbstractC42954a.AbstractC42955a aVar) {
        super(activity, aVar);
    }
}
