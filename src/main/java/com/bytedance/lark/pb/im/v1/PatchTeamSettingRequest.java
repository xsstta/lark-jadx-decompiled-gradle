package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.TeamSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PatchTeamSettingRequest extends Message<PatchTeamSettingRequest, C17845a> {
    public static final ProtoAdapter<PatchTeamSettingRequest> ADAPTER = new C17846b();
    public static final TeamSetting.AddMemberPermission.Type DEFAULT_ADD_MEMBER_PERMISSION = TeamSetting.AddMemberPermission.Type.UNKNOWN;
    public static final TeamSetting.BindTeamChatPermission.Type DEFAULT_BIND_TEAM_CHAT_PERMISSION = TeamSetting.BindTeamChatPermission.Type.BIND_TEAM_CHAT_PERMISSION_UNKNOWN;
    public static final TeamSetting.CreateTeamChatPermission.Type DEFAULT_CREATE_TEAM_CHAT_PERMISSION = TeamSetting.CreateTeamChatPermission.Type.UNKNOWN;
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final TeamSetting.AddMemberPermission.Type add_member_permission;
    public final TeamSetting.BindTeamChatPermission.Type bind_team_chat_permission;
    public final TeamSetting.CreateTeamChatPermission.Type create_team_chat_permission;
    public final Long team_id;
    public final List<UpdateField> update_fields;

    public enum UpdateField implements WireEnum {
        FIELD_UNKNOWN(0),
        ADD_MEMBER_PERMISSION(1),
        CREATE_TEAM_CHAT_PERMISSION(2),
        UPDATE_FIELD_BIND_TEAM_CHAT_PERMISSION(3);
        
        public static final ProtoAdapter<UpdateField> ADAPTER = ProtoAdapter.newEnumAdapter(UpdateField.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UpdateField fromValue(int i) {
            if (i == 0) {
                return FIELD_UNKNOWN;
            }
            if (i == 1) {
                return ADD_MEMBER_PERMISSION;
            }
            if (i == 2) {
                return CREATE_TEAM_CHAT_PERMISSION;
            }
            if (i != 3) {
                return null;
            }
            return UPDATE_FIELD_BIND_TEAM_CHAT_PERMISSION;
        }

        private UpdateField(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamSettingRequest$b */
    private static final class C17846b extends ProtoAdapter<PatchTeamSettingRequest> {
        C17846b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchTeamSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchTeamSettingRequest patchTeamSettingRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, patchTeamSettingRequest.team_id) + UpdateField.ADAPTER.asRepeated().encodedSizeWithTag(2, patchTeamSettingRequest.update_fields);
            int i3 = 0;
            if (patchTeamSettingRequest.add_member_permission != null) {
                i = TeamSetting.AddMemberPermission.Type.ADAPTER.encodedSizeWithTag(3, patchTeamSettingRequest.add_member_permission);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (patchTeamSettingRequest.create_team_chat_permission != null) {
                i2 = TeamSetting.CreateTeamChatPermission.Type.ADAPTER.encodedSizeWithTag(4, patchTeamSettingRequest.create_team_chat_permission);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (patchTeamSettingRequest.bind_team_chat_permission != null) {
                i3 = TeamSetting.BindTeamChatPermission.Type.ADAPTER.encodedSizeWithTag(5, patchTeamSettingRequest.bind_team_chat_permission);
            }
            return i5 + i3 + patchTeamSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchTeamSettingRequest decode(ProtoReader protoReader) throws IOException {
            C17845a aVar = new C17845a();
            aVar.f44909a = 0L;
            aVar.f44911c = TeamSetting.AddMemberPermission.Type.UNKNOWN;
            aVar.f44912d = TeamSetting.CreateTeamChatPermission.Type.UNKNOWN;
            aVar.f44913e = TeamSetting.BindTeamChatPermission.Type.BIND_TEAM_CHAT_PERMISSION_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44909a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f44910b.add(UpdateField.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f44911c = TeamSetting.AddMemberPermission.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 4) {
                    try {
                        aVar.f44912d = TeamSetting.CreateTeamChatPermission.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44913e = TeamSetting.BindTeamChatPermission.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchTeamSettingRequest patchTeamSettingRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, patchTeamSettingRequest.team_id);
            UpdateField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, patchTeamSettingRequest.update_fields);
            if (patchTeamSettingRequest.add_member_permission != null) {
                TeamSetting.AddMemberPermission.Type.ADAPTER.encodeWithTag(protoWriter, 3, patchTeamSettingRequest.add_member_permission);
            }
            if (patchTeamSettingRequest.create_team_chat_permission != null) {
                TeamSetting.CreateTeamChatPermission.Type.ADAPTER.encodeWithTag(protoWriter, 4, patchTeamSettingRequest.create_team_chat_permission);
            }
            if (patchTeamSettingRequest.bind_team_chat_permission != null) {
                TeamSetting.BindTeamChatPermission.Type.ADAPTER.encodeWithTag(protoWriter, 5, patchTeamSettingRequest.bind_team_chat_permission);
            }
            protoWriter.writeBytes(patchTeamSettingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17845a newBuilder() {
        C17845a aVar = new C17845a();
        aVar.f44909a = this.team_id;
        aVar.f44910b = Internal.copyOf("update_fields", this.update_fields);
        aVar.f44911c = this.add_member_permission;
        aVar.f44912d = this.create_team_chat_permission;
        aVar.f44913e = this.bind_team_chat_permission;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamSettingRequest$a */
    public static final class C17845a extends Message.Builder<PatchTeamSettingRequest, C17845a> {

        /* renamed from: a */
        public Long f44909a;

        /* renamed from: b */
        public List<UpdateField> f44910b = Internal.newMutableList();

        /* renamed from: c */
        public TeamSetting.AddMemberPermission.Type f44911c;

        /* renamed from: d */
        public TeamSetting.CreateTeamChatPermission.Type f44912d;

        /* renamed from: e */
        public TeamSetting.BindTeamChatPermission.Type f44913e;

        /* renamed from: a */
        public PatchTeamSettingRequest build() {
            Long l = this.f44909a;
            if (l != null) {
                return new PatchTeamSettingRequest(l, this.f44910b, this.f44911c, this.f44912d, this.f44913e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "team_id");
        }

        /* renamed from: a */
        public C17845a mo62191a(TeamSetting.AddMemberPermission.Type type) {
            this.f44911c = type;
            return this;
        }

        /* renamed from: a */
        public C17845a mo62192a(TeamSetting.BindTeamChatPermission.Type type) {
            this.f44913e = type;
            return this;
        }

        /* renamed from: a */
        public C17845a mo62193a(TeamSetting.CreateTeamChatPermission.Type type) {
            this.f44912d = type;
            return this;
        }

        /* renamed from: a */
        public C17845a mo62194a(Long l) {
            this.f44909a = l;
            return this;
        }

        /* renamed from: a */
        public C17845a mo62195a(List<UpdateField> list) {
            Internal.checkElementsNotNull(list);
            this.f44910b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchTeamSettingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", team_id=");
        sb.append(this.team_id);
        if (!this.update_fields.isEmpty()) {
            sb.append(", update_fields=");
            sb.append(this.update_fields);
        }
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
        StringBuilder replace = sb.replace(0, 2, "PatchTeamSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchTeamSettingRequest(Long l, List<UpdateField> list, TeamSetting.AddMemberPermission.Type type, TeamSetting.CreateTeamChatPermission.Type type2, TeamSetting.BindTeamChatPermission.Type type3) {
        this(l, list, type, type2, type3, ByteString.EMPTY);
    }

    public PatchTeamSettingRequest(Long l, List<UpdateField> list, TeamSetting.AddMemberPermission.Type type, TeamSetting.CreateTeamChatPermission.Type type2, TeamSetting.BindTeamChatPermission.Type type3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_id = l;
        this.update_fields = Internal.immutableCopyOf("update_fields", list);
        this.add_member_permission = type;
        this.create_team_chat_permission = type2;
        this.bind_team_chat_permission = type3;
    }
}
