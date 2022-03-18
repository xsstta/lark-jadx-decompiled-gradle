package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TeamSetting extends Message<TeamSetting, C15314a> {
    public static final ProtoAdapter<TeamSetting> ADAPTER = new C15315b();
    public static final AddMemberPermission.Type DEFAULT_ADD_MEMBER_PERMISSION = AddMemberPermission.Type.UNKNOWN;
    public static final BindTeamChatPermission.Type DEFAULT_BIND_TEAM_CHAT_PERMISSION = BindTeamChatPermission.Type.BIND_TEAM_CHAT_PERMISSION_UNKNOWN;
    public static final CreateTeamChatPermission.Type DEFAULT_CREATE_TEAM_CHAT_PERMISSION = CreateTeamChatPermission.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final AddMemberPermission.Type add_member_permission;
    public final BindTeamChatPermission.Type bind_team_chat_permission;
    public final CreateTeamChatPermission.Type create_team_chat_permission;

    public static final class AddMemberPermission extends Message<AddMemberPermission, C15308a> {
        public static final ProtoAdapter<AddMemberPermission> ADAPTER = new C15309b();
        private static final long serialVersionUID = 0;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_OWNER(2);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_OWNER;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$AddMemberPermission$b */
        private static final class C15309b extends ProtoAdapter<AddMemberPermission> {
            C15309b() {
                super(FieldEncoding.LENGTH_DELIMITED, AddMemberPermission.class);
            }

            /* renamed from: a */
            public int encodedSize(AddMemberPermission addMemberPermission) {
                return addMemberPermission.unknownFields().size();
            }

            /* renamed from: a */
            public AddMemberPermission decode(ProtoReader protoReader) throws IOException {
                C15308a aVar = new C15308a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AddMemberPermission addMemberPermission) throws IOException {
                protoWriter.writeBytes(addMemberPermission.unknownFields());
            }
        }

        public AddMemberPermission() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$AddMemberPermission$a */
        public static final class C15308a extends Message.Builder<AddMemberPermission, C15308a> {
            /* renamed from: a */
            public AddMemberPermission build() {
                return new AddMemberPermission(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15308a newBuilder() {
            C15308a aVar = new C15308a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AddMemberPermission");
            StringBuilder replace = new StringBuilder().replace(0, 2, "AddMemberPermission{");
            replace.append('}');
            return replace.toString();
        }

        public AddMemberPermission(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class BindTeamChatPermission extends Message<BindTeamChatPermission, C15310a> {
        public static final ProtoAdapter<BindTeamChatPermission> ADAPTER = new C15311b();
        private static final long serialVersionUID = 0;

        public enum Type implements WireEnum {
            BIND_TEAM_CHAT_PERMISSION_UNKNOWN(0),
            BIND_TEAM_CHAT_PERMISSION_ALL_MEMBERS(1),
            BIND_TEAM_CHAT_PERMISSION_ONLY_OWNER(2);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return BIND_TEAM_CHAT_PERMISSION_UNKNOWN;
                }
                if (i == 1) {
                    return BIND_TEAM_CHAT_PERMISSION_ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return BIND_TEAM_CHAT_PERMISSION_ONLY_OWNER;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$BindTeamChatPermission$b */
        private static final class C15311b extends ProtoAdapter<BindTeamChatPermission> {
            C15311b() {
                super(FieldEncoding.LENGTH_DELIMITED, BindTeamChatPermission.class);
            }

            /* renamed from: a */
            public int encodedSize(BindTeamChatPermission bindTeamChatPermission) {
                return bindTeamChatPermission.unknownFields().size();
            }

            /* renamed from: a */
            public BindTeamChatPermission decode(ProtoReader protoReader) throws IOException {
                C15310a aVar = new C15310a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BindTeamChatPermission bindTeamChatPermission) throws IOException {
                protoWriter.writeBytes(bindTeamChatPermission.unknownFields());
            }
        }

        public BindTeamChatPermission() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$BindTeamChatPermission$a */
        public static final class C15310a extends Message.Builder<BindTeamChatPermission, C15310a> {
            /* renamed from: a */
            public BindTeamChatPermission build() {
                return new BindTeamChatPermission(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15310a newBuilder() {
            C15310a aVar = new C15310a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "BindTeamChatPermission");
            StringBuilder replace = new StringBuilder().replace(0, 2, "BindTeamChatPermission{");
            replace.append('}');
            return replace.toString();
        }

        public BindTeamChatPermission(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class CreateTeamChatPermission extends Message<CreateTeamChatPermission, C15312a> {
        public static final ProtoAdapter<CreateTeamChatPermission> ADAPTER = new C15313b();
        private static final long serialVersionUID = 0;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_OWNER(2);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_OWNER;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$CreateTeamChatPermission$b */
        private static final class C15313b extends ProtoAdapter<CreateTeamChatPermission> {
            C15313b() {
                super(FieldEncoding.LENGTH_DELIMITED, CreateTeamChatPermission.class);
            }

            /* renamed from: a */
            public int encodedSize(CreateTeamChatPermission createTeamChatPermission) {
                return createTeamChatPermission.unknownFields().size();
            }

            /* renamed from: a */
            public CreateTeamChatPermission decode(ProtoReader protoReader) throws IOException {
                C15312a aVar = new C15312a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CreateTeamChatPermission createTeamChatPermission) throws IOException {
                protoWriter.writeBytes(createTeamChatPermission.unknownFields());
            }
        }

        public CreateTeamChatPermission() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$CreateTeamChatPermission$a */
        public static final class C15312a extends Message.Builder<CreateTeamChatPermission, C15312a> {
            /* renamed from: a */
            public CreateTeamChatPermission build() {
                return new CreateTeamChatPermission(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15312a newBuilder() {
            C15312a aVar = new C15312a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CreateTeamChatPermission");
            StringBuilder replace = new StringBuilder().replace(0, 2, "CreateTeamChatPermission{");
            replace.append('}');
            return replace.toString();
        }

        public CreateTeamChatPermission(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$b */
    private static final class C15315b extends ProtoAdapter<TeamSetting> {
        C15315b() {
            super(FieldEncoding.LENGTH_DELIMITED, TeamSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(TeamSetting teamSetting) {
            int i;
            int i2;
            int i3 = 0;
            if (teamSetting.add_member_permission != null) {
                i = AddMemberPermission.Type.ADAPTER.encodedSizeWithTag(1, teamSetting.add_member_permission);
            } else {
                i = 0;
            }
            if (teamSetting.create_team_chat_permission != null) {
                i2 = CreateTeamChatPermission.Type.ADAPTER.encodedSizeWithTag(2, teamSetting.create_team_chat_permission);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (teamSetting.bind_team_chat_permission != null) {
                i3 = BindTeamChatPermission.Type.ADAPTER.encodedSizeWithTag(3, teamSetting.bind_team_chat_permission);
            }
            return i4 + i3 + teamSetting.unknownFields().size();
        }

        /* renamed from: a */
        public TeamSetting decode(ProtoReader protoReader) throws IOException {
            C15314a aVar = new C15314a();
            aVar.f40526a = AddMemberPermission.Type.UNKNOWN;
            aVar.f40527b = CreateTeamChatPermission.Type.UNKNOWN;
            aVar.f40528c = BindTeamChatPermission.Type.BIND_TEAM_CHAT_PERMISSION_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40526a = AddMemberPermission.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f40527b = CreateTeamChatPermission.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f40528c = BindTeamChatPermission.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TeamSetting teamSetting) throws IOException {
            if (teamSetting.add_member_permission != null) {
                AddMemberPermission.Type.ADAPTER.encodeWithTag(protoWriter, 1, teamSetting.add_member_permission);
            }
            if (teamSetting.create_team_chat_permission != null) {
                CreateTeamChatPermission.Type.ADAPTER.encodeWithTag(protoWriter, 2, teamSetting.create_team_chat_permission);
            }
            if (teamSetting.bind_team_chat_permission != null) {
                BindTeamChatPermission.Type.ADAPTER.encodeWithTag(protoWriter, 3, teamSetting.bind_team_chat_permission);
            }
            protoWriter.writeBytes(teamSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TeamSetting$a */
    public static final class C15314a extends Message.Builder<TeamSetting, C15314a> {

        /* renamed from: a */
        public AddMemberPermission.Type f40526a;

        /* renamed from: b */
        public CreateTeamChatPermission.Type f40527b;

        /* renamed from: c */
        public BindTeamChatPermission.Type f40528c;

        /* renamed from: a */
        public TeamSetting build() {
            return new TeamSetting(this.f40526a, this.f40527b, this.f40528c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15314a newBuilder() {
        C15314a aVar = new C15314a();
        aVar.f40526a = this.add_member_permission;
        aVar.f40527b = this.create_team_chat_permission;
        aVar.f40528c = this.bind_team_chat_permission;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TeamSetting");
        StringBuilder sb = new StringBuilder();
        if (this.add_member_permission != null) {
            sb.append(", add_member_permission=");
            sb.append(this.add_member_permission);
        }
        if (this.create_team_chat_permission != null) {
            sb.append(", create_team_chat_permission=");
            sb.append(this.create_team_chat_permission);
        }
        if (this.bind_team_chat_permission != null) {
            sb.append(", bind_team_chat_permission=");
            sb.append(this.bind_team_chat_permission);
        }
        StringBuilder replace = sb.replace(0, 2, "TeamSetting{");
        replace.append('}');
        return replace.toString();
    }

    public TeamSetting(AddMemberPermission.Type type, CreateTeamChatPermission.Type type2, BindTeamChatPermission.Type type3) {
        this(type, type2, type3, ByteString.EMPTY);
    }

    public TeamSetting(AddMemberPermission.Type type, CreateTeamChatPermission.Type type2, BindTeamChatPermission.Type type3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.add_member_permission = type;
        this.create_team_chat_permission = type2;
        this.bind_team_chat_permission = type3;
    }
}
