package com.bumptech.glide.load.p085b;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.s */
public class C2245s<Data> implements AbstractC2233n<Integer, Data> {

    /* renamed from: a */
    private final AbstractC2233n<Uri, Data> f7581a;

    /* renamed from: b */
    private final Resources f7582b;

    /* renamed from: a */
    public boolean mo10536a(Integer num) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.b.s$a */
    public static final class C2246a implements AbstractC2235o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f7583a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2246a(Resources resources) {
            this.f7583a = resources;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Integer, AssetFileDescriptor> mo10538a(C2241r rVar) {
            return new C2245s(this.f7583a, rVar.mo10614b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$b */
    public static class C2247b implements AbstractC2235o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f7584a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2247b(Resources resources) {
            this.f7584a = resources;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Integer, ParcelFileDescriptor> mo10538a(C2241r rVar) {
            return new C2245s(this.f7584a, rVar.mo10614b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$c */
    public static class C2248c implements AbstractC2235o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f7585a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2248c(Resources resources) {
            this.f7585a = resources;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Integer, InputStream> mo10538a(C2241r rVar) {
            return new C2245s(this.f7585a, rVar.mo10614b(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$d */
    public static class C2249d implements AbstractC2235o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f7586a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2249d(Resources resources) {
            this.f7586a = resources;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Integer, Uri> mo10538a(C2241r rVar) {
            return new C2245s(this.f7586a, C2255v.m9677a());
        }
    }

    /* renamed from: b */
    private Uri m9650b(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f7582b.getResourcePackageName(num.intValue()) + '/' + this.f7582b.getResourceTypeName(num.intValue()) + '/' + this.f7582b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    public C2245s(Resources resources, AbstractC2233n<Uri, Data> nVar) {
        this.f7582b = resources;
        this.f7581a = nVar;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(Integer num, int i, int i2, C2390f fVar) {
        Uri b = m9650b(num);
        if (b == null) {
            return null;
        }
        return this.f7581a.mo10534a(b, i, i2, fVar);
    }
}
