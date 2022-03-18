package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushChatTopNoticeInfo extends Message<PushChatTopNoticeInfo, C17881a> {
    public static final ProtoAdapter<PushChatTopNoticeInfo> ADAPTER = new C17882b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final ChatTopNotice top_notice_info;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatTopNoticeInfo$b */
    private static final class C17882b extends ProtoAdapter<PushChatTopNoticeInfo> {
        C17882b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushChatTopNoticeInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(PushChatTopNoticeInfo pushChatTopNoticeInfo) {
            int i;
            int i2 = 0;
            if (pushChatTopNoticeInfo.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, pushChatTopNoticeInfo.chat_id);
            } else {
                i = 0;
            }
            if (pushChatTopNoticeInfo.top_notice_info != null) {
                i2 = ChatTopNotice.ADAPTER.encodedSizeWithTag(2, pushChatTopNoticeInfo.top_notice_info);
            }
            return i + i2 + pushChatTopNoticeInfo.unknownFields().size();
        }

        /* renamed from: a */
        public PushChatTopNoticeInfo decode(ProtoReader protoReader) throws IOException {
            C17881a aVar = new C17881a();
            aVar.f44956a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44956a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44957b = ChatTopNotice.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushChatTopNoticeInfo pushChatTopNoticeInfo) throws IOException {
            if (pushChatTopNoticeInfo.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pushChatTopNoticeInfo.chat_id);
            }
            if (pushChatTopNoticeInfo.top_notice_info != null) {
                ChatTopNotice.ADAPTER.encodeWithTag(protoWriter, 2, pushChatTopNoticeInfo.top_notice_info);
            }
            protoWriter.writeBytes(pushChatTopNoticeInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatTopNoticeInfo$a */
    public static final class C17881a extends Message.Builder<PushChatTopNoticeInfo, C17881a> {

        /* renamed from: a */
        public Long f44956a;

        /* renamed from: b */
        public ChatTopNotice f44957b;

        /* renamed from: a */
        public PushChatTopNoticeInfo build() {
            return new PushChatTopNoticeInfo(this.f44956a, this.f44957b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17881a newBuilder() {
        C17881a aVar = new C17881a();
        aVar.f44956a = this.chat_id;
        aVar.f44957b = this.top_notice_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushChatTopNoticeInfo");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.top_notice_info != null) {
            sb.append(", top_notice_info=");
            sb.append(this.top_notice_info);
        }
        StringBuilder replace = sb.replace(0, 2, "PushChatTopNoticeInfo{");
        replace.append('}');
        return replace.toString();
    }

    public PushChatTopNoticeInfo(Long l, ChatTopNotice chatTopNotice) {
        this(l, chatTopNotice, ByteString.EMPTY);
    }

    public PushChatTopNoticeInfo(Long l, ChatTopNotice chatTopNotice, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.top_notice_info = chatTopNotice;
    }
}
