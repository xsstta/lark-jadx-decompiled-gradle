package com.ss.android.lark.openplatform.openapp;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/openplatform/openapp/ID_TYPE;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;II)V", "getType", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CHAT_ID", "BOT_ID", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum ID_TYPE {
    UNKNOWN(0),
    CHAT_ID(1),
    BOT_ID(2);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    private ID_TYPE(int i) {
        this.type = i;
    }
}
