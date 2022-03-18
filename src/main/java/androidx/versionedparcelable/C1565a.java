package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;

/* renamed from: androidx.versionedparcelable.a */
class C1565a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f5469d;

    /* renamed from: e */
    private final Parcel f5470e;

    /* renamed from: f */
    private final int f5471f;

    /* renamed from: g */
    private final int f5472g;

    /* renamed from: h */
    private final String f5473h;

    /* renamed from: i */
    private int f5474i;

    /* renamed from: j */
    private int f5475j;

    /* renamed from: k */
    private int f5476k;

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: d */
    public int mo8099d() {
        return this.f5470e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: e */
    public String mo8100e() {
        return this.f5470e.readString();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public CharSequence mo8102g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5470e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: h */
    public <T extends Parcelable> T mo8103h() {
        return (T) this.f5470e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public boolean mo8104i() {
        if (this.f5470e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: f */
    public byte[] mo8101f() {
        int readInt = this.f5470e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5470e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    public void mo8093b() {
        int i = this.f5474i;
        if (i >= 0) {
            int i2 = this.f5469d.get(i);
            int dataPosition = this.f5470e.dataPosition();
            this.f5470e.setDataPosition(i2);
            this.f5470e.writeInt(dataPosition - i2);
            this.f5470e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: c */
    public VersionedParcel mo8097c() {
        Parcel parcel = this.f5470e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5475j;
        if (i == this.f5471f) {
            i = this.f5472g;
        }
        return new C1565a(parcel, dataPosition, i, this.f5473h + "  ", this.f5466a, this.f5467b, this.f5468c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo8071a(int i) {
        this.f5470e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo8073a(Parcelable parcelable) {
        this.f5470e.writeParcelable(parcelable, 0);
    }

    C1565a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo8078a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5470e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: c */
    public void mo8098c(int i) {
        mo8093b();
        this.f5474i = i;
        this.f5469d.put(i, this.f5470e.dataPosition());
        mo8071a(0);
        mo8071a(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo8080a(String str) {
        this.f5470e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo8082a(boolean z) {
        this.f5470e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    public boolean mo8094b(int i) {
        while (this.f5475j < this.f5472g) {
            int i2 = this.f5476k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5470e.setDataPosition(this.f5475j);
            int readInt = this.f5470e.readInt();
            this.f5476k = this.f5470e.readInt();
            this.f5475j += readInt;
        }
        if (this.f5476k == i) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo8085a(byte[] bArr) {
        if (bArr != null) {
            this.f5470e.writeInt(bArr.length);
            this.f5470e.writeByteArray(bArr);
            return;
        }
        this.f5470e.writeInt(-1);
    }

    private C1565a(Parcel parcel, int i, int i2, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f5469d = new SparseIntArray();
        this.f5474i = -1;
        this.f5475j = 0;
        this.f5476k = -1;
        this.f5470e = parcel;
        this.f5471f = i;
        this.f5472g = i2;
        this.f5475j = i;
        this.f5473h = str;
    }
}
