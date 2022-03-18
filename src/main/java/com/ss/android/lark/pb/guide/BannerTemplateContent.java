package com.ss.android.lark.pb.guide;

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

public final class BannerTemplateContent extends Message<BannerTemplateContent, C49780a> {
    public static final ProtoAdapter<BannerTemplateContent> ADAPTER = new C49781b();
    public static final Boolean DEFAULT_BANNER_CLOSEABLE = false;
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final String mbackground_pic;
    public final Boolean mbanner_closeable;
    public final String mbanner_closeable_color;
    public final String mbanner_icon;
    public final String mframe_color;
    public final Layout mlayout;
    public final String msub_title;
    public final String msub_title_color;
    public final List<BannerTemplateCategory> mtemplate_categories;
    public final BannerTemplateMore mtemplate_more;
    public final String mtitle;
    public final String mtitle_color;

    public enum Layout implements WireEnum {
        UNKNOWN(0),
        STYLE1(1),
        STYLE2(2),
        STYLE3(3),
        STYLE4(4);
        
        public static final ProtoAdapter<Layout> ADAPTER = ProtoAdapter.newEnumAdapter(Layout.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Layout fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return STYLE1;
            }
            if (i == 2) {
                return STYLE2;
            }
            if (i == 3) {
                return STYLE3;
            }
            if (i != 4) {
                return null;
            }
            return STYLE4;
        }

        private Layout(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerTemplateContent$b */
    private static final class C49781b extends ProtoAdapter<BannerTemplateContent> {
        C49781b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerTemplateContent.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerTemplateContent bannerTemplateContent) {
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
            int i12 = 0;
            if (bannerTemplateContent.mbackground_color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerTemplateContent.mbackground_color);
            } else {
                i = 0;
            }
            if (bannerTemplateContent.mbanner_icon != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, bannerTemplateContent.mbanner_icon);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (bannerTemplateContent.mbackground_pic != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, bannerTemplateContent.mbackground_pic);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (bannerTemplateContent.mtitle != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, bannerTemplateContent.mtitle);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (bannerTemplateContent.mtitle_color != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, bannerTemplateContent.mtitle_color);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (bannerTemplateContent.mbanner_closeable != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, bannerTemplateContent.mbanner_closeable);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (bannerTemplateContent.mbanner_closeable_color != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, bannerTemplateContent.mbanner_closeable_color);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (bannerTemplateContent.mlayout != null) {
                i8 = Layout.ADAPTER.encodedSizeWithTag(8, bannerTemplateContent.mlayout);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag = i18 + i8 + BannerTemplateCategory.ADAPTER.asRepeated().encodedSizeWithTag(9, bannerTemplateContent.mtemplate_categories);
            if (bannerTemplateContent.mtemplate_more != null) {
                i9 = BannerTemplateMore.ADAPTER.encodedSizeWithTag(10, bannerTemplateContent.mtemplate_more);
            } else {
                i9 = 0;
            }
            int i19 = encodedSizeWithTag + i9;
            if (bannerTemplateContent.mframe_color != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, bannerTemplateContent.mframe_color);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (bannerTemplateContent.msub_title != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, bannerTemplateContent.msub_title);
            } else {
                i11 = 0;
            }
            int i21 = i20 + i11;
            if (bannerTemplateContent.msub_title_color != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, bannerTemplateContent.msub_title_color);
            }
            return i21 + i12 + bannerTemplateContent.unknownFields().size();
        }

        /* renamed from: a */
        public BannerTemplateContent decode(ProtoReader protoReader) throws IOException {
            C49780a aVar = new C49780a();
            aVar.f124696a = "";
            aVar.f124697b = "";
            aVar.f124698c = "";
            aVar.f124699d = "";
            aVar.f124700e = "";
            aVar.f124701f = false;
            aVar.f124702g = "";
            aVar.f124706k = "";
            aVar.f124707l = "";
            aVar.f124708m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124696a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124697b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124698c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124699d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124700e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124701f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124702g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f124703h = Layout.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            aVar.f124704i.add(BannerTemplateCategory.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f124705j = BannerTemplateMore.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124706k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124707l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124708m = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, BannerTemplateContent bannerTemplateContent) throws IOException {
            if (bannerTemplateContent.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerTemplateContent.mbackground_color);
            }
            if (bannerTemplateContent.mbanner_icon != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bannerTemplateContent.mbanner_icon);
            }
            if (bannerTemplateContent.mbackground_pic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bannerTemplateContent.mbackground_pic);
            }
            if (bannerTemplateContent.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, bannerTemplateContent.mtitle);
            }
            if (bannerTemplateContent.mtitle_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, bannerTemplateContent.mtitle_color);
            }
            if (bannerTemplateContent.mbanner_closeable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, bannerTemplateContent.mbanner_closeable);
            }
            if (bannerTemplateContent.mbanner_closeable_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, bannerTemplateContent.mbanner_closeable_color);
            }
            if (bannerTemplateContent.mlayout != null) {
                Layout.ADAPTER.encodeWithTag(protoWriter, 8, bannerTemplateContent.mlayout);
            }
            BannerTemplateCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, bannerTemplateContent.mtemplate_categories);
            if (bannerTemplateContent.mtemplate_more != null) {
                BannerTemplateMore.ADAPTER.encodeWithTag(protoWriter, 10, bannerTemplateContent.mtemplate_more);
            }
            if (bannerTemplateContent.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, bannerTemplateContent.mframe_color);
            }
            if (bannerTemplateContent.msub_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, bannerTemplateContent.msub_title);
            }
            if (bannerTemplateContent.msub_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, bannerTemplateContent.msub_title_color);
            }
            protoWriter.writeBytes(bannerTemplateContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerTemplateContent$a */
    public static final class C49780a extends Message.Builder<BannerTemplateContent, C49780a> {

        /* renamed from: a */
        public String f124696a;

        /* renamed from: b */
        public String f124697b;

        /* renamed from: c */
        public String f124698c;

        /* renamed from: d */
        public String f124699d;

        /* renamed from: e */
        public String f124700e;

        /* renamed from: f */
        public Boolean f124701f;

        /* renamed from: g */
        public String f124702g;

        /* renamed from: h */
        public Layout f124703h;

        /* renamed from: i */
        public List<BannerTemplateCategory> f124704i = Internal.newMutableList();

        /* renamed from: j */
        public BannerTemplateMore f124705j;

        /* renamed from: k */
        public String f124706k;

        /* renamed from: l */
        public String f124707l;

        /* renamed from: m */
        public String f124708m;

        /* renamed from: a */
        public BannerTemplateContent build() {
            return new BannerTemplateContent(this.f124696a, this.f124697b, this.f124698c, this.f124699d, this.f124700e, this.f124701f, this.f124702g, this.f124703h, this.f124704i, this.f124705j, this.f124706k, this.f124707l, this.f124708m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49780a newBuilder() {
        C49780a aVar = new C49780a();
        aVar.f124696a = this.mbackground_color;
        aVar.f124697b = this.mbanner_icon;
        aVar.f124698c = this.mbackground_pic;
        aVar.f124699d = this.mtitle;
        aVar.f124700e = this.mtitle_color;
        aVar.f124701f = this.mbanner_closeable;
        aVar.f124702g = this.mbanner_closeable_color;
        aVar.f124703h = this.mlayout;
        aVar.f124704i = Internal.copyOf("mtemplate_categories", this.mtemplate_categories);
        aVar.f124705j = this.mtemplate_more;
        aVar.f124706k = this.mframe_color;
        aVar.f124707l = this.msub_title;
        aVar.f124708m = this.msub_title_color;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mbackground_color != null) {
            sb.append(", background_color=");
            sb.append(this.mbackground_color);
        }
        if (this.mbanner_icon != null) {
            sb.append(", banner_icon=");
            sb.append(this.mbanner_icon);
        }
        if (this.mbackground_pic != null) {
            sb.append(", background_pic=");
            sb.append(this.mbackground_pic);
        }
        if (this.mtitle != null) {
            sb.append(", title=");
            sb.append(this.mtitle);
        }
        if (this.mtitle_color != null) {
            sb.append(", title_color=");
            sb.append(this.mtitle_color);
        }
        if (this.mbanner_closeable != null) {
            sb.append(", banner_closeable=");
            sb.append(this.mbanner_closeable);
        }
        if (this.mbanner_closeable_color != null) {
            sb.append(", banner_closeable_color=");
            sb.append(this.mbanner_closeable_color);
        }
        if (this.mlayout != null) {
            sb.append(", layout=");
            sb.append(this.mlayout);
        }
        if (!this.mtemplate_categories.isEmpty()) {
            sb.append(", template_categories=");
            sb.append(this.mtemplate_categories);
        }
        if (this.mtemplate_more != null) {
            sb.append(", template_more=");
            sb.append(this.mtemplate_more);
        }
        if (this.mframe_color != null) {
            sb.append(", frame_color=");
            sb.append(this.mframe_color);
        }
        if (this.msub_title != null) {
            sb.append(", sub_title=");
            sb.append(this.msub_title);
        }
        if (this.msub_title_color != null) {
            sb.append(", sub_title_color=");
            sb.append(this.msub_title_color);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerTemplateContent{");
        replace.append('}');
        return replace.toString();
    }

    public BannerTemplateContent(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Layout layout, List<BannerTemplateCategory> list, BannerTemplateMore bannerTemplateMore, String str7, String str8, String str9) {
        this(str, str2, str3, str4, str5, bool, str6, layout, list, bannerTemplateMore, str7, str8, str9, ByteString.EMPTY);
    }

    public BannerTemplateContent(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Layout layout, List<BannerTemplateCategory> list, BannerTemplateMore bannerTemplateMore, String str7, String str8, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mbanner_icon = str2;
        this.mbackground_pic = str3;
        this.mtitle = str4;
        this.mtitle_color = str5;
        this.mbanner_closeable = bool;
        this.mbanner_closeable_color = str6;
        this.mlayout = layout;
        this.mtemplate_categories = Internal.immutableCopyOf("mtemplate_categories", list);
        this.mtemplate_more = bannerTemplateMore;
        this.mframe_color = str7;
        this.msub_title = str8;
        this.msub_title_color = str9;
    }
}
