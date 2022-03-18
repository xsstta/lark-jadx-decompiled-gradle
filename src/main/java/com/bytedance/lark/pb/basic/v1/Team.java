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

public final class Team extends Message<Team, C15306a> {
    public static final ProtoAdapter<Team> ADAPTER = new C15307b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Long DEFAULT_OWNER_ID = 0L;
    public static final Status DEFAULT_STATUS = Status.UNKNOWN;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final Long create_time;
    public final Long default_chat_id;
    public final String description;
    public final Long id;
    public final Integer member_count;
    public final String name;
    public final Long owner_id;
    public final TeamSetting setting;
    public final Status status;
    public final TeamUserEntity user_entity;
    public final Long version;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        ACTIVE(1),
        DISSOLVED(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACTIVE;
            }
            if (i != 2) {
                return null;
            }
            return DISSOLVED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Team$b */
    private static final class C15307b extends ProtoAdapter<Team> {
        C15307b() {
            super(FieldEncoding.LENGTH_DELIMITED, Team.class);
        }

        /* renamed from: a */
        public int encodedSize(Team team) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 0;
            if (team.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, team.id);
            } else {
                i = 0;
            }
            if (team.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, team.name);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (team.status != null) {
                i3 = Status.ADAPTER.encodedSizeWithTag(3, team.status);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (team.owner_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, team.owner_id);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (team.member_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, team.member_count);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (team.default_chat_id != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, team.default_chat_id);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (team.description != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, team.description);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (team.avatar_key != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, team.avatar_key);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (team.create_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(20, team.create_time);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (team.version != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(21, team.version);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (team.setting != null) {
                i11 = TeamSetting.ADAPTER.encodedSizeWithTag(100, team.setting);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (team.user_entity != null) {
                i12 = TeamUserEntity.ADAPTER.encodedSizeWithTag(101, team.user_entity);
            }
            return i22 + i12 + team.unknownFields().size();
        }

        /* renamed from: a */
        public Team decode(ProtoReader protoReader) throws IOException {
            C15306a aVar = new C15306a();
            aVar.f40514a = 0L;
            aVar.f40515b = "";
            aVar.f40516c = Status.UNKNOWN;
            aVar.f40517d = 0L;
            aVar.f40518e = 0;
            aVar.f40519f = 0L;
            aVar.f40520g = "";
            aVar.f40521h = "";
            aVar.f40522i = 0L;
            aVar.f40523j = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 20) {
                    aVar.f40522i = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 21) {
                    aVar.f40523j = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 100) {
                    aVar.f40524k = TeamSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 101) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40514a = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f40515b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            try {
                                aVar.f40516c = Status.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f40517d = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f40518e = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f40519f = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f40520g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f40521h = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f40525l = TeamUserEntity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Team team) throws IOException {
            if (team.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, team.id);
            }
            if (team.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, team.name);
            }
            if (team.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 3, team.status);
            }
            if (team.owner_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, team.owner_id);
            }
            if (team.member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, team.member_count);
            }
            if (team.default_chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, team.default_chat_id);
            }
            if (team.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, team.description);
            }
            if (team.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, team.avatar_key);
            }
            if (team.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, team.create_time);
            }
            if (team.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, team.version);
            }
            if (team.setting != null) {
                TeamSetting.ADAPTER.encodeWithTag(protoWriter, 100, team.setting);
            }
            if (team.user_entity != null) {
                TeamUserEntity.ADAPTER.encodeWithTag(protoWriter, 101, team.user_entity);
            }
            protoWriter.writeBytes(team.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Team$a */
    public static final class C15306a extends Message.Builder<Team, C15306a> {

        /* renamed from: a */
        public Long f40514a;

        /* renamed from: b */
        public String f40515b;

        /* renamed from: c */
        public Status f40516c;

        /* renamed from: d */
        public Long f40517d;

        /* renamed from: e */
        public Integer f40518e;

        /* renamed from: f */
        public Long f40519f;

        /* renamed from: g */
        public String f40520g;

        /* renamed from: h */
        public String f40521h;

        /* renamed from: i */
        public Long f40522i;

        /* renamed from: j */
        public Long f40523j;

        /* renamed from: k */
        public TeamSetting f40524k;

        /* renamed from: l */
        public TeamUserEntity f40525l;

        /* renamed from: a */
        public Team build() {
            return new Team(this.f40514a, this.f40515b, this.f40516c, this.f40517d, this.f40518e, this.f40519f, this.f40520g, this.f40521h, this.f40522i, this.f40523j, this.f40524k, this.f40525l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15306a newBuilder() {
        C15306a aVar = new C15306a();
        aVar.f40514a = this.id;
        aVar.f40515b = this.name;
        aVar.f40516c = this.status;
        aVar.f40517d = this.owner_id;
        aVar.f40518e = this.member_count;
        aVar.f40519f = this.default_chat_id;
        aVar.f40520g = this.description;
        aVar.f40521h = this.avatar_key;
        aVar.f40522i = this.create_time;
        aVar.f40523j = this.version;
        aVar.f40524k = this.setting;
        aVar.f40525l = this.user_entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Team");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.member_count != null) {
            sb.append(", member_count=");
            sb.append(this.member_count);
        }
        if (this.default_chat_id != null) {
            sb.append(", default_chat_id=");
            sb.append(this.default_chat_id);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.setting != null) {
            sb.append(", setting=");
            sb.append(this.setting);
        }
        if (this.user_entity != null) {
            sb.append(", user_entity=");
            sb.append(this.user_entity);
        }
        StringBuilder replace = sb.replace(0, 2, "Team{");
        replace.append('}');
        return replace.toString();
    }

    public Team(Long l, String str, Status status2, Long l2, Integer num, Long l3, String str2, String str3, Long l4, Long l5, TeamSetting teamSetting, TeamUserEntity teamUserEntity) {
        this(l, str, status2, l2, num, l3, str2, str3, l4, l5, teamSetting, teamUserEntity, ByteString.EMPTY);
    }

    public Team(Long l, String str, Status status2, Long l2, Integer num, Long l3, String str2, String str3, Long l4, Long l5, TeamSetting teamSetting, TeamUserEntity teamUserEntity, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.name = str;
        this.status = status2;
        this.owner_id = l2;
        this.member_count = num;
        this.default_chat_id = l3;
        this.description = str2;
        this.avatar_key = str3;
        this.create_time = l4;
        this.version = l5;
        this.setting = teamSetting;
        this.user_entity = teamUserEntity;
    }
}
