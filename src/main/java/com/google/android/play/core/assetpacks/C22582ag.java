package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.AbstractC22633by;
import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.Task;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.play.core.assetpacks.ag */
final class C22582ag {

    /* renamed from: a */
    private final AbstractC22633by<dl> f55673a;

    C22582ag(AbstractC22633by<dl> byVar) {
        this.f55673a = byVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream mo78727a(int i, String str, String str2, int i2) {
        try {
            return new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) C22731c.m82679a((Task) this.f55673a.mo78909a().mo78786b(i, str, str2, i2)));
        } catch (ExecutionException e) {
            throw new ay(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e, i);
        } catch (InterruptedException e2) {
            throw new ay("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
