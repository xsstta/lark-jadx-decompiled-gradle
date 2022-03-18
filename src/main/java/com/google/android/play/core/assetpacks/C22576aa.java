package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.AbstractC22631bg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.google.android.play.core.assetpacks.aa */
final class C22576aa extends AbstractC22631bg {

    /* renamed from: a */
    private final File f55649a;

    /* renamed from: b */
    private final File f55650b;

    /* renamed from: c */
    private final NavigableMap<Long, File> f55651c = new TreeMap();

    C22576aa(File file, File file2) throws IOException {
        this.f55649a = file;
        this.f55650b = file2;
        List<File> a = cp.m82093a(file, file2);
        if (!a.isEmpty()) {
            int size = a.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                File file3 = a.get(i);
                this.f55651c.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new ay(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    /* renamed from: a */
    private final InputStream m81937a(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f55651c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new ay(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // com.google.android.play.core.internal.AbstractC22631bg
    /* renamed from: a */
    public final long mo78697a() {
        Map.Entry<Long, File> lastEntry = this.f55651c.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractC22631bg
    /* renamed from: a */
    public final InputStream mo78698a(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new ay(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= mo78697a()) {
            Long floorKey = this.f55651c.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f55651c.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C22616z(m81937a(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m81937a(j, floorKey));
            for (File file : this.f55651c.subMap(floorKey, false, floorKey2, false).values()) {
                arrayList.add(new FileInputStream(file));
            }
            arrayList.add(new C22616z(new FileInputStream((File) this.f55651c.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new ay(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo78697a()), Long.valueOf(j3)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
