package com.lynx.tasm.behavior.shadow.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.collection.ArrayMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.fontface.C26890b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.shadow.text.o */
public class C26734o {

    /* renamed from: a */
    private static final ArrayMap<String, Typeface[]> f66173a = new ArrayMap<>();

    /* renamed from: b */
    private static final ArrayMap<Typeface, Typeface[]> f66174b = new ArrayMap<>();

    /* renamed from: c */
    private static final String[] f66175c = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: d */
    private static final String[] f66176d = {".ttf", ".otf"};

    /* renamed from: e */
    private static final List<AbstractC26735a> f66177e = new ArrayList();

    /* renamed from: com.lynx.tasm.behavior.shadow.text.o$a */
    public interface AbstractC26735a {
        /* renamed from: a */
        Typeface mo53776a(String str, int i);
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.o$b */
    public interface AbstractC26736b {
        /* renamed from: a */
        void mo94878a(Typeface typeface, int i);
    }

    /* renamed from: a */
    public static void m96873a(AbstractC26735a aVar) {
        if (aVar != null) {
            f66177e.add(aVar);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m96875a(String str) {
        boolean containsKey;
        synchronized (C26734o.class) {
            containsKey = f66173a.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: a */
    public static void m96872a(AssetManager assetManager, String str, String str2) {
        for (int i = 0; i < 4; i++) {
            m96871a(assetManager, str, i, str2);
        }
    }

    /* renamed from: a */
    public static synchronized Typeface m96870a(AbstractC26684l lVar, String str, int i) {
        synchronized (C26734o.class) {
            Typeface[] typefaceArr = f66173a.get(str);
            if (typefaceArr == null || typefaceArr[i] == null) {
                for (AbstractC26735a aVar : f66177e) {
                    Typeface a = aVar.mo53776a(str, i);
                    if (a != null) {
                        m96874a(str, i, a);
                        return a;
                    }
                }
                Typeface a2 = C26890b.m97746a().mo95697a(lVar, str, i, (AbstractC26736b) null);
                if (a2 != null) {
                    return a2;
                }
                LLog.m96419a("TypefaceCache", "Can't not find typeface for fontFamily: " + str + " in lynx.");
                return null;
            }
            return typefaceArr[i];
        }
    }

    /* renamed from: a */
    public static synchronized void m96874a(String str, int i, Typeface typeface) {
        synchronized (C26734o.class) {
            ArrayMap<String, Typeface[]> arrayMap = f66173a;
            Typeface[] typefaceArr = arrayMap.get(str);
            if (typefaceArr == null) {
                typefaceArr = new Typeface[4];
                arrayMap.put(str, typefaceArr);
            }
            typefaceArr[i] = typeface;
            f66174b.put(typeface, typefaceArr);
        }
    }

    /* renamed from: a */
    public static void m96871a(AssetManager assetManager, String str, int i, String str2) {
        Typeface b = m96876b(assetManager, str, i, str2);
        if (b != null) {
            m96874a(str, i, b);
        }
    }

    /* renamed from: b */
    public static Typeface m96876b(AssetManager assetManager, String str, int i, String str2) {
        String str3 = f66175c[i];
        StringBuilder sb = new StringBuilder(32);
        sb.append(str2);
        String str4 = "/";
        if (str2.endsWith(str4)) {
            str4 = "";
        }
        sb.append(str4);
        sb.append(str);
        sb.append(str3);
        int length = sb.length();
        for (String str5 : f66176d) {
            sb.append(str5);
            try {
                return Typeface.createFromAsset(assetManager, sb.toString());
            } catch (RuntimeException e) {
                LLog.m96427d("TypefaceCache", "Exception happens whe cacheTypefaceFromAssets with message " + e.getMessage());
                sb.setLength(length);
            }
        }
        return null;
    }
}
