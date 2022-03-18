package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private static final Builder builder = new DataHolderBuilderCreator(new String[0], null);
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.mClosed) {
            for (CursorWindow cursorWindow : this.cursorWindows) {
                cursorWindow.close();
            }
            this.mClosed = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.columns;
            if (i2 >= strArr.length) {
                break;
            }
            this.columnsBundle.putInt(strArr[i2], i2);
            i2++;
        }
        this.perCursorCounts = new int[this.cursorWindows.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.cursorWindows;
            if (i < cursorWindowArr.length) {
                this.perCursorCounts[i] = i3;
                i3 = cursorWindowArr[i].getStartPosition() + this.cursorWindows[i].getNumRows();
                i++;
            } else {
                this.dataCount = i3;
                return;
            }
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    public static class Builder {
        public String[] builderColumns;
        public final ArrayList<HashMap<String, Object>> dataCollectionList;
        private final String type;
        private final HashMap<Object, Integer> typeAndDataCollectionCountMapping;

        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null);
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(hashMap);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.huawei.hms.common.data.DataHolder.Builder setDataForContentValuesHashMap(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "contentValuesHashMap cannot be null"
                com.huawei.hms.common.internal.Preconditions.checkNotNull(r5, r0)
                java.lang.String r0 = r4.type
                r1 = 0
                if (r0 == 0) goto L_0x0031
                java.lang.Object r0 = r5.get(r0)
                if (r0 == 0) goto L_0x0031
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.typeAndDataCollectionCountMapping
                java.lang.Object r2 = r2.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 == 0) goto L_0x0022
                int r1 = r2.intValue()
                r0 = 1
                r0 = r1
                r1 = 1
                goto L_0x0032
            L_0x0022:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.typeAndDataCollectionCountMapping
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r4.dataCollectionList
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r0, r3)
            L_0x0031:
                r0 = 0
            L_0x0032:
                if (r1 == 0) goto L_0x003f
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.dataCollectionList
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.dataCollectionList
                r1.add(r0, r5)
                goto L_0x0044
            L_0x003f:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r4.dataCollectionList
                r0.add(r5)
            L_0x0044:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.data.DataHolder.Builder.setDataForContentValuesHashMap(java.util.HashMap):com.huawei.hms.common.data.DataHolder$Builder");
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.builderColumns = strArr;
            this.dataCollectionList = new ArrayList<>();
            this.type = str;
            this.typeAndDataCollectionCountMapping = new HashMap<>();
        }

        Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(builder, i, (Bundle) null);
    }

    public final int getWindowIndex(int i) {
        boolean z;
        int[] iArr;
        int i2 = 0;
        if (i >= 0 || i < this.dataCount) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "rowIndex is out of index:" + i);
        while (true) {
            iArr = this.perCursorCounts;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == iArr.length) {
            return i2 - 1;
        }
        return i2;
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, i, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            HMSLog.m86964e(TAG, "fail to getCursorWindows: " + th.getMessage());
            return new CursorWindow[0];
        } finally {
            hMSCursorWrapper.close();
        }
    }

    private static CursorWindow[] getCursorWindows(Builder builder2, int i) {
        if (builder2.builderColumns.length == 0) {
            return new CursorWindow[0];
        }
        if (i < 0 || i >= builder2.dataCollectionList.size()) {
            i = builder2.dataCollectionList.size();
        }
        ArrayList<CursorWindow> iterCursorWindow = iterCursorWindow(builder2, i, builder2.dataCollectionList.subList(0, i));
        return (CursorWindow[]) iterCursorWindow.toArray(new CursorWindow[iterCursorWindow.size()]);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    private void checkAvailable(String str, int i) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle == null || !bundle.containsKey(str)) {
            str2 = "cannot find column: " + str;
        } else if (isClosed()) {
            str2 = "buffer has been closed";
        } else if (i < 0 || i >= this.dataCount) {
            str2 = "row is out of index:" + i;
        } else {
            str2 = "";
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i, bundle);
    }

    public final boolean hasNull(String str, int i, int i2) {
        checkAvailable(str, i);
        if (this.cursorWindows[i2].getType(i, this.columnsBundle.getInt(str)) == 0) {
            return true;
        }
        return false;
    }

    private DataHolder(Builder builder2, int i, Bundle bundle) {
        this(builder2.builderColumns, getCursorWindows(builder2, -1), i, (Bundle) null);
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i, int i2) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i < i2 && hMSCursorWrapper.moveToPosition(i)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i);
                hMSCursorWrapper.fillWindow(i, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i, bundle);
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder2, int i, List list) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow = new CursorWindow((String) null);
        cursorWindow.setNumColumns(builder2.builderColumns.length);
        arrayList.add(cursorWindow);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            try {
                if (!cursorWindow.allocRow()) {
                    HMSLog.m86961d(TAG, "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder2.builderColumns.length);
                    if (!cursorWindow.allocRow()) {
                        HMSLog.m86964e(TAG, "Failed to retry to allocate a row");
                        return arrayList;
                    }
                    arrayList.add(cursorWindow);
                }
                HashMap hashMap = (HashMap) list.get(i2);
                boolean z = true;
                int i3 = 0;
                while (i3 < builder2.builderColumns.length && (z = putValue(cursorWindow, hashMap.get(builder2.builderColumns[i3]), i2, i3))) {
                    i3++;
                }
                if (!z) {
                    HMSLog.m86961d(TAG, "fail to put data for row " + i2);
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow2 = new CursorWindow((String) null);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(builder2.builderColumns.length);
                    arrayList.add(cursorWindow2);
                    break;
                }
                i2++;
            } catch (RuntimeException e) {
                Iterator<CursorWindow> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                throw e;
            }
        }
        return arrayList;
    }

    public final void copyToBuffer(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i);
        this.cursorWindows[i2].copyStringToBuffer(i, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    private DataHolder(Builder builder2, int i, Bundle bundle, int i2) {
        this(builder2.builderColumns, getCursorWindows(builder2, -1), i, bundle);
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i, int i2) throws IllegalArgumentException {
        long j;
        if (obj == null) {
            return cursorWindow.putNull(i, i2);
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            return cursorWindow.putLong(j, i, i2);
        } else if (obj instanceof Integer) {
            return cursorWindow.putLong((long) ((Integer) obj).intValue(), i, i2);
        } else {
            if (obj instanceof Long) {
                return cursorWindow.putLong(((Long) obj).longValue(), i, i2);
            }
            if (obj instanceof Float) {
                return cursorWindow.putDouble((double) ((Float) obj).floatValue(), i, i2);
            }
            if (obj instanceof Double) {
                return cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
            }
            if (obj instanceof String) {
                return cursorWindow.putString((String) obj, i, i2);
            }
            if (obj instanceof byte[]) {
                return cursorWindow.putBlob((byte[]) obj, i, i2);
            }
            throw new IllegalArgumentException("unsupported type for column: " + obj);
        }
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(strArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public final Object getValue(String str, int i, int i2, String str2) {
        str2.hashCode();
        boolean z = true;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1092271849:
                if (str2.equals(TYPE_FLOAT)) {
                    c = 0;
                    break;
                }
                break;
            case -870070237:
                if (str2.equals(TYPE_BOOLEAN)) {
                    c = 1;
                    break;
                }
                break;
            case -675993238:
                if (str2.equals(TYPE_INT)) {
                    c = 2;
                    break;
                }
                break;
            case 445002870:
                if (str2.equals(TYPE_DOUBLE)) {
                    c = 3;
                    break;
                }
                break;
            case 519136353:
                if (str2.equals(TYPE_LONG)) {
                    c = 4;
                    break;
                }
                break;
            case 878975158:
                if (str2.equals(TYPE_STRING)) {
                    c = 5;
                    break;
                }
                break;
            case 1300508295:
                if (str2.equals(TYPE_BYTE_ARRAY)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                checkAvailable(str, i);
                return Float.valueOf(this.cursorWindows[i2].getFloat(i, this.columnsBundle.getInt(str)));
            case 1:
                checkAvailable(str, i);
                if (this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)) != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                checkAvailable(str, i);
                return Integer.valueOf(this.cursorWindows[i2].getInt(i, this.columnsBundle.getInt(str)));
            case 3:
                checkAvailable(str, i);
                return Double.valueOf(this.cursorWindows[i2].getDouble(i, this.columnsBundle.getInt(str)));
            case 4:
                checkAvailable(str, i);
                return Long.valueOf(this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)));
            case 5:
                checkAvailable(str, i);
                return this.cursorWindows[i2].getString(i, this.columnsBundle.getInt(str));
            case 6:
                checkAvailable(str, i);
                return this.cursorWindows[i2].getBlob(i, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i2;
        this.metadata = bundle;
        collectColumsAndCount();
    }
}
