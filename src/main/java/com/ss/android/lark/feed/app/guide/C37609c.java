package com.ss.android.lark.feed.app.guide;

import android.view.View;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.ITitleController;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.guide.c */
public class C37609c {

    /* renamed from: a */
    private static Map<String, WeakReference<View>> f96447a = new HashMap();

    /* renamed from: com.ss.android.lark.feed.app.guide.c$a */
    public static class C37610a {

        /* renamed from: a */
        private static ITitleController.Style f96448a;

        /* renamed from: a */
        public static View m147868a() {
            View view;
            String str;
            if (f96448a == ITitleController.Style.New) {
                view = C37609c.m147866a("more_btn");
            } else if (f96448a == ITitleController.Style.Old) {
                view = C37609c.m147866a("more_btn_old");
            } else {
                view = C37609c.m147866a("more_btn");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("more btn is ");
            if (view != null) {
                str = "not null";
            } else {
                str = "null";
            }
            sb.append(str);
            sb.append(", style=");
            sb.append(f96448a);
            Log.m165389i("TitleViewFinder", sb.toString());
            return view;
        }

        /* renamed from: a */
        public static void m147869a(ITitleController.Style style) {
            f96448a = style;
        }
    }

    /* renamed from: a */
    public static View m147866a(String str) {
        WeakReference<View> weakReference = f96447a.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public static void m147867a(String str, View view) {
        f96447a.put(str, new WeakReference<>(view));
    }
}
