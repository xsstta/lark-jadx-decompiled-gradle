package com.ss.android.lark.pb.ug_reach;

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

public final class BannerTemplateCategory extends Message<BannerTemplateCategory, C50112a> {
    public static final ProtoAdapter<BannerTemplateCategory> ADAPTER = new C50113b();
    public static final Integer DEFAULT_TEMPLATE_NUM = 0;
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final TextElement mcategory_name;
    public final String mcta_background_color;
    public final String mcta_frame_color;
    public final String mcta_shadow_color;
    public final TextElement mcta_title;
    public final String mcta_title_color;
    public final List<ImageElement> mdym_pics;
    public final String mframe_color;
    public final ImageElement mfront_pic;
    public final TextElement mlink;
    public final Integer mtemplate_num;

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerTemplateCategory$b */
    private static final class C50113b extends ProtoAdapter<BannerTemplateCategory> {
        C50113b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerTemplateCategory.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerTemplateCategory bannerTemplateCategory) {
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
            int i11 = 0;
            if (bannerTemplateCategory.mbackground_color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerTemplateCategory.mbackground_color);
            } else {
                i = 0;
            }
            if (bannerTemplateCategory.mfront_pic != null) {
                i2 = ImageElement.ADAPTER.encodedSizeWithTag(2, bannerTemplateCategory.mfront_pic);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (bannerTemplateCategory.mcategory_name != null) {
                i3 = TextElement.ADAPTER.encodedSizeWithTag(3, bannerTemplateCategory.mcategory_name);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (bannerTemplateCategory.mlink != null) {
                i4 = TextElement.ADAPTER.encodedSizeWithTag(4, bannerTemplateCategory.mlink);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (bannerTemplateCategory.mtemplate_num != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, bannerTemplateCategory.mtemplate_num);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i14 + i5 + ImageElement.ADAPTER.asRepeated().encodedSizeWithTag(6, bannerTemplateCategory.mdym_pics);
            if (bannerTemplateCategory.mcta_title != null) {
                i6 = TextElement.ADAPTER.encodedSizeWithTag(7, bannerTemplateCategory.mcta_title);
            } else {
                i6 = 0;
            }
            int i15 = encodedSizeWithTag + i6;
            if (bannerTemplateCategory.mcta_title_color != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, bannerTemplateCategory.mcta_title_color);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (bannerTemplateCategory.mframe_color != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, bannerTemplateCategory.mframe_color);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (bannerTemplateCategory.mcta_frame_color != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, bannerTemplateCategory.mcta_frame_color);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (bannerTemplateCategory.mcta_background_color != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, bannerTemplateCategory.mcta_background_color);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (bannerTemplateCategory.mcta_shadow_color != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, bannerTemplateCategory.mcta_shadow_color);
            }
            return i19 + i11 + bannerTemplateCategory.unknownFields().size();
        }

        /* renamed from: a */
        public BannerTemplateCategory decode(ProtoReader protoReader) throws IOException {
            C50112a aVar = new C50112a();
            aVar.f125249a = "";
            aVar.f125253e = 0;
            aVar.f125256h = "";
            aVar.f125257i = "";
            aVar.f125258j = "";
            aVar.f125259k = "";
            aVar.f125260l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125249a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125250b = ImageElement.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125251c = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125252d = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125253e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125254f.add(ImageElement.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f125255g = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125256h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125257i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125258j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125259k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125260l = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, BannerTemplateCategory bannerTemplateCategory) throws IOException {
            if (bannerTemplateCategory.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerTemplateCategory.mbackground_color);
            }
            if (bannerTemplateCategory.mfront_pic != null) {
                ImageElement.ADAPTER.encodeWithTag(protoWriter, 2, bannerTemplateCategory.mfront_pic);
            }
            if (bannerTemplateCategory.mcategory_name != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 3, bannerTemplateCategory.mcategory_name);
            }
            if (bannerTemplateCategory.mlink != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 4, bannerTemplateCategory.mlink);
            }
            if (bannerTemplateCategory.mtemplate_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, bannerTemplateCategory.mtemplate_num);
            }
            ImageElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, bannerTemplateCategory.mdym_pics);
            if (bannerTemplateCategory.mcta_title != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 7, bannerTemplateCategory.mcta_title);
            }
            if (bannerTemplateCategory.mcta_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, bannerTemplateCategory.mcta_title_color);
            }
            if (bannerTemplateCategory.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, bannerTemplateCategory.mframe_color);
            }
            if (bannerTemplateCategory.mcta_frame_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, bannerTemplateCategory.mcta_frame_color);
            }
            if (bannerTemplateCategory.mcta_background_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, bannerTemplateCategory.mcta_background_color);
            }
            if (bannerTemplateCategory.mcta_shadow_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, bannerTemplateCategory.mcta_shadow_color);
            }
            protoWriter.writeBytes(bannerTemplateCategory.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerTemplateCategory$a */
    public static final class C50112a extends Message.Builder<BannerTemplateCategory, C50112a> {

        /* renamed from: a */
        public String f125249a;

        /* renamed from: b */
        public ImageElement f125250b;

        /* renamed from: c */
        public TextElement f125251c;

        /* renamed from: d */
        public TextElement f125252d;

        /* renamed from: e */
        public Integer f125253e;

        /* renamed from: f */
        public List<ImageElement> f125254f = Internal.newMutableList();

        /* renamed from: g */
        public TextElement f125255g;

        /* renamed from: h */
        public String f125256h;

        /* renamed from: i */
        public String f125257i;

        /* renamed from: j */
        public String f125258j;

        /* renamed from: k */
        public String f125259k;

        /* renamed from: l */
        public String f125260l;

        /* renamed from: a */
        public BannerTemplateCategory build() {
            return new BannerTemplateCategory(this.f125249a, this.f125250b, this.f125251c, this.f125252d, this.f125253e, this.f125254f, this.f125255g, this.f125256h, this.f125257i, this.f125258j, this.f125259k, this.f125260l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50112a newBuilder() {
        C50112a aVar = new C50112a();
        aVar.f125249a = this.mbackground_color;
        aVar.f125250b = this.mfront_pic;
        aVar.f125251c = this.mcategory_name;
        aVar.f125252d = this.mlink;
        aVar.f125253e = this.mtemplate_num;
        aVar.f125254f = Internal.copyOf("mdym_pics", this.mdym_pics);
        aVar.f125255g = this.mcta_title;
        aVar.f125256h = this.mcta_title_color;
        aVar.f125257i = this.mframe_color;
        aVar.f125258j = this.mcta_frame_color;
        aVar.f125259k = this.mcta_background_color;
        aVar.f125260l = this.mcta_shadow_color;
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
        if (this.mfront_pic != null) {
            sb.append(", front_pic=");
            sb.append(this.mfront_pic);
        }
        if (this.mcategory_name != null) {
            sb.append(", category_name=");
            sb.append(this.mcategory_name);
        }
        if (this.mlink != null) {
            sb.append(", link=");
            sb.append(this.mlink);
        }
        if (this.mtemplate_num != null) {
            sb.append(", template_num=");
            sb.append(this.mtemplate_num);
        }
        if (!this.mdym_pics.isEmpty()) {
            sb.append(", dym_pics=");
            sb.append(this.mdym_pics);
        }
        if (this.mcta_title != null) {
            sb.append(", cta_title=");
            sb.append(this.mcta_title);
        }
        if (this.mcta_title_color != null) {
            sb.append(", cta_title_color=");
            sb.append(this.mcta_title_color);
        }
        if (this.mframe_color != null) {
            sb.append(", frame_color=");
            sb.append(this.mframe_color);
        }
        if (this.mcta_frame_color != null) {
            sb.append(", cta_frame_color=");
            sb.append(this.mcta_frame_color);
        }
        if (this.mcta_background_color != null) {
            sb.append(", cta_background_color=");
            sb.append(this.mcta_background_color);
        }
        if (this.mcta_shadow_color != null) {
            sb.append(", cta_shadow_color=");
            sb.append(this.mcta_shadow_color);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerTemplateCategory{");
        replace.append('}');
        return replace.toString();
    }

    public BannerTemplateCategory(String str, ImageElement imageElement, TextElement textElement, TextElement textElement2, Integer num, List<ImageElement> list, TextElement textElement3, String str2, String str3, String str4, String str5, String str6) {
        this(str, imageElement, textElement, textElement2, num, list, textElement3, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public BannerTemplateCategory(String str, ImageElement imageElement, TextElement textElement, TextElement textElement2, Integer num, List<ImageElement> list, TextElement textElement3, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mfront_pic = imageElement;
        this.mcategory_name = textElement;
        this.mlink = textElement2;
        this.mtemplate_num = num;
        this.mdym_pics = Internal.immutableCopyOf("mdym_pics", list);
        this.mcta_title = textElement3;
        this.mcta_title_color = str2;
        this.mframe_color = str3;
        this.mcta_frame_color = str4;
        this.mcta_background_color = str5;
        this.mcta_shadow_color = str6;
    }
}
