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

public final class NormalBannerMaterial extends Message<NormalBannerMaterial, C50128a> {
    public static final ProtoAdapter<NormalBannerMaterial> ADAPTER = new C50129b();
    public static final Boolean DEFAULT_BANNER_CLOSEABLE = false;
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final ImageElement mbackground_pic;
    public final Boolean mbanner_closeable;
    public final String mbanner_closeable_color;
    public final ImageElement mbanner_icon;
    public final TextElement mbutton_link;
    public final List<ButtonElement> mbuttons;
    public final String mcta_background_color;
    public final TextElement mcta_title;
    public final String mcta_title_color;
    public final String mframe_color;
    public final Layout mlayout;
    public final TextElement msub_title;
    public final String msub_title_color;
    public final TextElement mtitle;
    public final String mtitle_color;

    public enum Layout implements WireEnum {
        UNKNOWN(0),
        STYLE1(1),
        STYLE2(2);
        
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
            if (i != 2) {
                return null;
            }
            return STYLE2;
        }

        private Layout(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.NormalBannerMaterial$b */
    private static final class C50129b extends ProtoAdapter<NormalBannerMaterial> {
        C50129b() {
            super(FieldEncoding.LENGTH_DELIMITED, NormalBannerMaterial.class);
        }

        /* renamed from: a */
        public int encodedSize(NormalBannerMaterial normalBannerMaterial) {
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
            int i15 = 0;
            if (normalBannerMaterial.mbackground_color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, normalBannerMaterial.mbackground_color);
            } else {
                i = 0;
            }
            if (normalBannerMaterial.mbanner_icon != null) {
                i2 = ImageElement.ADAPTER.encodedSizeWithTag(2, normalBannerMaterial.mbanner_icon);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (normalBannerMaterial.mbackground_pic != null) {
                i3 = ImageElement.ADAPTER.encodedSizeWithTag(3, normalBannerMaterial.mbackground_pic);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (normalBannerMaterial.mtitle != null) {
                i4 = TextElement.ADAPTER.encodedSizeWithTag(4, normalBannerMaterial.mtitle);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (normalBannerMaterial.mtitle_color != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, normalBannerMaterial.mtitle_color);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (normalBannerMaterial.msub_title != null) {
                i6 = TextElement.ADAPTER.encodedSizeWithTag(6, normalBannerMaterial.msub_title);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (normalBannerMaterial.msub_title_color != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, normalBannerMaterial.msub_title_color);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (normalBannerMaterial.mcta_title != null) {
                i8 = TextElement.ADAPTER.encodedSizeWithTag(8, normalBannerMaterial.mcta_title);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (normalBannerMaterial.mcta_title_color != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, normalBannerMaterial.mcta_title_color);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (normalBannerMaterial.mcta_background_color != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, normalBannerMaterial.mcta_background_color);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (normalBannerMaterial.mbanner_closeable != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, normalBannerMaterial.mbanner_closeable);
            } else {
                i11 = 0;
            }
            int i25 = i24 + i11;
            if (normalBannerMaterial.mbanner_closeable_color != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, normalBannerMaterial.mbanner_closeable_color);
            } else {
                i12 = 0;
            }
            int i26 = i25 + i12;
            if (normalBannerMaterial.mbutton_link != null) {
                i13 = TextElement.ADAPTER.encodedSizeWithTag(13, normalBannerMaterial.mbutton_link);
            } else {
                i13 = 0;
            }
            int i27 = i26 + i13;
            if (normalBannerMaterial.mlayout != null) {
                i14 = Layout.ADAPTER.encodedSizeWithTag(14, normalBannerMaterial.mlayout);
            } else {
                i14 = 0;
            }
            int i28 = i27 + i14;
            if (normalBannerMaterial.mframe_color != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(15, normalBannerMaterial.mframe_color);
            }
            return i28 + i15 + ButtonElement.ADAPTER.asRepeated().encodedSizeWithTag(16, normalBannerMaterial.mbuttons) + normalBannerMaterial.unknownFields().size();
        }

        /* renamed from: a */
        public NormalBannerMaterial decode(ProtoReader protoReader) throws IOException {
            C50128a aVar = new C50128a();
            aVar.f125285a = "";
            aVar.f125289e = "";
            aVar.f125291g = "";
            aVar.f125293i = "";
            aVar.f125294j = "";
            aVar.f125295k = false;
            aVar.f125296l = "";
            aVar.f125299o = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125285a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125286b = ImageElement.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125287c = ImageElement.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125288d = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125289e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125290f = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125291g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125292h = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125293i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125294j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125295k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125296l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125297m = TextElement.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f125298n = Layout.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 15:
                            aVar.f125299o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f125300p.add(ButtonElement.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, NormalBannerMaterial normalBannerMaterial) throws IOException {
            if (normalBannerMaterial.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, normalBannerMaterial.mbackground_color);
            }
            if (normalBannerMaterial.mbanner_icon != null) {
                ImageElement.ADAPTER.encodeWithTag(protoWriter, 2, normalBannerMaterial.mbanner_icon);
            }
            if (normalBannerMaterial.mbackground_pic != null) {
                ImageElement.ADAPTER.encodeWithTag(protoWriter, 3, normalBannerMaterial.mbackground_pic);
            }
            if (normalBannerMaterial.mtitle != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 4, normalBannerMaterial.mtitle);
            }
            if (normalBannerMaterial.mtitle_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, normalBannerMaterial.mtitle_color);
            }
            if (normalBannerMaterial.msub_title != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 6, normalBannerMaterial.msub_title);
            }
            if (normalBannerMaterial.msub_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, normalBannerMaterial.msub_title_color);
            }
            if (normalBannerMaterial.mcta_title != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 8, normalBannerMaterial.mcta_title);
            }
            if (normalBannerMaterial.mcta_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, normalBannerMaterial.mcta_title_color);
            }
            if (normalBannerMaterial.mcta_background_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, normalBannerMaterial.mcta_background_color);
            }
            if (normalBannerMaterial.mbanner_closeable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, normalBannerMaterial.mbanner_closeable);
            }
            if (normalBannerMaterial.mbanner_closeable_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, normalBannerMaterial.mbanner_closeable_color);
            }
            if (normalBannerMaterial.mbutton_link != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 13, normalBannerMaterial.mbutton_link);
            }
            if (normalBannerMaterial.mlayout != null) {
                Layout.ADAPTER.encodeWithTag(protoWriter, 14, normalBannerMaterial.mlayout);
            }
            if (normalBannerMaterial.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, normalBannerMaterial.mframe_color);
            }
            ButtonElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, normalBannerMaterial.mbuttons);
            protoWriter.writeBytes(normalBannerMaterial.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.NormalBannerMaterial$a */
    public static final class C50128a extends Message.Builder<NormalBannerMaterial, C50128a> {

        /* renamed from: a */
        public String f125285a;

        /* renamed from: b */
        public ImageElement f125286b;

        /* renamed from: c */
        public ImageElement f125287c;

        /* renamed from: d */
        public TextElement f125288d;

        /* renamed from: e */
        public String f125289e;

        /* renamed from: f */
        public TextElement f125290f;

        /* renamed from: g */
        public String f125291g;

        /* renamed from: h */
        public TextElement f125292h;

        /* renamed from: i */
        public String f125293i;

        /* renamed from: j */
        public String f125294j;

        /* renamed from: k */
        public Boolean f125295k;

        /* renamed from: l */
        public String f125296l;

        /* renamed from: m */
        public TextElement f125297m;

        /* renamed from: n */
        public Layout f125298n;

        /* renamed from: o */
        public String f125299o;

        /* renamed from: p */
        public List<ButtonElement> f125300p = Internal.newMutableList();

        /* renamed from: a */
        public NormalBannerMaterial build() {
            return new NormalBannerMaterial(this.f125285a, this.f125286b, this.f125287c, this.f125288d, this.f125289e, this.f125290f, this.f125291g, this.f125292h, this.f125293i, this.f125294j, this.f125295k, this.f125296l, this.f125297m, this.f125298n, this.f125299o, this.f125300p, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50128a newBuilder() {
        C50128a aVar = new C50128a();
        aVar.f125285a = this.mbackground_color;
        aVar.f125286b = this.mbanner_icon;
        aVar.f125287c = this.mbackground_pic;
        aVar.f125288d = this.mtitle;
        aVar.f125289e = this.mtitle_color;
        aVar.f125290f = this.msub_title;
        aVar.f125291g = this.msub_title_color;
        aVar.f125292h = this.mcta_title;
        aVar.f125293i = this.mcta_title_color;
        aVar.f125294j = this.mcta_background_color;
        aVar.f125295k = this.mbanner_closeable;
        aVar.f125296l = this.mbanner_closeable_color;
        aVar.f125297m = this.mbutton_link;
        aVar.f125298n = this.mlayout;
        aVar.f125299o = this.mframe_color;
        aVar.f125300p = Internal.copyOf("mbuttons", this.mbuttons);
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
        if (this.msub_title != null) {
            sb.append(", sub_title=");
            sb.append(this.msub_title);
        }
        if (this.msub_title_color != null) {
            sb.append(", sub_title_color=");
            sb.append(this.msub_title_color);
        }
        if (this.mcta_title != null) {
            sb.append(", cta_title=");
            sb.append(this.mcta_title);
        }
        if (this.mcta_title_color != null) {
            sb.append(", cta_title_color=");
            sb.append(this.mcta_title_color);
        }
        if (this.mcta_background_color != null) {
            sb.append(", cta_background_color=");
            sb.append(this.mcta_background_color);
        }
        if (this.mbanner_closeable != null) {
            sb.append(", banner_closeable=");
            sb.append(this.mbanner_closeable);
        }
        if (this.mbanner_closeable_color != null) {
            sb.append(", banner_closeable_color=");
            sb.append(this.mbanner_closeable_color);
        }
        if (this.mbutton_link != null) {
            sb.append(", button_link=");
            sb.append(this.mbutton_link);
        }
        if (this.mlayout != null) {
            sb.append(", layout=");
            sb.append(this.mlayout);
        }
        if (this.mframe_color != null) {
            sb.append(", frame_color=");
            sb.append(this.mframe_color);
        }
        if (!this.mbuttons.isEmpty()) {
            sb.append(", buttons=");
            sb.append(this.mbuttons);
        }
        StringBuilder replace = sb.replace(0, 2, "NormalBannerMaterial{");
        replace.append('}');
        return replace.toString();
    }

    public NormalBannerMaterial(String str, ImageElement imageElement, ImageElement imageElement2, TextElement textElement, String str2, TextElement textElement2, String str3, TextElement textElement3, String str4, String str5, Boolean bool, String str6, TextElement textElement4, Layout layout, String str7, List<ButtonElement> list) {
        this(str, imageElement, imageElement2, textElement, str2, textElement2, str3, textElement3, str4, str5, bool, str6, textElement4, layout, str7, list, ByteString.EMPTY);
    }

    public NormalBannerMaterial(String str, ImageElement imageElement, ImageElement imageElement2, TextElement textElement, String str2, TextElement textElement2, String str3, TextElement textElement3, String str4, String str5, Boolean bool, String str6, TextElement textElement4, Layout layout, String str7, List<ButtonElement> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mbanner_icon = imageElement;
        this.mbackground_pic = imageElement2;
        this.mtitle = textElement;
        this.mtitle_color = str2;
        this.msub_title = textElement2;
        this.msub_title_color = str3;
        this.mcta_title = textElement3;
        this.mcta_title_color = str4;
        this.mcta_background_color = str5;
        this.mbanner_closeable = bool;
        this.mbanner_closeable_color = str6;
        this.mbutton_link = textElement4;
        this.mlayout = layout;
        this.mframe_color = str7;
        this.mbuttons = Internal.immutableCopyOf("mbuttons", list);
    }
}
