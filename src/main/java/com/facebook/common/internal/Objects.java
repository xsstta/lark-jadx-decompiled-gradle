package com.facebook.common.internal;

import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

public final class Objects {

    public static final class ToStringHelper {
        private final String className;
        private C21023a holderHead;
        private C21023a holderTail;
        private boolean omitNullValues;

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.facebook.common.internal.Objects$ToStringHelper$a */
        public static final class C21023a {
            @Nullable

            /* renamed from: a */
            String f51411a;
            @Nullable

            /* renamed from: b */
            Object f51412b;

            /* renamed from: c */
            C21023a f51413c;

            private C21023a() {
            }
        }

        private C21023a addHolder() {
            C21023a aVar = new C21023a();
            this.holderTail.f51413c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (C21023a aVar = this.holderHead.f51413c; aVar != null; aVar = aVar.f51413c) {
                if (!z || aVar.f51412b != null) {
                    sb.append(str);
                    if (aVar.f51411a != null) {
                        sb.append(aVar.f51411a);
                        sb.append('=');
                    }
                    sb.append(aVar.f51412b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper addHolder(@Nullable Object obj) {
            addHolder().f51412b = obj;
            return this;
        }

        public ToStringHelper addValue(@Nullable Object obj) {
            return addHolder(obj);
        }

        public ToStringHelper addValue(char c) {
            return addHolder(String.valueOf(c));
        }

        private ToStringHelper(String str) {
            C21023a aVar = new C21023a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        public ToStringHelper addValue(double d) {
            return addHolder(String.valueOf(d));
        }

        public ToStringHelper addValue(float f) {
            return addHolder(String.valueOf(f));
        }

        public ToStringHelper addValue(int i) {
            return addHolder(String.valueOf(i));
        }

        public ToStringHelper addValue(long j) {
            return addHolder(String.valueOf(j));
        }

        public ToStringHelper addValue(boolean z) {
            return addHolder(String.valueOf(z));
        }

        public ToStringHelper add(String str, @Nullable Object obj) {
            return addHolder(str, obj);
        }

        public ToStringHelper add(String str, char c) {
            return addHolder(str, String.valueOf(c));
        }

        private ToStringHelper addHolder(String str, @Nullable Object obj) {
            C21023a addHolder = addHolder();
            addHolder.f51412b = obj;
            addHolder.f51411a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, double d) {
            return addHolder(str, String.valueOf(d));
        }

        public ToStringHelper add(String str, float f) {
            return addHolder(str, String.valueOf(f));
        }

        public ToStringHelper add(String str, int i) {
            return addHolder(str, String.valueOf(i));
        }

        public ToStringHelper add(String str, long j) {
            return addHolder(str, String.valueOf(j));
        }

        public ToStringHelper add(String str, boolean z) {
            return addHolder(str, String.valueOf(z));
        }
    }

    private Objects() {
    }

    public static int hashCode(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(simpleName(cls));
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(simpleName(obj.getClass()));
    }

    private static String simpleName(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    public static <T> T firstNonNull(@Nullable T t, @Nullable T t2) {
        return t != null ? t : (T) Preconditions.checkNotNull(t2);
    }

    @CheckReturnValue
    public static boolean equal(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
