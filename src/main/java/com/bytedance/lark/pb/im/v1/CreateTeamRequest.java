package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateTeamRequest extends Message<CreateTeamRequest, C17384a> {
    public static final ProtoAdapter<CreateTeamRequest> ADAPTER = new C17385b();
    public static final Chat.ChatMode DEFAULT_DEFAULT_CHAT_MODE = Chat.ChatMode.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final AvatarMeta avatar_meta;
    public final Chat.ChatMode default_chat_mode;
    public final String description;
    public final String name;
    public final List<PickEntities> pick_entities;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamRequest$b */
    private static final class C17385b extends ProtoAdapter<CreateTeamRequest> {
        C17385b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTeamRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTeamRequest createTeamRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (createTeamRequest.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createTeamRequest.name);
            } else {
                i = 0;
            }
            if (createTeamRequest.default_chat_mode != null) {
                i2 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(2, createTeamRequest.default_chat_mode);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (createTeamRequest.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, createTeamRequest.description);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (createTeamRequest.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, createTeamRequest.avatar_key);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (createTeamRequest.avatar_meta != null) {
                i5 = AvatarMeta.ADAPTER.encodedSizeWithTag(5, createTeamRequest.avatar_meta);
            }
            return i8 + i5 + PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(10, createTeamRequest.pick_entities) + createTeamRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTeamRequest decode(ProtoReader protoReader) throws IOException {
            C17384a aVar = new C17384a();
            aVar.f44284a = "";
            aVar.f44285b = Chat.ChatMode.UNKNOWN;
            aVar.f44286c = "";
            aVar.f44287d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44284a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f44285b = Chat.ChatMode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f44286c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44287d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f44288e = AvatarMeta.ADAPTER.decode(protoReader);
                } else if (nextTag != 10) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44289f.add(PickEntities.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateTeamRequest createTeamRequest) throws IOException {
            if (createTeamRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createTeamRequest.name);
            }
            if (createTeamRequest.default_chat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 2, createTeamRequest.default_chat_mode);
            }
            if (createTeamRequest.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createTeamRequest.description);
            }
            if (createTeamRequest.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createTeamRequest.avatar_key);
            }
            if (createTeamRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 5, createTeamRequest.avatar_meta);
            }
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, createTeamRequest.pick_entities);
            protoWriter.writeBytes(createTeamRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamRequest$a */
    public static final class C17384a extends Message.Builder<CreateTeamRequest, C17384a> {

        /* renamed from: a */
        public String f44284a;

        /* renamed from: b */
        public Chat.ChatMode f44285b;

        /* renamed from: c */
        public String f44286c;

        /* renamed from: d */
        public String f44287d;

        /* renamed from: e */
        public AvatarMeta f44288e;

        /* renamed from: f */
        public List<PickEntities> f44289f = Internal.newMutableList();

        /* renamed from: a */
        public CreateTeamRequest build() {
            return new CreateTeamRequest(this.f44284a, this.f44285b, this.f44286c, this.f44287d, this.f44288e, this.f44289f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17384a mo61017a(AvatarMeta avatarMeta) {
            this.f44288e = avatarMeta;
            return this;
        }

        /* renamed from: b */
        public C17384a mo61022b(String str) {
            this.f44286c = str;
            return this;
        }

        /* renamed from: c */
        public C17384a mo61023c(String str) {
            this.f44287d = str;
            return this;
        }

        /* renamed from: a */
        public C17384a mo61018a(Chat.ChatMode chatMode) {
            this.f44285b = chatMode;
            return this;
        }

        /* renamed from: a */
        public C17384a mo61019a(String str) {
            this.f44284a = str;
            return this;
        }

        /* renamed from: a */
        public C17384a mo61020a(List<PickEntities> list) {
            Internal.checkElementsNotNull(list);
            this.f44289f = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17384a newBuilder() {
        C17384a aVar = new C17384a();
        aVar.f44284a = this.name;
        aVar.f44285b = this.default_chat_mode;
        aVar.f44286c = this.description;
        aVar.f44287d = this.avatar_key;
        aVar.f44288e = this.avatar_meta;
        aVar.f44289f = Internal.copyOf("pick_entities", this.pick_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateTeamRequest");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.default_chat_mode != null) {
            sb.append(", default_chat_mode=");
            sb.append(this.default_chat_mode);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_meta != null) {
            sb.append(", avatar_meta=");
            sb.append(this.avatar_meta);
        }
        if (!this.pick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.pick_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateTeamRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTeamRequest(String str, Chat.ChatMode chatMode, String str2, String str3, AvatarMeta avatarMeta, List<PickEntities> list) {
        this(str, chatMode, str2, str3, avatarMeta, list, ByteString.EMPTY);
    }

    public CreateTeamRequest(String str, Chat.ChatMode chatMode, String str2, String str3, AvatarMeta avatarMeta, List<PickEntities> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.default_chat_mode = chatMode;
        this.description = str2;
        this.avatar_key = str3;
        this.avatar_meta = avatarMeta;
        this.pick_entities = Internal.immutableCopyOf("pick_entities", list);
    }
}
