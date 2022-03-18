package com.ss.android.lark;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.f */
public class C37030f {

    /* renamed from: a */
    static volatile AbstractC37032b f95147a;

    /* renamed from: com.ss.android.lark.f$a */
    public interface AbstractC37031a {
        /* renamed from: a */
        void mo136555a(Map<String, RecogniseSpansResult> map);
    }

    /* renamed from: com.ss.android.lark.f$b */
    public interface AbstractC37032b {
        /* renamed from: a */
        Context mo103021a();

        /* renamed from: a */
        void mo103022a(Context context, String str);

        /* renamed from: a */
        void mo103023a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo103024a(AbstractC37033c cVar);

        /* renamed from: a */
        void mo103025a(String str, String str2, boolean z, AbstractC37031a aVar);

        /* renamed from: a */
        void mo103026a(String str, JSONObject jSONObject);

        /* renamed from: a */
        boolean mo103027a(String str);

        /* renamed from: b */
        Activity mo103028b();
    }

    /* renamed from: com.ss.android.lark.f$c */
    public interface AbstractC37033c {
        /* renamed from: a */
        void mo134316a(int i);
    }

    /* renamed from: a */
    public static AbstractC37032b m146093a() {
        return f95147a;
    }

    /* renamed from: a */
    public static void m146094a(AbstractC37032b bVar) {
        f95147a = bVar;
    }
}
