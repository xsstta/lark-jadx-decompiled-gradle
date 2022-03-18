package com.ss.android.openbusiness.bot.net.data;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.ss.android.openbusiness.bot.net.data.a */
public class C59537a {
    @SerializedName("code")
    @Expose

    /* renamed from: a */
    private Integer f147794a;
    @SerializedName("message")
    @Expose

    /* renamed from: b */
    private String f147795b;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    @Expose

    /* renamed from: c */
    private C59538b f147796c;

    /* renamed from: a */
    public Integer mo202919a() {
        return this.f147794a;
    }

    /* renamed from: b */
    public String mo202920b() {
        return this.f147795b;
    }

    /* renamed from: c */
    public C59538b mo202921c() {
        return this.f147796c;
    }
}
