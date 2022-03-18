package com.ss.android.lark.profile.v2.entity;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/PhoneNumberField;", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "Ljava/io/Serializable;", "()V", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "isPlain", "", "()Z", "setPlain", "(Z)V", "number", "getNumber", "setNumber", "rateLimited", "getRateLimited", "setRateLimited", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PhoneNumberField extends BaseField implements Serializable {
    private String countryCode;
    private boolean isPlain;
    private String number;
    private boolean rateLimited;

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getNumber() {
        return this.number;
    }

    public final boolean getRateLimited() {
        return this.rateLimited;
    }

    public final boolean isPlain() {
        return this.isPlain;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final void setPlain(boolean z) {
        this.isPlain = z;
    }

    public final void setRateLimited(boolean z) {
        this.rateLimited = z;
    }
}
