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

public final class AddChatTabResponse extends Message<AddChatTabResponse, C17288a> {
    public static final ProtoAdapter<AddChatTabResponse> ADAPTER = new C17289b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_NEW_TAB_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final Long new_tab_id;
    public final List<ChatTab> tabs;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatTabResponse$b */
    private static final class C17289b extends ProtoAdapter<AddChatTabResponse> {
        C17289b() {
            super(FieldEncoding.LENGTH_DELIMITED, AddChatTabResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(AddChatTabResponse addChatTabResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (addChatTabResponse.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, addChatTabResponse.chat_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ChatTab.ADAPTER.asRepeated().encodedSizeWithTag(2, addChatTabResponse.tabs);
            if (addChatTabResponse.version != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, addChatTabResponse.version);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (addChatTabResponse.new_tab_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, addChatTabResponse.new_tab_id);
            }
            return i4 + i3 + addChatTabResponse.unknownFields().size();
        }

        /* renamed from: a */
        public AddChatTabResponse decode(ProtoReader protoReader) throws IOException {
            C17288a aVar = new C17288a();
            aVar.f44124a = 0L;
            aVar.f44126c = 0L;
            aVar.f44127d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44124a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44125b.add(ChatTab.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44126c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44127d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AddChatTabResponse addChatTabResponse) throws IOException {
            if (addChatTabResponse.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, addChatTabResponse.chat_id);
            }
            ChatTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, addChatTabResponse.tabs);
            if (addChatTabResponse.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, addChatTabResponse.version);
            }
            if (addChatTabResponse.new_tab_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, addChatTabResponse.new_tab_id);
            }
            protoWriter.writeBytes(addChatTabResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatTabResponse$a */
    public static final class C17288a extends Message.Builder<AddChatTabResponse, C17288a> {

        /* renamed from: a */
        public Long f44124a;

        /* renamed from: b */
        public List<ChatTab> f44125b = Internal.newMutableList();

        /* renamed from: c */
        public Long f44126c;

        /* renamed from: d */
        public Long f44127d;

        /* renamed from: a */
        public AddChatTabResponse build() {
            return new AddChatTabResponse(this.f44124a, this.f44125b, this.f44126c, this.f44127d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17288a newBuilder() {
        C17288a aVar = new C17288a();
        aVar.f44124a = this.chat_id;
        aVar.f44125b = Internal.copyOf("tabs", this.tabs);
        aVar.f44126c = this.version;
        aVar.f44127d = this.new_tab_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "AddChatTabResponse");
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
        if (this.new_tab_id != null) {
            sb.append(", new_tab_id=");
            sb.append(this.new_tab_id);
        }
        StringBuilder replace = sb.replace(0, 2, "AddChatTabResponse{");
        replace.append('}');
        return replace.toString();
    }

    public AddChatTabResponse(Long l, List<ChatTab> list, Long l2, Long l3) {
        this(l, list, l2, l3, ByteString.EMPTY);
    }

    public AddChatTabResponse(Long l, List<ChatTab> list, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.tabs = Internal.immutableCopyOf("tabs", list);
        this.version = l2;
        this.new_tab_id = l3;
    }
}
