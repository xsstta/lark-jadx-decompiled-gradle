package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TextValue extends Message<TextValue, C49630a> {
    public static final ProtoAdapter<TextValue> ADAPTER = new C49631b();
    public static final Double DEFAULT_FONT_SIZE;
    public static final Double DEFAULT_LETTER_SPACE;
    public static final Double DEFAULT_LINE_SPACE;
    public static final Double DEFAULT_MIN_FONT_SIZE;
    private static final long serialVersionUID = 0;
    public final AlignFormat malign;
    public final String mcolor;
    public final String mfont_family;
    public final Double mfont_size;
    public final Double mletter_space;
    public final Double mline_space;
    public final Double mmin_font_size;
    public final OverflowOption moverflow;
    public final TextStyle mtext_style;
    public final String mvalue;

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

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.TextValue$b */
    private static final class C49631b extends ProtoAdapter<TextValue> {
        C49631b() {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, textValue.mvalue) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, textValue.mfont_size);
            int i8 = 0;
            if (textValue.mfont_family != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, textValue.mfont_family);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (textValue.mcolor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, textValue.mcolor);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (textValue.malign != null) {
                i3 = AlignFormat.ADAPTER.encodedSizeWithTag(5, textValue.malign);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (textValue.mline_space != null) {
                i4 = ProtoAdapter.DOUBLE.encodedSizeWithTag(6, textValue.mline_space);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (textValue.mletter_space != null) {
                i5 = ProtoAdapter.DOUBLE.encodedSizeWithTag(7, textValue.mletter_space);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (textValue.mtext_style != null) {
                i6 = TextStyle.ADAPTER.encodedSizeWithTag(8, textValue.mtext_style);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (textValue.moverflow != null) {
                i7 = OverflowOption.ADAPTER.encodedSizeWithTag(9, textValue.moverflow);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (textValue.mmin_font_size != null) {
                i8 = ProtoAdapter.DOUBLE.encodedSizeWithTag(10, textValue.mmin_font_size);
            }
            return i15 + i8 + textValue.unknownFields().size();
        }

        /* renamed from: a */
        public TextValue decode(ProtoReader protoReader) throws IOException {
            C49630a aVar = new C49630a();
            aVar.f124267a = "";
            Double valueOf = Double.valueOf(0.0d);
            aVar.f124268b = valueOf;
            aVar.f124269c = "";
            aVar.f124270d = "";
            aVar.f124272f = valueOf;
            aVar.f124273g = valueOf;
            aVar.f124276j = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124267a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124268b = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124269c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124270d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f124271e = AlignFormat.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f124272f = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124273g = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f124274h = TextStyle.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            try {
                                aVar.f124275i = OverflowOption.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 10:
                            aVar.f124276j = ProtoAdapter.DOUBLE.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textValue.mvalue);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, textValue.mfont_size);
            if (textValue.mfont_family != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, textValue.mfont_family);
            }
            if (textValue.mcolor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, textValue.mcolor);
            }
            if (textValue.malign != null) {
                AlignFormat.ADAPTER.encodeWithTag(protoWriter, 5, textValue.malign);
            }
            if (textValue.mline_space != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, textValue.mline_space);
            }
            if (textValue.mletter_space != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 7, textValue.mletter_space);
            }
            if (textValue.mtext_style != null) {
                TextStyle.ADAPTER.encodeWithTag(protoWriter, 8, textValue.mtext_style);
            }
            if (textValue.moverflow != null) {
                OverflowOption.ADAPTER.encodeWithTag(protoWriter, 9, textValue.moverflow);
            }
            if (textValue.mmin_font_size != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 10, textValue.mmin_font_size);
            }
            protoWriter.writeBytes(textValue.unknownFields());
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_FONT_SIZE = valueOf;
        DEFAULT_LINE_SPACE = valueOf;
        DEFAULT_LETTER_SPACE = valueOf;
        DEFAULT_MIN_FONT_SIZE = valueOf;
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.TextValue$a */
    public static final class C49630a extends Message.Builder<TextValue, C49630a> {

        /* renamed from: a */
        public String f124267a;

        /* renamed from: b */
        public Double f124268b;

        /* renamed from: c */
        public String f124269c;

        /* renamed from: d */
        public String f124270d;

        /* renamed from: e */
        public AlignFormat f124271e;

        /* renamed from: f */
        public Double f124272f;

        /* renamed from: g */
        public Double f124273g;

        /* renamed from: h */
        public TextStyle f124274h;

        /* renamed from: i */
        public OverflowOption f124275i;

        /* renamed from: j */
        public Double f124276j;

        /* renamed from: a */
        public TextValue build() {
            Double d;
            String str = this.f124267a;
            if (str != null && (d = this.f124268b) != null) {
                return new TextValue(str, d, this.f124269c, this.f124270d, this.f124271e, this.f124272f, this.f124273g, this.f124274h, this.f124275i, this.f124276j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mvalue", this.f124268b, "mfont_size");
        }
    }

    @Override // com.squareup.wire.Message
    public C49630a newBuilder() {
        C49630a aVar = new C49630a();
        aVar.f124267a = this.mvalue;
        aVar.f124268b = this.mfont_size;
        aVar.f124269c = this.mfont_family;
        aVar.f124270d = this.mcolor;
        aVar.f124271e = this.malign;
        aVar.f124272f = this.mline_space;
        aVar.f124273g = this.mletter_space;
        aVar.f124274h = this.mtext_style;
        aVar.f124275i = this.moverflow;
        aVar.f124276j = this.mmin_font_size;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", value=");
        sb.append(this.mvalue);
        sb.append(", font_size=");
        sb.append(this.mfont_size);
        if (this.mfont_family != null) {
            sb.append(", font_family=");
            sb.append(this.mfont_family);
        }
        if (this.mcolor != null) {
            sb.append(", color=");
            sb.append(this.mcolor);
        }
        if (this.malign != null) {
            sb.append(", align=");
            sb.append(this.malign);
        }
        if (this.mline_space != null) {
            sb.append(", line_space=");
            sb.append(this.mline_space);
        }
        if (this.mletter_space != null) {
            sb.append(", letter_space=");
            sb.append(this.mletter_space);
        }
        if (this.mtext_style != null) {
            sb.append(", text_style=");
            sb.append(this.mtext_style);
        }
        if (this.moverflow != null) {
            sb.append(", overflow=");
            sb.append(this.moverflow);
        }
        if (this.mmin_font_size != null) {
            sb.append(", min_font_size=");
            sb.append(this.mmin_font_size);
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
        this.mvalue = str;
        this.mfont_size = d;
        this.mfont_family = str2;
        this.mcolor = str3;
        this.malign = alignFormat;
        this.mline_space = d2;
        this.mletter_space = d3;
        this.mtext_style = textStyle;
        this.moverflow = overflowOption;
        this.mmin_font_size = d4;
    }
}
