package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class OneKeyInviteInactiveRequest extends Message<OneKeyInviteInactiveRequest, C16334a> {
    public static final ProtoAdapter<OneKeyInviteInactiveRequest> ADAPTER = new C16335b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String department_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.OneKeyInviteInactiveRequest$b */
    private static final class C16335b extends ProtoAdapter<OneKeyInviteInactiveRequest> {
        C16335b() {
            super(FieldEncoding.LENGTH_DELIMITED, OneKeyInviteInactiveRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(OneKeyInviteInactiveRequest oneKeyInviteInactiveRequest) {
            int i;
            int i2 = 0;
            if (oneKeyInviteInactiveRequest.department_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, oneKeyInviteInactiveRequest.department_id);
            } else {
                i = 0;
            }
            if (oneKeyInviteInactiveRequest.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, oneKeyInviteInactiveRequest.chat_id);
            }
            return i + i2 + oneKeyInviteInactiveRequest.unknownFields().size();
        }

        /* renamed from: a */
        public OneKeyInviteInactiveRequest decode(ProtoReader protoReader) throws IOException {
            C16334a aVar = new C16334a();
            aVar.f42581a = "";
            aVar.f42582b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42581a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42582b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OneKeyInviteInactiveRequest oneKeyInviteInactiveRequest) throws IOException {
            if (oneKeyInviteInactiveRequest.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oneKeyInviteInactiveRequest.department_id);
            }
            if (oneKeyInviteInactiveRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, oneKeyInviteInactiveRequest.chat_id);
            }
            protoWriter.writeBytes(oneKeyInviteInactiveRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.OneKeyInviteInactiveRequest$a */
    public static final class C16334a extends Message.Builder<OneKeyInviteInactiveRequest, C16334a> {

        /* renamed from: a */
        public String f42581a;

        /* renamed from: b */
        public String f42582b;

        /* renamed from: a */
        public OneKeyInviteInactiveRequest build() {
            return new OneKeyInviteInactiveRequest(this.f42581a, this.f42582b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16334a mo58393a(String str) {
            this.f42581a = str;
            return this;
        }

        /* renamed from: b */
        public C16334a mo58395b(String str) {
            this.f42582b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16334a newBuilder() {
        C16334a aVar = new C16334a();
        aVar.f42581a = this.department_id;
        aVar.f42582b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "OneKeyInviteInactiveRequest");
        StringBuilder sb = new StringBuilder();
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "OneKeyInviteInactiveRequest{");
        replace.append('}');
        return replace.toString();
    }

    public OneKeyInviteInactiveRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public OneKeyInviteInactiveRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_id = str;
        this.chat_id = str2;
    }
}
