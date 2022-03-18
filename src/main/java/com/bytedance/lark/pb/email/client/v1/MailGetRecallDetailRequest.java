package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetRecallDetailRequest extends Message<MailGetRecallDetailRequest, C16762a> {
    public static final ProtoAdapter<MailGetRecallDetailRequest> ADAPTER = new C16763b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailRequest$b */
    private static final class C16763b extends ProtoAdapter<MailGetRecallDetailRequest> {
        C16763b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetRecallDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetRecallDetailRequest mailGetRecallDetailRequest) {
            int i;
            if (mailGetRecallDetailRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetRecallDetailRequest.message_id);
            } else {
                i = 0;
            }
            return i + mailGetRecallDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetRecallDetailRequest decode(ProtoReader protoReader) throws IOException {
            C16762a aVar = new C16762a();
            aVar.f43232a = "";
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
                    aVar.f43232a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetRecallDetailRequest mailGetRecallDetailRequest) throws IOException {
            if (mailGetRecallDetailRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetRecallDetailRequest.message_id);
            }
            protoWriter.writeBytes(mailGetRecallDetailRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailRequest$a */
    public static final class C16762a extends Message.Builder<MailGetRecallDetailRequest, C16762a> {

        /* renamed from: a */
        public String f43232a;

        /* renamed from: a */
        public MailGetRecallDetailRequest build() {
            return new MailGetRecallDetailRequest(this.f43232a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16762a newBuilder() {
        C16762a aVar = new C16762a();
        aVar.f43232a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetRecallDetailRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetRecallDetailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetRecallDetailRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetRecallDetailRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
