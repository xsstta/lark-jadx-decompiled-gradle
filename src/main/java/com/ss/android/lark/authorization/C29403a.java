package com.ss.android.lark.authorization;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.lark.authorization.p1380a.AbstractC29404a;

/* renamed from: com.ss.android.lark.authorization.a */
public class C29403a {

    /* renamed from: a */
    private static volatile AbstractC29404a f73511a;

    /* renamed from: a */
    public static AbstractC29404a m108165a() {
        return f73511a;
    }

    /* renamed from: c */
    public void mo104164c() {
        C29405b.m108178b();
    }

    /* renamed from: b */
    public boolean mo104163b() {
        return C29405b.m108176a();
    }

    public C29403a(AbstractC29404a aVar) {
        f73511a = aVar;
    }

    /* renamed from: a */
    public void mo104161a(Context context) {
        mo104162a(context, null);
    }

    /* renamed from: a */
    public void mo104162a(Context context, Intent intent) {
        ComponentName callingActivity;
        Intent intent2 = new Intent(context, AuthorizationActivity.class);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                intent2.putExtras(extras);
            }
            Uri data = intent.getData();
            if (data != null) {
                intent2.putExtra("extra_uri_from_link", data);
            }
            if ((context instanceof Activity) && (callingActivity = ((Activity) context).getCallingActivity()) != null) {
                intent2.putExtra("extra_calling_activity_package_name", callingActivity.getPackageName());
                intent2.putExtra("extra_calling_activity_class_name", callingActivity.getClassName());
            }
        }
        context.startActivity(intent2);
    }
}
