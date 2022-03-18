package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C21704a();

    /* renamed from: a */
    private final int f52920a;

    /* renamed from: b */
    private ParcelFileDescriptor f52921b;

    /* renamed from: c */
    private final int f52922c;

    /* renamed from: d */
    private Bitmap f52923d;

    /* renamed from: e */
    private File f52924e;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f52920a = i;
        this.f52921b = parcelFileDescriptor;
        this.f52922c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f52921b == null) {
            Bitmap bitmap = this.f52923d;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m78856a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m78857a(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m78857a(dataOutputStream);
                throw th;
            }
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52920a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f52921b, i | 1, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f52922c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        this.f52921b = null;
    }

    /* renamed from: a */
    private final FileOutputStream m78856a() {
        File file = this.f52924e;
        if (file != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f52921b = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    /* renamed from: a */
    private static void m78857a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }
}
