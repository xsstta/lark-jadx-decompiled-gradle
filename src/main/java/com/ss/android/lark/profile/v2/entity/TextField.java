package com.ss.android.lark.profile.v2.entity;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/TextField;", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "Ljava/io/Serializable;", "()V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textStyle", "Lcom/ss/android/lark/profile/v2/entity/TextStyle;", "getTextStyle", "()Lcom/ss/android/lark/profile/v2/entity/TextStyle;", "setTextStyle", "(Lcom/ss/android/lark/profile/v2/entity/TextStyle;)V", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TextField extends BaseField implements Serializable {
    private String text;
    private TextStyle textStyle;

    public final String getText() {
        return this.text;
    }

    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextStyle(TextStyle aVar) {
        this.textStyle = aVar;
    }
}
