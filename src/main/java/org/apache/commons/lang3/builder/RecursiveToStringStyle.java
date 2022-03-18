package org.apache.commons.lang3.builder;

import java.util.Collection;
import org.apache.commons.lang3.ClassUtils;

public class RecursiveToStringStyle extends ToStringStyle {
    private static final long serialVersionUID = 1;

    /* access modifiers changed from: protected */
    public boolean accept(Class<?> cls) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, Collection<?> collection) {
        appendClassName(stringBuffer, collection);
        appendIdentityHashCode(stringBuffer, collection);
        appendDetail(stringBuffer, str, collection.toArray());
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
        if (ClassUtils.m268048b(obj.getClass()) || String.class.equals(obj.getClass()) || !accept(obj.getClass())) {
            super.appendDetail(stringBuffer, str, obj);
        } else {
            stringBuffer.append(C69867b.m268133a(obj, this));
        }
    }
}
