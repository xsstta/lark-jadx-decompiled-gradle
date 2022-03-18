package com.ss.android.lark.pb.usearch;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Chat;
import java.io.IOException;
import okio.ByteString;

public final class GroupChatMeta extends Message<GroupChatMeta, C50208a> {
    public static final ProtoAdapter<GroupChatMeta> ADAPTER = new C50209b();
    public static final Boolean DEFAULT_ENABLED_EMAIL = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_CROSS_WITH_KA = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_DEPARTMENT = false;
    public static final Boolean DEFAULT_IS_MEETING = false;
    public static final Boolean DEFAULT_IS_MEMBER = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Boolean DEFAULT_IS_TENANT = false;
    public static final Long DEFAULT_LAST_MESSAGE_TIME = 0L;
    public static final Integer DEFAULT_USER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean menabled_email;
    public final String mid;
    public final Boolean mis_cross_tenant;
    public final Boolean mis_cross_with_ka;
    public final Boolean mis_crypto;
    public final Boolean mis_department;
    public final Boolean mis_meeting;
    public final Boolean mis_member;
    public final Boolean mis_public_v2;
    public final Boolean mis_tenant;
    public final Long mlast_message_time;
    public final Chat.ChatMode mmode;
    public final String moncall_id;
    public final Integer muser_count;

    /* renamed from: com.ss.android.lark.pb.usearch.GroupChatMeta$b */
    private static final class C50209b extends ProtoAdapter<GroupChatMeta> {
        C50209b() {
            super(FieldEncoding.LENGTH_DELIMITED, GroupChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(GroupChatMeta groupChatMeta) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, groupChatMeta.mid);
            int i13 = 0;
            if (groupChatMeta.mmode != null) {
                i = Chat.ChatMode.ADAPTER.encodedSizeWithTag(2, groupChatMeta.mmode);
            } else {
                i = 0;
            }
            int i14 = encodedSizeWithTag + i;
            if (groupChatMeta.mis_department != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, groupChatMeta.mis_department);
            } else {
                i2 = 0;
            }
            int i15 = i14 + i2;
            if (groupChatMeta.mis_tenant != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, groupChatMeta.mis_tenant);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (groupChatMeta.mis_cross_tenant != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, groupChatMeta.mis_cross_tenant);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (groupChatMeta.moncall_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, groupChatMeta.moncall_id);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (groupChatMeta.mis_crypto != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, groupChatMeta.mis_crypto);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (groupChatMeta.mis_public_v2 != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, groupChatMeta.mis_public_v2);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (groupChatMeta.mis_member != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, groupChatMeta.mis_member);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (groupChatMeta.mis_meeting != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, groupChatMeta.mis_meeting);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (groupChatMeta.muser_count != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, groupChatMeta.muser_count);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (groupChatMeta.mlast_message_time != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(12, groupChatMeta.mlast_message_time);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (groupChatMeta.mis_cross_with_ka != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(13, groupChatMeta.mis_cross_with_ka);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (groupChatMeta.menabled_email != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(14, groupChatMeta.menabled_email);
            }
            return i25 + i13 + groupChatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public GroupChatMeta decode(ProtoReader protoReader) throws IOException {
            C50208a aVar = new C50208a();
            aVar.f125442a = "";
            aVar.f125444c = false;
            aVar.f125445d = false;
            aVar.f125446e = false;
            aVar.f125447f = "";
            aVar.f125448g = false;
            aVar.f125449h = false;
            aVar.f125450i = false;
            aVar.f125451j = false;
            aVar.f125452k = 0;
            aVar.f125453l = 0L;
            aVar.f125454m = false;
            aVar.f125455n = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125442a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125443b = Chat.ChatMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125444c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125445d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125446e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125447f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125448g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125449h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125450i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125451j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125452k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125453l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125454m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f125455n = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GroupChatMeta groupChatMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, groupChatMeta.mid);
            if (groupChatMeta.mmode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 2, groupChatMeta.mmode);
            }
            if (groupChatMeta.mis_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, groupChatMeta.mis_department);
            }
            if (groupChatMeta.mis_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, groupChatMeta.mis_tenant);
            }
            if (groupChatMeta.mis_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, groupChatMeta.mis_cross_tenant);
            }
            if (groupChatMeta.moncall_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, groupChatMeta.moncall_id);
            }
            if (groupChatMeta.mis_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, groupChatMeta.mis_crypto);
            }
            if (groupChatMeta.mis_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, groupChatMeta.mis_public_v2);
            }
            if (groupChatMeta.mis_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, groupChatMeta.mis_member);
            }
            if (groupChatMeta.mis_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, groupChatMeta.mis_meeting);
            }
            if (groupChatMeta.muser_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, groupChatMeta.muser_count);
            }
            if (groupChatMeta.mlast_message_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, groupChatMeta.mlast_message_time);
            }
            if (groupChatMeta.mis_cross_with_ka != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, groupChatMeta.mis_cross_with_ka);
            }
            if (groupChatMeta.menabled_email != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, groupChatMeta.menabled_email);
            }
            protoWriter.writeBytes(groupChatMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.GroupChatMeta$a */
    public static final class C50208a extends Message.Builder<GroupChatMeta, C50208a> {

        /* renamed from: a */
        public String f125442a;

        /* renamed from: b */
        public Chat.ChatMode f125443b;

        /* renamed from: c */
        public Boolean f125444c;

        /* renamed from: d */
        public Boolean f125445d;

        /* renamed from: e */
        public Boolean f125446e;

        /* renamed from: f */
        public String f125447f;

        /* renamed from: g */
        public Boolean f125448g;

        /* renamed from: h */
        public Boolean f125449h;

        /* renamed from: i */
        public Boolean f125450i;

        /* renamed from: j */
        public Boolean f125451j;

        /* renamed from: k */
        public Integer f125452k;

        /* renamed from: l */
        public Long f125453l;

        /* renamed from: m */
        public Boolean f125454m;

        /* renamed from: n */
        public Boolean f125455n;

        /* renamed from: a */
        public GroupChatMeta build() {
            String str = this.f125442a;
            if (str != null) {
                return new GroupChatMeta(str, this.f125443b, this.f125444c, this.f125445d, this.f125446e, this.f125447f, this.f125448g, this.f125449h, this.f125450i, this.f125451j, this.f125452k, this.f125453l, this.f125454m, this.f125455n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50208a newBuilder() {
        C50208a aVar = new C50208a();
        aVar.f125442a = this.mid;
        aVar.f125443b = this.mmode;
        aVar.f125444c = this.mis_department;
        aVar.f125445d = this.mis_tenant;
        aVar.f125446e = this.mis_cross_tenant;
        aVar.f125447f = this.moncall_id;
        aVar.f125448g = this.mis_crypto;
        aVar.f125449h = this.mis_public_v2;
        aVar.f125450i = this.mis_member;
        aVar.f125451j = this.mis_meeting;
        aVar.f125452k = this.muser_count;
        aVar.f125453l = this.mlast_message_time;
        aVar.f125454m = this.mis_cross_with_ka;
        aVar.f125455n = this.menabled_email;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mmode != null) {
            sb.append(", mode=");
            sb.append(this.mmode);
        }
        if (this.mis_department != null) {
            sb.append(", is_department=");
            sb.append(this.mis_department);
        }
        if (this.mis_tenant != null) {
            sb.append(", is_tenant=");
            sb.append(this.mis_tenant);
        }
        if (this.mis_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.mis_cross_tenant);
        }
        if (this.moncall_id != null) {
            sb.append(", oncall_id=");
            sb.append(this.moncall_id);
        }
        if (this.mis_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.mis_crypto);
        }
        if (this.mis_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.mis_public_v2);
        }
        if (this.mis_member != null) {
            sb.append(", is_member=");
            sb.append(this.mis_member);
        }
        if (this.mis_meeting != null) {
            sb.append(", is_meeting=");
            sb.append(this.mis_meeting);
        }
        if (this.muser_count != null) {
            sb.append(", user_count=");
            sb.append(this.muser_count);
        }
        if (this.mlast_message_time != null) {
            sb.append(", last_message_time=");
            sb.append(this.mlast_message_time);
        }
        if (this.mis_cross_with_ka != null) {
            sb.append(", is_cross_with_ka=");
            sb.append(this.mis_cross_with_ka);
        }
        if (this.menabled_email != null) {
            sb.append(", enabled_email=");
            sb.append(this.menabled_email);
        }
        StringBuilder replace = sb.replace(0, 2, "GroupChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public GroupChatMeta(String str, Chat.ChatMode chatMode, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Long l, Boolean bool8, Boolean bool9) {
        this(str, chatMode, bool, bool2, bool3, str2, bool4, bool5, bool6, bool7, num, l, bool8, bool9, ByteString.EMPTY);
    }

    public GroupChatMeta(String str, Chat.ChatMode chatMode, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Long l, Boolean bool8, Boolean bool9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mmode = chatMode;
        this.mis_department = bool;
        this.mis_tenant = bool2;
        this.mis_cross_tenant = bool3;
        this.moncall_id = str2;
        this.mis_crypto = bool4;
        this.mis_public_v2 = bool5;
        this.mis_member = bool6;
        this.mis_meeting = bool7;
        this.muser_count = num;
        this.mlast_message_time = l;
        this.mis_cross_with_ka = bool8;
        this.menabled_email = bool9;
    }
}
