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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParcelReader {

    /* renamed from: a */
    public static final int f57958a = 0;

    /* renamed from: b */
    public static final int f57959b = 1;

    /* renamed from: c */
    public static final int f57960c = 65262;

    /* renamed from: d */
    public HashMap<Integer, Integer[]> f57961d = new HashMap<>();

    /* renamed from: e */
    public Parcel f57962e;

    public class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str);
        }
    }

    public ParcelReader(Parcel parcel) {
        this.f57962e = parcel;
        m85256a();
    }

    /* renamed from: a */
    private int m85255a(int i) {
        Integer[] numArr = this.f57961d.get(Integer.valueOf(i));
        if (numArr != null) {
            this.f57962e.setDataPosition(numArr[0].intValue());
            return numArr[1].intValue();
        }
        throw new ParseException("Field is null:" + numArr, this.f57962e);
    }

    /* renamed from: a */
    private void m85256a() {
        int readInt = this.f57962e.readInt();
        int i = readInt & 65535;
        int readInt2 = (readInt & -65536) != -65536 ? (readInt >> 16) & 65535 : this.f57962e.readInt();
        if (i == 65262) {
            int dataPosition = this.f57962e.dataPosition();
            int i2 = readInt2 + dataPosition;
            if (i2 < dataPosition || i2 > this.f57962e.dataSize()) {
                throw new ParseException("invalid size, start=" + dataPosition + " end=" + i2, this.f57962e);
            }
            while (this.f57962e.dataPosition() < i2) {
                int readInt3 = this.f57962e.readInt();
                int i3 = readInt3 & 65535;
                int readInt4 = (readInt3 & -65536) != -65536 ? (readInt3 >> 16) & 65535 : this.f57962e.readInt();
                int dataPosition2 = this.f57962e.dataPosition();
                this.f57961d.put(Integer.valueOf(i3), new Integer[]{Integer.valueOf(dataPosition2), Integer.valueOf(readInt4)});
                this.f57962e.setDataPosition(dataPosition2 + readInt4);
            }
            if (this.f57962e.dataPosition() != i2) {
                throw new ParseException("the dataPosition is not" + i2, this.f57962e);
            }
            return;
        }
        String hexString = Integer.toHexString(i);
        throw new ParseException("Parse header error, not 65262. Got 0x" + hexString, this.f57962e);
    }

    /* renamed from: a */
    private void m85257a(int i, int i2) {
        Integer[] numArr = this.f57961d.get(Integer.valueOf(i));
        if (numArr != null) {
            int intValue = numArr[1].intValue();
            if (intValue != i2) {
                String hexString = Integer.toHexString(intValue);
                throw new ParseException("the field size is not " + i2 + " got " + intValue + " (0x" + hexString + ")", this.f57962e);
            }
            return;
        }
        throw new ParseException("Field is null:" + numArr, this.f57962e);
    }

    /* renamed from: b */
    private int m85258b(int i, int i2) {
        Integer[] numArr = this.f57961d.get(Integer.valueOf(i));
        if (numArr != null) {
            this.f57962e.setDataPosition(numArr[0].intValue());
            m85257a(i, i2);
            return i2;
        }
        throw new ParseException("Field is null:" + numArr, this.f57962e);
    }

    public BigDecimal createBigDecimal(int i, BigDecimal bigDecimal) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bigDecimal;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        byte[] createByteArray = this.f57962e.createByteArray();
        int readInt = this.f57962e.readInt();
        this.f57962e.setDataPosition(dataPosition + a);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public BigDecimal[] createBigDecimalArray(int i, BigDecimal[] bigDecimalArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bigDecimalArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        BigDecimal[] bigDecimalArr2 = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = this.f57962e.createByteArray();
            bigDecimalArr2[i2] = new BigDecimal(new BigInteger(createByteArray), this.f57962e.readInt());
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return bigDecimalArr2;
    }

    public BigInteger createBigInteger(int i, BigInteger bigInteger) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bigInteger;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        byte[] createByteArray = this.f57962e.createByteArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return new BigInteger(createByteArray);
    }

    public BigInteger[] createBigIntegerArray(int i, BigInteger[] bigIntegerArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bigIntegerArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        BigInteger[] bigIntegerArr2 = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr2[i2] = new BigInteger(this.f57962e.createByteArray());
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return bigIntegerArr2;
    }

    public boolean[] createBooleanArray(int i, boolean[] zArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return zArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        boolean[] createBooleanArray = this.f57962e.createBooleanArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createBooleanArray;
    }

    public ArrayList<Boolean> createBooleanList(int i, ArrayList<Boolean> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Boolean.valueOf(this.f57962e.readInt() != 0));
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return arrayList2;
    }

    public byte[] createByteArray(int i, byte[] bArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        byte[] createByteArray = this.f57962e.createByteArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    public byte[][] createByteArrayArray(int i, byte[][] bArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        byte[][] bArr2 = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr2[i2] = this.f57962e.createByteArray();
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return bArr2;
    }

    public SparseArray<byte[]> createByteArraySparseArray(int i, SparseArray<byte[]> sparseArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        SparseArray<byte[]> sparseArray2 = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.f57962e.readInt(), this.f57962e.createByteArray());
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseArray2;
    }

    public char[] createCharArray(int i, char[] cArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return cArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        char[] createCharArray = this.f57962e.createCharArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createCharArray;
    }

    public double[] createDoubleArray(int i, double[] dArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return dArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        double[] createDoubleArray = this.f57962e.createDoubleArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createDoubleArray;
    }

    public ArrayList<Double> createDoubleList(int i, ArrayList<Double> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Double.valueOf(this.f57962e.readDouble()));
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return arrayList2;
    }

    public SparseArray<Double> createDoubleSparseArray(int i, SparseArray<Double> sparseArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        SparseArray<Double> sparseArray2 = new SparseArray<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.f57962e.readInt(), Double.valueOf(this.f57962e.readDouble()));
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseArray2;
    }

    public float[] createFloatArray(int i, float[] fArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return fArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        float[] createFloatArray = this.f57962e.createFloatArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createFloatArray;
    }

    public ArrayList<Float> createFloatList(int i, ArrayList<Float> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<Float> arrayList2 = new ArrayList<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Float.valueOf(this.f57962e.readFloat()));
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return arrayList2;
    }

    public SparseArray<Float> createFloatSparseArray(int i, SparseArray<Float> sparseArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        SparseArray<Float> sparseArray2 = new SparseArray<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.f57962e.readInt(), Float.valueOf(this.f57962e.readFloat()));
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseArray2;
    }

    public IBinder[] createIBinderArray(int i, IBinder[] iBinderArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return iBinderArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        IBinder[] createBinderArray = this.f57962e.createBinderArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createBinderArray;
    }

    public ArrayList<IBinder> createIBinderList(int i, ArrayList<IBinder> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<IBinder> createBinderArrayList = this.f57962e.createBinderArrayList();
        this.f57962e.setDataPosition(dataPosition + a);
        return createBinderArrayList;
    }

    public SparseArray<IBinder> createIBinderSparseArray(int i, SparseArray<IBinder> sparseArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        SparseArray<IBinder> sparseArray2 = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.f57962e.readInt(), this.f57962e.readStrongBinder());
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseArray2;
    }

    public int[] createIntArray(int i, int[] iArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return iArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int[] createIntArray = this.f57962e.createIntArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createIntArray;
    }

    public ArrayList<Integer> createIntegerList(int i, ArrayList<Integer> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Integer.valueOf(this.f57962e.readInt()));
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return arrayList2;
    }

    public long[] createLongArray(int i, long[] jArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return jArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        long[] createLongArray = this.f57962e.createLongArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createLongArray;
    }

    public ArrayList<Long> createLongList(int i, ArrayList<Long> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Long.valueOf(this.f57962e.readLong()));
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return arrayList2;
    }

    public Parcel createParcel(int i, Parcel parcel) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return parcel;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(this.f57962e, dataPosition, a);
        this.f57962e.setDataPosition(dataPosition + a);
        return obtain;
    }

    public Parcel[] createParcelArray(int i, Parcel[] parcelArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return parcelArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        Parcel[] parcelArr2 = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = this.f57962e.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = this.f57962e.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(this.f57962e, dataPosition2, readInt2);
                parcelArr2[i2] = obtain;
                this.f57962e.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr2[i2] = null;
            }
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return parcelArr2;
    }

    public ArrayList<Parcel> createParcelList(int i, ArrayList<Parcel> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        ArrayList<Parcel> arrayList2 = new ArrayList<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = this.f57962e.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = this.f57962e.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(this.f57962e, dataPosition2, readInt2);
                arrayList2.add(obtain);
                this.f57962e.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList2.add(null);
            }
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return arrayList2;
    }

    public SparseArray<Parcel> createParcelSparseArray(int i, SparseArray<Parcel> sparseArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        SparseArray<Parcel> sparseArray2 = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = this.f57962e.readInt();
            int readInt3 = this.f57962e.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = this.f57962e.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(this.f57962e, dataPosition2, readInt3);
                sparseArray2.append(readInt2, obtain);
                this.f57962e.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray2.append(readInt2, null);
            }
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseArray2;
    }

    public SparseBooleanArray createSparseBooleanArray(int i, SparseBooleanArray sparseBooleanArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseBooleanArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        SparseBooleanArray readSparseBooleanArray = this.f57962e.readSparseBooleanArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return readSparseBooleanArray;
    }

    public SparseIntArray createSparseIntArray(int i, SparseIntArray sparseIntArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseIntArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseIntArray2.append(this.f57962e.readInt(), this.f57962e.readInt());
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseIntArray2;
    }

    public SparseLongArray createSparseLongArray(int i, SparseLongArray sparseLongArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseLongArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        SparseLongArray sparseLongArray2 = new SparseLongArray();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseLongArray2.append(this.f57962e.readInt(), this.f57962e.readLong());
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseLongArray2;
    }

    public String createString(int i, String str) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return str;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        String readString = this.f57962e.readString();
        this.f57962e.setDataPosition(dataPosition + a);
        return readString;
    }

    public String[] createStringArray(int i, String[] strArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return strArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        String[] createStringArray = this.f57962e.createStringArray();
        this.f57962e.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    public ArrayList<String> createStringList(int i, ArrayList<String> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<String> createStringArrayList = this.f57962e.createStringArrayList();
        this.f57962e.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    public SparseArray<String> createStringSparseArray(int i, SparseArray<String> sparseArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        SparseArray<String> sparseArray2 = new SparseArray<>();
        int readInt = this.f57962e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.f57962e.readInt(), this.f57962e.readString());
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseArray2;
    }

    public <T> T[] createTypedArray(int i, Parcelable.Creator<T> creator, T[] tArr) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return tArr;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        T[] tArr2 = (T[]) this.f57962e.createTypedArray(creator);
        this.f57962e.setDataPosition(dataPosition + a);
        return tArr2;
    }

    public <T> ArrayList<T> createTypedList(int i, Parcelable.Creator<T> creator, ArrayList<T> arrayList) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        ArrayList<T> createTypedArrayList = this.f57962e.createTypedArrayList(creator);
        this.f57962e.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    public <T> SparseArray<T> createTypedSparseArray(int i, Parcelable.Creator<T> creator, SparseArray<T> sparseArray) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        int readInt = this.f57962e.readInt();
        SparseArray<T> sparseArray2 = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.f57962e.readInt(), this.f57962e.readInt() != 0 ? creator.createFromParcel(this.f57962e) : null);
        }
        this.f57962e.setDataPosition(dataPosition + a);
        return sparseArray2;
    }

    public boolean readBoolean(int i, boolean z) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return z;
        }
        m85258b(i, 4);
        return this.f57962e.readInt() != 0;
    }

    public Boolean readBooleanObject(int i, Boolean bool) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bool;
        }
        if (m85255a(i) == 0) {
            return null;
        }
        m85257a(i, 4);
        int readInt = this.f57962e.readInt();
        if (readInt == 0) {
            return Boolean.FALSE;
        }
        if (readInt != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public Bundle readBundle(int i, Bundle bundle) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return bundle;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        Bundle readBundle = this.f57962e.readBundle();
        this.f57962e.setDataPosition(dataPosition + a);
        return readBundle;
    }

    public byte readByte(int i, byte b) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return b;
        }
        m85258b(i, 4);
        return (byte) this.f57962e.readInt();
    }

    public char readChar(int i, char c) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return c;
        }
        m85258b(i, 4);
        return (char) this.f57962e.readInt();
    }

    public double readDouble(int i, double d) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return d;
        }
        m85258b(i, 8);
        return this.f57962e.readDouble();
    }

    public Double readDoubleObject(int i, Double d) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return d;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        m85257a(a, 8);
        return Double.valueOf(this.f57962e.readDouble());
    }

    public float readFloat(int i, float f) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return f;
        }
        m85258b(i, 4);
        return this.f57962e.readFloat();
    }

    public Float readFloatObject(int i, Float f) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return f;
        }
        if (m85255a(i) == 0) {
            return null;
        }
        m85257a(i, 4);
        return Float.valueOf(this.f57962e.readFloat());
    }

    public IBinder readIBinder(int i, IBinder iBinder) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return iBinder;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        IBinder readStrongBinder = this.f57962e.readStrongBinder();
        this.f57962e.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    public int readInt(int i, int i2) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return i2;
        }
        m85258b(i, 4);
        return this.f57962e.readInt();
    }

    public Integer readIntegerObject(int i, Integer num) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return num;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        m85257a(a, 4);
        return Integer.valueOf(this.f57962e.readInt());
    }

    public void readList(int i, List list, ClassLoader classLoader) {
        if (this.f57961d.containsKey(Integer.valueOf(i))) {
            int a = m85255a(i);
            int dataPosition = this.f57962e.dataPosition();
            if (a != 0) {
                this.f57962e.readList(list, classLoader);
                this.f57962e.setDataPosition(dataPosition + a);
            }
        }
    }

    public long readLong(int i, long j) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return j;
        }
        m85258b(i, 8);
        return this.f57962e.readLong();
    }

    public Long readLongObject(int i, Long l) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return l;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        m85257a(a, 8);
        return Long.valueOf(this.f57962e.readLong());
    }

    public <T extends Parcelable> T readParcelable(int i, Parcelable.Creator<T> creator, T t) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return t;
        }
        int a = m85255a(i);
        if (a == 0) {
            return null;
        }
        int dataPosition = this.f57962e.dataPosition();
        T createFromParcel = creator.createFromParcel(this.f57962e);
        this.f57962e.setDataPosition(dataPosition + a);
        return createFromParcel;
    }

    public short readShort(int i, short s) {
        if (!this.f57961d.containsKey(Integer.valueOf(i))) {
            return s;
        }
        m85258b(i, 4);
        return (short) this.f57962e.readInt();
    }
}
