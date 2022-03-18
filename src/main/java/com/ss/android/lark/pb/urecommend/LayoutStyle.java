package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class LayoutStyle extends Message<LayoutStyle, C50152a> {
    public static final ProtoAdapter<LayoutStyle> ADAPTER = new C50153b();
    private static final long serialVersionUID = 0;
    public final CardStyle mcard_style;
    public final ListStyle mlist_style;
    public final Style mstyle;

    public enum Style implements WireEnum {
        UNKNOWN(0),
        CARD_STYLE(1),
        LIST_STYLE(2);
        
        public static final ProtoAdapter<Style> ADAPTER = ProtoAdapter.newEnumAdapter(Style.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Style fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CARD_STYLE;
            }
            if (i != 2) {
                return null;
            }
            return LIST_STYLE;
        }

        private Style(int i) {
            this.value = i;
        }
    }

    public static final class CardStyle extends Message<CardStyle, C50148a> {
        public static final ProtoAdapter<CardStyle> ADAPTER = new C50149b();
        public static final Integer DEFAULT_COLS = 0;
        public static final Boolean DEFAULT_DEFUALT_IS_EXPAND = false;
        public static final Integer DEFAULT_EXPAND_ROWS = 0;
        private static final long serialVersionUID = 0;
        public final Integer mcols;
        public final Boolean mdefualt_is_expand;
        public final Integer mexpand_rows;
        public final IconStyle micon_style;

        /* renamed from: com.ss.android.lark.pb.urecommend.LayoutStyle$CardStyle$b */
        private static final class C50149b extends ProtoAdapter<CardStyle> {
            C50149b() {
                super(FieldEncoding.LENGTH_DELIMITED, CardStyle.class);
            }

            /* renamed from: a */
            public int encodedSize(CardStyle cardStyle) {
                int i;
                int i2;
                int encodedSizeWithTag = IconStyle.ADAPTER.encodedSizeWithTag(1, cardStyle.micon_style);
                int i3 = 0;
                if (cardStyle.mcols != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, cardStyle.mcols);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (cardStyle.mexpand_rows != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, cardStyle.mexpand_rows);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (cardStyle.mdefualt_is_expand != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, cardStyle.mdefualt_is_expand);
                }
                return i5 + i3 + cardStyle.unknownFields().size();
            }

            /* renamed from: a */
            public CardStyle decode(ProtoReader protoReader) throws IOException {
                C50148a aVar = new C50148a();
                aVar.f125338b = 0;
                aVar.f125339c = 0;
                aVar.f125340d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f125337a = IconStyle.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f125338b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f125339c = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125340d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CardStyle cardStyle) throws IOException {
                IconStyle.ADAPTER.encodeWithTag(protoWriter, 1, cardStyle.micon_style);
                if (cardStyle.mcols != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, cardStyle.mcols);
                }
                if (cardStyle.mexpand_rows != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, cardStyle.mexpand_rows);
                }
                if (cardStyle.mdefualt_is_expand != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, cardStyle.mdefualt_is_expand);
                }
                protoWriter.writeBytes(cardStyle.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50148a newBuilder() {
            C50148a aVar = new C50148a();
            aVar.f125337a = this.micon_style;
            aVar.f125338b = this.mcols;
            aVar.f125339c = this.mexpand_rows;
            aVar.f125340d = this.mdefualt_is_expand;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.urecommend.LayoutStyle$CardStyle$a */
        public static final class C50148a extends Message.Builder<CardStyle, C50148a> {

            /* renamed from: a */
            public IconStyle f125337a;

            /* renamed from: b */
            public Integer f125338b;

            /* renamed from: c */
            public Integer f125339c;

            /* renamed from: d */
            public Boolean f125340d;

            /* renamed from: a */
            public CardStyle build() {
                IconStyle iconStyle = this.f125337a;
                if (iconStyle != null) {
                    return new CardStyle(iconStyle, this.f125338b, this.f125339c, this.f125340d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(iconStyle, "micon_style");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", icon_style=");
            sb.append(this.micon_style);
            if (this.mcols != null) {
                sb.append(", cols=");
                sb.append(this.mcols);
            }
            if (this.mexpand_rows != null) {
                sb.append(", expand_rows=");
                sb.append(this.mexpand_rows);
            }
            if (this.mdefualt_is_expand != null) {
                sb.append(", defualt_is_expand=");
                sb.append(this.mdefualt_is_expand);
            }
            StringBuilder replace = sb.replace(0, 2, "CardStyle{");
            replace.append('}');
            return replace.toString();
        }

        public CardStyle(IconStyle iconStyle, Integer num, Integer num2, Boolean bool) {
            this(iconStyle, num, num2, bool, ByteString.EMPTY);
        }

        public CardStyle(IconStyle iconStyle, Integer num, Integer num2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.micon_style = iconStyle;
            this.mcols = num;
            this.mexpand_rows = num2;
            this.mdefualt_is_expand = bool;
        }
    }

    public static final class ListStyle extends Message<ListStyle, C50150a> {
        public static final ProtoAdapter<ListStyle> ADAPTER = new C50151b();
        private static final long serialVersionUID = 0;
        public final IconStyle micon_style;

        /* renamed from: com.ss.android.lark.pb.urecommend.LayoutStyle$ListStyle$b */
        private static final class C50151b extends ProtoAdapter<ListStyle> {
            C50151b() {
                super(FieldEncoding.LENGTH_DELIMITED, ListStyle.class);
            }

            /* renamed from: a */
            public int encodedSize(ListStyle listStyle) {
                return IconStyle.ADAPTER.encodedSizeWithTag(1, listStyle.micon_style) + listStyle.unknownFields().size();
            }

            /* renamed from: a */
            public ListStyle decode(ProtoReader protoReader) throws IOException {
                C50150a aVar = new C50150a();
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
                            aVar.f125341a = IconStyle.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ListStyle listStyle) throws IOException {
                IconStyle.ADAPTER.encodeWithTag(protoWriter, 1, listStyle.micon_style);
                protoWriter.writeBytes(listStyle.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.urecommend.LayoutStyle$ListStyle$a */
        public static final class C50150a extends Message.Builder<ListStyle, C50150a> {

            /* renamed from: a */
            public IconStyle f125341a;

            /* renamed from: a */
            public ListStyle build() {
                IconStyle iconStyle = this.f125341a;
                if (iconStyle != null) {
                    return new ListStyle(iconStyle, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(iconStyle, "micon_style");
            }
        }

        @Override // com.squareup.wire.Message
        public C50150a newBuilder() {
            C50150a aVar = new C50150a();
            aVar.f125341a = this.micon_style;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", icon_style=");
            sb.append(this.micon_style);
            StringBuilder replace = sb.replace(0, 2, "ListStyle{");
            replace.append('}');
            return replace.toString();
        }

        public ListStyle(IconStyle iconStyle) {
            this(iconStyle, ByteString.EMPTY);
        }

        public ListStyle(IconStyle iconStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            this.micon_style = iconStyle;
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.LayoutStyle$b */
    private static final class C50153b extends ProtoAdapter<LayoutStyle> {
        C50153b() {
            super(FieldEncoding.LENGTH_DELIMITED, LayoutStyle.class);
        }

        /* renamed from: a */
        public int encodedSize(LayoutStyle layoutStyle) {
            int i;
            int encodedSizeWithTag = Style.ADAPTER.encodedSizeWithTag(1, layoutStyle.mstyle);
            int i2 = 0;
            if (layoutStyle.mcard_style != null) {
                i = CardStyle.ADAPTER.encodedSizeWithTag(2, layoutStyle.mcard_style);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (layoutStyle.mlist_style != null) {
                i2 = ListStyle.ADAPTER.encodedSizeWithTag(3, layoutStyle.mlist_style);
            }
            return i3 + i2 + layoutStyle.unknownFields().size();
        }

        /* renamed from: a */
        public LayoutStyle decode(ProtoReader protoReader) throws IOException {
            C50152a aVar = new C50152a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f125342a = Style.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.mo174131a(CardStyle.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo174132a(ListStyle.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LayoutStyle layoutStyle) throws IOException {
            Style.ADAPTER.encodeWithTag(protoWriter, 1, layoutStyle.mstyle);
            if (layoutStyle.mcard_style != null) {
                CardStyle.ADAPTER.encodeWithTag(protoWriter, 2, layoutStyle.mcard_style);
            }
            if (layoutStyle.mlist_style != null) {
                ListStyle.ADAPTER.encodeWithTag(protoWriter, 3, layoutStyle.mlist_style);
            }
            protoWriter.writeBytes(layoutStyle.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50152a newBuilder() {
        C50152a aVar = new C50152a();
        aVar.f125342a = this.mstyle;
        aVar.f125343b = this.mcard_style;
        aVar.f125344c = this.mlist_style;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.LayoutStyle$a */
    public static final class C50152a extends Message.Builder<LayoutStyle, C50152a> {

        /* renamed from: a */
        public Style f125342a;

        /* renamed from: b */
        public CardStyle f125343b;

        /* renamed from: c */
        public ListStyle f125344c;

        /* renamed from: a */
        public LayoutStyle build() {
            Style style = this.f125342a;
            if (style != null) {
                return new LayoutStyle(style, this.f125343b, this.f125344c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(style, "mstyle");
        }

        /* renamed from: a */
        public C50152a mo174131a(CardStyle cardStyle) {
            this.f125343b = cardStyle;
            this.f125344c = null;
            return this;
        }

        /* renamed from: a */
        public C50152a mo174132a(ListStyle listStyle) {
            this.f125344c = listStyle;
            this.f125343b = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", style=");
        sb.append(this.mstyle);
        if (this.mcard_style != null) {
            sb.append(", card_style=");
            sb.append(this.mcard_style);
        }
        if (this.mlist_style != null) {
            sb.append(", list_style=");
            sb.append(this.mlist_style);
        }
        StringBuilder replace = sb.replace(0, 2, "LayoutStyle{");
        replace.append('}');
        return replace.toString();
    }

    public LayoutStyle(Style style, CardStyle cardStyle, ListStyle listStyle) {
        this(style, cardStyle, listStyle, ByteString.EMPTY);
    }

    public LayoutStyle(Style style, CardStyle cardStyle, ListStyle listStyle, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(cardStyle, listStyle) <= 1) {
            this.mstyle = style;
            this.mcard_style = cardStyle;
            this.mlist_style = listStyle;
            return;
        }
        throw new IllegalArgumentException("at most one of mcard_style, mlist_style may be non-null");
    }
}
