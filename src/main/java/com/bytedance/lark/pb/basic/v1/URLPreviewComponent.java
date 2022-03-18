package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ttm.player.MediaPlayer;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class URLPreviewComponent extends Message<URLPreviewComponent, C15414a> {
    public static final ProtoAdapter<URLPreviewComponent> ADAPTER = new C15415b();
    public static final Boolean DEFAULT_CAN_SKIP_WHEN_UNKNOWN = true;
    public static final Boolean DEFAULT_IS_FONT_ZOOMABLE = true;
    public static final Type DEFAULT_TYPE = Type.EMPTY;
    private static final long serialVersionUID = 0;
    public final AvatarProperty avatar;
    public final ButtonProperty button;
    public final Boolean can_skip_when_unknown;
    public final CardContainerProperty card_container;
    public final ChattersPreviewProperty chatters_preview;
    public final List<String> child_ids;
    public final EmptyProperty empty;
    public final PreviewHeaderProperty header;
    public final IconButtonProperty icon_button;
    public final ImageProperty image;
    public final Boolean is_font_zoomable;
    public final LinearLayoutProperty linear_layout;
    public final RichTextProperty richtext;
    public final SpinButtonProperty spin_button;
    public final Style style;
    public final TagListProperty tag_list;
    public final TextProperty text;
    public final TextButtonProperty text_button;
    public final TimeProperty time;
    public final Type type;
    public final VideoProperty video;

    public static final class PreviewHeaderProperty extends Message<PreviewHeaderProperty, C15394a> {
        public static final ProtoAdapter<PreviewHeaderProperty> ADAPTER = new C15395b();
        public static final Boolean DEFAULT_IS_NEED_CLOSE = true;
        public static final Boolean DEFAULT_IS_NEED_COPY_LINK = true;
        public static final Tag DEFAULT_LARK_TAG = Tag.UNKNOWN_TAG;
        public static final Theme DEFAULT_THEME = Theme.LIGHT;
        public static final Type DEFAULT_TYPE = Type.NORMAL;
        private static final long serialVersionUID = 0;
        public final String child_component_id;
        public final String favicon_url;
        public final String header_tag;
        public final ThemeColor icon_color;
        public final ImageSet icon_key;
        public final Boolean is_need_close;
        public final Boolean is_need_copy_link;
        public final Tag lark_tag;
        public final ThemeColor tag_color;
        public final ThemeColor tag_text_color;
        public final Theme theme;
        public final String title;
        public final Type type;

        public enum Type implements WireEnum {
            NORMAL(0),
            HEADLINES(1);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return NORMAL;
                }
                if (i != 1) {
                    return null;
                }
                return HEADLINES;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$PreviewHeaderProperty$b */
        private static final class C15395b extends ProtoAdapter<PreviewHeaderProperty> {
            C15395b() {
                super(FieldEncoding.LENGTH_DELIMITED, PreviewHeaderProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(PreviewHeaderProperty previewHeaderProperty) {
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
                int i13 = 0;
                if (previewHeaderProperty.icon_key != null) {
                    i = ImageSet.ADAPTER.encodedSizeWithTag(1, previewHeaderProperty.icon_key);
                } else {
                    i = 0;
                }
                if (previewHeaderProperty.title != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, previewHeaderProperty.title);
                } else {
                    i2 = 0;
                }
                int i14 = i + i2;
                if (previewHeaderProperty.lark_tag != null) {
                    i3 = Tag.ADAPTER.encodedSizeWithTag(3, previewHeaderProperty.lark_tag);
                } else {
                    i3 = 0;
                }
                int i15 = i14 + i3;
                if (previewHeaderProperty.child_component_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, previewHeaderProperty.child_component_id);
                } else {
                    i4 = 0;
                }
                int i16 = i15 + i4;
                if (previewHeaderProperty.is_need_copy_link != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, previewHeaderProperty.is_need_copy_link);
                } else {
                    i5 = 0;
                }
                int i17 = i16 + i5;
                if (previewHeaderProperty.is_need_close != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, previewHeaderProperty.is_need_close);
                } else {
                    i6 = 0;
                }
                int i18 = i17 + i6;
                if (previewHeaderProperty.theme != null) {
                    i7 = Theme.ADAPTER.encodedSizeWithTag(7, previewHeaderProperty.theme);
                } else {
                    i7 = 0;
                }
                int i19 = i18 + i7;
                if (previewHeaderProperty.type != null) {
                    i8 = Type.ADAPTER.encodedSizeWithTag(8, previewHeaderProperty.type);
                } else {
                    i8 = 0;
                }
                int i20 = i19 + i8;
                if (previewHeaderProperty.tag_color != null) {
                    i9 = ThemeColor.ADAPTER.encodedSizeWithTag(9, previewHeaderProperty.tag_color);
                } else {
                    i9 = 0;
                }
                int i21 = i20 + i9;
                if (previewHeaderProperty.tag_text_color != null) {
                    i10 = ThemeColor.ADAPTER.encodedSizeWithTag(10, previewHeaderProperty.tag_text_color);
                } else {
                    i10 = 0;
                }
                int i22 = i21 + i10;
                if (previewHeaderProperty.header_tag != null) {
                    i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, previewHeaderProperty.header_tag);
                } else {
                    i11 = 0;
                }
                int i23 = i22 + i11;
                if (previewHeaderProperty.favicon_url != null) {
                    i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, previewHeaderProperty.favicon_url);
                } else {
                    i12 = 0;
                }
                int i24 = i23 + i12;
                if (previewHeaderProperty.icon_color != null) {
                    i13 = ThemeColor.ADAPTER.encodedSizeWithTag(13, previewHeaderProperty.icon_color);
                }
                return i24 + i13 + previewHeaderProperty.unknownFields().size();
            }

            /* renamed from: a */
            public PreviewHeaderProperty decode(ProtoReader protoReader) throws IOException {
                C15394a aVar = new C15394a();
                aVar.f40721b = "";
                aVar.f40722c = Tag.UNKNOWN_TAG;
                aVar.f40723d = "";
                aVar.f40724e = true;
                aVar.f40725f = true;
                aVar.f40726g = Theme.LIGHT;
                aVar.f40727h = Type.NORMAL;
                aVar.f40730k = "";
                aVar.f40731l = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40720a = ImageSet.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40721b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                try {
                                    aVar.f40722c = Tag.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 4:
                                aVar.f40723d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40724e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40725f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                try {
                                    aVar.f40726g = Theme.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 8:
                                try {
                                    aVar.f40727h = Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 9:
                                aVar.f40728i = ThemeColor.ADAPTER.decode(protoReader);
                                break;
                            case 10:
                                aVar.f40729j = ThemeColor.ADAPTER.decode(protoReader);
                                break;
                            case 11:
                                aVar.f40730k = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f40731l = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 13:
                                aVar.f40732m = ThemeColor.ADAPTER.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, PreviewHeaderProperty previewHeaderProperty) throws IOException {
                if (previewHeaderProperty.icon_key != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 1, previewHeaderProperty.icon_key);
                }
                if (previewHeaderProperty.title != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, previewHeaderProperty.title);
                }
                if (previewHeaderProperty.lark_tag != null) {
                    Tag.ADAPTER.encodeWithTag(protoWriter, 3, previewHeaderProperty.lark_tag);
                }
                if (previewHeaderProperty.child_component_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, previewHeaderProperty.child_component_id);
                }
                if (previewHeaderProperty.is_need_copy_link != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, previewHeaderProperty.is_need_copy_link);
                }
                if (previewHeaderProperty.is_need_close != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, previewHeaderProperty.is_need_close);
                }
                if (previewHeaderProperty.theme != null) {
                    Theme.ADAPTER.encodeWithTag(protoWriter, 7, previewHeaderProperty.theme);
                }
                if (previewHeaderProperty.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 8, previewHeaderProperty.type);
                }
                if (previewHeaderProperty.tag_color != null) {
                    ThemeColor.ADAPTER.encodeWithTag(protoWriter, 9, previewHeaderProperty.tag_color);
                }
                if (previewHeaderProperty.tag_text_color != null) {
                    ThemeColor.ADAPTER.encodeWithTag(protoWriter, 10, previewHeaderProperty.tag_text_color);
                }
                if (previewHeaderProperty.header_tag != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, previewHeaderProperty.header_tag);
                }
                if (previewHeaderProperty.favicon_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, previewHeaderProperty.favicon_url);
                }
                if (previewHeaderProperty.icon_color != null) {
                    ThemeColor.ADAPTER.encodeWithTag(protoWriter, 13, previewHeaderProperty.icon_color);
                }
                protoWriter.writeBytes(previewHeaderProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$PreviewHeaderProperty$a */
        public static final class C15394a extends Message.Builder<PreviewHeaderProperty, C15394a> {

            /* renamed from: a */
            public ImageSet f40720a;

            /* renamed from: b */
            public String f40721b;

            /* renamed from: c */
            public Tag f40722c;

            /* renamed from: d */
            public String f40723d;

            /* renamed from: e */
            public Boolean f40724e;

            /* renamed from: f */
            public Boolean f40725f;

            /* renamed from: g */
            public Theme f40726g;

            /* renamed from: h */
            public Type f40727h;

            /* renamed from: i */
            public ThemeColor f40728i;

            /* renamed from: j */
            public ThemeColor f40729j;

            /* renamed from: k */
            public String f40730k;

            /* renamed from: l */
            public String f40731l;

            /* renamed from: m */
            public ThemeColor f40732m;

            /* renamed from: a */
            public PreviewHeaderProperty build() {
                return new PreviewHeaderProperty(this.f40720a, this.f40721b, this.f40722c, this.f40723d, this.f40724e, this.f40725f, this.f40726g, this.f40727h, this.f40728i, this.f40729j, this.f40730k, this.f40731l, this.f40732m, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15394a newBuilder() {
            C15394a aVar = new C15394a();
            aVar.f40720a = this.icon_key;
            aVar.f40721b = this.title;
            aVar.f40722c = this.lark_tag;
            aVar.f40723d = this.child_component_id;
            aVar.f40724e = this.is_need_copy_link;
            aVar.f40725f = this.is_need_close;
            aVar.f40726g = this.theme;
            aVar.f40727h = this.type;
            aVar.f40728i = this.tag_color;
            aVar.f40729j = this.tag_text_color;
            aVar.f40730k = this.header_tag;
            aVar.f40731l = this.favicon_url;
            aVar.f40732m = this.icon_color;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "PreviewHeaderProperty");
            StringBuilder sb = new StringBuilder();
            if (this.icon_key != null) {
                sb.append(", icon_key=");
                sb.append(this.icon_key);
            }
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.lark_tag != null) {
                sb.append(", lark_tag=");
                sb.append(this.lark_tag);
            }
            if (this.child_component_id != null) {
                sb.append(", child_component_id=");
                sb.append(this.child_component_id);
            }
            if (this.is_need_copy_link != null) {
                sb.append(", is_need_copy_link=");
                sb.append(this.is_need_copy_link);
            }
            if (this.is_need_close != null) {
                sb.append(", is_need_close=");
                sb.append(this.is_need_close);
            }
            if (this.theme != null) {
                sb.append(", theme=");
                sb.append(this.theme);
            }
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.tag_color != null) {
                sb.append(", tag_color=");
                sb.append(this.tag_color);
            }
            if (this.tag_text_color != null) {
                sb.append(", tag_text_color=");
                sb.append(this.tag_text_color);
            }
            if (this.header_tag != null) {
                sb.append(", header_tag=");
                sb.append(this.header_tag);
            }
            if (this.favicon_url != null) {
                sb.append(", favicon_url=");
                sb.append(this.favicon_url);
            }
            if (this.icon_color != null) {
                sb.append(", icon_color=");
                sb.append(this.icon_color);
            }
            StringBuilder replace = sb.replace(0, 2, "PreviewHeaderProperty{");
            replace.append('}');
            return replace.toString();
        }

        public PreviewHeaderProperty(ImageSet imageSet, String str, Tag tag, String str2, Boolean bool, Boolean bool2, Theme theme2, Type type2, ThemeColor themeColor, ThemeColor themeColor2, String str3, String str4, ThemeColor themeColor3) {
            this(imageSet, str, tag, str2, bool, bool2, theme2, type2, themeColor, themeColor2, str3, str4, themeColor3, ByteString.EMPTY);
        }

        public PreviewHeaderProperty(ImageSet imageSet, String str, Tag tag, String str2, Boolean bool, Boolean bool2, Theme theme2, Type type2, ThemeColor themeColor, ThemeColor themeColor2, String str3, String str4, ThemeColor themeColor3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.icon_key = imageSet;
            this.title = str;
            this.lark_tag = tag;
            this.child_component_id = str2;
            this.is_need_copy_link = bool;
            this.is_need_close = bool2;
            this.theme = theme2;
            this.type = type2;
            this.tag_color = themeColor;
            this.tag_text_color = themeColor2;
            this.header_tag = str3;
            this.favicon_url = str4;
            this.icon_color = themeColor3;
        }
    }

    public static final class VideoProperty extends Message<VideoProperty, C15412a> {
        public static final ProtoAdapter<VideoProperty> ADAPTER = new C15413b();
        public static final Long DEFAULT_DURATION = 0L;
        public static final Site DEFAULT_SITE = Site.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final ImageSet cover_image;
        public final Long duration;
        public final String iframe_url;
        public final Site site;
        public final String src_url;
        public final String vid;

        public enum Site implements WireEnum {
            UNKNOWN(0),
            XIGUA(1),
            DOUYIN(2),
            HUOSHAN(3),
            YOUTUBE(4);
            
            public static final ProtoAdapter<Site> ADAPTER = ProtoAdapter.newEnumAdapter(Site.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Site fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return XIGUA;
                }
                if (i == 2) {
                    return DOUYIN;
                }
                if (i == 3) {
                    return HUOSHAN;
                }
                if (i != 4) {
                    return null;
                }
                return YOUTUBE;
            }

            private Site(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$VideoProperty$b */
        private static final class C15413b extends ProtoAdapter<VideoProperty> {
            C15413b() {
                super(FieldEncoding.LENGTH_DELIMITED, VideoProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(VideoProperty videoProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (videoProperty.site != null) {
                    i = Site.ADAPTER.encodedSizeWithTag(1, videoProperty.site);
                } else {
                    i = 0;
                }
                if (videoProperty.cover_image != null) {
                    i2 = ImageSet.ADAPTER.encodedSizeWithTag(2, videoProperty.cover_image);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (videoProperty.duration != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, videoProperty.duration);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (videoProperty.src_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoProperty.src_url);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (videoProperty.vid != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, videoProperty.vid);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (videoProperty.iframe_url != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, videoProperty.iframe_url);
                }
                return i10 + i6 + videoProperty.unknownFields().size();
            }

            /* renamed from: a */
            public VideoProperty decode(ProtoReader protoReader) throws IOException {
                C15412a aVar = new C15412a();
                aVar.f40764a = Site.UNKNOWN;
                aVar.f40766c = 0L;
                aVar.f40767d = "";
                aVar.f40768e = "";
                aVar.f40769f = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f40764a = Site.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f40765b = ImageSet.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40766c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40767d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40768e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40769f = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, VideoProperty videoProperty) throws IOException {
                if (videoProperty.site != null) {
                    Site.ADAPTER.encodeWithTag(protoWriter, 1, videoProperty.site);
                }
                if (videoProperty.cover_image != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 2, videoProperty.cover_image);
                }
                if (videoProperty.duration != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, videoProperty.duration);
                }
                if (videoProperty.src_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoProperty.src_url);
                }
                if (videoProperty.vid != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoProperty.vid);
                }
                if (videoProperty.iframe_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, videoProperty.iframe_url);
                }
                protoWriter.writeBytes(videoProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$VideoProperty$a */
        public static final class C15412a extends Message.Builder<VideoProperty, C15412a> {

            /* renamed from: a */
            public Site f40764a;

            /* renamed from: b */
            public ImageSet f40765b;

            /* renamed from: c */
            public Long f40766c;

            /* renamed from: d */
            public String f40767d;

            /* renamed from: e */
            public String f40768e;

            /* renamed from: f */
            public String f40769f;

            /* renamed from: a */
            public VideoProperty build() {
                return new VideoProperty(this.f40764a, this.f40765b, this.f40766c, this.f40767d, this.f40768e, this.f40769f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15412a newBuilder() {
            C15412a aVar = new C15412a();
            aVar.f40764a = this.site;
            aVar.f40765b = this.cover_image;
            aVar.f40766c = this.duration;
            aVar.f40767d = this.src_url;
            aVar.f40768e = this.vid;
            aVar.f40769f = this.iframe_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "VideoProperty");
            StringBuilder sb = new StringBuilder();
            if (this.site != null) {
                sb.append(", site=");
                sb.append(this.site);
            }
            if (this.cover_image != null) {
                sb.append(", cover_image=");
                sb.append(this.cover_image);
            }
            if (this.duration != null) {
                sb.append(", duration=");
                sb.append(this.duration);
            }
            if (this.src_url != null) {
                sb.append(", src_url=");
                sb.append(this.src_url);
            }
            if (this.vid != null) {
                sb.append(", vid=");
                sb.append(this.vid);
            }
            if (this.iframe_url != null) {
                sb.append(", iframe_url=");
                sb.append(this.iframe_url);
            }
            StringBuilder replace = sb.replace(0, 2, "VideoProperty{");
            replace.append('}');
            return replace.toString();
        }

        public VideoProperty(Site site2, ImageSet imageSet, Long l, String str, String str2, String str3) {
            this(site2, imageSet, l, str, str2, str3, ByteString.EMPTY);
        }

        public VideoProperty(Site site2, ImageSet imageSet, Long l, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.site = site2;
            this.cover_image = imageSet;
            this.duration = l;
            this.src_url = str;
            this.vid = str2;
            this.iframe_url = str3;
        }
    }

    public enum Align implements WireEnum {
        TOP(0),
        MIDDLE(1),
        BOTTOM(2),
        STRETCH(3),
        BASELINE(4);
        
        public static final ProtoAdapter<Align> ADAPTER = ProtoAdapter.newEnumAdapter(Align.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Align fromValue(int i) {
            if (i == 0) {
                return TOP;
            }
            if (i == 1) {
                return MIDDLE;
            }
            if (i == 2) {
                return BOTTOM;
            }
            if (i == 3) {
                return STRETCH;
            }
            if (i != 4) {
                return null;
            }
            return BASELINE;
        }

        private Align(int i) {
            this.value = i;
        }
    }

    public enum Direction implements WireEnum {
        LTR(0),
        RTL(1);
        
        public static final ProtoAdapter<Direction> ADAPTER = ProtoAdapter.newEnumAdapter(Direction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Direction fromValue(int i) {
            if (i == 0) {
                return LTR;
            }
            if (i != 1) {
                return null;
            }
            return RTL;
        }

        private Direction(int i) {
            this.value = i;
        }
    }

    public enum FontType implements WireEnum {
        TITLE(0),
        HEADLINE(1),
        BODY(2),
        CAPTION(3);
        
        public static final ProtoAdapter<FontType> ADAPTER = ProtoAdapter.newEnumAdapter(FontType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FontType fromValue(int i) {
            if (i == 0) {
                return TITLE;
            }
            if (i == 1) {
                return HEADLINE;
            }
            if (i == 2) {
                return BODY;
            }
            if (i != 3) {
                return null;
            }
            return CAPTION;
        }

        private FontType(int i) {
            this.value = i;
        }
    }

    public enum Justify implements WireEnum {
        START(0),
        CENTER(1),
        END(2),
        SPACE_BETWEEN(3),
        SPACE_ARROUND(4),
        SPACE_EVENLY(5);
        
        public static final ProtoAdapter<Justify> ADAPTER = ProtoAdapter.newEnumAdapter(Justify.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Justify fromValue(int i) {
            if (i == 0) {
                return START;
            }
            if (i == 1) {
                return CENTER;
            }
            if (i == 2) {
                return END;
            }
            if (i == 3) {
                return SPACE_BETWEEN;
            }
            if (i == 4) {
                return SPACE_ARROUND;
            }
            if (i != 5) {
                return null;
            }
            return SPACE_EVENLY;
        }

        private Justify(int i) {
            this.value = i;
        }
    }

    public enum Orientation implements WireEnum {
        ROW(0),
        COLUMN(1),
        ROW_REVERSE(2),
        COLUMN_REVERSE(3);
        
        public static final ProtoAdapter<Orientation> ADAPTER = ProtoAdapter.newEnumAdapter(Orientation.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Orientation fromValue(int i) {
            if (i == 0) {
                return ROW;
            }
            if (i == 1) {
                return COLUMN;
            }
            if (i == 2) {
                return ROW_REVERSE;
            }
            if (i != 3) {
                return null;
            }
            return COLUMN_REVERSE;
        }

        private Orientation(int i) {
            this.value = i;
        }
    }

    public enum SizeLevel implements WireEnum {
        NORMAL(0),
        SMALL(1),
        LARGE(2);
        
        public static final ProtoAdapter<SizeLevel> ADAPTER = ProtoAdapter.newEnumAdapter(SizeLevel.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SizeLevel fromValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i == 1) {
                return SMALL;
            }
            if (i != 2) {
                return null;
            }
            return LARGE;
        }

        private SizeLevel(int i) {
            this.value = i;
        }
    }

    public enum Theme implements WireEnum {
        LIGHT(0),
        DARK(1);
        
        public static final ProtoAdapter<Theme> ADAPTER = ProtoAdapter.newEnumAdapter(Theme.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Theme fromValue(int i) {
            if (i == 0) {
                return LIGHT;
            }
            if (i != 1) {
                return null;
            }
            return DARK;
        }

        private Theme(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        EMPTY(0),
        LINEAR_LAYOUT(1),
        HEADER(501),
        RICHTEXT(502),
        IMAGE(503),
        CHATTERS_PREVIEW(504),
        BUTTON(505),
        ICON_BUTTON(506),
        TEXT_BUTTON(507),
        TIME(508),
        TEXT(509),
        TAG_LIST(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR),
        SPIN_BUTTON(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME),
        AVATAR(MediaPlayer.MEDIA_PLAYER_OPTION_APPID),
        VIDEO(MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID),
        CARD_CONTAINER(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return EMPTY;
            }
            if (i == 1) {
                return LINEAR_LAYOUT;
            }
            switch (i) {
                case 501:
                    return HEADER;
                case 502:
                    return RICHTEXT;
                case 503:
                    return IMAGE;
                case 504:
                    return CHATTERS_PREVIEW;
                case 505:
                    return BUTTON;
                case 506:
                    return ICON_BUTTON;
                case 507:
                    return TEXT_BUTTON;
                case 508:
                    return TIME;
                case 509:
                    return TEXT;
                case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR /*{ENCODED_INT: 510}*/:
                    return TAG_LIST;
                case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME /*{ENCODED_INT: 511}*/:
                    return SPIN_BUTTON;
                case MediaPlayer.MEDIA_PLAYER_OPTION_APPID /*{ENCODED_INT: 512}*/:
                    return AVATAR;
                case MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID /*{ENCODED_INT: 513}*/:
                    return VIDEO;
                case MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE /*{ENCODED_INT: 514}*/:
                    return CARD_CONTAINER;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public enum ValueType implements WireEnum {
        AUTO(0),
        POINT(1),
        PERCENTAGE(2);
        
        public static final ProtoAdapter<ValueType> ADAPTER = ProtoAdapter.newEnumAdapter(ValueType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ValueType fromValue(int i) {
            if (i == 0) {
                return AUTO;
            }
            if (i == 1) {
                return POINT;
            }
            if (i != 2) {
                return null;
            }
            return PERCENTAGE;
        }

        private ValueType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$a */
    public static final class C15414a extends Message.Builder<URLPreviewComponent, C15414a> {

        /* renamed from: a */
        public Type f40770a;

        /* renamed from: b */
        public Boolean f40771b;

        /* renamed from: c */
        public Style f40772c;

        /* renamed from: d */
        public List<String> f40773d = Internal.newMutableList();

        /* renamed from: e */
        public Boolean f40774e;

        /* renamed from: f */
        public EmptyProperty f40775f;

        /* renamed from: g */
        public LinearLayoutProperty f40776g;

        /* renamed from: h */
        public PreviewHeaderProperty f40777h;

        /* renamed from: i */
        public RichTextProperty f40778i;

        /* renamed from: j */
        public ImageProperty f40779j;

        /* renamed from: k */
        public ChattersPreviewProperty f40780k;

        /* renamed from: l */
        public ButtonProperty f40781l;

        /* renamed from: m */
        public IconButtonProperty f40782m;

        /* renamed from: n */
        public TextButtonProperty f40783n;

        /* renamed from: o */
        public TimeProperty f40784o;

        /* renamed from: p */
        public TextProperty f40785p;

        /* renamed from: q */
        public TagListProperty f40786q;

        /* renamed from: r */
        public SpinButtonProperty f40787r;

        /* renamed from: s */
        public AvatarProperty f40788s;

        /* renamed from: t */
        public VideoProperty f40789t;

        /* renamed from: u */
        public CardContainerProperty f40790u;

        /* renamed from: a */
        public C15414a mo55904a(LinearLayoutProperty linearLayoutProperty) {
            this.f40776g = linearLayoutProperty;
            this.f40775f = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55905a(PreviewHeaderProperty previewHeaderProperty) {
            this.f40777h = previewHeaderProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55906a(RichTextProperty richTextProperty) {
            this.f40778i = richTextProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55903a(ImageProperty imageProperty) {
            this.f40779j = imageProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55909a(TextButtonProperty textButtonProperty) {
            this.f40783n = textButtonProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55911a(TimeProperty timeProperty) {
            this.f40784o = timeProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55910a(TextProperty textProperty) {
            this.f40785p = textProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55908a(TagListProperty tagListProperty) {
            this.f40786q = tagListProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55907a(SpinButtonProperty spinButtonProperty) {
            this.f40787r = spinButtonProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55912a(VideoProperty videoProperty) {
            this.f40789t = videoProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public URLPreviewComponent build() {
            Type type = this.f40770a;
            if (type != null) {
                return new URLPreviewComponent(type, this.f40771b, this.f40772c, this.f40773d, this.f40774e, this.f40775f, this.f40776g, this.f40777h, this.f40778i, this.f40779j, this.f40780k, this.f40781l, this.f40782m, this.f40783n, this.f40784o, this.f40785p, this.f40786q, this.f40787r, this.f40788s, this.f40789t, this.f40790u, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C15414a mo55897a(AvatarProperty avatarProperty) {
            this.f40788s = avatarProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55898a(ButtonProperty buttonProperty) {
            this.f40781l = buttonProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55899a(CardContainerProperty cardContainerProperty) {
            this.f40790u = cardContainerProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55900a(ChattersPreviewProperty chattersPreviewProperty) {
            this.f40780k = chattersPreviewProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55901a(EmptyProperty emptyProperty) {
            this.f40775f = emptyProperty;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40782m = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }

        /* renamed from: a */
        public C15414a mo55902a(IconButtonProperty iconButtonProperty) {
            this.f40782m = iconButtonProperty;
            this.f40775f = null;
            this.f40776g = null;
            this.f40777h = null;
            this.f40778i = null;
            this.f40779j = null;
            this.f40780k = null;
            this.f40781l = null;
            this.f40783n = null;
            this.f40784o = null;
            this.f40785p = null;
            this.f40786q = null;
            this.f40787r = null;
            this.f40788s = null;
            this.f40789t = null;
            this.f40790u = null;
            return this;
        }
    }

    public static final class AvatarProperty extends Message<AvatarProperty, C15372a> {
        public static final ProtoAdapter<AvatarProperty> ADAPTER = new C15373b();
        private static final long serialVersionUID = 0;
        public final ChatterInfo chatter_info;

        public static final class ChatterInfo extends Message<ChatterInfo, C15370a> {
            public static final ProtoAdapter<ChatterInfo> ADAPTER = new C15371b();
            private static final long serialVersionUID = 0;
            public final String avatar_key;
            public final String chatter_id;

            /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$AvatarProperty$ChatterInfo$b */
            private static final class C15371b extends ProtoAdapter<ChatterInfo> {
                C15371b() {
                    super(FieldEncoding.LENGTH_DELIMITED, ChatterInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(ChatterInfo chatterInfo) {
                    int i;
                    int i2 = 0;
                    if (chatterInfo.avatar_key != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatterInfo.avatar_key);
                    } else {
                        i = 0;
                    }
                    if (chatterInfo.chatter_id != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatterInfo.chatter_id);
                    }
                    return i + i2 + chatterInfo.unknownFields().size();
                }

                /* renamed from: a */
                public ChatterInfo decode(ProtoReader protoReader) throws IOException {
                    C15370a aVar = new C15370a();
                    aVar.f40689a = "";
                    aVar.f40690b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f40689a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f40690b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, ChatterInfo chatterInfo) throws IOException {
                    if (chatterInfo.avatar_key != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterInfo.avatar_key);
                    }
                    if (chatterInfo.chatter_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatterInfo.chatter_id);
                    }
                    protoWriter.writeBytes(chatterInfo.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$AvatarProperty$ChatterInfo$a */
            public static final class C15370a extends Message.Builder<ChatterInfo, C15370a> {

                /* renamed from: a */
                public String f40689a;

                /* renamed from: b */
                public String f40690b;

                /* renamed from: a */
                public ChatterInfo build() {
                    return new ChatterInfo(this.f40689a, this.f40690b, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C15370a newBuilder() {
                C15370a aVar = new C15370a();
                aVar.f40689a = this.avatar_key;
                aVar.f40690b = this.chatter_id;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "ChatterInfo");
                StringBuilder sb = new StringBuilder();
                if (this.avatar_key != null) {
                    sb.append(", avatar_key=");
                    sb.append(this.avatar_key);
                }
                if (this.chatter_id != null) {
                    sb.append(", chatter_id=");
                    sb.append(this.chatter_id);
                }
                StringBuilder replace = sb.replace(0, 2, "ChatterInfo{");
                replace.append('}');
                return replace.toString();
            }

            public ChatterInfo(String str, String str2) {
                this(str, str2, ByteString.EMPTY);
            }

            public ChatterInfo(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.avatar_key = str;
                this.chatter_id = str2;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$AvatarProperty$b */
        private static final class C15373b extends ProtoAdapter<AvatarProperty> {
            C15373b() {
                super(FieldEncoding.LENGTH_DELIMITED, AvatarProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(AvatarProperty avatarProperty) {
                int i;
                if (avatarProperty.chatter_info != null) {
                    i = ChatterInfo.ADAPTER.encodedSizeWithTag(1, avatarProperty.chatter_info);
                } else {
                    i = 0;
                }
                return i + avatarProperty.unknownFields().size();
            }

            /* renamed from: a */
            public AvatarProperty decode(ProtoReader protoReader) throws IOException {
                C15372a aVar = new C15372a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40691a = ChatterInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AvatarProperty avatarProperty) throws IOException {
                if (avatarProperty.chatter_info != null) {
                    ChatterInfo.ADAPTER.encodeWithTag(protoWriter, 1, avatarProperty.chatter_info);
                }
                protoWriter.writeBytes(avatarProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$AvatarProperty$a */
        public static final class C15372a extends Message.Builder<AvatarProperty, C15372a> {

            /* renamed from: a */
            public ChatterInfo f40691a;

            /* renamed from: a */
            public AvatarProperty build() {
                return new AvatarProperty(this.f40691a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15372a newBuilder() {
            C15372a aVar = new C15372a();
            aVar.f40691a = this.chatter_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AvatarProperty");
            StringBuilder sb = new StringBuilder();
            if (this.chatter_info != null) {
                sb.append(", chatter_info=");
                sb.append(this.chatter_info);
            }
            StringBuilder replace = sb.replace(0, 2, "AvatarProperty{");
            replace.append('}');
            return replace.toString();
        }

        public AvatarProperty(ChatterInfo chatterInfo) {
            this(chatterInfo, ByteString.EMPTY);
        }

        public AvatarProperty(ChatterInfo chatterInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chatter_info = chatterInfo;
        }
    }

    public static final class ChattersPreviewProperty extends Message<ChattersPreviewProperty, C15380a> {
        public static final ProtoAdapter<ChattersPreviewProperty> ADAPTER = new C15381b();
        public static final Integer DEFAULT_CHATTERS_COUNT = 0;
        public static final Integer DEFAULT_MAX_SHOW_COUNT = 5;
        public static final Theme DEFAULT_THEME = Theme.LIGHT;
        private static final long serialVersionUID = 0;
        public final List<ChatterInfo> chatter_infos;
        public final Integer chatters_count;
        public final Integer max_show_count;
        public final Theme theme;

        public static final class ChatterInfo extends Message<ChatterInfo, C15378a> {
            public static final ProtoAdapter<ChatterInfo> ADAPTER = new C15379b();
            private static final long serialVersionUID = 0;
            public final String avatar_key;
            public final String chatter_id;

            /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ChattersPreviewProperty$ChatterInfo$b */
            private static final class C15379b extends ProtoAdapter<ChatterInfo> {
                C15379b() {
                    super(FieldEncoding.LENGTH_DELIMITED, ChatterInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(ChatterInfo chatterInfo) {
                    int i;
                    int i2 = 0;
                    if (chatterInfo.avatar_key != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatterInfo.avatar_key);
                    } else {
                        i = 0;
                    }
                    if (chatterInfo.chatter_id != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatterInfo.chatter_id);
                    }
                    return i + i2 + chatterInfo.unknownFields().size();
                }

                /* renamed from: a */
                public ChatterInfo decode(ProtoReader protoReader) throws IOException {
                    C15378a aVar = new C15378a();
                    aVar.f40698a = "";
                    aVar.f40699b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f40698a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f40699b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, ChatterInfo chatterInfo) throws IOException {
                    if (chatterInfo.avatar_key != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterInfo.avatar_key);
                    }
                    if (chatterInfo.chatter_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatterInfo.chatter_id);
                    }
                    protoWriter.writeBytes(chatterInfo.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ChattersPreviewProperty$ChatterInfo$a */
            public static final class C15378a extends Message.Builder<ChatterInfo, C15378a> {

                /* renamed from: a */
                public String f40698a;

                /* renamed from: b */
                public String f40699b;

                /* renamed from: a */
                public ChatterInfo build() {
                    return new ChatterInfo(this.f40698a, this.f40699b, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C15378a newBuilder() {
                C15378a aVar = new C15378a();
                aVar.f40698a = this.avatar_key;
                aVar.f40699b = this.chatter_id;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "ChatterInfo");
                StringBuilder sb = new StringBuilder();
                if (this.avatar_key != null) {
                    sb.append(", avatar_key=");
                    sb.append(this.avatar_key);
                }
                if (this.chatter_id != null) {
                    sb.append(", chatter_id=");
                    sb.append(this.chatter_id);
                }
                StringBuilder replace = sb.replace(0, 2, "ChatterInfo{");
                replace.append('}');
                return replace.toString();
            }

            public ChatterInfo(String str, String str2) {
                this(str, str2, ByteString.EMPTY);
            }

            public ChatterInfo(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.avatar_key = str;
                this.chatter_id = str2;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ChattersPreviewProperty$b */
        private static final class C15381b extends ProtoAdapter<ChattersPreviewProperty> {
            C15381b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChattersPreviewProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ChattersPreviewProperty chattersPreviewProperty) {
                int i;
                int i2;
                int i3 = 0;
                if (chattersPreviewProperty.theme != null) {
                    i = Theme.ADAPTER.encodedSizeWithTag(1, chattersPreviewProperty.theme);
                } else {
                    i = 0;
                }
                if (chattersPreviewProperty.chatters_count != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, chattersPreviewProperty.chatters_count);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + ChatterInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, chattersPreviewProperty.chatter_infos);
                if (chattersPreviewProperty.max_show_count != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, chattersPreviewProperty.max_show_count);
                }
                return encodedSizeWithTag + i3 + chattersPreviewProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ChattersPreviewProperty decode(ProtoReader protoReader) throws IOException {
                C15380a aVar = new C15380a();
                aVar.f40700a = Theme.LIGHT;
                aVar.f40701b = 0;
                aVar.f40703d = 5;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40700a = Theme.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f40701b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40702c.add(ChatterInfo.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40703d = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChattersPreviewProperty chattersPreviewProperty) throws IOException {
                if (chattersPreviewProperty.theme != null) {
                    Theme.ADAPTER.encodeWithTag(protoWriter, 1, chattersPreviewProperty.theme);
                }
                if (chattersPreviewProperty.chatters_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, chattersPreviewProperty.chatters_count);
                }
                ChatterInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, chattersPreviewProperty.chatter_infos);
                if (chattersPreviewProperty.max_show_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, chattersPreviewProperty.max_show_count);
                }
                protoWriter.writeBytes(chattersPreviewProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ChattersPreviewProperty$a */
        public static final class C15380a extends Message.Builder<ChattersPreviewProperty, C15380a> {

            /* renamed from: a */
            public Theme f40700a;

            /* renamed from: b */
            public Integer f40701b;

            /* renamed from: c */
            public List<ChatterInfo> f40702c = Internal.newMutableList();

            /* renamed from: d */
            public Integer f40703d;

            /* renamed from: a */
            public ChattersPreviewProperty build() {
                return new ChattersPreviewProperty(this.f40700a, this.f40701b, this.f40702c, this.f40703d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15380a newBuilder() {
            C15380a aVar = new C15380a();
            aVar.f40700a = this.theme;
            aVar.f40701b = this.chatters_count;
            aVar.f40702c = Internal.copyOf("chatter_infos", this.chatter_infos);
            aVar.f40703d = this.max_show_count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ChattersPreviewProperty");
            StringBuilder sb = new StringBuilder();
            if (this.theme != null) {
                sb.append(", theme=");
                sb.append(this.theme);
            }
            if (this.chatters_count != null) {
                sb.append(", chatters_count=");
                sb.append(this.chatters_count);
            }
            if (!this.chatter_infos.isEmpty()) {
                sb.append(", chatter_infos=");
                sb.append(this.chatter_infos);
            }
            if (this.max_show_count != null) {
                sb.append(", max_show_count=");
                sb.append(this.max_show_count);
            }
            StringBuilder replace = sb.replace(0, 2, "ChattersPreviewProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ChattersPreviewProperty(Theme theme2, Integer num, List<ChatterInfo> list, Integer num2) {
            this(theme2, num, list, num2, ByteString.EMPTY);
        }

        public ChattersPreviewProperty(Theme theme2, Integer num, List<ChatterInfo> list, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.theme = theme2;
            this.chatters_count = num;
            this.chatter_infos = Internal.immutableCopyOf("chatter_infos", list);
            this.max_show_count = num2;
        }
    }

    public static final class ButtonProperty extends Message<ButtonProperty, C15374a> {
        public static final ProtoAdapter<ButtonProperty> ADAPTER = new C15375b();
        public static final Direction DEFAULT_DIRECTION = Direction.LTR;
        public static final Boolean DEFAULT_IS_DISABLE = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final Direction direction;
        public final ImageSet icon;
        public final Boolean is_disable;
        public final String text;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ButtonProperty$b */
        private static final class C15375b extends ProtoAdapter<ButtonProperty> {
            C15375b() {
                super(FieldEncoding.LENGTH_DELIMITED, ButtonProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ButtonProperty buttonProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (buttonProperty.icon != null) {
                    i = ImageSet.ADAPTER.encodedSizeWithTag(1, buttonProperty.icon);
                } else {
                    i = 0;
                }
                if (buttonProperty.text != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, buttonProperty.text);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (buttonProperty.direction != null) {
                    i3 = Direction.ADAPTER.encodedSizeWithTag(3, buttonProperty.direction);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (buttonProperty.action_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, buttonProperty.action_id);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (buttonProperty.is_disable != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, buttonProperty.is_disable);
                }
                return i8 + i5 + buttonProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ButtonProperty decode(ProtoReader protoReader) throws IOException {
                C15374a aVar = new C15374a();
                aVar.f40693b = "";
                aVar.f40694c = Direction.LTR;
                aVar.f40695d = "";
                aVar.f40696e = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40692a = ImageSet.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40693b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f40694c = Direction.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 4) {
                        aVar.f40695d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40696e = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ButtonProperty buttonProperty) throws IOException {
                if (buttonProperty.icon != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 1, buttonProperty.icon);
                }
                if (buttonProperty.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, buttonProperty.text);
                }
                if (buttonProperty.direction != null) {
                    Direction.ADAPTER.encodeWithTag(protoWriter, 3, buttonProperty.direction);
                }
                if (buttonProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, buttonProperty.action_id);
                }
                if (buttonProperty.is_disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, buttonProperty.is_disable);
                }
                protoWriter.writeBytes(buttonProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ButtonProperty$a */
        public static final class C15374a extends Message.Builder<ButtonProperty, C15374a> {

            /* renamed from: a */
            public ImageSet f40692a;

            /* renamed from: b */
            public String f40693b;

            /* renamed from: c */
            public Direction f40694c;

            /* renamed from: d */
            public String f40695d;

            /* renamed from: e */
            public Boolean f40696e;

            /* renamed from: a */
            public ButtonProperty build() {
                return new ButtonProperty(this.f40692a, this.f40693b, this.f40694c, this.f40695d, this.f40696e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15374a newBuilder() {
            C15374a aVar = new C15374a();
            aVar.f40692a = this.icon;
            aVar.f40693b = this.text;
            aVar.f40694c = this.direction;
            aVar.f40695d = this.action_id;
            aVar.f40696e = this.is_disable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ButtonProperty");
            StringBuilder sb = new StringBuilder();
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.direction != null) {
                sb.append(", direction=");
                sb.append(this.direction);
            }
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.is_disable != null) {
                sb.append(", is_disable=");
                sb.append(this.is_disable);
            }
            StringBuilder replace = sb.replace(0, 2, "ButtonProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ButtonProperty(ImageSet imageSet, String str, Direction direction2, String str2, Boolean bool) {
            this(imageSet, str, direction2, str2, bool, ByteString.EMPTY);
        }

        public ButtonProperty(ImageSet imageSet, String str, Direction direction2, String str2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.icon = imageSet;
            this.text = str;
            this.direction = direction2;
            this.action_id = str2;
            this.is_disable = bool;
        }
    }

    public static final class CardContainerProperty extends Message<CardContainerProperty, C15376a> {
        public static final ProtoAdapter<CardContainerProperty> ADAPTER = new C15377b();
        private static final long serialVersionUID = 0;
        public final ThemeColor mask_color;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$CardContainerProperty$b */
        private static final class C15377b extends ProtoAdapter<CardContainerProperty> {
            C15377b() {
                super(FieldEncoding.LENGTH_DELIMITED, CardContainerProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(CardContainerProperty cardContainerProperty) {
                int i;
                if (cardContainerProperty.mask_color != null) {
                    i = ThemeColor.ADAPTER.encodedSizeWithTag(1, cardContainerProperty.mask_color);
                } else {
                    i = 0;
                }
                return i + cardContainerProperty.unknownFields().size();
            }

            /* renamed from: a */
            public CardContainerProperty decode(ProtoReader protoReader) throws IOException {
                C15376a aVar = new C15376a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40697a = ThemeColor.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CardContainerProperty cardContainerProperty) throws IOException {
                if (cardContainerProperty.mask_color != null) {
                    ThemeColor.ADAPTER.encodeWithTag(protoWriter, 1, cardContainerProperty.mask_color);
                }
                protoWriter.writeBytes(cardContainerProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$CardContainerProperty$a */
        public static final class C15376a extends Message.Builder<CardContainerProperty, C15376a> {

            /* renamed from: a */
            public ThemeColor f40697a;

            /* renamed from: a */
            public CardContainerProperty build() {
                return new CardContainerProperty(this.f40697a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15376a newBuilder() {
            C15376a aVar = new C15376a();
            aVar.f40697a = this.mask_color;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CardContainerProperty");
            StringBuilder sb = new StringBuilder();
            if (this.mask_color != null) {
                sb.append(", mask_color=");
                sb.append(this.mask_color);
            }
            StringBuilder replace = sb.replace(0, 2, "CardContainerProperty{");
            replace.append('}');
            return replace.toString();
        }

        public CardContainerProperty(ThemeColor themeColor) {
            this(themeColor, ByteString.EMPTY);
        }

        public CardContainerProperty(ThemeColor themeColor, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mask_color = themeColor;
        }
    }

    public static final class EmptyProperty extends Message<EmptyProperty, C15382a> {
        public static final ProtoAdapter<EmptyProperty> ADAPTER = new C15383b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$EmptyProperty$b */
        private static final class C15383b extends ProtoAdapter<EmptyProperty> {
            C15383b() {
                super(FieldEncoding.LENGTH_DELIMITED, EmptyProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(EmptyProperty emptyProperty) {
                return emptyProperty.unknownFields().size();
            }

            /* renamed from: a */
            public EmptyProperty decode(ProtoReader protoReader) throws IOException {
                C15382a aVar = new C15382a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EmptyProperty emptyProperty) throws IOException {
                protoWriter.writeBytes(emptyProperty.unknownFields());
            }
        }

        public EmptyProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$EmptyProperty$a */
        public static final class C15382a extends Message.Builder<EmptyProperty, C15382a> {
            /* renamed from: a */
            public EmptyProperty build() {
                return new EmptyProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15382a newBuilder() {
            C15382a aVar = new C15382a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EmptyProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "EmptyProperty{");
            replace.append('}');
            return replace.toString();
        }

        public EmptyProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class FontLevel extends Message<FontLevel, C15384a> {
        public static final ProtoAdapter<FontLevel> ADAPTER = new C15385b();
        public static final Integer DEFAULT_LEVEL = 0;
        public static final FontType DEFAULT_TYPE = FontType.CAPTION;
        private static final long serialVersionUID = 0;
        public final Integer level;
        public final FontType type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$FontLevel$b */
        private static final class C15385b extends ProtoAdapter<FontLevel> {
            C15385b() {
                super(FieldEncoding.LENGTH_DELIMITED, FontLevel.class);
            }

            /* renamed from: a */
            public int encodedSize(FontLevel fontLevel) {
                int i;
                int i2 = 0;
                if (fontLevel.type != null) {
                    i = FontType.ADAPTER.encodedSizeWithTag(1, fontLevel.type);
                } else {
                    i = 0;
                }
                if (fontLevel.level != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, fontLevel.level);
                }
                return i + i2 + fontLevel.unknownFields().size();
            }

            /* renamed from: a */
            public FontLevel decode(ProtoReader protoReader) throws IOException {
                C15384a aVar = new C15384a();
                aVar.f40704a = FontType.CAPTION;
                aVar.f40705b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40704a = FontType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40705b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FontLevel fontLevel) throws IOException {
                if (fontLevel.type != null) {
                    FontType.ADAPTER.encodeWithTag(protoWriter, 1, fontLevel.type);
                }
                if (fontLevel.level != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, fontLevel.level);
                }
                protoWriter.writeBytes(fontLevel.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$FontLevel$a */
        public static final class C15384a extends Message.Builder<FontLevel, C15384a> {

            /* renamed from: a */
            public FontType f40704a;

            /* renamed from: b */
            public Integer f40705b;

            /* renamed from: a */
            public FontLevel build() {
                return new FontLevel(this.f40704a, this.f40705b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15384a newBuilder() {
            C15384a aVar = new C15384a();
            aVar.f40704a = this.type;
            aVar.f40705b = this.level;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "FontLevel");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.level != null) {
                sb.append(", level=");
                sb.append(this.level);
            }
            StringBuilder replace = sb.replace(0, 2, "FontLevel{");
            replace.append('}');
            return replace.toString();
        }

        public FontLevel(FontType fontType, Integer num) {
            this(fontType, num, ByteString.EMPTY);
        }

        public FontLevel(FontType fontType, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = fontType;
            this.level = num;
        }
    }

    public static final class IconButtonProperty extends Message<IconButtonProperty, C15386a> {
        public static final ProtoAdapter<IconButtonProperty> ADAPTER = new C15387b();
        public static final Boolean DEFAULT_IS_DISABLE = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final String alt;
        public final ImageSet icon;
        public final Boolean is_disable;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$IconButtonProperty$b */
        private static final class C15387b extends ProtoAdapter<IconButtonProperty> {
            C15387b() {
                super(FieldEncoding.LENGTH_DELIMITED, IconButtonProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(IconButtonProperty iconButtonProperty) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (iconButtonProperty.icon != null) {
                    i = ImageSet.ADAPTER.encodedSizeWithTag(1, iconButtonProperty.icon);
                } else {
                    i = 0;
                }
                if (iconButtonProperty.action_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, iconButtonProperty.action_id);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (iconButtonProperty.is_disable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, iconButtonProperty.is_disable);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (iconButtonProperty.alt != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, iconButtonProperty.alt);
                }
                return i6 + i4 + iconButtonProperty.unknownFields().size();
            }

            /* renamed from: a */
            public IconButtonProperty decode(ProtoReader protoReader) throws IOException {
                C15386a aVar = new C15386a();
                aVar.f40707b = "";
                aVar.f40708c = false;
                aVar.f40709d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40706a = ImageSet.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40707b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40708c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40709d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, IconButtonProperty iconButtonProperty) throws IOException {
                if (iconButtonProperty.icon != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 1, iconButtonProperty.icon);
                }
                if (iconButtonProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, iconButtonProperty.action_id);
                }
                if (iconButtonProperty.is_disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, iconButtonProperty.is_disable);
                }
                if (iconButtonProperty.alt != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, iconButtonProperty.alt);
                }
                protoWriter.writeBytes(iconButtonProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$IconButtonProperty$a */
        public static final class C15386a extends Message.Builder<IconButtonProperty, C15386a> {

            /* renamed from: a */
            public ImageSet f40706a;

            /* renamed from: b */
            public String f40707b;

            /* renamed from: c */
            public Boolean f40708c;

            /* renamed from: d */
            public String f40709d;

            /* renamed from: a */
            public IconButtonProperty build() {
                return new IconButtonProperty(this.f40706a, this.f40707b, this.f40708c, this.f40709d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15386a newBuilder() {
            C15386a aVar = new C15386a();
            aVar.f40706a = this.icon;
            aVar.f40707b = this.action_id;
            aVar.f40708c = this.is_disable;
            aVar.f40709d = this.alt;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "IconButtonProperty");
            StringBuilder sb = new StringBuilder();
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.is_disable != null) {
                sb.append(", is_disable=");
                sb.append(this.is_disable);
            }
            if (this.alt != null) {
                sb.append(", alt=");
                sb.append(this.alt);
            }
            StringBuilder replace = sb.replace(0, 2, "IconButtonProperty{");
            replace.append('}');
            return replace.toString();
        }

        public IconButtonProperty(ImageSet imageSet, String str, Boolean bool, String str2) {
            this(imageSet, str, bool, str2, ByteString.EMPTY);
        }

        public IconButtonProperty(ImageSet imageSet, String str, Boolean bool, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.icon = imageSet;
            this.action_id = str;
            this.is_disable = bool;
            this.alt = str2;
        }
    }

    public static final class ImageProperty extends Message<ImageProperty, C15388a> {
        public static final ProtoAdapter<ImageProperty> ADAPTER = new C15389b();
        private static final long serialVersionUID = 0;
        public final String alt;
        public final ImageSet image;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ImageProperty$b */
        private static final class C15389b extends ProtoAdapter<ImageProperty> {
            C15389b() {
                super(FieldEncoding.LENGTH_DELIMITED, ImageProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ImageProperty imageProperty) {
                int i;
                int i2 = 0;
                if (imageProperty.image != null) {
                    i = ImageSet.ADAPTER.encodedSizeWithTag(1, imageProperty.image);
                } else {
                    i = 0;
                }
                if (imageProperty.alt != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, imageProperty.alt);
                }
                return i + i2 + imageProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ImageProperty decode(ProtoReader protoReader) throws IOException {
                C15388a aVar = new C15388a();
                aVar.f40711b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40710a = ImageSet.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40711b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ImageProperty imageProperty) throws IOException {
                if (imageProperty.image != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 1, imageProperty.image);
                }
                if (imageProperty.alt != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageProperty.alt);
                }
                protoWriter.writeBytes(imageProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$ImageProperty$a */
        public static final class C15388a extends Message.Builder<ImageProperty, C15388a> {

            /* renamed from: a */
            public ImageSet f40710a;

            /* renamed from: b */
            public String f40711b;

            /* renamed from: a */
            public ImageProperty build() {
                return new ImageProperty(this.f40710a, this.f40711b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15388a newBuilder() {
            C15388a aVar = new C15388a();
            aVar.f40710a = this.image;
            aVar.f40711b = this.alt;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ImageProperty");
            StringBuilder sb = new StringBuilder();
            if (this.image != null) {
                sb.append(", image=");
                sb.append(this.image);
            }
            if (this.alt != null) {
                sb.append(", alt=");
                sb.append(this.alt);
            }
            StringBuilder replace = sb.replace(0, 2, "ImageProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ImageProperty(ImageSet imageSet, String str) {
            this(imageSet, str, ByteString.EMPTY);
        }

        public ImageProperty(ImageSet imageSet, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.image = imageSet;
            this.alt = str;
        }
    }

    public static final class Item extends Message<Item, C15390a> {
        public static final ProtoAdapter<Item> ADAPTER = new C15391b();
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final String text;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$Item$b */
        private static final class C15391b extends ProtoAdapter<Item> {
            C15391b() {
                super(FieldEncoding.LENGTH_DELIMITED, Item.class);
            }

            /* renamed from: a */
            public int encodedSize(Item item) {
                int i;
                int i2 = 0;
                if (item.action_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, item.action_id);
                } else {
                    i = 0;
                }
                if (item.text != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, item.text);
                }
                return i + i2 + item.unknownFields().size();
            }

            /* renamed from: a */
            public Item decode(ProtoReader protoReader) throws IOException {
                C15390a aVar = new C15390a();
                aVar.f40712a = "";
                aVar.f40713b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40712a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40713b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Item item) throws IOException {
                if (item.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, item.action_id);
                }
                if (item.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, item.text);
                }
                protoWriter.writeBytes(item.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$Item$a */
        public static final class C15390a extends Message.Builder<Item, C15390a> {

            /* renamed from: a */
            public String f40712a;

            /* renamed from: b */
            public String f40713b;

            /* renamed from: a */
            public Item build() {
                return new Item(this.f40712a, this.f40713b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15390a newBuilder() {
            C15390a aVar = new C15390a();
            aVar.f40712a = this.action_id;
            aVar.f40713b = this.text;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Item");
            StringBuilder sb = new StringBuilder();
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            StringBuilder replace = sb.replace(0, 2, "Item{");
            replace.append('}');
            return replace.toString();
        }

        public Item(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public Item(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.action_id = str;
            this.text = str2;
        }
    }

    public static final class LinearLayoutProperty extends Message<LinearLayoutProperty, C15392a> {
        public static final ProtoAdapter<LinearLayoutProperty> ADAPTER = new C15393b();
        public static final Align DEFAULT_CROSS_AXIS_ALIGN = Align.TOP;
        public static final Justify DEFAULT_MAIN_AXIS_JUSTIFY = Justify.START;
        public static final Orientation DEFAULT_ORIENTATION = Orientation.ROW;
        public static final Float DEFAULT_PADDING;
        public static final Float DEFAULT_SPACING;
        public static final Float DEFAULT_WRAP_WIDTH;
        private static final long serialVersionUID = 0;
        public final Align cross_axis_align;
        public final Justify main_axis_justify;
        public final Orientation orientation;
        public final Float padding;
        public final Float spacing;
        public final Float wrap_width;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$LinearLayoutProperty$b */
        private static final class C15393b extends ProtoAdapter<LinearLayoutProperty> {
            C15393b() {
                super(FieldEncoding.LENGTH_DELIMITED, LinearLayoutProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(LinearLayoutProperty linearLayoutProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (linearLayoutProperty.orientation != null) {
                    i = Orientation.ADAPTER.encodedSizeWithTag(1, linearLayoutProperty.orientation);
                } else {
                    i = 0;
                }
                if (linearLayoutProperty.spacing != null) {
                    i2 = ProtoAdapter.FLOAT.encodedSizeWithTag(2, linearLayoutProperty.spacing);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (linearLayoutProperty.wrap_width != null) {
                    i3 = ProtoAdapter.FLOAT.encodedSizeWithTag(3, linearLayoutProperty.wrap_width);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (linearLayoutProperty.padding != null) {
                    i4 = ProtoAdapter.FLOAT.encodedSizeWithTag(4, linearLayoutProperty.padding);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (linearLayoutProperty.main_axis_justify != null) {
                    i5 = Justify.ADAPTER.encodedSizeWithTag(5, linearLayoutProperty.main_axis_justify);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (linearLayoutProperty.cross_axis_align != null) {
                    i6 = Align.ADAPTER.encodedSizeWithTag(6, linearLayoutProperty.cross_axis_align);
                }
                return i10 + i6 + linearLayoutProperty.unknownFields().size();
            }

            /* renamed from: a */
            public LinearLayoutProperty decode(ProtoReader protoReader) throws IOException {
                C15392a aVar = new C15392a();
                aVar.f40714a = Orientation.ROW;
                Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                aVar.f40715b = valueOf;
                aVar.f40716c = valueOf;
                aVar.f40717d = valueOf;
                aVar.f40718e = Justify.START;
                aVar.f40719f = Align.TOP;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f40714a = Orientation.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f40715b = ProtoAdapter.FLOAT.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40716c = ProtoAdapter.FLOAT.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40717d = ProtoAdapter.FLOAT.decode(protoReader);
                                break;
                            case 5:
                                try {
                                    aVar.f40718e = Justify.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 6:
                                try {
                                    aVar.f40719f = Align.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
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
            public void encode(ProtoWriter protoWriter, LinearLayoutProperty linearLayoutProperty) throws IOException {
                if (linearLayoutProperty.orientation != null) {
                    Orientation.ADAPTER.encodeWithTag(protoWriter, 1, linearLayoutProperty.orientation);
                }
                if (linearLayoutProperty.spacing != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, linearLayoutProperty.spacing);
                }
                if (linearLayoutProperty.wrap_width != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, linearLayoutProperty.wrap_width);
                }
                if (linearLayoutProperty.padding != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, linearLayoutProperty.padding);
                }
                if (linearLayoutProperty.main_axis_justify != null) {
                    Justify.ADAPTER.encodeWithTag(protoWriter, 5, linearLayoutProperty.main_axis_justify);
                }
                if (linearLayoutProperty.cross_axis_align != null) {
                    Align.ADAPTER.encodeWithTag(protoWriter, 6, linearLayoutProperty.cross_axis_align);
                }
                protoWriter.writeBytes(linearLayoutProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$LinearLayoutProperty$a */
        public static final class C15392a extends Message.Builder<LinearLayoutProperty, C15392a> {

            /* renamed from: a */
            public Orientation f40714a;

            /* renamed from: b */
            public Float f40715b;

            /* renamed from: c */
            public Float f40716c;

            /* renamed from: d */
            public Float f40717d;

            /* renamed from: e */
            public Justify f40718e;

            /* renamed from: f */
            public Align f40719f;

            /* renamed from: a */
            public LinearLayoutProperty build() {
                return new LinearLayoutProperty(this.f40714a, this.f40715b, this.f40716c, this.f40717d, this.f40718e, this.f40719f, super.buildUnknownFields());
            }
        }

        static {
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            DEFAULT_SPACING = valueOf;
            DEFAULT_WRAP_WIDTH = valueOf;
            DEFAULT_PADDING = valueOf;
        }

        @Override // com.squareup.wire.Message
        public C15392a newBuilder() {
            C15392a aVar = new C15392a();
            aVar.f40714a = this.orientation;
            aVar.f40715b = this.spacing;
            aVar.f40716c = this.wrap_width;
            aVar.f40717d = this.padding;
            aVar.f40718e = this.main_axis_justify;
            aVar.f40719f = this.cross_axis_align;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "LinearLayoutProperty");
            StringBuilder sb = new StringBuilder();
            if (this.orientation != null) {
                sb.append(", orientation=");
                sb.append(this.orientation);
            }
            if (this.spacing != null) {
                sb.append(", spacing=");
                sb.append(this.spacing);
            }
            if (this.wrap_width != null) {
                sb.append(", wrap_width=");
                sb.append(this.wrap_width);
            }
            if (this.padding != null) {
                sb.append(", padding=");
                sb.append(this.padding);
            }
            if (this.main_axis_justify != null) {
                sb.append(", main_axis_justify=");
                sb.append(this.main_axis_justify);
            }
            if (this.cross_axis_align != null) {
                sb.append(", cross_axis_align=");
                sb.append(this.cross_axis_align);
            }
            StringBuilder replace = sb.replace(0, 2, "LinearLayoutProperty{");
            replace.append('}');
            return replace.toString();
        }

        public LinearLayoutProperty(Orientation orientation2, Float f, Float f2, Float f3, Justify justify, Align align) {
            this(orientation2, f, f2, f3, justify, align, ByteString.EMPTY);
        }

        public LinearLayoutProperty(Orientation orientation2, Float f, Float f2, Float f3, Justify justify, Align align, ByteString byteString) {
            super(ADAPTER, byteString);
            this.orientation = orientation2;
            this.spacing = f;
            this.wrap_width = f2;
            this.padding = f3;
            this.main_axis_justify = justify;
            this.cross_axis_align = align;
        }
    }

    public static final class RichTextProperty extends Message<RichTextProperty, C15396a> {
        public static final ProtoAdapter<RichTextProperty> ADAPTER = new C15397b();
        private static final long serialVersionUID = 0;
        public final RichText richtext;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$RichTextProperty$b */
        private static final class C15397b extends ProtoAdapter<RichTextProperty> {
            C15397b() {
                super(FieldEncoding.LENGTH_DELIMITED, RichTextProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(RichTextProperty richTextProperty) {
                int i;
                if (richTextProperty.richtext != null) {
                    i = RichText.ADAPTER.encodedSizeWithTag(1, richTextProperty.richtext);
                } else {
                    i = 0;
                }
                return i + richTextProperty.unknownFields().size();
            }

            /* renamed from: a */
            public RichTextProperty decode(ProtoReader protoReader) throws IOException {
                C15396a aVar = new C15396a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40733a = RichText.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RichTextProperty richTextProperty) throws IOException {
                if (richTextProperty.richtext != null) {
                    RichText.ADAPTER.encodeWithTag(protoWriter, 1, richTextProperty.richtext);
                }
                protoWriter.writeBytes(richTextProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$RichTextProperty$a */
        public static final class C15396a extends Message.Builder<RichTextProperty, C15396a> {

            /* renamed from: a */
            public RichText f40733a;

            /* renamed from: a */
            public RichTextProperty build() {
                return new RichTextProperty(this.f40733a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15396a newBuilder() {
            C15396a aVar = new C15396a();
            aVar.f40733a = this.richtext;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "RichTextProperty");
            StringBuilder sb = new StringBuilder();
            if (this.richtext != null) {
                sb.append(", richtext=");
                sb.append(this.richtext);
            }
            StringBuilder replace = sb.replace(0, 2, "RichTextProperty{");
            replace.append('}');
            return replace.toString();
        }

        public RichTextProperty(RichText richText) {
            this(richText, ByteString.EMPTY);
        }

        public RichTextProperty(RichText richText, ByteString byteString) {
            super(ADAPTER, byteString);
            this.richtext = richText;
        }
    }

    public static final class SpinButtonProperty extends Message<SpinButtonProperty, C15398a> {
        public static final ProtoAdapter<SpinButtonProperty> ADAPTER = new C15399b();
        public static final Direction DEFAULT_DIRECTION = Direction.LTR;
        public static final Long DEFAULT_SELECTED_INDEX = 0L;
        private static final long serialVersionUID = 0;
        public final Direction direction;
        public final ImageSet icon;
        public final List<Item> items;
        public final Long selected_index;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$SpinButtonProperty$b */
        private static final class C15399b extends ProtoAdapter<SpinButtonProperty> {
            C15399b() {
                super(FieldEncoding.LENGTH_DELIMITED, SpinButtonProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(SpinButtonProperty spinButtonProperty) {
                int i;
                int i2;
                int i3 = 0;
                if (spinButtonProperty.icon != null) {
                    i = ImageSet.ADAPTER.encodedSizeWithTag(1, spinButtonProperty.icon);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + Item.ADAPTER.asRepeated().encodedSizeWithTag(2, spinButtonProperty.items);
                if (spinButtonProperty.selected_index != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, spinButtonProperty.selected_index);
                } else {
                    i2 = 0;
                }
                int i4 = encodedSizeWithTag + i2;
                if (spinButtonProperty.direction != null) {
                    i3 = Direction.ADAPTER.encodedSizeWithTag(4, spinButtonProperty.direction);
                }
                return i4 + i3 + spinButtonProperty.unknownFields().size();
            }

            /* renamed from: a */
            public SpinButtonProperty decode(ProtoReader protoReader) throws IOException {
                C15398a aVar = new C15398a();
                aVar.f40736c = 0L;
                aVar.f40737d = Direction.LTR;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40734a = ImageSet.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40735b.add(Item.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f40736c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f40737d = Direction.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SpinButtonProperty spinButtonProperty) throws IOException {
                if (spinButtonProperty.icon != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 1, spinButtonProperty.icon);
                }
                Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, spinButtonProperty.items);
                if (spinButtonProperty.selected_index != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, spinButtonProperty.selected_index);
                }
                if (spinButtonProperty.direction != null) {
                    Direction.ADAPTER.encodeWithTag(protoWriter, 4, spinButtonProperty.direction);
                }
                protoWriter.writeBytes(spinButtonProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$SpinButtonProperty$a */
        public static final class C15398a extends Message.Builder<SpinButtonProperty, C15398a> {

            /* renamed from: a */
            public ImageSet f40734a;

            /* renamed from: b */
            public List<Item> f40735b = Internal.newMutableList();

            /* renamed from: c */
            public Long f40736c;

            /* renamed from: d */
            public Direction f40737d;

            /* renamed from: a */
            public SpinButtonProperty build() {
                return new SpinButtonProperty(this.f40734a, this.f40735b, this.f40736c, this.f40737d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15398a newBuilder() {
            C15398a aVar = new C15398a();
            aVar.f40734a = this.icon;
            aVar.f40735b = Internal.copyOf("items", this.items);
            aVar.f40736c = this.selected_index;
            aVar.f40737d = this.direction;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SpinButtonProperty");
            StringBuilder sb = new StringBuilder();
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (!this.items.isEmpty()) {
                sb.append(", items=");
                sb.append(this.items);
            }
            if (this.selected_index != null) {
                sb.append(", selected_index=");
                sb.append(this.selected_index);
            }
            if (this.direction != null) {
                sb.append(", direction=");
                sb.append(this.direction);
            }
            StringBuilder replace = sb.replace(0, 2, "SpinButtonProperty{");
            replace.append('}');
            return replace.toString();
        }

        public SpinButtonProperty(ImageSet imageSet, List<Item> list, Long l, Direction direction2) {
            this(imageSet, list, l, direction2, ByteString.EMPTY);
        }

        public SpinButtonProperty(ImageSet imageSet, List<Item> list, Long l, Direction direction2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.icon = imageSet;
            this.items = Internal.immutableCopyOf("items", list);
            this.selected_index = l;
            this.direction = direction2;
        }
    }

    public static final class Style extends Message<Style, C15400a> {
        public static final ProtoAdapter<Style> ADAPTER = new C15401b();
        public static final Integer DEFAULT_GROW_WEIGHT = 0;
        public static final Integer DEFAULT_SHRINK_WEIGHT = 0;
        public static final SizeLevel DEFAULT_SIZE_LEVEL = SizeLevel.NORMAL;
        private static final long serialVersionUID = 0;
        public final Gradient background_color;
        public final Border border;
        public final FontLevel font_level;
        public final Integer grow_weight;
        public final Value height;
        public final Value max_height;
        public final Value max_width;
        public final Value min_height;
        public final Value min_width;
        public final Integer shrink_weight;
        public final SizeLevel size_level;
        public final ThemeColor text_color_v2;
        public final Value width;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$Style$b */
        private static final class C15401b extends ProtoAdapter<Style> {
            C15401b() {
                super(FieldEncoding.LENGTH_DELIMITED, Style.class);
            }

            /* renamed from: a */
            public int encodedSize(Style style) {
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
                int i13 = 0;
                if (style.size_level != null) {
                    i = SizeLevel.ADAPTER.encodedSizeWithTag(1, style.size_level);
                } else {
                    i = 0;
                }
                if (style.text_color_v2 != null) {
                    i2 = ThemeColor.ADAPTER.encodedSizeWithTag(14, style.text_color_v2);
                } else {
                    i2 = 0;
                }
                int i14 = i + i2;
                if (style.background_color != null) {
                    i3 = Gradient.ADAPTER.encodedSizeWithTag(3, style.background_color);
                } else {
                    i3 = 0;
                }
                int i15 = i14 + i3;
                if (style.width != null) {
                    i4 = Value.ADAPTER.encodedSizeWithTag(4, style.width);
                } else {
                    i4 = 0;
                }
                int i16 = i15 + i4;
                if (style.height != null) {
                    i5 = Value.ADAPTER.encodedSizeWithTag(5, style.height);
                } else {
                    i5 = 0;
                }
                int i17 = i16 + i5;
                if (style.max_width != null) {
                    i6 = Value.ADAPTER.encodedSizeWithTag(6, style.max_width);
                } else {
                    i6 = 0;
                }
                int i18 = i17 + i6;
                if (style.max_height != null) {
                    i7 = Value.ADAPTER.encodedSizeWithTag(7, style.max_height);
                } else {
                    i7 = 0;
                }
                int i19 = i18 + i7;
                if (style.min_width != null) {
                    i8 = Value.ADAPTER.encodedSizeWithTag(8, style.min_width);
                } else {
                    i8 = 0;
                }
                int i20 = i19 + i8;
                if (style.min_height != null) {
                    i9 = Value.ADAPTER.encodedSizeWithTag(9, style.min_height);
                } else {
                    i9 = 0;
                }
                int i21 = i20 + i9;
                if (style.grow_weight != null) {
                    i10 = ProtoAdapter.INT32.encodedSizeWithTag(10, style.grow_weight);
                } else {
                    i10 = 0;
                }
                int i22 = i21 + i10;
                if (style.shrink_weight != null) {
                    i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, style.shrink_weight);
                } else {
                    i11 = 0;
                }
                int i23 = i22 + i11;
                if (style.font_level != null) {
                    i12 = FontLevel.ADAPTER.encodedSizeWithTag(12, style.font_level);
                } else {
                    i12 = 0;
                }
                int i24 = i23 + i12;
                if (style.border != null) {
                    i13 = Border.ADAPTER.encodedSizeWithTag(13, style.border);
                }
                return i24 + i13 + style.unknownFields().size();
            }

            /* renamed from: a */
            public Style decode(ProtoReader protoReader) throws IOException {
                C15400a aVar = new C15400a();
                aVar.f40738a = SizeLevel.NORMAL;
                aVar.f40747j = 0;
                aVar.f40748k = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f40738a = SizeLevel.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case 3:
                                aVar.f40740c = Gradient.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40741d = Value.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40742e = Value.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40743f = Value.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40744g = Value.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40745h = Value.ADAPTER.decode(protoReader);
                                break;
                            case 9:
                                aVar.f40746i = Value.ADAPTER.decode(protoReader);
                                break;
                            case 10:
                                aVar.f40747j = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 11:
                                aVar.f40748k = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f40749l = FontLevel.ADAPTER.decode(protoReader);
                                break;
                            case 13:
                                aVar.f40750m = Border.ADAPTER.decode(protoReader);
                                break;
                            case 14:
                                aVar.f40739b = ThemeColor.ADAPTER.decode(protoReader);
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Style style) throws IOException {
                if (style.size_level != null) {
                    SizeLevel.ADAPTER.encodeWithTag(protoWriter, 1, style.size_level);
                }
                if (style.text_color_v2 != null) {
                    ThemeColor.ADAPTER.encodeWithTag(protoWriter, 14, style.text_color_v2);
                }
                if (style.background_color != null) {
                    Gradient.ADAPTER.encodeWithTag(protoWriter, 3, style.background_color);
                }
                if (style.width != null) {
                    Value.ADAPTER.encodeWithTag(protoWriter, 4, style.width);
                }
                if (style.height != null) {
                    Value.ADAPTER.encodeWithTag(protoWriter, 5, style.height);
                }
                if (style.max_width != null) {
                    Value.ADAPTER.encodeWithTag(protoWriter, 6, style.max_width);
                }
                if (style.max_height != null) {
                    Value.ADAPTER.encodeWithTag(protoWriter, 7, style.max_height);
                }
                if (style.min_width != null) {
                    Value.ADAPTER.encodeWithTag(protoWriter, 8, style.min_width);
                }
                if (style.min_height != null) {
                    Value.ADAPTER.encodeWithTag(protoWriter, 9, style.min_height);
                }
                if (style.grow_weight != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, style.grow_weight);
                }
                if (style.shrink_weight != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, style.shrink_weight);
                }
                if (style.font_level != null) {
                    FontLevel.ADAPTER.encodeWithTag(protoWriter, 12, style.font_level);
                }
                if (style.border != null) {
                    Border.ADAPTER.encodeWithTag(protoWriter, 13, style.border);
                }
                protoWriter.writeBytes(style.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$Style$a */
        public static final class C15400a extends Message.Builder<Style, C15400a> {

            /* renamed from: a */
            public SizeLevel f40738a;

            /* renamed from: b */
            public ThemeColor f40739b;

            /* renamed from: c */
            public Gradient f40740c;

            /* renamed from: d */
            public Value f40741d;

            /* renamed from: e */
            public Value f40742e;

            /* renamed from: f */
            public Value f40743f;

            /* renamed from: g */
            public Value f40744g;

            /* renamed from: h */
            public Value f40745h;

            /* renamed from: i */
            public Value f40746i;

            /* renamed from: j */
            public Integer f40747j;

            /* renamed from: k */
            public Integer f40748k;

            /* renamed from: l */
            public FontLevel f40749l;

            /* renamed from: m */
            public Border f40750m;

            /* renamed from: a */
            public Style build() {
                return new Style(this.f40738a, this.f40739b, this.f40740c, this.f40741d, this.f40742e, this.f40743f, this.f40744g, this.f40745h, this.f40746i, this.f40747j, this.f40748k, this.f40749l, this.f40750m, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15400a newBuilder() {
            C15400a aVar = new C15400a();
            aVar.f40738a = this.size_level;
            aVar.f40739b = this.text_color_v2;
            aVar.f40740c = this.background_color;
            aVar.f40741d = this.width;
            aVar.f40742e = this.height;
            aVar.f40743f = this.max_width;
            aVar.f40744g = this.max_height;
            aVar.f40745h = this.min_width;
            aVar.f40746i = this.min_height;
            aVar.f40747j = this.grow_weight;
            aVar.f40748k = this.shrink_weight;
            aVar.f40749l = this.font_level;
            aVar.f40750m = this.border;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Style");
            StringBuilder sb = new StringBuilder();
            if (this.size_level != null) {
                sb.append(", size_level=");
                sb.append(this.size_level);
            }
            if (this.text_color_v2 != null) {
                sb.append(", text_color_v2=");
                sb.append(this.text_color_v2);
            }
            if (this.background_color != null) {
                sb.append(", background_color=");
                sb.append(this.background_color);
            }
            if (this.width != null) {
                sb.append(", width=");
                sb.append(this.width);
            }
            if (this.height != null) {
                sb.append(", height=");
                sb.append(this.height);
            }
            if (this.max_width != null) {
                sb.append(", max_width=");
                sb.append(this.max_width);
            }
            if (this.max_height != null) {
                sb.append(", max_height=");
                sb.append(this.max_height);
            }
            if (this.min_width != null) {
                sb.append(", min_width=");
                sb.append(this.min_width);
            }
            if (this.min_height != null) {
                sb.append(", min_height=");
                sb.append(this.min_height);
            }
            if (this.grow_weight != null) {
                sb.append(", grow_weight=");
                sb.append(this.grow_weight);
            }
            if (this.shrink_weight != null) {
                sb.append(", shrink_weight=");
                sb.append(this.shrink_weight);
            }
            if (this.font_level != null) {
                sb.append(", font_level=");
                sb.append(this.font_level);
            }
            if (this.border != null) {
                sb.append(", border=");
                sb.append(this.border);
            }
            StringBuilder replace = sb.replace(0, 2, "Style{");
            replace.append('}');
            return replace.toString();
        }

        public Style(SizeLevel sizeLevel, ThemeColor themeColor, Gradient gradient, Value value, Value value2, Value value3, Value value4, Value value5, Value value6, Integer num, Integer num2, FontLevel fontLevel, Border border2) {
            this(sizeLevel, themeColor, gradient, value, value2, value3, value4, value5, value6, num, num2, fontLevel, border2, ByteString.EMPTY);
        }

        public Style(SizeLevel sizeLevel, ThemeColor themeColor, Gradient gradient, Value value, Value value2, Value value3, Value value4, Value value5, Value value6, Integer num, Integer num2, FontLevel fontLevel, Border border2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.size_level = sizeLevel;
            this.text_color_v2 = themeColor;
            this.background_color = gradient;
            this.width = value;
            this.height = value2;
            this.max_width = value3;
            this.max_height = value4;
            this.min_width = value5;
            this.min_height = value6;
            this.grow_weight = num;
            this.shrink_weight = num2;
            this.font_level = fontLevel;
            this.border = border2;
        }
    }

    public static final class TagListProperty extends Message<TagListProperty, C15402a> {
        public static final ProtoAdapter<TagListProperty> ADAPTER = new C15403b();
        private static final long serialVersionUID = 0;
        public final List<String> tags;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TagListProperty$b */
        private static final class C15403b extends ProtoAdapter<TagListProperty> {
            C15403b() {
                super(FieldEncoding.LENGTH_DELIMITED, TagListProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TagListProperty tagListProperty) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, tagListProperty.tags) + tagListProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TagListProperty decode(ProtoReader protoReader) throws IOException {
                C15402a aVar = new C15402a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40751a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TagListProperty tagListProperty) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, tagListProperty.tags);
                protoWriter.writeBytes(tagListProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TagListProperty$a */
        public static final class C15402a extends Message.Builder<TagListProperty, C15402a> {

            /* renamed from: a */
            public List<String> f40751a = Internal.newMutableList();

            /* renamed from: a */
            public TagListProperty build() {
                return new TagListProperty(this.f40751a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15402a newBuilder() {
            C15402a aVar = new C15402a();
            aVar.f40751a = Internal.copyOf("tags", this.tags);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TagListProperty");
            StringBuilder sb = new StringBuilder();
            if (!this.tags.isEmpty()) {
                sb.append(", tags=");
                sb.append(this.tags);
            }
            StringBuilder replace = sb.replace(0, 2, "TagListProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TagListProperty(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public TagListProperty(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.tags = Internal.immutableCopyOf("tags", list);
        }
    }

    public static final class TextButtonProperty extends Message<TextButtonProperty, C15404a> {
        public static final ProtoAdapter<TextButtonProperty> ADAPTER = new C15405b();
        public static final Boolean DEFAULT_IS_DISABLE = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final Boolean is_disable;
        public final String text;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TextButtonProperty$b */
        private static final class C15405b extends ProtoAdapter<TextButtonProperty> {
            C15405b() {
                super(FieldEncoding.LENGTH_DELIMITED, TextButtonProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TextButtonProperty textButtonProperty) {
                int i;
                int i2;
                int i3 = 0;
                if (textButtonProperty.text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, textButtonProperty.text);
                } else {
                    i = 0;
                }
                if (textButtonProperty.action_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, textButtonProperty.action_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (textButtonProperty.is_disable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, textButtonProperty.is_disable);
                }
                return i4 + i3 + textButtonProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TextButtonProperty decode(ProtoReader protoReader) throws IOException {
                C15404a aVar = new C15404a();
                aVar.f40752a = "";
                aVar.f40753b = "";
                aVar.f40754c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40752a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40753b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40754c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TextButtonProperty textButtonProperty) throws IOException {
                if (textButtonProperty.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textButtonProperty.text);
                }
                if (textButtonProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, textButtonProperty.action_id);
                }
                if (textButtonProperty.is_disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, textButtonProperty.is_disable);
                }
                protoWriter.writeBytes(textButtonProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TextButtonProperty$a */
        public static final class C15404a extends Message.Builder<TextButtonProperty, C15404a> {

            /* renamed from: a */
            public String f40752a;

            /* renamed from: b */
            public String f40753b;

            /* renamed from: c */
            public Boolean f40754c;

            /* renamed from: a */
            public TextButtonProperty build() {
                return new TextButtonProperty(this.f40752a, this.f40753b, this.f40754c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15404a newBuilder() {
            C15404a aVar = new C15404a();
            aVar.f40752a = this.text;
            aVar.f40753b = this.action_id;
            aVar.f40754c = this.is_disable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TextButtonProperty");
            StringBuilder sb = new StringBuilder();
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.is_disable != null) {
                sb.append(", is_disable=");
                sb.append(this.is_disable);
            }
            StringBuilder replace = sb.replace(0, 2, "TextButtonProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TextButtonProperty(String str, String str2, Boolean bool) {
            this(str, str2, bool, ByteString.EMPTY);
        }

        public TextButtonProperty(String str, String str2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = str;
            this.action_id = str2;
            this.is_disable = bool;
        }
    }

    public static final class TextProperty extends Message<TextProperty, C15406a> {
        public static final ProtoAdapter<TextProperty> ADAPTER = new C15407b();
        public static final Integer DEFAULT_NUMBER_OF_LINES = 0;
        private static final long serialVersionUID = 0;
        public final Integer number_of_lines;
        public final String text;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TextProperty$b */
        private static final class C15407b extends ProtoAdapter<TextProperty> {
            C15407b() {
                super(FieldEncoding.LENGTH_DELIMITED, TextProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TextProperty textProperty) {
                int i;
                int i2 = 0;
                if (textProperty.text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, textProperty.text);
                } else {
                    i = 0;
                }
                if (textProperty.number_of_lines != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, textProperty.number_of_lines);
                }
                return i + i2 + textProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TextProperty decode(ProtoReader protoReader) throws IOException {
                C15406a aVar = new C15406a();
                aVar.f40755a = "";
                aVar.f40756b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40755a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40756b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TextProperty textProperty) throws IOException {
                if (textProperty.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textProperty.text);
                }
                if (textProperty.number_of_lines != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, textProperty.number_of_lines);
                }
                protoWriter.writeBytes(textProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TextProperty$a */
        public static final class C15406a extends Message.Builder<TextProperty, C15406a> {

            /* renamed from: a */
            public String f40755a;

            /* renamed from: b */
            public Integer f40756b;

            /* renamed from: a */
            public TextProperty build() {
                return new TextProperty(this.f40755a, this.f40756b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15406a newBuilder() {
            C15406a aVar = new C15406a();
            aVar.f40755a = this.text;
            aVar.f40756b = this.number_of_lines;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TextProperty");
            StringBuilder sb = new StringBuilder();
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.number_of_lines != null) {
                sb.append(", number_of_lines=");
                sb.append(this.number_of_lines);
            }
            StringBuilder replace = sb.replace(0, 2, "TextProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TextProperty(String str, Integer num) {
            this(str, num, ByteString.EMPTY);
        }

        public TextProperty(String str, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = str;
            this.number_of_lines = num;
        }
    }

    public static final class TimeProperty extends Message<TimeProperty, C15408a> {
        public static final ProtoAdapter<TimeProperty> ADAPTER = new C15409b();
        public static final Long DEFAULT_END_TIME_STAMP = 0L;
        public static final Boolean DEFAULT_IS_COUNTDOWN = false;
        public static final Boolean DEFAULT_IS_END = false;
        public static final Long DEFAULT_START_TIME_STAMP = 0L;
        private static final long serialVersionUID = 0;
        public final Long end_time_stamp;
        public final Boolean is_countdown;
        public final Boolean is_end;
        public final String ntp_action_id;
        public final Long start_time_stamp;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TimeProperty$b */
        private static final class C15409b extends ProtoAdapter<TimeProperty> {
            C15409b() {
                super(FieldEncoding.LENGTH_DELIMITED, TimeProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TimeProperty timeProperty) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, timeProperty.start_time_stamp);
                int i4 = 0;
                if (timeProperty.is_countdown != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(2, timeProperty.is_countdown);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (timeProperty.ntp_action_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, timeProperty.ntp_action_id);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (timeProperty.is_end != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, timeProperty.is_end);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (timeProperty.end_time_stamp != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(5, timeProperty.end_time_stamp);
                }
                return i7 + i4 + timeProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TimeProperty decode(ProtoReader protoReader) throws IOException {
                C15408a aVar = new C15408a();
                aVar.f40757a = 0L;
                aVar.f40758b = false;
                aVar.f40759c = "";
                aVar.f40760d = false;
                aVar.f40761e = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40757a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40758b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40759c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f40760d = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40761e = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TimeProperty timeProperty) throws IOException {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, timeProperty.start_time_stamp);
                if (timeProperty.is_countdown != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, timeProperty.is_countdown);
                }
                if (timeProperty.ntp_action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, timeProperty.ntp_action_id);
                }
                if (timeProperty.is_end != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, timeProperty.is_end);
                }
                if (timeProperty.end_time_stamp != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, timeProperty.end_time_stamp);
                }
                protoWriter.writeBytes(timeProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$TimeProperty$a */
        public static final class C15408a extends Message.Builder<TimeProperty, C15408a> {

            /* renamed from: a */
            public Long f40757a;

            /* renamed from: b */
            public Boolean f40758b;

            /* renamed from: c */
            public String f40759c;

            /* renamed from: d */
            public Boolean f40760d;

            /* renamed from: e */
            public Long f40761e;

            /* renamed from: a */
            public TimeProperty build() {
                Long l = this.f40757a;
                if (l != null) {
                    return new TimeProperty(l, this.f40758b, this.f40759c, this.f40760d, this.f40761e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(l, "start_time_stamp");
            }
        }

        @Override // com.squareup.wire.Message
        public C15408a newBuilder() {
            C15408a aVar = new C15408a();
            aVar.f40757a = this.start_time_stamp;
            aVar.f40758b = this.is_countdown;
            aVar.f40759c = this.ntp_action_id;
            aVar.f40760d = this.is_end;
            aVar.f40761e = this.end_time_stamp;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TimeProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", start_time_stamp=");
            sb.append(this.start_time_stamp);
            if (this.is_countdown != null) {
                sb.append(", is_countdown=");
                sb.append(this.is_countdown);
            }
            if (this.ntp_action_id != null) {
                sb.append(", ntp_action_id=");
                sb.append(this.ntp_action_id);
            }
            if (this.is_end != null) {
                sb.append(", is_end=");
                sb.append(this.is_end);
            }
            if (this.end_time_stamp != null) {
                sb.append(", end_time_stamp=");
                sb.append(this.end_time_stamp);
            }
            StringBuilder replace = sb.replace(0, 2, "TimeProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TimeProperty(Long l, Boolean bool, String str, Boolean bool2, Long l2) {
            this(l, bool, str, bool2, l2, ByteString.EMPTY);
        }

        public TimeProperty(Long l, Boolean bool, String str, Boolean bool2, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start_time_stamp = l;
            this.is_countdown = bool;
            this.ntp_action_id = str;
            this.is_end = bool2;
            this.end_time_stamp = l2;
        }
    }

    public static final class Value extends Message<Value, C15410a> {
        public static final ProtoAdapter<Value> ADAPTER = new C15411b();
        public static final ValueType DEFAULT_TYPE = ValueType.AUTO;
        public static final Float DEFAULT_VALUE = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        private static final long serialVersionUID = 0;
        public final ValueType type;
        public final Float value;

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$Value$b */
        private static final class C15411b extends ProtoAdapter<Value> {
            C15411b() {
                super(FieldEncoding.LENGTH_DELIMITED, Value.class);
            }

            /* renamed from: a */
            public int encodedSize(Value value) {
                int i;
                int i2 = 0;
                if (value.type != null) {
                    i = ValueType.ADAPTER.encodedSizeWithTag(1, value.type);
                } else {
                    i = 0;
                }
                if (value.value != null) {
                    i2 = ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.value);
                }
                return i + i2 + value.unknownFields().size();
            }

            /* renamed from: a */
            public Value decode(ProtoReader protoReader) throws IOException {
                C15410a aVar = new C15410a();
                aVar.f40762a = ValueType.AUTO;
                aVar.f40763b = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40762a = ValueType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40763b = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Value value) throws IOException {
                if (value.type != null) {
                    ValueType.ADAPTER.encodeWithTag(protoWriter, 1, value.type);
                }
                if (value.value != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, value.value);
                }
                protoWriter.writeBytes(value.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$Value$a */
        public static final class C15410a extends Message.Builder<Value, C15410a> {

            /* renamed from: a */
            public ValueType f40762a;

            /* renamed from: b */
            public Float f40763b;

            /* renamed from: a */
            public Value build() {
                return new Value(this.f40762a, this.f40763b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15410a newBuilder() {
            C15410a aVar = new C15410a();
            aVar.f40762a = this.type;
            aVar.f40763b = this.value;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Value");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.value != null) {
                sb.append(", value=");
                sb.append(this.value);
            }
            StringBuilder replace = sb.replace(0, 2, "Value{");
            replace.append('}');
            return replace.toString();
        }

        public Value(ValueType valueType, Float f) {
            this(valueType, f, ByteString.EMPTY);
        }

        public Value(ValueType valueType, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = valueType;
            this.value = f;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponent$b */
    private static final class C15415b extends ProtoAdapter<URLPreviewComponent> {
        C15415b() {
            super(FieldEncoding.LENGTH_DELIMITED, URLPreviewComponent.class);
        }

        /* renamed from: a */
        public int encodedSize(URLPreviewComponent uRLPreviewComponent) {
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
            int i15;
            int i16;
            int i17;
            int i18;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, uRLPreviewComponent.type);
            int i19 = 0;
            if (uRLPreviewComponent.can_skip_when_unknown != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, uRLPreviewComponent.can_skip_when_unknown);
            } else {
                i = 0;
            }
            int i20 = encodedSizeWithTag + i;
            if (uRLPreviewComponent.style != null) {
                i2 = Style.ADAPTER.encodedSizeWithTag(3, uRLPreviewComponent.style);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i20 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, uRLPreviewComponent.child_ids);
            if (uRLPreviewComponent.is_font_zoomable != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, uRLPreviewComponent.is_font_zoomable);
            } else {
                i3 = 0;
            }
            int i21 = encodedSizeWithTag2 + i3;
            if (uRLPreviewComponent.empty != null) {
                i4 = EmptyProperty.ADAPTER.encodedSizeWithTag(1000, uRLPreviewComponent.empty);
            } else {
                i4 = 0;
            }
            int i22 = i21 + i4;
            if (uRLPreviewComponent.linear_layout != null) {
                i5 = LinearLayoutProperty.ADAPTER.encodedSizeWithTag(CommonCode.StatusCode.API_CLIENT_EXPIRED, uRLPreviewComponent.linear_layout);
            } else {
                i5 = 0;
            }
            int i23 = i22 + i5;
            if (uRLPreviewComponent.header != null) {
                i6 = PreviewHeaderProperty.ADAPTER.encodedSizeWithTag(1501, uRLPreviewComponent.header);
            } else {
                i6 = 0;
            }
            int i24 = i23 + i6;
            if (uRLPreviewComponent.richtext != null) {
                i7 = RichTextProperty.ADAPTER.encodedSizeWithTag(1502, uRLPreviewComponent.richtext);
            } else {
                i7 = 0;
            }
            int i25 = i24 + i7;
            if (uRLPreviewComponent.image != null) {
                i8 = ImageProperty.ADAPTER.encodedSizeWithTag(1503, uRLPreviewComponent.image);
            } else {
                i8 = 0;
            }
            int i26 = i25 + i8;
            if (uRLPreviewComponent.chatters_preview != null) {
                i9 = ChattersPreviewProperty.ADAPTER.encodedSizeWithTag(1504, uRLPreviewComponent.chatters_preview);
            } else {
                i9 = 0;
            }
            int i27 = i26 + i9;
            if (uRLPreviewComponent.button != null) {
                i10 = ButtonProperty.ADAPTER.encodedSizeWithTag(1505, uRLPreviewComponent.button);
            } else {
                i10 = 0;
            }
            int i28 = i27 + i10;
            if (uRLPreviewComponent.icon_button != null) {
                i11 = IconButtonProperty.ADAPTER.encodedSizeWithTag(1506, uRLPreviewComponent.icon_button);
            } else {
                i11 = 0;
            }
            int i29 = i28 + i11;
            if (uRLPreviewComponent.text_button != null) {
                i12 = TextButtonProperty.ADAPTER.encodedSizeWithTag(1507, uRLPreviewComponent.text_button);
            } else {
                i12 = 0;
            }
            int i30 = i29 + i12;
            if (uRLPreviewComponent.time != null) {
                i13 = TimeProperty.ADAPTER.encodedSizeWithTag(1508, uRLPreviewComponent.time);
            } else {
                i13 = 0;
            }
            int i31 = i30 + i13;
            if (uRLPreviewComponent.text != null) {
                i14 = TextProperty.ADAPTER.encodedSizeWithTag(1509, uRLPreviewComponent.text);
            } else {
                i14 = 0;
            }
            int i32 = i31 + i14;
            if (uRLPreviewComponent.tag_list != null) {
                i15 = TagListProperty.ADAPTER.encodedSizeWithTag(1510, uRLPreviewComponent.tag_list);
            } else {
                i15 = 0;
            }
            int i33 = i32 + i15;
            if (uRLPreviewComponent.spin_button != null) {
                i16 = SpinButtonProperty.ADAPTER.encodedSizeWithTag(1511, uRLPreviewComponent.spin_button);
            } else {
                i16 = 0;
            }
            int i34 = i33 + i16;
            if (uRLPreviewComponent.avatar != null) {
                i17 = AvatarProperty.ADAPTER.encodedSizeWithTag(1512, uRLPreviewComponent.avatar);
            } else {
                i17 = 0;
            }
            int i35 = i34 + i17;
            if (uRLPreviewComponent.video != null) {
                i18 = VideoProperty.ADAPTER.encodedSizeWithTag(1513, uRLPreviewComponent.video);
            } else {
                i18 = 0;
            }
            int i36 = i35 + i18;
            if (uRLPreviewComponent.card_container != null) {
                i19 = CardContainerProperty.ADAPTER.encodedSizeWithTag(1514, uRLPreviewComponent.card_container);
            }
            return i36 + i19 + uRLPreviewComponent.unknownFields().size();
        }

        /* renamed from: a */
        public URLPreviewComponent decode(ProtoReader protoReader) throws IOException {
            C15414a aVar = new C15414a();
            aVar.f40770a = Type.EMPTY;
            aVar.f40771b = true;
            aVar.f40774e = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40770a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f40771b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40772c = Style.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f40773d.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 5) {
                    aVar.f40774e = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 1000) {
                    aVar.mo55901a(EmptyProperty.ADAPTER.decode(protoReader));
                } else if (nextTag != 1001) {
                    switch (nextTag) {
                        case 1501:
                            aVar.mo55905a(PreviewHeaderProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1502:
                            aVar.mo55906a(RichTextProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1503:
                            aVar.mo55903a(ImageProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1504:
                            aVar.mo55900a(ChattersPreviewProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1505:
                            aVar.mo55898a(ButtonProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1506:
                            aVar.mo55902a(IconButtonProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1507:
                            aVar.mo55909a(TextButtonProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1508:
                            aVar.mo55911a(TimeProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1509:
                            aVar.mo55910a(TextProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1510:
                            aVar.mo55908a(TagListProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1511:
                            aVar.mo55907a(SpinButtonProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1512:
                            aVar.mo55897a(AvatarProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1513:
                            aVar.mo55912a(VideoProperty.ADAPTER.decode(protoReader));
                            continue;
                        case 1514:
                            aVar.mo55899a(CardContainerProperty.ADAPTER.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.mo55904a(LinearLayoutProperty.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, URLPreviewComponent uRLPreviewComponent) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, uRLPreviewComponent.type);
            if (uRLPreviewComponent.can_skip_when_unknown != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uRLPreviewComponent.can_skip_when_unknown);
            }
            if (uRLPreviewComponent.style != null) {
                Style.ADAPTER.encodeWithTag(protoWriter, 3, uRLPreviewComponent.style);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, uRLPreviewComponent.child_ids);
            if (uRLPreviewComponent.is_font_zoomable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, uRLPreviewComponent.is_font_zoomable);
            }
            if (uRLPreviewComponent.empty != null) {
                EmptyProperty.ADAPTER.encodeWithTag(protoWriter, 1000, uRLPreviewComponent.empty);
            }
            if (uRLPreviewComponent.linear_layout != null) {
                LinearLayoutProperty.ADAPTER.encodeWithTag(protoWriter, CommonCode.StatusCode.API_CLIENT_EXPIRED, uRLPreviewComponent.linear_layout);
            }
            if (uRLPreviewComponent.header != null) {
                PreviewHeaderProperty.ADAPTER.encodeWithTag(protoWriter, 1501, uRLPreviewComponent.header);
            }
            if (uRLPreviewComponent.richtext != null) {
                RichTextProperty.ADAPTER.encodeWithTag(protoWriter, 1502, uRLPreviewComponent.richtext);
            }
            if (uRLPreviewComponent.image != null) {
                ImageProperty.ADAPTER.encodeWithTag(protoWriter, 1503, uRLPreviewComponent.image);
            }
            if (uRLPreviewComponent.chatters_preview != null) {
                ChattersPreviewProperty.ADAPTER.encodeWithTag(protoWriter, 1504, uRLPreviewComponent.chatters_preview);
            }
            if (uRLPreviewComponent.button != null) {
                ButtonProperty.ADAPTER.encodeWithTag(protoWriter, 1505, uRLPreviewComponent.button);
            }
            if (uRLPreviewComponent.icon_button != null) {
                IconButtonProperty.ADAPTER.encodeWithTag(protoWriter, 1506, uRLPreviewComponent.icon_button);
            }
            if (uRLPreviewComponent.text_button != null) {
                TextButtonProperty.ADAPTER.encodeWithTag(protoWriter, 1507, uRLPreviewComponent.text_button);
            }
            if (uRLPreviewComponent.time != null) {
                TimeProperty.ADAPTER.encodeWithTag(protoWriter, 1508, uRLPreviewComponent.time);
            }
            if (uRLPreviewComponent.text != null) {
                TextProperty.ADAPTER.encodeWithTag(protoWriter, 1509, uRLPreviewComponent.text);
            }
            if (uRLPreviewComponent.tag_list != null) {
                TagListProperty.ADAPTER.encodeWithTag(protoWriter, 1510, uRLPreviewComponent.tag_list);
            }
            if (uRLPreviewComponent.spin_button != null) {
                SpinButtonProperty.ADAPTER.encodeWithTag(protoWriter, 1511, uRLPreviewComponent.spin_button);
            }
            if (uRLPreviewComponent.avatar != null) {
                AvatarProperty.ADAPTER.encodeWithTag(protoWriter, 1512, uRLPreviewComponent.avatar);
            }
            if (uRLPreviewComponent.video != null) {
                VideoProperty.ADAPTER.encodeWithTag(protoWriter, 1513, uRLPreviewComponent.video);
            }
            if (uRLPreviewComponent.card_container != null) {
                CardContainerProperty.ADAPTER.encodeWithTag(protoWriter, 1514, uRLPreviewComponent.card_container);
            }
            protoWriter.writeBytes(uRLPreviewComponent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15414a newBuilder() {
        C15414a aVar = new C15414a();
        aVar.f40770a = this.type;
        aVar.f40771b = this.can_skip_when_unknown;
        aVar.f40772c = this.style;
        aVar.f40773d = Internal.copyOf("child_ids", this.child_ids);
        aVar.f40774e = this.is_font_zoomable;
        aVar.f40775f = this.empty;
        aVar.f40776g = this.linear_layout;
        aVar.f40777h = this.header;
        aVar.f40778i = this.richtext;
        aVar.f40779j = this.image;
        aVar.f40780k = this.chatters_preview;
        aVar.f40781l = this.button;
        aVar.f40782m = this.icon_button;
        aVar.f40783n = this.text_button;
        aVar.f40784o = this.time;
        aVar.f40785p = this.text;
        aVar.f40786q = this.tag_list;
        aVar.f40787r = this.spin_button;
        aVar.f40788s = this.avatar;
        aVar.f40789t = this.video;
        aVar.f40790u = this.card_container;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "URLPreviewComponent");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.can_skip_when_unknown != null) {
            sb.append(", can_skip_when_unknown=");
            sb.append(this.can_skip_when_unknown);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (!this.child_ids.isEmpty()) {
            sb.append(", child_ids=");
            sb.append(this.child_ids);
        }
        if (this.is_font_zoomable != null) {
            sb.append(", is_font_zoomable=");
            sb.append(this.is_font_zoomable);
        }
        if (this.empty != null) {
            sb.append(", empty=");
            sb.append(this.empty);
        }
        if (this.linear_layout != null) {
            sb.append(", linear_layout=");
            sb.append(this.linear_layout);
        }
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.richtext != null) {
            sb.append(", richtext=");
            sb.append(this.richtext);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.chatters_preview != null) {
            sb.append(", chatters_preview=");
            sb.append(this.chatters_preview);
        }
        if (this.button != null) {
            sb.append(", button=");
            sb.append(this.button);
        }
        if (this.icon_button != null) {
            sb.append(", icon_button=");
            sb.append(this.icon_button);
        }
        if (this.text_button != null) {
            sb.append(", text_button=");
            sb.append(this.text_button);
        }
        if (this.time != null) {
            sb.append(", time=");
            sb.append(this.time);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.tag_list != null) {
            sb.append(", tag_list=");
            sb.append(this.tag_list);
        }
        if (this.spin_button != null) {
            sb.append(", spin_button=");
            sb.append(this.spin_button);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (this.card_container != null) {
            sb.append(", card_container=");
            sb.append(this.card_container);
        }
        StringBuilder replace = sb.replace(0, 2, "URLPreviewComponent{");
        replace.append('}');
        return replace.toString();
    }

    public URLPreviewComponent(Type type2, Boolean bool, Style style2, List<String> list, Boolean bool2, EmptyProperty emptyProperty, LinearLayoutProperty linearLayoutProperty, PreviewHeaderProperty previewHeaderProperty, RichTextProperty richTextProperty, ImageProperty imageProperty, ChattersPreviewProperty chattersPreviewProperty, ButtonProperty buttonProperty, IconButtonProperty iconButtonProperty, TextButtonProperty textButtonProperty, TimeProperty timeProperty, TextProperty textProperty, TagListProperty tagListProperty, SpinButtonProperty spinButtonProperty, AvatarProperty avatarProperty, VideoProperty videoProperty, CardContainerProperty cardContainerProperty) {
        this(type2, bool, style2, list, bool2, emptyProperty, linearLayoutProperty, previewHeaderProperty, richTextProperty, imageProperty, chattersPreviewProperty, buttonProperty, iconButtonProperty, textButtonProperty, timeProperty, textProperty, tagListProperty, spinButtonProperty, avatarProperty, videoProperty, cardContainerProperty, ByteString.EMPTY);
    }

    public URLPreviewComponent(Type type2, Boolean bool, Style style2, List<String> list, Boolean bool2, EmptyProperty emptyProperty, LinearLayoutProperty linearLayoutProperty, PreviewHeaderProperty previewHeaderProperty, RichTextProperty richTextProperty, ImageProperty imageProperty, ChattersPreviewProperty chattersPreviewProperty, ButtonProperty buttonProperty, IconButtonProperty iconButtonProperty, TextButtonProperty textButtonProperty, TimeProperty timeProperty, TextProperty textProperty, TagListProperty tagListProperty, SpinButtonProperty spinButtonProperty, AvatarProperty avatarProperty, VideoProperty videoProperty, CardContainerProperty cardContainerProperty, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(emptyProperty, linearLayoutProperty, previewHeaderProperty, richTextProperty, imageProperty, chattersPreviewProperty, buttonProperty, iconButtonProperty, textButtonProperty, timeProperty, textProperty, tagListProperty, spinButtonProperty, avatarProperty, videoProperty, cardContainerProperty) <= 1) {
            this.type = type2;
            this.can_skip_when_unknown = bool;
            this.style = style2;
            this.child_ids = Internal.immutableCopyOf("child_ids", list);
            this.is_font_zoomable = bool2;
            this.empty = emptyProperty;
            this.linear_layout = linearLayoutProperty;
            this.header = previewHeaderProperty;
            this.richtext = richTextProperty;
            this.image = imageProperty;
            this.chatters_preview = chattersPreviewProperty;
            this.button = buttonProperty;
            this.icon_button = iconButtonProperty;
            this.text_button = textButtonProperty;
            this.time = timeProperty;
            this.text = textProperty;
            this.tag_list = tagListProperty;
            this.spin_button = spinButtonProperty;
            this.avatar = avatarProperty;
            this.video = videoProperty;
            this.card_container = cardContainerProperty;
            return;
        }
        throw new IllegalArgumentException("at most one of empty, linear_layout, header, richtext, image, chatters_preview, button, icon_button, text_button, time, text, tag_list, spin_button, avatar, video, card_container may be non-null");
    }
}
