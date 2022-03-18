package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetForwardMessageListRequest extends Message<MailGetForwardMessageListRequest, C16718a> {
    public static final ProtoAdapter<MailGetForwardMessageListRequest> ADAPTER = new C16719b();
    public static final Boolean DEFAULT_MSG_NEED_CLIPPED = true;
    private static final long serialVersionUID = 0;
    public final String card_id;
    public final Boolean msg_need_clipped;
    public final String owner_user_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetForwardMessageListRequest$b */
    private static final class C16719b extends ProtoAdapter<MailGetForwardMessageListRequest> {
        C16719b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetForwardMessageListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetForwardMessageListRequest mailGetForwardMessageListRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailGetForwardMessageListRequest.card_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetForwardMessageListRequest.card_id);
            } else {
                i = 0;
            }
            if (mailGetForwardMessageListRequest.owner_user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetForwardMessageListRequest.owner_user_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailGetForwardMessageListRequest.msg_need_clipped != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailGetForwardMessageListRequest.msg_need_clipped);
            }
            return i4 + i3 + mailGetForwardMessageListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetForwardMessageListRequest decode(ProtoReader protoReader) throws IOException {
            C16718a aVar = new C16718a();
            aVar.f43182a = "";
            aVar.f43183b = "";
            aVar.f43184c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43182a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43183b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43184c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetForwardMessageListRequest mailGetForwardMessageListRequest) throws IOException {
            if (mailGetForwardMessageListRequest.card_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetForwardMessageListRequest.card_id);
            }
            if (mailGetForwardMessageListRequest.owner_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetForwardMessageListRequest.owner_user_id);
            }
            if (mailGetForwardMessageListRequest.msg_need_clipped != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailGetForwardMessageListRequest.msg_need_clipped);
            }
            protoWriter.writeBytes(mailGetForwardMessageListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetForwardMessageListRequest$a */
    public static final class C16718a extends Message.Builder<MailGetForwardMessageListRequest, C16718a> {

        /* renamed from: a */
        public String f43182a;

        /* renamed from: b */
        public String f43183b;

        /* renamed from: c */
        public Boolean f43184c;

        /* renamed from: a */
        public MailGetForwardMessageListRequest build() {
            return new MailGetForwardMessageListRequest(this.f43182a, this.f43183b, this.f43184c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16718a mo59361a(String str) {
            this.f43182a = str;
            return this;
        }

        /* renamed from: b */
        public C16718a mo59363b(String str) {
            this.f43183b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16718a newBuilder() {
        C16718a aVar = new C16718a();
        aVar.f43182a = this.card_id;
        aVar.f43183b = this.owner_user_id;
        aVar.f43184c = this.msg_need_clipped;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetForwardMessageListRequest");
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
        StringBuilder replace = sb.replace(0, 2, "MailGetForwardMessageListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetForwardMessageListRequest(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public MailGetForwardMessageListRequest(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_id = str;
        this.owner_user_id = str2;
        this.msg_need_clipped = bool;
    }
}
