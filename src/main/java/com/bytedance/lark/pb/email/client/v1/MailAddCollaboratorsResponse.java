package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailAddCollaboratorsResponse extends Message<MailAddCollaboratorsResponse, C16626a> {
    public static final ProtoAdapter<MailAddCollaboratorsResponse> ADAPTER = new C16627b();
    private static final long serialVersionUID = 0;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddCollaboratorsResponse$b */
    private static final class C16627b extends ProtoAdapter<MailAddCollaboratorsResponse> {
        C16627b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAddCollaboratorsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAddCollaboratorsResponse mailAddCollaboratorsResponse) {
            int i;
            if (mailAddCollaboratorsResponse.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailAddCollaboratorsResponse.thread_id);
            } else {
                i = 0;
            }
            return i + mailAddCollaboratorsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailAddCollaboratorsResponse decode(ProtoReader protoReader) throws IOException {
            C16626a aVar = new C16626a();
            aVar.f43063a = "";
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
                    aVar.f43063a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAddCollaboratorsResponse mailAddCollaboratorsResponse) throws IOException {
            if (mailAddCollaboratorsResponse.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailAddCollaboratorsResponse.thread_id);
            }
            protoWriter.writeBytes(mailAddCollaboratorsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddCollaboratorsResponse$a */
    public static final class C16626a extends Message.Builder<MailAddCollaboratorsResponse, C16626a> {

        /* renamed from: a */
        public String f43063a;

        /* renamed from: a */
        public MailAddCollaboratorsResponse build() {
            return new MailAddCollaboratorsResponse(this.f43063a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16626a newBuilder() {
        C16626a aVar = new C16626a();
        aVar.f43063a = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAddCollaboratorsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAddCollaboratorsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailAddCollaboratorsResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailAddCollaboratorsResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
    }
}
