package com.bumptech.glide.load.p083a;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.p083a.AbstractC2149e;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.m */
public final class C2163m implements AbstractC2149e<ParcelFileDescriptor> {

    /* renamed from: a */
    private final C2165b f7468a;

    @Override // com.bumptech.glide.load.p083a.AbstractC2149e
    /* renamed from: b */
    public void mo10505b() {
    }

    /* renamed from: com.bumptech.glide.load.a.m$a */
    public static final class C2164a implements AbstractC2149e.AbstractC2150a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p083a.AbstractC2149e.AbstractC2150a
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo10507a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: a */
        public AbstractC2149e<ParcelFileDescriptor> mo10506a(ParcelFileDescriptor parcelFileDescriptor) {
            return new C2163m(parcelFileDescriptor);
        }
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo10504a() throws IOException {
        return this.f7468a.mo10526a();
    }

    /* renamed from: c */
    public static boolean m9405c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.a.m$b */
    public static final class C2165b {

        /* renamed from: a */
        private final ParcelFileDescriptor f7469a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ParcelFileDescriptor mo10526a() throws IOException {
            try {
                Os.lseek(this.f7469a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f7469a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }

        C2165b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f7469a = parcelFileDescriptor;
        }
    }

    public C2163m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7468a = new C2165b(parcelFileDescriptor);
    }
}
