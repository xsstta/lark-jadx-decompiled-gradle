package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetForwardMessageListFromNetRequest extends Message<MailGetForwardMessageListFromNetRequest, C16716a> {
    public static final ProtoAdapter<MailGetForwardMessageListFromNetRequest> ADAPTER = new C16717b();
    public static final Boolean DEFAULT_MSG_NEED_CLIPPED = true;
    private static final long serialVersionUID = 0;
    public final String card_id;
    public final Boolean msg_need_clipped;
    public final String owner_user_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetForwardMessageListFromNetRequest$b */
    private static final class C16717b extends ProtoAdapter<MailGetForwardMessageListFromNetRequest> {
        C16717b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetForwardMessageListFromNetRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetForwardMessageListFromNetRequest mailGetForwardMessageListFromNetRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailGetForwardMessageListFromNetRequest.card_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetForwardMessageListFromNetRequest.card_id);
            } else {
                i = 0;
            }
            if (mailGetForwardMessageListFromNetRequest.owner_user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetForwardMessageListFromNetRequest.owner_user_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailGetForwardMessageListFromNetRequest.msg_need_clipped != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailGetForwardMessageListFromNetRequest.msg_need_clipped);
            }
            return i4 + i3 + mailGetForwardMessageListFromNetRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetForwardMessageListFromNetRequest decode(ProtoReader protoReader) throws IOException {
            C16716a aVar = new C16716a();
            aVar.f43179a = "";
            aVar.f43180b = "";
            aVar.f43181c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43179a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43180b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43181c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetForwardMessageListFromNetRequest mailGetForwardMessageListFromNetRequest) throws IOException {
            if (mailGetForwardMessageListFromNetRequest.card_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetForwardMessageListFromNetRequest.card_id);
            }
            if (mailGetForwardMessageListFromNetRequest.owner_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetForwardMessageListFromNetRequest.owner_user_id);
            }
            if (mailGetForwardMessageListFromNetRequest.msg_need_clipped != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailGetForwardMessageListFromNetRequest.msg_need_clipped);
            }
            protoWriter.writeBytes(mailGetForwardMessageListFromNetRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetForwardMessageListFromNetRequest$a */
    public static final class C16716a extends Message.Builder<MailGetForwardMessageListFromNetRequest, C16716a> {

        /* renamed from: a */
        public String f43179a;

        /* renamed from: b */
        public String f43180b;

        /* renamed from: c */
        public Boolean f43181c;

        /* renamed from: a */
        public MailGetForwardMessageListFromNetRequest build() {
            return new MailGetForwardMessageListFromNetRequest(this.f43179a, this.f43180b, this.f43181c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16716a mo59355a(String str) {
            this.f43179a = str;
            return this;
        }

        /* renamed from: b */
        public C16716a mo59357b(String str) {
            this.f43180b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16716a newBuilder() {
        C16716a aVar = new C16716a();
        aVar.f43179a = this.card_id;
        aVar.f43180b = this.owner_user_id;
        aVar.f43181c = this.msg_need_clipped;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetForwardMessageListFromNetRequest");
        StringBuilder sb = new StringBuilder();
        if (this.card_id != null) {
            sb.append(", card_id=");
            sb.append(this.card_id);
        }
        if (this.owner_user_id != null) {
            sb.append(", owner_user_id=");
            sb.append(this.owner_user_id);
        }
        if (this.msg_need_clipped != null) {
            sb.append(", msg_need_clipped=");
            sb.append(this.msg_need_clipped);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetForwardMessageListFromNetRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetForwardMessageListFromNetRequest(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public MailGetForwardMessageListFromNetRequest(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_id = str;
        this.owner_user_id = str2;
        this.msg_need_clipped = bool;
    }
}
