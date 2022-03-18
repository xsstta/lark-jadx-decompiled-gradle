package com.bytedance.ee.bear.doc.cover;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\nX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CurrentCoverData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", ShareHitPoint.f121869d, "", "type$annotations", "getType", "()I", "setType", "(I)V", "isExistCover", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CurrentCoverData implements NonProguard {
    private String token;
    private int type;

    public static /* synthetic */ void type$annotations() {
    }

    public final String getToken() {
        return this.token;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isExistCover() {
        int i = this.type;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
