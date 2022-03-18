package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.ss.ttm.player.MediaPlayer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.j */
public class C0790j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, FontResourcesParserCompat.C0752b> f3196a = new ConcurrentHashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.j$a */
    public interface AbstractC0793a<T> {
        /* renamed from: a */
        boolean mo4380a(T t);

        /* renamed from: b */
        int mo4381b(T t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FontsContractCompat.C0811b mo4377a(FontsContractCompat.C0811b[] bVarArr, int i) {
        return (FontsContractCompat.C0811b) m3846a(bVarArr, i, new AbstractC0793a<FontsContractCompat.C0811b>() {
            /* class androidx.core.graphics.C0790j.C07911 */

            /* renamed from: a */
            public int mo4381b(FontsContractCompat.C0811b bVar) {
                return bVar.mo4414c();
            }

            /* renamed from: b */
            public boolean mo4380a(FontsContractCompat.C0811b bVar) {
                return bVar.mo4415d();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public FontResourcesParserCompat.C0752b mo4378a(Typeface typeface) {
        long b = m3848b(typeface);
        if (b == 0) {
            return null;
        }
        return this.f3196a.get(Long.valueOf(b));
    }

    C0790j() {
    }

    /* renamed from: a */
    public static Typeface m3844a(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (TypeFaceLancet.cache.contains(str)) {
                return (Typeface) TypeFaceLancet.cache.get(str);
            }
            Typeface createFromFile = Typeface.createFromFile(str);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(str, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(str);
    }

    /* renamed from: b */
    private static long m3848b(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: a */
    private FontResourcesParserCompat.C0753c m3845a(FontResourcesParserCompat.C0752b bVar, int i) {
        return (FontResourcesParserCompat.C0753c) m3846a(bVar.mo4269a(), i, new AbstractC0793a<FontResourcesParserCompat.C0753c>() {
            /* class androidx.core.graphics.C0790j.C07922 */

            /* renamed from: a */
            public int mo4381b(FontResourcesParserCompat.C0753c cVar) {
                return cVar.mo4271b();
            }

            /* renamed from: b */
            public boolean mo4380a(FontResourcesParserCompat.C0753c cVar) {
                return cVar.mo4272c();
            }
        });
    }

    /* renamed from: a */
    private void m3847a(Typeface typeface, FontResourcesParserCompat.C0752b bVar) {
        long b = m3848b(typeface);
        if (b != 0) {
            this.f3196a.put(Long.valueOf(b), bVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo4376a(Context context, InputStream inputStream) {
        File a = C0794k.m3865a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0794k.m3871a(a, inputStream)) {
                return null;
            }
            Typeface a2 = m3844a(a.getPath());
            a.delete();
            return a2;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    private static <T> T m3846a(T[] tArr, int i, AbstractC0793a<T> aVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(aVar.mo4381b(t2) - i2) * 2;
            if (aVar.mo4380a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo4365a(Context context, CancellationSignal cancellationSignal, FontsContractCompat.C0811b[] bVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo4377a(bVarArr, i).mo4412a());
            try {
                Typeface a = mo4376a(context, inputStream);
                C0794k.m3869a(inputStream);
                return a;
            } catch (IOException unused) {
                C0794k.m3869a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                C0794k.m3869a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0794k.m3869a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C0794k.m3869a(inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo4366a(Context context, FontResourcesParserCompat.C0752b bVar, Resources resources, int i) {
        FontResourcesParserCompat.C0753c a = m3845a(bVar, i);
        if (a == null) {
            return null;
        }
        Typeface a2 = C0773d.m3736a(context, resources, a.mo4275f(), a.mo4270a(), i);
        m3847a(a2, bVar);
        return a2;
    }

    /* renamed from: a */
    public Typeface mo4367a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0794k.m3865a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0794k.m3870a(a, resources, i)) {
                return null;
            }
            Typeface a2 = m3844a(a.getPath());
            a.delete();
            return a2;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
