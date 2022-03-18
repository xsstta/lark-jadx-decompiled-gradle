package com.ss.android.lark.pb.searches;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Image;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchResult extends Message<SearchResult, C50042a> {
    public static final ProtoAdapter<SearchResult> ADAPTER = new C50043b();
    private static final long serialVersionUID = 0;
    public final Image mavatar;
    public final String mavatar_key;
    public final String mexact_title;
    public final String mid;
    public final String mimage_key;
    public final String mimage_url;
    public final String msubtitle;
    public final List<String> msubtitle_hit_terms;
    public final String mtitle;
    public final List<String> mtitle_hit_terms;
    public final Type mtype;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CHATTER(1),
        CHAT(2),
        MESSAGE(3),
        DOC_FEED(4),
        EMAIL(5),
        DOC(6),
        EMAIL_MESSAGE(7),
        THREAD_FEED(8),
        CHAT_BOX(9),
        ONCALL(10),
        CRYPTO_P2P_CHAT(11),
        APP(12),
        URL(13),
        EXTERNAL(14),
        WIKI(15),
        MAIL_CONTACT(16),
        DEPARTMENT(17),
        QA(18),
        PANO_TAG(19),
        PANO_VIEW(20),
        SLASH_COMMAND(21),
        SECTION(22);
        
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
                    return THREAD_FEED;
                case 9:
                    return CHAT_BOX;
                case 10:
                    return ONCALL;
                case 11:
                    return CRYPTO_P2P_CHAT;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return APP;
                case 13:
                    return URL;
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
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.SearchResult$b */
    private static final class C50043b extends ProtoAdapter<SearchResult> {
        C50043b() {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchResult.mid);
            int i8 = 0;
            if (searchResult.mtype != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, searchResult.mtype);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (searchResult.mimage_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchResult.mimage_url);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (searchResult.mimage_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchResult.mimage_key);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (searchResult.mtitle != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchResult.mtitle);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (searchResult.msubtitle != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchResult.msubtitle);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag2 = i12 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, searchResult.mtitle_hit_terms) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, searchResult.msubtitle_hit_terms);
            if (searchResult.mavatar_key != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, searchResult.mavatar_key);
            } else {
                i6 = 0;
            }
            int i13 = encodedSizeWithTag2 + i6;
            if (searchResult.mavatar != null) {
                i7 = Image.ADAPTER.encodedSizeWithTag(10, searchResult.mavatar);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (searchResult.mexact_title != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, searchResult.mexact_title);
            }
            return i14 + i8 + searchResult.unknownFields().size();
        }

        /* renamed from: a */
        public SearchResult decode(ProtoReader protoReader) throws IOException {
            C50042a aVar = new C50042a();
            aVar.f125146a = "";
            aVar.f125148c = "";
            aVar.f125149d = "";
            aVar.f125150e = "";
            aVar.f125151f = "";
            aVar.f125154i = "";
            aVar.f125156k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125146a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125147b = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125148c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125149d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125150e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125151f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125152g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f125153h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f125154i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125155j = Image.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125156k = ProtoAdapter.STRING.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchResult.mid);
            if (searchResult.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, searchResult.mtype);
            }
            if (searchResult.mimage_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchResult.mimage_url);
            }
            if (searchResult.mimage_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchResult.mimage_key);
            }
            if (searchResult.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchResult.mtitle);
            }
            if (searchResult.msubtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchResult.msubtitle);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, searchResult.mtitle_hit_terms);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, searchResult.msubtitle_hit_terms);
            if (searchResult.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, searchResult.mavatar_key);
            }
            if (searchResult.mavatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 10, searchResult.mavatar);
            }
            if (searchResult.mexact_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, searchResult.mexact_title);
            }
            protoWriter.writeBytes(searchResult.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.SearchResult$a */
    public static final class C50042a extends Message.Builder<SearchResult, C50042a> {

        /* renamed from: a */
        public String f125146a;

        /* renamed from: b */
        public Type f125147b;

        /* renamed from: c */
        public String f125148c;

        /* renamed from: d */
        public String f125149d;

        /* renamed from: e */
        public String f125150e;

        /* renamed from: f */
        public String f125151f;

        /* renamed from: g */
        public List<String> f125152g = Internal.newMutableList();

        /* renamed from: h */
        public List<String> f125153h = Internal.newMutableList();

        /* renamed from: i */
        public String f125154i;

        /* renamed from: j */
        public Image f125155j;

        /* renamed from: k */
        public String f125156k;

        /* renamed from: a */
        public SearchResult build() {
            String str = this.f125146a;
            if (str != null) {
                return new SearchResult(str, this.f125147b, this.f125148c, this.f125149d, this.f125150e, this.f125151f, this.f125152g, this.f125153h, this.f125154i, this.f125155j, this.f125156k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50042a newBuilder() {
        C50042a aVar = new C50042a();
        aVar.f125146a = this.mid;
        aVar.f125147b = this.mtype;
        aVar.f125148c = this.mimage_url;
        aVar.f125149d = this.mimage_key;
        aVar.f125150e = this.mtitle;
        aVar.f125151f = this.msubtitle;
        aVar.f125152g = Internal.copyOf("mtitle_hit_terms", this.mtitle_hit_terms);
        aVar.f125153h = Internal.copyOf("msubtitle_hit_terms", this.msubtitle_hit_terms);
        aVar.f125154i = this.mavatar_key;
        aVar.f125155j = this.mavatar;
        aVar.f125156k = this.mexact_title;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mimage_url != null) {
            sb.append(", image_url=");
            sb.append(this.mimage_url);
        }
        if (this.mimage_key != null) {
            sb.append(", image_key=");
            sb.append(this.mimage_key);
        }
        if (this.mtitle != null) {
            sb.append(", title=");
            sb.append(this.mtitle);
        }
        if (this.msubtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.msubtitle);
        }
        if (!this.mtitle_hit_terms.isEmpty()) {
            sb.append(", title_hit_terms=");
            sb.append(this.mtitle_hit_terms);
        }
        if (!this.msubtitle_hit_terms.isEmpty()) {
            sb.append(", subtitle_hit_terms=");
            sb.append(this.msubtitle_hit_terms);
        }
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        if (this.mexact_title != null) {
            sb.append(", exact_title=");
            sb.append(this.mexact_title);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchResult{");
        replace.append('}');
        return replace.toString();
    }

    public SearchResult(String str, Type type, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, String str6, Image image, String str7) {
        this(str, type, str2, str3, str4, str5, list, list2, str6, image, str7, ByteString.EMPTY);
    }

    public SearchResult(String str, Type type, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, String str6, Image image, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtype = type;
        this.mimage_url = str2;
        this.mimage_key = str3;
        this.mtitle = str4;
        this.msubtitle = str5;
        this.mtitle_hit_terms = Internal.immutableCopyOf("mtitle_hit_terms", list);
        this.msubtitle_hit_terms = Internal.immutableCopyOf("msubtitle_hit_terms", list2);
        this.mavatar_key = str6;
        this.mavatar = image;
        this.mexact_title = str7;
    }
}
