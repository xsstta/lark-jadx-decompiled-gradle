package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetLabelsRequest extends Message<MailGetLabelsRequest, C16724a> {
    public static final ProtoAdapter<MailGetLabelsRequest> ADAPTER = new C16725b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelsRequest$b */
    private static final class C16725b extends ProtoAdapter<MailGetLabelsRequest> {
        C16725b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetLabelsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetLabelsRequest mailGetLabelsRequest) {
            return mailGetLabelsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetLabelsRequest decode(ProtoReader protoReader) throws IOException {
            C16724a aVar = new C16724a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetLabelsRequest mailGetLabelsRequest) throws IOException {
            protoWriter.writeBytes(mailGetLabelsRequest.unknownFields());
        }
    }

    public MailGetLabelsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelsRequest$a */
    public static final class C16724a extends Message.Builder<MailGetLabelsRequest, C16724a> {
        /* renamed from: a */
        public MailGetLabelsRequest build() {
            return new MailGetLabelsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16724a newBuilder() {
        C16724a aVar = new C16724a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetLabelsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailGetLabelsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetLabelsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
