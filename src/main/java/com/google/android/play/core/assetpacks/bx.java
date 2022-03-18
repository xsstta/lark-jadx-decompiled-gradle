package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.AbstractC22633by;
import com.google.android.play.core.internal.C22627ah;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.cg;
import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.C22741m;
import com.google.android.play.core.tasks.Task;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class bx implements dl {

    /* renamed from: a */
    private static final C22630b f55818a = new C22630b("FakeAssetPackService");

    /* renamed from: h */
    private static final AtomicInteger f55819h = new AtomicInteger(1);

    /* renamed from: b */
    private final String f55820b;

    /* renamed from: c */
    private final C22609s f55821c;

    /* renamed from: d */
    private final bb f55822d;

    /* renamed from: e */
    private final Context f55823e;

    /* renamed from: f */
    private final ch f55824f;

    /* renamed from: g */
    private final AbstractC22633by<Executor> f55825g;

    /* renamed from: i */
    private final Handler f55826i = new Handler(Looper.getMainLooper());

    bx(File file, C22609s sVar, bb bbVar, Context context, ch chVar, AbstractC22633by<Executor> byVar) {
        this.f55820b = file.getAbsolutePath();
        this.f55821c = sVar;
        this.f55822d = bbVar;
        this.f55823e = context;
        this.f55824f = chVar;
        this.f55825g = byVar;
    }

    /* renamed from: a */
    static long m82043a(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: a */
    private static String m82044a(File file) throws LocalTestingException {
        try {
            return bz.m82059a(Arrays.asList(file));
        } catch (NoSuchAlgorithmException e) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e2);
        }
    }

    /* renamed from: a */
    private final void m82045a(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f55824f.mo78791a());
        bundle.putInt("session_id", i);
        File[] a = m82046a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : a) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = C22627ah.m82257a(file);
            bundle.putParcelableArrayList(cg.m82392a("chunk_intents", str, a2), arrayList2);
            bundle.putString(cg.m82392a("uncompressed_hash_sha256", str, a2), m82044a(file));
            bundle.putLong(cg.m82392a("uncompressed_size", str, a2), file.length());
            arrayList.add(a2);
        }
        bundle.putStringArrayList(cg.m82391a("slice_ids", str), arrayList);
        bundle.putLong(cg.m82391a("pack_version", str), (long) this.f55824f.mo78791a());
        bundle.putInt(cg.m82391a(UpdateKey.STATUS, str), i2);
        bundle.putInt(cg.m82391a("error_code", str), 0);
        bundle.putLong(cg.m82391a("bytes_downloaded", str), m82043a(i2, j));
        bundle.putLong(cg.m82391a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m82043a(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f55826i.post(new bw(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    /* renamed from: a */
    private final File[] m82046a(String str) throws LocalTestingException {
        File file = new File(this.f55820b);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new bv(str));
            if (listFiles != null) {
                int length = listFiles.length;
                if (length != 0) {
                    for (File file2 : listFiles) {
                        if (C22627ah.m82257a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final Task<List<String>> mo78779a(Map<String, Long> map) {
        f55818a.mo78874c("syncPacks()", new Object[0]);
        return C22731c.m82678a(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78780a() {
        f55818a.mo78874c("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78781a(int i) {
        f55818a.mo78874c("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78782a(int i, String str) {
        f55818a.mo78874c("notifyModuleCompleted", new Object[0]);
        this.f55825g.mo78909a().execute(new bu(this, i, str));
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78783a(int i, String str, String str2, int i2) {
        f55818a.mo78874c("notifyChunkTransferred", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo78784a(Intent intent) {
        this.f55821c.mo78655a(this.f55823e, intent);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: a */
    public final void mo78785a(List<String> list) {
        f55818a.mo78874c("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.dl
    /* renamed from: b */
    public final Task<ParcelFileDescriptor> mo78786b(int i, String str, String str2, int i2) {
        f55818a.mo78874c("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C22741m mVar = new C22741m();
        try {
            File[] a = m82046a(str);
            for (File file : a) {
                if (C22627ah.m82257a(file).equals(str2)) {
                    mVar.mo79090a(ParcelFileDescriptor.open(file, 268435456));
                    return mVar.mo79088a();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
        } catch (FileNotFoundException e) {
            f55818a.mo78875d("getChunkFileDescriptor failed", e);
            mVar.mo79089a((Exception) new LocalTestingException("Asset Slice file not found.", e));
        } catch (LocalTestingException e2) {
            f55818a.mo78875d("getChunkFileDescriptor failed", e2);
            mVar.mo79089a((Exception) e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo78787b(int i, String str) {
        try {
            m82045a(i, str, 4);
        } catch (LocalTestingException e) {
            f55818a.mo78875d("notifyModuleCompleted failed", e);
        }
    }
}
