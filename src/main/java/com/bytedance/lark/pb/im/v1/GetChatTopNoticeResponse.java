package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatTopNoticeResponse extends Message<GetChatTopNoticeResponse, C17556a> {
    public static final ProtoAdapter<GetChatTopNoticeResponse> ADAPTER = new C17557b();
    private static final long serialVersionUID = 0;
    public final ChatTopNotice top_notice_info;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTopNoticeResponse$b */
    private static final class C17557b extends ProtoAdapter<GetChatTopNoticeResponse> {
        C17557b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTopNoticeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTopNoticeResponse getChatTopNoticeResponse) {
            int i;
            if (getChatTopNoticeResponse.top_notice_info != null) {
                i = ChatTopNotice.ADAPTER.encodedSizeWithTag(1, getChatTopNoticeResponse.top_notice_info);
            } else {
                i = 0;
            }
            return i + getChatTopNoticeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTopNoticeResponse decode(ProtoReader protoReader) throws IOException {
            C17556a aVar = new C17556a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44517a = ChatTopNotice.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTopNoticeResponse getChatTopNoticeResponse) throws IOException {
            if (getChatTopNoticeResponse.top_notice_info != null) {
                ChatTopNotice.ADAPTER.encodeWithTag(protoWriter, 1, getChatTopNoticeResponse.top_notice_info);
            }
            protoWriter.writeBytes(getChatTopNoticeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTopNoticeResponse$a */
    public static final class C17556a extends Message.Builder<GetChatTopNoticeResponse, C17556a> {

        /* renamed from: a */
        public ChatTopNotice f44517a;

        /* renamed from: a */
        public GetChatTopNoticeResponse build() {
            return new GetChatTopNoticeResponse(this.f44517a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17556a newBuilder() {
        C17556a aVar = new C17556a();
        aVar.f44517a = this.top_notice_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatTopNoticeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.top_notice_info != null) {
            sb.append(", top_notice_info=");
            sb.append(this.top_notice_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatTopNoticeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTopNoticeResponse(ChatTopNotice chatTopNotice) {
        this(chatTopNotice, ByteString.EMPTY);
    }

    public GetChatTopNoticeResponse(ChatTopNotice chatTopNotice, ByteString byteString) {
        super(ADAPTER, byteString);
        this.top_notice_info = chatTopNotice;
    }
}
