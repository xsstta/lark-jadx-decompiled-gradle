package com.huawei.hms.common.parcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class ParcelWrite {

    /* renamed from: a */
    public static final int f57964a = 65262;

    /* renamed from: b */
    public Parcel f57965b;

    public ParcelWrite(Parcel parcel) {
        this.f57965b = parcel;
    }

    /* renamed from: a */
    private int m85259a(int i) {
        this.f57965b.writeInt(i | -65536);
        this.f57965b.writeInt(0);
        return this.f57965b.dataPosition();
    }

    /* renamed from: a */
    private void m85260a(int i, int i2) {
        if (i2 >= 65535) {
            this.f57965b.writeInt(i | -65536);
            this.f57965b.writeInt(i2);
            return;
        }
        this.f57965b.writeInt(i | (i2 << 16));
    }

    /* renamed from: a */
    private <T extends Parcelable> void m85261a(T t, int i) {
        int dataPosition = this.f57965b.dataPosition();
        this.f57965b.writeInt(1);
        int dataPosition2 = this.f57965b.dataPosition();
        t.writeToParcel(this.f57965b, i);
        int dataPosition3 = this.f57965b.dataPosition();
        this.f57965b.setDataPosition(dataPosition);
        this.f57965b.writeInt(dataPosition3 - dataPosition2);
        this.f57965b.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private void m85262b(int i) {
        int dataPosition = this.f57965b.dataPosition();
        this.f57965b.setDataPosition(i - 4);
        this.f57965b.writeInt(dataPosition - i);
        this.f57965b.setDataPosition(dataPosition);
    }

    public int beginObjectHeader() {
        return m85259a(65262);
    }

    public void finishObjectHeader(int i) {
        m85262b(i);
    }

    public void writeBigDecimal(int i, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal != null) {
            int a = m85259a(i);
            this.f57965b.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            this.f57965b.writeInt(bigDecimal.scale());
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeBigDecimalArray(int i, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr != null) {
            int a = m85259a(i);
            int length = bigDecimalArr.length;
            this.f57965b.writeInt(length);
            for (int i2 = 0; i2 < length; i2++) {
                this.f57965b.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
                this.f57965b.writeInt(bigDecimalArr[i2].scale());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeBigInteger(int i, BigInteger bigInteger, boolean z) {
        if (bigInteger != null) {
            int a = m85259a(i);
            this.f57965b.writeByteArray(bigInteger.toByteArray());
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeBigIntegerArray(int i, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr != null) {
            int a = m85259a(i);
            int length = bigIntegerArr.length;
            this.f57965b.writeInt(length);
            for (BigInteger bigInteger : bigIntegerArr) {
                this.f57965b.writeByteArray(bigInteger.toByteArray());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeBoolean(int i, boolean z) {
        m85260a(i, 4);
        this.f57965b.writeInt(z ? 1 : 0);
    }

    public void writeBooleanArray(int i, boolean[] zArr, boolean z) {
        if (zArr != null) {
            int a = m85259a(i);
            this.f57965b.writeBooleanArray(zArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeBooleanList(int i, List<Boolean> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            int size = list.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(list.get(i2).booleanValue() ? 1 : 0);
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeBooleanObject(int i, Boolean bool) {
        writeBooleanObject(i, bool, false);
    }

    public void writeBooleanObject(int i, Boolean bool, boolean z) {
        if (bool != null) {
            m85260a(i, 4);
            this.f57965b.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeBundle(int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int a = m85259a(i);
            this.f57965b.writeBundle(bundle);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeByte(int i, byte b) {
        m85260a(i, 4);
        this.f57965b.writeInt(b);
    }

    public void writeByteArray(int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int a = m85259a(i);
            this.f57965b.writeByteArray(bArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeByteArrayArray(int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int a = m85259a(i);
            int length = bArr.length;
            this.f57965b.writeInt(length);
            for (byte[] bArr2 : bArr) {
                this.f57965b.writeByteArray(bArr2);
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeByteArraySparseArray(int i, SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a = m85259a(i);
            int size = sparseArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseArray.keyAt(i2));
                this.f57965b.writeByteArray(sparseArray.valueAt(i2));
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeChar(int i, char c) {
        m85260a(i, 4);
        this.f57965b.writeInt(c);
    }

    public void writeCharArray(int i, char[] cArr, boolean z) {
        if (cArr != null) {
            int a = m85259a(i);
            this.f57965b.writeCharArray(cArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeDouble(int i, double d) {
        m85260a(i, 8);
        this.f57965b.writeDouble(d);
    }

    public void writeDoubleArray(int i, double[] dArr, boolean z) {
        if (dArr != null) {
            int a = m85259a(i);
            this.f57965b.writeDoubleArray(dArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeDoubleList(int i, List<Double> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            int size = list.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeDouble(list.get(i2).doubleValue());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeDoubleObject(int i, Double d, boolean z) {
        if (d != null) {
            m85260a(i, 8);
            this.f57965b.writeDouble(d.doubleValue());
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeDoubleSparseArray(int i, SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a = m85259a(i);
            int size = sparseArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseArray.keyAt(i2));
                this.f57965b.writeDouble(sparseArray.valueAt(i2).doubleValue());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeFloat(int i, float f) {
        m85260a(i, 4);
        this.f57965b.writeFloat(f);
    }

    public void writeFloatArray(int i, float[] fArr, boolean z) {
        if (fArr != null) {
            int a = m85259a(i);
            this.f57965b.writeFloatArray(fArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeFloatList(int i, List<Float> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            int size = list.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeFloat(list.get(i2).floatValue());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeFloatObject(int i, Float f, boolean z) {
        if (f != null) {
            m85260a(i, 4);
            this.f57965b.writeFloat(f.floatValue());
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeFloatSparseArray(int i, SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a = m85259a(i);
            int size = sparseArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseArray.keyAt(i2));
                this.f57965b.writeFloat(sparseArray.valueAt(i2).floatValue());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeIBinder(int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int a = m85259a(i);
            this.f57965b.writeStrongBinder(iBinder);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeIBinderArray(int i, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr != null) {
            int a = m85259a(i);
            this.f57965b.writeBinderArray(iBinderArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeIBinderList(int i, List<IBinder> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            this.f57965b.writeBinderList(list);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeIBinderSparseArray(int i, SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a = m85259a(i);
            int size = sparseArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseArray.keyAt(i2));
                this.f57965b.writeStrongBinder(sparseArray.valueAt(i2));
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeInt(int i, int i2) {
        m85260a(i, 4);
        this.f57965b.writeInt(i2);
    }

    public void writeIntArray(int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int a = m85259a(i);
            this.f57965b.writeIntArray(iArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeIntegerList(int i, List<Integer> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            int size = list.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(list.get(i2).intValue());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeIntegerObject(int i, Integer num, boolean z) {
        if (num != null) {
            m85260a(i, 4);
            this.f57965b.writeInt(num.intValue());
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeList(int i, List list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            this.f57965b.writeList(list);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeLong(int i, long j) {
        m85260a(i, 8);
        this.f57965b.writeLong(j);
    }

    public void writeLongArray(int i, long[] jArr, boolean z) {
        if (jArr != null) {
            int a = m85259a(i);
            this.f57965b.writeLongArray(jArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeLongList(int i, List<Long> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            int size = list.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeLong(list.get(i2).longValue());
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeLongObject(int i, Long l, boolean z) {
        if (l != null) {
            m85260a(i, 8);
            this.f57965b.writeLong(l.longValue());
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeParcel(int i, Parcel parcel, boolean z) {
        if (parcel != null) {
            int a = m85259a(i);
            this.f57965b.appendFrom(parcel, 0, parcel.dataSize());
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeParcelArray(int i, Parcel[] parcelArr, boolean z) {
        if (parcelArr != null) {
            int a = m85259a(i);
            int length = parcelArr.length;
            this.f57965b.writeInt(length);
            for (Parcel parcel : parcelArr) {
                if (parcel != null) {
                    this.f57965b.writeInt(parcel.dataSize());
                    this.f57965b.appendFrom(parcel, 0, parcel.dataSize());
                } else {
                    this.f57965b.writeInt(0);
                }
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeParcelList(int i, List<Parcel> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            int size = list.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcel parcel = list.get(i2);
                if (parcel != null) {
                    this.f57965b.writeInt(parcel.dataSize());
                    this.f57965b.appendFrom(parcel, 0, parcel.dataSize());
                } else {
                    this.f57965b.writeInt(0);
                }
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeParcelSparseArray(int i, SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a = m85259a(i);
            int size = sparseArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseArray.keyAt(i2));
                Parcel valueAt = sparseArray.valueAt(i2);
                if (valueAt != null) {
                    this.f57965b.writeInt(valueAt.dataSize());
                    this.f57965b.appendFrom(valueAt, 0, valueAt.dataSize());
                } else {
                    this.f57965b.writeInt(0);
                }
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeParcelable(int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int a = m85259a(i);
            parcelable.writeToParcel(this.f57965b, i2);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeShort(int i, short s) {
        m85260a(i, 4);
        this.f57965b.writeInt(s);
    }

    public void writeSparseBooleanArray(int i, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray != null) {
            int a = m85259a(i);
            this.f57965b.writeSparseBooleanArray(sparseBooleanArray);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeSparseIntArray(int i, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray != null) {
            int a = m85259a(i);
            int size = sparseIntArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseIntArray.keyAt(i2));
                this.f57965b.writeInt(sparseIntArray.valueAt(i2));
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeSparseLongArray(int i, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray != null) {
            int a = m85259a(i);
            int size = sparseLongArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseLongArray.keyAt(i2));
                this.f57965b.writeLong(sparseLongArray.valueAt(i2));
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeString(int i, String str, boolean z) {
        if (str != null) {
            int a = m85259a(i);
            this.f57965b.writeString(str);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeStringArray(int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int a = m85259a(i);
            this.f57965b.writeStringArray(strArr);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeStringList(int i, List<String> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            this.f57965b.writeStringList(list);
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public void writeStringSparseArray(int i, SparseArray<String> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a = m85259a(i);
            int size = sparseArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseArray.keyAt(i2));
                this.f57965b.writeString(sparseArray.valueAt(i2));
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public <T extends Parcelable> void writeTypedArray(int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int a = m85259a(i);
            int length = tArr.length;
            this.f57965b.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    this.f57965b.writeInt(0);
                } else {
                    m85261a(t, i2);
                }
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public <T extends Parcelable> void writeTypedList(int i, List<T> list, boolean z) {
        if (list != null) {
            int a = m85259a(i);
            int size = list.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    this.f57965b.writeInt(0);
                } else {
                    m85261a(t, 0);
                }
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }

    public <T extends Parcelable> void writeTypedSparseArray(int i, SparseArray<T> sparseArray, boolean z) {
        if (sparseArray != null) {
            int a = m85259a(i);
            int size = sparseArray.size();
            this.f57965b.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f57965b.writeInt(sparseArray.keyAt(i2));
                T valueAt = sparseArray.valueAt(i2);
                if (valueAt == null) {
                    this.f57965b.writeInt(0);
                } else {
                    m85261a(valueAt, 0);
                }
            }
            m85262b(a);
        } else if (z) {
            m85260a(i, 0);
        }
    }
}
