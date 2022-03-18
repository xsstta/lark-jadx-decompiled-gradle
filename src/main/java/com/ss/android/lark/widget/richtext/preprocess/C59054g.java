package com.ss.android.lark.widget.richtext.preprocess;

import android.content.Context;
import android.os.Looper;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.C58377d;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.g */
public class C59054g {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.richtext.preprocess.g$a */
    public static class C59056a {

        /* renamed from: a */
        public static final C59054g f146396a = new C59054g();
    }

    private C59054g() {
    }

    /* renamed from: a */
    public static C59054g m229403a() {
        return C59056a.f146396a;
    }

    /* renamed from: b */
    private boolean m229404b() {
        return C58377d.m226286a().mo102881d();
    }

    /* renamed from: a */
    public C59057h mo200650a(Context context, RichText richText, C59049d dVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.m165397w("RichTextSpanParser", "RichText parse is in UI Thread");
        }
        if (C59035h.m229210a(richText)) {
            Log.m165383e("RichTextSpanParser", "RichText is empty");
            return null;
        } else if (m229404b()) {
            return C59052f.m229400a(context, richText, dVar);
        } else {
            return new C59051e(context, dVar).mo200649c(richText);
        }
    }
}
