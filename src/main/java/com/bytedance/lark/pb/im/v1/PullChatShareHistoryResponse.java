package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChatShareInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullChatShareHistoryResponse extends Message<PullChatShareHistoryResponse, C17859a> {
    public static final ProtoAdapter<PullChatShareHistoryResponse> ADAPTER = new C17860b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final String next_cursor;
    public final List<ChatShareInfo> share_history;

    /* renamed from: com.bytedance.lark.pb.im.v1.PullChatShareHistoryResponse$b */
    private static final class C17860b extends ProtoAdapter<PullChatShareHistoryResponse> {
        C17860b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatShareHistoryResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatShareHistoryResponse pullChatShareHistoryResponse) {
            int i;
            int encodedSizeWithTag = ChatShareInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, pullChatShareHistoryResponse.share_history);
            int i2 = 0;
            if (pullChatShareHistoryResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, pullChatShareHistoryResponse.has_more);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullChatShareHistoryResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullChatShareHistoryResponse.next_cursor);
            }
            return i3 + i2 + pullChatShareHistoryResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatShareHistoryResponse decode(ProtoReader protoReader) throws IOException {
            C17859a aVar = new C17859a();
            aVar.f44926b = false;
            aVar.f44927c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44925a.add(ChatShareInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44926b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44927c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatShareHistoryResponse pullChatShareHistoryResponse) throws IOException {
            ChatShareInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullChatShareHistoryResponse.share_history);
            if (pullChatShareHistoryResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullChatShareHistoryResponse.has_more);
            }
            if (pullChatShareHistoryResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullChatShareHistoryResponse.next_cursor);
            }
            protoWriter.writeBytes(pullChatShareHistoryResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PullChatShareHistoryResponse$a */
    public static final class C17859a extends Message.Builder<PullChatShareHistoryResponse, C17859a> {

        /* renamed from: a */
        public List<ChatShareInfo> f44925a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44926b;

        /* renamed from: c */
        public String f44927c;

        /* renamed from: a */
        public PullChatShareHistoryResponse build() {
            return new PullChatShareHistoryResponse(this.f44925a, this.f44926b, this.f44927c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17859a newBuilder() {
        C17859a aVar = new C17859a();
        aVar.f44925a = Internal.copyOf("share_history", this.share_history);
        aVar.f44926b = this.has_more;
        aVar.f44927c = this.next_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PullChatShareHistoryResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.share_history.isEmpty()) {
            sb.append(", share_history=");
            sb.append(this.share_history);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatShareHistoryResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatShareHistoryResponse(List<ChatShareInfo> list, Boolean bool, String str) {
        this(list, bool, str, ByteString.EMPTY);
    }

    public PullChatShareHistoryResponse(List<ChatShareInfo> list, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_history = Internal.immutableCopyOf("share_history", list);
        this.has_more = bool;
        this.next_cursor = str;
    }
}
