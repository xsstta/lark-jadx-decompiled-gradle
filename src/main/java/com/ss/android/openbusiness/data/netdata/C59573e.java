package com.ss.android.openbusiness.data.netdata;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.openbusiness.data.netdata.C59569a;

/* renamed from: com.ss.android.openbusiness.data.netdata.e */
public class C59573e<D extends C59569a> {
    @SerializedName("code")
    @Expose

    /* renamed from: a */
    private Integer f147873a;
    @SerializedName("msg")
    @Expose

    /* renamed from: b */
    private String f147874b;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    @Expose

    /* renamed from: c */
    private D f147875c;

    /* renamed from: a */
    public Integer mo202980a() {
        return this.f147873a;
    }

    /* renamed from: b */
    public String mo202981b() {
        return this.f147874b;
    }

    /* renamed from: c */
    public D mo202982c() {
        return this.f147875c;
    }
}
