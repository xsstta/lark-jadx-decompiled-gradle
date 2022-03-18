package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Chat;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullChangeGroupMemberAuthorizationRequest extends Message<PullChangeGroupMemberAuthorizationRequest, C49584a> {
    public static final ProtoAdapter<PullChangeGroupMemberAuthorizationRequest> ADAPTER = new C49585b();
    public static final Long DEFAULT_FROM_CHAT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Chat.ChatMode mchat_mode;
    public final Long mfrom_chat_id;
    public final List<PickEntities> mpick_entities;

    /* renamed from: com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationRequest$b */
    private static final class C49585b extends ProtoAdapter<PullChangeGroupMemberAuthorizationRequest> {
        C49585b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChangeGroupMemberAuthorizationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChangeGroupMemberAuthorizationRequest pullChangeGroupMemberAuthorizationRequest) {
            int i;
            int encodedSizeWithTag = PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(1, pullChangeGroupMemberAuthorizationRequest.mpick_entities);
            int i2 = 0;
            if (pullChangeGroupMemberAuthorizationRequest.mchat_mode != null) {
                i = Chat.ChatMode.ADAPTER.encodedSizeWithTag(2, pullChangeGroupMemberAuthorizationRequest.mchat_mode);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullChangeGroupMemberAuthorizationRequest.mfrom_chat_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, pullChangeGroupMemberAuthorizationRequest.mfrom_chat_id);
            }
            return i3 + i2 + pullChangeGroupMemberAuthorizationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullChangeGroupMemberAuthorizationRequest decode(ProtoReader protoReader) throws IOException {
            C49584a aVar = new C49584a();
            aVar.f124201c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124199a.add(PickEntities.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        aVar.f124200b = Chat.ChatMode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124201c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChangeGroupMemberAuthorizationRequest pullChangeGroupMemberAuthorizationRequest) throws IOException {
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullChangeGroupMemberAuthorizationRequest.mpick_entities);
            if (pullChangeGroupMemberAuthorizationRequest.mchat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 2, pullChangeGroupMemberAuthorizationRequest.mchat_mode);
            }
            if (pullChangeGroupMemberAuthorizationRequest.mfrom_chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullChangeGroupMemberAuthorizationRequest.mfrom_chat_id);
            }
            protoWriter.writeBytes(pullChangeGroupMemberAuthorizationRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationRequest$a */
    public static final class C49584a extends Message.Builder<PullChangeGroupMemberAuthorizationRequest, C49584a> {

        /* renamed from: a */
        public List<PickEntities> f124199a = Internal.newMutableList();

        /* renamed from: b */
        public Chat.ChatMode f124200b;

        /* renamed from: c */
        public Long f124201c;

        /* renamed from: a */
        public PullChangeGroupMemberAuthorizationRequest build() {
            return new PullChangeGroupMemberAuthorizationRequest(this.f124199a, this.f124200b, this.f124201c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49584a mo172885a(Chat.ChatMode chatMode) {
            this.f124200b = chatMode;
            return this;
        }

        /* renamed from: a */
        public C49584a mo172886a(Long l) {
            this.f124201c = l;
            return this;
        }

        /* renamed from: a */
        public C49584a mo172887a(List<PickEntities> list) {
            Internal.checkElementsNotNull(list);
            this.f124199a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49584a newBuilder() {
        C49584a aVar = new C49584a();
        aVar.f124199a = Internal.copyOf("mpick_entities", this.mpick_entities);
        aVar.f124200b = this.mchat_mode;
        aVar.f124201c = this.mfrom_chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mpick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.mpick_entities);
        }
        if (this.mchat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.mchat_mode);
        }
        if (this.mfrom_chat_id != null) {
            sb.append(", from_chat_id=");
            sb.append(this.mfrom_chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChangeGroupMemberAuthorizationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullChangeGroupMemberAuthorizationRequest(List<PickEntities> list, Chat.ChatMode chatMode, Long l) {
        this(list, chatMode, l, ByteString.EMPTY);
    }

    public PullChangeGroupMemberAuthorizationRequest(List<PickEntities> list, Chat.ChatMode chatMode, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpick_entities = Internal.immutableCopyOf("mpick_entities", list);
        this.mchat_mode = chatMode;
        this.mfrom_chat_id = l;
    }
}
