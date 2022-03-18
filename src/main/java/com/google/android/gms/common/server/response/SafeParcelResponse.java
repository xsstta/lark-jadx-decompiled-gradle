package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.C21813g;
import com.google.android.gms.common.util.C21814h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C21801m();

    /* renamed from: a */
    private final int f53160a;

    /* renamed from: b */
    private final Parcel f53161b;

    /* renamed from: c */
    private final int f53162c = 2;

    /* renamed from: d */
    private final zak f53163d;

    /* renamed from: e */
    private final String f53164e;

    /* renamed from: f */
    private int f53165f;

    /* renamed from: g */
    private int f53166g;

    SafeParcelResponse(int i, Parcel parcel, zak zak) {
        this.f53160a = i;
        this.f53161b = (Parcel) Preconditions.checkNotNull(parcel);
        this.f53163d = zak;
        if (zak == null) {
            this.f53164e = null;
        } else {
            this.f53164e = zak.mo73806b();
        }
        this.f53165f = 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53160a);
        SafeParcelWriter.writeParcel(parcel, 2, m79060b(), false);
        int i2 = this.f53162c;
        if (i2 == 0) {
            zak = null;
        } else if (i2 == 1) {
            zak = this.f53163d;
        } else if (i2 == 2) {
            zak = this.f53163d;
        } else {
            int i3 = this.f53162c;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        SafeParcelWriter.writeParcelable(parcel, 3, zak, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel m79060b() {
        /*
            r2 = this;
            int r0 = r2.f53165f
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.f53161b
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r0)
            r2.f53166g = r0
        L_0x0010:
            android.os.Parcel r0 = r2.f53161b
            int r1 = r2.f53166g
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r0, r1)
            r0 = 2
            r2.f53165f = r0
        L_0x001a:
            android.os.Parcel r0 = r2.f53161b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m79060b():android.os.Parcel");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo72968a() {
        zak zak = this.f53163d;
        if (zak == null) {
            return null;
        }
        return zak.mo73804a(this.f53164e);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo73780a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo73781b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public String toString() {
        Preconditions.checkNotNull(this.f53163d, "Cannot convert to JSON on client side.");
        Parcel b = m79060b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m79059a(sb, this.f53163d.mo73804a(this.f53164e), b);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m79059a(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().mo73783a(), entry);
        }
        sb.append('{');
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(readHeader));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field<?, ?> field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.mo73786b()) {
                    switch (field.f53137c) {
                        case 0:
                            m79058a(sb, field, m79033a(field, Integer.valueOf(SafeParcelReader.readInt(parcel, readHeader))));
                            break;
                        case 1:
                            m79058a(sb, field, m79033a(field, SafeParcelReader.createBigInteger(parcel, readHeader)));
                            break;
                        case 2:
                            m79058a(sb, field, m79033a(field, Long.valueOf(SafeParcelReader.readLong(parcel, readHeader))));
                            break;
                        case 3:
                            m79058a(sb, field, m79033a(field, Float.valueOf(SafeParcelReader.readFloat(parcel, readHeader))));
                            break;
                        case 4:
                            m79058a(sb, field, m79033a(field, Double.valueOf(SafeParcelReader.readDouble(parcel, readHeader))));
                            break;
                        case 5:
                            m79058a(sb, field, m79033a(field, SafeParcelReader.createBigDecimal(parcel, readHeader)));
                            break;
                        case 6:
                            m79058a(sb, field, m79033a(field, Boolean.valueOf(SafeParcelReader.readBoolean(parcel, readHeader))));
                            break;
                        case 7:
                            m79058a(sb, field, m79033a(field, SafeParcelReader.createString(parcel, readHeader)));
                            break;
                        case 8:
                        case 9:
                            m79058a(sb, field, m79033a(field, SafeParcelReader.createByteArray(parcel, readHeader)));
                            break;
                        case 10:
                            Bundle createBundle = SafeParcelReader.createBundle(parcel, readHeader);
                            HashMap hashMap = new HashMap();
                            for (String str : createBundle.keySet()) {
                                hashMap.put(str, createBundle.getString(str));
                            }
                            m79058a(sb, field, m79033a(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.f53137c;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f53138d) {
                    sb.append("[");
                    switch (field.f53137c) {
                        case 0:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createIntArray(parcel, readHeader));
                            break;
                        case 1:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBigIntegerArray(parcel, readHeader));
                            break;
                        case 2:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createLongArray(parcel, readHeader));
                            break;
                        case 3:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createFloatArray(parcel, readHeader));
                            break;
                        case 4:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createDoubleArray(parcel, readHeader));
                            break;
                        case 5:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBigDecimalArray(parcel, readHeader));
                            break;
                        case 6:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBooleanArray(parcel, readHeader));
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb, SafeParcelReader.createStringArray(parcel, readHeader));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] createParcelArray = SafeParcelReader.createParcelArray(parcel, readHeader);
                            int length = createParcelArray.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                createParcelArray[i2].setDataPosition(0);
                                m79059a(sb, field.mo73787c(), createParcelArray[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f53137c) {
                        case 0:
                            sb.append(SafeParcelReader.readInt(parcel, readHeader));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.createBigInteger(parcel, readHeader));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.readLong(parcel, readHeader));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.readFloat(parcel, readHeader));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.readDouble(parcel, readHeader));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.createBigDecimal(parcel, readHeader));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.readBoolean(parcel, readHeader));
                            break;
                        case 7:
                            String createString = SafeParcelReader.createString(parcel, readHeader);
                            sb.append("\"");
                            sb.append(C21813g.m79091a(createString));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] createByteArray = SafeParcelReader.createByteArray(parcel, readHeader);
                            sb.append("\"");
                            sb.append(Base64Utils.encode(createByteArray));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] createByteArray2 = SafeParcelReader.createByteArray(parcel, readHeader);
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe(createByteArray2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle createBundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                            Set<String> keySet = createBundle2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(C21813g.m79091a(createBundle2.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel createParcel = SafeParcelReader.createParcel(parcel, readHeader);
                            createParcel.setDataPosition(0);
                            m79059a(sb, field.mo73787c(), createParcel);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(validateObjectHeader);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    /* renamed from: a */
    private final void m79058a(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f53136b) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m79057a(sb, field.f53135a, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m79057a(sb, field.f53135a, obj);
    }

    /* renamed from: a */
    private static void m79057a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C21813g.m79091a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C21814h.m79092a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
