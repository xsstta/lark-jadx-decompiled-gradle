package com.google.android.libraries.places.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class zzgs<K, V> extends zzgn<K, V> {
    private static final zzgn<Object, Object> zza = new zzgs(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    public final int size() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgn
    public final zzgp<Map.Entry<K, V>> zza() {
        return new zzgv(this, this.zzc, 0, this.zzd);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgn
    public final zzgp<K> zzb() {
        return new zzgx(this, new zzgw(this.zzc, 0, this.zzd));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgn
    public final zzgj<V> zzc() {
        return new zzgw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzgn, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i = this.zzd;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int zza2 = zzgg.zza(obj.hashCode());
                while (true) {
                    int i2 = zza2 & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    zza2 = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int zza3 = zzgg.zza(obj.hashCode());
                while (true) {
                    int i4 = zza3 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    zza3 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int zza4 = zzgg.zza(obj.hashCode());
                while (true) {
                    int i6 = zza4 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    zza4 = i6 + 1;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x0096 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [short[]] */
    /* JADX WARN: Type inference failed for: r7v5, types: [short] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v7, types: [byte] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f6, code lost:
        r2[r7] = r4;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.libraries.places.internal.zzgs<K, V> zza(int r10, java.lang.Object[] r11) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzgs.zza(int, java.lang.Object[]):com.google.android.libraries.places.internal.zzgs");
    }

    private zzgs(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    private static IllegalArgumentException zza(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
