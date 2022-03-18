package com.ss.android.lark.pb.ug_reach;

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

public final class TemplateBannerMaterial extends Message<TemplateBannerMaterial, C50144a> {
    public static final ProtoAdapter<TemplateBannerMaterial> ADAPTER = new C50145b();
    public static final Boolean DEFAULT_BANNER_CLOSEABLE = false;
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final ImageElement mbackground_pic;
    public final Boolean mbanner_closeable;
    public final String mbanner_closeable_color;
    public final ImageElement mbanner_icon;
    public final String mframe_color;
    public final Layout mlayout;
    public final TextElement msub_title;
    public final String msub_title_color;
    public final List<BannerTemplateCategory> mtemplate_categories;
    public final BannerTemplateMore mtemplate_more;
    public final TextElement mtitle;
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

    /* renamed from: com.ss.android.lark.pb.ug_reach.TemplateBannerMaterial$b */
    private static final class C50145b extends ProtoAdapter<TemplateBannerMaterial> {
        C50145b() {
            super(FieldEncoding.LENGTH_DELIMITED, TemplateBannerMaterial.class);
        }

        /* renamed from: a */
        public int encodedSize(TemplateBannerMaterial templateBannerMaterial) {
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
            if (templateBannerMaterial.mbackground_color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, templateBannerMaterial.mbackground_color);
            } else {
                i = 0;
            }
            if (templateBannerMaterial.mbanner_icon != null) {
                i2 = ImageElement.ADAPTER.encodedSizeWithTag(2, templateBannerMaterial.mbanner_icon);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (templateBannerMaterial.mbackground_pic != null) {
                i3 = ImageElement.ADAPTER.encodedSizeWithTag(3, templateBannerMaterial.mbackground_pic);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (templateBannerMaterial.mtitle != null) {
                i4 = TextElement.ADAPTER.encodedSizeWithTag(4, templateBannerMaterial.mtitle);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (templateBannerMaterial.mtitle_color != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, templateBannerMaterial.mtitle_color);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (templateBannerMaterial.mbanner_closeable != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, templateBannerMaterial.mbanner_closeable);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (templateBannerMaterial.mbanner_closeable_color != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, templateBannerMaterial.mbanner_closeable_color);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (templateBannerMaterial.mlayout != null) {
                i8 = Layout.ADAPTER.encodedSizeWithTag(8, templateBannerMaterial.mlayout);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag = i18 + i8 + BannerTemplateCategory.ADAPTER.asRepeated().encodedSizeWithTag(9, templateBannerMaterial.mtemplate_categories);
            if (templateBannerMaterial.mtemplate_more != null) {
                i9 = BannerTemplateMore.ADAPTER.encodedSizeWithTag(10, templateBannerMaterial.mtemplate_more);
            } else {
                i9 = 0;
            }
            int i19 = encodedSizeWithTag + i9;
            if (templateBannerMaterial.mframe_color != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, templateBannerMaterial.mframe_color);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (templateBannerMaterial.msub_title != null) {
                i11 = TextElement.ADAPTER.encodedSizeWithTag(12, templateBannerMaterial.msub_title);
            } else {
                i11 = 0;
            }
            int i21 = i20 + i11;
            if (templateBannerMaterial.msub_title_color != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, templateBannerMaterial.msub_title_color);
            }
            return i21 + i12 + templateBannerMaterial.unknownFields().size();
        }

        /* renamed from: a */
        public TemplateBannerMaterial decode(ProtoReader protoReader) throws IOException {
            C50144a aVar = new C50144a();
            aVar.f125322a = "";
            aVar.f125326e = "";
            aVar.f125327f = false;
            aVar.f125328g = "";
            aVar.f125332k = "";
            aVar.f125334m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125322a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125323b = ImageElement.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125324c = ImageElement.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125325d = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125326e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125327f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125328g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f125329h = Layout.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            aVar.f125330i.add(BannerTemplateCategory.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f125331j = BannerTemplateMore.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125332k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125333l = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125334m = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, TemplateBannerMaterial templateBannerMaterial) throws IOException {
            if (templateBannerMaterial.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, templateBannerMaterial.mbackground_color);
            }
            if (templateBannerMaterial.mbanner_icon != null) {
                ImageElement.ADAPTER.encodeWithTag(protoWriter, 2, templateBannerMaterial.mbanner_icon);
            }
            if (templateBannerMaterial.mbackground_pic != null) {
                ImageElement.ADAPTER.encodeWithTag(protoWriter, 3, templateBannerMaterial.mbackground_pic);
            }
            if (templateBannerMaterial.mtitle != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 4, templateBannerMaterial.mtitle);
            }
            if (templateBannerMaterial.mtitle_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, templateBannerMaterial.mtitle_color);
            }
            if (templateBannerMaterial.mbanner_closeable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, templateBannerMaterial.mbanner_closeable);
            }
            if (templateBannerMaterial.mbanner_closeable_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, templateBannerMaterial.mbanner_closeable_color);
            }
            if (templateBannerMaterial.mlayout != null) {
                Layout.ADAPTER.encodeWithTag(protoWriter, 8, templateBannerMaterial.mlayout);
            }
            BannerTemplateCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, templateBannerMaterial.mtemplate_categories);
            if (templateBannerMaterial.mtemplate_more != null) {
                BannerTemplateMore.ADAPTER.encodeWithTag(protoWriter, 10, templateBannerMaterial.mtemplate_more);
            }
            if (templateBannerMaterial.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, templateBannerMaterial.mframe_color);
            }
            if (templateBannerMaterial.msub_title != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 12, templateBannerMaterial.msub_title);
            }
            if (templateBannerMaterial.msub_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, templateBannerMaterial.msub_title_color);
            }
            protoWriter.writeBytes(templateBannerMaterial.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.TemplateBannerMaterial$a */
    public static final class C50144a extends Message.Builder<TemplateBannerMaterial, C50144a> {

        /* renamed from: a */
        public String f125322a;

        /* renamed from: b */
        public ImageElement f125323b;

        /* renamed from: c */
        public ImageElement f125324c;

        /* renamed from: d */
        public TextElement f125325d;

        /* renamed from: e */
        public String f125326e;

        /* renamed from: f */
        public Boolean f125327f;

        /* renamed from: g */
        public String f125328g;

        /* renamed from: h */
        public Layout f125329h;

        /* renamed from: i */
        public List<BannerTemplateCategory> f125330i = Internal.newMutableList();

        /* renamed from: j */
        public BannerTemplateMore f125331j;

        /* renamed from: k */
        public String f125332k;

        /* renamed from: l */
        public TextElement f125333l;

        /* renamed from: m */
        public String f125334m;

        /* renamed from: a */
        public TemplateBannerMaterial build() {
            return new TemplateBannerMaterial(this.f125322a, this.f125323b, this.f125324c, this.f125325d, this.f125326e, this.f125327f, this.f125328g, this.f125329h, this.f125330i, this.f125331j, this.f125332k, this.f125333l, this.f125334m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50144a newBuilder() {
        C50144a aVar = new C50144a();
        aVar.f125322a = this.mbackground_color;
        aVar.f125323b = this.mbanner_icon;
        aVar.f125324c = this.mbackground_pic;
        aVar.f125325d = this.mtitle;
        aVar.f125326e = this.mtitle_color;
        aVar.f125327f = this.mbanner_closeable;
        aVar.f125328g = this.mbanner_closeable_color;
        aVar.f125329h = this.mlayout;
        aVar.f125330i = Internal.copyOf("mtemplate_categories", this.mtemplate_categories);
        aVar.f125331j = this.mtemplate_more;
        aVar.f125332k = this.mframe_color;
        aVar.f125333l = this.msub_title;
        aVar.f125334m = this.msub_title_color;
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
        StringBuilder replace = sb.replace(0, 2, "TemplateBannerMaterial{");
        replace.append('}');
        return replace.toString();
    }

    public TemplateBannerMaterial(String str, ImageElement imageElement, ImageElement imageElement2, TextElement textElement, String str2, Boolean bool, String str3, Layout layout, List<BannerTemplateCategory> list, BannerTemplateMore bannerTemplateMore, String str4, TextElement textElement2, String str5) {
        this(str, imageElement, imageElement2, textElement, str2, bool, str3, layout, list, bannerTemplateMore, str4, textElement2, str5, ByteString.EMPTY);
    }

    public TemplateBannerMaterial(String str, ImageElement imageElement, ImageElement imageElement2, TextElement textElement, String str2, Boolean bool, String str3, Layout layout, List<BannerTemplateCategory> list, BannerTemplateMore bannerTemplateMore, String str4, TextElement textElement2, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mbanner_icon = imageElement;
        this.mbackground_pic = imageElement2;
        this.mtitle = textElement;
        this.mtitle_color = str2;
        this.mbanner_closeable = bool;
        this.mbanner_closeable_color = str3;
        this.mlayout = layout;
        this.mtemplate_categories = Internal.immutableCopyOf("mtemplate_categories", list);
        this.mtemplate_more = bannerTemplateMore;
        this.mframe_color = str4;
        this.msub_title = textElement2;
        this.msub_title_color = str5;
    }
}
