package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.bytedance.lark.pb.basic.v1.TeamChatType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpgradeToTeamRequest extends Message<UpgradeToTeamRequest, C18170a> {
    public static final ProtoAdapter<UpgradeToTeamRequest> ADAPTER = new C18171b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Chat.ChatMode DEFAULT_DEFAULT_CHAT_MODE = Chat.ChatMode.UNKNOWN;
    public static final TeamChatType DEFAULT_TEAM_CHAT_TYPE = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final AvatarMeta avatar_meta;
    public final Long chat_id;
    public final Chat.ChatMode default_chat_mode;
    public final String description;
    public final String name;
    public final List<PickEntities> pick_entities;
    public final TeamChatType team_chat_type;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpgradeToTeamRequest$b */
    private static final class C18171b extends ProtoAdapter<UpgradeToTeamRequest> {
        C18171b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpgradeToTeamRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpgradeToTeamRequest upgradeToTeamRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (upgradeToTeamRequest.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, upgradeToTeamRequest.name);
            } else {
                i = 0;
            }
            if (upgradeToTeamRequest.default_chat_mode != null) {
                i2 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(2, upgradeToTeamRequest.default_chat_mode);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (upgradeToTeamRequest.chat_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, upgradeToTeamRequest.chat_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (upgradeToTeamRequest.description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, upgradeToTeamRequest.description);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (upgradeToTeamRequest.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, upgradeToTeamRequest.avatar_key);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (upgradeToTeamRequest.avatar_meta != null) {
                i6 = AvatarMeta.ADAPTER.encodedSizeWithTag(6, upgradeToTeamRequest.avatar_meta);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (upgradeToTeamRequest.team_chat_type != null) {
                i7 = TeamChatType.ADAPTER.encodedSizeWithTag(7, upgradeToTeamRequest.team_chat_type);
            }
            return i12 + i7 + PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(10, upgradeToTeamRequest.pick_entities) + upgradeToTeamRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpgradeToTeamRequest decode(ProtoReader protoReader) throws IOException {
            C18170a aVar = new C18170a();
            aVar.f45371a = "";
            aVar.f45372b = Chat.ChatMode.UNKNOWN;
            aVar.f45373c = 0L;
            aVar.f45374d = "";
            aVar.f45375e = "";
            aVar.f45377g = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 10) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45371a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f45372b = Chat.ChatMode.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f45373c = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f45374d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f45375e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f45376f = AvatarMeta.ADAPTER.decode(protoReader);
                            continue;
                        case 7:
                            try {
                                aVar.f45377g = TeamChatType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f45378h.add(PickEntities.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpgradeToTeamRequest upgradeToTeamRequest) throws IOException {
            if (upgradeToTeamRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upgradeToTeamRequest.name);
            }
            if (upgradeToTeamRequest.default_chat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 2, upgradeToTeamRequest.default_chat_mode);
            }
            if (upgradeToTeamRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upgradeToTeamRequest.chat_id);
            }
            if (upgradeToTeamRequest.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, upgradeToTeamRequest.description);
            }
            if (upgradeToTeamRequest.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, upgradeToTeamRequest.avatar_key);
            }
            if (upgradeToTeamRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 6, upgradeToTeamRequest.avatar_meta);
            }
            if (upgradeToTeamRequest.team_chat_type != null) {
                TeamChatType.ADAPTER.encodeWithTag(protoWriter, 7, upgradeToTeamRequest.team_chat_type);
            }
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, upgradeToTeamRequest.pick_entities);
            protoWriter.writeBytes(upgradeToTeamRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpgradeToTeamRequest$a */
    public static final class C18170a extends Message.Builder<UpgradeToTeamRequest, C18170a> {

        /* renamed from: a */
        public String f45371a;

        /* renamed from: b */
        public Chat.ChatMode f45372b;

        /* renamed from: c */
        public Long f45373c;

        /* renamed from: d */
        public String f45374d;

        /* renamed from: e */
        public String f45375e;

        /* renamed from: f */
        public AvatarMeta f45376f;

        /* renamed from: g */
        public TeamChatType f45377g;

        /* renamed from: h */
        public List<PickEntities> f45378h = Internal.newMutableList();

        /* renamed from: a */
        public UpgradeToTeamRequest build() {
            return new UpgradeToTeamRequest(this.f45371a, this.f45372b, this.f45373c, this.f45374d, this.f45375e, this.f45376f, this.f45377g, this.f45378h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18170a mo63019a(Long l) {
            this.f45373c = l;
            return this;
        }

        /* renamed from: a */
        public C18170a mo63020a(String str) {
            this.f45371a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18170a newBuilder() {
        C18170a aVar = new C18170a();
        aVar.f45371a = this.name;
        aVar.f45372b = this.default_chat_mode;
        aVar.f45373c = this.chat_id;
        aVar.f45374d = this.description;
        aVar.f45375e = this.avatar_key;
        aVar.f45376f = this.avatar_meta;
        aVar.f45377g = this.team_chat_type;
        aVar.f45378h = Internal.copyOf("pick_entities", this.pick_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpgradeToTeamRequest");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.default_chat_mode != null) {
            sb.append(", default_chat_mode=");
            sb.append(this.default_chat_mode);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
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
        if (this.team_chat_type != null) {
            sb.append(", team_chat_type=");
            sb.append(this.team_chat_type);
        }
        if (!this.pick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.pick_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "UpgradeToTeamRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpgradeToTeamRequest(String str, Chat.ChatMode chatMode, Long l, String str2, String str3, AvatarMeta avatarMeta, TeamChatType teamChatType, List<PickEntities> list) {
        this(str, chatMode, l, str2, str3, avatarMeta, teamChatType, list, ByteString.EMPTY);
    }

    public UpgradeToTeamRequest(String str, Chat.ChatMode chatMode, Long l, String str2, String str3, AvatarMeta avatarMeta, TeamChatType teamChatType, List<PickEntities> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.default_chat_mode = chatMode;
        this.chat_id = l;
        this.description = str2;
        this.avatar_key = str3;
        this.avatar_meta = avatarMeta;
        this.team_chat_type = teamChatType;
        this.pick_entities = Internal.immutableCopyOf("pick_entities", list);
    }
}
