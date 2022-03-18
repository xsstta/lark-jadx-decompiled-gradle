package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChattersAuthResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CollaborationExtendFields extends Message<CollaborationExtendFields, C16144a> {
    public static final ProtoAdapter<CollaborationExtendFields> ADAPTER = new C16145b();
    public static final Boolean DEFAULT_SHOW_DEPARTMENT_COUNT = false;
    private static final long serialVersionUID = 0;
    public final ChattersAuthResult auth_result;
    public final List<String> chatters_deny_invite_same_chat;
    public final List<String> chatters_in_chat_id;
    public final Boolean show_department_count;

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationExtendFields$b */
    private static final class C16145b extends ProtoAdapter<CollaborationExtendFields> {
        C16145b() {
            super(FieldEncoding.LENGTH_DELIMITED, CollaborationExtendFields.class);
        }

        /* renamed from: a */
        public int encodedSize(CollaborationExtendFields collaborationExtendFields) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, collaborationExtendFields.chatters_in_chat_id);
            int i2 = 0;
            if (collaborationExtendFields.show_department_count != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, collaborationExtendFields.show_department_count);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, collaborationExtendFields.chatters_deny_invite_same_chat);
            if (collaborationExtendFields.auth_result != null) {
                i2 = ChattersAuthResult.ADAPTER.encodedSizeWithTag(4, collaborationExtendFields.auth_result);
            }
            return encodedSizeWithTag2 + i2 + collaborationExtendFields.unknownFields().size();
        }

        /* renamed from: a */
        public CollaborationExtendFields decode(ProtoReader protoReader) throws IOException {
            C16144a aVar = new C16144a();
            aVar.f42264b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42263a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42264b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42265c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42266d = ChattersAuthResult.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CollaborationExtendFields collaborationExtendFields) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, collaborationExtendFields.chatters_in_chat_id);
            if (collaborationExtendFields.show_department_count != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, collaborationExtendFields.show_department_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, collaborationExtendFields.chatters_deny_invite_same_chat);
            if (collaborationExtendFields.auth_result != null) {
                ChattersAuthResult.ADAPTER.encodeWithTag(protoWriter, 4, collaborationExtendFields.auth_result);
            }
            protoWriter.writeBytes(collaborationExtendFields.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationExtendFields$a */
    public static final class C16144a extends Message.Builder<CollaborationExtendFields, C16144a> {

        /* renamed from: a */
        public List<String> f42263a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f42264b;

        /* renamed from: c */
        public List<String> f42265c = Internal.newMutableList();

        /* renamed from: d */
        public ChattersAuthResult f42266d;

        /* renamed from: a */
        public CollaborationExtendFields build() {
            return new CollaborationExtendFields(this.f42263a, this.f42264b, this.f42265c, this.f42266d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16144a newBuilder() {
        C16144a aVar = new C16144a();
        aVar.f42263a = Internal.copyOf("chatters_in_chat_id", this.chatters_in_chat_id);
        aVar.f42264b = this.show_department_count;
        aVar.f42265c = Internal.copyOf("chatters_deny_invite_same_chat", this.chatters_deny_invite_same_chat);
        aVar.f42266d = this.auth_result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "CollaborationExtendFields");
        StringBuilder sb = new StringBuilder();
        if (!this.chatters_in_chat_id.isEmpty()) {
            sb.append(", chatters_in_chat_id=");
            sb.append(this.chatters_in_chat_id);
        }
        if (this.show_department_count != null) {
            sb.append(", show_department_count=");
            sb.append(this.show_department_count);
        }
        if (!this.chatters_deny_invite_same_chat.isEmpty()) {
            sb.append(", chatters_deny_invite_same_chat=");
            sb.append(this.chatters_deny_invite_same_chat);
        }
        if (this.auth_result != null) {
            sb.append(", auth_result=");
            sb.append(this.auth_result);
        }
        StringBuilder replace = sb.replace(0, 2, "CollaborationExtendFields{");
        replace.append('}');
        return replace.toString();
    }

    public CollaborationExtendFields(List<String> list, Boolean bool, List<String> list2, ChattersAuthResult chattersAuthResult) {
        this(list, bool, list2, chattersAuthResult, ByteString.EMPTY);
    }

    public CollaborationExtendFields(List<String> list, Boolean bool, List<String> list2, ChattersAuthResult chattersAuthResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatters_in_chat_id = Internal.immutableCopyOf("chatters_in_chat_id", list);
        this.show_department_count = bool;
        this.chatters_deny_invite_same_chat = Internal.immutableCopyOf("chatters_deny_invite_same_chat", list2);
        this.auth_result = chattersAuthResult;
    }
}
