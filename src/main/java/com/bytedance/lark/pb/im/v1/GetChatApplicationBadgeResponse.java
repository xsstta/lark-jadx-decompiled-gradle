package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatApplicationBadgeResponse extends Message<GetChatApplicationBadgeResponse, C17488a> {
    public static final ProtoAdapter<GetChatApplicationBadgeResponse> ADAPTER = new C17489b();
    public static final Integer DEFAULT_CHAT_BADGE = 0;
    public static final Integer DEFAULT_FRIEND_BADGE = 0;
    private static final long serialVersionUID = 0;
    public final Integer chat_badge;
    public final Integer friend_badge;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationBadgeResponse$b */
    private static final class C17489b extends ProtoAdapter<GetChatApplicationBadgeResponse> {
        C17489b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatApplicationBadgeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatApplicationBadgeResponse getChatApplicationBadgeResponse) {
            int i;
            int i2 = 0;
            if (getChatApplicationBadgeResponse.chat_badge != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getChatApplicationBadgeResponse.chat_badge);
            } else {
                i = 0;
            }
            if (getChatApplicationBadgeResponse.friend_badge != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getChatApplicationBadgeResponse.friend_badge);
            }
            return i + i2 + getChatApplicationBadgeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatApplicationBadgeResponse decode(ProtoReader protoReader) throws IOException {
            C17488a aVar = new C17488a();
            aVar.f44392a = 0;
            aVar.f44393b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44392a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44393b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatApplicationBadgeResponse getChatApplicationBadgeResponse) throws IOException {
            if (getChatApplicationBadgeResponse.chat_badge != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getChatApplicationBadgeResponse.chat_badge);
            }
            if (getChatApplicationBadgeResponse.friend_badge != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getChatApplicationBadgeResponse.friend_badge);
            }
            protoWriter.writeBytes(getChatApplicationBadgeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationBadgeResponse$a */
    public static final class C17488a extends Message.Builder<GetChatApplicationBadgeResponse, C17488a> {

        /* renamed from: a */
        public Integer f44392a;

        /* renamed from: b */
        public Integer f44393b;

        /* renamed from: a */
        public GetChatApplicationBadgeResponse build() {
            return new GetChatApplicationBadgeResponse(this.f44392a, this.f44393b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17488a newBuilder() {
        C17488a aVar = new C17488a();
        aVar.f44392a = this.chat_badge;
        aVar.f44393b = this.friend_badge;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatApplicationBadgeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat_badge != null) {
            sb.append(", chat_badge=");
            sb.append(this.chat_badge);
        }
        if (this.friend_badge != null) {
            sb.append(", friend_badge=");
            sb.append(this.friend_badge);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatApplicationBadgeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatApplicationBadgeResponse(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetChatApplicationBadgeResponse(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_badge = num;
        this.friend_badge = num2;
    }
}
