package com.huawei.hms.common.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Objects {
    public Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static final class ToStringHelper {

        /* renamed from: a */
        public final List<String> f57956a;

        /* renamed from: b */
        public final Object f57957b;

        public final String toString() {
            String simpleName = this.f57957b.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(100);
            sb.append(simpleName);
            sb.append('{');
            int size = this.f57956a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f57956a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper(Object obj) {
            this.f57957b = Preconditions.checkNotNull(obj);
            this.f57956a = new ArrayList();
        }

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str2.length() + valueOf.length() + 1);
            sb.append(str2);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(valueOf);
            this.f57956a.add(sb.toString());
            return this;
        }
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
