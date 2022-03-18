package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetMessageFullBodyRequest extends Message<MailGetMessageFullBodyRequest, C16732a> {
    public static final ProtoAdapter<MailGetMessageFullBodyRequest> ADAPTER = new C16733b();
    public static final Boolean DEFAULT_IS_FORWARD_CARD = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_forward_card;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyRequest$b */
    private static final class C16733b extends ProtoAdapter<MailGetMessageFullBodyRequest> {
        C16733b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMessageFullBodyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMessageFullBodyRequest mailGetMessageFullBodyRequest) {
            int i;
            int i2 = 0;
            if (mailGetMessageFullBodyRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetMessageFullBodyRequest.message_id);
            } else {
                i = 0;
            }
            if (mailGetMessageFullBodyRequest.is_forward_card != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailGetMessageFullBodyRequest.is_forward_card);
            }
            return i + i2 + mailGetMessageFullBodyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMessageFullBodyRequest decode(ProtoReader protoReader) throws IOException {
            C16732a aVar = new C16732a();
            aVar.f43194a = "";
            aVar.f43195b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43194a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43195b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMessageFullBodyRequest mailGetMessageFullBodyRequest) throws IOException {
            if (mailGetMessageFullBodyRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetMessageFullBodyRequest.message_id);
            }
            if (mailGetMessageFullBodyRequest.is_forward_card != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailGetMessageFullBodyRequest.is_forward_card);
            }
            protoWriter.writeBytes(mailGetMessageFullBodyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyRequest$a */
    public static final class C16732a extends Message.Builder<MailGetMessageFullBodyRequest, C16732a> {

        /* renamed from: a */
        public String f43194a;

        /* renamed from: b */
        public Boolean f43195b;

        /* renamed from: a */
        public MailGetMessageFullBodyRequest build() {
            return new MailGetMessageFullBodyRequest(this.f43194a, this.f43195b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16732a newBuilder() {
        C16732a aVar = new C16732a();
        aVar.f43194a = this.message_id;
        aVar.f43195b = this.is_forward_card;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMessageFullBodyRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.is_forward_card != null) {
            sb.append(", is_forward_card=");
            sb.append(this.is_forward_card);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMessageFullBodyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMessageFullBodyRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public MailGetMessageFullBodyRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.is_forward_card = bool;
    }
}
