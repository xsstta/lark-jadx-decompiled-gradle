package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailMoveMultiLabelResponse extends Message<MailMoveMultiLabelResponse, C16826a> {
    public static final ProtoAdapter<MailMoveMultiLabelResponse> ADAPTER = new C16827b();
    private static final long serialVersionUID = 0;
    public final String uuid;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveMultiLabelResponse$b */
    private static final class C16827b extends ProtoAdapter<MailMoveMultiLabelResponse> {
        C16827b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMoveMultiLabelResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMoveMultiLabelResponse mailMoveMultiLabelResponse) {
            int i;
            if (mailMoveMultiLabelResponse.uuid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailMoveMultiLabelResponse.uuid);
            } else {
                i = 0;
            }
            return i + mailMoveMultiLabelResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailMoveMultiLabelResponse decode(ProtoReader protoReader) throws IOException {
            C16826a aVar = new C16826a();
            aVar.f43295a = "";
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
                    aVar.f43295a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMoveMultiLabelResponse mailMoveMultiLabelResponse) throws IOException {
            if (mailMoveMultiLabelResponse.uuid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailMoveMultiLabelResponse.uuid);
            }
            protoWriter.writeBytes(mailMoveMultiLabelResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveMultiLabelResponse$a */
    public static final class C16826a extends Message.Builder<MailMoveMultiLabelResponse, C16826a> {

        /* renamed from: a */
        public String f43295a;

        /* renamed from: a */
        public MailMoveMultiLabelResponse build() {
            return new MailMoveMultiLabelResponse(this.f43295a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16826a newBuilder() {
        C16826a aVar = new C16826a();
        aVar.f43295a = this.uuid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMoveMultiLabelResponse");
        StringBuilder sb = new StringBuilder();
        if (this.uuid != null) {
            sb.append(", uuid=");
            sb.append(this.uuid);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMoveMultiLabelResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailMoveMultiLabelResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailMoveMultiLabelResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uuid = str;
    }
}
