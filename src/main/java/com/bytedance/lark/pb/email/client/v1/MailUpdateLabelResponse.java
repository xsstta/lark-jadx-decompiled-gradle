package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateLabelResponse extends Message<MailUpdateLabelResponse, C16954a> {
    public static final ProtoAdapter<MailUpdateLabelResponse> ADAPTER = new C16955b();
    private static final long serialVersionUID = 0;
    public final Label label;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateLabelResponse$b */
    private static final class C16955b extends ProtoAdapter<MailUpdateLabelResponse> {
        C16955b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateLabelResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateLabelResponse mailUpdateLabelResponse) {
            int i;
            if (mailUpdateLabelResponse.label != null) {
                i = Label.ADAPTER.encodedSizeWithTag(1, mailUpdateLabelResponse.label);
            } else {
                i = 0;
            }
            return i + mailUpdateLabelResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateLabelResponse decode(ProtoReader protoReader) throws IOException {
            C16954a aVar = new C16954a();
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
                    aVar.f43460a = Label.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateLabelResponse mailUpdateLabelResponse) throws IOException {
            if (mailUpdateLabelResponse.label != null) {
                Label.ADAPTER.encodeWithTag(protoWriter, 1, mailUpdateLabelResponse.label);
            }
            protoWriter.writeBytes(mailUpdateLabelResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateLabelResponse$a */
    public static final class C16954a extends Message.Builder<MailUpdateLabelResponse, C16954a> {

        /* renamed from: a */
        public Label f43460a;

        /* renamed from: a */
        public MailUpdateLabelResponse build() {
            return new MailUpdateLabelResponse(this.f43460a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16954a newBuilder() {
        C16954a aVar = new C16954a();
        aVar.f43460a = this.label;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateLabelResponse");
        StringBuilder sb = new StringBuilder();
        if (this.label != null) {
            sb.append(", label=");
            sb.append(this.label);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateLabelResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateLabelResponse(Label label2) {
        this(label2, ByteString.EMPTY);
    }

    public MailUpdateLabelResponse(Label label2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label = label2;
    }
}
