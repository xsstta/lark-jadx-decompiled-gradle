package com.ss.android.shapeimage.p3021a;

import android.content.Context;
import com.ss.android.shapeimage.p3021a.p3022a.C59976c;
import com.ss.android.shapeimage.p3021a.p3022a.C59980g;
import com.ss.android.shapeimage.p3021a.p3022a.C59982i;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.shapeimage.a.a */
public class C59972a {

    /* renamed from: a */
    private static final Map<Integer, C59980g> f149506a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C59980g m232757a(Context context, int i) {
        Map<Integer, C59980g> map = f149506a;
        C59980g gVar = map.get(Integer.valueOf(i));
        if (gVar != null) {
            return gVar;
        }
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().openRawResource(i);
            C59980g a = C59982i.m232783a(inputStream);
            map.put(Integer.valueOf(i), a);
            return a;
        } finally {
            C59976c.m232764a(inputStream);
        }
    }
}
