package com.ss.android.lark.invitation.v2;

import com.ss.android.lark.pb.users.CheckContactIsLinkedToUserResponse;
import com.ss.android.lark.sdk.SdkSender;

/* renamed from: com.ss.android.lark.invitation.v2.-$$Lambda$InvitationServiceApiImpl$iYgo-U9-OII_Hxcs6RLnv7zlMNM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$InvitationServiceApiImpl$iYgoU9OII_Hxcs6RLnv7zlMNM implements SdkSender.IParser {
    public static final /* synthetic */ $$Lambda$InvitationServiceApiImpl$iYgoU9OII_Hxcs6RLnv7zlMNM INSTANCE = new $$Lambda$InvitationServiceApiImpl$iYgoU9OII_Hxcs6RLnv7zlMNM();

    private /* synthetic */ $$Lambda$InvitationServiceApiImpl$iYgoU9OII_Hxcs6RLnv7zlMNM() {
    }

    @Override // com.ss.android.lark.sdk.SdkSender.IParser
    public final Object parse(byte[] bArr) {
        return CheckContactIsLinkedToUserResponse.ADAPTER.decode(bArr).mcontact_is_linked_to_user;
    }
}
