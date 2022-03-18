package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSelectAllResponse extends Message<MailSelectAllResponse, C16882a> {
    public static final ProtoAdapter<MailSelectAllResponse> ADAPTER = new C16883b();
    private static final long serialVersionUID = 0;
    public final String session_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSelectAllResponse$b */
    private static final class C16883b extends ProtoAdapter<MailSelectAllResponse> {
        C16883b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSelectAllResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSelectAllResponse mailSelectAllResponse) {
            int i;
            if (mailSelectAllResponse.session_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSelectAllResponse.session_id);
            } else {
                i = 0;
            }
            return i + mailSelectAllResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSelectAllResponse decode(ProtoReader protoReader) throws IOException {
            C16882a aVar = new C16882a();
            aVar.f43354a = "";
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
                    aVar.f43354a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSelectAllResponse mailSelectAllResponse) throws IOException {
            if (mailSelectAllResponse.session_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSelectAllResponse.session_id);
            }
            protoWriter.writeBytes(mailSelectAllResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSelectAllResponse$a */
    public static final class C16882a extends Message.Builder<MailSelectAllResponse, C16882a> {

        /* renamed from: a */
        public String f43354a;

        /* renamed from: a */
        public MailSelectAllResponse build() {
            return new MailSelectAllResponse(this.f43354a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16882a newBuilder() {
        C16882a aVar = new C16882a();
        aVar.f43354a = this.session_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSelectAllResponse");
        StringBuilder sb = new StringBuilder();
        if (this.session_id != null) {
            sb.append(", session_id=");
            sb.append(this.session_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSelectAllResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSelectAllResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailSelectAllResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.session_id = str;
    }
}
