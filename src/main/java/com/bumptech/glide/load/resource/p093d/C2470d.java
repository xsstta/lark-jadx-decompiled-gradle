package com.bumptech.glide.load.resource.p093d;

import android.util.Log;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2542a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.d.d */
public class C2470d implements AbstractC2392h<C2468c> {
    @Override // com.bumptech.glide.load.AbstractC2392h
    /* renamed from: a */
    public EncodeStrategy mo10905a(C2390f fVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: a */
    public boolean mo10479a(AbstractC2383u<C2468c> uVar, File file, C2390f fVar) {
        try {
            C2542a.m10845a(uVar.mo10878d().mo11001c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
