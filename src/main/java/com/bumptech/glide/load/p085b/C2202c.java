package com.bumptech.glide.load.p085b;

import android.util.Log;
import com.bumptech.glide.load.AbstractC2136a;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.util.C2542a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.c */
public class C2202c implements AbstractC2136a<ByteBuffer> {
    /* renamed from: a */
    public boolean mo10479a(ByteBuffer byteBuffer, File file, C2390f fVar) {
        try {
            C2542a.m10845a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
