package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UserCircleConfig extends Message<UserCircleConfig, C18560a> {
    public static final ProtoAdapter<UserCircleConfig> ADAPTER = new C18561b();
    public static final Boolean DEFAULT_CAN_ASK_SECRET_CHAT = false;
    public static final Boolean DEFAULT_DISABLE_FOLLOWING = false;
    public static final Boolean DEFAULT_HAS_CATEGORIES = false;
    public static final ManageMode DEFAULT_MANAGE_MODE = ManageMode.BASIC;
    private static final long serialVersionUID = 0;
    public final AnonymityPolicy anonymity_policy;
    public final String anonymous_avatar_key;
    public final Boolean can_ask_secret_chat;
    public final String circle_id;
    public final Boolean disable_following;
    public final Boolean has_categories;
    public final ManageMode manage_mode;
    public final MomentUser nickname_user;
    public final List<Tab> tabs;

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserCircleConfig$b */
    private static final class C18561b extends ProtoAdapter<UserCircleConfig> {
        C18561b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserCircleConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(UserCircleConfig userCircleConfig) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (userCircleConfig.circle_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, userCircleConfig.circle_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Tab.ADAPTER.asRepeated().encodedSizeWithTag(2, userCircleConfig.tabs);
            if (userCircleConfig.has_categories != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, userCircleConfig.has_categories);
            } else {
                i2 = 0;
            }
            int i9 = encodedSizeWithTag + i2;
            if (userCircleConfig.anonymity_policy != null) {
                i3 = AnonymityPolicy.ADAPTER.encodedSizeWithTag(4, userCircleConfig.anonymity_policy);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (userCircleConfig.nickname_user != null) {
                i4 = MomentUser.ADAPTER.encodedSizeWithTag(5, userCircleConfig.nickname_user);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (userCircleConfig.anonymous_avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, userCircleConfig.anonymous_avatar_key);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (userCircleConfig.can_ask_secret_chat != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, userCircleConfig.can_ask_secret_chat);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (userCircleConfig.disable_following != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, userCircleConfig.disable_following);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (userCircleConfig.manage_mode != null) {
                i8 = ManageMode.ADAPTER.encodedSizeWithTag(9, userCircleConfig.manage_mode);
            }
            return i14 + i8 + userCircleConfig.unknownFields().size();
        }

        /* renamed from: a */
        public UserCircleConfig decode(ProtoReader protoReader) throws IOException {
            C18560a aVar = new C18560a();
            aVar.f46046a = "";
            aVar.f46048c = false;
            aVar.f46051f = "";
            aVar.f46052g = false;
            aVar.f46053h = false;
            aVar.f46054i = ManageMode.BASIC;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46046a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46047b.add(Tab.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f46048c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46049d = AnonymityPolicy.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46050e = MomentUser.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46051f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46052g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46053h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            try {
                                aVar.f46054i = ManageMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserCircleConfig userCircleConfig) throws IOException {
            if (userCircleConfig.circle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userCircleConfig.circle_id);
            }
            Tab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, userCircleConfig.tabs);
            if (userCircleConfig.has_categories != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, userCircleConfig.has_categories);
            }
            if (userCircleConfig.anonymity_policy != null) {
                AnonymityPolicy.ADAPTER.encodeWithTag(protoWriter, 4, userCircleConfig.anonymity_policy);
            }
            if (userCircleConfig.nickname_user != null) {
                MomentUser.ADAPTER.encodeWithTag(protoWriter, 5, userCircleConfig.nickname_user);
            }
            if (userCircleConfig.anonymous_avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, userCircleConfig.anonymous_avatar_key);
            }
            if (userCircleConfig.can_ask_secret_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, userCircleConfig.can_ask_secret_chat);
            }
            if (userCircleConfig.disable_following != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, userCircleConfig.disable_following);
            }
            if (userCircleConfig.manage_mode != null) {
                ManageMode.ADAPTER.encodeWithTag(protoWriter, 9, userCircleConfig.manage_mode);
            }
            protoWriter.writeBytes(userCircleConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserCircleConfig$a */
    public static final class C18560a extends Message.Builder<UserCircleConfig, C18560a> {

        /* renamed from: a */
        public String f46046a;

        /* renamed from: b */
        public List<Tab> f46047b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f46048c;

        /* renamed from: d */
        public AnonymityPolicy f46049d;

        /* renamed from: e */
        public MomentUser f46050e;

        /* renamed from: f */
        public String f46051f;

        /* renamed from: g */
        public Boolean f46052g;

        /* renamed from: h */
        public Boolean f46053h;

        /* renamed from: i */
        public ManageMode f46054i;

        /* renamed from: a */
        public UserCircleConfig build() {
            return new UserCircleConfig(this.f46046a, this.f46047b, this.f46048c, this.f46049d, this.f46050e, this.f46051f, this.f46052g, this.f46053h, this.f46054i, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18560a mo64008a(MomentUser momentUser) {
            this.f46050e = momentUser;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18560a newBuilder() {
        C18560a aVar = new C18560a();
        aVar.f46046a = this.circle_id;
        aVar.f46047b = Internal.copyOf("tabs", this.tabs);
        aVar.f46048c = this.has_categories;
        aVar.f46049d = this.anonymity_policy;
        aVar.f46050e = this.nickname_user;
        aVar.f46051f = this.anonymous_avatar_key;
        aVar.f46052g = this.can_ask_secret_chat;
        aVar.f46053h = this.disable_following;
        aVar.f46054i = this.manage_mode;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "UserCircleConfig");
        StringBuilder sb = new StringBuilder();
        if (this.circle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.circle_id);
        }
        if (!this.tabs.isEmpty()) {
            sb.append(", tabs=");
            sb.append(this.tabs);
        }
        if (this.has_categories != null) {
            sb.append(", has_categories=");
            sb.append(this.has_categories);
        }
        if (this.anonymity_policy != null) {
            sb.append(", anonymity_policy=");
            sb.append(this.anonymity_policy);
        }
        if (this.nickname_user != null) {
            sb.append(", nickname_user=");
            sb.append(this.nickname_user);
        }
        if (this.anonymous_avatar_key != null) {
            sb.append(", anonymous_avatar_key=");
            sb.append(this.anonymous_avatar_key);
        }
        if (this.can_ask_secret_chat != null) {
            sb.append(", can_ask_secret_chat=");
            sb.append(this.can_ask_secret_chat);
        }
        if (this.disable_following != null) {
            sb.append(", disable_following=");
            sb.append(this.disable_following);
        }
        if (this.manage_mode != null) {
            sb.append(", manage_mode=");
            sb.append(this.manage_mode);
        }
        StringBuilder replace = sb.replace(0, 2, "UserCircleConfig{");
        replace.append('}');
        return replace.toString();
    }

    public UserCircleConfig(String str, List<Tab> list, Boolean bool, AnonymityPolicy anonymityPolicy, MomentUser momentUser, String str2, Boolean bool2, Boolean bool3, ManageMode manageMode) {
        this(str, list, bool, anonymityPolicy, momentUser, str2, bool2, bool3, manageMode, ByteString.EMPTY);
    }

    public UserCircleConfig(String str, List<Tab> list, Boolean bool, AnonymityPolicy anonymityPolicy, MomentUser momentUser, String str2, Boolean bool2, Boolean bool3, ManageMode manageMode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.circle_id = str;
        this.tabs = Internal.immutableCopyOf("tabs", list);
        this.has_categories = bool;
        this.anonymity_policy = anonymityPolicy;
        this.nickname_user = momentUser;
        this.anonymous_avatar_key = str2;
        this.can_ask_secret_chat = bool2;
        this.disable_following = bool3;
        this.manage_mode = manageMode;
    }
}
