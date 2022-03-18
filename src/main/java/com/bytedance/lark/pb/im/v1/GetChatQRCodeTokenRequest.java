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

public final class GetChatQRCodeTokenRequest extends Message<GetChatQRCodeTokenRequest, C17546a> {
    public static final ProtoAdapter<GetChatQRCodeTokenRequest> ADAPTER = new C17547b();
    public static final Integer DEFAULT_EXPIRED_DAY = 7;
    public static final Boolean DEFAULT_IS_UNLIMITED = false;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer expired_day;
    public final Boolean is_unlimited;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeTokenRequest$b */
    private static final class C17547b extends ProtoAdapter<GetChatQRCodeTokenRequest> {
        C17547b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatQRCodeTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatQRCodeTokenRequest getChatQRCodeTokenRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatQRCodeTokenRequest.chat_id);
            int i2 = 0;
            if (getChatQRCodeTokenRequest.expired_day != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getChatQRCodeTokenRequest.expired_day);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatQRCodeTokenRequest.is_unlimited != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getChatQRCodeTokenRequest.is_unlimited);
            }
            return i3 + i2 + getChatQRCodeTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatQRCodeTokenRequest decode(ProtoReader protoReader) throws IOException {
            C17546a aVar = new C17546a();
            aVar.f44505a = "";
            aVar.f44506b = 7;
            aVar.f44507c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44505a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44506b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44507c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatQRCodeTokenRequest getChatQRCodeTokenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatQRCodeTokenRequest.chat_id);
            if (getChatQRCodeTokenRequest.expired_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getChatQRCodeTokenRequest.expired_day);
            }
            if (getChatQRCodeTokenRequest.is_unlimited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getChatQRCodeTokenRequest.is_unlimited);
            }
            protoWriter.writeBytes(getChatQRCodeTokenRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17546a newBuilder() {
        C17546a aVar = new C17546a();
        aVar.f44505a = this.chat_id;
        aVar.f44506b = this.expired_day;
        aVar.f44507c = this.is_unlimited;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeTokenRequest$a */
    public static final class C17546a extends Message.Builder<GetChatQRCodeTokenRequest, C17546a> {

        /* renamed from: a */
        public String f44505a;

        /* renamed from: b */
        public Integer f44506b;

        /* renamed from: c */
        public Boolean f44507c;

        /* renamed from: a */
        public GetChatQRCodeTokenRequest build() {
            String str = this.f44505a;
            if (str != null) {
                return new GetChatQRCodeTokenRequest(str, this.f44506b, this.f44507c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17546a mo61437a(Integer num) {
            this.f44506b = num;
            return this;
        }

        /* renamed from: a */
        public C17546a mo61438a(String str) {
            this.f44505a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatQRCodeTokenRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.expired_day != null) {
            sb.append(", expired_day=");
            sb.append(this.expired_day);
        }
        if (this.is_unlimited != null) {
            sb.append(", is_unlimited=");
            sb.append(this.is_unlimited);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatQRCodeTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatQRCodeTokenRequest(String str, Integer num, Boolean bool) {
        this(str, num, bool, ByteString.EMPTY);
    }

    public GetChatQRCodeTokenRequest(String str, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.expired_day = num;
        this.is_unlimited = bool;
    }
}
