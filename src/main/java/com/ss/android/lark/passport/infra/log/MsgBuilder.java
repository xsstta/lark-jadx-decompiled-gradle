package com.ss.android.lark.passport.infra.log;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/MsgBuilder;", "", "()V", "msg", "", "(Ljava/lang/String;)V", "mErrorCode", "", "getMErrorCode", "()I", "setMErrorCode", "(I)V", "mErrorMsg", "getMErrorMsg", "()Ljava/lang/String;", "setMErrorMsg", "mMsg", "getMMsg", "setMMsg", "build", "setErrorCode", "errorCode", "setErrorMsg", "errorMsg", "setMsg", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.log.c */
public final class MsgBuilder {

    /* renamed from: a */
    private String f123374a;

    /* renamed from: b */
    private int f123375b = Integer.MIN_VALUE;

    /* renamed from: c */
    private String f123376c;

    public MsgBuilder() {
    }

    /* renamed from: a */
    public final String mo171485a() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f123374a)) {
            sb.append("msg = ");
            sb.append(this.f123374a);
        }
        if (this.f123375b != Integer.MIN_VALUE) {
            sb.append(", error code = ");
            sb.append(this.f123375b);
        }
        if (!TextUtils.isEmpty(this.f123376c)) {
            sb.append(", error msg = ");
            sb.append(this.f123376c);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final MsgBuilder mo171483a(int i) {
        this.f123375b = i;
        return this;
    }

    /* renamed from: b */
    public final MsgBuilder mo171486b(String str) {
        this.f123376c = str;
        return this;
    }

    /* renamed from: a */
    public final MsgBuilder mo171484a(String str) {
        this.f123374a = str;
        return this;
    }

    public MsgBuilder(String str) {
        this.f123374a = str;
    }
}
