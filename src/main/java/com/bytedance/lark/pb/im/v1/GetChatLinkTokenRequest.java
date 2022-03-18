package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatLinkTokenRequest extends Message<GetChatLinkTokenRequest, C17524a> {
    public static final ProtoAdapter<GetChatLinkTokenRequest> ADAPTER = new C17525b();
    public static final Integer DEFAULT_EXPIRED_DAY = 7;
    private static final long serialVersionUID = 0;
    public final String app_name;
    public final String chat_id;
    public final Integer expired_day;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkTokenRequest$b */
    private static final class C17525b extends ProtoAdapter<GetChatLinkTokenRequest> {
        C17525b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatLinkTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatLinkTokenRequest getChatLinkTokenRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatLinkTokenRequest.chat_id);
            int i2 = 0;
            if (getChatLinkTokenRequest.expired_day != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getChatLinkTokenRequest.expired_day);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatLinkTokenRequest.app_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getChatLinkTokenRequest.app_name);
            }
            return i3 + i2 + getChatLinkTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatLinkTokenRequest decode(ProtoReader protoReader) throws IOException {
            C17524a aVar = new C17524a();
            aVar.f44455a = "";
            aVar.f44456b = 7;
            aVar.f44457c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44455a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44456b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44457c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatLinkTokenRequest getChatLinkTokenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatLinkTokenRequest.chat_id);
            if (getChatLinkTokenRequest.expired_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getChatLinkTokenRequest.expired_day);
            }
            if (getChatLinkTokenRequest.app_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getChatLinkTokenRequest.app_name);
            }
            protoWriter.writeBytes(getChatLinkTokenRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17524a newBuilder() {
        C17524a aVar = new C17524a();
        aVar.f44455a = this.chat_id;
        aVar.f44456b = this.expired_day;
        aVar.f44457c = this.app_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkTokenRequest$a */
    public static final class C17524a extends Message.Builder<GetChatLinkTokenRequest, C17524a> {

        /* renamed from: a */
        public String f44455a;

        /* renamed from: b */
        public Integer f44456b;

        /* renamed from: c */
        public String f44457c;

        /* renamed from: a */
        public GetChatLinkTokenRequest build() {
            String str = this.f44455a;
            if (str != null) {
                return new GetChatLinkTokenRequest(str, this.f44456b, this.f44457c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17524a mo61375a(Integer num) {
            this.f44456b = num;
            return this;
        }

        /* renamed from: b */
        public C17524a mo61378b(String str) {
            this.f44457c = str;
            return this;
        }

        /* renamed from: a */
        public C17524a mo61376a(String str) {
            this.f44455a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatLinkTokenRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.expired_day != null) {
            sb.append(", expired_day=");
            sb.append(this.expired_day);
        }
        if (this.app_name != null) {
            sb.append(", app_name=");
            sb.append(this.app_name);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatLinkTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatLinkTokenRequest(String str, Integer num, String str2) {
        this(str, num, str2, ByteString.EMPTY);
    }

    public GetChatLinkTokenRequest(String str, Integer num, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.expired_day = num;
        this.app_name = str2;
    }
}
