package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

public class UpdateBean implements Serializable {

    /* renamed from: a */
    public boolean f58942a;

    /* renamed from: b */
    public String f58943b;

    /* renamed from: c */
    public int f58944c;

    /* renamed from: d */
    public String f58945d;

    /* renamed from: e */
    public String f58946e;

    /* renamed from: f */
    public ArrayList f58947f;

    /* renamed from: g */
    public boolean f58948g = true;

    /* renamed from: a */
    public static <T> T m86981a(T t) {
        return t;
    }

    /* renamed from: a */
    public String mo85484a() {
        return (String) m86981a(this.f58945d);
    }

    /* renamed from: b */
    public String mo85485b() {
        return (String) m86981a(this.f58943b);
    }

    public String getClientAppName() {
        return (String) m86981a(this.f58946e);
    }

    public ArrayList getTypeList() {
        return (ArrayList) m86981a(this.f58947f);
    }

    /* renamed from: c */
    public int mo85486c() {
        return ((Integer) m86981a(Integer.valueOf(this.f58944c))).intValue();
    }

    /* renamed from: d */
    public boolean mo85487d() {
        return ((Boolean) m86981a(Boolean.valueOf(this.f58942a))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) m86981a(Boolean.valueOf(this.f58948g))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f58945d = str;
    }

    public void setClientAppName(String str) {
        this.f58946e = str;
    }

    public void setClientPackageName(String str) {
        this.f58943b = str;
    }

    public void setClientVersionCode(int i) {
        this.f58944c = i;
    }

    public void setHmsOrApkUpgrade(boolean z) {
        this.f58942a = z;
    }

    public void setNeedConfirm(boolean z) {
        this.f58948g = z;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f58947f = arrayList;
    }
}
