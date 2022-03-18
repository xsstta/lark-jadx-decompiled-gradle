package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
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

public final class SearchCryptoP2PChatMeta extends Message<SearchCryptoP2PChatMeta, C18863a> {
    public static final ProtoAdapter<SearchCryptoP2PChatMeta> ADAPTER = new C18864b();
    public static final Boolean DEFAULT_CAN_JOIN_GROUP = true;
    public static final Chatter.Description.Type DEFAULT_DESCRIPTION_FLAG = Chatter.Description.Type.ON_DEFAULT;
    public static final Boolean DEFAULT_IN_CONTACTS = true;
    public static final Boolean DEFAULT_IS_REGISTERED = false;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    public static final Chatter.Type DEFAULT_TYPE = Chatter.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean can_join_group;
    public final String chatter_id;
    public final String description;
    public final Chatter.Description.Type description_flag;
    public final String en_us_name;
    public final String id;
    public final Boolean in_contacts;
    public final Boolean is_registered;
    public final Integer last_message_position;
    public final Integer last_message_position_badge_count;
    public final String name;
    public final Integer new_message_count;
    public final Integer no_badged_new_message_count;
    public final Integer read_position;
    public final Integer read_position_badge_count;
    public final List<Tag> tags;
    public final String tenant_id;
    public final Chatter.Type type;
    public final String with_bot_tag;
    public final WorkStatus work_status;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchCryptoP2PChatMeta$b */
    private static final class C18864b extends ProtoAdapter<SearchCryptoP2PChatMeta> {
        C18864b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchCryptoP2PChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchCryptoP2PChatMeta searchCryptoP2PChatMeta) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchCryptoP2PChatMeta.id);
            int i18 = 0;
            if (searchCryptoP2PChatMeta.type != null) {
                i = Chatter.Type.ADAPTER.encodedSizeWithTag(2, searchCryptoP2PChatMeta.type);
            } else {
                i = 0;
            }
            int i19 = encodedSizeWithTag + i;
            if (searchCryptoP2PChatMeta.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchCryptoP2PChatMeta.description);
            } else {
                i2 = 0;
            }
            int i20 = i19 + i2;
            if (searchCryptoP2PChatMeta.description_flag != null) {
                i3 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(4, searchCryptoP2PChatMeta.description_flag);
            } else {
                i3 = 0;
            }
            int i21 = i20 + i3;
            if (searchCryptoP2PChatMeta.is_registered != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, searchCryptoP2PChatMeta.is_registered);
            } else {
                i4 = 0;
            }
            int i22 = i21 + i4;
            if (searchCryptoP2PChatMeta.name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchCryptoP2PChatMeta.name);
            } else {
                i5 = 0;
            }
            int i23 = i22 + i5;
            if (searchCryptoP2PChatMeta.with_bot_tag != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchCryptoP2PChatMeta.with_bot_tag);
            } else {
                i6 = 0;
            }
            int i24 = i23 + i6;
            if (searchCryptoP2PChatMeta.can_join_group != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, searchCryptoP2PChatMeta.can_join_group);
            } else {
                i7 = 0;
            }
            int i25 = i24 + i7;
            if (searchCryptoP2PChatMeta.in_contacts != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, searchCryptoP2PChatMeta.in_contacts);
            } else {
                i8 = 0;
            }
            int i26 = i25 + i8;
            if (searchCryptoP2PChatMeta.en_us_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchCryptoP2PChatMeta.en_us_name);
            } else {
                i9 = 0;
            }
            int i27 = i26 + i9;
            if (searchCryptoP2PChatMeta.tenant_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, searchCryptoP2PChatMeta.tenant_id);
            } else {
                i10 = 0;
            }
            int i28 = i27 + i10;
            if (searchCryptoP2PChatMeta.new_message_count != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(12, searchCryptoP2PChatMeta.new_message_count);
            } else {
                i11 = 0;
            }
            int i29 = i28 + i11;
            if (searchCryptoP2PChatMeta.no_badged_new_message_count != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(13, searchCryptoP2PChatMeta.no_badged_new_message_count);
            } else {
                i12 = 0;
            }
            int i30 = i29 + i12;
            if (searchCryptoP2PChatMeta.read_position != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(14, searchCryptoP2PChatMeta.read_position);
            } else {
                i13 = 0;
            }
            int i31 = i30 + i13;
            if (searchCryptoP2PChatMeta.read_position_badge_count != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(15, searchCryptoP2PChatMeta.read_position_badge_count);
            } else {
                i14 = 0;
            }
            int i32 = i31 + i14;
            if (searchCryptoP2PChatMeta.last_message_position != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(16, searchCryptoP2PChatMeta.last_message_position);
            } else {
                i15 = 0;
            }
            int i33 = i32 + i15;
            if (searchCryptoP2PChatMeta.last_message_position_badge_count != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(17, searchCryptoP2PChatMeta.last_message_position_badge_count);
            } else {
                i16 = 0;
            }
            int i34 = i33 + i16;
            if (searchCryptoP2PChatMeta.work_status != null) {
                i17 = WorkStatus.ADAPTER.encodedSizeWithTag(18, searchCryptoP2PChatMeta.work_status);
            } else {
                i17 = 0;
            }
            int i35 = i34 + i17;
            if (searchCryptoP2PChatMeta.chatter_id != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(19, searchCryptoP2PChatMeta.chatter_id);
            }
            return i35 + i18 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(29, searchCryptoP2PChatMeta.tags) + searchCryptoP2PChatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchCryptoP2PChatMeta decode(ProtoReader protoReader) throws IOException {
            C18863a aVar = new C18863a();
            aVar.f46612a = "";
            aVar.f46613b = Chatter.Type.UNKNOWN;
            aVar.f46614c = "";
            aVar.f46615d = Chatter.Description.Type.ON_DEFAULT;
            aVar.f46616e = false;
            aVar.f46617f = "";
            aVar.f46618g = "bot";
            aVar.f46619h = true;
            aVar.f46620i = true;
            aVar.f46621j = "";
            aVar.f46622k = "";
            aVar.f46623l = 0;
            aVar.f46624m = 0;
            aVar.f46625n = 0;
            aVar.f46626o = 0;
            aVar.f46627p = 0;
            aVar.f46628q = 0;
            aVar.f46630s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 29) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46612a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f46613b = Chatter.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46614c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            try {
                                aVar.f46615d = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f46616e = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f46617f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f46618g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f46619h = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f46620i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f46621j = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f46622k = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46623l = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f46624m = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 14:
                            aVar.f46625n = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 15:
                            aVar.f46626o = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 16:
                            aVar.f46627p = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 17:
                            aVar.f46628q = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 18:
                            aVar.f46629r = WorkStatus.ADAPTER.decode(protoReader);
                            continue;
                        case 19:
                            aVar.f46630s = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    try {
                        aVar.f46631t.add(Tag.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchCryptoP2PChatMeta searchCryptoP2PChatMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchCryptoP2PChatMeta.id);
            if (searchCryptoP2PChatMeta.type != null) {
                Chatter.Type.ADAPTER.encodeWithTag(protoWriter, 2, searchCryptoP2PChatMeta.type);
            }
            if (searchCryptoP2PChatMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchCryptoP2PChatMeta.description);
            }
            if (searchCryptoP2PChatMeta.description_flag != null) {
                Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 4, searchCryptoP2PChatMeta.description_flag);
            }
            if (searchCryptoP2PChatMeta.is_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, searchCryptoP2PChatMeta.is_registered);
            }
            if (searchCryptoP2PChatMeta.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchCryptoP2PChatMeta.name);
            }
            if (searchCryptoP2PChatMeta.with_bot_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchCryptoP2PChatMeta.with_bot_tag);
            }
            if (searchCryptoP2PChatMeta.can_join_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, searchCryptoP2PChatMeta.can_join_group);
            }
            if (searchCryptoP2PChatMeta.in_contacts != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, searchCryptoP2PChatMeta.in_contacts);
            }
            if (searchCryptoP2PChatMeta.en_us_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchCryptoP2PChatMeta.en_us_name);
            }
            if (searchCryptoP2PChatMeta.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, searchCryptoP2PChatMeta.tenant_id);
            }
            if (searchCryptoP2PChatMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, searchCryptoP2PChatMeta.new_message_count);
            }
            if (searchCryptoP2PChatMeta.no_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, searchCryptoP2PChatMeta.no_badged_new_message_count);
            }
            if (searchCryptoP2PChatMeta.read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, searchCryptoP2PChatMeta.read_position);
            }
            if (searchCryptoP2PChatMeta.read_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, searchCryptoP2PChatMeta.read_position_badge_count);
            }
            if (searchCryptoP2PChatMeta.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, searchCryptoP2PChatMeta.last_message_position);
            }
            if (searchCryptoP2PChatMeta.last_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, searchCryptoP2PChatMeta.last_message_position_badge_count);
            }
            if (searchCryptoP2PChatMeta.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 18, searchCryptoP2PChatMeta.work_status);
            }
            if (searchCryptoP2PChatMeta.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, searchCryptoP2PChatMeta.chatter_id);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 29, searchCryptoP2PChatMeta.tags);
            protoWriter.writeBytes(searchCryptoP2PChatMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchCryptoP2PChatMeta$a */
    public static final class C18863a extends Message.Builder<SearchCryptoP2PChatMeta, C18863a> {

        /* renamed from: a */
        public String f46612a;

        /* renamed from: b */
        public Chatter.Type f46613b;

        /* renamed from: c */
        public String f46614c;

        /* renamed from: d */
        public Chatter.Description.Type f46615d;

        /* renamed from: e */
        public Boolean f46616e;

        /* renamed from: f */
        public String f46617f;

        /* renamed from: g */
        public String f46618g;

        /* renamed from: h */
        public Boolean f46619h;

        /* renamed from: i */
        public Boolean f46620i;

        /* renamed from: j */
        public String f46621j;

        /* renamed from: k */
        public String f46622k;

        /* renamed from: l */
        public Integer f46623l;

        /* renamed from: m */
        public Integer f46624m;

        /* renamed from: n */
        public Integer f46625n;

        /* renamed from: o */
        public Integer f46626o;

        /* renamed from: p */
        public Integer f46627p;

        /* renamed from: q */
        public Integer f46628q;

        /* renamed from: r */
        public WorkStatus f46629r;

        /* renamed from: s */
        public String f46630s;

        /* renamed from: t */
        public List<Tag> f46631t = Internal.newMutableList();

        /* renamed from: a */
        public SearchCryptoP2PChatMeta build() {
            String str = this.f46612a;
            if (str != null) {
                return new SearchCryptoP2PChatMeta(str, this.f46613b, this.f46614c, this.f46615d, this.f46616e, this.f46617f, this.f46618g, this.f46619h, this.f46620i, this.f46621j, this.f46622k, this.f46623l, this.f46624m, this.f46625n, this.f46626o, this.f46627p, this.f46628q, this.f46629r, this.f46630s, this.f46631t, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18863a newBuilder() {
        C18863a aVar = new C18863a();
        aVar.f46612a = this.id;
        aVar.f46613b = this.type;
        aVar.f46614c = this.description;
        aVar.f46615d = this.description_flag;
        aVar.f46616e = this.is_registered;
        aVar.f46617f = this.name;
        aVar.f46618g = this.with_bot_tag;
        aVar.f46619h = this.can_join_group;
        aVar.f46620i = this.in_contacts;
        aVar.f46621j = this.en_us_name;
        aVar.f46622k = this.tenant_id;
        aVar.f46623l = this.new_message_count;
        aVar.f46624m = this.no_badged_new_message_count;
        aVar.f46625n = this.read_position;
        aVar.f46626o = this.read_position_badge_count;
        aVar.f46627p = this.last_message_position;
        aVar.f46628q = this.last_message_position_badge_count;
        aVar.f46629r = this.work_status;
        aVar.f46630s = this.chatter_id;
        aVar.f46631t = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchCryptoP2PChatMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.description_flag != null) {
            sb.append(", description_flag=");
            sb.append(this.description_flag);
        }
        if (this.is_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.is_registered);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.with_bot_tag != null) {
            sb.append(", with_bot_tag=");
            sb.append(this.with_bot_tag);
        }
        if (this.can_join_group != null) {
            sb.append(", can_join_group=");
            sb.append(this.can_join_group);
        }
        if (this.in_contacts != null) {
            sb.append(", in_contacts=");
            sb.append(this.in_contacts);
        }
        if (this.en_us_name != null) {
            sb.append(", en_us_name=");
            sb.append(this.en_us_name);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.no_badged_new_message_count != null) {
            sb.append(", no_badged_new_message_count=");
            sb.append(this.no_badged_new_message_count);
        }
        if (this.read_position != null) {
            sb.append(", read_position=");
            sb.append(this.read_position);
        }
        if (this.read_position_badge_count != null) {
            sb.append(", read_position_badge_count=");
            sb.append(this.read_position_badge_count);
        }
        if (this.last_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.last_message_position);
        }
        if (this.last_message_position_badge_count != null) {
            sb.append(", last_message_position_badge_count=");
            sb.append(this.last_message_position_badge_count);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchCryptoP2PChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchCryptoP2PChatMeta(String str, Chatter.Type type2, String str2, Chatter.Description.Type type3, Boolean bool, String str3, String str4, Boolean bool2, Boolean bool3, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, WorkStatus workStatus, String str7, List<Tag> list) {
        this(str, type2, str2, type3, bool, str3, str4, bool2, bool3, str5, str6, num, num2, num3, num4, num5, num6, workStatus, str7, list, ByteString.EMPTY);
    }

    public SearchCryptoP2PChatMeta(String str, Chatter.Type type2, String str2, Chatter.Description.Type type3, Boolean bool, String str3, String str4, Boolean bool2, Boolean bool3, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, WorkStatus workStatus, String str7, List<Tag> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.description = str2;
        this.description_flag = type3;
        this.is_registered = bool;
        this.name = str3;
        this.with_bot_tag = str4;
        this.can_join_group = bool2;
        this.in_contacts = bool3;
        this.en_us_name = str5;
        this.tenant_id = str6;
        this.new_message_count = num;
        this.no_badged_new_message_count = num2;
        this.read_position = num3;
        this.read_position_badge_count = num4;
        this.last_message_position = num5;
        this.last_message_position_badge_count = num6;
        this.work_status = workStatus;
        this.chatter_id = str7;
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
