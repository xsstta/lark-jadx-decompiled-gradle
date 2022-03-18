package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendUserInvitationResponse extends Message<SendUserInvitationResponse, C16378a> {
    public static final ProtoAdapter<SendUserInvitationResponse> ADAPTER = new C16379b();
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final GetUserProfileResponse profile;
    public final Boolean success;
    public final UserBriefInfo user;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse$b */
    private static final class C16379b extends ProtoAdapter<SendUserInvitationResponse> {
        C16379b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendUserInvitationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendUserInvitationResponse sendUserInvitationResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (sendUserInvitationResponse.success != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, sendUserInvitationResponse.success);
            } else {
                i = 0;
            }
            if (sendUserInvitationResponse.user != null) {
                i2 = UserBriefInfo.ADAPTER.encodedSizeWithTag(2, sendUserInvitationResponse.user);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (sendUserInvitationResponse.profile != null) {
                i3 = GetUserProfileResponse.ADAPTER.encodedSizeWithTag(3, sendUserInvitationResponse.profile);
            }
            return i4 + i3 + sendUserInvitationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendUserInvitationResponse decode(ProtoReader protoReader) throws IOException {
            C16378a aVar = new C16378a();
            aVar.f42635a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42635a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42636b = UserBriefInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42637c = GetUserProfileResponse.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendUserInvitationResponse sendUserInvitationResponse) throws IOException {
            if (sendUserInvitationResponse.success != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sendUserInvitationResponse.success);
            }
            if (sendUserInvitationResponse.user != null) {
                UserBriefInfo.ADAPTER.encodeWithTag(protoWriter, 2, sendUserInvitationResponse.user);
            }
            if (sendUserInvitationResponse.profile != null) {
                GetUserProfileResponse.ADAPTER.encodeWithTag(protoWriter, 3, sendUserInvitationResponse.profile);
            }
            protoWriter.writeBytes(sendUserInvitationResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse$a */
    public static final class C16378a extends Message.Builder<SendUserInvitationResponse, C16378a> {

        /* renamed from: a */
        public Boolean f42635a;

        /* renamed from: b */
        public UserBriefInfo f42636b;

        /* renamed from: c */
        public GetUserProfileResponse f42637c;

        /* renamed from: a */
        public SendUserInvitationResponse build() {
            return new SendUserInvitationResponse(this.f42635a, this.f42636b, this.f42637c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16378a newBuilder() {
        C16378a aVar = new C16378a();
        aVar.f42635a = this.success;
        aVar.f42636b = this.user;
        aVar.f42637c = this.profile;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SendUserInvitationResponse");
        StringBuilder sb = new StringBuilder();
        if (this.success != null) {
            sb.append(", success=");
            sb.append(this.success);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.profile != null) {
            sb.append(", profile=");
            sb.append(this.profile);
        }
        StringBuilder replace = sb.replace(0, 2, "SendUserInvitationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendUserInvitationResponse(Boolean bool, UserBriefInfo userBriefInfo, GetUserProfileResponse getUserProfileResponse) {
        this(bool, userBriefInfo, getUserProfileResponse, ByteString.EMPTY);
    }

    public SendUserInvitationResponse(Boolean bool, UserBriefInfo userBriefInfo, GetUserProfileResponse getUserProfileResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
        this.user = userBriefInfo;
        this.profile = getUserProfileResponse;
    }
}
