package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
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

public final class OpenApp extends Message<OpenApp, C15107a> {
    public static final ProtoAdapter<OpenApp> ADAPTER = new C15108b();
    public static final Chatable DEFAULT_CHATABLE = Chatable.CHATABLE_UNKNOWN;
    public static final State DEFAULT_STATE = State.UNKNOWN_STATE;
    private static final long serialVersionUID = 0;
    public final List<Ability> abilities;
    public final String app_id;
    public final String app_id_i64;
    public final AppTipsContent app_tips;
    public final String app_url;
    public final String avatar_key;
    public final String avatar_path;
    public final String bot_id;
    public final BotTipsContent bot_tips;
    public final Chatable chatable;
    public final String extra_config;
    public final String i18n_desc;
    public final String i18n_name;
    public final String id;
    public final String last_happen;
    public final State state;
    public final List<Tag> tags;
    public final String tips;
    public final String version;

    public enum Ability implements WireEnum {
        UNKNOWN(0),
        MICRO_APP(1),
        H5(2),
        BOT(3);
        
        public static final ProtoAdapter<Ability> ADAPTER = ProtoAdapter.newEnumAdapter(Ability.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Ability fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MICRO_APP;
            }
            if (i == 2) {
                return H5;
            }
            if (i != 3) {
                return null;
            }
            return BOT;
        }

        private Ability(int i) {
            this.value = i;
        }
    }

    public enum Chatable implements WireEnum {
        CHATABLE_UNKNOWN(0),
        CHATABLE(1),
        UNCHATABLE(2);
        
        public static final ProtoAdapter<Chatable> ADAPTER = ProtoAdapter.newEnumAdapter(Chatable.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Chatable fromValue(int i) {
            if (i == 0) {
                return CHATABLE_UNKNOWN;
            }
            if (i == 1) {
                return CHATABLE;
            }
            if (i != 2) {
                return null;
            }
            return UNCHATABLE;
        }

        private Chatable(int i) {
            this.value = i;
        }
    }

    public enum State implements WireEnum {
        UNKNOWN_STATE(100),
        USABLE(0),
        TENANT_FORBIDDEN(2),
        PLATFORM_FORBIDDEN(3),
        DEVELOPER_FORBIDDEN(4),
        OFFLINE(5),
        USER_INVISIBLE(6),
        APP_NEED_PAY_USE(7),
        APP_DELETED(8);
        
        public static final ProtoAdapter<State> ADAPTER = ProtoAdapter.newEnumAdapter(State.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static State fromValue(int i) {
            if (i == 0) {
                return USABLE;
            }
            if (i == 100) {
                return UNKNOWN_STATE;
            }
            switch (i) {
                case 2:
                    return TENANT_FORBIDDEN;
                case 3:
                    return PLATFORM_FORBIDDEN;
                case 4:
                    return DEVELOPER_FORBIDDEN;
                case 5:
                    return OFFLINE;
                case 6:
                    return USER_INVISIBLE;
                case 7:
                    return APP_NEED_PAY_USE;
                case 8:
                    return APP_DELETED;
                default:
                    return null;
            }
        }

        private State(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.OpenApp$b */
    private static final class C15108b extends ProtoAdapter<OpenApp> {
        C15108b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenApp.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenApp openApp) {
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
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17 = 0;
            if (openApp.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, openApp.id);
            } else {
                i = 0;
            }
            if (openApp.app_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, openApp.app_id);
            } else {
                i2 = 0;
            }
            int i18 = i + i2;
            if (openApp.bot_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, openApp.bot_id);
            } else {
                i3 = 0;
            }
            int i19 = i18 + i3;
            if (openApp.state != null) {
                i4 = State.ADAPTER.encodedSizeWithTag(4, openApp.state);
            } else {
                i4 = 0;
            }
            int i20 = i19 + i4;
            if (openApp.tips != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, openApp.tips);
            } else {
                i5 = 0;
            }
            int i21 = i20 + i5;
            if (openApp.last_happen != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, openApp.last_happen);
            } else {
                i6 = 0;
            }
            int i22 = i21 + i6;
            if (openApp.version != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, openApp.version);
            } else {
                i7 = 0;
            }
            int i23 = i22 + i7;
            if (openApp.app_tips != null) {
                i8 = AppTipsContent.ADAPTER.encodedSizeWithTag(8, openApp.app_tips);
            } else {
                i8 = 0;
            }
            int i24 = i23 + i8;
            if (openApp.bot_tips != null) {
                i9 = BotTipsContent.ADAPTER.encodedSizeWithTag(9, openApp.bot_tips);
            } else {
                i9 = 0;
            }
            int i25 = i24 + i9;
            if (openApp.i18n_name != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, openApp.i18n_name);
            } else {
                i10 = 0;
            }
            int i26 = i25 + i10;
            if (openApp.i18n_desc != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, openApp.i18n_desc);
            } else {
                i11 = 0;
            }
            int i27 = i26 + i11;
            if (openApp.avatar_key != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, openApp.avatar_key);
            } else {
                i12 = 0;
            }
            int i28 = i27 + i12;
            if (openApp.app_id_i64 != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, openApp.app_id_i64);
            } else {
                i13 = 0;
            }
            int encodedSizeWithTag = i28 + i13 + Ability.ADAPTER.asRepeated().encodedSizeWithTag(14, openApp.abilities);
            if (openApp.app_url != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, openApp.app_url);
            } else {
                i14 = 0;
            }
            int i29 = encodedSizeWithTag + i14;
            if (openApp.avatar_path != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, openApp.avatar_path);
            } else {
                i15 = 0;
            }
            int i30 = i29 + i15;
            if (openApp.chatable != null) {
                i16 = Chatable.ADAPTER.encodedSizeWithTag(17, openApp.chatable);
            } else {
                i16 = 0;
            }
            int i31 = i30 + i16;
            if (openApp.extra_config != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(18, openApp.extra_config);
            }
            return i31 + i17 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(19, openApp.tags) + openApp.unknownFields().size();
        }

        /* renamed from: a */
        public OpenApp decode(ProtoReader protoReader) throws IOException {
            C15107a aVar = new C15107a();
            aVar.f40041a = "";
            aVar.f40042b = "";
            aVar.f40043c = "";
            aVar.f40044d = State.UNKNOWN_STATE;
            aVar.f40045e = "";
            aVar.f40046f = "";
            aVar.f40047g = "";
            aVar.f40050j = "";
            aVar.f40051k = "";
            aVar.f40052l = "";
            aVar.f40053m = "";
            aVar.f40055o = "";
            aVar.f40056p = "";
            aVar.f40057q = Chatable.CHATABLE_UNKNOWN;
            aVar.f40058r = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40041a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40042b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40043c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f40044d = State.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f40045e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40046f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40047g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40048h = AppTipsContent.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40049i = BotTipsContent.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f40050j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f40051k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f40052l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f40053m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f40054n.add(Ability.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 15:
                            aVar.f40055o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f40056p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            try {
                                aVar.f40057q = Chatable.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 18:
                            aVar.f40058r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            try {
                                aVar.f40059s.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
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
        public void encode(ProtoWriter protoWriter, OpenApp openApp) throws IOException {
            if (openApp.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openApp.id);
            }
            if (openApp.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, openApp.app_id);
            }
            if (openApp.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, openApp.bot_id);
            }
            if (openApp.state != null) {
                State.ADAPTER.encodeWithTag(protoWriter, 4, openApp.state);
            }
            if (openApp.tips != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, openApp.tips);
            }
            if (openApp.last_happen != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, openApp.last_happen);
            }
            if (openApp.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, openApp.version);
            }
            if (openApp.app_tips != null) {
                AppTipsContent.ADAPTER.encodeWithTag(protoWriter, 8, openApp.app_tips);
            }
            if (openApp.bot_tips != null) {
                BotTipsContent.ADAPTER.encodeWithTag(protoWriter, 9, openApp.bot_tips);
            }
            if (openApp.i18n_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, openApp.i18n_name);
            }
            if (openApp.i18n_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, openApp.i18n_desc);
            }
            if (openApp.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, openApp.avatar_key);
            }
            if (openApp.app_id_i64 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, openApp.app_id_i64);
            }
            Ability.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, openApp.abilities);
            if (openApp.app_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, openApp.app_url);
            }
            if (openApp.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, openApp.avatar_path);
            }
            if (openApp.chatable != null) {
                Chatable.ADAPTER.encodeWithTag(protoWriter, 17, openApp.chatable);
            }
            if (openApp.extra_config != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, openApp.extra_config);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, openApp.tags);
            protoWriter.writeBytes(openApp.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.OpenApp$a */
    public static final class C15107a extends Message.Builder<OpenApp, C15107a> {

        /* renamed from: a */
        public String f40041a;

        /* renamed from: b */
        public String f40042b;

        /* renamed from: c */
        public String f40043c;

        /* renamed from: d */
        public State f40044d;

        /* renamed from: e */
        public String f40045e;

        /* renamed from: f */
        public String f40046f;

        /* renamed from: g */
        public String f40047g;

        /* renamed from: h */
        public AppTipsContent f40048h;

        /* renamed from: i */
        public BotTipsContent f40049i;

        /* renamed from: j */
        public String f40050j;

        /* renamed from: k */
        public String f40051k;

        /* renamed from: l */
        public String f40052l;

        /* renamed from: m */
        public String f40053m;

        /* renamed from: n */
        public List<Ability> f40054n = Internal.newMutableList();

        /* renamed from: o */
        public String f40055o;

        /* renamed from: p */
        public String f40056p;

        /* renamed from: q */
        public Chatable f40057q;

        /* renamed from: r */
        public String f40058r;

        /* renamed from: s */
        public List<Tag> f40059s = Internal.newMutableList();

        /* renamed from: a */
        public OpenApp build() {
            return new OpenApp(this.f40041a, this.f40042b, this.f40043c, this.f40044d, this.f40045e, this.f40046f, this.f40047g, this.f40048h, this.f40049i, this.f40050j, this.f40051k, this.f40052l, this.f40053m, this.f40054n, this.f40055o, this.f40056p, this.f40057q, this.f40058r, this.f40059s, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15107a newBuilder() {
        C15107a aVar = new C15107a();
        aVar.f40041a = this.id;
        aVar.f40042b = this.app_id;
        aVar.f40043c = this.bot_id;
        aVar.f40044d = this.state;
        aVar.f40045e = this.tips;
        aVar.f40046f = this.last_happen;
        aVar.f40047g = this.version;
        aVar.f40048h = this.app_tips;
        aVar.f40049i = this.bot_tips;
        aVar.f40050j = this.i18n_name;
        aVar.f40051k = this.i18n_desc;
        aVar.f40052l = this.avatar_key;
        aVar.f40053m = this.app_id_i64;
        aVar.f40054n = Internal.copyOf("abilities", this.abilities);
        aVar.f40055o = this.app_url;
        aVar.f40056p = this.avatar_path;
        aVar.f40057q = this.chatable;
        aVar.f40058r = this.extra_config;
        aVar.f40059s = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "OpenApp");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        if (this.last_happen != null) {
            sb.append(", last_happen=");
            sb.append(this.last_happen);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.app_tips != null) {
            sb.append(", app_tips=");
            sb.append(this.app_tips);
        }
        if (this.bot_tips != null) {
            sb.append(", bot_tips=");
            sb.append(this.bot_tips);
        }
        if (this.i18n_name != null) {
            sb.append(", i18n_name=");
            sb.append(this.i18n_name);
        }
        if (this.i18n_desc != null) {
            sb.append(", i18n_desc=");
            sb.append(this.i18n_desc);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.app_id_i64 != null) {
            sb.append(", app_id_i64=");
            sb.append(this.app_id_i64);
        }
        if (!this.abilities.isEmpty()) {
            sb.append(", abilities=");
            sb.append(this.abilities);
        }
        if (this.app_url != null) {
            sb.append(", app_url=");
            sb.append(this.app_url);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.chatable != null) {
            sb.append(", chatable=");
            sb.append(this.chatable);
        }
        if (this.extra_config != null) {
            sb.append(", extra_config=");
            sb.append(this.extra_config);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "OpenApp{");
        replace.append('}');
        return replace.toString();
    }

    public OpenApp(String str, String str2, String str3, State state2, String str4, String str5, String str6, AppTipsContent appTipsContent, BotTipsContent botTipsContent, String str7, String str8, String str9, String str10, List<Ability> list, String str11, String str12, Chatable chatable2, String str13, List<Tag> list2) {
        this(str, str2, str3, state2, str4, str5, str6, appTipsContent, botTipsContent, str7, str8, str9, str10, list, str11, str12, chatable2, str13, list2, ByteString.EMPTY);
    }

    public OpenApp(String str, String str2, String str3, State state2, String str4, String str5, String str6, AppTipsContent appTipsContent, BotTipsContent botTipsContent, String str7, String str8, String str9, String str10, List<Ability> list, String str11, String str12, Chatable chatable2, String str13, List<Tag> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.app_id = str2;
        this.bot_id = str3;
        this.state = state2;
        this.tips = str4;
        this.last_happen = str5;
        this.version = str6;
        this.app_tips = appTipsContent;
        this.bot_tips = botTipsContent;
        this.i18n_name = str7;
        this.i18n_desc = str8;
        this.avatar_key = str9;
        this.app_id_i64 = str10;
        this.abilities = Internal.immutableCopyOf("abilities", list);
        this.app_url = str11;
        this.avatar_path = str12;
        this.chatable = chatable2;
        this.extra_config = str13;
        this.tags = Internal.immutableCopyOf("tags", list2);
    }
}
