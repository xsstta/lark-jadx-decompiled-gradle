package com.ss.android.lark.pb.moments_entities;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MomentUser extends Message<MomentUser, C49970a> {
    public static final ProtoAdapter<MomentUser> ADAPTER = new C49971b();
    private static final long serialVersionUID = 0;
    public final AnonymousUser manonymous;
    public final String mavatar_key;
    public final LarkUser mlark_user;
    public final String mname;
    public final NicknameUser mnickname_user;
    public final OfficialUser mofficial_user;
    public final Type mtype;
    public final String muser_id;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        USER(1),
        ANONYMOUS(2),
        OFFICIAL(3),
        NICKNAME(4);
        
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
                return USER;
            }
            if (i == 2) {
                return ANONYMOUS;
            }
            if (i == 3) {
                return OFFICIAL;
            }
            if (i != 4) {
                return null;
            }
            return NICKNAME;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class AnonymousUser extends Message<AnonymousUser, C49962a> {
        public static final ProtoAdapter<AnonymousUser> ADAPTER = new C49963b();
        public static final Integer DEFAULT_IDX = 0;
        private static final long serialVersionUID = 0;
        public final Integer midx;

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$AnonymousUser$b */
        private static final class C49963b extends ProtoAdapter<AnonymousUser> {
            C49963b() {
                super(FieldEncoding.LENGTH_DELIMITED, AnonymousUser.class);
            }

            /* renamed from: a */
            public int encodedSize(AnonymousUser anonymousUser) {
                int i;
                if (anonymousUser.midx != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(3, anonymousUser.midx);
                } else {
                    i = 0;
                }
                return i + anonymousUser.unknownFields().size();
            }

            /* renamed from: a */
            public AnonymousUser decode(ProtoReader protoReader) throws IOException {
                C49962a aVar = new C49962a();
                aVar.f124977a = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124977a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AnonymousUser anonymousUser) throws IOException {
                if (anonymousUser.midx != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, anonymousUser.midx);
                }
                protoWriter.writeBytes(anonymousUser.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$AnonymousUser$a */
        public static final class C49962a extends Message.Builder<AnonymousUser, C49962a> {

            /* renamed from: a */
            public Integer f124977a;

            /* renamed from: a */
            public AnonymousUser build() {
                return new AnonymousUser(this.f124977a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49962a newBuilder() {
            C49962a aVar = new C49962a();
            aVar.f124977a = this.midx;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.midx != null) {
                sb.append(", idx=");
                sb.append(this.midx);
            }
            StringBuilder replace = sb.replace(0, 2, "AnonymousUser{");
            replace.append('}');
            return replace.toString();
        }

        public AnonymousUser(Integer num) {
            this(num, ByteString.EMPTY);
        }

        public AnonymousUser(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.midx = num;
        }
    }

    public static final class LarkUser extends Message<LarkUser, C49964a> {
        public static final ProtoAdapter<LarkUser> ADAPTER = new C49965b();
        private static final long serialVersionUID = 0;
        public final String mfull_department_path;

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$LarkUser$b */
        private static final class C49965b extends ProtoAdapter<LarkUser> {
            C49965b() {
                super(FieldEncoding.LENGTH_DELIMITED, LarkUser.class);
            }

            /* renamed from: a */
            public int encodedSize(LarkUser larkUser) {
                int i;
                if (larkUser.mfull_department_path != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, larkUser.mfull_department_path);
                } else {
                    i = 0;
                }
                return i + larkUser.unknownFields().size();
            }

            /* renamed from: a */
            public LarkUser decode(ProtoReader protoReader) throws IOException {
                C49964a aVar = new C49964a();
                aVar.f124978a = "";
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
                        aVar.f124978a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LarkUser larkUser) throws IOException {
                if (larkUser.mfull_department_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, larkUser.mfull_department_path);
                }
                protoWriter.writeBytes(larkUser.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$LarkUser$a */
        public static final class C49964a extends Message.Builder<LarkUser, C49964a> {

            /* renamed from: a */
            public String f124978a;

            /* renamed from: a */
            public LarkUser build() {
                return new LarkUser(this.f124978a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49964a newBuilder() {
            C49964a aVar = new C49964a();
            aVar.f124978a = this.mfull_department_path;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mfull_department_path != null) {
                sb.append(", full_department_path=");
                sb.append(this.mfull_department_path);
            }
            StringBuilder replace = sb.replace(0, 2, "LarkUser{");
            replace.append('}');
            return replace.toString();
        }

        public LarkUser(String str) {
            this(str, ByteString.EMPTY);
        }

        public LarkUser(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mfull_department_path = str;
        }
    }

    public static final class NicknameUser extends Message<NicknameUser, C49966a> {
        public static final ProtoAdapter<NicknameUser> ADAPTER = new C49967b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$NicknameUser$b */
        private static final class C49967b extends ProtoAdapter<NicknameUser> {
            C49967b() {
                super(FieldEncoding.LENGTH_DELIMITED, NicknameUser.class);
            }

            /* renamed from: a */
            public int encodedSize(NicknameUser nicknameUser) {
                return nicknameUser.unknownFields().size();
            }

            /* renamed from: a */
            public NicknameUser decode(ProtoReader protoReader) throws IOException {
                C49966a aVar = new C49966a();
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
            public void encode(ProtoWriter protoWriter, NicknameUser nicknameUser) throws IOException {
                protoWriter.writeBytes(nicknameUser.unknownFields());
            }
        }

        public NicknameUser() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$NicknameUser$a */
        public static final class C49966a extends Message.Builder<NicknameUser, C49966a> {
            /* renamed from: a */
            public NicknameUser build() {
                return new NicknameUser(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49966a newBuilder() {
            C49966a aVar = new C49966a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "NicknameUser{");
            replace.append('}');
            return replace.toString();
        }

        public NicknameUser(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class OfficialUser extends Message<OfficialUser, C49968a> {
        public static final ProtoAdapter<OfficialUser> ADAPTER = new C49969b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$OfficialUser$b */
        private static final class C49969b extends ProtoAdapter<OfficialUser> {
            C49969b() {
                super(FieldEncoding.LENGTH_DELIMITED, OfficialUser.class);
            }

            /* renamed from: a */
            public int encodedSize(OfficialUser officialUser) {
                return officialUser.unknownFields().size();
            }

            /* renamed from: a */
            public OfficialUser decode(ProtoReader protoReader) throws IOException {
                C49968a aVar = new C49968a();
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
            public void encode(ProtoWriter protoWriter, OfficialUser officialUser) throws IOException {
                protoWriter.writeBytes(officialUser.unknownFields());
            }
        }

        public OfficialUser() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$OfficialUser$a */
        public static final class C49968a extends Message.Builder<OfficialUser, C49968a> {
            /* renamed from: a */
            public OfficialUser build() {
                return new OfficialUser(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49968a newBuilder() {
            C49968a aVar = new C49968a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "OfficialUser{");
            replace.append('}');
            return replace.toString();
        }

        public OfficialUser(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$b */
    private static final class C49971b extends ProtoAdapter<MomentUser> {
        C49971b() {
            super(FieldEncoding.LENGTH_DELIMITED, MomentUser.class);
        }

        /* renamed from: a */
        public int encodedSize(MomentUser momentUser) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (momentUser.mtype != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, momentUser.mtype);
            } else {
                i = 0;
            }
            if (momentUser.muser_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, momentUser.muser_id);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (momentUser.mname != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, momentUser.mname);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (momentUser.mavatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, momentUser.mavatar_key);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (momentUser.mlark_user != null) {
                i5 = LarkUser.ADAPTER.encodedSizeWithTag(10, momentUser.mlark_user);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (momentUser.manonymous != null) {
                i6 = AnonymousUser.ADAPTER.encodedSizeWithTag(11, momentUser.manonymous);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (momentUser.mofficial_user != null) {
                i7 = OfficialUser.ADAPTER.encodedSizeWithTag(12, momentUser.mofficial_user);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (momentUser.mnickname_user != null) {
                i8 = NicknameUser.ADAPTER.encodedSizeWithTag(13, momentUser.mnickname_user);
            }
            return i14 + i8 + momentUser.unknownFields().size();
        }

        /* renamed from: a */
        public MomentUser decode(ProtoReader protoReader) throws IOException {
            C49970a aVar = new C49970a();
            aVar.f124980b = "";
            aVar.f124981c = "";
            aVar.f124982d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124979a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124980b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124981c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    switch (nextTag) {
                        case 10:
                            aVar.f124983e = LarkUser.ADAPTER.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f124984f = AnonymousUser.ADAPTER.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124985g = OfficialUser.ADAPTER.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f124986h = NicknameUser.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f124982d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MomentUser momentUser) throws IOException {
            if (momentUser.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, momentUser.mtype);
            }
            if (momentUser.muser_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, momentUser.muser_id);
            }
            if (momentUser.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, momentUser.mname);
            }
            if (momentUser.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, momentUser.mavatar_key);
            }
            if (momentUser.mlark_user != null) {
                LarkUser.ADAPTER.encodeWithTag(protoWriter, 10, momentUser.mlark_user);
            }
            if (momentUser.manonymous != null) {
                AnonymousUser.ADAPTER.encodeWithTag(protoWriter, 11, momentUser.manonymous);
            }
            if (momentUser.mofficial_user != null) {
                OfficialUser.ADAPTER.encodeWithTag(protoWriter, 12, momentUser.mofficial_user);
            }
            if (momentUser.mnickname_user != null) {
                NicknameUser.ADAPTER.encodeWithTag(protoWriter, 13, momentUser.mnickname_user);
            }
            protoWriter.writeBytes(momentUser.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.MomentUser$a */
    public static final class C49970a extends Message.Builder<MomentUser, C49970a> {

        /* renamed from: a */
        public Type f124979a;

        /* renamed from: b */
        public String f124980b;

        /* renamed from: c */
        public String f124981c;

        /* renamed from: d */
        public String f124982d;

        /* renamed from: e */
        public LarkUser f124983e;

        /* renamed from: f */
        public AnonymousUser f124984f;

        /* renamed from: g */
        public OfficialUser f124985g;

        /* renamed from: h */
        public NicknameUser f124986h;

        /* renamed from: a */
        public MomentUser build() {
            return new MomentUser(this.f124979a, this.f124980b, this.f124981c, this.f124982d, this.f124983e, this.f124984f, this.f124985g, this.f124986h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49970a newBuilder() {
        C49970a aVar = new C49970a();
        aVar.f124979a = this.mtype;
        aVar.f124980b = this.muser_id;
        aVar.f124981c = this.mname;
        aVar.f124982d = this.mavatar_key;
        aVar.f124983e = this.mlark_user;
        aVar.f124984f = this.manonymous;
        aVar.f124985g = this.mofficial_user;
        aVar.f124986h = this.mnickname_user;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.muser_id != null) {
            sb.append(", user_id=");
            sb.append(this.muser_id);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        if (this.mlark_user != null) {
            sb.append(", lark_user=");
            sb.append(this.mlark_user);
        }
        if (this.manonymous != null) {
            sb.append(", anonymous=");
            sb.append(this.manonymous);
        }
        if (this.mofficial_user != null) {
            sb.append(", official_user=");
            sb.append(this.mofficial_user);
        }
        if (this.mnickname_user != null) {
            sb.append(", nickname_user=");
            sb.append(this.mnickname_user);
        }
        StringBuilder replace = sb.replace(0, 2, "MomentUser{");
        replace.append('}');
        return replace.toString();
    }

    public MomentUser(Type type, String str, String str2, String str3, LarkUser larkUser, AnonymousUser anonymousUser, OfficialUser officialUser, NicknameUser nicknameUser) {
        this(type, str, str2, str3, larkUser, anonymousUser, officialUser, nicknameUser, ByteString.EMPTY);
    }

    public MomentUser(Type type, String str, String str2, String str3, LarkUser larkUser, AnonymousUser anonymousUser, OfficialUser officialUser, NicknameUser nicknameUser, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
        this.muser_id = str;
        this.mname = str2;
        this.mavatar_key = str3;
        this.mlark_user = larkUser;
        this.manonymous = anonymousUser;
        this.mofficial_user = officialUser;
        this.mnickname_user = nicknameUser;
    }
}
