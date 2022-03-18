package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CardAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class RichTextElement extends Message<RichTextElement, C15249a> {
    public static final ProtoAdapter<RichTextElement> ADAPTER = new C15250b();
    public static final Tag DEFAULT_TAG = Tag.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> child_ids;
    public final PropertySet property;
    public final Map<String, String> style;
    public final List<String> style_keys;
    public final Tag tag;
    public final Map<String, String> wide_style;

    public static final class CodeBlockProperty extends Message<CodeBlockProperty, C15177a> {
        public static final ProtoAdapter<CodeBlockProperty> ADAPTER = new C15178b();
        public static final Language DEFAULT_LANGUAGE = Language.JS;
        private static final long serialVersionUID = 0;
        public final String content;
        public final Language language;
        public final List<StyleRef> style_refs;
        public final List<Style> styles;

        public enum Language implements WireEnum {
            JS(0),
            APACHE(1),
            BASH(2),
            CS(3),
            CPLUSPLUS(4),
            COFFE_SCRIPT(5),
            HTML(6),
            XML(7),
            HTTP(8),
            JSON(9),
            JAVA(10),
            MAKEFILE(11),
            MARKDOWN(12),
            NGINX(13),
            OBJC(14),
            PHP(15),
            PERL(16),
            PYTHON(17),
            RUBY(18),
            SQL(19),
            SHELL(20),
            GO(21),
            SCSS(22),
            LUA(23),
            DJANGO(24),
            KOTLIN(25);
            
            public static final ProtoAdapter<Language> ADAPTER = ProtoAdapter.newEnumAdapter(Language.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Language fromValue(int i) {
                switch (i) {
                    case 0:
                        return JS;
                    case 1:
                        return APACHE;
                    case 2:
                        return BASH;
                    case 3:
                        return CS;
                    case 4:
                        return CPLUSPLUS;
                    case 5:
                        return COFFE_SCRIPT;
                    case 6:
                        return HTML;
                    case 7:
                        return XML;
                    case 8:
                        return HTTP;
                    case 9:
                        return JSON;
                    case 10:
                        return JAVA;
                    case 11:
                        return MAKEFILE;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        return MARKDOWN;
                    case 13:
                        return NGINX;
                    case 14:
                        return OBJC;
                    case 15:
                        return PHP;
                    case 16:
                        return PERL;
                    case 17:
                        return PYTHON;
                    case 18:
                        return RUBY;
                    case 19:
                        return SQL;
                    case 20:
                        return SHELL;
                    case 21:
                        return GO;
                    case 22:
                        return SCSS;
                    case 23:
                        return LUA;
                    case 24:
                        return DJANGO;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        return KOTLIN;
                    default:
                        return null;
                }
            }

            private Language(int i) {
                this.value = i;
            }
        }

        public enum StyleType implements WireEnum {
            CUSTOMIZE(0),
            GRAMMAR(1);
            
            public static final ProtoAdapter<StyleType> ADAPTER = ProtoAdapter.newEnumAdapter(StyleType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static StyleType fromValue(int i) {
                if (i == 0) {
                    return CUSTOMIZE;
                }
                if (i != 1) {
                    return null;
                }
                return GRAMMAR;
            }

            private StyleType(int i) {
                this.value = i;
            }
        }

        public static final class Style extends Message<Style, C15173a> {
            public static final ProtoAdapter<Style> ADAPTER = new C15174b();
            public static final StyleType DEFAULT_TYPE = StyleType.CUSTOMIZE;
            private static final long serialVersionUID = 0;
            public final String name;
            public final StyleType type;
            public final String value;

            /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeBlockProperty$Style$b */
            private static final class C15174b extends ProtoAdapter<Style> {
                C15174b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Style.class);
                }

                /* renamed from: a */
                public int encodedSize(Style style) {
                    int i;
                    int i2;
                    int i3 = 0;
                    if (style.type != null) {
                        i = StyleType.ADAPTER.encodedSizeWithTag(1, style.type);
                    } else {
                        i = 0;
                    }
                    if (style.name != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, style.name);
                    } else {
                        i2 = 0;
                    }
                    int i4 = i + i2;
                    if (style.value != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, style.value);
                    }
                    return i4 + i3 + style.unknownFields().size();
                }

                /* renamed from: a */
                public Style decode(ProtoReader protoReader) throws IOException {
                    C15173a aVar = new C15173a();
                    aVar.f40259a = StyleType.CUSTOMIZE;
                    aVar.f40260b = "";
                    aVar.f40261c = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            try {
                                aVar.f40259a = StyleType.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        } else if (nextTag == 2) {
                            aVar.f40260b = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f40261c = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Style style) throws IOException {
                    if (style.type != null) {
                        StyleType.ADAPTER.encodeWithTag(protoWriter, 1, style.type);
                    }
                    if (style.name != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, style.name);
                    }
                    if (style.value != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, style.value);
                    }
                    protoWriter.writeBytes(style.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeBlockProperty$Style$a */
            public static final class C15173a extends Message.Builder<Style, C15173a> {

                /* renamed from: a */
                public StyleType f40259a;

                /* renamed from: b */
                public String f40260b;

                /* renamed from: c */
                public String f40261c;

                /* renamed from: a */
                public Style build() {
                    return new Style(this.f40259a, this.f40260b, this.f40261c, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C15173a newBuilder() {
                C15173a aVar = new C15173a();
                aVar.f40259a = this.type;
                aVar.f40260b = this.name;
                aVar.f40261c = this.value;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "Style");
                StringBuilder sb = new StringBuilder();
                if (this.type != null) {
                    sb.append(", type=");
                    sb.append(this.type);
                }
                if (this.name != null) {
                    sb.append(", name=");
                    sb.append(this.name);
                }
                if (this.value != null) {
                    sb.append(", value=");
                    sb.append(this.value);
                }
                StringBuilder replace = sb.replace(0, 2, "Style{");
                replace.append('}');
                return replace.toString();
            }

            public Style(StyleType styleType, String str, String str2) {
                this(styleType, str, str2, ByteString.EMPTY);
            }

            public Style(StyleType styleType, String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.type = styleType;
                this.name = str;
                this.value = str2;
            }
        }

        public static final class StyleRef extends Message<StyleRef, C15175a> {
            public static final ProtoAdapter<StyleRef> ADAPTER = new C15176b();
            public static final Integer DEFAULT_LENGTH = 0;
            public static final Integer DEFAULT_LOCATION = 0;
            private static final long serialVersionUID = 0;
            public final Integer length;
            public final Integer location;
            public final List<Integer> style_ids;

            /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeBlockProperty$StyleRef$b */
            private static final class C15176b extends ProtoAdapter<StyleRef> {
                C15176b() {
                    super(FieldEncoding.LENGTH_DELIMITED, StyleRef.class);
                }

                /* renamed from: a */
                public int encodedSize(StyleRef styleRef) {
                    int i;
                    int i2 = 0;
                    if (styleRef.location != null) {
                        i = ProtoAdapter.INT32.encodedSizeWithTag(1, styleRef.location);
                    } else {
                        i = 0;
                    }
                    if (styleRef.length != null) {
                        i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, styleRef.length);
                    }
                    return i + i2 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(3, styleRef.style_ids) + styleRef.unknownFields().size();
                }

                /* renamed from: a */
                public StyleRef decode(ProtoReader protoReader) throws IOException {
                    C15175a aVar = new C15175a();
                    aVar.f40262a = 0;
                    aVar.f40263b = 0;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f40262a = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f40263b = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f40264c.add(ProtoAdapter.INT32.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, StyleRef styleRef) throws IOException {
                    if (styleRef.location != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, styleRef.location);
                    }
                    if (styleRef.length != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, styleRef.length);
                    }
                    ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 3, styleRef.style_ids);
                    protoWriter.writeBytes(styleRef.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeBlockProperty$StyleRef$a */
            public static final class C15175a extends Message.Builder<StyleRef, C15175a> {

                /* renamed from: a */
                public Integer f40262a;

                /* renamed from: b */
                public Integer f40263b;

                /* renamed from: c */
                public List<Integer> f40264c = Internal.newMutableList();

                /* renamed from: a */
                public StyleRef build() {
                    return new StyleRef(this.f40262a, this.f40263b, this.f40264c, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C15175a newBuilder() {
                C15175a aVar = new C15175a();
                aVar.f40262a = this.location;
                aVar.f40263b = this.length;
                aVar.f40264c = Internal.copyOf("style_ids", this.style_ids);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "StyleRef");
                StringBuilder sb = new StringBuilder();
                if (this.location != null) {
                    sb.append(", location=");
                    sb.append(this.location);
                }
                if (this.length != null) {
                    sb.append(", length=");
                    sb.append(this.length);
                }
                if (!this.style_ids.isEmpty()) {
                    sb.append(", style_ids=");
                    sb.append(this.style_ids);
                }
                StringBuilder replace = sb.replace(0, 2, "StyleRef{");
                replace.append('}');
                return replace.toString();
            }

            public StyleRef(Integer num, Integer num2, List<Integer> list) {
                this(num, num2, list, ByteString.EMPTY);
            }

            public StyleRef(Integer num, Integer num2, List<Integer> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.location = num;
                this.length = num2;
                this.style_ids = Internal.immutableCopyOf("style_ids", list);
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeBlockProperty$b */
        private static final class C15178b extends ProtoAdapter<CodeBlockProperty> {
            C15178b() {
                super(FieldEncoding.LENGTH_DELIMITED, CodeBlockProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(CodeBlockProperty codeBlockProperty) {
                int i;
                int i2 = 0;
                if (codeBlockProperty.language != null) {
                    i = Language.ADAPTER.encodedSizeWithTag(1, codeBlockProperty.language);
                } else {
                    i = 0;
                }
                if (codeBlockProperty.content != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, codeBlockProperty.content);
                }
                return i + i2 + StyleRef.ADAPTER.asRepeated().encodedSizeWithTag(3, codeBlockProperty.style_refs) + Style.ADAPTER.asRepeated().encodedSizeWithTag(4, codeBlockProperty.styles) + codeBlockProperty.unknownFields().size();
            }

            /* renamed from: a */
            public CodeBlockProperty decode(ProtoReader protoReader) throws IOException {
                C15177a aVar = new C15177a();
                aVar.f40265a = Language.JS;
                aVar.f40266b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40265a = Language.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f40266b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40267c.add(StyleRef.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40268d.add(Style.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CodeBlockProperty codeBlockProperty) throws IOException {
                if (codeBlockProperty.language != null) {
                    Language.ADAPTER.encodeWithTag(protoWriter, 1, codeBlockProperty.language);
                }
                if (codeBlockProperty.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, codeBlockProperty.content);
                }
                StyleRef.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, codeBlockProperty.style_refs);
                Style.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, codeBlockProperty.styles);
                protoWriter.writeBytes(codeBlockProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeBlockProperty$a */
        public static final class C15177a extends Message.Builder<CodeBlockProperty, C15177a> {

            /* renamed from: a */
            public Language f40265a;

            /* renamed from: b */
            public String f40266b;

            /* renamed from: c */
            public List<StyleRef> f40267c = Internal.newMutableList();

            /* renamed from: d */
            public List<Style> f40268d = Internal.newMutableList();

            /* renamed from: a */
            public CodeBlockProperty build() {
                return new CodeBlockProperty(this.f40265a, this.f40266b, this.f40267c, this.f40268d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15177a newBuilder() {
            C15177a aVar = new C15177a();
            aVar.f40265a = this.language;
            aVar.f40266b = this.content;
            aVar.f40267c = Internal.copyOf("style_refs", this.style_refs);
            aVar.f40268d = Internal.copyOf("styles", this.styles);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CodeBlockProperty");
            StringBuilder sb = new StringBuilder();
            if (this.language != null) {
                sb.append(", language=");
                sb.append(this.language);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (!this.style_refs.isEmpty()) {
                sb.append(", style_refs=");
                sb.append(this.style_refs);
            }
            if (!this.styles.isEmpty()) {
                sb.append(", styles=");
                sb.append(this.styles);
            }
            StringBuilder replace = sb.replace(0, 2, "CodeBlockProperty{");
            replace.append('}');
            return replace.toString();
        }

        public CodeBlockProperty(Language language2, String str, List<StyleRef> list, List<Style> list2) {
            this(language2, str, list, list2, ByteString.EMPTY);
        }

        public CodeBlockProperty(Language language2, String str, List<StyleRef> list, List<Style> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.language = language2;
            this.content = str;
            this.style_refs = Internal.immutableCopyOf("style_refs", list);
            this.styles = Internal.immutableCopyOf("styles", list2);
        }
    }

    public static final class LinkProperty extends Message<LinkProperty, C15207a> {
        public static final ProtoAdapter<LinkProperty> ADAPTER = new C15208b();
        public static final LinkScene DEFAULT_SCENE = LinkScene.UNKNOWN;
        public static final SpecialURL DEFAULT_SPECIAL_URL = SpecialURL.UNKNOWN_URL;
        private static final long serialVersionUID = 0;
        public final String android_url;
        public final String ios_url;
        public final String pc_url;
        public final LinkScene scene;
        public final SpecialURL special_url;
        public final String url;

        public enum LinkScene implements WireEnum {
            UNKNOWN(0),
            CardLink(1),
            ContentLink(2),
            FooterLink(3);
            
            public static final ProtoAdapter<LinkScene> ADAPTER = ProtoAdapter.newEnumAdapter(LinkScene.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static LinkScene fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return CardLink;
                }
                if (i == 2) {
                    return ContentLink;
                }
                if (i != 3) {
                    return null;
                }
                return FooterLink;
            }

            private LinkScene(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$LinkProperty$b */
        private static final class C15208b extends ProtoAdapter<LinkProperty> {
            C15208b() {
                super(FieldEncoding.LENGTH_DELIMITED, LinkProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(LinkProperty linkProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (linkProperty.url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, linkProperty.url);
                } else {
                    i = 0;
                }
                if (linkProperty.ios_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, linkProperty.ios_url);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (linkProperty.android_url != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, linkProperty.android_url);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (linkProperty.pc_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, linkProperty.pc_url);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (linkProperty.special_url != null) {
                    i5 = SpecialURL.ADAPTER.encodedSizeWithTag(5, linkProperty.special_url);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (linkProperty.scene != null) {
                    i6 = LinkScene.ADAPTER.encodedSizeWithTag(6, linkProperty.scene);
                }
                return i10 + i6 + linkProperty.unknownFields().size();
            }

            /* renamed from: a */
            public LinkProperty decode(ProtoReader protoReader) throws IOException {
                C15207a aVar = new C15207a();
                aVar.f40305a = "";
                aVar.f40306b = "";
                aVar.f40307c = "";
                aVar.f40308d = "";
                aVar.f40309e = SpecialURL.UNKNOWN_URL;
                aVar.f40310f = LinkScene.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40305a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40306b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40307c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40308d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                try {
                                    aVar.f40309e = SpecialURL.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 6:
                                try {
                                    aVar.f40310f = LinkScene.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
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
            public void encode(ProtoWriter protoWriter, LinkProperty linkProperty) throws IOException {
                if (linkProperty.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, linkProperty.url);
                }
                if (linkProperty.ios_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, linkProperty.ios_url);
                }
                if (linkProperty.android_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, linkProperty.android_url);
                }
                if (linkProperty.pc_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, linkProperty.pc_url);
                }
                if (linkProperty.special_url != null) {
                    SpecialURL.ADAPTER.encodeWithTag(protoWriter, 5, linkProperty.special_url);
                }
                if (linkProperty.scene != null) {
                    LinkScene.ADAPTER.encodeWithTag(protoWriter, 6, linkProperty.scene);
                }
                protoWriter.writeBytes(linkProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$LinkProperty$a */
        public static final class C15207a extends Message.Builder<LinkProperty, C15207a> {

            /* renamed from: a */
            public String f40305a;

            /* renamed from: b */
            public String f40306b;

            /* renamed from: c */
            public String f40307c;

            /* renamed from: d */
            public String f40308d;

            /* renamed from: e */
            public SpecialURL f40309e;

            /* renamed from: f */
            public LinkScene f40310f;

            /* renamed from: a */
            public LinkProperty build() {
                return new LinkProperty(this.f40305a, this.f40306b, this.f40307c, this.f40308d, this.f40309e, this.f40310f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15207a newBuilder() {
            C15207a aVar = new C15207a();
            aVar.f40305a = this.url;
            aVar.f40306b = this.ios_url;
            aVar.f40307c = this.android_url;
            aVar.f40308d = this.pc_url;
            aVar.f40309e = this.special_url;
            aVar.f40310f = this.scene;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "LinkProperty");
            StringBuilder sb = new StringBuilder();
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.ios_url != null) {
                sb.append(", ios_url=");
                sb.append(this.ios_url);
            }
            if (this.android_url != null) {
                sb.append(", android_url=");
                sb.append(this.android_url);
            }
            if (this.pc_url != null) {
                sb.append(", pc_url=");
                sb.append(this.pc_url);
            }
            if (this.special_url != null) {
                sb.append(", special_url=");
                sb.append(this.special_url);
            }
            if (this.scene != null) {
                sb.append(", scene=");
                sb.append(this.scene);
            }
            StringBuilder replace = sb.replace(0, 2, "LinkProperty{");
            replace.append('}');
            return replace.toString();
        }

        public LinkProperty(String str, String str2, String str3, String str4, SpecialURL specialURL, LinkScene linkScene) {
            this(str, str2, str3, str4, specialURL, linkScene, ByteString.EMPTY);
        }

        public LinkProperty(String str, String str2, String str3, String str4, SpecialURL specialURL, LinkScene linkScene, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
            this.ios_url = str2;
            this.android_url = str3;
            this.pc_url = str4;
            this.special_url = specialURL;
            this.scene = linkScene;
        }
    }

    public static final class MediaProperty extends Message<MediaProperty, C15209a> {
        public static final ProtoAdapter<MediaProperty> ADAPTER = new C15210b();
        public static final Integer DEFAULT_DURATION = 0;
        public static final Integer DEFAULT_HEIGHT = 0;
        public static final ByteString DEFAULT_IMAGE_DATA = ByteString.EMPTY;
        public static final Long DEFAULT_SIZE = 0L;
        public static final Source DEFAULT_SOURCE = Source.UNKNOWN;
        public static final Integer DEFAULT_WIDTH = 0;
        private static final long serialVersionUID = 0;
        public final String compress_path;
        public final String crypto_token;
        public final Integer duration;
        public final String fs_unit;
        public final Integer height;
        public final ImageSet image;
        public final ByteString image_data;
        public final String image_path;
        public final String key;
        public final String mime;
        public final String name;
        public final String origin_path;
        public final Long size;
        public final Source source;
        public final String url;
        public final Integer width;

        public enum Source implements WireEnum {
            UNKNOWN(0),
            LARK(1);
            
            public static final ProtoAdapter<Source> ADAPTER = ProtoAdapter.newEnumAdapter(Source.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Source fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return LARK;
            }

            private Source(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MediaProperty$b */
        private static final class C15210b extends ProtoAdapter<MediaProperty> {
            C15210b() {
                super(FieldEncoding.LENGTH_DELIMITED, MediaProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(MediaProperty mediaProperty) {
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
                int i16 = 0;
                if (mediaProperty.key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, mediaProperty.key);
                } else {
                    i = 0;
                }
                if (mediaProperty.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mediaProperty.name);
                } else {
                    i2 = 0;
                }
                int i17 = i + i2;
                if (mediaProperty.size != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mediaProperty.size);
                } else {
                    i3 = 0;
                }
                int i18 = i17 + i3;
                if (mediaProperty.mime != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mediaProperty.mime);
                } else {
                    i4 = 0;
                }
                int i19 = i18 + i4;
                if (mediaProperty.source != null) {
                    i5 = Source.ADAPTER.encodedSizeWithTag(5, mediaProperty.source);
                } else {
                    i5 = 0;
                }
                int i20 = i19 + i5;
                if (mediaProperty.image != null) {
                    i6 = ImageSet.ADAPTER.encodedSizeWithTag(6, mediaProperty.image);
                } else {
                    i6 = 0;
                }
                int i21 = i20 + i6;
                if (mediaProperty.duration != null) {
                    i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, mediaProperty.duration);
                } else {
                    i7 = 0;
                }
                int i22 = i21 + i7;
                if (mediaProperty.fs_unit != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, mediaProperty.fs_unit);
                } else {
                    i8 = 0;
                }
                int i23 = i22 + i8;
                if (mediaProperty.crypto_token != null) {
                    i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, mediaProperty.crypto_token);
                } else {
                    i9 = 0;
                }
                int i24 = i23 + i9;
                if (mediaProperty.compress_path != null) {
                    i10 = ProtoAdapter.STRING.encodedSizeWithTag(100, mediaProperty.compress_path);
                } else {
                    i10 = 0;
                }
                int i25 = i24 + i10;
                if (mediaProperty.origin_path != null) {
                    i11 = ProtoAdapter.STRING.encodedSizeWithTag(101, mediaProperty.origin_path);
                } else {
                    i11 = 0;
                }
                int i26 = i25 + i11;
                if (mediaProperty.image_data != null) {
                    i12 = ProtoAdapter.BYTES.encodedSizeWithTag(102, mediaProperty.image_data);
                } else {
                    i12 = 0;
                }
                int i27 = i26 + i12;
                if (mediaProperty.width != null) {
                    i13 = ProtoAdapter.INT32.encodedSizeWithTag(103, mediaProperty.width);
                } else {
                    i13 = 0;
                }
                int i28 = i27 + i13;
                if (mediaProperty.height != null) {
                    i14 = ProtoAdapter.INT32.encodedSizeWithTag(104, mediaProperty.height);
                } else {
                    i14 = 0;
                }
                int i29 = i28 + i14;
                if (mediaProperty.url != null) {
                    i15 = ProtoAdapter.STRING.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, mediaProperty.url);
                } else {
                    i15 = 0;
                }
                int i30 = i29 + i15;
                if (mediaProperty.image_path != null) {
                    i16 = ProtoAdapter.STRING.encodedSizeWithTag(106, mediaProperty.image_path);
                }
                return i30 + i16 + mediaProperty.unknownFields().size();
            }

            /* renamed from: a */
            public MediaProperty decode(ProtoReader protoReader) throws IOException {
                C15209a aVar = new C15209a();
                aVar.f40311a = "";
                aVar.f40312b = "";
                aVar.f40313c = 0L;
                aVar.f40314d = "";
                aVar.f40315e = Source.UNKNOWN;
                aVar.f40317g = 0;
                aVar.f40318h = "";
                aVar.f40319i = "";
                aVar.f40320j = "";
                aVar.f40321k = "";
                aVar.f40322l = ByteString.EMPTY;
                aVar.f40323m = 0;
                aVar.f40324n = 0;
                aVar.f40325o = "";
                aVar.f40326p = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40311a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40312b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40313c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40314d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                try {
                                    aVar.f40315e = Source.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 6:
                                aVar.f40316f = ImageSet.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40317g = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40318h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f40319i = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                switch (nextTag) {
                                    case 100:
                                        aVar.f40320j = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 101:
                                        aVar.f40321k = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 102:
                                        aVar.f40322l = ProtoAdapter.BYTES.decode(protoReader);
                                        continue;
                                    case 103:
                                        aVar.f40323m = ProtoAdapter.INT32.decode(protoReader);
                                        continue;
                                    case 104:
                                        aVar.f40324n = ProtoAdapter.INT32.decode(protoReader);
                                        continue;
                                    case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                        aVar.f40325o = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 106:
                                        aVar.f40326p = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    default:
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        continue;
                                }
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MediaProperty mediaProperty) throws IOException {
                if (mediaProperty.key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mediaProperty.key);
                }
                if (mediaProperty.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mediaProperty.name);
                }
                if (mediaProperty.size != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mediaProperty.size);
                }
                if (mediaProperty.mime != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mediaProperty.mime);
                }
                if (mediaProperty.source != null) {
                    Source.ADAPTER.encodeWithTag(protoWriter, 5, mediaProperty.source);
                }
                if (mediaProperty.image != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 6, mediaProperty.image);
                }
                if (mediaProperty.duration != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, mediaProperty.duration);
                }
                if (mediaProperty.fs_unit != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, mediaProperty.fs_unit);
                }
                if (mediaProperty.crypto_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, mediaProperty.crypto_token);
                }
                if (mediaProperty.compress_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, mediaProperty.compress_path);
                }
                if (mediaProperty.origin_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 101, mediaProperty.origin_path);
                }
                if (mediaProperty.image_data != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 102, mediaProperty.image_data);
                }
                if (mediaProperty.width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 103, mediaProperty.width);
                }
                if (mediaProperty.height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 104, mediaProperty.height);
                }
                if (mediaProperty.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, mediaProperty.url);
                }
                if (mediaProperty.image_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 106, mediaProperty.image_path);
                }
                protoWriter.writeBytes(mediaProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MediaProperty$a */
        public static final class C15209a extends Message.Builder<MediaProperty, C15209a> {

            /* renamed from: a */
            public String f40311a;

            /* renamed from: b */
            public String f40312b;

            /* renamed from: c */
            public Long f40313c;

            /* renamed from: d */
            public String f40314d;

            /* renamed from: e */
            public Source f40315e;

            /* renamed from: f */
            public ImageSet f40316f;

            /* renamed from: g */
            public Integer f40317g;

            /* renamed from: h */
            public String f40318h;

            /* renamed from: i */
            public String f40319i;

            /* renamed from: j */
            public String f40320j;

            /* renamed from: k */
            public String f40321k;

            /* renamed from: l */
            public ByteString f40322l;

            /* renamed from: m */
            public Integer f40323m;

            /* renamed from: n */
            public Integer f40324n;

            /* renamed from: o */
            public String f40325o;

            /* renamed from: p */
            public String f40326p;

            /* renamed from: a */
            public MediaProperty build() {
                return new MediaProperty(this.f40311a, this.f40312b, this.f40313c, this.f40314d, this.f40315e, this.f40316f, this.f40317g, this.f40318h, this.f40319i, this.f40320j, this.f40321k, this.f40322l, this.f40323m, this.f40324n, this.f40325o, this.f40326p, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15209a mo55397a(Integer num) {
                this.f40317g = num;
                return this;
            }

            /* renamed from: b */
            public C15209a mo55402b(Integer num) {
                this.f40323m = num;
                return this;
            }

            /* renamed from: c */
            public C15209a mo55404c(Integer num) {
                this.f40324n = num;
                return this;
            }

            /* renamed from: a */
            public C15209a mo55398a(Long l) {
                this.f40313c = l;
                return this;
            }

            /* renamed from: b */
            public C15209a mo55403b(String str) {
                this.f40320j = str;
                return this;
            }

            /* renamed from: c */
            public C15209a mo55405c(String str) {
                this.f40321k = str;
                return this;
            }

            /* renamed from: a */
            public C15209a mo55399a(String str) {
                this.f40314d = str;
                return this;
            }

            /* renamed from: a */
            public C15209a mo55400a(ByteString byteString) {
                this.f40322l = byteString;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15209a newBuilder() {
            C15209a aVar = new C15209a();
            aVar.f40311a = this.key;
            aVar.f40312b = this.name;
            aVar.f40313c = this.size;
            aVar.f40314d = this.mime;
            aVar.f40315e = this.source;
            aVar.f40316f = this.image;
            aVar.f40317g = this.duration;
            aVar.f40318h = this.fs_unit;
            aVar.f40319i = this.crypto_token;
            aVar.f40320j = this.compress_path;
            aVar.f40321k = this.origin_path;
            aVar.f40322l = this.image_data;
            aVar.f40323m = this.width;
            aVar.f40324n = this.height;
            aVar.f40325o = this.url;
            aVar.f40326p = this.image_path;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MediaProperty");
            StringBuilder sb = new StringBuilder();
            if (this.key != null) {
                sb.append(", key=");
                sb.append(this.key);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.size != null) {
                sb.append(", size=");
                sb.append(this.size);
            }
            if (this.mime != null) {
                sb.append(", mime=");
                sb.append(this.mime);
            }
            if (this.source != null) {
                sb.append(", source=");
                sb.append(this.source);
            }
            if (this.image != null) {
                sb.append(", image=");
                sb.append(this.image);
            }
            if (this.duration != null) {
                sb.append(", duration=");
                sb.append(this.duration);
            }
            if (this.fs_unit != null) {
                sb.append(", fs_unit=");
                sb.append(this.fs_unit);
            }
            if (this.crypto_token != null) {
                sb.append(", crypto_token=");
                sb.append(this.crypto_token);
            }
            if (this.compress_path != null) {
                sb.append(", compress_path=");
                sb.append(this.compress_path);
            }
            if (this.origin_path != null) {
                sb.append(", origin_path=");
                sb.append(this.origin_path);
            }
            if (this.image_data != null) {
                sb.append(", image_data=");
                sb.append(this.image_data);
            }
            if (this.width != null) {
                sb.append(", width=");
                sb.append(this.width);
            }
            if (this.height != null) {
                sb.append(", height=");
                sb.append(this.height);
            }
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.image_path != null) {
                sb.append(", image_path=");
                sb.append(this.image_path);
            }
            StringBuilder replace = sb.replace(0, 2, "MediaProperty{");
            replace.append('}');
            return replace.toString();
        }

        public MediaProperty(String str, String str2, Long l, String str3, Source source2, ImageSet imageSet, Integer num, String str4, String str5, String str6, String str7, ByteString byteString, Integer num2, Integer num3, String str8, String str9) {
            this(str, str2, l, str3, source2, imageSet, num, str4, str5, str6, str7, byteString, num2, num3, str8, str9, ByteString.EMPTY);
        }

        public MediaProperty(String str, String str2, Long l, String str3, Source source2, ImageSet imageSet, Integer num, String str4, String str5, String str6, String str7, ByteString byteString, Integer num2, Integer num3, String str8, String str9, ByteString byteString2) {
            super(ADAPTER, byteString2);
            this.key = str;
            this.name = str2;
            this.size = l;
            this.mime = str3;
            this.source = source2;
            this.image = imageSet;
            this.duration = num;
            this.fs_unit = str4;
            this.crypto_token = str5;
            this.compress_path = str6;
            this.origin_path = str7;
            this.image_data = byteString;
            this.width = num2;
            this.height = num3;
            this.url = str8;
            this.image_path = str9;
        }
    }

    public static final class MentionItem extends Message<MentionItem, C15211a> {
        public static final ProtoAdapter<MentionItem> ADAPTER = new C15212b();
        public static final MentionType DEFAULT_TYPE = MentionType.UNKNOWN_MENTION_TYPE;
        private static final long serialVersionUID = 0;
        public final String id;
        public final MentionType type;

        public enum MentionType implements WireEnum {
            UNKNOWN_MENTION_TYPE(0),
            HASH_TAG(1);
            
            public static final ProtoAdapter<MentionType> ADAPTER = ProtoAdapter.newEnumAdapter(MentionType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static MentionType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN_MENTION_TYPE;
                }
                if (i != 1) {
                    return null;
                }
                return HASH_TAG;
            }

            private MentionType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MentionItem$b */
        private static final class C15212b extends ProtoAdapter<MentionItem> {
            C15212b() {
                super(FieldEncoding.LENGTH_DELIMITED, MentionItem.class);
            }

            /* renamed from: a */
            public int encodedSize(MentionItem mentionItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, mentionItem.id) + MentionType.ADAPTER.encodedSizeWithTag(2, mentionItem.type) + mentionItem.unknownFields().size();
            }

            /* renamed from: a */
            public MentionItem decode(ProtoReader protoReader) throws IOException {
                C15211a aVar = new C15211a();
                aVar.f40327a = "";
                aVar.f40328b = MentionType.UNKNOWN_MENTION_TYPE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40327a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f40328b = MentionType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MentionItem mentionItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mentionItem.id);
                MentionType.ADAPTER.encodeWithTag(protoWriter, 2, mentionItem.type);
                protoWriter.writeBytes(mentionItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15211a newBuilder() {
            C15211a aVar = new C15211a();
            aVar.f40327a = this.id;
            aVar.f40328b = this.type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MentionItem$a */
        public static final class C15211a extends Message.Builder<MentionItem, C15211a> {

            /* renamed from: a */
            public String f40327a;

            /* renamed from: b */
            public MentionType f40328b;

            /* renamed from: a */
            public MentionItem build() {
                MentionType mentionType;
                String str = this.f40327a;
                if (str != null && (mentionType = this.f40328b) != null) {
                    return new MentionItem(str, mentionType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "id", this.f40328b, ShareHitPoint.f121869d);
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MentionItem");
            StringBuilder sb = new StringBuilder();
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", type=");
            sb.append(this.type);
            StringBuilder replace = sb.replace(0, 2, "MentionItem{");
            replace.append('}');
            return replace.toString();
        }

        public MentionItem(String str, MentionType mentionType) {
            this(str, mentionType, ByteString.EMPTY);
        }

        public MentionItem(String str, MentionType mentionType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.type = mentionType;
        }
    }

    public static final class OLProperty extends Message<OLProperty, C15217a> {
        public static final ProtoAdapter<OLProperty> ADAPTER = new C15218b();
        public static final Integer DEFAULT_START = 1;
        public static final Type DEFAULT_TYPE = Type.NUMBER;
        private static final long serialVersionUID = 0;
        public final Integer start;
        public final Type type;

        public enum Type implements WireEnum {
            NUMBER(0),
            LOWERCASE_A(1),
            UPPERCASE_A(2),
            LOWERCASE_ROMAN(3),
            UPPERCASE_ROMAN(4),
            NONE(5);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return NUMBER;
                }
                if (i == 1) {
                    return LOWERCASE_A;
                }
                if (i == 2) {
                    return UPPERCASE_A;
                }
                if (i == 3) {
                    return LOWERCASE_ROMAN;
                }
                if (i == 4) {
                    return UPPERCASE_ROMAN;
                }
                if (i != 5) {
                    return null;
                }
                return NONE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$OLProperty$b */
        private static final class C15218b extends ProtoAdapter<OLProperty> {
            C15218b() {
                super(FieldEncoding.LENGTH_DELIMITED, OLProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(OLProperty oLProperty) {
                int i;
                int i2 = 0;
                if (oLProperty.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, oLProperty.type);
                } else {
                    i = 0;
                }
                if (oLProperty.start != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, oLProperty.start);
                }
                return i + i2 + oLProperty.unknownFields().size();
            }

            /* renamed from: a */
            public OLProperty decode(ProtoReader protoReader) throws IOException {
                C15217a aVar = new C15217a();
                aVar.f40336a = Type.NUMBER;
                aVar.f40337b = 1;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40336a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40337b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OLProperty oLProperty) throws IOException {
                if (oLProperty.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, oLProperty.type);
                }
                if (oLProperty.start != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, oLProperty.start);
                }
                protoWriter.writeBytes(oLProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$OLProperty$a */
        public static final class C15217a extends Message.Builder<OLProperty, C15217a> {

            /* renamed from: a */
            public Type f40336a;

            /* renamed from: b */
            public Integer f40337b;

            /* renamed from: a */
            public OLProperty build() {
                return new OLProperty(this.f40336a, this.f40337b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15217a newBuilder() {
            C15217a aVar = new C15217a();
            aVar.f40336a = this.type;
            aVar.f40337b = this.start;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "OLProperty");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.start != null) {
                sb.append(", start=");
                sb.append(this.start);
            }
            StringBuilder replace = sb.replace(0, 2, "OLProperty{");
            replace.append('}');
            return replace.toString();
        }

        public OLProperty(Type type2, Integer num) {
            this(type2, num, ByteString.EMPTY);
        }

        public OLProperty(Type type2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.start = num;
        }
    }

    public static final class SelectMenuProperty extends Message<SelectMenuProperty, C15231a> {
        public static final ProtoAdapter<SelectMenuProperty> ADAPTER = new C15232b();
        public static final Boolean DEFAULT_DISABLE = false;
        public static final Boolean DEFAULT_IS_LOADING = false;
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final ButtonConfirmProperty confirm;
        public final Boolean disable;
        public final String initial_option;
        public final Boolean is_loading;
        public final List<MenuOption> options;
        public final String place_holder;
        public final String place_holder_i18n_key;
        public final Type type;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            STATIC(1),
            PERSON(2);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return STATIC;
                }
                if (i != 2) {
                    return null;
                }
                return PERSON;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$SelectMenuProperty$b */
        private static final class C15232b extends ProtoAdapter<SelectMenuProperty> {
            C15232b() {
                super(FieldEncoding.LENGTH_DELIMITED, SelectMenuProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(SelectMenuProperty selectMenuProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8 = 0;
                if (selectMenuProperty.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, selectMenuProperty.type);
                } else {
                    i = 0;
                }
                if (selectMenuProperty.action_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, selectMenuProperty.action_id);
                } else {
                    i2 = 0;
                }
                int i9 = i + i2;
                if (selectMenuProperty.place_holder != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, selectMenuProperty.place_holder);
                } else {
                    i3 = 0;
                }
                int i10 = i9 + i3;
                if (selectMenuProperty.place_holder_i18n_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, selectMenuProperty.place_holder_i18n_key);
                } else {
                    i4 = 0;
                }
                int i11 = i10 + i4;
                if (selectMenuProperty.initial_option != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, selectMenuProperty.initial_option);
                } else {
                    i5 = 0;
                }
                int encodedSizeWithTag = i11 + i5 + MenuOption.ADAPTER.asRepeated().encodedSizeWithTag(6, selectMenuProperty.options);
                if (selectMenuProperty.confirm != null) {
                    i6 = ButtonConfirmProperty.ADAPTER.encodedSizeWithTag(7, selectMenuProperty.confirm);
                } else {
                    i6 = 0;
                }
                int i12 = encodedSizeWithTag + i6;
                if (selectMenuProperty.disable != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, selectMenuProperty.disable);
                } else {
                    i7 = 0;
                }
                int i13 = i12 + i7;
                if (selectMenuProperty.is_loading != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, selectMenuProperty.is_loading);
                }
                return i13 + i8 + selectMenuProperty.unknownFields().size();
            }

            /* renamed from: a */
            public SelectMenuProperty decode(ProtoReader protoReader) throws IOException {
                C15231a aVar = new C15231a();
                aVar.f40390a = Type.UNKNOWN;
                aVar.f40391b = "";
                aVar.f40392c = "";
                aVar.f40393d = "";
                aVar.f40394e = "";
                aVar.f40397h = false;
                aVar.f40398i = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f40390a = Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f40391b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40392c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40393d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40394e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40395f.add(MenuOption.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                aVar.f40396g = ButtonConfirmProperty.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40397h = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 9:
                                aVar.f40398i = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, SelectMenuProperty selectMenuProperty) throws IOException {
                if (selectMenuProperty.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, selectMenuProperty.type);
                }
                if (selectMenuProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, selectMenuProperty.action_id);
                }
                if (selectMenuProperty.place_holder != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, selectMenuProperty.place_holder);
                }
                if (selectMenuProperty.place_holder_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, selectMenuProperty.place_holder_i18n_key);
                }
                if (selectMenuProperty.initial_option != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, selectMenuProperty.initial_option);
                }
                MenuOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, selectMenuProperty.options);
                if (selectMenuProperty.confirm != null) {
                    ButtonConfirmProperty.ADAPTER.encodeWithTag(protoWriter, 7, selectMenuProperty.confirm);
                }
                if (selectMenuProperty.disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, selectMenuProperty.disable);
                }
                if (selectMenuProperty.is_loading != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, selectMenuProperty.is_loading);
                }
                protoWriter.writeBytes(selectMenuProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$SelectMenuProperty$a */
        public static final class C15231a extends Message.Builder<SelectMenuProperty, C15231a> {

            /* renamed from: a */
            public Type f40390a;

            /* renamed from: b */
            public String f40391b;

            /* renamed from: c */
            public String f40392c;

            /* renamed from: d */
            public String f40393d;

            /* renamed from: e */
            public String f40394e;

            /* renamed from: f */
            public List<MenuOption> f40395f = Internal.newMutableList();

            /* renamed from: g */
            public ButtonConfirmProperty f40396g;

            /* renamed from: h */
            public Boolean f40397h;

            /* renamed from: i */
            public Boolean f40398i;

            /* renamed from: a */
            public SelectMenuProperty build() {
                return new SelectMenuProperty(this.f40390a, this.f40391b, this.f40392c, this.f40393d, this.f40394e, this.f40395f, this.f40396g, this.f40397h, this.f40398i, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15231a mo55470a(String str) {
                this.f40391b = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15231a newBuilder() {
            C15231a aVar = new C15231a();
            aVar.f40390a = this.type;
            aVar.f40391b = this.action_id;
            aVar.f40392c = this.place_holder;
            aVar.f40393d = this.place_holder_i18n_key;
            aVar.f40394e = this.initial_option;
            aVar.f40395f = Internal.copyOf("options", this.options);
            aVar.f40396g = this.confirm;
            aVar.f40397h = this.disable;
            aVar.f40398i = this.is_loading;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SelectMenuProperty");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.place_holder != null) {
                sb.append(", place_holder=");
                sb.append(this.place_holder);
            }
            if (this.place_holder_i18n_key != null) {
                sb.append(", place_holder_i18n_key=");
                sb.append(this.place_holder_i18n_key);
            }
            if (this.initial_option != null) {
                sb.append(", initial_option=");
                sb.append(this.initial_option);
            }
            if (!this.options.isEmpty()) {
                sb.append(", options=");
                sb.append(this.options);
            }
            if (this.confirm != null) {
                sb.append(", confirm=");
                sb.append(this.confirm);
            }
            if (this.disable != null) {
                sb.append(", disable=");
                sb.append(this.disable);
            }
            if (this.is_loading != null) {
                sb.append(", is_loading=");
                sb.append(this.is_loading);
            }
            StringBuilder replace = sb.replace(0, 2, "SelectMenuProperty{");
            replace.append('}');
            return replace.toString();
        }

        public SelectMenuProperty(Type type2, String str, String str2, String str3, String str4, List<MenuOption> list, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2) {
            this(type2, str, str2, str3, str4, list, buttonConfirmProperty, bool, bool2, ByteString.EMPTY);
        }

        public SelectMenuProperty(Type type2, String str, String str2, String str3, String str4, List<MenuOption> list, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.action_id = str;
            this.place_holder = str2;
            this.place_holder_i18n_key = str3;
            this.initial_option = str4;
            this.options = Internal.immutableCopyOf("options", list);
            this.confirm = buttonConfirmProperty;
            this.disable = bool;
            this.is_loading = bool2;
        }
    }

    public static final class ULProperty extends Message<ULProperty, C15243a> {
        public static final ProtoAdapter<ULProperty> ADAPTER = new C15244b();
        public static final Type DEFAULT_TYPE = Type.DISC;
        private static final long serialVersionUID = 0;
        public final Type type;

        public enum Type implements WireEnum {
            DISC(0),
            CIRCLE(1),
            SQUARE(2),
            NONE(3);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return DISC;
                }
                if (i == 1) {
                    return CIRCLE;
                }
                if (i == 2) {
                    return SQUARE;
                }
                if (i != 3) {
                    return null;
                }
                return NONE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ULProperty$b */
        private static final class C15244b extends ProtoAdapter<ULProperty> {
            C15244b() {
                super(FieldEncoding.LENGTH_DELIMITED, ULProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ULProperty uLProperty) {
                int i;
                if (uLProperty.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, uLProperty.type);
                } else {
                    i = 0;
                }
                return i + uLProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ULProperty decode(ProtoReader protoReader) throws IOException {
                C15243a aVar = new C15243a();
                aVar.f40419a = Type.DISC;
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
                        try {
                            aVar.f40419a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ULProperty uLProperty) throws IOException {
                if (uLProperty.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, uLProperty.type);
                }
                protoWriter.writeBytes(uLProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ULProperty$a */
        public static final class C15243a extends Message.Builder<ULProperty, C15243a> {

            /* renamed from: a */
            public Type f40419a;

            /* renamed from: a */
            public ULProperty build() {
                return new ULProperty(this.f40419a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15243a newBuilder() {
            C15243a aVar = new C15243a();
            aVar.f40419a = this.type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ULProperty");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            StringBuilder replace = sb.replace(0, 2, "ULProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ULProperty(Type type2) {
            this(type2, ByteString.EMPTY);
        }

        public ULProperty(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
        }
    }

    public enum Tag implements WireEnum {
        UNKNOWN(0),
        TEXT(1),
        IMG(2),
        P(3),
        FIGURE(4),
        AT(5),
        A(6),
        B(7),
        I(8),
        U(9),
        EMOTION(10),
        BUTTON(11),
        SELECT(12),
        PROGRESSSELECT(13),
        DIV(14),
        TEXTABLEAREA(15),
        TIME(16),
        LINK(17),
        MEDIA(18),
        SELECTMENU(19),
        OVERFLOWMENU(20),
        DATEPICKER(21),
        DOCS(22),
        H1(23),
        H2(24),
        H3(25),
        UL(26),
        OL(27),
        LI(28),
        QUOTE(29),
        CODE(30),
        CODE_BLOCK(31),
        HR(32),
        TIMEPICKER(33),
        DATETIMEPICKER(34),
        REACTION(35),
        MENTION(36);
        
        public static final ProtoAdapter<Tag> ADAPTER = ProtoAdapter.newEnumAdapter(Tag.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Tag fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return TEXT;
                case 2:
                    return IMG;
                case 3:
                    return P;
                case 4:
                    return FIGURE;
                case 5:
                    return AT;
                case 6:
                    return A;
                case 7:
                    return B;
                case 8:
                    return I;
                case 9:
                    return U;
                case 10:
                    return EMOTION;
                case 11:
                    return BUTTON;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return SELECT;
                case 13:
                    return PROGRESSSELECT;
                case 14:
                    return DIV;
                case 15:
                    return TEXTABLEAREA;
                case 16:
                    return TIME;
                case 17:
                    return LINK;
                case 18:
                    return MEDIA;
                case 19:
                    return SELECTMENU;
                case 20:
                    return OVERFLOWMENU;
                case 21:
                    return DATEPICKER;
                case 22:
                    return DOCS;
                case 23:
                    return H1;
                case 24:
                    return H2;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                    return H3;
                case 26:
                    return UL;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                    return OL;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    return LI;
                case 29:
                    return QUOTE;
                case 30:
                    return CODE;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    return CODE_BLOCK;
                case 32:
                    return HR;
                case 33:
                    return TIMEPICKER;
                case 34:
                    return DATETIMEPICKER;
                case 35:
                    return REACTION;
                case 36:
                    return MENTION;
                default:
                    return null;
            }
        }

        private Tag(int i) {
            this.value = i;
        }
    }

    public static final class PropertySet extends Message<PropertySet, C15225a> {
        public static final ProtoAdapter<PropertySet> ADAPTER = new C15226b();
        private static final long serialVersionUID = 0;
        public final AnchorProperty anchor;
        public final AtProperty at;
        public final BoldProperty bold;
        public final ButtonProperty button;
        public final CodeProperty code;
        public final CodeBlockProperty code_block;
        public final DatePickerProperty date_picker;
        public final DatetimePickerProperty datetime_picker;
        public final DivProperty div;
        public final DocsProperty docs;
        public final EmotionProperty emotion;
        public final FigureProperty figure;
        public final H1Property h1;
        public final H2Property h2;
        public final H3Property h3;
        public final HRProperty hr;
        public final ImageProperty image;
        public final ItalicProperty italic;
        public final LIProperty li;
        public final LinkProperty link;
        public final MediaProperty media;
        public final MentionProperty mention;
        public final OLProperty ol;
        public final OverflowMenuProperty overflow_menu;
        public final ParagraphProperty paragraph;
        public final ProgressSelectOptionProperty progress;
        public final QuoteProperty quote;
        public final ReactionProperty reaction;
        public final SelectProperty select;
        public final SelectMenuProperty select_menu;
        public final TextProperty text;
        public final TextableAreaProperty textable_area;
        public final TimeProperty time;
        public final TimePickerProperty time_picker;
        public final ULProperty ul;
        public final UnderlineProperty underline;
        public final UnknownProperty unknown;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$PropertySet$a */
        public static final class C15225a extends Message.Builder<PropertySet, C15225a> {

            /* renamed from: A */
            public OLProperty f40352A;

            /* renamed from: B */
            public LIProperty f40353B;

            /* renamed from: C */
            public QuoteProperty f40354C;

            /* renamed from: D */
            public CodeProperty f40355D;

            /* renamed from: E */
            public CodeBlockProperty f40356E;

            /* renamed from: F */
            public HRProperty f40357F;

            /* renamed from: G */
            public TimePickerProperty f40358G;

            /* renamed from: H */
            public DatetimePickerProperty f40359H;

            /* renamed from: I */
            public ReactionProperty f40360I;

            /* renamed from: J */
            public MentionProperty f40361J;

            /* renamed from: K */
            public UnknownProperty f40362K;

            /* renamed from: a */
            public ParagraphProperty f40363a;

            /* renamed from: b */
            public FigureProperty f40364b;

            /* renamed from: c */
            public TextProperty f40365c;

            /* renamed from: d */
            public ItalicProperty f40366d;

            /* renamed from: e */
            public BoldProperty f40367e;

            /* renamed from: f */
            public UnderlineProperty f40368f;

            /* renamed from: g */
            public AnchorProperty f40369g;

            /* renamed from: h */
            public AtProperty f40370h;

            /* renamed from: i */
            public ImageProperty f40371i;

            /* renamed from: j */
            public EmotionProperty f40372j;

            /* renamed from: k */
            public ButtonProperty f40373k;

            /* renamed from: l */
            public SelectProperty f40374l;

            /* renamed from: m */
            public ProgressSelectOptionProperty f40375m;

            /* renamed from: n */
            public DivProperty f40376n;

            /* renamed from: o */
            public TextableAreaProperty f40377o;

            /* renamed from: p */
            public TimeProperty f40378p;

            /* renamed from: q */
            public LinkProperty f40379q;

            /* renamed from: r */
            public MediaProperty f40380r;

            /* renamed from: s */
            public SelectMenuProperty f40381s;

            /* renamed from: t */
            public OverflowMenuProperty f40382t;

            /* renamed from: u */
            public DatePickerProperty f40383u;

            /* renamed from: v */
            public DocsProperty f40384v;

            /* renamed from: w */
            public H1Property f40385w;

            /* renamed from: x */
            public H2Property f40386x;

            /* renamed from: y */
            public H3Property f40387y;

            /* renamed from: z */
            public ULProperty f40388z;

            /* renamed from: a */
            public C15225a mo55453a(ParagraphProperty paragraphProperty) {
                this.f40363a = paragraphProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55455a(TextProperty textProperty) {
                this.f40365c = textProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55457a(UnderlineProperty underlineProperty) {
                this.f40368f = underlineProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55450a(MediaProperty mediaProperty) {
                this.f40380r = mediaProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55454a(SelectMenuProperty selectMenuProperty) {
                this.f40381s = selectMenuProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55452a(OverflowMenuProperty overflowMenuProperty) {
                this.f40382t = overflowMenuProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55456a(TimePickerProperty timePickerProperty) {
                this.f40358G = timePickerProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55451a(MentionProperty mentionProperty) {
                this.f40361J = mentionProperty;
                return this;
            }

            /* renamed from: a */
            public PropertySet build() {
                return new PropertySet(this.f40363a, this.f40364b, this.f40365c, this.f40366d, this.f40367e, this.f40368f, this.f40369g, this.f40370h, this.f40371i, this.f40372j, this.f40373k, this.f40374l, this.f40375m, this.f40376n, this.f40377o, this.f40378p, this.f40379q, this.f40380r, this.f40381s, this.f40382t, this.f40383u, this.f40384v, this.f40385w, this.f40386x, this.f40387y, this.f40388z, this.f40352A, this.f40353B, this.f40354C, this.f40355D, this.f40356E, this.f40357F, this.f40358G, this.f40359H, this.f40360I, this.f40361J, this.f40362K, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15225a mo55440a(AnchorProperty anchorProperty) {
                this.f40369g = anchorProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55441a(AtProperty atProperty) {
                this.f40370h = atProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55442a(BoldProperty boldProperty) {
                this.f40367e = boldProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55443a(ButtonProperty buttonProperty) {
                this.f40373k = buttonProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55444a(DatePickerProperty datePickerProperty) {
                this.f40383u = datePickerProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55445a(DatetimePickerProperty datetimePickerProperty) {
                this.f40359H = datetimePickerProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55446a(EmotionProperty emotionProperty) {
                this.f40372j = emotionProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55447a(FigureProperty figureProperty) {
                this.f40364b = figureProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55448a(ImageProperty imageProperty) {
                this.f40371i = imageProperty;
                return this;
            }

            /* renamed from: a */
            public C15225a mo55449a(ItalicProperty italicProperty) {
                this.f40366d = italicProperty;
                return this;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$PropertySet$b */
        private static final class C15226b extends ProtoAdapter<PropertySet> {
            C15226b() {
                super(FieldEncoding.LENGTH_DELIMITED, PropertySet.class);
            }

            /* renamed from: a */
            public int encodedSize(PropertySet propertySet) {
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
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29;
                int i30;
                int i31;
                int i32;
                int i33;
                int i34;
                int i35;
                int i36;
                int i37 = 0;
                if (propertySet.paragraph != null) {
                    i = ParagraphProperty.ADAPTER.encodedSizeWithTag(1, propertySet.paragraph);
                } else {
                    i = 0;
                }
                if (propertySet.figure != null) {
                    i2 = FigureProperty.ADAPTER.encodedSizeWithTag(2, propertySet.figure);
                } else {
                    i2 = 0;
                }
                int i38 = i + i2;
                if (propertySet.text != null) {
                    i3 = TextProperty.ADAPTER.encodedSizeWithTag(3, propertySet.text);
                } else {
                    i3 = 0;
                }
                int i39 = i38 + i3;
                if (propertySet.italic != null) {
                    i4 = ItalicProperty.ADAPTER.encodedSizeWithTag(4, propertySet.italic);
                } else {
                    i4 = 0;
                }
                int i40 = i39 + i4;
                if (propertySet.bold != null) {
                    i5 = BoldProperty.ADAPTER.encodedSizeWithTag(5, propertySet.bold);
                } else {
                    i5 = 0;
                }
                int i41 = i40 + i5;
                if (propertySet.underline != null) {
                    i6 = UnderlineProperty.ADAPTER.encodedSizeWithTag(6, propertySet.underline);
                } else {
                    i6 = 0;
                }
                int i42 = i41 + i6;
                if (propertySet.anchor != null) {
                    i7 = AnchorProperty.ADAPTER.encodedSizeWithTag(7, propertySet.anchor);
                } else {
                    i7 = 0;
                }
                int i43 = i42 + i7;
                if (propertySet.at != null) {
                    i8 = AtProperty.ADAPTER.encodedSizeWithTag(8, propertySet.at);
                } else {
                    i8 = 0;
                }
                int i44 = i43 + i8;
                if (propertySet.image != null) {
                    i9 = ImageProperty.ADAPTER.encodedSizeWithTag(9, propertySet.image);
                } else {
                    i9 = 0;
                }
                int i45 = i44 + i9;
                if (propertySet.emotion != null) {
                    i10 = EmotionProperty.ADAPTER.encodedSizeWithTag(10, propertySet.emotion);
                } else {
                    i10 = 0;
                }
                int i46 = i45 + i10;
                if (propertySet.button != null) {
                    i11 = ButtonProperty.ADAPTER.encodedSizeWithTag(11, propertySet.button);
                } else {
                    i11 = 0;
                }
                int i47 = i46 + i11;
                if (propertySet.select != null) {
                    i12 = SelectProperty.ADAPTER.encodedSizeWithTag(12, propertySet.select);
                } else {
                    i12 = 0;
                }
                int i48 = i47 + i12;
                if (propertySet.progress != null) {
                    i13 = ProgressSelectOptionProperty.ADAPTER.encodedSizeWithTag(13, propertySet.progress);
                } else {
                    i13 = 0;
                }
                int i49 = i48 + i13;
                if (propertySet.div != null) {
                    i14 = DivProperty.ADAPTER.encodedSizeWithTag(14, propertySet.div);
                } else {
                    i14 = 0;
                }
                int i50 = i49 + i14;
                if (propertySet.textable_area != null) {
                    i15 = TextableAreaProperty.ADAPTER.encodedSizeWithTag(15, propertySet.textable_area);
                } else {
                    i15 = 0;
                }
                int i51 = i50 + i15;
                if (propertySet.time != null) {
                    i16 = TimeProperty.ADAPTER.encodedSizeWithTag(16, propertySet.time);
                } else {
                    i16 = 0;
                }
                int i52 = i51 + i16;
                if (propertySet.link != null) {
                    i17 = LinkProperty.ADAPTER.encodedSizeWithTag(17, propertySet.link);
                } else {
                    i17 = 0;
                }
                int i53 = i52 + i17;
                if (propertySet.media != null) {
                    i18 = MediaProperty.ADAPTER.encodedSizeWithTag(18, propertySet.media);
                } else {
                    i18 = 0;
                }
                int i54 = i53 + i18;
                if (propertySet.select_menu != null) {
                    i19 = SelectMenuProperty.ADAPTER.encodedSizeWithTag(19, propertySet.select_menu);
                } else {
                    i19 = 0;
                }
                int i55 = i54 + i19;
                if (propertySet.overflow_menu != null) {
                    i20 = OverflowMenuProperty.ADAPTER.encodedSizeWithTag(20, propertySet.overflow_menu);
                } else {
                    i20 = 0;
                }
                int i56 = i55 + i20;
                if (propertySet.date_picker != null) {
                    i21 = DatePickerProperty.ADAPTER.encodedSizeWithTag(21, propertySet.date_picker);
                } else {
                    i21 = 0;
                }
                int i57 = i56 + i21;
                if (propertySet.docs != null) {
                    i22 = DocsProperty.ADAPTER.encodedSizeWithTag(22, propertySet.docs);
                } else {
                    i22 = 0;
                }
                int i58 = i57 + i22;
                if (propertySet.h1 != null) {
                    i23 = H1Property.ADAPTER.encodedSizeWithTag(23, propertySet.h1);
                } else {
                    i23 = 0;
                }
                int i59 = i58 + i23;
                if (propertySet.h2 != null) {
                    i24 = H2Property.ADAPTER.encodedSizeWithTag(24, propertySet.h2);
                } else {
                    i24 = 0;
                }
                int i60 = i59 + i24;
                if (propertySet.h3 != null) {
                    i25 = H3Property.ADAPTER.encodedSizeWithTag(25, propertySet.h3);
                } else {
                    i25 = 0;
                }
                int i61 = i60 + i25;
                if (propertySet.ul != null) {
                    i26 = ULProperty.ADAPTER.encodedSizeWithTag(26, propertySet.ul);
                } else {
                    i26 = 0;
                }
                int i62 = i61 + i26;
                if (propertySet.ol != null) {
                    i27 = OLProperty.ADAPTER.encodedSizeWithTag(27, propertySet.ol);
                } else {
                    i27 = 0;
                }
                int i63 = i62 + i27;
                if (propertySet.li != null) {
                    i28 = LIProperty.ADAPTER.encodedSizeWithTag(28, propertySet.li);
                } else {
                    i28 = 0;
                }
                int i64 = i63 + i28;
                if (propertySet.quote != null) {
                    i29 = QuoteProperty.ADAPTER.encodedSizeWithTag(29, propertySet.quote);
                } else {
                    i29 = 0;
                }
                int i65 = i64 + i29;
                if (propertySet.code != null) {
                    i30 = CodeProperty.ADAPTER.encodedSizeWithTag(30, propertySet.code);
                } else {
                    i30 = 0;
                }
                int i66 = i65 + i30;
                if (propertySet.code_block != null) {
                    i31 = CodeBlockProperty.ADAPTER.encodedSizeWithTag(31, propertySet.code_block);
                } else {
                    i31 = 0;
                }
                int i67 = i66 + i31;
                if (propertySet.hr != null) {
                    i32 = HRProperty.ADAPTER.encodedSizeWithTag(32, propertySet.hr);
                } else {
                    i32 = 0;
                }
                int i68 = i67 + i32;
                if (propertySet.time_picker != null) {
                    i33 = TimePickerProperty.ADAPTER.encodedSizeWithTag(33, propertySet.time_picker);
                } else {
                    i33 = 0;
                }
                int i69 = i68 + i33;
                if (propertySet.datetime_picker != null) {
                    i34 = DatetimePickerProperty.ADAPTER.encodedSizeWithTag(34, propertySet.datetime_picker);
                } else {
                    i34 = 0;
                }
                int i70 = i69 + i34;
                if (propertySet.reaction != null) {
                    i35 = ReactionProperty.ADAPTER.encodedSizeWithTag(35, propertySet.reaction);
                } else {
                    i35 = 0;
                }
                int i71 = i70 + i35;
                if (propertySet.mention != null) {
                    i36 = MentionProperty.ADAPTER.encodedSizeWithTag(36, propertySet.mention);
                } else {
                    i36 = 0;
                }
                int i72 = i71 + i36;
                if (propertySet.unknown != null) {
                    i37 = UnknownProperty.ADAPTER.encodedSizeWithTag(404, propertySet.unknown);
                }
                return i72 + i37 + propertySet.unknownFields().size();
            }

            /* renamed from: a */
            public PropertySet decode(ProtoReader protoReader) throws IOException {
                C15225a aVar = new C15225a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 404) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40363a = ParagraphProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 2:
                                aVar.f40364b = FigureProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 3:
                                aVar.f40365c = TextProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 4:
                                aVar.f40366d = ItalicProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 5:
                                aVar.f40367e = BoldProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 6:
                                aVar.f40368f = UnderlineProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 7:
                                aVar.f40369g = AnchorProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 8:
                                aVar.f40370h = AtProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 9:
                                aVar.f40371i = ImageProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 10:
                                aVar.f40372j = EmotionProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 11:
                                aVar.f40373k = ButtonProperty.ADAPTER.decode(protoReader);
                                continue;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f40374l = SelectProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 13:
                                aVar.f40375m = ProgressSelectOptionProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 14:
                                aVar.f40376n = DivProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 15:
                                aVar.f40377o = TextableAreaProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 16:
                                aVar.f40378p = TimeProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 17:
                                aVar.f40379q = LinkProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 18:
                                aVar.f40380r = MediaProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 19:
                                aVar.f40381s = SelectMenuProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 20:
                                aVar.f40382t = OverflowMenuProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 21:
                                aVar.f40383u = DatePickerProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 22:
                                aVar.f40384v = DocsProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 23:
                                aVar.f40385w = H1Property.ADAPTER.decode(protoReader);
                                continue;
                            case 24:
                                aVar.f40386x = H2Property.ADAPTER.decode(protoReader);
                                continue;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                aVar.f40387y = H3Property.ADAPTER.decode(protoReader);
                                continue;
                            case 26:
                                aVar.f40388z = ULProperty.ADAPTER.decode(protoReader);
                                continue;
                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                aVar.f40352A = OLProperty.ADAPTER.decode(protoReader);
                                continue;
                            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                aVar.f40353B = LIProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 29:
                                aVar.f40354C = QuoteProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 30:
                                aVar.f40355D = CodeProperty.ADAPTER.decode(protoReader);
                                continue;
                            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                aVar.f40356E = CodeBlockProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 32:
                                aVar.f40357F = HRProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 33:
                                aVar.f40358G = TimePickerProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 34:
                                aVar.f40359H = DatetimePickerProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 35:
                                aVar.f40360I = ReactionProperty.ADAPTER.decode(protoReader);
                                continue;
                            case 36:
                                aVar.f40361J = MentionProperty.ADAPTER.decode(protoReader);
                                continue;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                continue;
                        }
                    } else {
                        aVar.f40362K = UnknownProperty.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PropertySet propertySet) throws IOException {
                if (propertySet.paragraph != null) {
                    ParagraphProperty.ADAPTER.encodeWithTag(protoWriter, 1, propertySet.paragraph);
                }
                if (propertySet.figure != null) {
                    FigureProperty.ADAPTER.encodeWithTag(protoWriter, 2, propertySet.figure);
                }
                if (propertySet.text != null) {
                    TextProperty.ADAPTER.encodeWithTag(protoWriter, 3, propertySet.text);
                }
                if (propertySet.italic != null) {
                    ItalicProperty.ADAPTER.encodeWithTag(protoWriter, 4, propertySet.italic);
                }
                if (propertySet.bold != null) {
                    BoldProperty.ADAPTER.encodeWithTag(protoWriter, 5, propertySet.bold);
                }
                if (propertySet.underline != null) {
                    UnderlineProperty.ADAPTER.encodeWithTag(protoWriter, 6, propertySet.underline);
                }
                if (propertySet.anchor != null) {
                    AnchorProperty.ADAPTER.encodeWithTag(protoWriter, 7, propertySet.anchor);
                }
                if (propertySet.at != null) {
                    AtProperty.ADAPTER.encodeWithTag(protoWriter, 8, propertySet.at);
                }
                if (propertySet.image != null) {
                    ImageProperty.ADAPTER.encodeWithTag(protoWriter, 9, propertySet.image);
                }
                if (propertySet.emotion != null) {
                    EmotionProperty.ADAPTER.encodeWithTag(protoWriter, 10, propertySet.emotion);
                }
                if (propertySet.button != null) {
                    ButtonProperty.ADAPTER.encodeWithTag(protoWriter, 11, propertySet.button);
                }
                if (propertySet.select != null) {
                    SelectProperty.ADAPTER.encodeWithTag(protoWriter, 12, propertySet.select);
                }
                if (propertySet.progress != null) {
                    ProgressSelectOptionProperty.ADAPTER.encodeWithTag(protoWriter, 13, propertySet.progress);
                }
                if (propertySet.div != null) {
                    DivProperty.ADAPTER.encodeWithTag(protoWriter, 14, propertySet.div);
                }
                if (propertySet.textable_area != null) {
                    TextableAreaProperty.ADAPTER.encodeWithTag(protoWriter, 15, propertySet.textable_area);
                }
                if (propertySet.time != null) {
                    TimeProperty.ADAPTER.encodeWithTag(protoWriter, 16, propertySet.time);
                }
                if (propertySet.link != null) {
                    LinkProperty.ADAPTER.encodeWithTag(protoWriter, 17, propertySet.link);
                }
                if (propertySet.media != null) {
                    MediaProperty.ADAPTER.encodeWithTag(protoWriter, 18, propertySet.media);
                }
                if (propertySet.select_menu != null) {
                    SelectMenuProperty.ADAPTER.encodeWithTag(protoWriter, 19, propertySet.select_menu);
                }
                if (propertySet.overflow_menu != null) {
                    OverflowMenuProperty.ADAPTER.encodeWithTag(protoWriter, 20, propertySet.overflow_menu);
                }
                if (propertySet.date_picker != null) {
                    DatePickerProperty.ADAPTER.encodeWithTag(protoWriter, 21, propertySet.date_picker);
                }
                if (propertySet.docs != null) {
                    DocsProperty.ADAPTER.encodeWithTag(protoWriter, 22, propertySet.docs);
                }
                if (propertySet.h1 != null) {
                    H1Property.ADAPTER.encodeWithTag(protoWriter, 23, propertySet.h1);
                }
                if (propertySet.h2 != null) {
                    H2Property.ADAPTER.encodeWithTag(protoWriter, 24, propertySet.h2);
                }
                if (propertySet.h3 != null) {
                    H3Property.ADAPTER.encodeWithTag(protoWriter, 25, propertySet.h3);
                }
                if (propertySet.ul != null) {
                    ULProperty.ADAPTER.encodeWithTag(protoWriter, 26, propertySet.ul);
                }
                if (propertySet.ol != null) {
                    OLProperty.ADAPTER.encodeWithTag(protoWriter, 27, propertySet.ol);
                }
                if (propertySet.li != null) {
                    LIProperty.ADAPTER.encodeWithTag(protoWriter, 28, propertySet.li);
                }
                if (propertySet.quote != null) {
                    QuoteProperty.ADAPTER.encodeWithTag(protoWriter, 29, propertySet.quote);
                }
                if (propertySet.code != null) {
                    CodeProperty.ADAPTER.encodeWithTag(protoWriter, 30, propertySet.code);
                }
                if (propertySet.code_block != null) {
                    CodeBlockProperty.ADAPTER.encodeWithTag(protoWriter, 31, propertySet.code_block);
                }
                if (propertySet.hr != null) {
                    HRProperty.ADAPTER.encodeWithTag(protoWriter, 32, propertySet.hr);
                }
                if (propertySet.time_picker != null) {
                    TimePickerProperty.ADAPTER.encodeWithTag(protoWriter, 33, propertySet.time_picker);
                }
                if (propertySet.datetime_picker != null) {
                    DatetimePickerProperty.ADAPTER.encodeWithTag(protoWriter, 34, propertySet.datetime_picker);
                }
                if (propertySet.reaction != null) {
                    ReactionProperty.ADAPTER.encodeWithTag(protoWriter, 35, propertySet.reaction);
                }
                if (propertySet.mention != null) {
                    MentionProperty.ADAPTER.encodeWithTag(protoWriter, 36, propertySet.mention);
                }
                if (propertySet.unknown != null) {
                    UnknownProperty.ADAPTER.encodeWithTag(protoWriter, 404, propertySet.unknown);
                }
                protoWriter.writeBytes(propertySet.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15225a newBuilder() {
            C15225a aVar = new C15225a();
            aVar.f40363a = this.paragraph;
            aVar.f40364b = this.figure;
            aVar.f40365c = this.text;
            aVar.f40366d = this.italic;
            aVar.f40367e = this.bold;
            aVar.f40368f = this.underline;
            aVar.f40369g = this.anchor;
            aVar.f40370h = this.at;
            aVar.f40371i = this.image;
            aVar.f40372j = this.emotion;
            aVar.f40373k = this.button;
            aVar.f40374l = this.select;
            aVar.f40375m = this.progress;
            aVar.f40376n = this.div;
            aVar.f40377o = this.textable_area;
            aVar.f40378p = this.time;
            aVar.f40379q = this.link;
            aVar.f40380r = this.media;
            aVar.f40381s = this.select_menu;
            aVar.f40382t = this.overflow_menu;
            aVar.f40383u = this.date_picker;
            aVar.f40384v = this.docs;
            aVar.f40385w = this.h1;
            aVar.f40386x = this.h2;
            aVar.f40387y = this.h3;
            aVar.f40388z = this.ul;
            aVar.f40352A = this.ol;
            aVar.f40353B = this.li;
            aVar.f40354C = this.quote;
            aVar.f40355D = this.code;
            aVar.f40356E = this.code_block;
            aVar.f40357F = this.hr;
            aVar.f40358G = this.time_picker;
            aVar.f40359H = this.datetime_picker;
            aVar.f40360I = this.reaction;
            aVar.f40361J = this.mention;
            aVar.f40362K = this.unknown;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "PropertySet");
            StringBuilder sb = new StringBuilder();
            if (this.paragraph != null) {
                sb.append(", paragraph=");
                sb.append(this.paragraph);
            }
            if (this.figure != null) {
                sb.append(", figure=");
                sb.append(this.figure);
            }
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.italic != null) {
                sb.append(", italic=");
                sb.append(this.italic);
            }
            if (this.bold != null) {
                sb.append(", bold=");
                sb.append(this.bold);
            }
            if (this.underline != null) {
                sb.append(", underline=");
                sb.append(this.underline);
            }
            if (this.anchor != null) {
                sb.append(", anchor=");
                sb.append(this.anchor);
            }
            if (this.at != null) {
                sb.append(", at=");
                sb.append(this.at);
            }
            if (this.image != null) {
                sb.append(", image=");
                sb.append(this.image);
            }
            if (this.emotion != null) {
                sb.append(", emotion=");
                sb.append(this.emotion);
            }
            if (this.button != null) {
                sb.append(", button=");
                sb.append(this.button);
            }
            if (this.select != null) {
                sb.append(", select=");
                sb.append(this.select);
            }
            if (this.progress != null) {
                sb.append(", progress=");
                sb.append(this.progress);
            }
            if (this.div != null) {
                sb.append(", div=");
                sb.append(this.div);
            }
            if (this.textable_area != null) {
                sb.append(", textable_area=");
                sb.append(this.textable_area);
            }
            if (this.time != null) {
                sb.append(", time=");
                sb.append(this.time);
            }
            if (this.link != null) {
                sb.append(", link=");
                sb.append(this.link);
            }
            if (this.media != null) {
                sb.append(", media=");
                sb.append(this.media);
            }
            if (this.select_menu != null) {
                sb.append(", select_menu=");
                sb.append(this.select_menu);
            }
            if (this.overflow_menu != null) {
                sb.append(", overflow_menu=");
                sb.append(this.overflow_menu);
            }
            if (this.date_picker != null) {
                sb.append(", date_picker=");
                sb.append(this.date_picker);
            }
            if (this.docs != null) {
                sb.append(", docs=");
                sb.append(this.docs);
            }
            if (this.h1 != null) {
                sb.append(", h1=");
                sb.append(this.h1);
            }
            if (this.h2 != null) {
                sb.append(", h2=");
                sb.append(this.h2);
            }
            if (this.h3 != null) {
                sb.append(", h3=");
                sb.append(this.h3);
            }
            if (this.ul != null) {
                sb.append(", ul=");
                sb.append(this.ul);
            }
            if (this.ol != null) {
                sb.append(", ol=");
                sb.append(this.ol);
            }
            if (this.li != null) {
                sb.append(", li=");
                sb.append(this.li);
            }
            if (this.quote != null) {
                sb.append(", quote=");
                sb.append(this.quote);
            }
            if (this.code != null) {
                sb.append(", code=");
                sb.append(this.code);
            }
            if (this.code_block != null) {
                sb.append(", code_block=");
                sb.append(this.code_block);
            }
            if (this.hr != null) {
                sb.append(", hr=");
                sb.append(this.hr);
            }
            if (this.time_picker != null) {
                sb.append(", time_picker=");
                sb.append(this.time_picker);
            }
            if (this.datetime_picker != null) {
                sb.append(", datetime_picker=");
                sb.append(this.datetime_picker);
            }
            if (this.reaction != null) {
                sb.append(", reaction=");
                sb.append(this.reaction);
            }
            if (this.mention != null) {
                sb.append(", mention=");
                sb.append(this.mention);
            }
            if (this.unknown != null) {
                sb.append(", unknown=");
                sb.append(this.unknown);
            }
            StringBuilder replace = sb.replace(0, 2, "PropertySet{");
            replace.append('}');
            return replace.toString();
        }

        public PropertySet(ParagraphProperty paragraphProperty, FigureProperty figureProperty, TextProperty textProperty, ItalicProperty italicProperty, BoldProperty boldProperty, UnderlineProperty underlineProperty, AnchorProperty anchorProperty, AtProperty atProperty, ImageProperty imageProperty, EmotionProperty emotionProperty, ButtonProperty buttonProperty, SelectProperty selectProperty, ProgressSelectOptionProperty progressSelectOptionProperty, DivProperty divProperty, TextableAreaProperty textableAreaProperty, TimeProperty timeProperty, LinkProperty linkProperty, MediaProperty mediaProperty, SelectMenuProperty selectMenuProperty, OverflowMenuProperty overflowMenuProperty, DatePickerProperty datePickerProperty, DocsProperty docsProperty, H1Property h1Property, H2Property h2Property, H3Property h3Property, ULProperty uLProperty, OLProperty oLProperty, LIProperty lIProperty, QuoteProperty quoteProperty, CodeProperty codeProperty, CodeBlockProperty codeBlockProperty, HRProperty hRProperty, TimePickerProperty timePickerProperty, DatetimePickerProperty datetimePickerProperty, ReactionProperty reactionProperty, MentionProperty mentionProperty, UnknownProperty unknownProperty) {
            this(paragraphProperty, figureProperty, textProperty, italicProperty, boldProperty, underlineProperty, anchorProperty, atProperty, imageProperty, emotionProperty, buttonProperty, selectProperty, progressSelectOptionProperty, divProperty, textableAreaProperty, timeProperty, linkProperty, mediaProperty, selectMenuProperty, overflowMenuProperty, datePickerProperty, docsProperty, h1Property, h2Property, h3Property, uLProperty, oLProperty, lIProperty, quoteProperty, codeProperty, codeBlockProperty, hRProperty, timePickerProperty, datetimePickerProperty, reactionProperty, mentionProperty, unknownProperty, ByteString.EMPTY);
        }

        public PropertySet(ParagraphProperty paragraphProperty, FigureProperty figureProperty, TextProperty textProperty, ItalicProperty italicProperty, BoldProperty boldProperty, UnderlineProperty underlineProperty, AnchorProperty anchorProperty, AtProperty atProperty, ImageProperty imageProperty, EmotionProperty emotionProperty, ButtonProperty buttonProperty, SelectProperty selectProperty, ProgressSelectOptionProperty progressSelectOptionProperty, DivProperty divProperty, TextableAreaProperty textableAreaProperty, TimeProperty timeProperty, LinkProperty linkProperty, MediaProperty mediaProperty, SelectMenuProperty selectMenuProperty, OverflowMenuProperty overflowMenuProperty, DatePickerProperty datePickerProperty, DocsProperty docsProperty, H1Property h1Property, H2Property h2Property, H3Property h3Property, ULProperty uLProperty, OLProperty oLProperty, LIProperty lIProperty, QuoteProperty quoteProperty, CodeProperty codeProperty, CodeBlockProperty codeBlockProperty, HRProperty hRProperty, TimePickerProperty timePickerProperty, DatetimePickerProperty datetimePickerProperty, ReactionProperty reactionProperty, MentionProperty mentionProperty, UnknownProperty unknownProperty, ByteString byteString) {
            super(ADAPTER, byteString);
            this.paragraph = paragraphProperty;
            this.figure = figureProperty;
            this.text = textProperty;
            this.italic = italicProperty;
            this.bold = boldProperty;
            this.underline = underlineProperty;
            this.anchor = anchorProperty;
            this.at = atProperty;
            this.image = imageProperty;
            this.emotion = emotionProperty;
            this.button = buttonProperty;
            this.select = selectProperty;
            this.progress = progressSelectOptionProperty;
            this.div = divProperty;
            this.textable_area = textableAreaProperty;
            this.time = timeProperty;
            this.link = linkProperty;
            this.media = mediaProperty;
            this.select_menu = selectMenuProperty;
            this.overflow_menu = overflowMenuProperty;
            this.date_picker = datePickerProperty;
            this.docs = docsProperty;
            this.h1 = h1Property;
            this.h2 = h2Property;
            this.h3 = h3Property;
            this.ul = uLProperty;
            this.ol = oLProperty;
            this.li = lIProperty;
            this.quote = quoteProperty;
            this.code = codeProperty;
            this.code_block = codeBlockProperty;
            this.hr = hRProperty;
            this.time_picker = timePickerProperty;
            this.datetime_picker = datetimePickerProperty;
            this.reaction = reactionProperty;
            this.mention = mentionProperty;
            this.unknown = unknownProperty;
        }
    }

    public static final class AnchorProperty extends Message<AnchorProperty, C15161a> {
        public static final ProtoAdapter<AnchorProperty> ADAPTER = new C15162b();
        public static final SpecialURL DEFAULT_SPECIAL_URL = SpecialURL.UNKNOWN_URL;
        private static final long serialVersionUID = 0;
        public final String android_href;
        public final String content;
        public final String href;
        public final String i18n_key;
        public final String ios_href;
        public final String pc_href;
        public final SpecialURL special_url;
        public final String text_content;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$AnchorProperty$b */
        private static final class C15162b extends ProtoAdapter<AnchorProperty> {
            C15162b() {
                super(FieldEncoding.LENGTH_DELIMITED, AnchorProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(AnchorProperty anchorProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, anchorProperty.href) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorProperty.content);
                int i6 = 0;
                if (anchorProperty.text_content != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, anchorProperty.text_content);
                } else {
                    i = 0;
                }
                int i7 = encodedSizeWithTag + i;
                if (anchorProperty.special_url != null) {
                    i2 = SpecialURL.ADAPTER.encodedSizeWithTag(4, anchorProperty.special_url);
                } else {
                    i2 = 0;
                }
                int i8 = i7 + i2;
                if (anchorProperty.i18n_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, anchorProperty.i18n_key);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (anchorProperty.ios_href != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, anchorProperty.ios_href);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (anchorProperty.android_href != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, anchorProperty.android_href);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (anchorProperty.pc_href != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, anchorProperty.pc_href);
                }
                return i11 + i6 + anchorProperty.unknownFields().size();
            }

            /* renamed from: a */
            public AnchorProperty decode(ProtoReader protoReader) throws IOException {
                C15161a aVar = new C15161a();
                aVar.f40224a = "";
                aVar.f40225b = "";
                aVar.f40226c = "";
                aVar.f40227d = SpecialURL.UNKNOWN_URL;
                aVar.f40228e = "";
                aVar.f40229f = "";
                aVar.f40230g = "";
                aVar.f40231h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40224a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40225b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40226c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                try {
                                    aVar.f40227d = SpecialURL.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 5:
                                aVar.f40228e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40229f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40230g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40231h = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, AnchorProperty anchorProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorProperty.href);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorProperty.content);
                if (anchorProperty.text_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, anchorProperty.text_content);
                }
                if (anchorProperty.special_url != null) {
                    SpecialURL.ADAPTER.encodeWithTag(protoWriter, 4, anchorProperty.special_url);
                }
                if (anchorProperty.i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, anchorProperty.i18n_key);
                }
                if (anchorProperty.ios_href != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, anchorProperty.ios_href);
                }
                if (anchorProperty.android_href != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, anchorProperty.android_href);
                }
                if (anchorProperty.pc_href != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, anchorProperty.pc_href);
                }
                protoWriter.writeBytes(anchorProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$AnchorProperty$a */
        public static final class C15161a extends Message.Builder<AnchorProperty, C15161a> {

            /* renamed from: a */
            public String f40224a;

            /* renamed from: b */
            public String f40225b;

            /* renamed from: c */
            public String f40226c;

            /* renamed from: d */
            public SpecialURL f40227d;

            /* renamed from: e */
            public String f40228e;

            /* renamed from: f */
            public String f40229f;

            /* renamed from: g */
            public String f40230g;

            /* renamed from: h */
            public String f40231h;

            /* renamed from: a */
            public AnchorProperty build() {
                String str;
                String str2 = this.f40224a;
                if (str2 != null && (str = this.f40225b) != null) {
                    return new AnchorProperty(str2, str, this.f40226c, this.f40227d, this.f40228e, this.f40229f, this.f40230g, this.f40231h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "href", this.f40225b, "content");
            }

            /* renamed from: a */
            public C15161a mo55272a(SpecialURL specialURL) {
                this.f40227d = specialURL;
                return this;
            }

            /* renamed from: b */
            public C15161a mo55275b(String str) {
                this.f40225b = str;
                return this;
            }

            /* renamed from: c */
            public C15161a mo55276c(String str) {
                this.f40226c = str;
                return this;
            }

            /* renamed from: d */
            public C15161a mo55277d(String str) {
                this.f40228e = str;
                return this;
            }

            /* renamed from: e */
            public C15161a mo55278e(String str) {
                this.f40229f = str;
                return this;
            }

            /* renamed from: f */
            public C15161a mo55279f(String str) {
                this.f40230g = str;
                return this;
            }

            /* renamed from: g */
            public C15161a mo55280g(String str) {
                this.f40231h = str;
                return this;
            }

            /* renamed from: a */
            public C15161a mo55273a(String str) {
                this.f40224a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15161a newBuilder() {
            C15161a aVar = new C15161a();
            aVar.f40224a = this.href;
            aVar.f40225b = this.content;
            aVar.f40226c = this.text_content;
            aVar.f40227d = this.special_url;
            aVar.f40228e = this.i18n_key;
            aVar.f40229f = this.ios_href;
            aVar.f40230g = this.android_href;
            aVar.f40231h = this.pc_href;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AnchorProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", href=");
            sb.append(this.href);
            sb.append(", content=");
            sb.append(this.content);
            if (this.text_content != null) {
                sb.append(", text_content=");
                sb.append(this.text_content);
            }
            if (this.special_url != null) {
                sb.append(", special_url=");
                sb.append(this.special_url);
            }
            if (this.i18n_key != null) {
                sb.append(", i18n_key=");
                sb.append(this.i18n_key);
            }
            if (this.ios_href != null) {
                sb.append(", ios_href=");
                sb.append(this.ios_href);
            }
            if (this.android_href != null) {
                sb.append(", android_href=");
                sb.append(this.android_href);
            }
            if (this.pc_href != null) {
                sb.append(", pc_href=");
                sb.append(this.pc_href);
            }
            StringBuilder replace = sb.replace(0, 2, "AnchorProperty{");
            replace.append('}');
            return replace.toString();
        }

        public AnchorProperty(String str, String str2, String str3, SpecialURL specialURL, String str4, String str5, String str6, String str7) {
            this(str, str2, str3, specialURL, str4, str5, str6, str7, ByteString.EMPTY);
        }

        public AnchorProperty(String str, String str2, String str3, SpecialURL specialURL, String str4, String str5, String str6, String str7, ByteString byteString) {
            super(ADAPTER, byteString);
            this.href = str;
            this.content = str2;
            this.text_content = str3;
            this.special_url = specialURL;
            this.i18n_key = str4;
            this.ios_href = str5;
            this.android_href = str6;
            this.pc_href = str7;
        }
    }

    public static final class AtProperty extends Message<AtProperty, C15163a> {
        public static final ProtoAdapter<AtProperty> ADAPTER = new C15164b();
        public static final Boolean DEFAULT_IS_ANONYMOUS = false;
        public static final Boolean DEFAULT_IS_OUTER = false;
        private static final long serialVersionUID = 0;
        public final String content;
        public final Boolean is_anonymous;
        public final Boolean is_outer;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$AtProperty$b */
        private static final class C15164b extends ProtoAdapter<AtProperty> {
            C15164b() {
                super(FieldEncoding.LENGTH_DELIMITED, AtProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(AtProperty atProperty) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, atProperty.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, atProperty.content);
                int i2 = 0;
                if (atProperty.is_outer != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(3, atProperty.is_outer);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (atProperty.is_anonymous != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, atProperty.is_anonymous);
                }
                return i3 + i2 + atProperty.unknownFields().size();
            }

            /* renamed from: a */
            public AtProperty decode(ProtoReader protoReader) throws IOException {
                C15163a aVar = new C15163a();
                aVar.f40232a = "";
                aVar.f40233b = "";
                aVar.f40234c = false;
                aVar.f40235d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40232a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40233b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40234c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40235d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AtProperty atProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, atProperty.user_id);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, atProperty.content);
                if (atProperty.is_outer != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, atProperty.is_outer);
                }
                if (atProperty.is_anonymous != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, atProperty.is_anonymous);
                }
                protoWriter.writeBytes(atProperty.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15163a newBuilder() {
            C15163a aVar = new C15163a();
            aVar.f40232a = this.user_id;
            aVar.f40233b = this.content;
            aVar.f40234c = this.is_outer;
            aVar.f40235d = this.is_anonymous;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$AtProperty$a */
        public static final class C15163a extends Message.Builder<AtProperty, C15163a> {

            /* renamed from: a */
            public String f40232a;

            /* renamed from: b */
            public String f40233b;

            /* renamed from: c */
            public Boolean f40234c;

            /* renamed from: d */
            public Boolean f40235d;

            /* renamed from: a */
            public AtProperty build() {
                String str;
                String str2 = this.f40232a;
                if (str2 != null && (str = this.f40233b) != null) {
                    return new AtProperty(str2, str, this.f40234c, this.f40235d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "user_id", this.f40233b, "content");
            }

            /* renamed from: a */
            public C15163a mo55284a(Boolean bool) {
                this.f40234c = bool;
                return this;
            }

            /* renamed from: b */
            public C15163a mo55287b(Boolean bool) {
                this.f40235d = bool;
                return this;
            }

            /* renamed from: a */
            public C15163a mo55285a(String str) {
                this.f40232a = str;
                return this;
            }

            /* renamed from: b */
            public C15163a mo55288b(String str) {
                this.f40233b = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AtProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", user_id=");
            sb.append(this.user_id);
            sb.append(", content=");
            sb.append(this.content);
            if (this.is_outer != null) {
                sb.append(", is_outer=");
                sb.append(this.is_outer);
            }
            if (this.is_anonymous != null) {
                sb.append(", is_anonymous=");
                sb.append(this.is_anonymous);
            }
            StringBuilder replace = sb.replace(0, 2, "AtProperty{");
            replace.append('}');
            return replace.toString();
        }

        public AtProperty(String str, String str2, Boolean bool, Boolean bool2) {
            this(str, str2, bool, bool2, ByteString.EMPTY);
        }

        public AtProperty(String str, String str2, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
            this.content = str2;
            this.is_outer = bool;
            this.is_anonymous = bool2;
        }
    }

    public static final class BoldProperty extends Message<BoldProperty, C15165a> {
        public static final ProtoAdapter<BoldProperty> ADAPTER = new C15166b();
        private static final long serialVersionUID = 0;
        public final String content;
        public final String i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$BoldProperty$b */
        private static final class C15166b extends ProtoAdapter<BoldProperty> {
            C15166b() {
                super(FieldEncoding.LENGTH_DELIMITED, BoldProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(BoldProperty boldProperty) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, boldProperty.content);
                if (boldProperty.i18n_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, boldProperty.i18n_key);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + boldProperty.unknownFields().size();
            }

            /* renamed from: a */
            public BoldProperty decode(ProtoReader protoReader) throws IOException {
                C15165a aVar = new C15165a();
                aVar.f40236a = "";
                aVar.f40237b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40236a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40237b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BoldProperty boldProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, boldProperty.content);
                if (boldProperty.i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, boldProperty.i18n_key);
                }
                protoWriter.writeBytes(boldProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$BoldProperty$a */
        public static final class C15165a extends Message.Builder<BoldProperty, C15165a> {

            /* renamed from: a */
            public String f40236a;

            /* renamed from: b */
            public String f40237b;

            /* renamed from: a */
            public BoldProperty build() {
                String str = this.f40236a;
                if (str != null) {
                    return new BoldProperty(str, this.f40237b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "content");
            }

            /* renamed from: a */
            public C15165a mo55292a(String str) {
                this.f40236a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15165a newBuilder() {
            C15165a aVar = new C15165a();
            aVar.f40236a = this.content;
            aVar.f40237b = this.i18n_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "BoldProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", content=");
            sb.append(this.content);
            if (this.i18n_key != null) {
                sb.append(", i18n_key=");
                sb.append(this.i18n_key);
            }
            StringBuilder replace = sb.replace(0, 2, "BoldProperty{");
            replace.append('}');
            return replace.toString();
        }

        public BoldProperty(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public BoldProperty(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = str;
            this.i18n_key = str2;
        }
    }

    public static final class ButtonConfirmProperty extends Message<ButtonConfirmProperty, C15167a> {
        public static final ProtoAdapter<ButtonConfirmProperty> ADAPTER = new C15168b();
        private static final long serialVersionUID = 0;
        public final String confirm;
        public final String confirm_i18n_key;
        public final String dismiss;
        public final String dismiss_i18n_key;
        public final String text;
        public final String text_i18n_key;
        public final String title;
        public final String title_i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ButtonConfirmProperty$b */
        private static final class C15168b extends ProtoAdapter<ButtonConfirmProperty> {
            C15168b() {
                super(FieldEncoding.LENGTH_DELIMITED, ButtonConfirmProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ButtonConfirmProperty buttonConfirmProperty) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, buttonConfirmProperty.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, buttonConfirmProperty.text) + ProtoAdapter.STRING.encodedSizeWithTag(3, buttonConfirmProperty.confirm) + ProtoAdapter.STRING.encodedSizeWithTag(4, buttonConfirmProperty.dismiss);
                int i4 = 0;
                if (buttonConfirmProperty.title_i18n_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(5, buttonConfirmProperty.title_i18n_key);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (buttonConfirmProperty.text_i18n_key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, buttonConfirmProperty.text_i18n_key);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (buttonConfirmProperty.confirm_i18n_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, buttonConfirmProperty.confirm_i18n_key);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (buttonConfirmProperty.dismiss_i18n_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, buttonConfirmProperty.dismiss_i18n_key);
                }
                return i7 + i4 + buttonConfirmProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ButtonConfirmProperty decode(ProtoReader protoReader) throws IOException {
                C15167a aVar = new C15167a();
                aVar.f40238a = "";
                aVar.f40239b = "";
                aVar.f40240c = "";
                aVar.f40241d = "";
                aVar.f40242e = "";
                aVar.f40243f = "";
                aVar.f40244g = "";
                aVar.f40245h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40238a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40239b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40240c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40241d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40242e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40243f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40244g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40245h = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ButtonConfirmProperty buttonConfirmProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buttonConfirmProperty.title);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, buttonConfirmProperty.text);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, buttonConfirmProperty.confirm);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, buttonConfirmProperty.dismiss);
                if (buttonConfirmProperty.title_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, buttonConfirmProperty.title_i18n_key);
                }
                if (buttonConfirmProperty.text_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, buttonConfirmProperty.text_i18n_key);
                }
                if (buttonConfirmProperty.confirm_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, buttonConfirmProperty.confirm_i18n_key);
                }
                if (buttonConfirmProperty.dismiss_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, buttonConfirmProperty.dismiss_i18n_key);
                }
                protoWriter.writeBytes(buttonConfirmProperty.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15167a newBuilder() {
            C15167a aVar = new C15167a();
            aVar.f40238a = this.title;
            aVar.f40239b = this.text;
            aVar.f40240c = this.confirm;
            aVar.f40241d = this.dismiss;
            aVar.f40242e = this.title_i18n_key;
            aVar.f40243f = this.text_i18n_key;
            aVar.f40244g = this.confirm_i18n_key;
            aVar.f40245h = this.dismiss_i18n_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ButtonConfirmProperty$a */
        public static final class C15167a extends Message.Builder<ButtonConfirmProperty, C15167a> {

            /* renamed from: a */
            public String f40238a;

            /* renamed from: b */
            public String f40239b;

            /* renamed from: c */
            public String f40240c;

            /* renamed from: d */
            public String f40241d;

            /* renamed from: e */
            public String f40242e;

            /* renamed from: f */
            public String f40243f;

            /* renamed from: g */
            public String f40244g;

            /* renamed from: h */
            public String f40245h;

            /* renamed from: a */
            public ButtonConfirmProperty build() {
                String str;
                String str2;
                String str3;
                String str4 = this.f40238a;
                if (str4 != null && (str = this.f40239b) != null && (str2 = this.f40240c) != null && (str3 = this.f40241d) != null) {
                    return new ButtonConfirmProperty(str4, str, str2, str3, this.f40242e, this.f40243f, this.f40244g, this.f40245h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str4, "title", this.f40239b, "text", this.f40240c, "confirm", this.f40241d, "dismiss");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ButtonConfirmProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", confirm=");
            sb.append(this.confirm);
            sb.append(", dismiss=");
            sb.append(this.dismiss);
            if (this.title_i18n_key != null) {
                sb.append(", title_i18n_key=");
                sb.append(this.title_i18n_key);
            }
            if (this.text_i18n_key != null) {
                sb.append(", text_i18n_key=");
                sb.append(this.text_i18n_key);
            }
            if (this.confirm_i18n_key != null) {
                sb.append(", confirm_i18n_key=");
                sb.append(this.confirm_i18n_key);
            }
            if (this.dismiss_i18n_key != null) {
                sb.append(", dismiss_i18n_key=");
                sb.append(this.dismiss_i18n_key);
            }
            StringBuilder replace = sb.replace(0, 2, "ButtonConfirmProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ButtonConfirmProperty(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this(str, str2, str3, str4, str5, str6, str7, str8, ByteString.EMPTY);
        }

        public ButtonConfirmProperty(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = str;
            this.text = str2;
            this.confirm = str3;
            this.dismiss = str4;
            this.title_i18n_key = str5;
            this.text_i18n_key = str6;
            this.confirm_i18n_key = str7;
            this.dismiss_i18n_key = str8;
        }
    }

    public static final class ButtonLoadingProperty extends Message<ButtonLoadingProperty, C15169a> {
        public static final ProtoAdapter<ButtonLoadingProperty> ADAPTER = new C15170b();
        private static final long serialVersionUID = 0;
        public final String begin;
        public final String begin_i18n_key;
        public final String fail;
        public final String fail_i18n_key;
        public final String success;
        public final String success_i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ButtonLoadingProperty$b */
        private static final class C15170b extends ProtoAdapter<ButtonLoadingProperty> {
            C15170b() {
                super(FieldEncoding.LENGTH_DELIMITED, ButtonLoadingProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ButtonLoadingProperty buttonLoadingProperty) {
                int i;
                int i2;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, buttonLoadingProperty.begin) + ProtoAdapter.STRING.encodedSizeWithTag(2, buttonLoadingProperty.success) + ProtoAdapter.STRING.encodedSizeWithTag(3, buttonLoadingProperty.fail);
                int i3 = 0;
                if (buttonLoadingProperty.begin_i18n_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(4, buttonLoadingProperty.begin_i18n_key);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (buttonLoadingProperty.success_i18n_key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, buttonLoadingProperty.success_i18n_key);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (buttonLoadingProperty.fail_i18n_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, buttonLoadingProperty.fail_i18n_key);
                }
                return i5 + i3 + buttonLoadingProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ButtonLoadingProperty decode(ProtoReader protoReader) throws IOException {
                C15169a aVar = new C15169a();
                aVar.f40246a = "";
                aVar.f40247b = "";
                aVar.f40248c = "";
                aVar.f40249d = "";
                aVar.f40250e = "";
                aVar.f40251f = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40246a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40247b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40248c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40249d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40250e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40251f = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ButtonLoadingProperty buttonLoadingProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buttonLoadingProperty.begin);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, buttonLoadingProperty.success);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, buttonLoadingProperty.fail);
                if (buttonLoadingProperty.begin_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, buttonLoadingProperty.begin_i18n_key);
                }
                if (buttonLoadingProperty.success_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, buttonLoadingProperty.success_i18n_key);
                }
                if (buttonLoadingProperty.fail_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, buttonLoadingProperty.fail_i18n_key);
                }
                protoWriter.writeBytes(buttonLoadingProperty.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15169a newBuilder() {
            C15169a aVar = new C15169a();
            aVar.f40246a = this.begin;
            aVar.f40247b = this.success;
            aVar.f40248c = this.fail;
            aVar.f40249d = this.begin_i18n_key;
            aVar.f40250e = this.success_i18n_key;
            aVar.f40251f = this.fail_i18n_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ButtonLoadingProperty$a */
        public static final class C15169a extends Message.Builder<ButtonLoadingProperty, C15169a> {

            /* renamed from: a */
            public String f40246a;

            /* renamed from: b */
            public String f40247b;

            /* renamed from: c */
            public String f40248c;

            /* renamed from: d */
            public String f40249d;

            /* renamed from: e */
            public String f40250e;

            /* renamed from: f */
            public String f40251f;

            /* renamed from: a */
            public ButtonLoadingProperty build() {
                String str;
                String str2;
                String str3 = this.f40246a;
                if (str3 != null && (str = this.f40247b) != null && (str2 = this.f40248c) != null) {
                    return new ButtonLoadingProperty(str3, str, str2, this.f40249d, this.f40250e, this.f40251f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str3, "begin", this.f40247b, "success", this.f40248c, "fail");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ButtonLoadingProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", begin=");
            sb.append(this.begin);
            sb.append(", success=");
            sb.append(this.success);
            sb.append(", fail=");
            sb.append(this.fail);
            if (this.begin_i18n_key != null) {
                sb.append(", begin_i18n_key=");
                sb.append(this.begin_i18n_key);
            }
            if (this.success_i18n_key != null) {
                sb.append(", success_i18n_key=");
                sb.append(this.success_i18n_key);
            }
            if (this.fail_i18n_key != null) {
                sb.append(", fail_i18n_key=");
                sb.append(this.fail_i18n_key);
            }
            StringBuilder replace = sb.replace(0, 2, "ButtonLoadingProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ButtonLoadingProperty(String str, String str2, String str3, String str4, String str5, String str6) {
            this(str, str2, str3, str4, str5, str6, ByteString.EMPTY);
        }

        public ButtonLoadingProperty(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.begin = str;
            this.success = str2;
            this.fail = str3;
            this.begin_i18n_key = str4;
            this.success_i18n_key = str5;
            this.fail_i18n_key = str6;
        }
    }

    public static final class ButtonProperty extends Message<ButtonProperty, C15171a> {
        public static final ProtoAdapter<ButtonProperty> ADAPTER = new C15172b();
        public static final Boolean DEFAULT_ACTIVE = false;
        public static final Boolean DEFAULT_DISABLE = false;
        public static final Boolean DEFAULT_IS_LOADING = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final Boolean active;
        public final ButtonConfirmProperty confirm;
        public final Boolean disable;
        public final Boolean is_loading;
        public final ButtonLoadingProperty loading;
        public final String mode;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ButtonProperty$b */
        private static final class C15172b extends ProtoAdapter<ButtonProperty> {
            C15172b() {
                super(FieldEncoding.LENGTH_DELIMITED, ButtonProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ButtonProperty buttonProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (buttonProperty.action_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, buttonProperty.action_id);
                } else {
                    i = 0;
                }
                if (buttonProperty.disable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, buttonProperty.disable);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (buttonProperty.active != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, buttonProperty.active);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (buttonProperty.confirm != null) {
                    i4 = ButtonConfirmProperty.ADAPTER.encodedSizeWithTag(4, buttonProperty.confirm);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (buttonProperty.loading != null) {
                    i5 = ButtonLoadingProperty.ADAPTER.encodedSizeWithTag(5, buttonProperty.loading);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (buttonProperty.is_loading != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, buttonProperty.is_loading);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (buttonProperty.mode != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, buttonProperty.mode);
                }
                return i12 + i7 + buttonProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ButtonProperty decode(ProtoReader protoReader) throws IOException {
                C15171a aVar = new C15171a();
                aVar.f40252a = "";
                aVar.f40253b = false;
                aVar.f40254c = false;
                aVar.f40257f = false;
                aVar.f40258g = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40252a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40253b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40254c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40255d = ButtonConfirmProperty.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40256e = ButtonLoadingProperty.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40257f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40258g = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ButtonProperty buttonProperty) throws IOException {
                if (buttonProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buttonProperty.action_id);
                }
                if (buttonProperty.disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, buttonProperty.disable);
                }
                if (buttonProperty.active != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, buttonProperty.active);
                }
                if (buttonProperty.confirm != null) {
                    ButtonConfirmProperty.ADAPTER.encodeWithTag(protoWriter, 4, buttonProperty.confirm);
                }
                if (buttonProperty.loading != null) {
                    ButtonLoadingProperty.ADAPTER.encodeWithTag(protoWriter, 5, buttonProperty.loading);
                }
                if (buttonProperty.is_loading != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, buttonProperty.is_loading);
                }
                if (buttonProperty.mode != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, buttonProperty.mode);
                }
                protoWriter.writeBytes(buttonProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ButtonProperty$a */
        public static final class C15171a extends Message.Builder<ButtonProperty, C15171a> {

            /* renamed from: a */
            public String f40252a;

            /* renamed from: b */
            public Boolean f40253b;

            /* renamed from: c */
            public Boolean f40254c;

            /* renamed from: d */
            public ButtonConfirmProperty f40255d;

            /* renamed from: e */
            public ButtonLoadingProperty f40256e;

            /* renamed from: f */
            public Boolean f40257f;

            /* renamed from: g */
            public String f40258g;

            /* renamed from: a */
            public ButtonProperty build() {
                return new ButtonProperty(this.f40252a, this.f40253b, this.f40254c, this.f40255d, this.f40256e, this.f40257f, this.f40258g, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15171a mo55305a(String str) {
                this.f40252a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15171a newBuilder() {
            C15171a aVar = new C15171a();
            aVar.f40252a = this.action_id;
            aVar.f40253b = this.disable;
            aVar.f40254c = this.active;
            aVar.f40255d = this.confirm;
            aVar.f40256e = this.loading;
            aVar.f40257f = this.is_loading;
            aVar.f40258g = this.mode;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ButtonProperty");
            StringBuilder sb = new StringBuilder();
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.disable != null) {
                sb.append(", disable=");
                sb.append(this.disable);
            }
            if (this.active != null) {
                sb.append(", active=");
                sb.append(this.active);
            }
            if (this.confirm != null) {
                sb.append(", confirm=");
                sb.append(this.confirm);
            }
            if (this.loading != null) {
                sb.append(", loading=");
                sb.append(this.loading);
            }
            if (this.is_loading != null) {
                sb.append(", is_loading=");
                sb.append(this.is_loading);
            }
            if (this.mode != null) {
                sb.append(", mode=");
                sb.append(this.mode);
            }
            StringBuilder replace = sb.replace(0, 2, "ButtonProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ButtonProperty(String str, Boolean bool, Boolean bool2, ButtonConfirmProperty buttonConfirmProperty, ButtonLoadingProperty buttonLoadingProperty, Boolean bool3, String str2) {
            this(str, bool, bool2, buttonConfirmProperty, buttonLoadingProperty, bool3, str2, ByteString.EMPTY);
        }

        public ButtonProperty(String str, Boolean bool, Boolean bool2, ButtonConfirmProperty buttonConfirmProperty, ButtonLoadingProperty buttonLoadingProperty, Boolean bool3, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.action_id = str;
            this.disable = bool;
            this.active = bool2;
            this.confirm = buttonConfirmProperty;
            this.loading = buttonLoadingProperty;
            this.is_loading = bool3;
            this.mode = str2;
        }
    }

    public static final class CodeProperty extends Message<CodeProperty, C15179a> {
        public static final ProtoAdapter<CodeProperty> ADAPTER = new C15180b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeProperty$b */
        private static final class C15180b extends ProtoAdapter<CodeProperty> {
            C15180b() {
                super(FieldEncoding.LENGTH_DELIMITED, CodeProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(CodeProperty codeProperty) {
                return codeProperty.unknownFields().size();
            }

            /* renamed from: a */
            public CodeProperty decode(ProtoReader protoReader) throws IOException {
                C15179a aVar = new C15179a();
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
            public void encode(ProtoWriter protoWriter, CodeProperty codeProperty) throws IOException {
                protoWriter.writeBytes(codeProperty.unknownFields());
            }
        }

        public CodeProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$CodeProperty$a */
        public static final class C15179a extends Message.Builder<CodeProperty, C15179a> {
            /* renamed from: a */
            public CodeProperty build() {
                return new CodeProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15179a newBuilder() {
            C15179a aVar = new C15179a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CodeProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "CodeProperty{");
            replace.append('}');
            return replace.toString();
        }

        public CodeProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class DatePickerProperty extends Message<DatePickerProperty, C15181a> {
        public static final ProtoAdapter<DatePickerProperty> ADAPTER = new C15182b();
        public static final Boolean DEFAULT_DISABLE = false;
        public static final Boolean DEFAULT_IS_LOADING = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final ButtonConfirmProperty confirm;
        public final Boolean disable;
        public final String initial_date;
        public final Boolean is_loading;
        public final String place_holder;
        public final String place_holder_i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DatePickerProperty$b */
        private static final class C15182b extends ProtoAdapter<DatePickerProperty> {
            C15182b() {
                super(FieldEncoding.LENGTH_DELIMITED, DatePickerProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(DatePickerProperty datePickerProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (datePickerProperty.action_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, datePickerProperty.action_id);
                } else {
                    i = 0;
                }
                if (datePickerProperty.place_holder != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, datePickerProperty.place_holder);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (datePickerProperty.place_holder_i18n_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, datePickerProperty.place_holder_i18n_key);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (datePickerProperty.initial_date != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, datePickerProperty.initial_date);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (datePickerProperty.confirm != null) {
                    i5 = ButtonConfirmProperty.ADAPTER.encodedSizeWithTag(5, datePickerProperty.confirm);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (datePickerProperty.disable != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, datePickerProperty.disable);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (datePickerProperty.is_loading != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, datePickerProperty.is_loading);
                }
                return i12 + i7 + datePickerProperty.unknownFields().size();
            }

            /* renamed from: a */
            public DatePickerProperty decode(ProtoReader protoReader) throws IOException {
                C15181a aVar = new C15181a();
                aVar.f40269a = "";
                aVar.f40270b = "";
                aVar.f40271c = "";
                aVar.f40272d = "";
                aVar.f40274f = false;
                aVar.f40275g = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40269a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40270b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40271c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40272d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40273e = ButtonConfirmProperty.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40274f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40275g = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, DatePickerProperty datePickerProperty) throws IOException {
                if (datePickerProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, datePickerProperty.action_id);
                }
                if (datePickerProperty.place_holder != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, datePickerProperty.place_holder);
                }
                if (datePickerProperty.place_holder_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, datePickerProperty.place_holder_i18n_key);
                }
                if (datePickerProperty.initial_date != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, datePickerProperty.initial_date);
                }
                if (datePickerProperty.confirm != null) {
                    ButtonConfirmProperty.ADAPTER.encodeWithTag(protoWriter, 5, datePickerProperty.confirm);
                }
                if (datePickerProperty.disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, datePickerProperty.disable);
                }
                if (datePickerProperty.is_loading != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, datePickerProperty.is_loading);
                }
                protoWriter.writeBytes(datePickerProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DatePickerProperty$a */
        public static final class C15181a extends Message.Builder<DatePickerProperty, C15181a> {

            /* renamed from: a */
            public String f40269a;

            /* renamed from: b */
            public String f40270b;

            /* renamed from: c */
            public String f40271c;

            /* renamed from: d */
            public String f40272d;

            /* renamed from: e */
            public ButtonConfirmProperty f40273e;

            /* renamed from: f */
            public Boolean f40274f;

            /* renamed from: g */
            public Boolean f40275g;

            /* renamed from: a */
            public DatePickerProperty build() {
                return new DatePickerProperty(this.f40269a, this.f40270b, this.f40271c, this.f40272d, this.f40273e, this.f40274f, this.f40275g, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15181a mo55326a(String str) {
                this.f40269a = str;
                return this;
            }

            /* renamed from: b */
            public C15181a mo55328b(String str) {
                this.f40272d = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15181a newBuilder() {
            C15181a aVar = new C15181a();
            aVar.f40269a = this.action_id;
            aVar.f40270b = this.place_holder;
            aVar.f40271c = this.place_holder_i18n_key;
            aVar.f40272d = this.initial_date;
            aVar.f40273e = this.confirm;
            aVar.f40274f = this.disable;
            aVar.f40275g = this.is_loading;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "DatePickerProperty");
            StringBuilder sb = new StringBuilder();
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.place_holder != null) {
                sb.append(", place_holder=");
                sb.append(this.place_holder);
            }
            if (this.place_holder_i18n_key != null) {
                sb.append(", place_holder_i18n_key=");
                sb.append(this.place_holder_i18n_key);
            }
            if (this.initial_date != null) {
                sb.append(", initial_date=");
                sb.append(this.initial_date);
            }
            if (this.confirm != null) {
                sb.append(", confirm=");
                sb.append(this.confirm);
            }
            if (this.disable != null) {
                sb.append(", disable=");
                sb.append(this.disable);
            }
            if (this.is_loading != null) {
                sb.append(", is_loading=");
                sb.append(this.is_loading);
            }
            StringBuilder replace = sb.replace(0, 2, "DatePickerProperty{");
            replace.append('}');
            return replace.toString();
        }

        public DatePickerProperty(String str, String str2, String str3, String str4, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2) {
            this(str, str2, str3, str4, buttonConfirmProperty, bool, bool2, ByteString.EMPTY);
        }

        public DatePickerProperty(String str, String str2, String str3, String str4, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.action_id = str;
            this.place_holder = str2;
            this.place_holder_i18n_key = str3;
            this.initial_date = str4;
            this.confirm = buttonConfirmProperty;
            this.disable = bool;
            this.is_loading = bool2;
        }
    }

    public static final class DatetimePickerProperty extends Message<DatetimePickerProperty, C15183a> {
        public static final ProtoAdapter<DatetimePickerProperty> ADAPTER = new C15184b();
        public static final Boolean DEFAULT_DISABLE = false;
        public static final Boolean DEFAULT_IS_LOADING = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final ButtonConfirmProperty confirm;
        public final Boolean disable;
        public final String initial_datetime;
        public final Boolean is_loading;
        public final String place_holder;
        public final String place_holder_i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DatetimePickerProperty$b */
        private static final class C15184b extends ProtoAdapter<DatetimePickerProperty> {
            C15184b() {
                super(FieldEncoding.LENGTH_DELIMITED, DatetimePickerProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(DatetimePickerProperty datetimePickerProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (datetimePickerProperty.action_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, datetimePickerProperty.action_id);
                } else {
                    i = 0;
                }
                if (datetimePickerProperty.place_holder != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, datetimePickerProperty.place_holder);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (datetimePickerProperty.place_holder_i18n_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, datetimePickerProperty.place_holder_i18n_key);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (datetimePickerProperty.initial_datetime != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, datetimePickerProperty.initial_datetime);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (datetimePickerProperty.confirm != null) {
                    i5 = ButtonConfirmProperty.ADAPTER.encodedSizeWithTag(5, datetimePickerProperty.confirm);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (datetimePickerProperty.disable != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, datetimePickerProperty.disable);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (datetimePickerProperty.is_loading != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, datetimePickerProperty.is_loading);
                }
                return i12 + i7 + datetimePickerProperty.unknownFields().size();
            }

            /* renamed from: a */
            public DatetimePickerProperty decode(ProtoReader protoReader) throws IOException {
                C15183a aVar = new C15183a();
                aVar.f40276a = "";
                aVar.f40277b = "";
                aVar.f40278c = "";
                aVar.f40279d = "";
                aVar.f40281f = false;
                aVar.f40282g = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40276a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40277b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40278c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40279d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40280e = ButtonConfirmProperty.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40281f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40282g = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, DatetimePickerProperty datetimePickerProperty) throws IOException {
                if (datetimePickerProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, datetimePickerProperty.action_id);
                }
                if (datetimePickerProperty.place_holder != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, datetimePickerProperty.place_holder);
                }
                if (datetimePickerProperty.place_holder_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, datetimePickerProperty.place_holder_i18n_key);
                }
                if (datetimePickerProperty.initial_datetime != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, datetimePickerProperty.initial_datetime);
                }
                if (datetimePickerProperty.confirm != null) {
                    ButtonConfirmProperty.ADAPTER.encodeWithTag(protoWriter, 5, datetimePickerProperty.confirm);
                }
                if (datetimePickerProperty.disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, datetimePickerProperty.disable);
                }
                if (datetimePickerProperty.is_loading != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, datetimePickerProperty.is_loading);
                }
                protoWriter.writeBytes(datetimePickerProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DatetimePickerProperty$a */
        public static final class C15183a extends Message.Builder<DatetimePickerProperty, C15183a> {

            /* renamed from: a */
            public String f40276a;

            /* renamed from: b */
            public String f40277b;

            /* renamed from: c */
            public String f40278c;

            /* renamed from: d */
            public String f40279d;

            /* renamed from: e */
            public ButtonConfirmProperty f40280e;

            /* renamed from: f */
            public Boolean f40281f;

            /* renamed from: g */
            public Boolean f40282g;

            /* renamed from: a */
            public DatetimePickerProperty build() {
                return new DatetimePickerProperty(this.f40276a, this.f40277b, this.f40278c, this.f40279d, this.f40280e, this.f40281f, this.f40282g, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15183a mo55332a(String str) {
                this.f40276a = str;
                return this;
            }

            /* renamed from: b */
            public C15183a mo55334b(String str) {
                this.f40279d = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15183a newBuilder() {
            C15183a aVar = new C15183a();
            aVar.f40276a = this.action_id;
            aVar.f40277b = this.place_holder;
            aVar.f40278c = this.place_holder_i18n_key;
            aVar.f40279d = this.initial_datetime;
            aVar.f40280e = this.confirm;
            aVar.f40281f = this.disable;
            aVar.f40282g = this.is_loading;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "DatetimePickerProperty");
            StringBuilder sb = new StringBuilder();
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.place_holder != null) {
                sb.append(", place_holder=");
                sb.append(this.place_holder);
            }
            if (this.place_holder_i18n_key != null) {
                sb.append(", place_holder_i18n_key=");
                sb.append(this.place_holder_i18n_key);
            }
            if (this.initial_datetime != null) {
                sb.append(", initial_datetime=");
                sb.append(this.initial_datetime);
            }
            if (this.confirm != null) {
                sb.append(", confirm=");
                sb.append(this.confirm);
            }
            if (this.disable != null) {
                sb.append(", disable=");
                sb.append(this.disable);
            }
            if (this.is_loading != null) {
                sb.append(", is_loading=");
                sb.append(this.is_loading);
            }
            StringBuilder replace = sb.replace(0, 2, "DatetimePickerProperty{");
            replace.append('}');
            return replace.toString();
        }

        public DatetimePickerProperty(String str, String str2, String str3, String str4, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2) {
            this(str, str2, str3, str4, buttonConfirmProperty, bool, bool2, ByteString.EMPTY);
        }

        public DatetimePickerProperty(String str, String str2, String str3, String str4, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.action_id = str;
            this.place_holder = str2;
            this.place_holder_i18n_key = str3;
            this.initial_datetime = str4;
            this.confirm = buttonConfirmProperty;
            this.disable = bool;
            this.is_loading = bool2;
        }
    }

    public static final class DivProperty extends Message<DivProperty, C15185a> {
        public static final ProtoAdapter<DivProperty> ADAPTER = new C15186b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DivProperty$b */
        private static final class C15186b extends ProtoAdapter<DivProperty> {
            C15186b() {
                super(FieldEncoding.LENGTH_DELIMITED, DivProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(DivProperty divProperty) {
                return divProperty.unknownFields().size();
            }

            /* renamed from: a */
            public DivProperty decode(ProtoReader protoReader) throws IOException {
                C15185a aVar = new C15185a();
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
            public void encode(ProtoWriter protoWriter, DivProperty divProperty) throws IOException {
                protoWriter.writeBytes(divProperty.unknownFields());
            }
        }

        public DivProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DivProperty$a */
        public static final class C15185a extends Message.Builder<DivProperty, C15185a> {
            /* renamed from: a */
            public DivProperty build() {
                return new DivProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15185a newBuilder() {
            C15185a aVar = new C15185a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "DivProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "DivProperty{");
            replace.append('}');
            return replace.toString();
        }

        public DivProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class DocsProperty extends Message<DocsProperty, C15187a> {
        public static final ProtoAdapter<DocsProperty> ADAPTER = new C15188b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DocsProperty$b */
        private static final class C15188b extends ProtoAdapter<DocsProperty> {
            C15188b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocsProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(DocsProperty docsProperty) {
                return docsProperty.unknownFields().size();
            }

            /* renamed from: a */
            public DocsProperty decode(ProtoReader protoReader) throws IOException {
                C15187a aVar = new C15187a();
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
            public void encode(ProtoWriter protoWriter, DocsProperty docsProperty) throws IOException {
                protoWriter.writeBytes(docsProperty.unknownFields());
            }
        }

        public DocsProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$DocsProperty$a */
        public static final class C15187a extends Message.Builder<DocsProperty, C15187a> {
            /* renamed from: a */
            public DocsProperty build() {
                return new DocsProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15187a newBuilder() {
            C15187a aVar = new C15187a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "DocsProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "DocsProperty{");
            replace.append('}');
            return replace.toString();
        }

        public DocsProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class EmotionProperty extends Message<EmotionProperty, C15189a> {
        public static final ProtoAdapter<EmotionProperty> ADAPTER = new C15190b();
        private static final long serialVersionUID = 0;
        public final String key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$EmotionProperty$b */
        private static final class C15190b extends ProtoAdapter<EmotionProperty> {
            C15190b() {
                super(FieldEncoding.LENGTH_DELIMITED, EmotionProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(EmotionProperty emotionProperty) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, emotionProperty.key) + emotionProperty.unknownFields().size();
            }

            /* renamed from: a */
            public EmotionProperty decode(ProtoReader protoReader) throws IOException {
                C15189a aVar = new C15189a();
                aVar.f40283a = "";
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
                        aVar.f40283a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EmotionProperty emotionProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, emotionProperty.key);
                protoWriter.writeBytes(emotionProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$EmotionProperty$a */
        public static final class C15189a extends Message.Builder<EmotionProperty, C15189a> {

            /* renamed from: a */
            public String f40283a;

            /* renamed from: a */
            public EmotionProperty build() {
                String str = this.f40283a;
                if (str != null) {
                    return new EmotionProperty(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "key");
            }

            /* renamed from: a */
            public C15189a mo55346a(String str) {
                this.f40283a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15189a newBuilder() {
            C15189a aVar = new C15189a();
            aVar.f40283a = this.key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EmotionProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            StringBuilder replace = sb.replace(0, 2, "EmotionProperty{");
            replace.append('}');
            return replace.toString();
        }

        public EmotionProperty(String str) {
            this(str, ByteString.EMPTY);
        }

        public EmotionProperty(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
        }
    }

    public static final class FigureProperty extends Message<FigureProperty, C15191a> {
        public static final ProtoAdapter<FigureProperty> ADAPTER = new C15192b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$FigureProperty$b */
        private static final class C15192b extends ProtoAdapter<FigureProperty> {
            C15192b() {
                super(FieldEncoding.LENGTH_DELIMITED, FigureProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(FigureProperty figureProperty) {
                return figureProperty.unknownFields().size();
            }

            /* renamed from: a */
            public FigureProperty decode(ProtoReader protoReader) throws IOException {
                C15191a aVar = new C15191a();
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
            public void encode(ProtoWriter protoWriter, FigureProperty figureProperty) throws IOException {
                protoWriter.writeBytes(figureProperty.unknownFields());
            }
        }

        public FigureProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$FigureProperty$a */
        public static final class C15191a extends Message.Builder<FigureProperty, C15191a> {
            /* renamed from: a */
            public FigureProperty build() {
                return new FigureProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15191a newBuilder() {
            C15191a aVar = new C15191a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "FigureProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "FigureProperty{");
            replace.append('}');
            return replace.toString();
        }

        public FigureProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class H1Property extends Message<H1Property, C15193a> {
        public static final ProtoAdapter<H1Property> ADAPTER = new C15194b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$H1Property$b */
        private static final class C15194b extends ProtoAdapter<H1Property> {
            C15194b() {
                super(FieldEncoding.LENGTH_DELIMITED, H1Property.class);
            }

            /* renamed from: a */
            public int encodedSize(H1Property h1Property) {
                return h1Property.unknownFields().size();
            }

            /* renamed from: a */
            public H1Property decode(ProtoReader protoReader) throws IOException {
                C15193a aVar = new C15193a();
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
            public void encode(ProtoWriter protoWriter, H1Property h1Property) throws IOException {
                protoWriter.writeBytes(h1Property.unknownFields());
            }
        }

        public H1Property() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$H1Property$a */
        public static final class C15193a extends Message.Builder<H1Property, C15193a> {
            /* renamed from: a */
            public H1Property build() {
                return new H1Property(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15193a newBuilder() {
            C15193a aVar = new C15193a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "H1Property");
            StringBuilder replace = new StringBuilder().replace(0, 2, "H1Property{");
            replace.append('}');
            return replace.toString();
        }

        public H1Property(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class H2Property extends Message<H2Property, C15195a> {
        public static final ProtoAdapter<H2Property> ADAPTER = new C15196b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$H2Property$b */
        private static final class C15196b extends ProtoAdapter<H2Property> {
            C15196b() {
                super(FieldEncoding.LENGTH_DELIMITED, H2Property.class);
            }

            /* renamed from: a */
            public int encodedSize(H2Property h2Property) {
                return h2Property.unknownFields().size();
            }

            /* renamed from: a */
            public H2Property decode(ProtoReader protoReader) throws IOException {
                C15195a aVar = new C15195a();
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
            public void encode(ProtoWriter protoWriter, H2Property h2Property) throws IOException {
                protoWriter.writeBytes(h2Property.unknownFields());
            }
        }

        public H2Property() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$H2Property$a */
        public static final class C15195a extends Message.Builder<H2Property, C15195a> {
            /* renamed from: a */
            public H2Property build() {
                return new H2Property(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15195a newBuilder() {
            C15195a aVar = new C15195a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "H2Property");
            StringBuilder replace = new StringBuilder().replace(0, 2, "H2Property{");
            replace.append('}');
            return replace.toString();
        }

        public H2Property(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class H3Property extends Message<H3Property, C15197a> {
        public static final ProtoAdapter<H3Property> ADAPTER = new C15198b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$H3Property$b */
        private static final class C15198b extends ProtoAdapter<H3Property> {
            C15198b() {
                super(FieldEncoding.LENGTH_DELIMITED, H3Property.class);
            }

            /* renamed from: a */
            public int encodedSize(H3Property h3Property) {
                return h3Property.unknownFields().size();
            }

            /* renamed from: a */
            public H3Property decode(ProtoReader protoReader) throws IOException {
                C15197a aVar = new C15197a();
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
            public void encode(ProtoWriter protoWriter, H3Property h3Property) throws IOException {
                protoWriter.writeBytes(h3Property.unknownFields());
            }
        }

        public H3Property() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$H3Property$a */
        public static final class C15197a extends Message.Builder<H3Property, C15197a> {
            /* renamed from: a */
            public H3Property build() {
                return new H3Property(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15197a newBuilder() {
            C15197a aVar = new C15197a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "H3Property");
            StringBuilder replace = new StringBuilder().replace(0, 2, "H3Property{");
            replace.append('}');
            return replace.toString();
        }

        public H3Property(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class HRProperty extends Message<HRProperty, C15199a> {
        public static final ProtoAdapter<HRProperty> ADAPTER = new C15200b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$HRProperty$b */
        private static final class C15200b extends ProtoAdapter<HRProperty> {
            C15200b() {
                super(FieldEncoding.LENGTH_DELIMITED, HRProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(HRProperty hRProperty) {
                return hRProperty.unknownFields().size();
            }

            /* renamed from: a */
            public HRProperty decode(ProtoReader protoReader) throws IOException {
                C15199a aVar = new C15199a();
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
            public void encode(ProtoWriter protoWriter, HRProperty hRProperty) throws IOException {
                protoWriter.writeBytes(hRProperty.unknownFields());
            }
        }

        public HRProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$HRProperty$a */
        public static final class C15199a extends Message.Builder<HRProperty, C15199a> {
            /* renamed from: a */
            public HRProperty build() {
                return new HRProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15199a newBuilder() {
            C15199a aVar = new C15199a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "HRProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "HRProperty{");
            replace.append('}');
            return replace.toString();
        }

        public HRProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class ImageProperty extends Message<ImageProperty, C15201a> {
        public static final ProtoAdapter<ImageProperty> ADAPTER = new C15202b();
        public static final Integer DEFAULT_CUSTOM_WIDTH = 0;
        public static final Boolean DEFAULT_IMG_CAN_PREVIEW = false;
        public static final Boolean DEFAULT_IS_ORIGIN_SOURCE = false;
        public static final Integer DEFAULT_ORIGIN_HEIGHT = 0;
        public static final Long DEFAULT_ORIGIN_SIZE = 0L;
        public static final Integer DEFAULT_ORIGIN_WIDTH = 0;
        private static final long serialVersionUID = 0;
        public final String alt;
        public final String alt_i18n_key;
        public final Image cover;
        public final Integer custom_width;
        public final String fs_unit;
        public final Boolean img_can_preview;
        public final Image intact;
        public final Boolean is_origin_source;
        public final String middle_key;
        public final Image middle_mp4;
        public final Image middle_webp;
        public final Integer origin_height;
        public final String origin_key;
        public final Long origin_size;
        public final Integer origin_width;
        public final String thumb_key;
        public final Image thumbnail_webp;
        public final String token;
        public final List<String> urls;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ImageProperty$b */
        private static final class C15202b extends ProtoAdapter<ImageProperty> {
            C15202b() {
                super(FieldEncoding.LENGTH_DELIMITED, ImageProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ImageProperty imageProperty) {
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
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, imageProperty.urls);
                int i18 = 0;
                if (imageProperty.token != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, imageProperty.token);
                } else {
                    i = 0;
                }
                int i19 = encodedSizeWithTag + i;
                if (imageProperty.origin_key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, imageProperty.origin_key);
                } else {
                    i2 = 0;
                }
                int i20 = i19 + i2;
                if (imageProperty.middle_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, imageProperty.middle_key);
                } else {
                    i3 = 0;
                }
                int i21 = i20 + i3;
                if (imageProperty.thumb_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, imageProperty.thumb_key);
                } else {
                    i4 = 0;
                }
                int i22 = i21 + i4;
                if (imageProperty.origin_width != null) {
                    i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, imageProperty.origin_width);
                } else {
                    i5 = 0;
                }
                int i23 = i22 + i5;
                if (imageProperty.origin_height != null) {
                    i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, imageProperty.origin_height);
                } else {
                    i6 = 0;
                }
                int i24 = i23 + i6;
                if (imageProperty.fs_unit != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, imageProperty.fs_unit);
                } else {
                    i7 = 0;
                }
                int i25 = i24 + i7;
                if (imageProperty.alt != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, imageProperty.alt);
                } else {
                    i8 = 0;
                }
                int i26 = i25 + i8;
                if (imageProperty.alt_i18n_key != null) {
                    i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, imageProperty.alt_i18n_key);
                } else {
                    i9 = 0;
                }
                int i27 = i26 + i9;
                if (imageProperty.img_can_preview != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, imageProperty.img_can_preview);
                } else {
                    i10 = 0;
                }
                int i28 = i27 + i10;
                if (imageProperty.thumbnail_webp != null) {
                    i11 = Image.ADAPTER.encodedSizeWithTag(12, imageProperty.thumbnail_webp);
                } else {
                    i11 = 0;
                }
                int i29 = i28 + i11;
                if (imageProperty.middle_webp != null) {
                    i12 = Image.ADAPTER.encodedSizeWithTag(13, imageProperty.middle_webp);
                } else {
                    i12 = 0;
                }
                int i30 = i29 + i12;
                if (imageProperty.middle_mp4 != null) {
                    i13 = Image.ADAPTER.encodedSizeWithTag(14, imageProperty.middle_mp4);
                } else {
                    i13 = 0;
                }
                int i31 = i30 + i13;
                if (imageProperty.cover != null) {
                    i14 = Image.ADAPTER.encodedSizeWithTag(15, imageProperty.cover);
                } else {
                    i14 = 0;
                }
                int i32 = i31 + i14;
                if (imageProperty.custom_width != null) {
                    i15 = ProtoAdapter.INT32.encodedSizeWithTag(16, imageProperty.custom_width);
                } else {
                    i15 = 0;
                }
                int i33 = i32 + i15;
                if (imageProperty.intact != null) {
                    i16 = Image.ADAPTER.encodedSizeWithTag(17, imageProperty.intact);
                } else {
                    i16 = 0;
                }
                int i34 = i33 + i16;
                if (imageProperty.is_origin_source != null) {
                    i17 = ProtoAdapter.BOOL.encodedSizeWithTag(20, imageProperty.is_origin_source);
                } else {
                    i17 = 0;
                }
                int i35 = i34 + i17;
                if (imageProperty.origin_size != null) {
                    i18 = ProtoAdapter.UINT64.encodedSizeWithTag(21, imageProperty.origin_size);
                }
                return i35 + i18 + imageProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ImageProperty decode(ProtoReader protoReader) throws IOException {
                C15201a aVar = new C15201a();
                aVar.f40285b = "";
                aVar.f40286c = "";
                aVar.f40287d = "";
                aVar.f40288e = "";
                aVar.f40289f = 0;
                aVar.f40290g = 0;
                aVar.f40291h = "";
                aVar.f40292i = "";
                aVar.f40293j = "";
                aVar.f40294k = false;
                aVar.f40299p = 0;
                aVar.f40301r = false;
                aVar.f40302s = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40284a.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 2:
                                aVar.f40285b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40286c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40287d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40288e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40289f = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40290g = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40291h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f40292i = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 10:
                                aVar.f40293j = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 11:
                                aVar.f40294k = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f40295l = Image.ADAPTER.decode(protoReader);
                                break;
                            case 13:
                                aVar.f40296m = Image.ADAPTER.decode(protoReader);
                                break;
                            case 14:
                                aVar.f40297n = Image.ADAPTER.decode(protoReader);
                                break;
                            case 15:
                                aVar.f40298o = Image.ADAPTER.decode(protoReader);
                                break;
                            case 16:
                                aVar.f40299p = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 17:
                                aVar.f40300q = Image.ADAPTER.decode(protoReader);
                                break;
                            case 18:
                            case 19:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case 20:
                                aVar.f40301r = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 21:
                                aVar.f40302s = ProtoAdapter.UINT64.decode(protoReader);
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ImageProperty imageProperty) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, imageProperty.urls);
                if (imageProperty.token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageProperty.token);
                }
                if (imageProperty.origin_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, imageProperty.origin_key);
                }
                if (imageProperty.middle_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, imageProperty.middle_key);
                }
                if (imageProperty.thumb_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, imageProperty.thumb_key);
                }
                if (imageProperty.origin_width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, imageProperty.origin_width);
                }
                if (imageProperty.origin_height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, imageProperty.origin_height);
                }
                if (imageProperty.fs_unit != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, imageProperty.fs_unit);
                }
                if (imageProperty.alt != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, imageProperty.alt);
                }
                if (imageProperty.alt_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, imageProperty.alt_i18n_key);
                }
                if (imageProperty.img_can_preview != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, imageProperty.img_can_preview);
                }
                if (imageProperty.thumbnail_webp != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 12, imageProperty.thumbnail_webp);
                }
                if (imageProperty.middle_webp != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 13, imageProperty.middle_webp);
                }
                if (imageProperty.middle_mp4 != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 14, imageProperty.middle_mp4);
                }
                if (imageProperty.cover != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 15, imageProperty.cover);
                }
                if (imageProperty.custom_width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, imageProperty.custom_width);
                }
                if (imageProperty.intact != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 17, imageProperty.intact);
                }
                if (imageProperty.is_origin_source != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, imageProperty.is_origin_source);
                }
                if (imageProperty.origin_size != null) {
                    ProtoAdapter.UINT64.encodeWithTag(protoWriter, 21, imageProperty.origin_size);
                }
                protoWriter.writeBytes(imageProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ImageProperty$a */
        public static final class C15201a extends Message.Builder<ImageProperty, C15201a> {

            /* renamed from: a */
            public List<String> f40284a = Internal.newMutableList();

            /* renamed from: b */
            public String f40285b;

            /* renamed from: c */
            public String f40286c;

            /* renamed from: d */
            public String f40287d;

            /* renamed from: e */
            public String f40288e;

            /* renamed from: f */
            public Integer f40289f;

            /* renamed from: g */
            public Integer f40290g;

            /* renamed from: h */
            public String f40291h;

            /* renamed from: i */
            public String f40292i;

            /* renamed from: j */
            public String f40293j;

            /* renamed from: k */
            public Boolean f40294k;

            /* renamed from: l */
            public Image f40295l;

            /* renamed from: m */
            public Image f40296m;

            /* renamed from: n */
            public Image f40297n;

            /* renamed from: o */
            public Image f40298o;

            /* renamed from: p */
            public Integer f40299p;

            /* renamed from: q */
            public Image f40300q;

            /* renamed from: r */
            public Boolean f40301r;

            /* renamed from: s */
            public Long f40302s;

            /* renamed from: a */
            public ImageProperty build() {
                return new ImageProperty(this.f40284a, this.f40285b, this.f40286c, this.f40287d, this.f40288e, this.f40289f, this.f40290g, this.f40291h, this.f40292i, this.f40293j, this.f40294k, this.f40295l, this.f40296m, this.f40297n, this.f40298o, this.f40299p, this.f40300q, this.f40301r, this.f40302s, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15201a mo55371a(Boolean bool) {
                this.f40301r = bool;
                return this;
            }

            /* renamed from: b */
            public C15201a mo55377b(Integer num) {
                this.f40290g = num;
                return this;
            }

            /* renamed from: c */
            public C15201a mo55379c(String str) {
                this.f40287d = str;
                return this;
            }

            /* renamed from: d */
            public C15201a mo55380d(String str) {
                this.f40288e = str;
                return this;
            }

            /* renamed from: a */
            public C15201a mo55372a(Integer num) {
                this.f40289f = num;
                return this;
            }

            /* renamed from: b */
            public C15201a mo55378b(String str) {
                this.f40286c = str;
                return this;
            }

            /* renamed from: a */
            public C15201a mo55373a(Long l) {
                this.f40302s = l;
                return this;
            }

            /* renamed from: a */
            public C15201a mo55374a(String str) {
                this.f40285b = str;
                return this;
            }

            /* renamed from: a */
            public C15201a mo55375a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f40284a = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15201a newBuilder() {
            C15201a aVar = new C15201a();
            aVar.f40284a = Internal.copyOf("urls", this.urls);
            aVar.f40285b = this.token;
            aVar.f40286c = this.origin_key;
            aVar.f40287d = this.middle_key;
            aVar.f40288e = this.thumb_key;
            aVar.f40289f = this.origin_width;
            aVar.f40290g = this.origin_height;
            aVar.f40291h = this.fs_unit;
            aVar.f40292i = this.alt;
            aVar.f40293j = this.alt_i18n_key;
            aVar.f40294k = this.img_can_preview;
            aVar.f40295l = this.thumbnail_webp;
            aVar.f40296m = this.middle_webp;
            aVar.f40297n = this.middle_mp4;
            aVar.f40298o = this.cover;
            aVar.f40299p = this.custom_width;
            aVar.f40300q = this.intact;
            aVar.f40301r = this.is_origin_source;
            aVar.f40302s = this.origin_size;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ImageProperty");
            StringBuilder sb = new StringBuilder();
            if (!this.urls.isEmpty()) {
                sb.append(", urls=");
                sb.append(this.urls);
            }
            if (this.token != null) {
                sb.append(", token=");
                sb.append(this.token);
            }
            if (this.origin_key != null) {
                sb.append(", origin_key=");
                sb.append(this.origin_key);
            }
            if (this.middle_key != null) {
                sb.append(", middle_key=");
                sb.append(this.middle_key);
            }
            if (this.thumb_key != null) {
                sb.append(", thumb_key=");
                sb.append(this.thumb_key);
            }
            if (this.origin_width != null) {
                sb.append(", origin_width=");
                sb.append(this.origin_width);
            }
            if (this.origin_height != null) {
                sb.append(", origin_height=");
                sb.append(this.origin_height);
            }
            if (this.fs_unit != null) {
                sb.append(", fs_unit=");
                sb.append(this.fs_unit);
            }
            if (this.alt != null) {
                sb.append(", alt=");
                sb.append(this.alt);
            }
            if (this.alt_i18n_key != null) {
                sb.append(", alt_i18n_key=");
                sb.append(this.alt_i18n_key);
            }
            if (this.img_can_preview != null) {
                sb.append(", img_can_preview=");
                sb.append(this.img_can_preview);
            }
            if (this.thumbnail_webp != null) {
                sb.append(", thumbnail_webp=");
                sb.append(this.thumbnail_webp);
            }
            if (this.middle_webp != null) {
                sb.append(", middle_webp=");
                sb.append(this.middle_webp);
            }
            if (this.middle_mp4 != null) {
                sb.append(", middle_mp4=");
                sb.append(this.middle_mp4);
            }
            if (this.cover != null) {
                sb.append(", cover=");
                sb.append(this.cover);
            }
            if (this.custom_width != null) {
                sb.append(", custom_width=");
                sb.append(this.custom_width);
            }
            if (this.intact != null) {
                sb.append(", intact=");
                sb.append(this.intact);
            }
            if (this.is_origin_source != null) {
                sb.append(", is_origin_source=");
                sb.append(this.is_origin_source);
            }
            if (this.origin_size != null) {
                sb.append(", origin_size=");
                sb.append(this.origin_size);
            }
            StringBuilder replace = sb.replace(0, 2, "ImageProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ImageProperty(List<String> list, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Boolean bool, Image image, Image image2, Image image3, Image image4, Integer num3, Image image5, Boolean bool2, Long l) {
            this(list, str, str2, str3, str4, num, num2, str5, str6, str7, bool, image, image2, image3, image4, num3, image5, bool2, l, ByteString.EMPTY);
        }

        public ImageProperty(List<String> list, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Boolean bool, Image image, Image image2, Image image3, Image image4, Integer num3, Image image5, Boolean bool2, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.urls = Internal.immutableCopyOf("urls", list);
            this.token = str;
            this.origin_key = str2;
            this.middle_key = str3;
            this.thumb_key = str4;
            this.origin_width = num;
            this.origin_height = num2;
            this.fs_unit = str5;
            this.alt = str6;
            this.alt_i18n_key = str7;
            this.img_can_preview = bool;
            this.thumbnail_webp = image;
            this.middle_webp = image2;
            this.middle_mp4 = image3;
            this.cover = image4;
            this.custom_width = num3;
            this.intact = image5;
            this.is_origin_source = bool2;
            this.origin_size = l;
        }
    }

    public static final class ItalicProperty extends Message<ItalicProperty, C15203a> {
        public static final ProtoAdapter<ItalicProperty> ADAPTER = new C15204b();
        private static final long serialVersionUID = 0;
        public final String content;
        public final String i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ItalicProperty$b */
        private static final class C15204b extends ProtoAdapter<ItalicProperty> {
            C15204b() {
                super(FieldEncoding.LENGTH_DELIMITED, ItalicProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ItalicProperty italicProperty) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, italicProperty.content);
                if (italicProperty.i18n_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, italicProperty.i18n_key);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + italicProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ItalicProperty decode(ProtoReader protoReader) throws IOException {
                C15203a aVar = new C15203a();
                aVar.f40303a = "";
                aVar.f40304b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40303a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40304b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ItalicProperty italicProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, italicProperty.content);
                if (italicProperty.i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, italicProperty.i18n_key);
                }
                protoWriter.writeBytes(italicProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ItalicProperty$a */
        public static final class C15203a extends Message.Builder<ItalicProperty, C15203a> {

            /* renamed from: a */
            public String f40303a;

            /* renamed from: b */
            public String f40304b;

            /* renamed from: a */
            public ItalicProperty build() {
                String str = this.f40303a;
                if (str != null) {
                    return new ItalicProperty(str, this.f40304b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "content");
            }

            /* renamed from: a */
            public C15203a mo55384a(String str) {
                this.f40303a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15203a newBuilder() {
            C15203a aVar = new C15203a();
            aVar.f40303a = this.content;
            aVar.f40304b = this.i18n_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ItalicProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", content=");
            sb.append(this.content);
            if (this.i18n_key != null) {
                sb.append(", i18n_key=");
                sb.append(this.i18n_key);
            }
            StringBuilder replace = sb.replace(0, 2, "ItalicProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ItalicProperty(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public ItalicProperty(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = str;
            this.i18n_key = str2;
        }
    }

    public static final class LIProperty extends Message<LIProperty, C15205a> {
        public static final ProtoAdapter<LIProperty> ADAPTER = new C15206b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$LIProperty$b */
        private static final class C15206b extends ProtoAdapter<LIProperty> {
            C15206b() {
                super(FieldEncoding.LENGTH_DELIMITED, LIProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(LIProperty lIProperty) {
                return lIProperty.unknownFields().size();
            }

            /* renamed from: a */
            public LIProperty decode(ProtoReader protoReader) throws IOException {
                C15205a aVar = new C15205a();
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
            public void encode(ProtoWriter protoWriter, LIProperty lIProperty) throws IOException {
                protoWriter.writeBytes(lIProperty.unknownFields());
            }
        }

        public LIProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$LIProperty$a */
        public static final class C15205a extends Message.Builder<LIProperty, C15205a> {
            /* renamed from: a */
            public LIProperty build() {
                return new LIProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15205a newBuilder() {
            C15205a aVar = new C15205a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "LIProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "LIProperty{");
            replace.append('}');
            return replace.toString();
        }

        public LIProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class MentionProperty extends Message<MentionProperty, C15213a> {
        public static final ProtoAdapter<MentionProperty> ADAPTER = new C15214b();
        private static final long serialVersionUID = 0;
        public final String content;
        public final MentionItem item;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MentionProperty$b */
        private static final class C15214b extends ProtoAdapter<MentionProperty> {
            C15214b() {
                super(FieldEncoding.LENGTH_DELIMITED, MentionProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(MentionProperty mentionProperty) {
                return MentionItem.ADAPTER.encodedSizeWithTag(1, mentionProperty.item) + ProtoAdapter.STRING.encodedSizeWithTag(2, mentionProperty.content) + mentionProperty.unknownFields().size();
            }

            /* renamed from: a */
            public MentionProperty decode(ProtoReader protoReader) throws IOException {
                C15213a aVar = new C15213a();
                aVar.f40330b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40329a = MentionItem.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40330b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MentionProperty mentionProperty) throws IOException {
                MentionItem.ADAPTER.encodeWithTag(protoWriter, 1, mentionProperty.item);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mentionProperty.content);
                protoWriter.writeBytes(mentionProperty.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15213a newBuilder() {
            C15213a aVar = new C15213a();
            aVar.f40329a = this.item;
            aVar.f40330b = this.content;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MentionProperty$a */
        public static final class C15213a extends Message.Builder<MentionProperty, C15213a> {

            /* renamed from: a */
            public MentionItem f40329a;

            /* renamed from: b */
            public String f40330b;

            /* renamed from: a */
            public MentionProperty build() {
                String str;
                MentionItem mentionItem = this.f40329a;
                if (mentionItem != null && (str = this.f40330b) != null) {
                    return new MentionProperty(mentionItem, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(mentionItem, "item", this.f40330b, "content");
            }

            /* renamed from: a */
            public C15213a mo55413a(MentionItem mentionItem) {
                this.f40329a = mentionItem;
                return this;
            }

            /* renamed from: a */
            public C15213a mo55414a(String str) {
                this.f40330b = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MentionProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", item=");
            sb.append(this.item);
            sb.append(", content=");
            sb.append(this.content);
            StringBuilder replace = sb.replace(0, 2, "MentionProperty{");
            replace.append('}');
            return replace.toString();
        }

        public MentionProperty(MentionItem mentionItem, String str) {
            this(mentionItem, str, ByteString.EMPTY);
        }

        public MentionProperty(MentionItem mentionItem, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item = mentionItem;
            this.content = str;
        }
    }

    public static final class MenuOption extends Message<MenuOption, C15215a> {
        public static final ProtoAdapter<MenuOption> ADAPTER = new C15216b();
        private static final long serialVersionUID = 0;
        public final String option_action_id;
        public final String text;
        public final String text_i18n_key;
        public final CardAction.Url url;
        public final String value;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MenuOption$b */
        private static final class C15216b extends ProtoAdapter<MenuOption> {
            C15216b() {
                super(FieldEncoding.LENGTH_DELIMITED, MenuOption.class);
            }

            /* renamed from: a */
            public int encodedSize(MenuOption menuOption) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (menuOption.text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, menuOption.text);
                } else {
                    i = 0;
                }
                if (menuOption.text_i18n_key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, menuOption.text_i18n_key);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (menuOption.value != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, menuOption.value);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (menuOption.url != null) {
                    i4 = CardAction.Url.ADAPTER.encodedSizeWithTag(4, menuOption.url);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (menuOption.option_action_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, menuOption.option_action_id);
                }
                return i8 + i5 + menuOption.unknownFields().size();
            }

            /* renamed from: a */
            public MenuOption decode(ProtoReader protoReader) throws IOException {
                C15215a aVar = new C15215a();
                aVar.f40331a = "";
                aVar.f40332b = "";
                aVar.f40333c = "";
                aVar.f40335e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40331a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40332b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40333c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f40334d = CardAction.Url.ADAPTER.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40335e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MenuOption menuOption) throws IOException {
                if (menuOption.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, menuOption.text);
                }
                if (menuOption.text_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, menuOption.text_i18n_key);
                }
                if (menuOption.value != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, menuOption.value);
                }
                if (menuOption.url != null) {
                    CardAction.Url.ADAPTER.encodeWithTag(protoWriter, 4, menuOption.url);
                }
                if (menuOption.option_action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, menuOption.option_action_id);
                }
                protoWriter.writeBytes(menuOption.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$MenuOption$a */
        public static final class C15215a extends Message.Builder<MenuOption, C15215a> {

            /* renamed from: a */
            public String f40331a;

            /* renamed from: b */
            public String f40332b;

            /* renamed from: c */
            public String f40333c;

            /* renamed from: d */
            public CardAction.Url f40334d;

            /* renamed from: e */
            public String f40335e;

            /* renamed from: a */
            public MenuOption build() {
                return new MenuOption(this.f40331a, this.f40332b, this.f40333c, this.f40334d, this.f40335e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15215a newBuilder() {
            C15215a aVar = new C15215a();
            aVar.f40331a = this.text;
            aVar.f40332b = this.text_i18n_key;
            aVar.f40333c = this.value;
            aVar.f40334d = this.url;
            aVar.f40335e = this.option_action_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MenuOption");
            StringBuilder sb = new StringBuilder();
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.text_i18n_key != null) {
                sb.append(", text_i18n_key=");
                sb.append(this.text_i18n_key);
            }
            if (this.value != null) {
                sb.append(", value=");
                sb.append(this.value);
            }
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.option_action_id != null) {
                sb.append(", option_action_id=");
                sb.append(this.option_action_id);
            }
            StringBuilder replace = sb.replace(0, 2, "MenuOption{");
            replace.append('}');
            return replace.toString();
        }

        public MenuOption(String str, String str2, String str3, CardAction.Url url2, String str4) {
            this(str, str2, str3, url2, str4, ByteString.EMPTY);
        }

        public MenuOption(String str, String str2, String str3, CardAction.Url url2, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = str;
            this.text_i18n_key = str2;
            this.value = str3;
            this.url = url2;
            this.option_action_id = str4;
        }
    }

    public static final class OverflowMenuProperty extends Message<OverflowMenuProperty, C15219a> {
        public static final ProtoAdapter<OverflowMenuProperty> ADAPTER = new C15220b();
        public static final Boolean DEFAULT_DISABLE = false;
        public static final Boolean DEFAULT_IS_LOADING = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final ButtonConfirmProperty confirm;
        public final Boolean disable;
        public final Boolean is_loading;
        public final List<MenuOption> options;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$OverflowMenuProperty$b */
        private static final class C15220b extends ProtoAdapter<OverflowMenuProperty> {
            C15220b() {
                super(FieldEncoding.LENGTH_DELIMITED, OverflowMenuProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(OverflowMenuProperty overflowMenuProperty) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (overflowMenuProperty.action_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, overflowMenuProperty.action_id);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + MenuOption.ADAPTER.asRepeated().encodedSizeWithTag(2, overflowMenuProperty.options);
                if (overflowMenuProperty.confirm != null) {
                    i2 = ButtonConfirmProperty.ADAPTER.encodedSizeWithTag(3, overflowMenuProperty.confirm);
                } else {
                    i2 = 0;
                }
                int i5 = encodedSizeWithTag + i2;
                if (overflowMenuProperty.disable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, overflowMenuProperty.disable);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (overflowMenuProperty.is_loading != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, overflowMenuProperty.is_loading);
                }
                return i6 + i4 + overflowMenuProperty.unknownFields().size();
            }

            /* renamed from: a */
            public OverflowMenuProperty decode(ProtoReader protoReader) throws IOException {
                C15219a aVar = new C15219a();
                aVar.f40338a = "";
                aVar.f40341d = false;
                aVar.f40342e = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40338a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40339b.add(MenuOption.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f40340c = ButtonConfirmProperty.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f40341d = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40342e = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OverflowMenuProperty overflowMenuProperty) throws IOException {
                if (overflowMenuProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, overflowMenuProperty.action_id);
                }
                MenuOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, overflowMenuProperty.options);
                if (overflowMenuProperty.confirm != null) {
                    ButtonConfirmProperty.ADAPTER.encodeWithTag(protoWriter, 3, overflowMenuProperty.confirm);
                }
                if (overflowMenuProperty.disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, overflowMenuProperty.disable);
                }
                if (overflowMenuProperty.is_loading != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, overflowMenuProperty.is_loading);
                }
                protoWriter.writeBytes(overflowMenuProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$OverflowMenuProperty$a */
        public static final class C15219a extends Message.Builder<OverflowMenuProperty, C15219a> {

            /* renamed from: a */
            public String f40338a;

            /* renamed from: b */
            public List<MenuOption> f40339b = Internal.newMutableList();

            /* renamed from: c */
            public ButtonConfirmProperty f40340c;

            /* renamed from: d */
            public Boolean f40341d;

            /* renamed from: e */
            public Boolean f40342e;

            /* renamed from: a */
            public OverflowMenuProperty build() {
                return new OverflowMenuProperty(this.f40338a, this.f40339b, this.f40340c, this.f40341d, this.f40342e, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15219a mo55427a(String str) {
                this.f40338a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15219a newBuilder() {
            C15219a aVar = new C15219a();
            aVar.f40338a = this.action_id;
            aVar.f40339b = Internal.copyOf("options", this.options);
            aVar.f40340c = this.confirm;
            aVar.f40341d = this.disable;
            aVar.f40342e = this.is_loading;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "OverflowMenuProperty");
            StringBuilder sb = new StringBuilder();
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (!this.options.isEmpty()) {
                sb.append(", options=");
                sb.append(this.options);
            }
            if (this.confirm != null) {
                sb.append(", confirm=");
                sb.append(this.confirm);
            }
            if (this.disable != null) {
                sb.append(", disable=");
                sb.append(this.disable);
            }
            if (this.is_loading != null) {
                sb.append(", is_loading=");
                sb.append(this.is_loading);
            }
            StringBuilder replace = sb.replace(0, 2, "OverflowMenuProperty{");
            replace.append('}');
            return replace.toString();
        }

        public OverflowMenuProperty(String str, List<MenuOption> list, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2) {
            this(str, list, buttonConfirmProperty, bool, bool2, ByteString.EMPTY);
        }

        public OverflowMenuProperty(String str, List<MenuOption> list, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.action_id = str;
            this.options = Internal.immutableCopyOf("options", list);
            this.confirm = buttonConfirmProperty;
            this.disable = bool;
            this.is_loading = bool2;
        }
    }

    public static final class ParagraphProperty extends Message<ParagraphProperty, C15221a> {
        public static final ProtoAdapter<ParagraphProperty> ADAPTER = new C15222b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ParagraphProperty$b */
        private static final class C15222b extends ProtoAdapter<ParagraphProperty> {
            C15222b() {
                super(FieldEncoding.LENGTH_DELIMITED, ParagraphProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ParagraphProperty paragraphProperty) {
                return paragraphProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ParagraphProperty decode(ProtoReader protoReader) throws IOException {
                C15221a aVar = new C15221a();
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
            public void encode(ProtoWriter protoWriter, ParagraphProperty paragraphProperty) throws IOException {
                protoWriter.writeBytes(paragraphProperty.unknownFields());
            }
        }

        public ParagraphProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ParagraphProperty$a */
        public static final class C15221a extends Message.Builder<ParagraphProperty, C15221a> {
            /* renamed from: a */
            public ParagraphProperty build() {
                return new ParagraphProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15221a newBuilder() {
            C15221a aVar = new C15221a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ParagraphProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "ParagraphProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ParagraphProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class ProgressSelectOptionProperty extends Message<ProgressSelectOptionProperty, C15223a> {
        public static final ProtoAdapter<ProgressSelectOptionProperty> ADAPTER = new C15224b();
        public static final Boolean DEFAULT_DISABLE = false;
        public static final Integer DEFAULT_NUMBER_OF_SELECTED = 0;
        public static final Integer DEFAULT_NUMBER_OF_TOTAL = 0;
        public static final Boolean DEFAULT_SELECTED = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final String action_param_name;
        public final String action_param_value;
        public final String content;
        public final Boolean disable;
        public final Integer number_of_selected;
        public final Integer number_of_total;
        public final String option_case;
        public final Boolean selected;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ProgressSelectOptionProperty$b */
        private static final class C15224b extends ProtoAdapter<ProgressSelectOptionProperty> {
            C15224b() {
                super(FieldEncoding.LENGTH_DELIMITED, ProgressSelectOptionProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ProgressSelectOptionProperty progressSelectOptionProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9 = 0;
                if (progressSelectOptionProperty.action_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, progressSelectOptionProperty.action_id);
                } else {
                    i = 0;
                }
                if (progressSelectOptionProperty.action_param_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, progressSelectOptionProperty.action_param_name);
                } else {
                    i2 = 0;
                }
                int i10 = i + i2;
                if (progressSelectOptionProperty.action_param_value != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, progressSelectOptionProperty.action_param_value);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (progressSelectOptionProperty.disable != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, progressSelectOptionProperty.disable);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (progressSelectOptionProperty.selected != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, progressSelectOptionProperty.selected);
                } else {
                    i5 = 0;
                }
                int i13 = i12 + i5;
                if (progressSelectOptionProperty.option_case != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, progressSelectOptionProperty.option_case);
                } else {
                    i6 = 0;
                }
                int i14 = i13 + i6;
                if (progressSelectOptionProperty.content != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, progressSelectOptionProperty.content);
                } else {
                    i7 = 0;
                }
                int i15 = i14 + i7;
                if (progressSelectOptionProperty.number_of_selected != null) {
                    i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, progressSelectOptionProperty.number_of_selected);
                } else {
                    i8 = 0;
                }
                int i16 = i15 + i8;
                if (progressSelectOptionProperty.number_of_total != null) {
                    i9 = ProtoAdapter.INT32.encodedSizeWithTag(9, progressSelectOptionProperty.number_of_total);
                }
                return i16 + i9 + progressSelectOptionProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ProgressSelectOptionProperty decode(ProtoReader protoReader) throws IOException {
                C15223a aVar = new C15223a();
                aVar.f40343a = "";
                aVar.f40344b = "";
                aVar.f40345c = "";
                aVar.f40346d = false;
                aVar.f40347e = false;
                aVar.f40348f = "";
                aVar.f40349g = "";
                aVar.f40350h = 0;
                aVar.f40351i = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40343a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40344b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40345c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40346d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40347e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40348f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40349g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40350h = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 9:
                                aVar.f40351i = ProtoAdapter.INT32.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ProgressSelectOptionProperty progressSelectOptionProperty) throws IOException {
                if (progressSelectOptionProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, progressSelectOptionProperty.action_id);
                }
                if (progressSelectOptionProperty.action_param_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, progressSelectOptionProperty.action_param_name);
                }
                if (progressSelectOptionProperty.action_param_value != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, progressSelectOptionProperty.action_param_value);
                }
                if (progressSelectOptionProperty.disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, progressSelectOptionProperty.disable);
                }
                if (progressSelectOptionProperty.selected != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, progressSelectOptionProperty.selected);
                }
                if (progressSelectOptionProperty.option_case != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, progressSelectOptionProperty.option_case);
                }
                if (progressSelectOptionProperty.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, progressSelectOptionProperty.content);
                }
                if (progressSelectOptionProperty.number_of_selected != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, progressSelectOptionProperty.number_of_selected);
                }
                if (progressSelectOptionProperty.number_of_total != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, progressSelectOptionProperty.number_of_total);
                }
                protoWriter.writeBytes(progressSelectOptionProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ProgressSelectOptionProperty$a */
        public static final class C15223a extends Message.Builder<ProgressSelectOptionProperty, C15223a> {

            /* renamed from: a */
            public String f40343a;

            /* renamed from: b */
            public String f40344b;

            /* renamed from: c */
            public String f40345c;

            /* renamed from: d */
            public Boolean f40346d;

            /* renamed from: e */
            public Boolean f40347e;

            /* renamed from: f */
            public String f40348f;

            /* renamed from: g */
            public String f40349g;

            /* renamed from: h */
            public Integer f40350h;

            /* renamed from: i */
            public Integer f40351i;

            /* renamed from: a */
            public ProgressSelectOptionProperty build() {
                return new ProgressSelectOptionProperty(this.f40343a, this.f40344b, this.f40345c, this.f40346d, this.f40347e, this.f40348f, this.f40349g, this.f40350h, this.f40351i, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15223a newBuilder() {
            C15223a aVar = new C15223a();
            aVar.f40343a = this.action_id;
            aVar.f40344b = this.action_param_name;
            aVar.f40345c = this.action_param_value;
            aVar.f40346d = this.disable;
            aVar.f40347e = this.selected;
            aVar.f40348f = this.option_case;
            aVar.f40349g = this.content;
            aVar.f40350h = this.number_of_selected;
            aVar.f40351i = this.number_of_total;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ProgressSelectOptionProperty");
            StringBuilder sb = new StringBuilder();
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.action_param_name != null) {
                sb.append(", action_param_name=");
                sb.append(this.action_param_name);
            }
            if (this.action_param_value != null) {
                sb.append(", action_param_value=");
                sb.append(this.action_param_value);
            }
            if (this.disable != null) {
                sb.append(", disable=");
                sb.append(this.disable);
            }
            if (this.selected != null) {
                sb.append(", selected=");
                sb.append(this.selected);
            }
            if (this.option_case != null) {
                sb.append(", option_case=");
                sb.append(this.option_case);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.number_of_selected != null) {
                sb.append(", number_of_selected=");
                sb.append(this.number_of_selected);
            }
            if (this.number_of_total != null) {
                sb.append(", number_of_total=");
                sb.append(this.number_of_total);
            }
            StringBuilder replace = sb.replace(0, 2, "ProgressSelectOptionProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ProgressSelectOptionProperty(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, Integer num, Integer num2) {
            this(str, str2, str3, bool, bool2, str4, str5, num, num2, ByteString.EMPTY);
        }

        public ProgressSelectOptionProperty(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.action_id = str;
            this.action_param_name = str2;
            this.action_param_value = str3;
            this.disable = bool;
            this.selected = bool2;
            this.option_case = str4;
            this.content = str5;
            this.number_of_selected = num;
            this.number_of_total = num2;
        }
    }

    public static final class QuoteProperty extends Message<QuoteProperty, C15227a> {
        public static final ProtoAdapter<QuoteProperty> ADAPTER = new C15228b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$QuoteProperty$b */
        private static final class C15228b extends ProtoAdapter<QuoteProperty> {
            C15228b() {
                super(FieldEncoding.LENGTH_DELIMITED, QuoteProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(QuoteProperty quoteProperty) {
                return quoteProperty.unknownFields().size();
            }

            /* renamed from: a */
            public QuoteProperty decode(ProtoReader protoReader) throws IOException {
                C15227a aVar = new C15227a();
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
            public void encode(ProtoWriter protoWriter, QuoteProperty quoteProperty) throws IOException {
                protoWriter.writeBytes(quoteProperty.unknownFields());
            }
        }

        public QuoteProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$QuoteProperty$a */
        public static final class C15227a extends Message.Builder<QuoteProperty, C15227a> {
            /* renamed from: a */
            public QuoteProperty build() {
                return new QuoteProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15227a newBuilder() {
            C15227a aVar = new C15227a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "QuoteProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "QuoteProperty{");
            replace.append('}');
            return replace.toString();
        }

        public QuoteProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class ReactionProperty extends Message<ReactionProperty, C15229a> {
        public static final ProtoAdapter<ReactionProperty> ADAPTER = new C15230b();
        private static final long serialVersionUID = 0;
        public final String key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ReactionProperty$b */
        private static final class C15230b extends ProtoAdapter<ReactionProperty> {
            C15230b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReactionProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(ReactionProperty reactionProperty) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, reactionProperty.key) + reactionProperty.unknownFields().size();
            }

            /* renamed from: a */
            public ReactionProperty decode(ProtoReader protoReader) throws IOException {
                C15229a aVar = new C15229a();
                aVar.f40389a = "";
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
                        aVar.f40389a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReactionProperty reactionProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reactionProperty.key);
                protoWriter.writeBytes(reactionProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$ReactionProperty$a */
        public static final class C15229a extends Message.Builder<ReactionProperty, C15229a> {

            /* renamed from: a */
            public String f40389a;

            /* renamed from: a */
            public ReactionProperty build() {
                String str = this.f40389a;
                if (str != null) {
                    return new ReactionProperty(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "key");
            }
        }

        @Override // com.squareup.wire.Message
        public C15229a newBuilder() {
            C15229a aVar = new C15229a();
            aVar.f40389a = this.key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ReactionProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            StringBuilder replace = sb.replace(0, 2, "ReactionProperty{");
            replace.append('}');
            return replace.toString();
        }

        public ReactionProperty(String str) {
            this(str, ByteString.EMPTY);
        }

        public ReactionProperty(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
        }
    }

    public static final class SelectProperty extends Message<SelectProperty, C15233a> {
        public static final ProtoAdapter<SelectProperty> ADAPTER = new C15234b();
        public static final Integer DEFAULT_MAX_PICK_NUM = 1;
        public static final Integer DEFAULT_MIN_PICK_NUM = 1;
        private static final long serialVersionUID = 0;
        public final Integer max_pick_num;
        public final Integer min_pick_num;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$SelectProperty$b */
        private static final class C15234b extends ProtoAdapter<SelectProperty> {
            C15234b() {
                super(FieldEncoding.LENGTH_DELIMITED, SelectProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(SelectProperty selectProperty) {
                int i;
                int i2 = 0;
                if (selectProperty.min_pick_num != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(4, selectProperty.min_pick_num);
                } else {
                    i = 0;
                }
                if (selectProperty.max_pick_num != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(5, selectProperty.max_pick_num);
                }
                return i + i2 + selectProperty.unknownFields().size();
            }

            /* renamed from: a */
            public SelectProperty decode(ProtoReader protoReader) throws IOException {
                C15233a aVar = new C15233a();
                aVar.f40399a = 1;
                aVar.f40400b = 1;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 4) {
                        aVar.f40399a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40400b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SelectProperty selectProperty) throws IOException {
                if (selectProperty.min_pick_num != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, selectProperty.min_pick_num);
                }
                if (selectProperty.max_pick_num != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, selectProperty.max_pick_num);
                }
                protoWriter.writeBytes(selectProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$SelectProperty$a */
        public static final class C15233a extends Message.Builder<SelectProperty, C15233a> {

            /* renamed from: a */
            public Integer f40399a;

            /* renamed from: b */
            public Integer f40400b;

            /* renamed from: a */
            public SelectProperty build() {
                return new SelectProperty(this.f40399a, this.f40400b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15233a newBuilder() {
            C15233a aVar = new C15233a();
            aVar.f40399a = this.min_pick_num;
            aVar.f40400b = this.max_pick_num;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SelectProperty");
            StringBuilder sb = new StringBuilder();
            if (this.min_pick_num != null) {
                sb.append(", min_pick_num=");
                sb.append(this.min_pick_num);
            }
            if (this.max_pick_num != null) {
                sb.append(", max_pick_num=");
                sb.append(this.max_pick_num);
            }
            StringBuilder replace = sb.replace(0, 2, "SelectProperty{");
            replace.append('}');
            return replace.toString();
        }

        public SelectProperty(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public SelectProperty(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.min_pick_num = num;
            this.max_pick_num = num2;
        }
    }

    public static final class TextProperty extends Message<TextProperty, C15235a> {
        public static final ProtoAdapter<TextProperty> ADAPTER = new C15236b();
        public static final Integer DEFAULT_NUMBEROFLINES = 0;
        private static final long serialVersionUID = 0;
        public final String content;
        public final String i18n_key;
        public final Integer numberOfLines;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TextProperty$b */
        private static final class C15236b extends ProtoAdapter<TextProperty> {
            C15236b() {
                super(FieldEncoding.LENGTH_DELIMITED, TextProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TextProperty textProperty) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, textProperty.content);
                int i2 = 0;
                if (textProperty.i18n_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, textProperty.i18n_key);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (textProperty.numberOfLines != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, textProperty.numberOfLines);
                }
                return i3 + i2 + textProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TextProperty decode(ProtoReader protoReader) throws IOException {
                C15235a aVar = new C15235a();
                aVar.f40406a = "";
                aVar.f40407b = "";
                aVar.f40408c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40406a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40407b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40408c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TextProperty textProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textProperty.content);
                if (textProperty.i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, textProperty.i18n_key);
                }
                if (textProperty.numberOfLines != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, textProperty.numberOfLines);
                }
                protoWriter.writeBytes(textProperty.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15235a newBuilder() {
            C15235a aVar = new C15235a();
            aVar.f40406a = this.content;
            aVar.f40407b = this.i18n_key;
            aVar.f40408c = this.numberOfLines;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TextProperty$a */
        public static final class C15235a extends Message.Builder<TextProperty, C15235a> {

            /* renamed from: a */
            public String f40406a;

            /* renamed from: b */
            public String f40407b;

            /* renamed from: c */
            public Integer f40408c;

            /* renamed from: a */
            public TextProperty build() {
                String str = this.f40406a;
                if (str != null) {
                    return new TextProperty(str, this.f40407b, this.f40408c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "content");
            }

            /* renamed from: a */
            public C15235a mo55479a(Integer num) {
                this.f40408c = num;
                return this;
            }

            /* renamed from: b */
            public C15235a mo55482b(String str) {
                this.f40407b = str;
                return this;
            }

            /* renamed from: a */
            public C15235a mo55480a(String str) {
                this.f40406a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TextProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", content=");
            sb.append(this.content);
            if (this.i18n_key != null) {
                sb.append(", i18n_key=");
                sb.append(this.i18n_key);
            }
            if (this.numberOfLines != null) {
                sb.append(", numberOfLines=");
                sb.append(this.numberOfLines);
            }
            StringBuilder replace = sb.replace(0, 2, "TextProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TextProperty(String str, String str2, Integer num) {
            this(str, str2, num, ByteString.EMPTY);
        }

        public TextProperty(String str, String str2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = str;
            this.i18n_key = str2;
            this.numberOfLines = num;
        }
    }

    public static final class TextableAreaProperty extends Message<TextableAreaProperty, C15237a> {
        public static final ProtoAdapter<TextableAreaProperty> ADAPTER = new C15238b();
        public static final Integer DEFAULT_NUMBEROFLINES = 0;
        private static final long serialVersionUID = 0;
        public final Integer numberOfLines;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TextableAreaProperty$b */
        private static final class C15238b extends ProtoAdapter<TextableAreaProperty> {
            C15238b() {
                super(FieldEncoding.LENGTH_DELIMITED, TextableAreaProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TextableAreaProperty textableAreaProperty) {
                int i;
                if (textableAreaProperty.numberOfLines != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, textableAreaProperty.numberOfLines);
                } else {
                    i = 0;
                }
                return i + textableAreaProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TextableAreaProperty decode(ProtoReader protoReader) throws IOException {
                C15237a aVar = new C15237a();
                aVar.f40409a = 0;
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
                        aVar.f40409a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TextableAreaProperty textableAreaProperty) throws IOException {
                if (textableAreaProperty.numberOfLines != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, textableAreaProperty.numberOfLines);
                }
                protoWriter.writeBytes(textableAreaProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TextableAreaProperty$a */
        public static final class C15237a extends Message.Builder<TextableAreaProperty, C15237a> {

            /* renamed from: a */
            public Integer f40409a;

            /* renamed from: a */
            public TextableAreaProperty build() {
                return new TextableAreaProperty(this.f40409a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15237a newBuilder() {
            C15237a aVar = new C15237a();
            aVar.f40409a = this.numberOfLines;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TextableAreaProperty");
            StringBuilder sb = new StringBuilder();
            if (this.numberOfLines != null) {
                sb.append(", numberOfLines=");
                sb.append(this.numberOfLines);
            }
            StringBuilder replace = sb.replace(0, 2, "TextableAreaProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TextableAreaProperty(Integer num) {
            this(num, ByteString.EMPTY);
        }

        public TextableAreaProperty(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.numberOfLines = num;
        }
    }

    public static final class TimePickerProperty extends Message<TimePickerProperty, C15239a> {
        public static final ProtoAdapter<TimePickerProperty> ADAPTER = new C15240b();
        public static final Boolean DEFAULT_DISABLE = false;
        public static final Boolean DEFAULT_IS_LOADING = false;
        private static final long serialVersionUID = 0;
        public final String action_id;
        public final ButtonConfirmProperty confirm;
        public final Boolean disable;
        public final String initial_time;
        public final Boolean is_loading;
        public final String place_holder;
        public final String place_holder_i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TimePickerProperty$b */
        private static final class C15240b extends ProtoAdapter<TimePickerProperty> {
            C15240b() {
                super(FieldEncoding.LENGTH_DELIMITED, TimePickerProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TimePickerProperty timePickerProperty) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (timePickerProperty.action_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, timePickerProperty.action_id);
                } else {
                    i = 0;
                }
                if (timePickerProperty.place_holder != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, timePickerProperty.place_holder);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (timePickerProperty.place_holder_i18n_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, timePickerProperty.place_holder_i18n_key);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (timePickerProperty.initial_time != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, timePickerProperty.initial_time);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (timePickerProperty.confirm != null) {
                    i5 = ButtonConfirmProperty.ADAPTER.encodedSizeWithTag(5, timePickerProperty.confirm);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (timePickerProperty.disable != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, timePickerProperty.disable);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (timePickerProperty.is_loading != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, timePickerProperty.is_loading);
                }
                return i12 + i7 + timePickerProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TimePickerProperty decode(ProtoReader protoReader) throws IOException {
                C15239a aVar = new C15239a();
                aVar.f40410a = "";
                aVar.f40411b = "";
                aVar.f40412c = "";
                aVar.f40413d = "";
                aVar.f40415f = false;
                aVar.f40416g = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40410a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40411b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40412c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40413d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40414e = ButtonConfirmProperty.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40415f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40416g = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, TimePickerProperty timePickerProperty) throws IOException {
                if (timePickerProperty.action_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timePickerProperty.action_id);
                }
                if (timePickerProperty.place_holder != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, timePickerProperty.place_holder);
                }
                if (timePickerProperty.place_holder_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, timePickerProperty.place_holder_i18n_key);
                }
                if (timePickerProperty.initial_time != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, timePickerProperty.initial_time);
                }
                if (timePickerProperty.confirm != null) {
                    ButtonConfirmProperty.ADAPTER.encodeWithTag(protoWriter, 5, timePickerProperty.confirm);
                }
                if (timePickerProperty.disable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, timePickerProperty.disable);
                }
                if (timePickerProperty.is_loading != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, timePickerProperty.is_loading);
                }
                protoWriter.writeBytes(timePickerProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TimePickerProperty$a */
        public static final class C15239a extends Message.Builder<TimePickerProperty, C15239a> {

            /* renamed from: a */
            public String f40410a;

            /* renamed from: b */
            public String f40411b;

            /* renamed from: c */
            public String f40412c;

            /* renamed from: d */
            public String f40413d;

            /* renamed from: e */
            public ButtonConfirmProperty f40414e;

            /* renamed from: f */
            public Boolean f40415f;

            /* renamed from: g */
            public Boolean f40416g;

            /* renamed from: a */
            public TimePickerProperty build() {
                return new TimePickerProperty(this.f40410a, this.f40411b, this.f40412c, this.f40413d, this.f40414e, this.f40415f, this.f40416g, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15239a mo55490a(String str) {
                this.f40410a = str;
                return this;
            }

            /* renamed from: b */
            public C15239a mo55492b(String str) {
                this.f40413d = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15239a newBuilder() {
            C15239a aVar = new C15239a();
            aVar.f40410a = this.action_id;
            aVar.f40411b = this.place_holder;
            aVar.f40412c = this.place_holder_i18n_key;
            aVar.f40413d = this.initial_time;
            aVar.f40414e = this.confirm;
            aVar.f40415f = this.disable;
            aVar.f40416g = this.is_loading;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TimePickerProperty");
            StringBuilder sb = new StringBuilder();
            if (this.action_id != null) {
                sb.append(", action_id=");
                sb.append(this.action_id);
            }
            if (this.place_holder != null) {
                sb.append(", place_holder=");
                sb.append(this.place_holder);
            }
            if (this.place_holder_i18n_key != null) {
                sb.append(", place_holder_i18n_key=");
                sb.append(this.place_holder_i18n_key);
            }
            if (this.initial_time != null) {
                sb.append(", initial_time=");
                sb.append(this.initial_time);
            }
            if (this.confirm != null) {
                sb.append(", confirm=");
                sb.append(this.confirm);
            }
            if (this.disable != null) {
                sb.append(", disable=");
                sb.append(this.disable);
            }
            if (this.is_loading != null) {
                sb.append(", is_loading=");
                sb.append(this.is_loading);
            }
            StringBuilder replace = sb.replace(0, 2, "TimePickerProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TimePickerProperty(String str, String str2, String str3, String str4, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2) {
            this(str, str2, str3, str4, buttonConfirmProperty, bool, bool2, ByteString.EMPTY);
        }

        public TimePickerProperty(String str, String str2, String str3, String str4, ButtonConfirmProperty buttonConfirmProperty, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.action_id = str;
            this.place_holder = str2;
            this.place_holder_i18n_key = str3;
            this.initial_time = str4;
            this.confirm = buttonConfirmProperty;
            this.disable = bool;
            this.is_loading = bool2;
        }
    }

    public static final class TimeProperty extends Message<TimeProperty, C15241a> {
        public static final ProtoAdapter<TimeProperty> ADAPTER = new C15242b();
        public static final Long DEFAULT_MILLISECOND_SINCE1970 = 0L;
        private static final long serialVersionUID = 0;
        public final String format;
        public final Long millisecond_since1970;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TimeProperty$b */
        private static final class C15242b extends ProtoAdapter<TimeProperty> {
            C15242b() {
                super(FieldEncoding.LENGTH_DELIMITED, TimeProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(TimeProperty timeProperty) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, timeProperty.millisecond_since1970);
                if (timeProperty.format != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, timeProperty.format);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + timeProperty.unknownFields().size();
            }

            /* renamed from: a */
            public TimeProperty decode(ProtoReader protoReader) throws IOException {
                C15241a aVar = new C15241a();
                aVar.f40417a = 0L;
                aVar.f40418b = "YYYY.MM.DD(dddd) HH:mm (GMT)";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40417a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40418b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TimeProperty timeProperty) throws IOException {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, timeProperty.millisecond_since1970);
                if (timeProperty.format != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, timeProperty.format);
                }
                protoWriter.writeBytes(timeProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$TimeProperty$a */
        public static final class C15241a extends Message.Builder<TimeProperty, C15241a> {

            /* renamed from: a */
            public Long f40417a;

            /* renamed from: b */
            public String f40418b;

            /* renamed from: a */
            public TimeProperty build() {
                Long l = this.f40417a;
                if (l != null) {
                    return new TimeProperty(l, this.f40418b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(l, "millisecond_since1970");
            }
        }

        @Override // com.squareup.wire.Message
        public C15241a newBuilder() {
            C15241a aVar = new C15241a();
            aVar.f40417a = this.millisecond_since1970;
            aVar.f40418b = this.format;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TimeProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", millisecond_since1970=");
            sb.append(this.millisecond_since1970);
            if (this.format != null) {
                sb.append(", format=");
                sb.append(this.format);
            }
            StringBuilder replace = sb.replace(0, 2, "TimeProperty{");
            replace.append('}');
            return replace.toString();
        }

        public TimeProperty(Long l, String str) {
            this(l, str, ByteString.EMPTY);
        }

        public TimeProperty(Long l, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.millisecond_since1970 = l;
            this.format = str;
        }
    }

    public static final class UnderlineProperty extends Message<UnderlineProperty, C15245a> {
        public static final ProtoAdapter<UnderlineProperty> ADAPTER = new C15246b();
        private static final long serialVersionUID = 0;
        public final String content;
        public final String i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$UnderlineProperty$b */
        private static final class C15246b extends ProtoAdapter<UnderlineProperty> {
            C15246b() {
                super(FieldEncoding.LENGTH_DELIMITED, UnderlineProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(UnderlineProperty underlineProperty) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, underlineProperty.content);
                if (underlineProperty.i18n_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, underlineProperty.i18n_key);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + underlineProperty.unknownFields().size();
            }

            /* renamed from: a */
            public UnderlineProperty decode(ProtoReader protoReader) throws IOException {
                C15245a aVar = new C15245a();
                aVar.f40420a = "";
                aVar.f40421b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40420a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40421b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UnderlineProperty underlineProperty) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, underlineProperty.content);
                if (underlineProperty.i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, underlineProperty.i18n_key);
                }
                protoWriter.writeBytes(underlineProperty.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$UnderlineProperty$a */
        public static final class C15245a extends Message.Builder<UnderlineProperty, C15245a> {

            /* renamed from: a */
            public String f40420a;

            /* renamed from: b */
            public String f40421b;

            /* renamed from: a */
            public UnderlineProperty build() {
                String str = this.f40420a;
                if (str != null) {
                    return new UnderlineProperty(str, this.f40421b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "content");
            }

            /* renamed from: a */
            public C15245a mo55504a(String str) {
                this.f40420a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15245a newBuilder() {
            C15245a aVar = new C15245a();
            aVar.f40420a = this.content;
            aVar.f40421b = this.i18n_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "UnderlineProperty");
            StringBuilder sb = new StringBuilder();
            sb.append(", content=");
            sb.append(this.content);
            if (this.i18n_key != null) {
                sb.append(", i18n_key=");
                sb.append(this.i18n_key);
            }
            StringBuilder replace = sb.replace(0, 2, "UnderlineProperty{");
            replace.append('}');
            return replace.toString();
        }

        public UnderlineProperty(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public UnderlineProperty(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = str;
            this.i18n_key = str2;
        }
    }

    public static final class UnknownProperty extends Message<UnknownProperty, C15247a> {
        public static final ProtoAdapter<UnknownProperty> ADAPTER = new C15248b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$UnknownProperty$b */
        private static final class C15248b extends ProtoAdapter<UnknownProperty> {
            C15248b() {
                super(FieldEncoding.LENGTH_DELIMITED, UnknownProperty.class);
            }

            /* renamed from: a */
            public int encodedSize(UnknownProperty unknownProperty) {
                return unknownProperty.unknownFields().size();
            }

            /* renamed from: a */
            public UnknownProperty decode(ProtoReader protoReader) throws IOException {
                C15247a aVar = new C15247a();
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
            public void encode(ProtoWriter protoWriter, UnknownProperty unknownProperty) throws IOException {
                protoWriter.writeBytes(unknownProperty.unknownFields());
            }
        }

        public UnknownProperty() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$UnknownProperty$a */
        public static final class C15247a extends Message.Builder<UnknownProperty, C15247a> {
            /* renamed from: a */
            public UnknownProperty build() {
                return new UnknownProperty(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15247a newBuilder() {
            C15247a aVar = new C15247a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "UnknownProperty");
            StringBuilder replace = new StringBuilder().replace(0, 2, "UnknownProperty{");
            replace.append('}');
            return replace.toString();
        }

        public UnknownProperty(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$b */
    private static final class C15250b extends ProtoAdapter<RichTextElement> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40428a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f40429b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15250b() {
            super(FieldEncoding.LENGTH_DELIMITED, RichTextElement.class);
        }

        /* renamed from: a */
        public int encodedSize(RichTextElement richTextElement) {
            return Tag.ADAPTER.encodedSizeWithTag(1, richTextElement.tag) + this.f40428a.encodedSizeWithTag(2, richTextElement.style) + PropertySet.ADAPTER.encodedSizeWithTag(3, richTextElement.property) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, richTextElement.child_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, richTextElement.style_keys) + this.f40429b.encodedSizeWithTag(6, richTextElement.wide_style) + richTextElement.unknownFields().size();
        }

        /* renamed from: a */
        public RichTextElement decode(ProtoReader protoReader) throws IOException {
            C15249a aVar = new C15249a();
            aVar.f40422a = Tag.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f40422a = Tag.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f40423b.putAll(this.f40428a.decode(protoReader));
                            break;
                        case 3:
                            aVar.f40424c = PropertySet.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40425d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f40426e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f40427f.putAll(this.f40429b.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, RichTextElement richTextElement) throws IOException {
            Tag.ADAPTER.encodeWithTag(protoWriter, 1, richTextElement.tag);
            this.f40428a.encodeWithTag(protoWriter, 2, richTextElement.style);
            PropertySet.ADAPTER.encodeWithTag(protoWriter, 3, richTextElement.property);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, richTextElement.child_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, richTextElement.style_keys);
            this.f40429b.encodeWithTag(protoWriter, 6, richTextElement.wide_style);
            protoWriter.writeBytes(richTextElement.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RichTextElement$a */
    public static final class C15249a extends Message.Builder<RichTextElement, C15249a> {

        /* renamed from: a */
        public Tag f40422a;

        /* renamed from: b */
        public Map<String, String> f40423b = Internal.newMutableMap();

        /* renamed from: c */
        public PropertySet f40424c;

        /* renamed from: d */
        public List<String> f40425d = Internal.newMutableList();

        /* renamed from: e */
        public List<String> f40426e = Internal.newMutableList();

        /* renamed from: f */
        public Map<String, String> f40427f = Internal.newMutableMap();

        /* renamed from: a */
        public RichTextElement build() {
            PropertySet propertySet;
            Tag tag = this.f40422a;
            if (tag != null && (propertySet = this.f40424c) != null) {
                return new RichTextElement(tag, this.f40423b, propertySet, this.f40425d, this.f40426e, this.f40427f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(tag, "tag", this.f40424c, "property");
        }

        /* renamed from: a */
        public C15249a mo55513a(PropertySet propertySet) {
            this.f40424c = propertySet;
            return this;
        }

        /* renamed from: a */
        public C15249a mo55514a(Tag tag) {
            this.f40422a = tag;
            return this;
        }

        /* renamed from: a */
        public C15249a mo55515a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40425d = list;
            return this;
        }

        /* renamed from: a */
        public C15249a mo55516a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f40423b = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15249a newBuilder() {
        C15249a aVar = new C15249a();
        aVar.f40422a = this.tag;
        aVar.f40423b = Internal.copyOf("style", this.style);
        aVar.f40424c = this.property;
        aVar.f40425d = Internal.copyOf("child_ids", this.child_ids);
        aVar.f40426e = Internal.copyOf("style_keys", this.style_keys);
        aVar.f40427f = Internal.copyOf("wide_style", this.wide_style);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "RichTextElement");
        StringBuilder sb = new StringBuilder();
        sb.append(", tag=");
        sb.append(this.tag);
        if (!this.style.isEmpty()) {
            sb.append(", style=");
            sb.append(this.style);
        }
        sb.append(", property=");
        sb.append(this.property);
        if (!this.child_ids.isEmpty()) {
            sb.append(", child_ids=");
            sb.append(this.child_ids);
        }
        if (!this.style_keys.isEmpty()) {
            sb.append(", style_keys=");
            sb.append(this.style_keys);
        }
        if (!this.wide_style.isEmpty()) {
            sb.append(", wide_style=");
            sb.append(this.wide_style);
        }
        StringBuilder replace = sb.replace(0, 2, "RichTextElement{");
        replace.append('}');
        return replace.toString();
    }

    public RichTextElement(Tag tag2, Map<String, String> map, PropertySet propertySet, List<String> list, List<String> list2, Map<String, String> map2) {
        this(tag2, map, propertySet, list, list2, map2, ByteString.EMPTY);
    }

    public RichTextElement(Tag tag2, Map<String, String> map, PropertySet propertySet, List<String> list, List<String> list2, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tag = tag2;
        this.style = Internal.immutableCopyOf("style", map);
        this.property = propertySet;
        this.child_ids = Internal.immutableCopyOf("child_ids", list);
        this.style_keys = Internal.immutableCopyOf("style_keys", list2);
        this.wide_style = Internal.immutableCopyOf("wide_style", map2);
    }
}
