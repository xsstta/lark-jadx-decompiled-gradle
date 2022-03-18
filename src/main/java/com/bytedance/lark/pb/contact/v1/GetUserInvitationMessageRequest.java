package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserInvitationMessageRequest extends Message<GetUserInvitationMessageRequest, C16276a> {
    public static final ProtoAdapter<GetUserInvitationMessageRequest> ADAPTER = new C16277b();
    public static final InvitationPlatformType DEFAULT_INVITATION_PLATFORM = InvitationPlatformType.PlatformIPhone;
    private static final long serialVersionUID = 0;
    public final InvitationPlatformType invitation_platform;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserInvitationMessageRequest$b */
    private static final class C16277b extends ProtoAdapter<GetUserInvitationMessageRequest> {
        C16277b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserInvitationMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserInvitationMessageRequest getUserInvitationMessageRequest) {
            return InvitationPlatformType.ADAPTER.encodedSizeWithTag(3, getUserInvitationMessageRequest.invitation_platform) + getUserInvitationMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserInvitationMessageRequest decode(ProtoReader protoReader) throws IOException {
            C16276a aVar = new C16276a();
            aVar.f42472a = InvitationPlatformType.PlatformIPhone;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42472a = InvitationPlatformType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserInvitationMessageRequest getUserInvitationMessageRequest) throws IOException {
            InvitationPlatformType.ADAPTER.encodeWithTag(protoWriter, 3, getUserInvitationMessageRequest.invitation_platform);
            protoWriter.writeBytes(getUserInvitationMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserInvitationMessageRequest$a */
    public static final class C16276a extends Message.Builder<GetUserInvitationMessageRequest, C16276a> {

        /* renamed from: a */
        public InvitationPlatformType f42472a;

        /* renamed from: a */
        public GetUserInvitationMessageRequest build() {
            InvitationPlatformType invitationPlatformType = this.f42472a;
            if (invitationPlatformType != null) {
                return new GetUserInvitationMessageRequest(invitationPlatformType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(invitationPlatformType, "invitation_platform");
        }
    }

    @Override // com.squareup.wire.Message
    public C16276a newBuilder() {
        C16276a aVar = new C16276a();
        aVar.f42472a = this.invitation_platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserInvitationMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", invitation_platform=");
        sb.append(this.invitation_platform);
        StringBuilder replace = sb.replace(0, 2, "GetUserInvitationMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserInvitationMessageRequest(InvitationPlatformType invitationPlatformType) {
        this(invitationPlatformType, ByteString.EMPTY);
    }

    public GetUserInvitationMessageRequest(InvitationPlatformType invitationPlatformType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invitation_platform = invitationPlatformType;
    }
}
