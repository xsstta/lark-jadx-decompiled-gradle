package com.huawei.hms.common.util;

import com.huawei.hms.common.Preconditions;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Objects {
    public Objects() {
        throw new AssertionError("illegal argument");
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj, null);
    }

    public static final class ToStringHelper {

        /* renamed from: a */
        public final List<String> f57976a = new ArrayList();

        /* renamed from: b */
        public final Object f57977b;

        public ToStringHelper(Object obj) {
            this.f57977b = Preconditions.checkNotNull(obj);
        }

        public final ToStringHelper add(String str, Object obj) {
            String valueOf = String.valueOf(obj);
            List<String> list = this.f57976a;
            list.add(((String) Preconditions.checkNotNull(str)) + ContainerUtils.KEY_VALUE_DELIMITER + valueOf);
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f57977b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f57976a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f57976a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public /* synthetic */ ToStringHelper(Object obj, C23521a aVar) {
            this.f57977b = Preconditions.checkNotNull(obj);
        }
    }
}
