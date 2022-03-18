package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateDocResponse extends Message<MailCreateDocResponse, C16662a> {
    public static final ProtoAdapter<MailCreateDocResponse> ADAPTER = new C16663b();
    private static final long serialVersionUID = 0;
    public final String doc_id;
    public final String message_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDocResponse$b */
    private static final class C16663b extends ProtoAdapter<MailCreateDocResponse> {
        C16663b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateDocResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateDocResponse mailCreateDocResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (mailCreateDocResponse.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateDocResponse.thread_id);
            } else {
                i = 0;
            }
            if (mailCreateDocResponse.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailCreateDocResponse.message_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailCreateDocResponse.doc_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailCreateDocResponse.doc_id);
            }
            return i4 + i3 + mailCreateDocResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateDocResponse decode(ProtoReader protoReader) throws IOException {
            C16662a aVar = new C16662a();
            aVar.f43121a = "";
            aVar.f43122b = "";
            aVar.f43123c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43121a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43122b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43123c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateDocResponse mailCreateDocResponse) throws IOException {
            if (mailCreateDocResponse.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateDocResponse.thread_id);
            }
            if (mailCreateDocResponse.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailCreateDocResponse.message_id);
            }
            if (mailCreateDocResponse.doc_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailCreateDocResponse.doc_id);
            }
            protoWriter.writeBytes(mailCreateDocResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDocResponse$a */
    public static final class C16662a extends Message.Builder<MailCreateDocResponse, C16662a> {

        /* renamed from: a */
        public String f43121a;

        /* renamed from: b */
        public String f43122b;

        /* renamed from: c */
        public String f43123c;

        /* renamed from: a */
        public MailCreateDocResponse build() {
            return new MailCreateDocResponse(this.f43121a, this.f43122b, this.f43123c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16662a newBuilder() {
        C16662a aVar = new C16662a();
        aVar.f43121a = this.thread_id;
        aVar.f43122b = this.message_id;
        aVar.f43123c = this.doc_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateDocResponse");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.doc_id != null) {
            sb.append(", doc_id=");
            sb.append(this.doc_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateDocResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateDocResponse(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public MailCreateDocResponse(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.message_id = str2;
        this.doc_id = str3;
    }
}
