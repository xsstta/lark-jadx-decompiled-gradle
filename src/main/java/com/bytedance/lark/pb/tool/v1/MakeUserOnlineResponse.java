package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MakeUserOnlineResponse extends Message<MakeUserOnlineResponse, C19727a> {
    public static final ProtoAdapter<MakeUserOnlineResponse> ADAPTER = new C19728b();
    public static final Boolean DEFAULT_IS_CLEAR_DB = false;
    public static final Boolean DEFAULT_IS_VALID = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_clear_db;
    public final Boolean is_valid;
    public final User user;

    public static final class User extends Message<User, C19725a> {
        public static final ProtoAdapter<User> ADAPTER = new C19726b();
        public static final Integer DEFAULT_STATUS = 0;
        public static final Long DEFAULT_USER_ID = 0L;
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final String avatar_url;
        public final String name;
        public final Integer status;
        public final Long user_id;

        /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineResponse$User$b */
        private static final class C19726b extends ProtoAdapter<User> {
            C19726b() {
                super(FieldEncoding.LENGTH_DELIMITED, User.class);
            }

            /* renamed from: a */
            public int encodedSize(User user) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, user.user_id);
                int i4 = 0;
                if (user.name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, user.name);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (user.avatar_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, user.avatar_url);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (user.status != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, user.status);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (user.avatar_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, user.avatar_key);
                }
                return i7 + i4 + user.unknownFields().size();
            }

            /* renamed from: a */
            public User decode(ProtoReader protoReader) throws IOException {
                C19725a aVar = new C19725a();
                aVar.f48183a = 0L;
                aVar.f48184b = "";
                aVar.f48185c = "";
                aVar.f48186d = 0;
                aVar.f48187e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48183a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f48184b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f48185c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f48186d = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48187e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, User user) throws IOException {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, user.user_id);
                if (user.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, user.name);
                }
                if (user.avatar_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, user.avatar_url);
                }
                if (user.status != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, user.status);
                }
                if (user.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, user.avatar_key);
                }
                protoWriter.writeBytes(user.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineResponse$User$a */
        public static final class C19725a extends Message.Builder<User, C19725a> {

            /* renamed from: a */
            public Long f48183a;

            /* renamed from: b */
            public String f48184b;

            /* renamed from: c */
            public String f48185c;

            /* renamed from: d */
            public Integer f48186d;

            /* renamed from: e */
            public String f48187e;

            /* renamed from: a */
            public User build() {
                Long l = this.f48183a;
                if (l != null) {
                    return new User(l, this.f48184b, this.f48185c, this.f48186d, this.f48187e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(l, "user_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C19725a newBuilder() {
            C19725a aVar = new C19725a();
            aVar.f48183a = this.user_id;
            aVar.f48184b = this.name;
            aVar.f48185c = this.avatar_url;
            aVar.f48186d = this.status;
            aVar.f48187e = this.avatar_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "User");
            StringBuilder sb = new StringBuilder();
            sb.append(", user_id=");
            sb.append(this.user_id);
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.avatar_url != null) {
                sb.append(", avatar_url=");
                sb.append(this.avatar_url);
            }
            if (this.status != null) {
                sb.append(", status=");
                sb.append(this.status);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            StringBuilder replace = sb.replace(0, 2, "User{");
            replace.append('}');
            return replace.toString();
        }

        public User(Long l, String str, String str2, Integer num, String str3) {
            this(l, str, str2, num, str3, ByteString.EMPTY);
        }

        public User(Long l, String str, String str2, Integer num, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = l;
            this.name = str;
            this.avatar_url = str2;
            this.status = num;
            this.avatar_key = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineResponse$b */
    private static final class C19728b extends ProtoAdapter<MakeUserOnlineResponse> {
        C19728b() {
            super(FieldEncoding.LENGTH_DELIMITED, MakeUserOnlineResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MakeUserOnlineResponse makeUserOnlineResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, makeUserOnlineResponse.is_valid);
            int i2 = 0;
            if (makeUserOnlineResponse.user != null) {
                i = User.ADAPTER.encodedSizeWithTag(2, makeUserOnlineResponse.user);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (makeUserOnlineResponse.is_clear_db != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, makeUserOnlineResponse.is_clear_db);
            }
            return i3 + i2 + makeUserOnlineResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MakeUserOnlineResponse decode(ProtoReader protoReader) throws IOException {
            C19727a aVar = new C19727a();
            aVar.f48188a = false;
            aVar.f48190c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48188a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48189b = User.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48190c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MakeUserOnlineResponse makeUserOnlineResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, makeUserOnlineResponse.is_valid);
            if (makeUserOnlineResponse.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter, 2, makeUserOnlineResponse.user);
            }
            if (makeUserOnlineResponse.is_clear_db != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, makeUserOnlineResponse.is_clear_db);
            }
            protoWriter.writeBytes(makeUserOnlineResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19727a newBuilder() {
        C19727a aVar = new C19727a();
        aVar.f48188a = this.is_valid;
        aVar.f48189b = this.user;
        aVar.f48190c = this.is_clear_db;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineResponse$a */
    public static final class C19727a extends Message.Builder<MakeUserOnlineResponse, C19727a> {

        /* renamed from: a */
        public Boolean f48188a;

        /* renamed from: b */
        public User f48189b;

        /* renamed from: c */
        public Boolean f48190c;

        /* renamed from: a */
        public MakeUserOnlineResponse build() {
            Boolean bool = this.f48188a;
            if (bool != null) {
                return new MakeUserOnlineResponse(bool, this.f48189b, this.f48190c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_valid");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "MakeUserOnlineResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_valid=");
        sb.append(this.is_valid);
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.is_clear_db != null) {
            sb.append(", is_clear_db=");
            sb.append(this.is_clear_db);
        }
        StringBuilder replace = sb.replace(0, 2, "MakeUserOnlineResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MakeUserOnlineResponse(Boolean bool, User user2, Boolean bool2) {
        this(bool, user2, bool2, ByteString.EMPTY);
    }

    public MakeUserOnlineResponse(Boolean bool, User user2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_valid = bool;
        this.user = user2;
        this.is_clear_db = bool2;
    }
}
