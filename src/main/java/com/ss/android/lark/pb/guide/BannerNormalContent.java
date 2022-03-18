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

public final class BannerNormalContent extends Message<BannerNormalContent, C49776a> {
    public static final ProtoAdapter<BannerNormalContent> ADAPTER = new C49777b();
    public static final Boolean DEFAULT_BANNER_CLOSEABLE = false;
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final String mbackground_pic;
    public final Boolean mbanner_closeable;
    public final String mbanner_closeable_color;
    public final String mbanner_icon;
    public final String mbutton_link;
    public final List<BannerButton> mbuttons;
    public final String mcta_background_color;
    public final String mcta_title;
    public final String mcta_title_color;
    public final String mframe_color;
    public final Layout mlayout;
    public final String msub_title;
    public final String msub_title_color;
    public final String mtitle;
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

    /* renamed from: com.ss.android.lark.pb.guide.BannerNormalContent$b */
    private static final class C49777b extends ProtoAdapter<BannerNormalContent> {
        C49777b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerNormalContent.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerNormalContent bannerNormalContent) {
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
            if (bannerNormalContent.mbackground_color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerNormalContent.mbackground_color);
            } else {
                i = 0;
            }
            if (bannerNormalContent.mbanner_icon != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, bannerNormalContent.mbanner_icon);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (bannerNormalContent.mbackground_pic != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, bannerNormalContent.mbackground_pic);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (bannerNormalContent.mtitle != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, bannerNormalContent.mtitle);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (bannerNormalContent.mtitle_color != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, bannerNormalContent.mtitle_color);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (bannerNormalContent.msub_title != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, bannerNormalContent.msub_title);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (bannerNormalContent.msub_title_color != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, bannerNormalContent.msub_title_color);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (bannerNormalContent.mcta_title != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, bannerNormalContent.mcta_title);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (bannerNormalContent.mcta_title_color != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, bannerNormalContent.mcta_title_color);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (bannerNormalContent.mcta_background_color != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, bannerNormalContent.mcta_background_color);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (bannerNormalContent.mbanner_closeable != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, bannerNormalContent.mbanner_closeable);
            } else {
                i11 = 0;
            }
            int i25 = i24 + i11;
            if (bannerNormalContent.mbanner_closeable_color != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, bannerNormalContent.mbanner_closeable_color);
            } else {
                i12 = 0;
            }
            int i26 = i25 + i12;
            if (bannerNormalContent.mbutton_link != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, bannerNormalContent.mbutton_link);
            } else {
                i13 = 0;
            }
            int i27 = i26 + i13;
            if (bannerNormalContent.mlayout != null) {
                i14 = Layout.ADAPTER.encodedSizeWithTag(14, bannerNormalContent.mlayout);
            } else {
                i14 = 0;
            }
            int i28 = i27 + i14;
            if (bannerNormalContent.mframe_color != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(15, bannerNormalContent.mframe_color);
            }
            return i28 + i15 + BannerButton.ADAPTER.asRepeated().encodedSizeWithTag(16, bannerNormalContent.mbuttons) + bannerNormalContent.unknownFields().size();
        }

        /* renamed from: a */
        public BannerNormalContent decode(ProtoReader protoReader) throws IOException {
            C49776a aVar = new C49776a();
            aVar.f124670a = "";
            aVar.f124671b = "";
            aVar.f124672c = "";
            aVar.f124673d = "";
            aVar.f124674e = "";
            aVar.f124675f = "";
            aVar.f124676g = "";
            aVar.f124677h = "";
            aVar.f124678i = "";
            aVar.f124679j = "";
            aVar.f124680k = false;
            aVar.f124681l = "";
            aVar.f124682m = "";
            aVar.f124684o = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124670a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124671b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124672c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124673d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124674e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124675f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124676g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124677h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124678i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124679j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124680k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124681l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124682m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f124683n = Layout.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 15:
                            aVar.f124684o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f124685p.add(BannerButton.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, BannerNormalContent bannerNormalContent) throws IOException {
            if (bannerNormalContent.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerNormalContent.mbackground_color);
            }
            if (bannerNormalContent.mbanner_icon != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bannerNormalContent.mbanner_icon);
            }
            if (bannerNormalContent.mbackground_pic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bannerNormalContent.mbackground_pic);
            }
            if (bannerNormalContent.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, bannerNormalContent.mtitle);
            }
            if (bannerNormalContent.mtitle_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, bannerNormalContent.mtitle_color);
            }
            if (bannerNormalContent.msub_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, bannerNormalContent.msub_title);
            }
            if (bannerNormalContent.msub_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, bannerNormalContent.msub_title_color);
            }
            if (bannerNormalContent.mcta_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, bannerNormalContent.mcta_title);
            }
            if (bannerNormalContent.mcta_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, bannerNormalContent.mcta_title_color);
            }
            if (bannerNormalContent.mcta_background_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, bannerNormalContent.mcta_background_color);
            }
            if (bannerNormalContent.mbanner_closeable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, bannerNormalContent.mbanner_closeable);
            }
            if (bannerNormalContent.mbanner_closeable_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, bannerNormalContent.mbanner_closeable_color);
            }
            if (bannerNormalContent.mbutton_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, bannerNormalContent.mbutton_link);
            }
            if (bannerNormalContent.mlayout != null) {
                Layout.ADAPTER.encodeWithTag(protoWriter, 14, bannerNormalContent.mlayout);
            }
            if (bannerNormalContent.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, bannerNormalContent.mframe_color);
            }
            BannerButton.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, bannerNormalContent.mbuttons);
            protoWriter.writeBytes(bannerNormalContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerNormalContent$a */
    public static final class C49776a extends Message.Builder<BannerNormalContent, C49776a> {

        /* renamed from: a */
        public String f124670a;

        /* renamed from: b */
        public String f124671b;

        /* renamed from: c */
        public String f124672c;

        /* renamed from: d */
        public String f124673d;

        /* renamed from: e */
        public String f124674e;

        /* renamed from: f */
        public String f124675f;

        /* renamed from: g */
        public String f124676g;

        /* renamed from: h */
        public String f124677h;

        /* renamed from: i */
        public String f124678i;

        /* renamed from: j */
        public String f124679j;

        /* renamed from: k */
        public Boolean f124680k;

        /* renamed from: l */
        public String f124681l;

        /* renamed from: m */
        public String f124682m;

        /* renamed from: n */
        public Layout f124683n;

        /* renamed from: o */
        public String f124684o;

        /* renamed from: p */
        public List<BannerButton> f124685p = Internal.newMutableList();

        /* renamed from: a */
        public BannerNormalContent build() {
            return new BannerNormalContent(this.f124670a, this.f124671b, this.f124672c, this.f124673d, this.f124674e, this.f124675f, this.f124676g, this.f124677h, this.f124678i, this.f124679j, this.f124680k, this.f124681l, this.f124682m, this.f124683n, this.f124684o, this.f124685p, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49776a newBuilder() {
        C49776a aVar = new C49776a();
        aVar.f124670a = this.mbackground_color;
        aVar.f124671b = this.mbanner_icon;
        aVar.f124672c = this.mbackground_pic;
        aVar.f124673d = this.mtitle;
        aVar.f124674e = this.mtitle_color;
        aVar.f124675f = this.msub_title;
        aVar.f124676g = this.msub_title_color;
        aVar.f124677h = this.mcta_title;
        aVar.f124678i = this.mcta_title_color;
        aVar.f124679j = this.mcta_background_color;
        aVar.f124680k = this.mbanner_closeable;
        aVar.f124681l = this.mbanner_closeable_color;
        aVar.f124682m = this.mbutton_link;
        aVar.f124683n = this.mlayout;
        aVar.f124684o = this.mframe_color;
        aVar.f124685p = Internal.copyOf("mbuttons", this.mbuttons);
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
        StringBuilder replace = sb.replace(0, 2, "BannerNormalContent{");
        replace.append('}');
        return replace.toString();
    }

    public BannerNormalContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, Layout layout, String str13, List<BannerButton> list) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool, str11, str12, layout, str13, list, ByteString.EMPTY);
    }

    public BannerNormalContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, Layout layout, String str13, List<BannerButton> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mbanner_icon = str2;
        this.mbackground_pic = str3;
        this.mtitle = str4;
        this.mtitle_color = str5;
        this.msub_title = str6;
        this.msub_title_color = str7;
        this.mcta_title = str8;
        this.mcta_title_color = str9;
        this.mcta_background_color = str10;
        this.mbanner_closeable = bool;
        this.mbanner_closeable_color = str11;
        this.mbutton_link = str12;
        this.mlayout = layout;
        this.mframe_color = str13;
        this.mbuttons = Internal.immutableCopyOf("mbuttons", list);
    }
}
