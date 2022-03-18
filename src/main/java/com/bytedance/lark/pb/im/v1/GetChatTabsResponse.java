package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatTabsResponse extends Message<GetChatTabsResponse, C17552a> {
    public static final ProtoAdapter<GetChatTabsResponse> ADAPTER = new C17553b();
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final List<ChatTab> tabs;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTabsResponse$b */
    private static final class C17553b extends ProtoAdapter<GetChatTabsResponse> {
        C17553b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTabsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTabsResponse getChatTabsResponse) {
            int i;
            int encodedSizeWithTag = ChatTab.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatTabsResponse.tabs);
            if (getChatTabsResponse.version != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getChatTabsResponse.version);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getChatTabsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTabsResponse decode(ProtoReader protoReader) throws IOException {
            C17552a aVar = new C17552a();
            aVar.f44515b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44514a.add(ChatTab.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44515b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTabsResponse getChatTabsResponse) throws IOException {
            ChatTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatTabsResponse.tabs);
            if (getChatTabsResponse.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getChatTabsResponse.version);
            }
            protoWriter.writeBytes(getChatTabsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTabsResponse$a */
    public static final class C17552a extends Message.Builder<GetChatTabsResponse, C17552a> {

        /* renamed from: a */
        public List<ChatTab> f44514a = Internal.newMutableList();

        /* renamed from: b */
        public Long f44515b;

        /* renamed from: a */
        public GetChatTabsResponse build() {
            return new GetChatTabsResponse(this.f44514a, this.f44515b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17552a newBuilder() {
        C17552a aVar = new C17552a();
        aVar.f44514a = Internal.copyOf("tabs", this.tabs);
        aVar.f44515b = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatTabsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.tabs.isEmpty()) {
            sb.append(", tabs=");
            sb.append(this.tabs);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatTabsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTabsResponse(List<ChatTab> list, Long l) {
        this(list, l, ByteString.EMPTY);
    }

    public GetChatTabsResponse(List<ChatTab> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tabs = Internal.immutableCopyOf("tabs", list);
        this.version = l;
    }
}
