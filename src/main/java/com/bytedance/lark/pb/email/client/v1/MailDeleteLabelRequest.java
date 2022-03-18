package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailDeleteLabelRequest extends Message<MailDeleteLabelRequest, C16688a> {
    public static final ProtoAdapter<MailDeleteLabelRequest> ADAPTER = new C16689b();
    private static final long serialVersionUID = 0;
    public final String label_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLabelRequest$b */
    private static final class C16689b extends ProtoAdapter<MailDeleteLabelRequest> {
        C16689b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteLabelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteLabelRequest mailDeleteLabelRequest) {
            int i;
            if (mailDeleteLabelRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailDeleteLabelRequest.label_id);
            } else {
                i = 0;
            }
            return i + mailDeleteLabelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteLabelRequest decode(ProtoReader protoReader) throws IOException {
            C16688a aVar = new C16688a();
            aVar.f43159a = "";
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
                    aVar.f43159a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailDeleteLabelRequest mailDeleteLabelRequest) throws IOException {
            if (mailDeleteLabelRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailDeleteLabelRequest.label_id);
            }
            protoWriter.writeBytes(mailDeleteLabelRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLabelRequest$a */
    public static final class C16688a extends Message.Builder<MailDeleteLabelRequest, C16688a> {

        /* renamed from: a */
        public String f43159a;

        /* renamed from: a */
        public MailDeleteLabelRequest build() {
            return new MailDeleteLabelRequest(this.f43159a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16688a newBuilder() {
        C16688a aVar = new C16688a();
        aVar.f43159a = this.label_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteLabelRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailDeleteLabelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteLabelRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailDeleteLabelRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
    }
}
