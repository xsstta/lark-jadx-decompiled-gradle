package com.ss.android.lark.invitation.v2;

import com.ss.android.lark.pb.flow.TrySetUGEventStateResponse;
import com.ss.android.lark.sdk.SdkSender;

/* renamed from: com.ss.android.lark.invitation.v2.-$$Lambda$InvitationServiceApiImpl$2eeMisCavw65qcfL5SCJAFHvSJ4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$InvitationServiceApiImpl$2eeMisCavw65qcfL5SCJAFHvSJ4 implements SdkSender.IParser {
    public static final /* synthetic */ $$Lambda$InvitationServiceApiImpl$2eeMisCavw65qcfL5SCJAFHvSJ4 INSTANCE = new $$Lambda$InvitationServiceApiImpl$2eeMisCavw65qcfL5SCJAFHvSJ4();

    private /* synthetic */ $$Lambda$InvitationServiceApiImpl$2eeMisCavw65qcfL5SCJAFHvSJ4() {
    }

    @Override // com.ss.android.lark.sdk.SdkSender.IParser
    public final Object parse(byte[] bArr) {
        return TrySetUGEventStateResponse.ADAPTER.decode(bArr).msuccess;
    }
}
