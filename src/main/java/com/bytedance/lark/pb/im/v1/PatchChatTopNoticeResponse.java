package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchChatTopNoticeResponse extends Message<PatchChatTopNoticeResponse, C17823a> {
    public static final ProtoAdapter<PatchChatTopNoticeResponse> ADAPTER = new C17824b();
    private static final long serialVersionUID = 0;
    public final ChatTopNotice top_notice_info;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatTopNoticeResponse$b */
    private static final class C17824b extends ProtoAdapter<PatchChatTopNoticeResponse> {
        C17824b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchChatTopNoticeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchChatTopNoticeResponse patchChatTopNoticeResponse) {
            int i;
            if (patchChatTopNoticeResponse.top_notice_info != null) {
                i = ChatTopNotice.ADAPTER.encodedSizeWithTag(1, patchChatTopNoticeResponse.top_notice_info);
            } else {
                i = 0;
            }
            return i + patchChatTopNoticeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchChatTopNoticeResponse decode(ProtoReader protoReader) throws IOException {
            C17823a aVar = new C17823a();
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
                    aVar.f44883a = ChatTopNotice.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchChatTopNoticeResponse patchChatTopNoticeResponse) throws IOException {
            if (patchChatTopNoticeResponse.top_notice_info != null) {
                ChatTopNotice.ADAPTER.encodeWithTag(protoWriter, 1, patchChatTopNoticeResponse.top_notice_info);
            }
            protoWriter.writeBytes(patchChatTopNoticeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatTopNoticeResponse$a */
    public static final class C17823a extends Message.Builder<PatchChatTopNoticeResponse, C17823a> {

        /* renamed from: a */
        public ChatTopNotice f44883a;

        /* renamed from: a */
        public PatchChatTopNoticeResponse build() {
            return new PatchChatTopNoticeResponse(this.f44883a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17823a newBuilder() {
        C17823a aVar = new C17823a();
        aVar.f44883a = this.top_notice_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchChatTopNoticeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.top_notice_info != null) {
            sb.append(", top_notice_info=");
            sb.append(this.top_notice_info);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchChatTopNoticeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchChatTopNoticeResponse(ChatTopNotice chatTopNotice) {
        this(chatTopNotice, ByteString.EMPTY);
    }

    public PatchChatTopNoticeResponse(ChatTopNotice chatTopNotice, ByteString byteString) {
        super(ADAPTER, byteString);
        this.top_notice_info = chatTopNotice;
    }
}
