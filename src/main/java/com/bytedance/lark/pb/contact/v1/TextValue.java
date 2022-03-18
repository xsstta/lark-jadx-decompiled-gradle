package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TextValue extends Message<TextValue, C16404a> {
    public static final ProtoAdapter<TextValue> ADAPTER = new C16405b();
    public static final AlignFormat DEFAULT_ALIGN = AlignFormat.Unknown;
    public static final Double DEFAULT_FONT_SIZE;
    public static final Double DEFAULT_LETTER_SPACE;
    public static final Double DEFAULT_LINE_SPACE;
    public static final Double DEFAULT_MIN_FONT_SIZE;
    public static final OverflowOption DEFAULT_OVERFLOW = OverflowOption.Multi;
    public static final TextStyle DEFAULT_TEXT_STYLE = TextStyle.Normal;
    private static final long serialVersionUID = 0;
    public final AlignFormat align;
    public final String color;
    public final String font_family;
    public final Double font_size;
    public final Double letter_space;
    public final Double line_space;
    public final Double min_font_size;
    public final OverflowOption overflow;
    public final TextStyle text_style;
    public final String value;

    public enum AlignFormat implements WireEnum {
        Unknown(0),
        AlignCenter(1),
        AlignLeft(2),
        AlignRight(3);
        
        public static final ProtoAdapter<AlignFormat> ADAPTER = ProtoAdapter.newEnumAdapter(AlignFormat.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AlignFormat fromValue(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i == 1) {
                return AlignCenter;
            }
            if (i == 2) {
                return AlignLeft;
            }
            if (i != 3) {
                return null;
            }
            return AlignRight;
        }

        private AlignFormat(int i) {
            this.value = i;
        }
    }

    public enum OverflowOption implements WireEnum {
        Multi(0),
        SingleAdaptive(1),
        SingleFixed(2);
        
        public static final ProtoAdapter<OverflowOption> ADAPTER = ProtoAdapter.newEnumAdapter(OverflowOption.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OverflowOption fromValue(int i) {
            if (i == 0) {
                return Multi;
            }
            if (i == 1) {
                return SingleAdaptive;
            }
            if (i != 2) {
                return null;
            }
            return SingleFixed;
        }

        private OverflowOption(int i) {
            this.value = i;
        }
    }

    public enum TextStyle implements WireEnum {
        Normal(0),
        Bold(1),
        Italic(2),
        BoldItalic(3);
        
        public static final ProtoAdapter<TextStyle> ADAPTER = ProtoAdapter.newEnumAdapter(TextStyle.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TextStyle fromValue(int i) {
            if (i == 0) {
                return Normal;
            }
            if (i == 1) {
                return Bold;
            }
            if (i == 2) {
                return Italic;
            }
            if (i != 3) {
                return null;
            }
            return BoldItalic;
        }

        private TextStyle(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.TextValue$b */
    private static final class C16405b extends ProtoAdapter<TextValue> {
        C16405b() {
            super(FieldEncoding.LENGTH_DELIMITED, TextValue.class);
        }

        /* renamed from: a */
        public int encodedSize(TextValue textValue) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, textValue.value) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, textValue.font_size);
            int i8 = 0;
            if (textValue.font_family != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, textValue.font_family);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (textValue.color != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, textValue.color);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (textValue.align != null) {
                i3 = AlignFormat.ADAPTER.encodedSizeWithTag(5, textValue.align);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (textValue.line_space != null) {
                i4 = ProtoAdapter.DOUBLE.encodedSizeWithTag(6, textValue.line_space);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (textValue.letter_space != null) {
                i5 = ProtoAdapter.DOUBLE.encodedSizeWithTag(7, textValue.letter_space);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (textValue.text_style != null) {
                i6 = TextStyle.ADAPTER.encodedSizeWithTag(8, textValue.text_style);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (textValue.overflow != null) {
                i7 = OverflowOption.ADAPTER.encodedSizeWithTag(9, textValue.overflow);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (textValue.min_font_size != null) {
                i8 = ProtoAdapter.DOUBLE.encodedSizeWithTag(10, textValue.min_font_size);
            }
            return i15 + i8 + textValue.unknownFields().size();
        }

        /* renamed from: a */
        public TextValue decode(ProtoReader protoReader) throws IOException {
            C16404a aVar = new C16404a();
            aVar.f42664a = "";
            Double valueOf = Double.valueOf(0.0d);
            aVar.f42665b = valueOf;
            aVar.f42666c = "";
            aVar.f42667d = "";
            aVar.f42668e = AlignFormat.Unknown;
            aVar.f42669f = valueOf;
            aVar.f42670g = valueOf;
            aVar.f42671h = TextStyle.Normal;
            aVar.f42672i = OverflowOption.Multi;
            aVar.f42673j = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42664a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42665b = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42666c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42667d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f42668e = AlignFormat.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f42669f = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42670g = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f42671h = TextStyle.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            try {
                                aVar.f42672i = OverflowOption.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 10:
                            aVar.f42673j = ProtoAdapter.DOUBLE.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, TextValue textValue) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textValue.value);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, textValue.font_size);
            if (textValue.font_family != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, textValue.font_family);
            }
            if (textValue.color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, textValue.color);
            }
            if (textValue.align != null) {
                AlignFormat.ADAPTER.encodeWithTag(protoWriter, 5, textValue.align);
            }
            if (textValue.line_space != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, textValue.line_space);
            }
            if (textValue.letter_space != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 7, textValue.letter_space);
            }
            if (textValue.text_style != null) {
                TextStyle.ADAPTER.encodeWithTag(protoWriter, 8, textValue.text_style);
            }
            if (textValue.overflow != null) {
                OverflowOption.ADAPTER.encodeWithTag(protoWriter, 9, textValue.overflow);
            }
            if (textValue.min_font_size != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 10, textValue.min_font_size);
            }
            protoWriter.writeBytes(textValue.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.TextValue$a */
    public static final class C16404a extends Message.Builder<TextValue, C16404a> {

        /* renamed from: a */
        public String f42664a;

        /* renamed from: b */
        public Double f42665b;

        /* renamed from: c */
        public String f42666c;

        /* renamed from: d */
        public String f42667d;

        /* renamed from: e */
        public AlignFormat f42668e;

        /* renamed from: f */
        public Double f42669f;

        /* renamed from: g */
        public Double f42670g;

        /* renamed from: h */
        public TextStyle f42671h;

        /* renamed from: i */
        public OverflowOption f42672i;

        /* renamed from: j */
        public Double f42673j;

        /* renamed from: a */
        public TextValue build() {
            Double d;
            String str = this.f42664a;
            if (str != null && (d = this.f42665b) != null) {
                return new TextValue(str, d, this.f42666c, this.f42667d, this.f42668e, this.f42669f, this.f42670g, this.f42671h, this.f42672i, this.f42673j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "value", this.f42665b, "font_size");
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_FONT_SIZE = valueOf;
        DEFAULT_LINE_SPACE = valueOf;
        DEFAULT_LETTER_SPACE = valueOf;
        DEFAULT_MIN_FONT_SIZE = valueOf;
    }

    @Override // com.squareup.wire.Message
    public C16404a newBuilder() {
        C16404a aVar = new C16404a();
        aVar.f42664a = this.value;
        aVar.f42665b = this.font_size;
        aVar.f42666c = this.font_family;
        aVar.f42667d = this.color;
        aVar.f42668e = this.align;
        aVar.f42669f = this.line_space;
        aVar.f42670g = this.letter_space;
        aVar.f42671h = this.text_style;
        aVar.f42672i = this.overflow;
        aVar.f42673j = this.min_font_size;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "TextValue");
        StringBuilder sb = new StringBuilder();
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", font_size=");
        sb.append(this.font_size);
        if (this.font_family != null) {
            sb.append(", font_family=");
            sb.append(this.font_family);
        }
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.align != null) {
            sb.append(", align=");
            sb.append(this.align);
        }
        if (this.line_space != null) {
            sb.append(", line_space=");
            sb.append(this.line_space);
        }
        if (this.letter_space != null) {
            sb.append(", letter_space=");
            sb.append(this.letter_space);
        }
        if (this.text_style != null) {
            sb.append(", text_style=");
            sb.append(this.text_style);
        }
        if (this.overflow != null) {
            sb.append(", overflow=");
            sb.append(this.overflow);
        }
        if (this.min_font_size != null) {
            sb.append(", min_font_size=");
            sb.append(this.min_font_size);
        }
        StringBuilder replace = sb.replace(0, 2, "TextValue{");
        replace.append('}');
        return replace.toString();
    }

    public TextValue(String str, Double d, String str2, String str3, AlignFormat alignFormat, Double d2, Double d3, TextStyle textStyle, OverflowOption overflowOption, Double d4) {
        this(str, d, str2, str3, alignFormat, d2, d3, textStyle, overflowOption, d4, ByteString.EMPTY);
    }

    public TextValue(String str, Double d, String str2, String str3, AlignFormat alignFormat, Double d2, Double d3, TextStyle textStyle, OverflowOption overflowOption, Double d4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.value = str;
        this.font_size = d;
        this.font_family = str2;
        this.color = str3;
        this.align = alignFormat;
        this.line_space = d2;
        this.letter_space = d3;
        this.text_style = textStyle;
        this.overflow = overflowOption;
        this.min_font_size = d4;
    }
}
