package com.bytedance.lark.pb.search.v1;

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

public final class SearchAtInfo extends Message<SearchAtInfo, C18853a> {
    public static final ProtoAdapter<SearchAtInfo> ADAPTER = new C18854b();
    public static final AtType DEFAULT_TYPE = AtType.ALL;
    private static final long serialVersionUID = 0;
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

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchAtInfo$b */
    private static final class C18854b extends ProtoAdapter<SearchAtInfo> {
        C18854b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchAtInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchAtInfo searchAtInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = AtType.ADAPTER.encodedSizeWithTag(1, searchAtInfo.type);
            int i6 = 0;
            if (searchAtInfo.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, searchAtInfo.user_id);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (searchAtInfo.localized_user_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchAtInfo.localized_user_name);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (searchAtInfo.channel_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchAtInfo.channel_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (searchAtInfo.channel_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchAtInfo.channel_name);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (searchAtInfo.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchAtInfo.avatar_key);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (searchAtInfo.avatar_path != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchAtInfo.avatar_path);
            }
            return i11 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, searchAtInfo.avatar_urls) + searchAtInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SearchAtInfo decode(ProtoReader protoReader) throws IOException {
            C18853a aVar = new C18853a();
            aVar.f46535a = AtType.ALL;
            aVar.f46536b = "";
            aVar.f46537c = "";
            aVar.f46538d = "";
            aVar.f46539e = "";
            aVar.f46540f = "";
            aVar.f46541g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f46535a = AtType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f46536b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46537c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46538d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46539e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46540f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46541g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46542h.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SearchAtInfo searchAtInfo) throws IOException {
            AtType.ADAPTER.encodeWithTag(protoWriter, 1, searchAtInfo.type);
            if (searchAtInfo.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchAtInfo.user_id);
            }
            if (searchAtInfo.localized_user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchAtInfo.localized_user_name);
            }
            if (searchAtInfo.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchAtInfo.channel_id);
            }
            if (searchAtInfo.channel_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchAtInfo.channel_name);
            }
            if (searchAtInfo.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchAtInfo.avatar_key);
            }
            if (searchAtInfo.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchAtInfo.avatar_path);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, searchAtInfo.avatar_urls);
            protoWriter.writeBytes(searchAtInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchAtInfo$a */
    public static final class C18853a extends Message.Builder<SearchAtInfo, C18853a> {

        /* renamed from: a */
        public AtType f46535a;

        /* renamed from: b */
        public String f46536b;

        /* renamed from: c */
        public String f46537c;

        /* renamed from: d */
        public String f46538d;

        /* renamed from: e */
        public String f46539e;

        /* renamed from: f */
        public String f46540f;

        /* renamed from: g */
        public String f46541g;

        /* renamed from: h */
        public List<String> f46542h = Internal.newMutableList();

        /* renamed from: a */
        public SearchAtInfo build() {
            AtType atType = this.f46535a;
            if (atType != null) {
                return new SearchAtInfo(atType, this.f46536b, this.f46537c, this.f46538d, this.f46539e, this.f46540f, this.f46541g, this.f46542h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(atType, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C18853a newBuilder() {
        C18853a aVar = new C18853a();
        aVar.f46535a = this.type;
        aVar.f46536b = this.user_id;
        aVar.f46537c = this.localized_user_name;
        aVar.f46538d = this.channel_id;
        aVar.f46539e = this.channel_name;
        aVar.f46540f = this.avatar_key;
        aVar.f46541g = this.avatar_path;
        aVar.f46542h = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchAtInfo");
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
        StringBuilder replace = sb.replace(0, 2, "SearchAtInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SearchAtInfo(AtType atType, String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        this(atType, str, str2, str3, str4, str5, str6, list, ByteString.EMPTY);
    }

    public SearchAtInfo(AtType atType, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = atType;
        this.user_id = str;
        this.localized_user_name = str2;
        this.channel_id = str3;
        this.channel_name = str4;
        this.avatar_key = str5;
        this.avatar_path = str6;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
    }
}
