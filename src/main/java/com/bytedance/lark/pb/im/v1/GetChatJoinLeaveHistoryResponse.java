package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChatJoinLeaveHistory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatJoinLeaveHistoryResponse extends Message<GetChatJoinLeaveHistoryResponse, C17514a> {
    public static final ProtoAdapter<GetChatJoinLeaveHistoryResponse> ADAPTER = new C17515b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<ChatJoinLeaveHistory> chatter_history;
    public final Boolean has_more;
    public final String next_cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatJoinLeaveHistoryResponse$b */
    private static final class C17515b extends ProtoAdapter<GetChatJoinLeaveHistoryResponse> {
        C17515b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatJoinLeaveHistoryResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatJoinLeaveHistoryResponse getChatJoinLeaveHistoryResponse) {
            int i;
            int encodedSizeWithTag = ChatJoinLeaveHistory.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatJoinLeaveHistoryResponse.chatter_history);
            int i2 = 0;
            if (getChatJoinLeaveHistoryResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getChatJoinLeaveHistoryResponse.has_more);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatJoinLeaveHistoryResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getChatJoinLeaveHistoryResponse.next_cursor);
            }
            return i3 + i2 + getChatJoinLeaveHistoryResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatJoinLeaveHistoryResponse decode(ProtoReader protoReader) throws IOException {
            C17514a aVar = new C17514a();
            aVar.f44441b = false;
            aVar.f44442c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44440a.add(ChatJoinLeaveHistory.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44441b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44442c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatJoinLeaveHistoryResponse getChatJoinLeaveHistoryResponse) throws IOException {
            ChatJoinLeaveHistory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatJoinLeaveHistoryResponse.chatter_history);
            if (getChatJoinLeaveHistoryResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getChatJoinLeaveHistoryResponse.has_more);
            }
            if (getChatJoinLeaveHistoryResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getChatJoinLeaveHistoryResponse.next_cursor);
            }
            protoWriter.writeBytes(getChatJoinLeaveHistoryResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatJoinLeaveHistoryResponse$a */
    public static final class C17514a extends Message.Builder<GetChatJoinLeaveHistoryResponse, C17514a> {

        /* renamed from: a */
        public List<ChatJoinLeaveHistory> f44440a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44441b;

        /* renamed from: c */
        public String f44442c;

        /* renamed from: a */
        public GetChatJoinLeaveHistoryResponse build() {
            return new GetChatJoinLeaveHistoryResponse(this.f44440a, this.f44441b, this.f44442c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17514a newBuilder() {
        C17514a aVar = new C17514a();
        aVar.f44440a = Internal.copyOf("chatter_history", this.chatter_history);
        aVar.f44441b = this.has_more;
        aVar.f44442c = this.next_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatJoinLeaveHistoryResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_history.isEmpty()) {
            sb.append(", chatter_history=");
            sb.append(this.chatter_history);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatJoinLeaveHistoryResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatJoinLeaveHistoryResponse(List<ChatJoinLeaveHistory> list, Boolean bool, String str) {
        this(list, bool, str, ByteString.EMPTY);
    }

    public GetChatJoinLeaveHistoryResponse(List<ChatJoinLeaveHistory> list, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_history = Internal.immutableCopyOf("chatter_history", list);
        this.has_more = bool;
        this.next_cursor = str;
    }
}
