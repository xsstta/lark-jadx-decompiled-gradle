package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCanSendExternalResponse extends Message<MailCanSendExternalResponse, C16644a> {
    public static final ProtoAdapter<MailCanSendExternalResponse> ADAPTER = new C16645b();
    public static final Boolean DEFAULT_CANSENDEXTERNAL = false;
    private static final long serialVersionUID = 0;
    public final Boolean canSendExternal;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCanSendExternalResponse$b */
    private static final class C16645b extends ProtoAdapter<MailCanSendExternalResponse> {
        C16645b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCanSendExternalResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCanSendExternalResponse mailCanSendExternalResponse) {
            int i;
            if (mailCanSendExternalResponse.canSendExternal != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailCanSendExternalResponse.canSendExternal);
            } else {
                i = 0;
            }
            return i + mailCanSendExternalResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCanSendExternalResponse decode(ProtoReader protoReader) throws IOException {
            C16644a aVar = new C16644a();
            aVar.f43089a = false;
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
                    aVar.f43089a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCanSendExternalResponse mailCanSendExternalResponse) throws IOException {
            if (mailCanSendExternalResponse.canSendExternal != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailCanSendExternalResponse.canSendExternal);
            }
            protoWriter.writeBytes(mailCanSendExternalResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCanSendExternalResponse$a */
    public static final class C16644a extends Message.Builder<MailCanSendExternalResponse, C16644a> {

        /* renamed from: a */
        public Boolean f43089a;

        /* renamed from: a */
        public MailCanSendExternalResponse build() {
            return new MailCanSendExternalResponse(this.f43089a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16644a newBuilder() {
        C16644a aVar = new C16644a();
        aVar.f43089a = this.canSendExternal;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCanSendExternalResponse");
        StringBuilder sb = new StringBuilder();
        if (this.canSendExternal != null) {
            sb.append(", canSendExternal=");
            sb.append(this.canSendExternal);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCanSendExternalResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCanSendExternalResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailCanSendExternalResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.canSendExternal = bool;
    }
}
