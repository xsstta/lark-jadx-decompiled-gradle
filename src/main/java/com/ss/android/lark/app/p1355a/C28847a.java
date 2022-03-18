package com.ss.android.lark.app.p1355a;

import android.graphics.Typeface;
import android.os.Build;
import android.util.LongSparseArray;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.app.a.a */
public class C28847a {

    /* renamed from: a */
    public static String f72464a = "LayoutInflaterBugFix";

    /* renamed from: com.ss.android.lark.app.a.a$a */
    private static class C28848a<T> extends LongSparseArray<T> {

        /* renamed from: a */
        private LongSparseArray<T> f72465a;

        @Override // java.lang.Object, android.util.LongSparseArray, android.util.LongSparseArray
        public LongSparseArray<T> clone() {
            return this.f72465a.clone();
        }

        public int size() {
            return this.f72465a.size();
        }

        public String toString() {
            return this.f72465a.toString();
        }

        public void clear() {
            this.f72465a.clear();
            String str = C28847a.f72464a;
            Log.m165387e(str, (Throwable) new Exception("SafeLongSparseArray clear:" + Arrays.toString(Thread.currentThread().getStackTrace())), true);
        }

        public C28848a(LongSparseArray longSparseArray) {
            this.f72465a = longSparseArray;
        }

        public long keyAt(int i) {
            return this.f72465a.keyAt(i);
        }

        @Override // android.util.LongSparseArray
        public T valueAt(int i) {
            return this.f72465a.valueAt(i);
        }

        @Override // android.util.LongSparseArray
        public T get(long j) {
            T t;
            synchronized (this) {
                t = this.f72465a.get(j);
            }
            return t;
        }

        public int indexOfKey(long j) {
            int indexOfKey;
            synchronized (this) {
                indexOfKey = this.f72465a.indexOfKey(j);
            }
            return indexOfKey;
        }

        @Override // android.util.LongSparseArray
        public int indexOfValue(T t) {
            int indexOfValue;
            synchronized (this) {
                indexOfValue = this.f72465a.indexOfValue(t);
            }
            return indexOfValue;
        }

        public void delete(long j) {
            synchronized (this) {
                this.f72465a.delete(j);
                String str = C28847a.f72464a;
                Log.m165387e(str, (Throwable) new Exception("SafeLongSparseArray delete:" + Arrays.toString(Thread.currentThread().getStackTrace())), true);
            }
        }

        public void remove(long j) {
            synchronized (this) {
                this.f72465a.remove(j);
                String str = C28847a.f72464a;
                Log.m165387e(str, (Throwable) new Exception("SafeLongSparseArray remove:" + Arrays.toString(Thread.currentThread().getStackTrace())), true);
            }
        }

        public void removeAt(int i) {
            synchronized (this) {
                this.f72465a.removeAt(i);
                String str = C28847a.f72464a;
                Log.m165387e(str, (Throwable) new Exception("SafeLongSparseArray removeAt:" + Arrays.toString(Thread.currentThread().getStackTrace())), true);
            }
        }

        @Override // android.util.LongSparseArray
        public void append(long j, T t) {
            this.f72465a.append(j, t);
        }

        @Override // android.util.LongSparseArray
        public void setValueAt(int i, T t) {
            this.f72465a.setValueAt(i, t);
        }

        @Override // android.util.LongSparseArray
        public void put(long j, T t) {
            synchronized (this) {
                this.f72465a.put(j, t);
            }
        }

        @Override // android.util.LongSparseArray
        public T get(long j, T t) {
            T t2;
            synchronized (this) {
                t2 = this.f72465a.get(j, t);
            }
            return t2;
        }
    }

    /* renamed from: a */
    public static void m105677a() {
        if (Build.VERSION.SDK_INT <= 27) {
            try {
                Log.m165389i(f72464a, "replace Typeface sTypefaceCache");
                Field declaredField = Typeface.class.getDeclaredField("sTypefaceCache");
                declaredField.setAccessible(true);
                declaredField.set(null, new C28848a((LongSparseArray) declaredField.get(null)));
            } catch (Throwable th) {
                Log.m165386e(f72464a, th);
            }
        }
    }
}
