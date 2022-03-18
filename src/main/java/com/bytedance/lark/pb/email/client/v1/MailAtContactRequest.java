package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailAtContactRequest extends Message<MailAtContactRequest, C16638a> {
    public static final ProtoAdapter<MailAtContactRequest> ADAPTER = new C16639b();
    private static final long serialVersionUID = 0;
    public final String keyword;
    public final String search_session;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAtContactRequest$b */
    private static final class C16639b extends ProtoAdapter<MailAtContactRequest> {
        C16639b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAtContactRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAtContactRequest mailAtContactRequest) {
            int i;
            int i2 = 0;
            if (mailAtContactRequest.search_session != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailAtContactRequest.search_session);
            } else {
                i = 0;
            }
            if (mailAtContactRequest.keyword != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailAtContactRequest.keyword);
            }
            return i + i2 + mailAtContactRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailAtContactRequest decode(ProtoReader protoReader) throws IOException {
            C16638a aVar = new C16638a();
            aVar.f43084a = "";
            aVar.f43085b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43084a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43085b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAtContactRequest mailAtContactRequest) throws IOException {
            if (mailAtContactRequest.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailAtContactRequest.search_session);
            }
            if (mailAtContactRequest.keyword != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailAtContactRequest.keyword);
            }
            protoWriter.writeBytes(mailAtContactRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAtContactRequest$a */
    public static final class C16638a extends Message.Builder<MailAtContactRequest, C16638a> {

        /* renamed from: a */
        public String f43084a;

        /* renamed from: b */
        public String f43085b;

        /* renamed from: a */
        public MailAtContactRequest build() {
            return new MailAtContactRequest(this.f43084a, this.f43085b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16638a mo59162a(String str) {
            this.f43084a = str;
            return this;
        }

        /* renamed from: b */
        public C16638a mo59164b(String str) {
            this.f43085b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16638a newBuilder() {
        C16638a aVar = new C16638a();
        aVar.f43084a = this.search_session;
        aVar.f43085b = this.keyword;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAtContactRequest");
        StringBuilder sb = new StringBuilder();
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAtContactRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailAtContactRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailAtContactRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_session = str;
        this.keyword = str2;
    }
}
