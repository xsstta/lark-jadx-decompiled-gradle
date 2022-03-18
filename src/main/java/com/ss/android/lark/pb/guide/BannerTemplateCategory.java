package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BannerTemplateCategory extends Message<BannerTemplateCategory, C49778a> {
    public static final ProtoAdapter<BannerTemplateCategory> ADAPTER = new C49779b();
    public static final Integer DEFAULT_TEMPLATE_NUM = 0;
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final String mcategory_name;
    public final String mcta_background_color;
    public final String mcta_title;
    public final String mcta_title_color;
    public final List<String> mdym_pics;
    public final String mframe_color;
    public final String mfront_pic;
    public final String mlink;
    public final Integer mtemplate_num;

    /* renamed from: com.ss.android.lark.pb.guide.BannerTemplateCategory$b */
    private static final class C49779b extends ProtoAdapter<BannerTemplateCategory> {
        C49779b() {
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
            int i9 = 0;
            if (bannerTemplateCategory.mbackground_color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerTemplateCategory.mbackground_color);
            } else {
                i = 0;
            }
            if (bannerTemplateCategory.mfront_pic != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, bannerTemplateCategory.mfront_pic);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (bannerTemplateCategory.mcategory_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, bannerTemplateCategory.mcategory_name);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (bannerTemplateCategory.mlink != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, bannerTemplateCategory.mlink);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (bannerTemplateCategory.mtemplate_num != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, bannerTemplateCategory.mtemplate_num);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i12 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, bannerTemplateCategory.mdym_pics);
            if (bannerTemplateCategory.mcta_title != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, bannerTemplateCategory.mcta_title);
            } else {
                i6 = 0;
            }
            int i13 = encodedSizeWithTag + i6;
            if (bannerTemplateCategory.mcta_title_color != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, bannerTemplateCategory.mcta_title_color);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (bannerTemplateCategory.mframe_color != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, bannerTemplateCategory.mframe_color);
            } else {
                i8 = 0;
            }
            int i15 = i14 + i8;
            if (bannerTemplateCategory.mcta_background_color != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, bannerTemplateCategory.mcta_background_color);
            }
            return i15 + i9 + bannerTemplateCategory.unknownFields().size();
        }

        /* renamed from: a */
        public BannerTemplateCategory decode(ProtoReader protoReader) throws IOException {
            C49778a aVar = new C49778a();
            aVar.f124686a = "";
            aVar.f124687b = "";
            aVar.f124688c = "";
            aVar.f124689d = "";
            aVar.f124690e = 0;
            aVar.f124692g = "";
            aVar.f124693h = "";
            aVar.f124694i = "";
            aVar.f124695j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124686a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124687b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124688c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124689d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124690e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124691f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124692g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124693h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124694i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124695j = ProtoAdapter.STRING.decode(protoReader);
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
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bannerTemplateCategory.mfront_pic);
            }
            if (bannerTemplateCategory.mcategory_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bannerTemplateCategory.mcategory_name);
            }
            if (bannerTemplateCategory.mlink != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, bannerTemplateCategory.mlink);
            }
            if (bannerTemplateCategory.mtemplate_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, bannerTemplateCategory.mtemplate_num);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, bannerTemplateCategory.mdym_pics);
            if (bannerTemplateCategory.mcta_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, bannerTemplateCategory.mcta_title);
            }
            if (bannerTemplateCategory.mcta_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, bannerTemplateCategory.mcta_title_color);
            }
            if (bannerTemplateCategory.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, bannerTemplateCategory.mframe_color);
            }
            if (bannerTemplateCategory.mcta_background_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, bannerTemplateCategory.mcta_background_color);
            }
            protoWriter.writeBytes(bannerTemplateCategory.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerTemplateCategory$a */
    public static final class C49778a extends Message.Builder<BannerTemplateCategory, C49778a> {

        /* renamed from: a */
        public String f124686a;

        /* renamed from: b */
        public String f124687b;

        /* renamed from: c */
        public String f124688c;

        /* renamed from: d */
        public String f124689d;

        /* renamed from: e */
        public Integer f124690e;

        /* renamed from: f */
        public List<String> f124691f = Internal.newMutableList();

        /* renamed from: g */
        public String f124692g;

        /* renamed from: h */
        public String f124693h;

        /* renamed from: i */
        public String f124694i;

        /* renamed from: j */
        public String f124695j;

        /* renamed from: a */
        public BannerTemplateCategory build() {
            return new BannerTemplateCategory(this.f124686a, this.f124687b, this.f124688c, this.f124689d, this.f124690e, this.f124691f, this.f124692g, this.f124693h, this.f124694i, this.f124695j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49778a newBuilder() {
        C49778a aVar = new C49778a();
        aVar.f124686a = this.mbackground_color;
        aVar.f124687b = this.mfront_pic;
        aVar.f124688c = this.mcategory_name;
        aVar.f124689d = this.mlink;
        aVar.f124690e = this.mtemplate_num;
        aVar.f124691f = Internal.copyOf("mdym_pics", this.mdym_pics);
        aVar.f124692g = this.mcta_title;
        aVar.f124693h = this.mcta_title_color;
        aVar.f124694i = this.mframe_color;
        aVar.f124695j = this.mcta_background_color;
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
        if (this.mcta_background_color != null) {
            sb.append(", cta_background_color=");
            sb.append(this.mcta_background_color);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerTemplateCategory{");
        replace.append('}');
        return replace.toString();
    }

    public BannerTemplateCategory(String str, String str2, String str3, String str4, Integer num, List<String> list, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, num, list, str5, str6, str7, str8, ByteString.EMPTY);
    }

    public BannerTemplateCategory(String str, String str2, String str3, String str4, Integer num, List<String> list, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mfront_pic = str2;
        this.mcategory_name = str3;
        this.mlink = str4;
        this.mtemplate_num = num;
        this.mdym_pics = Internal.immutableCopyOf("mdym_pics", list);
        this.mcta_title = str5;
        this.mcta_title_color = str6;
        this.mframe_color = str7;
        this.mcta_background_color = str8;
    }
}
