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

public final class TeamUserEntity extends Message<TeamUserEntity, C15316a> {
    public static final ProtoAdapter<TeamUserEntity> ADAPTER = new C15317b();
    public static final Role DEFAULT_USER_ROLE = Role.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Role user_role;

    public enum Role implements WireEnum {
        UNKNOWN(0),
        MEMBER(1),
        OWNER(2);
        
        public static final ProtoAdapter<Role> ADAPTER = ProtoAdapter.newEnumAdapter(Role.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Role fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MEMBER;
            }
            if (i != 2) {
                return null;
            }
            return OWNER;
        }

        private Role(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TeamUserEntity$b */
    private static final class C15317b extends ProtoAdapter<TeamUserEntity> {
        C15317b() {
            super(FieldEncoding.LENGTH_DELIMITED, TeamUserEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(TeamUserEntity teamUserEntity) {
            int i;
            if (teamUserEntity.user_role != null) {
                i = Role.ADAPTER.encodedSizeWithTag(1, teamUserEntity.user_role);
            } else {
                i = 0;
            }
            return i + teamUserEntity.unknownFields().size();
        }

        /* renamed from: a */
        public TeamUserEntity decode(ProtoReader protoReader) throws IOException {
            C15316a aVar = new C15316a();
            aVar.f40529a = Role.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f40529a = Role.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TeamUserEntity teamUserEntity) throws IOException {
            if (teamUserEntity.user_role != null) {
                Role.ADAPTER.encodeWithTag(protoWriter, 1, teamUserEntity.user_role);
            }
            protoWriter.writeBytes(teamUserEntity.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TeamUserEntity$a */
    public static final class C15316a extends Message.Builder<TeamUserEntity, C15316a> {

        /* renamed from: a */
        public Role f40529a;

        /* renamed from: a */
        public TeamUserEntity build() {
            return new TeamUserEntity(this.f40529a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15316a newBuilder() {
        C15316a aVar = new C15316a();
        aVar.f40529a = this.user_role;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TeamUserEntity");
        StringBuilder sb = new StringBuilder();
        if (this.user_role != null) {
            sb.append(", user_role=");
            sb.append(this.user_role);
        }
        StringBuilder replace = sb.replace(0, 2, "TeamUserEntity{");
        replace.append('}');
        return replace.toString();
    }

    public TeamUserEntity(Role role) {
        this(role, ByteString.EMPTY);
    }

    public TeamUserEntity(Role role, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_role = role;
    }
}
