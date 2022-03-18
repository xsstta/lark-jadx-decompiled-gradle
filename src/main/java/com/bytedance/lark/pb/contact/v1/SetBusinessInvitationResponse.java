package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetBusinessInvitationResponse extends Message<SetBusinessInvitationResponse, C16388a> {
    public static final ProtoAdapter<SetBusinessInvitationResponse> ADAPTER = new C16389b();
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final Boolean success;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetBusinessInvitationResponse$b */
    private static final class C16389b extends ProtoAdapter<SetBusinessInvitationResponse> {
        C16389b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBusinessInvitationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBusinessInvitationResponse setBusinessInvitationResponse) {
            int i;
            int i2 = 0;
            if (setBusinessInvitationResponse.success != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, setBusinessInvitationResponse.success);
            } else {
                i = 0;
            }
            if (setBusinessInvitationResponse.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, setBusinessInvitationResponse.url);
            }
            return i + i2 + setBusinessInvitationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetBusinessInvitationResponse decode(ProtoReader protoReader) throws IOException {
            C16388a aVar = new C16388a();
            aVar.f42652a = false;
            aVar.f42653b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42652a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42653b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetBusinessInvitationResponse setBusinessInvitationResponse) throws IOException {
            if (setBusinessInvitationResponse.success != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setBusinessInvitationResponse.success);
            }
            if (setBusinessInvitationResponse.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setBusinessInvitationResponse.url);
            }
            protoWriter.writeBytes(setBusinessInvitationResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetBusinessInvitationResponse$a */
    public static final class C16388a extends Message.Builder<SetBusinessInvitationResponse, C16388a> {

        /* renamed from: a */
        public Boolean f42652a;

        /* renamed from: b */
        public String f42653b;

        /* renamed from: a */
        public SetBusinessInvitationResponse build() {
            return new SetBusinessInvitationResponse(this.f42652a, this.f42653b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16388a newBuilder() {
        C16388a aVar = new C16388a();
        aVar.f42652a = this.success;
        aVar.f42653b = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetBusinessInvitationResponse");
        StringBuilder sb = new StringBuilder();
        if (this.success != null) {
            sb.append(", success=");
            sb.append(this.success);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "SetBusinessInvitationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetBusinessInvitationResponse(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public SetBusinessInvitationResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
        this.url = str;
    }
}
