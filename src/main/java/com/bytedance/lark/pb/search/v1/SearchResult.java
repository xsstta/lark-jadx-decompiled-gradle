package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.bytedance.lark.pb.basic.v1.Tag;
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

public final class SearchResult extends Message<SearchResult, C18911a> {
    public static final ProtoAdapter<SearchResult> ADAPTER = new C18912b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String avatar_path;
    public final List<String> avatar_urls;
    public final String exact_title;
    public final Icon icon;
    public final String id;
    public final String image_key;
    public final String image_url;
    public final String subtitle;
    public final List<String> subtitle_hit_terms;
    public final List<Tag> tags;
    public final String title;
    public final List<String> title_hit_terms;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CHATTER(1),
        CHAT(2),
        MESSAGE(3),
        DOC_FEED(4),
        EMAIL(5),
        DOC(6),
        EMAIL_MESSAGE(7),
        THREAD(8),
        BOX(9),
        ONCALL(10),
        CRYPTO_P2P_CHAT(11),
        OPEN_APP(12),
        LINK(13),
        EXTERNAL(14),
        WIKI(15),
        MAIL_CONTACT(16),
        DEPARTMENT(17),
        QA(18),
        PANO_TAG(19),
        PANO_VIEW(20),
        SLASH_COMMAND(21),
        SECTION(22),
        CHAMELEON(23);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return CHATTER;
                case 2:
                    return CHAT;
                case 3:
                    return MESSAGE;
                case 4:
                    return DOC_FEED;
                case 5:
                    return EMAIL;
                case 6:
                    return DOC;
                case 7:
                    return EMAIL_MESSAGE;
                case 8:
                    return THREAD;
                case 9:
                    return BOX;
                case 10:
                    return ONCALL;
                case 11:
                    return CRYPTO_P2P_CHAT;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return OPEN_APP;
                case 13:
                    return LINK;
                case 14:
                    return EXTERNAL;
                case 15:
                    return WIKI;
                case 16:
                    return MAIL_CONTACT;
                case 17:
                    return DEPARTMENT;
                case 18:
                    return QA;
                case 19:
                    return PANO_TAG;
                case 20:
                    return PANO_VIEW;
                case 21:
                    return SLASH_COMMAND;
                case 22:
                    return SECTION;
                case 23:
                    return CHAMELEON;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchResult$b */
    private static final class C18912b extends ProtoAdapter<SearchResult> {
        C18912b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchResult.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchResult searchResult) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchResult.id);
            int i9 = 0;
            if (searchResult.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, searchResult.type);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (searchResult.image_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchResult.image_url);
            } else {
                i2 = 0;
            }
            int i11 = i10 + i2;
            if (searchResult.image_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchResult.image_key);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (searchResult.title != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchResult.title);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (searchResult.exact_title != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(14, searchResult.exact_title);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (searchResult.subtitle != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchResult.subtitle);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i14 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, searchResult.title_hit_terms) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, searchResult.subtitle_hit_terms);
            if (searchResult.avatar_key != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, searchResult.avatar_key);
            } else {
                i7 = 0;
            }
            int i15 = encodedSizeWithTag2 + i7;
            if (searchResult.avatar_path != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchResult.avatar_path);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag3 = i15 + i8 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, searchResult.avatar_urls);
            if (searchResult.icon != null) {
                i9 = Icon.ADAPTER.encodedSizeWithTag(12, searchResult.icon);
            }
            return encodedSizeWithTag3 + i9 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(13, searchResult.tags) + searchResult.unknownFields().size();
        }

        /* renamed from: a */
        public SearchResult decode(ProtoReader protoReader) throws IOException {
            C18911a aVar = new C18911a();
            aVar.f46766a = "";
            aVar.f46767b = Type.UNKNOWN;
            aVar.f46768c = "";
            aVar.f46769d = "";
            aVar.f46770e = "";
            aVar.f46771f = "";
            aVar.f46772g = "";
            aVar.f46775j = "";
            aVar.f46776k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46766a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46767b = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46768c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46769d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46770e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46772g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46773h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f46774i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f46775j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46776k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46777l.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46778m = Icon.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f46779n.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f46771f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchResult searchResult) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchResult.id);
            if (searchResult.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, searchResult.type);
            }
            if (searchResult.image_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchResult.image_url);
            }
            if (searchResult.image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchResult.image_key);
            }
            if (searchResult.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchResult.title);
            }
            if (searchResult.exact_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, searchResult.exact_title);
            }
            if (searchResult.subtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchResult.subtitle);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, searchResult.title_hit_terms);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, searchResult.subtitle_hit_terms);
            if (searchResult.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, searchResult.avatar_key);
            }
            if (searchResult.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchResult.avatar_path);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, searchResult.avatar_urls);
            if (searchResult.icon != null) {
                Icon.ADAPTER.encodeWithTag(protoWriter, 12, searchResult.icon);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, searchResult.tags);
            protoWriter.writeBytes(searchResult.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchResult$a */
    public static final class C18911a extends Message.Builder<SearchResult, C18911a> {

        /* renamed from: a */
        public String f46766a;

        /* renamed from: b */
        public Type f46767b;

        /* renamed from: c */
        public String f46768c;

        /* renamed from: d */
        public String f46769d;

        /* renamed from: e */
        public String f46770e;

        /* renamed from: f */
        public String f46771f;

        /* renamed from: g */
        public String f46772g;

        /* renamed from: h */
        public List<String> f46773h = Internal.newMutableList();

        /* renamed from: i */
        public List<String> f46774i = Internal.newMutableList();

        /* renamed from: j */
        public String f46775j;

        /* renamed from: k */
        public String f46776k;

        /* renamed from: l */
        public List<String> f46777l = Internal.newMutableList();

        /* renamed from: m */
        public Icon f46778m;

        /* renamed from: n */
        public List<Tag> f46779n = Internal.newMutableList();

        /* renamed from: a */
        public SearchResult build() {
            String str = this.f46766a;
            if (str != null) {
                return new SearchResult(str, this.f46767b, this.f46768c, this.f46769d, this.f46770e, this.f46771f, this.f46772g, this.f46773h, this.f46774i, this.f46775j, this.f46776k, this.f46777l, this.f46778m, this.f46779n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18911a newBuilder() {
        C18911a aVar = new C18911a();
        aVar.f46766a = this.id;
        aVar.f46767b = this.type;
        aVar.f46768c = this.image_url;
        aVar.f46769d = this.image_key;
        aVar.f46770e = this.title;
        aVar.f46771f = this.exact_title;
        aVar.f46772g = this.subtitle;
        aVar.f46773h = Internal.copyOf("title_hit_terms", this.title_hit_terms);
        aVar.f46774i = Internal.copyOf("subtitle_hit_terms", this.subtitle_hit_terms);
        aVar.f46775j = this.avatar_key;
        aVar.f46776k = this.avatar_path;
        aVar.f46777l = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f46778m = this.icon;
        aVar.f46779n = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchResult");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        if (this.image_key != null) {
            sb.append(", image_key=");
            sb.append(this.image_key);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.exact_title != null) {
            sb.append(", exact_title=");
            sb.append(this.exact_title);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (!this.title_hit_terms.isEmpty()) {
            sb.append(", title_hit_terms=");
            sb.append(this.title_hit_terms);
        }
        if (!this.subtitle_hit_terms.isEmpty()) {
            sb.append(", subtitle_hit_terms=");
            sb.append(this.subtitle_hit_terms);
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
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchResult{");
        replace.append('}');
        return replace.toString();
    }

    public SearchResult(String str, Type type2, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, String str7, String str8, List<String> list3, Icon icon2, List<Tag> list4) {
        this(str, type2, str2, str3, str4, str5, str6, list, list2, str7, str8, list3, icon2, list4, ByteString.EMPTY);
    }

    public SearchResult(String str, Type type2, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, String str7, String str8, List<String> list3, Icon icon2, List<Tag> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.image_url = str2;
        this.image_key = str3;
        this.title = str4;
        this.exact_title = str5;
        this.subtitle = str6;
        this.title_hit_terms = Internal.immutableCopyOf("title_hit_terms", list);
        this.subtitle_hit_terms = Internal.immutableCopyOf("subtitle_hit_terms", list2);
        this.avatar_key = str7;
        this.avatar_path = str8;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list3);
        this.icon = icon2;
        this.tags = Internal.immutableCopyOf("tags", list4);
    }
}
