package com.ss.android.pushmanager.p3019a;

import android.content.Context;
import com.ss.android.ug.bus.AbstractC60436a;
import com.ss.android.ug.bus.C60442b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.a.a */
public class C59959a {

    /* renamed from: com.ss.android.pushmanager.a.a$a */
    public interface AbstractC59960a extends AbstractC60436a {
        /* renamed from: a */
        void mo68796a(Context context);
    }

    /* renamed from: com.ss.android.pushmanager.a.a$b */
    public interface AbstractC59961b extends AbstractC60436a {
        /* renamed from: a */
        Map<String, String> mo68797a();

        /* renamed from: a */
        void mo68798a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

        /* renamed from: a */
        void mo68799a(String str, JSONObject jSONObject);

        /* renamed from: b */
        boolean mo68800b();
    }

    /* renamed from: a */
    public static AbstractC59960a m232688a() {
        return (AbstractC59960a) C60442b.m234863a(AbstractC59960a.class);
    }

    /* renamed from: b */
    public static AbstractC59961b m232689b() {
        return (AbstractC59961b) C60442b.m234863a(AbstractC59961b.class);
    }
}
