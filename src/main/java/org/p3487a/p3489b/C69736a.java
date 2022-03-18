package org.p3487a.p3489b;

import com.huawei.hms.framework.common.ContainerUtils;
import org.p3487a.p3488a.AbstractC69733d;
import org.p3487a.p3488a.C69728a;

/* renamed from: org.a.b.a */
public class C69736a extends C69728a implements AbstractC69733d {

    /* renamed from: a */
    private final String f174186a;

    /* renamed from: d */
    public String mo244652d() {
        return this.f174186a;
    }

    @Override // org.p3487a.p3488a.C69728a
    public String toString() {
        return super.toString() + ContainerUtils.KEY_VALUE_DELIMITER + this.f174186a;
    }

    public C69736a(int i, int i2, String str) {
        super(i, i2);
        this.f174186a = str;
    }
}
