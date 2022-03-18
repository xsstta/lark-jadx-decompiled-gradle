package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailOpenEmlRequest extends Message<MailOpenEmlRequest, C16848a> {
    public static final ProtoAdapter<MailOpenEmlRequest> ADAPTER = new C16849b();
    private static final long serialVersionUID = 0;
    public final String local_path;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailOpenEmlRequest$b */
    private static final class C16849b extends ProtoAdapter<MailOpenEmlRequest> {
        C16849b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailOpenEmlRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailOpenEmlRequest mailOpenEmlRequest) {
            int i;
            if (mailOpenEmlRequest.local_path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailOpenEmlRequest.local_path);
            } else {
                i = 0;
            }
            return i + mailOpenEmlRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailOpenEmlRequest decode(ProtoReader protoReader) throws IOException {
            C16848a aVar = new C16848a();
            aVar.f43313a = "";
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
                    aVar.f43313a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailOpenEmlRequest mailOpenEmlRequest) throws IOException {
            if (mailOpenEmlRequest.local_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailOpenEmlRequest.local_path);
            }
            protoWriter.writeBytes(mailOpenEmlRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailOpenEmlRequest$a */
    public static final class C16848a extends Message.Builder<MailOpenEmlRequest, C16848a> {

        /* renamed from: a */
        public String f43313a;

        /* renamed from: a */
        public MailOpenEmlRequest build() {
            return new MailOpenEmlRequest(this.f43313a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16848a newBuilder() {
        C16848a aVar = new C16848a();
        aVar.f43313a = this.local_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailOpenEmlRequest");
        StringBuilder sb = new StringBuilder();
        if (this.local_path != null) {
            sb.append(", local_path=");
            sb.append(this.local_path);
        }
        StringBuilder replace = sb.replace(0, 2, "MailOpenEmlRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailOpenEmlRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailOpenEmlRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_path = str;
    }
}
