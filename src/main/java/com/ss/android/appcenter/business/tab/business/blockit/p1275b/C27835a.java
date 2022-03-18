package com.ss.android.appcenter.business.tab.business.blockit.p1275b;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27923c;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.blockit.b.a */
public class C27835a {
    @SerializedName("needHeader")

    /* renamed from: a */
    public boolean f69572a;
    @SerializedName("title")

    /* renamed from: b */
    public JsonObject f69573b;
    @SerializedName("titleIconUrl")

    /* renamed from: c */
    public String f69574c;
    @SerializedName("mobileHeaderLink")

    /* renamed from: d */
    public String f69575d;
    @SerializedName("consoleEnable")

    /* renamed from: e */
    public boolean f69576e;
    @SerializedName("menuItems")

    /* renamed from: f */
    public List<C27923c> f69577f;

    public String toString() {
        return String.format("BlockitConfigEntity{needHeader=%s, title=%s, titleIconUrl='%s', schema='%s', consoleEnable=%s, menuItems=%s}", Boolean.valueOf(this.f69572a), this.f69573b, this.f69574c, this.f69575d, Boolean.valueOf(this.f69576e), this.f69577f);
    }
}
