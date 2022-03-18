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

public final class UpdateChatTabResponse extends Message<UpdateChatTabResponse, C18147a> {
    public static final ProtoAdapter<UpdateChatTabResponse> ADAPTER = new C18148b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final List<ChatTab> tabs;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabResponse$b */
    private static final class C18148b extends ProtoAdapter<UpdateChatTabResponse> {
        C18148b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatTabResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatTabResponse updateChatTabResponse) {
            int i;
            int i2 = 0;
            if (updateChatTabResponse.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, updateChatTabResponse.chat_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ChatTab.ADAPTER.asRepeated().encodedSizeWithTag(2, updateChatTabResponse.tabs);
            if (updateChatTabResponse.version != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, updateChatTabResponse.version);
            }
            return encodedSizeWithTag + i2 + updateChatTabResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatTabResponse decode(ProtoReader protoReader) throws IOException {
            C18147a aVar = new C18147a();
            aVar.f45344a = 0L;
            aVar.f45346c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45344a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45345b.add(ChatTab.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45346c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatTabResponse updateChatTabResponse) throws IOException {
            if (updateChatTabResponse.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateChatTabResponse.chat_id);
            }
            ChatTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, updateChatTabResponse.tabs);
            if (updateChatTabResponse.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, updateChatTabResponse.version);
            }
            protoWriter.writeBytes(updateChatTabResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabResponse$a */
    public static final class C18147a extends Message.Builder<UpdateChatTabResponse, C18147a> {

        /* renamed from: a */
        public Long f45344a;

        /* renamed from: b */
        public List<ChatTab> f45345b = Internal.newMutableList();

        /* renamed from: c */
        public Long f45346c;

        /* renamed from: a */
        public UpdateChatTabResponse build() {
            return new UpdateChatTabResponse(this.f45344a, this.f45345b, this.f45346c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18147a newBuilder() {
        C18147a aVar = new C18147a();
        aVar.f45344a = this.chat_id;
        aVar.f45345b = Internal.copyOf("tabs", this.tabs);
        aVar.f45346c = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatTabResponse");
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
        StringBuilder replace = sb.replace(0, 2, "UpdateChatTabResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatTabResponse(Long l, List<ChatTab> list, Long l2) {
        this(l, list, l2, ByteString.EMPTY);
    }

    public UpdateChatTabResponse(Long l, List<ChatTab> list, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.tabs = Internal.immutableCopyOf("tabs", list);
        this.version = l2;
    }
}
