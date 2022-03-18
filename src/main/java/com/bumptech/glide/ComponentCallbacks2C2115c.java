package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C2360k;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.engine.p088b.AbstractC2317i;
import com.bumptech.glide.load.p083a.AbstractC2149e;
import com.bumptech.glide.load.p083a.C2160k;
import com.bumptech.glide.load.p083a.C2163m;
import com.bumptech.glide.load.p085b.C2176a;
import com.bumptech.glide.load.p085b.C2195b;
import com.bumptech.glide.load.p085b.C2202c;
import com.bumptech.glide.load.p085b.C2203d;
import com.bumptech.glide.load.p085b.C2206e;
import com.bumptech.glide.load.p085b.C2211f;
import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.load.p085b.C2226k;
import com.bumptech.glide.load.p085b.C2245s;
import com.bumptech.glide.load.p085b.C2250t;
import com.bumptech.glide.load.p085b.C2251u;
import com.bumptech.glide.load.p085b.C2255v;
import com.bumptech.glide.load.p085b.C2258w;
import com.bumptech.glide.load.p085b.C2263x;
import com.bumptech.glide.load.p085b.p086a.C2180a;
import com.bumptech.glide.load.p085b.p086a.C2182b;
import com.bumptech.glide.load.p085b.p086a.C2184c;
import com.bumptech.glide.load.p085b.p086a.C2186d;
import com.bumptech.glide.load.p085b.p086a.C2188e;
import com.bumptech.glide.load.p085b.p086a.C2193f;
import com.bumptech.glide.load.resource.bitmap.C2415a;
import com.bumptech.glide.load.resource.bitmap.C2416aa;
import com.bumptech.glide.load.resource.bitmap.C2425b;
import com.bumptech.glide.load.resource.bitmap.C2426c;
import com.bumptech.glide.load.resource.bitmap.C2430g;
import com.bumptech.glide.load.resource.bitmap.C2431h;
import com.bumptech.glide.load.resource.bitmap.C2434k;
import com.bumptech.glide.load.resource.bitmap.C2440n;
import com.bumptech.glide.load.resource.bitmap.C2446r;
import com.bumptech.glide.load.resource.bitmap.C2448t;
import com.bumptech.glide.load.resource.bitmap.C2451v;
import com.bumptech.glide.load.resource.bitmap.C2453x;
import com.bumptech.glide.load.resource.bitmap.C2459z;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.p090a.C2397a;
import com.bumptech.glide.load.resource.p091b.C2404d;
import com.bumptech.glide.load.resource.p091b.C2405e;
import com.bumptech.glide.load.resource.p092c.C2462a;
import com.bumptech.glide.load.resource.p093d.C2464a;
import com.bumptech.glide.load.resource.p093d.C2468c;
import com.bumptech.glide.load.resource.p093d.C2470d;
import com.bumptech.glide.load.resource.p093d.C2478h;
import com.bumptech.glide.load.resource.p093d.C2480j;
import com.bumptech.glide.load.resource.p094e.C2481a;
import com.bumptech.glide.load.resource.p094e.C2482b;
import com.bumptech.glide.load.resource.p094e.C2483c;
import com.bumptech.glide.load.resource.p094e.C2484d;
import com.bumptech.glide.manager.AbstractC2494d;
import com.bumptech.glide.manager.C2502k;
import com.bumptech.glide.p080a.AbstractC2101c;
import com.bumptech.glide.p080a.C2103e;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.C2537g;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p095a.C2519g;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.c */
public class ComponentCallbacks2C2115c implements ComponentCallbacks2 {

    /* renamed from: a */
    private static volatile ComponentCallbacks2C2115c f7295a;

    /* renamed from: b */
    private static volatile boolean f7296b;

    /* renamed from: c */
    private final C2360k f7297c;

    /* renamed from: d */
    private final AbstractC2283e f7298d;

    /* renamed from: e */
    private final AbstractC2317i f7299e;

    /* renamed from: f */
    private final C2123e f7300f;

    /* renamed from: g */
    private final Registry f7301g;

    /* renamed from: h */
    private final AbstractC2278b f7302h;

    /* renamed from: i */
    private final C2502k f7303i;

    /* renamed from: j */
    private final AbstractC2494d f7304j;

    /* renamed from: k */
    private final List<ComponentCallbacks2C2126g> f7305k = new ArrayList();

    /* renamed from: l */
    private final AbstractC2116a f7306l;

    /* renamed from: m */
    private MemoryCategory f7307m = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.c$a */
    public interface AbstractC2116a {
        /* renamed from: a */
        C2537g mo10365a();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    /* renamed from: a */
    public AbstractC2283e mo10350a() {
        return this.f7298d;
    }

    /* renamed from: b */
    public AbstractC2278b mo10354b() {
        return this.f7302h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC2494d mo10357d() {
        return this.f7304j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2123e mo10358e() {
        return this.f7300f;
    }

    /* renamed from: g */
    public C2502k mo10360g() {
        return this.f7303i;
    }

    /* renamed from: h */
    public Registry mo10361h() {
        return this.f7301g;
    }

    public void onLowMemory() {
        mo10359f();
    }

    /* renamed from: a */
    private static void m9148a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: a */
    public void mo10351a(int i) {
        C2568k.m10910a();
        for (ComponentCallbacks2C2126g gVar : this.f7305k) {
            gVar.onTrimMemory(i);
        }
        this.f7299e.mo10735a(i);
        this.f7298d.mo10692a(i);
        this.f7302h.mo10670a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10353a(AbstractC2522j<?> jVar) {
        synchronized (this.f7305k) {
            for (ComponentCallbacks2C2126g gVar : this.f7305k) {
                if (gVar.mo10423b(jVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10352a(ComponentCallbacks2C2126g gVar) {
        synchronized (this.f7305k) {
            if (!this.f7305k.contains(gVar)) {
                this.f7305k.add(gVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: c */
    public Context mo10356c() {
        return this.f7300f.getBaseContext();
    }

    /* renamed from: f */
    public void mo10359f() {
        C2568k.m10910a();
        this.f7299e.mo10739a();
        this.f7298d.mo10691a();
        this.f7302h.mo10669a();
    }

    public void onTrimMemory(int i) {
        mo10351a(i);
    }

    /* renamed from: a */
    public static File m9144a(Context context) {
        return m9145a(context, "image_manager_disk_cache");
    }

    /* renamed from: a */
    public static ComponentCallbacks2C2126g m9139a(Activity activity) {
        return m9153e(activity).mo11072a(activity);
    }

    /* renamed from: c */
    public static ComponentCallbacks2C2126g m9151c(Context context) {
        return m9153e(context).mo11074a(context);
    }

    /* renamed from: e */
    private static C2502k m9153e(Context context) {
        C2567j.m10895a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m9149b(context).mo10360g();
    }

    /* renamed from: a */
    public static ComponentCallbacks2C2126g m9140a(Fragment fragment) {
        return m9153e(fragment.getActivity()).mo11073a(fragment);
    }

    /* renamed from: b */
    public static ComponentCallbacks2C2115c m9149b(Context context) {
        if (f7295a == null) {
            GeneratedAppGlideModule d = m9152d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C2115c.class) {
                if (f7295a == null) {
                    m9146a(context, d);
                }
            }
        }
        return f7295a;
    }

    /* renamed from: a */
    public static ComponentCallbacks2C2126g m9141a(View view) {
        return m9153e(view.getContext()).mo11075a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10355b(ComponentCallbacks2C2126g gVar) {
        synchronized (this.f7305k) {
            if (this.f7305k.contains(gVar)) {
                this.f7305k.remove(gVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: a */
    public static ComponentCallbacks2C2126g m9142a(androidx.fragment.app.Fragment fragment) {
        return m9153e(fragment.getContext()).mo11076a(fragment);
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m9152d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e) {
            m9148a(e);
        } catch (IllegalAccessException e2) {
            m9148a(e2);
        } catch (NoSuchMethodException e3) {
            m9148a(e3);
        } catch (InvocationTargetException e4) {
            m9148a(e4);
        }
        return null;
    }

    /* renamed from: a */
    public static ComponentCallbacks2C2126g m9143a(FragmentActivity fragmentActivity) {
        return m9153e(fragmentActivity).mo11077a(fragmentActivity);
    }

    /* renamed from: b */
    private static void m9150b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m9147a(context, new C2121d(), generatedAppGlideModule);
    }

    /* renamed from: a */
    public static File m9145a(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        if (Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    /* renamed from: a */
    private static void m9146a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f7296b) {
            f7296b = true;
            m9150b(context, generatedAppGlideModule);
            f7296b = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: a */
    private static void m9147a(Context context, C2121d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        C2502k.AbstractC2504a aVar;
        Context applicationContext = context.getApplicationContext();
        List<AbstractC2101c> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo10292c()) {
            emptyList = new C2103e(applicationContext).mo10320a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo10289a().isEmpty()) {
            Set<Class<?>> a = generatedAppGlideModule.mo10289a();
            Iterator<AbstractC2101c> it = emptyList.iterator();
            while (it.hasNext()) {
                AbstractC2101c next = it.next();
                if (a.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<AbstractC2101c> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            aVar = generatedAppGlideModule.mo10290b();
        } else {
            aVar = null;
        }
        dVar.mo10376a(aVar);
        for (AbstractC2101c cVar : emptyList) {
            cVar.mo10291a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo10291a(applicationContext, dVar);
        }
        ComponentCallbacks2C2115c a2 = dVar.mo10371a(applicationContext);
        for (AbstractC2101c cVar2 : emptyList) {
            try {
                cVar2.registerComponents(applicationContext, a2, a2.f7301g);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + cVar2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.registerComponents(applicationContext, a2, a2.f7301g);
        }
        applicationContext.registerComponentCallbacks(a2);
        f7295a = a2;
    }

    ComponentCallbacks2C2115c(Context context, C2360k kVar, AbstractC2317i iVar, AbstractC2283e eVar, AbstractC2278b bVar, C2502k kVar2, AbstractC2494d dVar, int i, AbstractC2116a aVar, Map<Class<?>, AbstractC2135h<?, ?>> map, List<AbstractC2536f<Object>> list, boolean z, boolean z2) {
        AbstractC2391g gVar;
        AbstractC2391g gVar2;
        this.f7297c = kVar;
        this.f7298d = eVar;
        this.f7302h = bVar;
        this.f7299e = iVar;
        this.f7303i = kVar2;
        this.f7304j = dVar;
        this.f7306l = aVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f7301g = registry;
        registry.mo10296a((ImageHeaderParser) new DefaultImageHeaderParser());
        if (Build.VERSION.SDK_INT >= 27) {
            registry.mo10296a((ImageHeaderParser) new C2440n());
        }
        List<ImageHeaderParser> a = registry.mo10307a();
        C2464a aVar2 = new C2464a(context, a, eVar, bVar);
        AbstractC2391g<ParcelFileDescriptor, Bitmap> b = C2416aa.m10233b(eVar);
        C2434k kVar3 = new C2434k(registry.mo10307a(), resources.getDisplayMetrics(), eVar, bVar);
        if (!z2 || Build.VERSION.SDK_INT < 28) {
            gVar = new C2430g(kVar3);
            gVar2 = new C2453x(kVar3, bVar);
        } else {
            gVar2 = new C2446r();
            gVar = new C2431h();
        }
        C2404d dVar2 = new C2404d(context);
        C2245s.C2248c cVar = new C2245s.C2248c(resources);
        C2245s.C2249d dVar3 = new C2245s.C2249d(resources);
        C2245s.C2247b bVar2 = new C2245s.C2247b(resources);
        C2245s.C2246a aVar3 = new C2245s.C2246a(resources);
        C2426c cVar2 = new C2426c(bVar);
        C2481a aVar4 = new C2481a();
        C2484d dVar4 = new C2484d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.mo10298a(ByteBuffer.class, new C2202c()).mo10298a(InputStream.class, new C2250t(bVar)).mo10303a("Bitmap", ByteBuffer.class, Bitmap.class, gVar).mo10303a("Bitmap", InputStream.class, Bitmap.class, gVar2);
        if (C2163m.m9405c()) {
            registry.mo10303a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C2448t(kVar3));
        }
        registry.mo10303a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b).mo10303a("Bitmap", AssetFileDescriptor.class, Bitmap.class, C2416aa.m10231a(eVar)).mo10300a(Bitmap.class, Bitmap.class, C2255v.C2256a.m9680b()).mo10303a("Bitmap", Bitmap.class, Bitmap.class, new C2459z()).mo10299a(Bitmap.class, (AbstractC2392h) cVar2).mo10303a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2415a(resources, gVar)).mo10303a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2415a(resources, gVar2)).mo10303a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C2415a(resources, b)).mo10299a(BitmapDrawable.class, (AbstractC2392h) new C2425b(eVar, cVar2)).mo10303a("Gif", InputStream.class, C2468c.class, new C2480j(a, aVar2, bVar)).mo10303a("Gif", ByteBuffer.class, C2468c.class, aVar2).mo10299a(C2468c.class, (AbstractC2392h) new C2470d()).mo10300a(GifDecoder.class, GifDecoder.class, C2255v.C2256a.m9680b()).mo10303a("Bitmap", GifDecoder.class, Bitmap.class, new C2478h(eVar)).mo10301a(Uri.class, Drawable.class, dVar2).mo10301a(Uri.class, Bitmap.class, new C2451v(dVar2, eVar)).mo10297a((AbstractC2149e.AbstractC2150a<?>) new C2397a.C2398a()).mo10300a(File.class, ByteBuffer.class, new C2203d.C2205b()).mo10300a(File.class, InputStream.class, new C2211f.C2217e()).mo10301a(File.class, File.class, new C2462a()).mo10300a(File.class, ParcelFileDescriptor.class, new C2211f.C2213b()).mo10300a(File.class, File.class, C2255v.C2256a.m9680b()).mo10297a((AbstractC2149e.AbstractC2150a<?>) new C2160k.C2161a(bVar));
        if (C2163m.m9405c()) {
            registry.mo10297a((AbstractC2149e.AbstractC2150a<?>) new C2163m.C2164a());
        }
        registry.mo10300a(Integer.TYPE, InputStream.class, cVar).mo10300a(Integer.TYPE, ParcelFileDescriptor.class, bVar2).mo10300a(Integer.class, InputStream.class, cVar).mo10300a(Integer.class, ParcelFileDescriptor.class, bVar2).mo10300a(Integer.class, Uri.class, dVar3).mo10300a(Integer.TYPE, AssetFileDescriptor.class, aVar3).mo10300a(Integer.class, AssetFileDescriptor.class, aVar3).mo10300a(Integer.TYPE, Uri.class, dVar3).mo10300a(String.class, InputStream.class, new C2206e.C2209c()).mo10300a(Uri.class, InputStream.class, new C2206e.C2209c()).mo10300a(String.class, InputStream.class, new C2251u.C2254c()).mo10300a(String.class, ParcelFileDescriptor.class, new C2251u.C2253b()).mo10300a(String.class, AssetFileDescriptor.class, new C2251u.C2252a()).mo10300a(Uri.class, InputStream.class, new C2182b.C2183a()).mo10300a(Uri.class, InputStream.class, new C2176a.C2179c(context.getAssets())).mo10300a(Uri.class, ParcelFileDescriptor.class, new C2176a.C2178b(context.getAssets())).mo10300a(Uri.class, InputStream.class, new C2184c.C2185a(context)).mo10300a(Uri.class, InputStream.class, new C2186d.C2187a(context));
        if (Build.VERSION.SDK_INT >= 29) {
            registry.mo10300a(Uri.class, InputStream.class, new C2188e.C2191c(context));
            registry.mo10300a(Uri.class, ParcelFileDescriptor.class, new C2188e.C2190b(context));
        }
        registry.mo10300a(Uri.class, InputStream.class, new C2258w.C2262d(contentResolver)).mo10300a(Uri.class, ParcelFileDescriptor.class, new C2258w.C2260b(contentResolver)).mo10300a(Uri.class, AssetFileDescriptor.class, new C2258w.C2259a(contentResolver)).mo10300a(Uri.class, InputStream.class, new C2263x.C2264a()).mo10300a(URL.class, InputStream.class, new C2193f.C2194a()).mo10300a(Uri.class, File.class, new C2226k.C2227a(context)).mo10300a(C2219g.class, InputStream.class, new C2180a.C2181a()).mo10300a(byte[].class, ByteBuffer.class, new C2195b.C2196a()).mo10300a(byte[].class, InputStream.class, new C2195b.C2200d()).mo10300a(Uri.class, Uri.class, C2255v.C2256a.m9680b()).mo10300a(Drawable.class, Drawable.class, C2255v.C2256a.m9680b()).mo10301a(Drawable.class, Drawable.class, new C2405e()).mo10302a(Bitmap.class, BitmapDrawable.class, new C2482b(resources)).mo10302a(Bitmap.class, byte[].class, aVar4).mo10302a(Drawable.class, byte[].class, new C2483c(eVar, aVar4, dVar4)).mo10302a(C2468c.class, byte[].class, dVar4);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC2391g<ByteBuffer, Bitmap> c = C2416aa.m10234c(eVar);
            registry.mo10301a(ByteBuffer.class, Bitmap.class, c);
            registry.mo10301a(ByteBuffer.class, BitmapDrawable.class, new C2415a(resources, c));
        }
        this.f7300f = new C2123e(context, bVar, registry, new C2519g(), aVar, map, list, kVar, z, i);
    }
}
