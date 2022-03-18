package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.TeamChatType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateTeamChatRequest extends Message<CreateTeamChatRequest, C17380a> {
    public static final ProtoAdapter<CreateTeamChatRequest> ADAPTER = new C17381b();
    public static final Chat.ChatMode DEFAULT_CHAT_MODE = Chat.ChatMode.UNKNOWN;
    public static final Boolean DEFAULT_IS_REMIND = false;
    public static final TeamChatType DEFAULT_TEAM_CHAT_TYPE = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final AvatarMeta avatar_meta;
    public final Chat.ChatMode chat_mode;
    public final String description;
    public final String group_name;
    public final Boolean is_remind;
    public final TeamChatType team_chat_type;
    public final Long team_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamChatRequest$b */
    private static final class C17381b extends ProtoAdapter<CreateTeamChatRequest> {
        C17381b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTeamChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTeamChatRequest createTeamChatRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (createTeamChatRequest.team_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, createTeamChatRequest.team_id);
            } else {
                i = 0;
            }
            if (createTeamChatRequest.chat_mode != null) {
                i2 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(2, createTeamChatRequest.chat_mode);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (createTeamChatRequest.group_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, createTeamChatRequest.group_name);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (createTeamChatRequest.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, createTeamChatRequest.avatar_key);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (createTeamChatRequest.avatar_meta != null) {
                i5 = AvatarMeta.ADAPTER.encodedSizeWithTag(5, createTeamChatRequest.avatar_meta);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (createTeamChatRequest.team_chat_type != null) {
                i6 = TeamChatType.ADAPTER.encodedSizeWithTag(6, createTeamChatRequest.team_chat_type);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (createTeamChatRequest.description != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, createTeamChatRequest.description);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (createTeamChatRequest.is_remind != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(10, createTeamChatRequest.is_remind);
            }
            return i14 + i8 + createTeamChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTeamChatRequest decode(ProtoReader protoReader) throws IOException {
            C17380a aVar = new C17380a();
            aVar.f44275a = 0L;
            aVar.f44276b = Chat.ChatMode.UNKNOWN;
            aVar.f44277c = "";
            aVar.f44278d = "";
            aVar.f44280f = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
            aVar.f44281g = "";
            aVar.f44282h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 10) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44275a = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f44276b = Chat.ChatMode.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44277c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f44278d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f44279e = AvatarMeta.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            try {
                                aVar.f44280f = TeamChatType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f44281g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f44282h = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateTeamChatRequest createTeamChatRequest) throws IOException {
            if (createTeamChatRequest.team_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, createTeamChatRequest.team_id);
            }
            if (createTeamChatRequest.chat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 2, createTeamChatRequest.chat_mode);
            }
            if (createTeamChatRequest.group_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createTeamChatRequest.group_name);
            }
            if (createTeamChatRequest.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createTeamChatRequest.avatar_key);
            }
            if (createTeamChatRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 5, createTeamChatRequest.avatar_meta);
            }
            if (createTeamChatRequest.team_chat_type != null) {
                TeamChatType.ADAPTER.encodeWithTag(protoWriter, 6, createTeamChatRequest.team_chat_type);
            }
            if (createTeamChatRequest.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, createTeamChatRequest.description);
            }
            if (createTeamChatRequest.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, createTeamChatRequest.is_remind);
            }
            protoWriter.writeBytes(createTeamChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamChatRequest$a */
    public static final class C17380a extends Message.Builder<CreateTeamChatRequest, C17380a> {

        /* renamed from: a */
        public Long f44275a;

        /* renamed from: b */
        public Chat.ChatMode f44276b;

        /* renamed from: c */
        public String f44277c;

        /* renamed from: d */
        public String f44278d;

        /* renamed from: e */
        public AvatarMeta f44279e;

        /* renamed from: f */
        public TeamChatType f44280f;

        /* renamed from: g */
        public String f44281g;

        /* renamed from: h */
        public Boolean f44282h;

        /* renamed from: a */
        public CreateTeamChatRequest build() {
            return new CreateTeamChatRequest(this.f44275a, this.f44276b, this.f44277c, this.f44278d, this.f44279e, this.f44280f, this.f44281g, this.f44282h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17380a mo61004a(Chat.ChatMode chatMode) {
            this.f44276b = chatMode;
            return this;
        }

        /* renamed from: b */
        public C17380a mo61009b(String str) {
            this.f44281g = str;
            return this;
        }

        /* renamed from: a */
        public C17380a mo61005a(TeamChatType teamChatType) {
            this.f44280f = teamChatType;
            return this;
        }

        /* renamed from: a */
        public C17380a mo61006a(Long l) {
            this.f44275a = l;
            return this;
        }

        /* renamed from: a */
        public C17380a mo61007a(String str) {
            this.f44277c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17380a newBuilder() {
        C17380a aVar = new C17380a();
        aVar.f44275a = this.team_id;
        aVar.f44276b = this.chat_mode;
        aVar.f44277c = this.group_name;
        aVar.f44278d = this.avatar_key;
        aVar.f44279e = this.avatar_meta;
        aVar.f44280f = this.team_chat_type;
        aVar.f44281g = this.description;
        aVar.f44282h = this.is_remind;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateTeamChatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.team_id != null) {
            sb.append(", team_id=");
            sb.append(this.team_id);
        }
        if (this.chat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.chat_mode);
        }
        if (this.group_name != null) {
            sb.append(", group_name=");
            sb.append(this.group_name);
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
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateTeamChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTeamChatRequest(Long l, Chat.ChatMode chatMode, String str, String str2, AvatarMeta avatarMeta, TeamChatType teamChatType, String str3, Boolean bool) {
        this(l, chatMode, str, str2, avatarMeta, teamChatType, str3, bool, ByteString.EMPTY);
    }

    public CreateTeamChatRequest(Long l, Chat.ChatMode chatMode, String str, String str2, AvatarMeta avatarMeta, TeamChatType teamChatType, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_id = l;
        this.chat_mode = chatMode;
        this.group_name = str;
        this.avatar_key = str2;
        this.avatar_meta = avatarMeta;
        this.team_chat_type = teamChatType;
        this.description = str3;
        this.is_remind = bool;
    }
}
