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

public final class UpdateChatTabOrdersResponse extends Message<UpdateChatTabOrdersResponse, C18143a> {
    public static final ProtoAdapter<UpdateChatTabOrdersResponse> ADAPTER = new C18144b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final List<ChatTab> tabs;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabOrdersResponse$b */
    private static final class C18144b extends ProtoAdapter<UpdateChatTabOrdersResponse> {
        C18144b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatTabOrdersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatTabOrdersResponse updateChatTabOrdersResponse) {
            int i;
            int i2 = 0;
            if (updateChatTabOrdersResponse.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, updateChatTabOrdersResponse.chat_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ChatTab.ADAPTER.asRepeated().encodedSizeWithTag(2, updateChatTabOrdersResponse.tabs);
            if (updateChatTabOrdersResponse.version != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, updateChatTabOrdersResponse.version);
            }
            return encodedSizeWithTag + i2 + updateChatTabOrdersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatTabOrdersResponse decode(ProtoReader protoReader) throws IOException {
            C18143a aVar = new C18143a();
            aVar.f45338a = 0L;
            aVar.f45340c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45338a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45339b.add(ChatTab.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45340c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatTabOrdersResponse updateChatTabOrdersResponse) throws IOException {
            if (updateChatTabOrdersResponse.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateChatTabOrdersResponse.chat_id);
            }
            ChatTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, updateChatTabOrdersResponse.tabs);
            if (updateChatTabOrdersResponse.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, updateChatTabOrdersResponse.version);
            }
            protoWriter.writeBytes(updateChatTabOrdersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabOrdersResponse$a */
    public static final class C18143a extends Message.Builder<UpdateChatTabOrdersResponse, C18143a> {

        /* renamed from: a */
        public Long f45338a;

        /* renamed from: b */
        public List<ChatTab> f45339b = Internal.newMutableList();

        /* renamed from: c */
        public Long f45340c;

        /* renamed from: a */
        public UpdateChatTabOrdersResponse build() {
            return new UpdateChatTabOrdersResponse(this.f45338a, this.f45339b, this.f45340c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18143a newBuilder() {
        C18143a aVar = new C18143a();
        aVar.f45338a = this.chat_id;
        aVar.f45339b = Internal.copyOf("tabs", this.tabs);
        aVar.f45340c = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatTabOrdersResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (!this.tabs.isEmpty()) {
            sb.append(", tabs=");
            sb.append(this.tabs);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateChatTabOrdersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatTabOrdersResponse(Long l, List<ChatTab> list, Long l2) {
        this(l, list, l2, ByteString.EMPTY);
    }

    public UpdateChatTabOrdersResponse(Long l, List<ChatTab> list, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.tabs = Internal.immutableCopyOf("tabs", list);
        this.version = l2;
    }
}
