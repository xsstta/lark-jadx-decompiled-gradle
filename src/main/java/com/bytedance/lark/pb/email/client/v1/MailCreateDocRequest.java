package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateDocRequest extends Message<MailCreateDocRequest, C16660a> {
    public static final ProtoAdapter<MailCreateDocRequest> ADAPTER = new C16661b();
    private static final long serialVersionUID = 0;
    public final String body_plaintext;
    public final String init_data;
    public final String message_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDocRequest$b */
    private static final class C16661b extends ProtoAdapter<MailCreateDocRequest> {
        C16661b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateDocRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateDocRequest mailCreateDocRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailCreateDocRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateDocRequest.thread_id);
            } else {
                i = 0;
            }
            if (mailCreateDocRequest.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailCreateDocRequest.message_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailCreateDocRequest.init_data != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailCreateDocRequest.init_data);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailCreateDocRequest.body_plaintext != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailCreateDocRequest.body_plaintext);
            }
            return i6 + i4 + mailCreateDocRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateDocRequest decode(ProtoReader protoReader) throws IOException {
            C16660a aVar = new C16660a();
            aVar.f43117a = "";
            aVar.f43118b = "";
            aVar.f43119c = "";
            aVar.f43120d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43117a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43118b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43119c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43120d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateDocRequest mailCreateDocRequest) throws IOException {
            if (mailCreateDocRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateDocRequest.thread_id);
            }
            if (mailCreateDocRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailCreateDocRequest.message_id);
            }
            if (mailCreateDocRequest.init_data != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailCreateDocRequest.init_data);
            }
            if (mailCreateDocRequest.body_plaintext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailCreateDocRequest.body_plaintext);
            }
            protoWriter.writeBytes(mailCreateDocRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDocRequest$a */
    public static final class C16660a extends Message.Builder<MailCreateDocRequest, C16660a> {

        /* renamed from: a */
        public String f43117a;

        /* renamed from: b */
        public String f43118b;

        /* renamed from: c */
        public String f43119c;

        /* renamed from: d */
        public String f43120d;

        /* renamed from: a */
        public MailCreateDocRequest build() {
            return new MailCreateDocRequest(this.f43117a, this.f43118b, this.f43119c, this.f43120d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16660a mo59216a(String str) {
            this.f43117a = str;
            return this;
        }

        /* renamed from: b */
        public C16660a mo59218b(String str) {
            this.f43118b = str;
            return this;
        }

        /* renamed from: c */
        public C16660a mo59219c(String str) {
            this.f43119c = str;
            return this;
        }

        /* renamed from: d */
        public C16660a mo59220d(String str) {
            this.f43120d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16660a newBuilder() {
        C16660a aVar = new C16660a();
        aVar.f43117a = this.thread_id;
        aVar.f43118b = this.message_id;
        aVar.f43119c = this.init_data;
        aVar.f43120d = this.body_plaintext;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateDocRequest");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.init_data != null) {
            sb.append(", init_data=");
            sb.append(this.init_data);
        }
        if (this.body_plaintext != null) {
            sb.append(", body_plaintext=");
            sb.append(this.body_plaintext);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateDocRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateDocRequest(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public MailCreateDocRequest(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.message_id = str2;
        this.init_data = str3;
        this.body_plaintext = str4;
    }
}
