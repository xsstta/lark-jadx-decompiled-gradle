package androidx.loader.p045a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C0525g;
import androidx.core.util.C0840a;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import androidx.loader.content.C1198c;
import androidx.loader.p045a.AbstractC1181a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* access modifiers changed from: package-private */
/* renamed from: androidx.loader.a.b */
public class C1183b extends AbstractC1181a {

    /* renamed from: a */
    static boolean f4303a;

    /* renamed from: b */
    private final LifecycleOwner f4304b;

    /* renamed from: c */
    private final C1186c f4305c;

    /* renamed from: androidx.loader.a.b$a */
    public static class C1184a<D> extends C1177w<D> implements C1198c.AbstractC1201c<D> {

        /* renamed from: a */
        private final int f4306a;

        /* renamed from: f */
        private final Bundle f4307f;

        /* renamed from: g */
        private final C1198c<D> f4308g;

        /* renamed from: h */
        private LifecycleOwner f4309h;

        /* renamed from: i */
        private C1185b<D> f4310i;

        /* renamed from: j */
        private C1198c<D> f4311j;

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1198c<D> mo6061f() {
            return this.f4308g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo6062g() {
            LifecycleOwner lifecycleOwner = this.f4309h;
            C1185b<D> bVar = this.f4310i;
            if (lifecycleOwner != null && bVar != null) {
                super.mo5928b((AbstractC1178x) bVar);
                mo5923a(lifecycleOwner, bVar);
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: d */
        public void mo5931d() {
            if (C1183b.f4303a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4308g.mo6131t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo6063h() {
            C1185b<D> bVar;
            if (mo5932e() && (bVar = this.f4310i) != null && !bVar.mo6066a()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: a */
        public void mo5920a() {
            if (C1183b.f4303a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4308g.mo6128q();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f4306a);
            sb.append(" : ");
            C0840a.m3984a(this.f4308g, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.x<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: b */
        public void mo5928b(AbstractC1178x<? super D> xVar) {
            super.mo5928b((AbstractC1178x) xVar);
            this.f4309h = null;
            this.f4310i = null;
        }

        @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
        /* renamed from: b */
        public void mo5929b(D d) {
            super.mo5929b((Object) d);
            C1198c<D> cVar = this.f4311j;
            if (cVar != null) {
                cVar.mo6135w();
                this.f4311j = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1198c<D> mo6058a(boolean z) {
            if (C1183b.f4303a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4308g.mo6129r();
            this.f4308g.mo6133u();
            C1185b<D> bVar = this.f4310i;
            if (bVar != null) {
                mo5928b((AbstractC1178x) bVar);
                if (z) {
                    bVar.mo6067b();
                }
            }
            this.f4308g.mo6121a(this);
            if ((bVar == null || bVar.mo6066a()) && !z) {
                return this.f4308g;
            }
            this.f4308g.mo6135w();
            return this.f4311j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1198c<D> mo6057a(LifecycleOwner lifecycleOwner, AbstractC1181a.AbstractC1182a<D> aVar) {
            C1185b<D> bVar = new C1185b<>(this.f4308g, aVar);
            mo5923a(lifecycleOwner, bVar);
            C1185b<D> bVar2 = this.f4310i;
            if (bVar2 != null) {
                mo5928b((AbstractC1178x) bVar2);
            }
            this.f4309h = lifecycleOwner;
            this.f4310i = bVar;
            return this.f4308g;
        }

        @Override // androidx.loader.content.C1198c.AbstractC1201c
        /* renamed from: a */
        public void mo6059a(C1198c<D> cVar, D d) {
            if (C1183b.f4303a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo5929b((Object) d);
                return;
            }
            if (C1183b.f4303a) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo5926a((Object) d);
        }

        C1184a(int i, Bundle bundle, C1198c<D> cVar, C1198c<D> cVar2) {
            this.f4306a = i;
            this.f4307f = bundle;
            this.f4308g = cVar;
            this.f4311j = cVar2;
            cVar.mo6120a(i, this);
        }

        /* renamed from: a */
        public void mo6060a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4306a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4307f);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4308g);
            C1198c<D> cVar = this.f4308g;
            cVar.mo6097a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4310i != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4310i);
                C1185b<D> bVar = this.f4310i;
                bVar.mo6065a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo6061f().mo6122c((D) mo5927b()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo5932e());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.b$b */
    public static class C1185b<D> implements AbstractC1178x<D> {

        /* renamed from: a */
        private final C1198c<D> f4312a;

        /* renamed from: b */
        private final AbstractC1181a.AbstractC1182a<D> f4313b;

        /* renamed from: c */
        private boolean f4314c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6066a() {
            return this.f4314c;
        }

        public String toString() {
            return this.f4313b.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6067b() {
            if (this.f4314c) {
                if (C1183b.f4303a) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4312a);
                }
                this.f4313b.mo6054a(this.f4312a);
            }
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public void onChanged(D d) {
            if (C1183b.f4303a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4312a + ": " + this.f4312a.mo6122c(d));
            }
            this.f4313b.mo6055a(this.f4312a, d);
            this.f4314c = true;
        }

        C1185b(C1198c<D> cVar, AbstractC1181a.AbstractC1182a<D> aVar) {
            this.f4312a = cVar;
            this.f4313b = aVar;
        }

        /* renamed from: a */
        public void mo6065a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4314c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.b$c */
    public static class C1186c extends AbstractC1142af {
        private static final C1144ai.AbstractC1146b FACTORY = new C1144ai.AbstractC1146b() {
            /* class androidx.loader.p045a.C1183b.C1186c.C11871 */

            @Override // androidx.lifecycle.C1144ai.AbstractC1146b
            public <T extends AbstractC1142af> T create(Class<T> cls) {
                return new C1186c();
            }
        };
        private boolean mCreatingLoader = false;
        private C0525g<C1184a> mLoaders = new C0525g<>();

        /* access modifiers changed from: package-private */
        public void finishCreatingLoader() {
            this.mCreatingLoader = false;
        }

        /* access modifiers changed from: package-private */
        public void startCreatingLoader() {
            this.mCreatingLoader = true;
        }

        /* access modifiers changed from: package-private */
        public boolean isCreatingLoader() {
            return this.mCreatingLoader;
        }

        C1186c() {
        }

        /* access modifiers changed from: package-private */
        public boolean hasRunningLoaders() {
            int b = this.mLoaders.mo3049b();
            for (int i = 0; i < b; i++) {
                if (this.mLoaders.mo3057e(i).mo6063h()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void markForRedelivery() {
            int b = this.mLoaders.mo3049b();
            for (int i = 0; i < b; i++) {
                this.mLoaders.mo3057e(i).mo6062g();
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC1142af
        public void onCleared() {
            super.onCleared();
            int b = this.mLoaders.mo3049b();
            for (int i = 0; i < b; i++) {
                this.mLoaders.mo3057e(i).mo6058a(true);
            }
            this.mLoaders.mo3052c();
        }

        /* access modifiers changed from: package-private */
        public void removeLoader(int i) {
            this.mLoaders.mo3050b(i);
        }

        static C1186c getInstance(ak akVar) {
            return (C1186c) new C1144ai(akVar, FACTORY).mo6005a(C1186c.class);
        }

        /* access modifiers changed from: package-private */
        public <D> C1184a<D> getLoader(int i) {
            return this.mLoaders.mo3047a(i);
        }

        /* access modifiers changed from: package-private */
        public void putLoader(int i, C1184a aVar) {
            this.mLoaders.mo3051b(i, aVar);
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.mLoaders.mo3049b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.mLoaders.mo3049b(); i++) {
                    C1184a e = this.mLoaders.mo3057e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.mLoaders.mo3056d(i));
                    printWriter.print(": ");
                    printWriter.println(e.toString());
                    e.mo6060a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    @Override // androidx.loader.p045a.AbstractC1181a
    /* renamed from: a */
    public void mo6047a() {
        this.f4305c.markForRedelivery();
    }

    @Override // androidx.loader.p045a.AbstractC1181a
    /* renamed from: b */
    public boolean mo6052b() {
        return this.f4305c.hasRunningLoaders();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0840a.m3984a(this.f4304b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.p045a.AbstractC1181a
    /* renamed from: b */
    public <D> C1198c<D> mo6050b(int i) {
        if (!this.f4305c.isCreatingLoader()) {
            C1184a<D> loader = this.f4305c.getLoader(i);
            if (loader != null) {
                return loader.mo6061f();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.p045a.AbstractC1181a
    /* renamed from: a */
    public void mo6048a(int i) {
        if (this.f4305c.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f4303a) {
                Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
            }
            C1184a loader = this.f4305c.getLoader(i);
            if (loader != null) {
                loader.mo6058a(true);
                this.f4305c.removeLoader(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    C1183b(LifecycleOwner lifecycleOwner, ak akVar) {
        this.f4304b = lifecycleOwner;
        this.f4305c = C1186c.getInstance(akVar);
    }

    @Override // androidx.loader.p045a.AbstractC1181a
    /* renamed from: b */
    public <D> C1198c<D> mo6051b(int i, Bundle bundle, AbstractC1181a.AbstractC1182a<D> aVar) {
        if (this.f4305c.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f4303a) {
                Log.v("LoaderManager", "restartLoader in " + this + ": args=" + bundle);
            }
            C1184a<D> loader = this.f4305c.getLoader(i);
            C1198c<D> cVar = null;
            if (loader != null) {
                cVar = loader.mo6058a(false);
            }
            return m5432a(i, bundle, aVar, cVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    @Override // androidx.loader.p045a.AbstractC1181a
    /* renamed from: a */
    public <D> C1198c<D> mo6046a(int i, Bundle bundle, AbstractC1181a.AbstractC1182a<D> aVar) {
        if (this.f4305c.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C1184a<D> loader = this.f4305c.getLoader(i);
            if (f4303a) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (loader == null) {
                return m5432a(i, bundle, aVar, (C1198c) null);
            }
            if (f4303a) {
                Log.v("LoaderManager", "  Re-using existing loader " + loader);
            }
            return loader.mo6057a(this.f4304b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    @Override // androidx.loader.p045a.AbstractC1181a
    /* renamed from: a */
    public void mo6049a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4305c.dump(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C1198c<D> m5432a(int i, Bundle bundle, AbstractC1181a.AbstractC1182a<D> aVar, C1198c<D> cVar) {
        try {
            this.f4305c.startCreatingLoader();
            C1198c<D> a = aVar.mo6053a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a);
                    }
                }
                C1184a aVar2 = new C1184a(i, bundle, a, cVar);
                if (f4303a) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f4305c.putLoader(i, aVar2);
                this.f4305c.finishCreatingLoader();
                return aVar2.mo6057a(this.f4304b, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f4305c.finishCreatingLoader();
            throw th;
        }
    }
}
