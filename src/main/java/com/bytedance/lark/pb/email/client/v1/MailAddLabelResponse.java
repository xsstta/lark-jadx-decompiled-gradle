package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailAddLabelResponse extends Message<MailAddLabelResponse, C16634a> {
    public static final ProtoAdapter<MailAddLabelResponse> ADAPTER = new C16635b();
    private static final long serialVersionUID = 0;
    public final Label label;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddLabelResponse$b */
    private static final class C16635b extends ProtoAdapter<MailAddLabelResponse> {
        C16635b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAddLabelResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAddLabelResponse mailAddLabelResponse) {
            int i;
            if (mailAddLabelResponse.label != null) {
                i = Label.ADAPTER.encodedSizeWithTag(1, mailAddLabelResponse.label);
            } else {
                i = 0;
            }
            return i + mailAddLabelResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailAddLabelResponse decode(ProtoReader protoReader) throws IOException {
            C16634a aVar = new C16634a();
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
                    aVar.f43072a = Label.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAddLabelResponse mailAddLabelResponse) throws IOException {
            if (mailAddLabelResponse.label != null) {
                Label.ADAPTER.encodeWithTag(protoWriter, 1, mailAddLabelResponse.label);
            }
            protoWriter.writeBytes(mailAddLabelResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddLabelResponse$a */
    public static final class C16634a extends Message.Builder<MailAddLabelResponse, C16634a> {

        /* renamed from: a */
        public Label f43072a;

        /* renamed from: a */
        public MailAddLabelResponse build() {
            return new MailAddLabelResponse(this.f43072a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16634a newBuilder() {
        C16634a aVar = new C16634a();
        aVar.f43072a = this.label;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAddLabelResponse");
        StringBuilder sb = new StringBuilder();
        if (this.label != null) {
            sb.append(", label=");
            sb.append(this.label);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAddLabelResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailAddLabelResponse(Label label2) {
        this(label2, ByteString.EMPTY);
    }

    public MailAddLabelResponse(Label label2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label = label2;
    }
}
