package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetMessageFullBodyResponse extends Message<MailGetMessageFullBodyResponse, C16734a> {
    public static final ProtoAdapter<MailGetMessageFullBodyResponse> ADAPTER = new C16735b();
    private static final long serialVersionUID = 0;
    public final String full_body_html;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyResponse$b */
    private static final class C16735b extends ProtoAdapter<MailGetMessageFullBodyResponse> {
        C16735b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMessageFullBodyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMessageFullBodyResponse mailGetMessageFullBodyResponse) {
            int i;
            int i2 = 0;
            if (mailGetMessageFullBodyResponse.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetMessageFullBodyResponse.message_id);
            } else {
                i = 0;
            }
            if (mailGetMessageFullBodyResponse.full_body_html != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetMessageFullBodyResponse.full_body_html);
            }
            return i + i2 + mailGetMessageFullBodyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMessageFullBodyResponse decode(ProtoReader protoReader) throws IOException {
            C16734a aVar = new C16734a();
            aVar.f43196a = "";
            aVar.f43197b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43196a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43197b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMessageFullBodyResponse mailGetMessageFullBodyResponse) throws IOException {
            if (mailGetMessageFullBodyResponse.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetMessageFullBodyResponse.message_id);
            }
            if (mailGetMessageFullBodyResponse.full_body_html != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetMessageFullBodyResponse.full_body_html);
            }
            protoWriter.writeBytes(mailGetMessageFullBodyResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyResponse$a */
    public static final class C16734a extends Message.Builder<MailGetMessageFullBodyResponse, C16734a> {

        /* renamed from: a */
        public String f43196a;

        /* renamed from: b */
        public String f43197b;

        /* renamed from: a */
        public MailGetMessageFullBodyResponse build() {
            return new MailGetMessageFullBodyResponse(this.f43196a, this.f43197b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16734a newBuilder() {
        C16734a aVar = new C16734a();
        aVar.f43196a = this.message_id;
        aVar.f43197b = this.full_body_html;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMessageFullBodyResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.full_body_html != null) {
            sb.append(", full_body_html=");
            sb.append(this.full_body_html);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMessageFullBodyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMessageFullBodyResponse(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailGetMessageFullBodyResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.full_body_html = str2;
    }
}
