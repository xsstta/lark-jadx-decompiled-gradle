package com.bytedance.ee.bear.bitable.card.model.jsmodel.common;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/CommonActionType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "COLOR_LIST", "GET_NEW_OPTION_ID", "GET_RANDOM_COLOR", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum CommonActionType {
    COLOR_LIST("ColorList"),
    GET_NEW_OPTION_ID("getNewOptionId"),
    GET_RANDOM_COLOR("getRandomColor");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }

    private CommonActionType(String str) {
        this.value = str;
    }
}
