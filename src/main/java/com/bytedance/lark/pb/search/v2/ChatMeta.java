package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.search.v1.SearchAtInfo;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ChatMeta extends Message<ChatMeta, C18971a> {
    public static final ProtoAdapter<ChatMeta> ADAPTER = new C18972b();
    public static final Boolean DEFAULT_ENABLED_EMAIL = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_CROSS_WITH_KA = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_DELAYED = false;
    public static final Boolean DEFAULT_IS_DEPARTMENT = false;
    public static final Boolean DEFAULT_IS_MEETING = false;
    public static final Boolean DEFAULT_IS_MEMBER = false;
    public static final Boolean DEFAULT_IS_OFFICIAL_ONCALL = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Boolean DEFAULT_IS_TENANT = false;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Long DEFAULT_LAST_MESSAGE_TIME = 0L;
    public static final Chat.ChatMode DEFAULT_MODE = Chat.ChatMode.DEFAULT;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    public static final Chat.Type DEFAULT_TYPE = Chat.Type.P2P;
    public static final Integer DEFAULT_USER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final SearchAtInfo at_info;
    public final Boolean enabled_email;
    public final String id;
    public final Boolean is_cross_tenant;
    public final Boolean is_cross_with_ka;
    public final Boolean is_crypto;
    public final Boolean is_delayed;
    public final Boolean is_department;
    public final Boolean is_meeting;
    public final Boolean is_member;
    public final Boolean is_official_oncall;
    public final Boolean is_public_v2;
    public final Boolean is_remind;
    public final Boolean is_tenant;
    public final String last_message_id;
    public final Integer last_message_position;
    public final Integer last_message_position_badge_count;
    public final Long last_message_time;
    public final Chat.ChatMode mode;
    public final Integer new_message_count;
    public final String oncall_id;
    public final SimpleP2PChatterInfo p2p_chatter_info;
    public final Integer read_position;
    public final Integer read_position_badge_count;
    public final List<Tag> tags;
    public final Chat.Type type;
    public final Integer user_count;

    /* renamed from: com.bytedance.lark.pb.search.v2.ChatMeta$b */
    private static final class C18972b extends ProtoAdapter<ChatMeta> {
        C18972b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatMeta chatMeta) {
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
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatMeta.id);
            int i25 = 0;
            if (chatMeta.type != null) {
                i = Chat.Type.ADAPTER.encodedSizeWithTag(2, chatMeta.type);
            } else {
                i = 0;
            }
            int i26 = encodedSizeWithTag + i;
            if (chatMeta.mode != null) {
                i2 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(3, chatMeta.mode);
            } else {
                i2 = 0;
            }
            int i27 = i26 + i2;
            if (chatMeta.new_message_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, chatMeta.new_message_count);
            } else {
                i3 = 0;
            }
            int i28 = i27 + i3;
            if (chatMeta.is_department != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, chatMeta.is_department);
            } else {
                i4 = 0;
            }
            int i29 = i28 + i4;
            if (chatMeta.is_tenant != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, chatMeta.is_tenant);
            } else {
                i5 = 0;
            }
            int i30 = i29 + i5;
            if (chatMeta.is_cross_tenant != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, chatMeta.is_cross_tenant);
            } else {
                i6 = 0;
            }
            int i31 = i30 + i6;
            if (chatMeta.oncall_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, chatMeta.oncall_id);
            } else {
                i7 = 0;
            }
            int i32 = i31 + i7;
            if (chatMeta.is_crypto != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, chatMeta.is_crypto);
            } else {
                i8 = 0;
            }
            int i33 = i32 + i8;
            if (chatMeta.is_public_v2 != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, chatMeta.is_public_v2);
            } else {
                i9 = 0;
            }
            int i34 = i33 + i9;
            if (chatMeta.is_member != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, chatMeta.is_member);
            } else {
                i10 = 0;
            }
            int i35 = i34 + i10;
            if (chatMeta.is_meeting != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, chatMeta.is_meeting);
            } else {
                i11 = 0;
            }
            int i36 = i35 + i11;
            if (chatMeta.is_remind != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(13, chatMeta.is_remind);
            } else {
                i12 = 0;
            }
            int i37 = i36 + i12;
            if (chatMeta.user_count != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(24, chatMeta.user_count);
            } else {
                i13 = 0;
            }
            int i38 = i37 + i13;
            if (chatMeta.last_message_time != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(25, chatMeta.last_message_time);
            } else {
                i14 = 0;
            }
            int i39 = i38 + i14;
            if (chatMeta.is_cross_with_ka != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(26, chatMeta.is_cross_with_ka);
            } else {
                i15 = 0;
            }
            int i40 = i39 + i15;
            if (chatMeta.enabled_email != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(27, chatMeta.enabled_email);
            } else {
                i16 = 0;
            }
            int i41 = i40 + i16;
            if (chatMeta.read_position != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(14, chatMeta.read_position);
            } else {
                i17 = 0;
            }
            int i42 = i41 + i17;
            if (chatMeta.read_position_badge_count != null) {
                i18 = ProtoAdapter.INT32.encodedSizeWithTag(15, chatMeta.read_position_badge_count);
            } else {
                i18 = 0;
            }
            int i43 = i42 + i18;
            if (chatMeta.last_message_id != null) {
                i19 = ProtoAdapter.STRING.encodedSizeWithTag(16, chatMeta.last_message_id);
            } else {
                i19 = 0;
            }
            int i44 = i43 + i19;
            if (chatMeta.last_message_position != null) {
                i20 = ProtoAdapter.INT32.encodedSizeWithTag(17, chatMeta.last_message_position);
            } else {
                i20 = 0;
            }
            int i45 = i44 + i20;
            if (chatMeta.last_message_position_badge_count != null) {
                i21 = ProtoAdapter.INT32.encodedSizeWithTag(18, chatMeta.last_message_position_badge_count);
            } else {
                i21 = 0;
            }
            int i46 = i45 + i21;
            if (chatMeta.is_official_oncall != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(19, chatMeta.is_official_oncall);
            } else {
                i22 = 0;
            }
            int i47 = i46 + i22;
            if (chatMeta.at_info != null) {
                i23 = SearchAtInfo.ADAPTER.encodedSizeWithTag(20, chatMeta.at_info);
            } else {
                i23 = 0;
            }
            int encodedSizeWithTag2 = i47 + i23 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(21, chatMeta.tags);
            if (chatMeta.is_delayed != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(22, chatMeta.is_delayed);
            } else {
                i24 = 0;
            }
            int i48 = encodedSizeWithTag2 + i24;
            if (chatMeta.p2p_chatter_info != null) {
                i25 = SimpleP2PChatterInfo.ADAPTER.encodedSizeWithTag(23, chatMeta.p2p_chatter_info);
            }
            return i48 + i25 + chatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ChatMeta decode(ProtoReader protoReader) throws IOException {
            C18971a aVar = new C18971a();
            aVar.f46890a = "";
            aVar.f46891b = Chat.Type.P2P;
            aVar.f46892c = Chat.ChatMode.DEFAULT;
            aVar.f46893d = 0;
            aVar.f46894e = false;
            aVar.f46895f = false;
            aVar.f46896g = false;
            aVar.f46897h = "";
            aVar.f46898i = false;
            aVar.f46899j = false;
            aVar.f46900k = false;
            aVar.f46901l = false;
            aVar.f46902m = true;
            aVar.f46903n = 0;
            aVar.f46904o = 0L;
            aVar.f46905p = false;
            aVar.f46906q = false;
            aVar.f46907r = 0;
            aVar.f46908s = 0;
            aVar.f46909t = "";
            aVar.f46910u = 0;
            aVar.f46911v = 0;
            aVar.f46912w = false;
            aVar.f46915z = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46890a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46891b = Chat.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f46892c = Chat.ChatMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f46893d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46894e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46895f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46896g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46897h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46898i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46899j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46900k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46901l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f46902m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46907r = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f46908s = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f46909t = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f46910u = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f46911v = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            aVar.f46912w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f46913x = SearchAtInfo.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            try {
                                aVar.f46914y.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 22:
                            aVar.f46915z = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f46889A = SimpleP2PChatterInfo.ADAPTER.decode(protoReader);
                            break;
                        case 24:
                            aVar.f46903n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f46904o = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 26:
                            aVar.f46905p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f46906q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
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
        public void encode(ProtoWriter protoWriter, ChatMeta chatMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatMeta.id);
            if (chatMeta.type != null) {
                Chat.Type.ADAPTER.encodeWithTag(protoWriter, 2, chatMeta.type);
            }
            if (chatMeta.mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 3, chatMeta.mode);
            }
            if (chatMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, chatMeta.new_message_count);
            }
            if (chatMeta.is_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, chatMeta.is_department);
            }
            if (chatMeta.is_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, chatMeta.is_tenant);
            }
            if (chatMeta.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, chatMeta.is_cross_tenant);
            }
            if (chatMeta.oncall_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, chatMeta.oncall_id);
            }
            if (chatMeta.is_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, chatMeta.is_crypto);
            }
            if (chatMeta.is_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, chatMeta.is_public_v2);
            }
            if (chatMeta.is_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, chatMeta.is_member);
            }
            if (chatMeta.is_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, chatMeta.is_meeting);
            }
            if (chatMeta.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, chatMeta.is_remind);
            }
            if (chatMeta.user_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 24, chatMeta.user_count);
            }
            if (chatMeta.last_message_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 25, chatMeta.last_message_time);
            }
            if (chatMeta.is_cross_with_ka != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, chatMeta.is_cross_with_ka);
            }
            if (chatMeta.enabled_email != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, chatMeta.enabled_email);
            }
            if (chatMeta.read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, chatMeta.read_position);
            }
            if (chatMeta.read_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, chatMeta.read_position_badge_count);
            }
            if (chatMeta.last_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, chatMeta.last_message_id);
            }
            if (chatMeta.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, chatMeta.last_message_position);
            }
            if (chatMeta.last_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, chatMeta.last_message_position_badge_count);
            }
            if (chatMeta.is_official_oncall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, chatMeta.is_official_oncall);
            }
            if (chatMeta.at_info != null) {
                SearchAtInfo.ADAPTER.encodeWithTag(protoWriter, 20, chatMeta.at_info);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 21, chatMeta.tags);
            if (chatMeta.is_delayed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, chatMeta.is_delayed);
            }
            if (chatMeta.p2p_chatter_info != null) {
                SimpleP2PChatterInfo.ADAPTER.encodeWithTag(protoWriter, 23, chatMeta.p2p_chatter_info);
            }
            protoWriter.writeBytes(chatMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ChatMeta$a */
    public static final class C18971a extends Message.Builder<ChatMeta, C18971a> {

        /* renamed from: A */
        public SimpleP2PChatterInfo f46889A;

        /* renamed from: a */
        public String f46890a;

        /* renamed from: b */
        public Chat.Type f46891b;

        /* renamed from: c */
        public Chat.ChatMode f46892c;

        /* renamed from: d */
        public Integer f46893d;

        /* renamed from: e */
        public Boolean f46894e;

        /* renamed from: f */
        public Boolean f46895f;

        /* renamed from: g */
        public Boolean f46896g;

        /* renamed from: h */
        public String f46897h;

        /* renamed from: i */
        public Boolean f46898i;

        /* renamed from: j */
        public Boolean f46899j;

        /* renamed from: k */
        public Boolean f46900k;

        /* renamed from: l */
        public Boolean f46901l;

        /* renamed from: m */
        public Boolean f46902m;

        /* renamed from: n */
        public Integer f46903n;

        /* renamed from: o */
        public Long f46904o;

        /* renamed from: p */
        public Boolean f46905p;

        /* renamed from: q */
        public Boolean f46906q;

        /* renamed from: r */
        public Integer f46907r;

        /* renamed from: s */
        public Integer f46908s;

        /* renamed from: t */
        public String f46909t;

        /* renamed from: u */
        public Integer f46910u;

        /* renamed from: v */
        public Integer f46911v;

        /* renamed from: w */
        public Boolean f46912w;

        /* renamed from: x */
        public SearchAtInfo f46913x;

        /* renamed from: y */
        public List<Tag> f46914y = Internal.newMutableList();

        /* renamed from: z */
        public Boolean f46915z;

        /* renamed from: a */
        public ChatMeta build() {
            String str = this.f46890a;
            if (str != null) {
                return new ChatMeta(str, this.f46891b, this.f46892c, this.f46893d, this.f46894e, this.f46895f, this.f46896g, this.f46897h, this.f46898i, this.f46899j, this.f46900k, this.f46901l, this.f46902m, this.f46903n, this.f46904o, this.f46905p, this.f46906q, this.f46907r, this.f46908s, this.f46909t, this.f46910u, this.f46911v, this.f46912w, this.f46913x, this.f46914y, this.f46915z, this.f46889A, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18971a newBuilder() {
        C18971a aVar = new C18971a();
        aVar.f46890a = this.id;
        aVar.f46891b = this.type;
        aVar.f46892c = this.mode;
        aVar.f46893d = this.new_message_count;
        aVar.f46894e = this.is_department;
        aVar.f46895f = this.is_tenant;
        aVar.f46896g = this.is_cross_tenant;
        aVar.f46897h = this.oncall_id;
        aVar.f46898i = this.is_crypto;
        aVar.f46899j = this.is_public_v2;
        aVar.f46900k = this.is_member;
        aVar.f46901l = this.is_meeting;
        aVar.f46902m = this.is_remind;
        aVar.f46903n = this.user_count;
        aVar.f46904o = this.last_message_time;
        aVar.f46905p = this.is_cross_with_ka;
        aVar.f46906q = this.enabled_email;
        aVar.f46907r = this.read_position;
        aVar.f46908s = this.read_position_badge_count;
        aVar.f46909t = this.last_message_id;
        aVar.f46910u = this.last_message_position;
        aVar.f46911v = this.last_message_position_badge_count;
        aVar.f46912w = this.is_official_oncall;
        aVar.f46913x = this.at_info;
        aVar.f46914y = Internal.copyOf("tags", this.tags);
        aVar.f46915z = this.is_delayed;
        aVar.f46889A = this.p2p_chatter_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ChatMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.is_department != null) {
            sb.append(", is_department=");
            sb.append(this.is_department);
        }
        if (this.is_tenant != null) {
            sb.append(", is_tenant=");
            sb.append(this.is_tenant);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.oncall_id != null) {
            sb.append(", oncall_id=");
            sb.append(this.oncall_id);
        }
        if (this.is_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.is_crypto);
        }
        if (this.is_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.is_public_v2);
        }
        if (this.is_member != null) {
            sb.append(", is_member=");
            sb.append(this.is_member);
        }
        if (this.is_meeting != null) {
            sb.append(", is_meeting=");
            sb.append(this.is_meeting);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (this.last_message_time != null) {
            sb.append(", last_message_time=");
            sb.append(this.last_message_time);
        }
        if (this.is_cross_with_ka != null) {
            sb.append(", is_cross_with_ka=");
            sb.append(this.is_cross_with_ka);
        }
        if (this.enabled_email != null) {
            sb.append(", enabled_email=");
            sb.append(this.enabled_email);
        }
        if (this.read_position != null) {
            sb.append(", read_position=");
            sb.append(this.read_position);
        }
        if (this.read_position_badge_count != null) {
            sb.append(", read_position_badge_count=");
            sb.append(this.read_position_badge_count);
        }
        if (this.last_message_id != null) {
            sb.append(", last_message_id=");
            sb.append(this.last_message_id);
        }
        if (this.last_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.last_message_position);
        }
        if (this.last_message_position_badge_count != null) {
            sb.append(", last_message_position_badge_count=");
            sb.append(this.last_message_position_badge_count);
        }
        if (this.is_official_oncall != null) {
            sb.append(", is_official_oncall=");
            sb.append(this.is_official_oncall);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.is_delayed != null) {
            sb.append(", is_delayed=");
            sb.append(this.is_delayed);
        }
        if (this.p2p_chatter_info != null) {
            sb.append(", p2p_chatter_info=");
            sb.append(this.p2p_chatter_info);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ChatMeta(String str, Chat.Type type2, Chat.ChatMode chatMode, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num2, Long l, Boolean bool9, Boolean bool10, Integer num3, Integer num4, String str3, Integer num5, Integer num6, Boolean bool11, SearchAtInfo searchAtInfo, List<Tag> list, Boolean bool12, SimpleP2PChatterInfo simpleP2PChatterInfo) {
        this(str, type2, chatMode, num, bool, bool2, bool3, str2, bool4, bool5, bool6, bool7, bool8, num2, l, bool9, bool10, num3, num4, str3, num5, num6, bool11, searchAtInfo, list, bool12, simpleP2PChatterInfo, ByteString.EMPTY);
    }

    public ChatMeta(String str, Chat.Type type2, Chat.ChatMode chatMode, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num2, Long l, Boolean bool9, Boolean bool10, Integer num3, Integer num4, String str3, Integer num5, Integer num6, Boolean bool11, SearchAtInfo searchAtInfo, List<Tag> list, Boolean bool12, SimpleP2PChatterInfo simpleP2PChatterInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.mode = chatMode;
        this.new_message_count = num;
        this.is_department = bool;
        this.is_tenant = bool2;
        this.is_cross_tenant = bool3;
        this.oncall_id = str2;
        this.is_crypto = bool4;
        this.is_public_v2 = bool5;
        this.is_member = bool6;
        this.is_meeting = bool7;
        this.is_remind = bool8;
        this.user_count = num2;
        this.last_message_time = l;
        this.is_cross_with_ka = bool9;
        this.enabled_email = bool10;
        this.read_position = num3;
        this.read_position_badge_count = num4;
        this.last_message_id = str3;
        this.last_message_position = num5;
        this.last_message_position_badge_count = num6;
        this.is_official_oncall = bool11;
        this.at_info = searchAtInfo;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.is_delayed = bool12;
        this.p2p_chatter_info = simpleP2PChatterInfo;
    }
}
