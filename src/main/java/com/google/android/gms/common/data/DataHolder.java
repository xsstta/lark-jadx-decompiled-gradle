package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C21706c();

    /* renamed from: k */
    private static final C21703a f52925k = new C21705b(new String[0], null);

    /* renamed from: a */
    private final int f52926a;

    /* renamed from: b */
    private final String[] f52927b;

    /* renamed from: c */
    private Bundle f52928c;

    /* renamed from: d */
    private final CursorWindow[] f52929d;

    /* renamed from: e */
    private final int f52930e;

    /* renamed from: f */
    private final Bundle f52931f;

    /* renamed from: g */
    private int[] f52932g;

    /* renamed from: h */
    private int f52933h;

    /* renamed from: i */
    private boolean f52934i;

    /* renamed from: j */
    private boolean f52935j = true;

    public static class zaa extends RuntimeException {
        public zaa(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f52926a = i;
        this.f52927b = strArr;
        this.f52929d = cursorWindowArr;
        this.f52930e = i2;
        this.f52931f = bundle;
    }

    /* renamed from: a */
    public final void mo73536a() {
        this.f52928c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f52927b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f52928c.putInt(strArr[i2], i2);
            i2++;
        }
        this.f52932g = new int[this.f52929d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f52929d;
            if (i < cursorWindowArr.length) {
                this.f52932g[i] = i3;
                i3 += this.f52929d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f52933h = i3;
                return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C21703a {

        /* renamed from: a */
        private final String[] f52936a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f52937b;

        /* renamed from: c */
        private final String f52938c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f52939d;

        /* renamed from: e */
        private boolean f52940e;

        /* renamed from: f */
        private String f52941f;

        private C21703a(String[] strArr, String str) {
            this.f52936a = (String[]) Preconditions.checkNotNull(strArr);
            this.f52937b = new ArrayList<>();
            this.f52938c = str;
            this.f52939d = new HashMap<>();
            this.f52940e = false;
            this.f52941f = null;
        }

        /* synthetic */ C21703a(String[] strArr, String str, C21705b bVar) {
            this(strArr, null);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.f52927b, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f52929d, i, false);
        SafeParcelWriter.writeInt(parcel, 3, mo73537b());
        SafeParcelWriter.writeBundle(parcel, 4, mo73538c(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f52926a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* renamed from: b */
    public final int mo73537b() {
        return this.f52930e;
    }

    /* renamed from: c */
    public final Bundle mo73538c() {
        return this.f52931f;
    }

    /* renamed from: d */
    public final boolean mo73540d() {
        boolean z;
        synchronized (this) {
            z = this.f52934i;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.f52934i) {
                this.f52934i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f52929d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() throws Throwable {
        try {
            if (this.f52935j && this.f52929d.length > 0 && !mo73540d()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }
}
