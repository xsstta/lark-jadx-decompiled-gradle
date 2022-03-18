package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetMessageItemRequest extends Message<MailGetMessageItemRequest, C16736a> {
    public static final ProtoAdapter<MailGetMessageItemRequest> ADAPTER = new C16737b();
    public static final Boolean DEFAULT_IS_FORWARD_CARD = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_forward_card;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageItemRequest$b */
    private static final class C16737b extends ProtoAdapter<MailGetMessageItemRequest> {
        C16737b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMessageItemRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMessageItemRequest mailGetMessageItemRequest) {
            int i;
            int i2 = 0;
            if (mailGetMessageItemRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetMessageItemRequest.message_id);
            } else {
                i = 0;
            }
            if (mailGetMessageItemRequest.is_forward_card != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailGetMessageItemRequest.is_forward_card);
            }
            return i + i2 + mailGetMessageItemRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMessageItemRequest decode(ProtoReader protoReader) throws IOException {
            C16736a aVar = new C16736a();
            aVar.f43198a = "";
            aVar.f43199b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43198a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43199b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMessageItemRequest mailGetMessageItemRequest) throws IOException {
            if (mailGetMessageItemRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetMessageItemRequest.message_id);
            }
            if (mailGetMessageItemRequest.is_forward_card != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailGetMessageItemRequest.is_forward_card);
            }
            protoWriter.writeBytes(mailGetMessageItemRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageItemRequest$a */
    public static final class C16736a extends Message.Builder<MailGetMessageItemRequest, C16736a> {

        /* renamed from: a */
        public String f43198a;

        /* renamed from: b */
        public Boolean f43199b;

        /* renamed from: a */
        public MailGetMessageItemRequest build() {
            return new MailGetMessageItemRequest(this.f43198a, this.f43199b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16736a newBuilder() {
        C16736a aVar = new C16736a();
        aVar.f43198a = this.message_id;
        aVar.f43199b = this.is_forward_card;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMessageItemRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.is_forward_card != null) {
            sb.append(", is_forward_card=");
            sb.append(this.is_forward_card);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMessageItemRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMessageItemRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public MailGetMessageItemRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.is_forward_card = bool;
    }
}
