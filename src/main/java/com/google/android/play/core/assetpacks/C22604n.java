package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.C22622ac;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.bf;
import com.google.android.play.core.splitinstall.az;
import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.C22741m;
import com.google.android.play.core.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.assetpacks.n */
final class C22604n implements dl {

    /* renamed from: a */
    private static final C22630b f55955a = new C22630b("AssetPackServiceImpl");

    /* renamed from: b */
    private static final Intent f55956b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: c */
    private final String f55957c;

    /* renamed from: d */
    private final bb f55958d;

    /* renamed from: e */
    private C22622ac<AbstractC22650s> f55959e;

    /* renamed from: f */
    private C22622ac<AbstractC22650s> f55960f;

    /* renamed from: g */
    private final AtomicBoolean f55961g = new AtomicBoolean();

    C22604n(Context context, bb bbVar) {
        this.f55957c = context.getPackageName();
        this.f55958d = bbVar;
        if (bf.m82327a(context)) {
            Context a = az.m82612a(context);
            C22630b bVar = f55955a;
            Intent intent = f55956b;
            this.f55959e = new C22622ac<>(a, bVar, "AssetPackService", intent, dm.f55921a);
            this.f55960f = new C22622ac<>(az.m82612a(context), bVar, "AssetPackService-keepAlive", intent, dn.f55922a);
        }
        f55955a.mo78871a("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: a */
    static /* synthetic */ ArrayList m82152a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: a */
    static /* synthetic */ List m82153a(C22604n nVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AssetPackState next = AbstractC22591d.m82112a((Bundle) list.get(i), nVar.f55958d).mo78707b().values().iterator().next();
            if (next == null) {
                f55955a.mo78873b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (bz.m82060a(next.mo78688b())) {
                arrayList.add(next.mo78687a());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m82154a(int i, String str, int i2) {
        if (this.f55959e != null) {
            f55955a.mo78874c("notifyModuleCompleted", new Object[0]);
            C22741m mVar = new C22741m();
            this.f55959e.mo78859a(new C22599j(this, mVar, i, str, mVar, i2));
            return;
        }
        throw new ay("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: b */
    static /* synthetic */ Bundle m82158b(Map map) {
        Bundle e = m82168e();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        e.putParcelableArrayList("installed_asset_module", arrayList);
        return e;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Bundle m82162c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Bundle m82163c(int i, String str) {
        Bundle c = m82162c(i);
        c.putString("module_name", str);
        return c;
    }

    /* renamed from: c */
    static /* synthetic */ Bundle m82164c(int i, String str, String str2, int i2) {
        Bundle c = m82163c(i, str);
        c.putString("slice_id", str2);
        c.putInt("chunk_number", i2);
        return c;
    }

    /* renamed from: d */
    private static <T> Task<T> m82166d() {
        f55955a.mo78873b("onError(%d)", -11);
        return C22731c.m82677a((Exception) new AssetPackException(-11));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static Bundle m82168e() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10703);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final Task<List<String>> mo78779a(Map<String, Long> map) {
        if (this.f55959e == null) {
            return m82166d();
        }
        f55955a.mo78874c("syncPacks", new Object[0]);
        C22741m mVar = new C22741m();
        this.f55959e.mo78859a(new C22596g(this, mVar, map, mVar));
        return mVar.mo79088a();
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final synchronized void mo78780a() {
        if (this.f55960f != null) {
            C22630b bVar = f55955a;
            bVar.mo78874c("keepAlive", new Object[0]);
            if (!this.f55961g.compareAndSet(false, true)) {
                bVar.mo78874c("Service is already kept alive.", new Object[0]);
                return;
            }
            C22741m mVar = new C22741m();
            this.f55960f.mo78859a(new C22602m(this, mVar, mVar));
            return;
        }
        f55955a.mo78875d("Keep alive connection manager is not initialized.", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78781a(int i) {
        if (this.f55959e != null) {
            f55955a.mo78874c("notifySessionFailed", new Object[0]);
            C22741m mVar = new C22741m();
            this.f55959e.mo78859a(new C22600k(this, mVar, i, mVar));
            return;
        }
        throw new ay("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78782a(int i, String str) {
        m82154a(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78783a(int i, String str, String str2, int i2) {
        if (this.f55959e != null) {
            f55955a.mo78874c("notifyChunkTransferred", new Object[0]);
            C22741m mVar = new C22741m();
            this.f55959e.mo78859a(new C22597h(this, mVar, i, str, str2, i2, mVar));
            return;
        }
        throw new ay("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78785a(List<String> list) {
        if (this.f55959e != null) {
            f55955a.mo78874c("cancelDownloads(%s)", list);
            C22741m mVar = new C22741m();
            this.f55959e.mo78859a(new C22595f(this, mVar, list, mVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: b */
    public final Task<ParcelFileDescriptor> mo78786b(int i, String str, String str2, int i2) {
        if (this.f55959e == null) {
            return m82166d();
        }
        f55955a.mo78874c("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C22741m mVar = new C22741m();
        this.f55959e.mo78859a(new C22601l(this, mVar, i, str, str2, i2, mVar));
        return mVar.mo79088a();
    }
}
