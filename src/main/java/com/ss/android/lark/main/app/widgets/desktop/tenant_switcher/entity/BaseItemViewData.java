package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class BaseItemViewData {

    @Retention(RetentionPolicy.SOURCE)
    public @interface tenantItemType {
    }

    /* renamed from: a */
    public abstract int mo157906a();

    /* renamed from: b */
    public abstract long mo157908b();

    /* renamed from: a */
    public boolean mo157907a(Object obj) {
        return equals(obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BaseItemViewData)) {
            return false;
        }
        if (this == obj || mo157908b() == ((BaseItemViewData) obj).mo157908b()) {
            return true;
        }
        return false;
    }
}
