package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AtInfo extends Message<AtInfo, C17090a> {
    public static final ProtoAdapter<AtInfo> ADAPTER = new C17091b();
    public static final Long DEFAULT_AT_DISPLAY_TIME = 0L;
    public static final Long DEFAULT_AT_RANK_TIME = 0L;
    public static final AtType DEFAULT_TYPE = AtType.ALL;
    private static final long serialVersionUID = 0;
    public final String at_content;
    public final Long at_display_time;
    public final Long at_rank_time;
    public final String avatar_key;
    public final String avatar_path;
    public final List<String> avatar_urls;
    public final String channel_id;
    public final String channel_name;
    public final String localized_user_name;
    public final AtType type;
    public final String user_id;

    public enum AtType implements WireEnum {
        ALL(1),
        USER(2);
        
        public static final ProtoAdapter<AtType> ADAPTER = ProtoAdapter.newEnumAdapter(AtType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AtType fromValue(int i) {
            if (i == 1) {
                return ALL;
            }
            if (i != 2) {
                return null;
            }
            return USER;
        }

        private AtType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.AtInfo$b */
    private static final class C17091b extends ProtoAdapter<AtInfo> {
        C17091b() {
            super(FieldEncoding.LENGTH_DELIMITED, AtInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(AtInfo atInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int encodedSizeWithTag = AtType.ADAPTER.encodedSizeWithTag(1, atInfo.type);
            int i9 = 0;
            if (atInfo.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, atInfo.user_id);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (atInfo.localized_user_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, atInfo.localized_user_name);
            } else {
                i2 = 0;
            }
            int i11 = i10 + i2;
            if (atInfo.channel_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, atInfo.channel_id);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (atInfo.channel_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, atInfo.channel_name);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (atInfo.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, atInfo.avatar_key);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (atInfo.avatar_path != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, atInfo.avatar_path);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i14 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, atInfo.avatar_urls);
            if (atInfo.at_rank_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(9, atInfo.at_rank_time);
            } else {
                i7 = 0;
            }
            int i15 = encodedSizeWithTag2 + i7;
            if (atInfo.at_display_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(10, atInfo.at_display_time);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (atInfo.at_content != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(11, atInfo.at_content);
            }
            return i16 + i9 + atInfo.unknownFields().size();
        }

        /* renamed from: a */
        public AtInfo decode(ProtoReader protoReader) throws IOException {
            C17090a aVar = new C17090a();
            aVar.f43759a = AtType.ALL;
            aVar.f43760b = "";
            aVar.f43761c = "";
            aVar.f43762d = "";
            aVar.f43763e = "";
            aVar.f43764f = "";
            aVar.f43765g = "";
            aVar.f43767i = 0L;
            aVar.f43768j = 0L;
            aVar.f43769k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f43759a = AtType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f43760b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43761c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43762d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43763e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43764f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43765g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43766h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f43767i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43768j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43769k = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, AtInfo atInfo) throws IOException {
            AtType.ADAPTER.encodeWithTag(protoWriter, 1, atInfo.type);
            if (atInfo.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, atInfo.user_id);
            }
            if (atInfo.localized_user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, atInfo.localized_user_name);
            }
            if (atInfo.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, atInfo.channel_id);
            }
            if (atInfo.channel_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, atInfo.channel_name);
            }
            if (atInfo.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, atInfo.avatar_key);
            }
            if (atInfo.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, atInfo.avatar_path);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, atInfo.avatar_urls);
            if (atInfo.at_rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, atInfo.at_rank_time);
            }
            if (atInfo.at_display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, atInfo.at_display_time);
            }
            if (atInfo.at_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, atInfo.at_content);
            }
            protoWriter.writeBytes(atInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.AtInfo$a */
    public static final class C17090a extends Message.Builder<AtInfo, C17090a> {

        /* renamed from: a */
        public AtType f43759a;

        /* renamed from: b */
        public String f43760b;

        /* renamed from: c */
        public String f43761c;

        /* renamed from: d */
        public String f43762d;

        /* renamed from: e */
        public String f43763e;

        /* renamed from: f */
        public String f43764f;

        /* renamed from: g */
        public String f43765g;

        /* renamed from: h */
        public List<String> f43766h = Internal.newMutableList();

        /* renamed from: i */
        public Long f43767i;

        /* renamed from: j */
        public Long f43768j;

        /* renamed from: k */
        public String f43769k;

        /* renamed from: a */
        public AtInfo build() {
            AtType atType = this.f43759a;
            if (atType != null) {
                return new AtInfo(atType, this.f43760b, this.f43761c, this.f43762d, this.f43763e, this.f43764f, this.f43765g, this.f43766h, this.f43767i, this.f43768j, this.f43769k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(atType, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C17090a newBuilder() {
        C17090a aVar = new C17090a();
        aVar.f43759a = this.type;
        aVar.f43760b = this.user_id;
        aVar.f43761c = this.localized_user_name;
        aVar.f43762d = this.channel_id;
        aVar.f43763e = this.channel_name;
        aVar.f43764f = this.avatar_key;
        aVar.f43765g = this.avatar_path;
        aVar.f43766h = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f43767i = this.at_rank_time;
        aVar.f43768j = this.at_display_time;
        aVar.f43769k = this.at_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "AtInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.localized_user_name != null) {
            sb.append(", localized_user_name=");
            sb.append(this.localized_user_name);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.channel_name != null) {
            sb.append(", channel_name=");
            sb.append(this.channel_name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.at_rank_time != null) {
            sb.append(", at_rank_time=");
            sb.append(this.at_rank_time);
        }
        if (this.at_display_time != null) {
            sb.append(", at_display_time=");
            sb.append(this.at_display_time);
        }
        if (this.at_content != null) {
            sb.append(", at_content=");
            sb.append(this.at_content);
        }
        StringBuilder replace = sb.replace(0, 2, "AtInfo{");
        replace.append('}');
        return replace.toString();
    }

    public AtInfo(AtType atType, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, Long l, Long l2, String str7) {
        this(atType, str, str2, str3, str4, str5, str6, list, l, l2, str7, ByteString.EMPTY);
    }

    public AtInfo(AtType atType, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, Long l, Long l2, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = atType;
        this.user_id = str;
        this.localized_user_name = str2;
        this.channel_id = str3;
        this.channel_name = str4;
        this.avatar_key = str5;
        this.avatar_path = str6;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.at_rank_time = l;
        this.at_display_time = l2;
        this.at_content = str7;
    }
}
