package com.ss.android.lark.money.config;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@AppConfig(key = "money_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/money/config/MoneyConfig;", "", "walletLynxUrl", "", "(Ljava/lang/String;)V", "getWalletLynxUrl", "()Ljava/lang/String;", "setWalletLynxUrl", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MoneyConfig {
    @SerializedName("wallet_lynx_url")

    /* renamed from: a */
    private String f120926a;

    public MoneyConfig() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MoneyConfig) && Intrinsics.areEqual(this.f120926a, ((MoneyConfig) obj).f120926a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f120926a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MoneyConfig(walletLynxUrl=" + this.f120926a + ")";
    }

    public MoneyConfig(String str) {
        Intrinsics.checkParameterIsNotNull(str, "walletLynxUrl");
        this.f120926a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
