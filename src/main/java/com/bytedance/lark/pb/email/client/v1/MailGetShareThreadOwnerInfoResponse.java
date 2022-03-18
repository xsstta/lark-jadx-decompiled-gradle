package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetShareThreadOwnerInfoResponse extends Message<MailGetShareThreadOwnerInfoResponse, C16774a> {
    public static final ProtoAdapter<MailGetShareThreadOwnerInfoResponse> ADAPTER = new C16775b();
    private static final long serialVersionUID = 0;
    public final UserInfo owner;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoResponse$b */
    private static final class C16775b extends ProtoAdapter<MailGetShareThreadOwnerInfoResponse> {
        C16775b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetShareThreadOwnerInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetShareThreadOwnerInfoResponse mailGetShareThreadOwnerInfoResponse) {
            int i;
            if (mailGetShareThreadOwnerInfoResponse.owner != null) {
                i = UserInfo.ADAPTER.encodedSizeWithTag(1, mailGetShareThreadOwnerInfoResponse.owner);
            } else {
                i = 0;
            }
            return i + mailGetShareThreadOwnerInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetShareThreadOwnerInfoResponse decode(ProtoReader protoReader) throws IOException {
            C16774a aVar = new C16774a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43246a = UserInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetShareThreadOwnerInfoResponse mailGetShareThreadOwnerInfoResponse) throws IOException {
            if (mailGetShareThreadOwnerInfoResponse.owner != null) {
                UserInfo.ADAPTER.encodeWithTag(protoWriter, 1, mailGetShareThreadOwnerInfoResponse.owner);
            }
            protoWriter.writeBytes(mailGetShareThreadOwnerInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoResponse$a */
    public static final class C16774a extends Message.Builder<MailGetShareThreadOwnerInfoResponse, C16774a> {

        /* renamed from: a */
        public UserInfo f43246a;

        /* renamed from: a */
        public MailGetShareThreadOwnerInfoResponse build() {
            return new MailGetShareThreadOwnerInfoResponse(this.f43246a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16774a newBuilder() {
        C16774a aVar = new C16774a();
        aVar.f43246a = this.owner;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetShareThreadOwnerInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetShareThreadOwnerInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetShareThreadOwnerInfoResponse(UserInfo userInfo) {
        this(userInfo, ByteString.EMPTY);
    }

    public MailGetShareThreadOwnerInfoResponse(UserInfo userInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.owner = userInfo;
    }
}
