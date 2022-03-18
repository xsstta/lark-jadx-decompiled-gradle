package com.ss.android.lark.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* renamed from: com.ss.android.lark.base.a */
public class C29517a {

    /* renamed from: a */
    static volatile AbstractC29519b f73803a;

    /* renamed from: b */
    private static AbstractC29518a f73804b;

    /* renamed from: com.ss.android.lark.base.a$a */
    public interface AbstractC29518a {
        /* renamed from: a */
        Context mo102784a(Context context);

        /* renamed from: a */
        Intent mo102785a(Intent intent);

        /* renamed from: a */
        void mo102786a(Activity activity);

        /* renamed from: a */
        void mo102787a(Activity activity, boolean z);

        /* renamed from: a */
        boolean mo102788a();

        /* renamed from: a */
        boolean mo102789a(Activity activity, KeyEvent keyEvent);

        /* renamed from: b */
        void mo102790b(Activity activity);
    }

    /* renamed from: com.ss.android.lark.base.a$b */
    public interface AbstractC29519b {
        /* renamed from: a */
        void mo102665a(Activity activity, int i);

        /* renamed from: b */
        void mo102666b(Activity activity, int i);
    }

    /* renamed from: a */
    public static AbstractC29518a m108723a() {
        return f73804b;
    }

    /* renamed from: b */
    public static AbstractC29519b m108726b() {
        return f73803a;
    }

    /* renamed from: a */
    public static void m108724a(AbstractC29518a aVar) {
        f73804b = aVar;
    }

    /* renamed from: a */
    public static void m108725a(AbstractC29519b bVar) {
        f73803a = bVar;
    }
}
