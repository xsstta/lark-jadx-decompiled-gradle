package com.ss.android.appcenter.business.net.dto;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton;

/* renamed from: com.ss.android.appcenter.business.net.dto.a */
public class C27737a {
    @SerializedName("itemId")

    /* renamed from: a */
    private String f69312a;
    @SerializedName("iconKey")

    /* renamed from: b */
    private String f69313b;
    @SerializedName("name")

    /* renamed from: c */
    private String f69314c;
    @SerializedName("desc")

    /* renamed from: d */
    private String f69315d;
    @SerializedName("applinkStoreUrl")

    /* renamed from: e */
    private String f69316e;
    @SerializedName("itemAbility")

    /* renamed from: f */
    private int f69317f;

    /* renamed from: g */
    private boolean f69318g;

    /* renamed from: h */
    private ActionButton.ActionType f69319h;

    /* renamed from: a */
    public String mo98961a() {
        return this.f69312a;
    }

    /* renamed from: b */
    public String mo98964b() {
        return this.f69313b;
    }

    /* renamed from: c */
    public String mo98965c() {
        return this.f69314c;
    }

    /* renamed from: d */
    public String mo98966d() {
        return this.f69315d;
    }

    /* renamed from: e */
    public String mo98967e() {
        return this.f69316e;
    }

    /* renamed from: f */
    public boolean mo98968f() {
        return this.f69318g;
    }

    /* renamed from: h */
    public ActionButton.ActionType mo98970h() {
        return this.f69319h;
    }

    /* renamed from: i */
    public boolean mo98971i() {
        if (this.f69317f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo98969g() {
        ActionButton.ActionType actionType = this.f69319h;
        if (actionType == null || !actionType.showLoading()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "SearchItemInfo{" + "mItemId='" + this.f69312a + '\'' + ", mIconKey='" + this.f69313b + '\'' + ", mName='" + this.f69314c + '\'' + ", mDesc='" + this.f69315d + '\'' + ", mAppLinkStoreUrl='" + this.f69316e + '\'' + ", itemAbility=" + this.f69317f + ", isAvailable=" + this.f69318g + '}';
    }

    /* renamed from: a */
    public void mo98962a(ActionButton.ActionType actionType) {
        this.f69319h = actionType;
    }

    /* renamed from: a */
    public void mo98963a(boolean z) {
        this.f69318g = z;
    }
}
