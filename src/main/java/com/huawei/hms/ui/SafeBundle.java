package com.huawei.hms.ui;

import android.os.Bundle;
import com.huawei.hms.base.ui.C23508a;

public class SafeBundle {

    /* renamed from: a */
    public final Bundle f58933a;

    public Bundle getBundle() {
        return this.f58933a;
    }

    public String toString() {
        return this.f58933a.toString();
    }

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean isEmpty() {
        try {
            return this.f58933a.isEmpty();
        } catch (Exception unused) {
            C23508a.m85252a("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.f58933a.size();
        } catch (Exception unused) {
            C23508a.m85252a("SafeBundle", "size exception");
            return 0;
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public boolean containsKey(String str) {
        try {
            return this.f58933a.containsKey(str);
        } catch (Exception unused) {
            C23508a.m85252a("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public SafeBundle(Bundle bundle) {
        this.f58933a = bundle == null ? new Bundle() : bundle;
    }

    public Object get(String str) {
        try {
            return this.f58933a.get(str);
        } catch (Exception e) {
            C23508a.m85253a("SafeBundle", "get exception: " + e.getMessage(), true);
            return null;
        }
    }

    public String getString(String str) {
        try {
            return this.f58933a.getString(str);
        } catch (Exception e) {
            C23508a.m85253a("SafeBundle", "getString exception: " + e.getMessage(), true);
            return "";
        }
    }

    public int getInt(String str, int i) {
        try {
            return this.f58933a.getInt(str, i);
        } catch (Exception e) {
            C23508a.m85253a("SafeBundle", "getInt exception: " + e.getMessage(), true);
            return i;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f58933a.getString(str, str2);
        } catch (Exception e) {
            C23508a.m85253a("SafeBundle", "getString exception: " + e.getMessage(), true);
            return str2;
        }
    }
}
