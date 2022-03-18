package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MomentUser extends Message<MomentUser, C18466a> {
    public static final ProtoAdapter<MomentUser> ADAPTER = new C18467b();
    public static final Boolean DEFAULT_IS_CURRENT_USER_FOLLOWING = false;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final AnonymousUser anonymous;
    public final String avatar_key;
    public final Boolean is_current_user_following;
    public final LarkUser lark_user;
    public final String name;
    public final NicknameUser nickname_user;
    public final OfficialUser official_user;
    public final Type type;
    public final String user_id;

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

    public static final class AnonymousUser extends Message<AnonymousUser, C18458a> {
        public static final ProtoAdapter<AnonymousUser> ADAPTER = new C18459b();
        public static final Integer DEFAULT_IDX = 0;
        private static final long serialVersionUID = 0;
        public final Integer idx;

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$AnonymousUser$b */
        private static final class C18459b extends ProtoAdapter<AnonymousUser> {
            C18459b() {
                super(FieldEncoding.LENGTH_DELIMITED, AnonymousUser.class);
            }

            /* renamed from: a */
            public int encodedSize(AnonymousUser anonymousUser) {
                int i;
                if (anonymousUser.idx != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(3, anonymousUser.idx);
                } else {
                    i = 0;
                }
                return i + anonymousUser.unknownFields().size();
            }

            /* renamed from: a */
            public AnonymousUser decode(ProtoReader protoReader) throws IOException {
                C18458a aVar = new C18458a();
                aVar.f45865a = 0;
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
                        aVar.f45865a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AnonymousUser anonymousUser) throws IOException {
                if (anonymousUser.idx != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, anonymousUser.idx);
                }
                protoWriter.writeBytes(anonymousUser.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$AnonymousUser$a */
        public static final class C18458a extends Message.Builder<AnonymousUser, C18458a> {

            /* renamed from: a */
            public Integer f45865a;

            /* renamed from: a */
            public AnonymousUser build() {
                return new AnonymousUser(this.f45865a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18458a newBuilder() {
            C18458a aVar = new C18458a();
            aVar.f45865a = this.idx;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "AnonymousUser");
            StringBuilder sb = new StringBuilder();
            if (this.idx != null) {
                sb.append(", idx=");
                sb.append(this.idx);
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
            this.idx = num;
        }
    }

    public static final class LarkUser extends Message<LarkUser, C18460a> {
        public static final ProtoAdapter<LarkUser> ADAPTER = new C18461b();
        private static final long serialVersionUID = 0;
        public final String full_department_path;

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$LarkUser$b */
        private static final class C18461b extends ProtoAdapter<LarkUser> {
            C18461b() {
                super(FieldEncoding.LENGTH_DELIMITED, LarkUser.class);
            }

            /* renamed from: a */
            public int encodedSize(LarkUser larkUser) {
                int i;
                if (larkUser.full_department_path != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, larkUser.full_department_path);
                } else {
                    i = 0;
                }
                return i + larkUser.unknownFields().size();
            }

            /* renamed from: a */
            public LarkUser decode(ProtoReader protoReader) throws IOException {
                C18460a aVar = new C18460a();
                aVar.f45866a = "";
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
                        aVar.f45866a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LarkUser larkUser) throws IOException {
                if (larkUser.full_department_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, larkUser.full_department_path);
                }
                protoWriter.writeBytes(larkUser.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$LarkUser$a */
        public static final class C18460a extends Message.Builder<LarkUser, C18460a> {

            /* renamed from: a */
            public String f45866a;

            /* renamed from: a */
            public LarkUser build() {
                return new LarkUser(this.f45866a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18460a newBuilder() {
            C18460a aVar = new C18460a();
            aVar.f45866a = this.full_department_path;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "LarkUser");
            StringBuilder sb = new StringBuilder();
            if (this.full_department_path != null) {
                sb.append(", full_department_path=");
                sb.append(this.full_department_path);
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
            this.full_department_path = str;
        }
    }

    public static final class NicknameUser extends Message<NicknameUser, C18462a> {
        public static final ProtoAdapter<NicknameUser> ADAPTER = new C18463b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$NicknameUser$b */
        private static final class C18463b extends ProtoAdapter<NicknameUser> {
            C18463b() {
                super(FieldEncoding.LENGTH_DELIMITED, NicknameUser.class);
            }

            /* renamed from: a */
            public int encodedSize(NicknameUser nicknameUser) {
                return nicknameUser.unknownFields().size();
            }

            /* renamed from: a */
            public NicknameUser decode(ProtoReader protoReader) throws IOException {
                C18462a aVar = new C18462a();
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

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$NicknameUser$a */
        public static final class C18462a extends Message.Builder<NicknameUser, C18462a> {
            /* renamed from: a */
            public NicknameUser build() {
                return new NicknameUser(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18462a newBuilder() {
            C18462a aVar = new C18462a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "NicknameUser");
            StringBuilder replace = new StringBuilder().replace(0, 2, "NicknameUser{");
            replace.append('}');
            return replace.toString();
        }

        public NicknameUser(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class OfficialUser extends Message<OfficialUser, C18464a> {
        public static final ProtoAdapter<OfficialUser> ADAPTER = new C18465b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$OfficialUser$b */
        private static final class C18465b extends ProtoAdapter<OfficialUser> {
            C18465b() {
                super(FieldEncoding.LENGTH_DELIMITED, OfficialUser.class);
            }

            /* renamed from: a */
            public int encodedSize(OfficialUser officialUser) {
                return officialUser.unknownFields().size();
            }

            /* renamed from: a */
            public OfficialUser decode(ProtoReader protoReader) throws IOException {
                C18464a aVar = new C18464a();
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

        /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$OfficialUser$a */
        public static final class C18464a extends Message.Builder<OfficialUser, C18464a> {
            /* renamed from: a */
            public OfficialUser build() {
                return new OfficialUser(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18464a newBuilder() {
            C18464a aVar = new C18464a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "OfficialUser");
            StringBuilder replace = new StringBuilder().replace(0, 2, "OfficialUser{");
            replace.append('}');
            return replace.toString();
        }

        public OfficialUser(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$b */
    private static final class C18467b extends ProtoAdapter<MomentUser> {
        C18467b() {
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
            int i8;
            int i9 = 0;
            if (momentUser.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, momentUser.type);
            } else {
                i = 0;
            }
            if (momentUser.user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, momentUser.user_id);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (momentUser.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, momentUser.name);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (momentUser.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, momentUser.avatar_key);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (momentUser.lark_user != null) {
                i5 = LarkUser.ADAPTER.encodedSizeWithTag(10, momentUser.lark_user);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (momentUser.anonymous != null) {
                i6 = AnonymousUser.ADAPTER.encodedSizeWithTag(11, momentUser.anonymous);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (momentUser.official_user != null) {
                i7 = OfficialUser.ADAPTER.encodedSizeWithTag(12, momentUser.official_user);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (momentUser.nickname_user != null) {
                i8 = NicknameUser.ADAPTER.encodedSizeWithTag(13, momentUser.nickname_user);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (momentUser.is_current_user_following != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(51, momentUser.is_current_user_following);
            }
            return i16 + i9 + momentUser.unknownFields().size();
        }

        /* renamed from: a */
        public MomentUser decode(ProtoReader protoReader) throws IOException {
            C18466a aVar = new C18466a();
            aVar.f45867a = Type.UNKNOWN;
            aVar.f45868b = "";
            aVar.f45869c = "";
            aVar.f45870d = "";
            aVar.f45875i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45867a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f45868b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45869c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45870d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 51) {
                    switch (nextTag) {
                        case 10:
                            aVar.f45871e = LarkUser.ADAPTER.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f45872f = AnonymousUser.ADAPTER.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f45873g = OfficialUser.ADAPTER.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f45874h = NicknameUser.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f45875i = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MomentUser momentUser) throws IOException {
            if (momentUser.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, momentUser.type);
            }
            if (momentUser.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, momentUser.user_id);
            }
            if (momentUser.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, momentUser.name);
            }
            if (momentUser.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, momentUser.avatar_key);
            }
            if (momentUser.lark_user != null) {
                LarkUser.ADAPTER.encodeWithTag(protoWriter, 10, momentUser.lark_user);
            }
            if (momentUser.anonymous != null) {
                AnonymousUser.ADAPTER.encodeWithTag(protoWriter, 11, momentUser.anonymous);
            }
            if (momentUser.official_user != null) {
                OfficialUser.ADAPTER.encodeWithTag(protoWriter, 12, momentUser.official_user);
            }
            if (momentUser.nickname_user != null) {
                NicknameUser.ADAPTER.encodeWithTag(protoWriter, 13, momentUser.nickname_user);
            }
            if (momentUser.is_current_user_following != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 51, momentUser.is_current_user_following);
            }
            protoWriter.writeBytes(momentUser.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.MomentUser$a */
    public static final class C18466a extends Message.Builder<MomentUser, C18466a> {

        /* renamed from: a */
        public Type f45867a;

        /* renamed from: b */
        public String f45868b;

        /* renamed from: c */
        public String f45869c;

        /* renamed from: d */
        public String f45870d;

        /* renamed from: e */
        public LarkUser f45871e;

        /* renamed from: f */
        public AnonymousUser f45872f;

        /* renamed from: g */
        public OfficialUser f45873g;

        /* renamed from: h */
        public NicknameUser f45874h;

        /* renamed from: i */
        public Boolean f45875i;

        /* renamed from: a */
        public MomentUser build() {
            return new MomentUser(this.f45867a, this.f45868b, this.f45869c, this.f45870d, this.f45871e, this.f45872f, this.f45873g, this.f45874h, this.f45875i, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18466a mo63790a(Type type) {
            this.f45867a = type;
            return this;
        }

        /* renamed from: b */
        public C18466a mo63794b(String str) {
            this.f45869c = str;
            return this;
        }

        /* renamed from: c */
        public C18466a mo63795c(String str) {
            this.f45870d = str;
            return this;
        }

        /* renamed from: a */
        public C18466a mo63791a(Boolean bool) {
            this.f45875i = bool;
            return this;
        }

        /* renamed from: a */
        public C18466a mo63792a(String str) {
            this.f45868b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18466a newBuilder() {
        C18466a aVar = new C18466a();
        aVar.f45867a = this.type;
        aVar.f45868b = this.user_id;
        aVar.f45869c = this.name;
        aVar.f45870d = this.avatar_key;
        aVar.f45871e = this.lark_user;
        aVar.f45872f = this.anonymous;
        aVar.f45873g = this.official_user;
        aVar.f45874h = this.nickname_user;
        aVar.f45875i = this.is_current_user_following;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "MomentUser");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.lark_user != null) {
            sb.append(", lark_user=");
            sb.append(this.lark_user);
        }
        if (this.anonymous != null) {
            sb.append(", anonymous=");
            sb.append(this.anonymous);
        }
        if (this.official_user != null) {
            sb.append(", official_user=");
            sb.append(this.official_user);
        }
        if (this.nickname_user != null) {
            sb.append(", nickname_user=");
            sb.append(this.nickname_user);
        }
        if (this.is_current_user_following != null) {
            sb.append(", is_current_user_following=");
            sb.append(this.is_current_user_following);
        }
        StringBuilder replace = sb.replace(0, 2, "MomentUser{");
        replace.append('}');
        return replace.toString();
    }

    public MomentUser(Type type2, String str, String str2, String str3, LarkUser larkUser, AnonymousUser anonymousUser, OfficialUser officialUser, NicknameUser nicknameUser, Boolean bool) {
        this(type2, str, str2, str3, larkUser, anonymousUser, officialUser, nicknameUser, bool, ByteString.EMPTY);
    }

    public MomentUser(Type type2, String str, String str2, String str3, LarkUser larkUser, AnonymousUser anonymousUser, OfficialUser officialUser, NicknameUser nicknameUser, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.user_id = str;
        this.name = str2;
        this.avatar_key = str3;
        this.lark_user = larkUser;
        this.anonymous = anonymousUser;
        this.official_user = officialUser;
        this.nickname_user = nicknameUser;
        this.is_current_user_following = bool;
    }
}
