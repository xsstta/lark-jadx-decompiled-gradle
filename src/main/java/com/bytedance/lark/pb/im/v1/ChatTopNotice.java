package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ChatTopNotice extends Message<ChatTopNotice, C17316a> {
    public static final ProtoAdapter<ChatTopNotice> ADAPTER = new C17317b();
    public static final Boolean DEFAULT_CLOSED = false;
    public static final Integer DEFAULT_NOTICE_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Boolean closed;
    public final ChatTopNoticeContent content;
    public final Integer notice_version;
    public final Chatter operator;

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatTopNotice$b */
    private static final class C17317b extends ProtoAdapter<ChatTopNotice> {
        C17317b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatTopNotice.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatTopNotice chatTopNotice) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (chatTopNotice.content != null) {
                i = ChatTopNoticeContent.ADAPTER.encodedSizeWithTag(1, chatTopNotice.content);
            } else {
                i = 0;
            }
            if (chatTopNotice.operator != null) {
                i2 = Chatter.ADAPTER.encodedSizeWithTag(2, chatTopNotice.operator);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (chatTopNotice.notice_version != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, chatTopNotice.notice_version);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (chatTopNotice.closed != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, chatTopNotice.closed);
            }
            return i6 + i4 + chatTopNotice.unknownFields().size();
        }

        /* renamed from: a */
        public ChatTopNotice decode(ProtoReader protoReader) throws IOException {
            C17316a aVar = new C17316a();
            aVar.f44165c = 0;
            aVar.f44166d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44163a = ChatTopNoticeContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44164b = Chatter.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44165c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44166d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatTopNotice chatTopNotice) throws IOException {
            if (chatTopNotice.content != null) {
                ChatTopNoticeContent.ADAPTER.encodeWithTag(protoWriter, 1, chatTopNotice.content);
            }
            if (chatTopNotice.operator != null) {
                Chatter.ADAPTER.encodeWithTag(protoWriter, 2, chatTopNotice.operator);
            }
            if (chatTopNotice.notice_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, chatTopNotice.notice_version);
            }
            if (chatTopNotice.closed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, chatTopNotice.closed);
            }
            protoWriter.writeBytes(chatTopNotice.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatTopNotice$a */
    public static final class C17316a extends Message.Builder<ChatTopNotice, C17316a> {

        /* renamed from: a */
        public ChatTopNoticeContent f44163a;

        /* renamed from: b */
        public Chatter f44164b;

        /* renamed from: c */
        public Integer f44165c;

        /* renamed from: d */
        public Boolean f44166d;

        /* renamed from: a */
        public ChatTopNotice build() {
            return new ChatTopNotice(this.f44163a, this.f44164b, this.f44165c, this.f44166d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17316a newBuilder() {
        C17316a aVar = new C17316a();
        aVar.f44163a = this.content;
        aVar.f44164b = this.operator;
        aVar.f44165c = this.notice_version;
        aVar.f44166d = this.closed;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ChatTopNotice");
        StringBuilder sb = new StringBuilder();
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.operator != null) {
            sb.append(", operator=");
            sb.append(this.operator);
        }
        if (this.notice_version != null) {
            sb.append(", notice_version=");
            sb.append(this.notice_version);
        }
        if (this.closed != null) {
            sb.append(", closed=");
            sb.append(this.closed);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatTopNotice{");
        replace.append('}');
        return replace.toString();
    }

    public ChatTopNotice(ChatTopNoticeContent chatTopNoticeContent, Chatter chatter, Integer num, Boolean bool) {
        this(chatTopNoticeContent, chatter, num, bool, ByteString.EMPTY);
    }

    public ChatTopNotice(ChatTopNoticeContent chatTopNoticeContent, Chatter chatter, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content = chatTopNoticeContent;
        this.operator = chatter;
        this.notice_version = num;
        this.closed = bool;
    }
}
