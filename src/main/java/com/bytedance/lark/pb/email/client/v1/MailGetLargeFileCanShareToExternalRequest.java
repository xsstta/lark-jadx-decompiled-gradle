package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetLargeFileCanShareToExternalRequest extends Message<MailGetLargeFileCanShareToExternalRequest, C16728a> {
    public static final ProtoAdapter<MailGetLargeFileCanShareToExternalRequest> ADAPTER = new C16729b();
    private static final long serialVersionUID = 0;
    public final String tenant_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLargeFileCanShareToExternalRequest$b */
    private static final class C16729b extends ProtoAdapter<MailGetLargeFileCanShareToExternalRequest> {
        C16729b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetLargeFileCanShareToExternalRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetLargeFileCanShareToExternalRequest mailGetLargeFileCanShareToExternalRequest) {
            int i;
            if (mailGetLargeFileCanShareToExternalRequest.tenant_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetLargeFileCanShareToExternalRequest.tenant_id);
            } else {
                i = 0;
            }
            return i + mailGetLargeFileCanShareToExternalRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetLargeFileCanShareToExternalRequest decode(ProtoReader protoReader) throws IOException {
            C16728a aVar = new C16728a();
            aVar.f43192a = "";
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
                    aVar.f43192a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetLargeFileCanShareToExternalRequest mailGetLargeFileCanShareToExternalRequest) throws IOException {
            if (mailGetLargeFileCanShareToExternalRequest.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetLargeFileCanShareToExternalRequest.tenant_id);
            }
            protoWriter.writeBytes(mailGetLargeFileCanShareToExternalRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLargeFileCanShareToExternalRequest$a */
    public static final class C16728a extends Message.Builder<MailGetLargeFileCanShareToExternalRequest, C16728a> {

        /* renamed from: a */
        public String f43192a;

        /* renamed from: a */
        public MailGetLargeFileCanShareToExternalRequest build() {
            return new MailGetLargeFileCanShareToExternalRequest(this.f43192a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16728a newBuilder() {
        C16728a aVar = new C16728a();
        aVar.f43192a = this.tenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetLargeFileCanShareToExternalRequest");
        StringBuilder sb = new StringBuilder();
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetLargeFileCanShareToExternalRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetLargeFileCanShareToExternalRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetLargeFileCanShareToExternalRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_id = str;
    }
}
