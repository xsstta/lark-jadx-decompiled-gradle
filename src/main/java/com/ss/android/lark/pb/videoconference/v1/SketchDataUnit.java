package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
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

public final class SketchDataUnit extends Message<SketchDataUnit, C51076a> {
    public static final ProtoAdapter<SketchDataUnit> ADAPTER = new C51077b();
    public static final Integer DEFAULT_CURRENT_STEP = 0;
    public static final ShapeType DEFAULT_SHAPE_TYPE = ShapeType.PENCIL;
    private static final long serialVersionUID = 0;
    public final Arrow arrow;
    public final Comet comet;
    public final Integer current_step;
    public final Line line;
    public final Oval oval;
    public final Pencil pencil;
    public final Rect rect;
    public final String shape_id;
    public final ShapeType shape_type;
    public final Text text;
    public final ByteviewUser user;

    public static final class Pencil extends Message<Pencil, C51070a> {
        public static final ProtoAdapter<Pencil> ADAPTER = new C51071b();
        public static final Long DEFAULT_COLOR = 0L;
        public static final Integer DEFAULT_DIMENSION = 0;
        public static final Integer DEFAULT_DURATION = 0;
        public static final Boolean DEFAULT_FINISH = false;
        public static final PencilType DEFAULT_PENCIL_TYPE = PencilType.DEFAULT;
        public static final Float DEFAULT_SIZE = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        private static final long serialVersionUID = 0;
        public final Long color;
        public final List<Coord> coords;
        public final Integer dimension;
        public final Integer duration;
        public final Boolean finish;
        public final PencilType pencil_type;
        public final Float size;

        public enum PencilType implements WireEnum {
            DEFAULT(1),
            MARKER(2);
            
            public static final ProtoAdapter<PencilType> ADAPTER = ProtoAdapter.newEnumAdapter(PencilType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static PencilType fromValue(int i) {
                if (i == 1) {
                    return DEFAULT;
                }
                if (i != 2) {
                    return null;
                }
                return MARKER;
            }

            private PencilType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Pencil$b */
        private static final class C51071b extends ProtoAdapter<Pencil> {
            C51071b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pencil.class);
            }

            /* renamed from: a */
            public int encodedSize(Pencil pencil) {
                return Coord.ADAPTER.asRepeated().encodedSizeWithTag(1, pencil.coords) + ProtoAdapter.INT32.encodedSizeWithTag(2, pencil.duration) + ProtoAdapter.BOOL.encodedSizeWithTag(3, pencil.finish) + ProtoAdapter.INT32.encodedSizeWithTag(4, pencil.dimension) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, pencil.size) + ProtoAdapter.INT64.encodedSizeWithTag(6, pencil.color) + PencilType.ADAPTER.encodedSizeWithTag(7, pencil.pencil_type) + pencil.unknownFields().size();
            }

            /* renamed from: a */
            public Pencil decode(ProtoReader protoReader) throws IOException {
                C51070a aVar = new C51070a();
                aVar.f127166b = 0;
                aVar.f127167c = false;
                aVar.f127168d = 0;
                aVar.f127169e = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                aVar.f127170f = 0L;
                aVar.f127171g = PencilType.DEFAULT;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127165a.add(Coord.ADAPTER.decode(protoReader));
                                break;
                            case 2:
                                aVar.f127166b = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                aVar.f127167c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127168d = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127169e = ProtoAdapter.FLOAT.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127170f = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 7:
                                try {
                                    aVar.f127171g = PencilType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
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
            public void encode(ProtoWriter protoWriter, Pencil pencil) throws IOException {
                Coord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pencil.coords);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pencil.duration);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pencil.finish);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, pencil.dimension);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, pencil.size);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, pencil.color);
                PencilType.ADAPTER.encodeWithTag(protoWriter, 7, pencil.pencil_type);
                protoWriter.writeBytes(pencil.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51070a newBuilder() {
            C51070a aVar = new C51070a();
            aVar.f127165a = Internal.copyOf("coords", this.coords);
            aVar.f127166b = this.duration;
            aVar.f127167c = this.finish;
            aVar.f127168d = this.dimension;
            aVar.f127169e = this.size;
            aVar.f127170f = this.color;
            aVar.f127171g = this.pencil_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Pencil$a */
        public static final class C51070a extends Message.Builder<Pencil, C51070a> {

            /* renamed from: a */
            public List<Coord> f127165a = Internal.newMutableList();

            /* renamed from: b */
            public Integer f127166b;

            /* renamed from: c */
            public Boolean f127167c;

            /* renamed from: d */
            public Integer f127168d;

            /* renamed from: e */
            public Float f127169e;

            /* renamed from: f */
            public Long f127170f;

            /* renamed from: g */
            public PencilType f127171g;

            /* renamed from: a */
            public Pencil build() {
                Boolean bool;
                Integer num;
                Float f;
                Long l;
                PencilType pencilType;
                Integer num2 = this.f127166b;
                if (num2 != null && (bool = this.f127167c) != null && (num = this.f127168d) != null && (f = this.f127169e) != null && (l = this.f127170f) != null && (pencilType = this.f127171g) != null) {
                    return new Pencil(this.f127165a, num2, bool, num, f, l, pencilType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num2, "duration", this.f127167c, "finish", this.f127168d, "dimension", this.f127169e, "size", this.f127170f, "color", this.f127171g, "pencil_type");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Pencil");
            StringBuilder sb = new StringBuilder();
            if (!this.coords.isEmpty()) {
                sb.append(", coords=");
                sb.append(this.coords);
            }
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", finish=");
            sb.append(this.finish);
            sb.append(", dimension=");
            sb.append(this.dimension);
            sb.append(", size=");
            sb.append(this.size);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", pencil_type=");
            sb.append(this.pencil_type);
            StringBuilder replace = sb.replace(0, 2, "Pencil{");
            replace.append('}');
            return replace.toString();
        }

        public Pencil(List<Coord> list, Integer num, Boolean bool, Integer num2, Float f, Long l, PencilType pencilType) {
            this(list, num, bool, num2, f, l, pencilType, ByteString.EMPTY);
        }

        public Pencil(List<Coord> list, Integer num, Boolean bool, Integer num2, Float f, Long l, PencilType pencilType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.coords = Internal.immutableCopyOf("coords", list);
            this.duration = num;
            this.finish = bool;
            this.dimension = num2;
            this.size = f;
            this.color = l;
            this.pencil_type = pencilType;
        }
    }

    public static final class Text extends Message<Text, C51074a> {
        public static final ProtoAdapter<Text> ADAPTER = new C51075b();
        public static final Long DEFAULT_COLOR = 0L;
        public static final Float DEFAULT_FONT_SIZE = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        public static final TextUpdateType DEFAULT_UPDATE_TYPE = TextUpdateType.DEFAULT;
        private static final long serialVersionUID = 0;
        public final Long color;
        public final String content;
        public final Float font_size;
        public final String last_content;
        public final Coord last_right_bottom;
        public final Coord left_top;
        public final Coord right_bottom;
        public final TextUpdateType update_type;

        public enum TextUpdateType implements WireEnum {
            DEFAULT(1),
            FORWARD(2),
            BACKWARD(3),
            FORWARDREDO(4);
            
            public static final ProtoAdapter<TextUpdateType> ADAPTER = ProtoAdapter.newEnumAdapter(TextUpdateType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TextUpdateType fromValue(int i) {
                if (i == 1) {
                    return DEFAULT;
                }
                if (i == 2) {
                    return FORWARD;
                }
                if (i == 3) {
                    return BACKWARD;
                }
                if (i != 4) {
                    return null;
                }
                return FORWARDREDO;
            }

            private TextUpdateType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Text$b */
        private static final class C51075b extends ProtoAdapter<Text> {
            C51075b() {
                super(FieldEncoding.LENGTH_DELIMITED, Text.class);
            }

            /* renamed from: a */
            public int encodedSize(Text text) {
                int i;
                int i2;
                int i3;
                int i4;
                int encodedSizeWithTag = Coord.ADAPTER.encodedSizeWithTag(1, text.left_top);
                int i5 = 0;
                if (text.right_bottom != null) {
                    i = Coord.ADAPTER.encodedSizeWithTag(2, text.right_bottom);
                } else {
                    i = 0;
                }
                int i6 = encodedSizeWithTag + i;
                if (text.last_right_bottom != null) {
                    i2 = Coord.ADAPTER.encodedSizeWithTag(3, text.last_right_bottom);
                } else {
                    i2 = 0;
                }
                int i7 = i6 + i2;
                if (text.content != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, text.content);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (text.last_content != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, text.last_content);
                } else {
                    i4 = 0;
                }
                int encodedSizeWithTag2 = i8 + i4 + ProtoAdapter.FLOAT.encodedSizeWithTag(6, text.font_size) + ProtoAdapter.INT64.encodedSizeWithTag(7, text.color);
                if (text.update_type != null) {
                    i5 = TextUpdateType.ADAPTER.encodedSizeWithTag(8, text.update_type);
                }
                return encodedSizeWithTag2 + i5 + text.unknownFields().size();
            }

            /* renamed from: a */
            public Text decode(ProtoReader protoReader) throws IOException {
                C51074a aVar = new C51074a();
                aVar.f127179d = "";
                aVar.f127180e = "";
                aVar.f127181f = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                aVar.f127182g = 0L;
                aVar.f127183h = TextUpdateType.DEFAULT;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127176a = Coord.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                aVar.f127177b = Coord.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                aVar.f127178c = Coord.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127179d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127180e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127181f = ProtoAdapter.FLOAT.decode(protoReader);
                                break;
                            case 7:
                                aVar.f127182g = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 8:
                                try {
                                    aVar.f127183h = TextUpdateType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
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
            public void encode(ProtoWriter protoWriter, Text text) throws IOException {
                Coord.ADAPTER.encodeWithTag(protoWriter, 1, text.left_top);
                if (text.right_bottom != null) {
                    Coord.ADAPTER.encodeWithTag(protoWriter, 2, text.right_bottom);
                }
                if (text.last_right_bottom != null) {
                    Coord.ADAPTER.encodeWithTag(protoWriter, 3, text.last_right_bottom);
                }
                if (text.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, text.content);
                }
                if (text.last_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, text.last_content);
                }
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 6, text.font_size);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, text.color);
                if (text.update_type != null) {
                    TextUpdateType.ADAPTER.encodeWithTag(protoWriter, 8, text.update_type);
                }
                protoWriter.writeBytes(text.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51074a newBuilder() {
            C51074a aVar = new C51074a();
            aVar.f127176a = this.left_top;
            aVar.f127177b = this.right_bottom;
            aVar.f127178c = this.last_right_bottom;
            aVar.f127179d = this.content;
            aVar.f127180e = this.last_content;
            aVar.f127181f = this.font_size;
            aVar.f127182g = this.color;
            aVar.f127183h = this.update_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Text$a */
        public static final class C51074a extends Message.Builder<Text, C51074a> {

            /* renamed from: a */
            public Coord f127176a;

            /* renamed from: b */
            public Coord f127177b;

            /* renamed from: c */
            public Coord f127178c;

            /* renamed from: d */
            public String f127179d;

            /* renamed from: e */
            public String f127180e;

            /* renamed from: f */
            public Float f127181f;

            /* renamed from: g */
            public Long f127182g;

            /* renamed from: h */
            public TextUpdateType f127183h;

            /* renamed from: a */
            public Text build() {
                Float f;
                Long l;
                Coord coord = this.f127176a;
                if (coord != null && (f = this.f127181f) != null && (l = this.f127182g) != null) {
                    return new Text(coord, this.f127177b, this.f127178c, this.f127179d, this.f127180e, f, l, this.f127183h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(coord, "left_top", this.f127181f, "font_size", this.f127182g, "color");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Text");
            StringBuilder sb = new StringBuilder();
            sb.append(", left_top=");
            sb.append(this.left_top);
            if (this.right_bottom != null) {
                sb.append(", right_bottom=");
                sb.append(this.right_bottom);
            }
            if (this.last_right_bottom != null) {
                sb.append(", last_right_bottom=");
                sb.append(this.last_right_bottom);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.last_content != null) {
                sb.append(", last_content=");
                sb.append(this.last_content);
            }
            sb.append(", font_size=");
            sb.append(this.font_size);
            sb.append(", color=");
            sb.append(this.color);
            if (this.update_type != null) {
                sb.append(", update_type=");
                sb.append(this.update_type);
            }
            StringBuilder replace = sb.replace(0, 2, "Text{");
            replace.append('}');
            return replace.toString();
        }

        public Text(Coord coord, Coord coord2, Coord coord3, String str, String str2, Float f, Long l, TextUpdateType textUpdateType) {
            this(coord, coord2, coord3, str, str2, f, l, textUpdateType, ByteString.EMPTY);
        }

        public Text(Coord coord, Coord coord2, Coord coord3, String str, String str2, Float f, Long l, TextUpdateType textUpdateType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.left_top = coord;
            this.right_bottom = coord2;
            this.last_right_bottom = coord3;
            this.content = str;
            this.last_content = str2;
            this.font_size = f;
            this.color = l;
            this.update_type = textUpdateType;
        }
    }

    public enum ShapeType implements WireEnum {
        PENCIL(1),
        RECTANGLE(2),
        COMET(3),
        OVAL(4),
        ARROW(5),
        TEXT(6),
        LINE(7);
        
        public static final ProtoAdapter<ShapeType> ADAPTER = ProtoAdapter.newEnumAdapter(ShapeType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShapeType fromValue(int i) {
            switch (i) {
                case 1:
                    return PENCIL;
                case 2:
                    return RECTANGLE;
                case 3:
                    return COMET;
                case 4:
                    return OVAL;
                case 5:
                    return ARROW;
                case 6:
                    return TEXT;
                case 7:
                    return LINE;
                default:
                    return null;
            }
        }

        private ShapeType(int i) {
            this.value = i;
        }
    }

    public static final class Arrow extends Message<Arrow, C51060a> {
        public static final ProtoAdapter<Arrow> ADAPTER = new C51061b();
        public static final Long DEFAULT_COLOR = 0L;
        public static final Float DEFAULT_SIZE = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        private static final long serialVersionUID = 0;
        public final Long color;
        public final Coord end;
        public final Coord origin;
        public final Float size;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Arrow$b */
        private static final class C51061b extends ProtoAdapter<Arrow> {
            C51061b() {
                super(FieldEncoding.LENGTH_DELIMITED, Arrow.class);
            }

            /* renamed from: a */
            public int encodedSize(Arrow arrow) {
                return Coord.ADAPTER.encodedSizeWithTag(1, arrow.origin) + Coord.ADAPTER.encodedSizeWithTag(2, arrow.end) + ProtoAdapter.INT64.encodedSizeWithTag(3, arrow.color) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, arrow.size) + arrow.unknownFields().size();
            }

            /* renamed from: a */
            public Arrow decode(ProtoReader protoReader) throws IOException {
                C51060a aVar = new C51060a();
                aVar.f127145c = 0L;
                aVar.f127146d = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127143a = Coord.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127144b = Coord.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f127145c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127146d = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Arrow arrow) throws IOException {
                Coord.ADAPTER.encodeWithTag(protoWriter, 1, arrow.origin);
                Coord.ADAPTER.encodeWithTag(protoWriter, 2, arrow.end);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, arrow.color);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, arrow.size);
                protoWriter.writeBytes(arrow.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51060a newBuilder() {
            C51060a aVar = new C51060a();
            aVar.f127143a = this.origin;
            aVar.f127144b = this.end;
            aVar.f127145c = this.color;
            aVar.f127146d = this.size;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Arrow$a */
        public static final class C51060a extends Message.Builder<Arrow, C51060a> {

            /* renamed from: a */
            public Coord f127143a;

            /* renamed from: b */
            public Coord f127144b;

            /* renamed from: c */
            public Long f127145c;

            /* renamed from: d */
            public Float f127146d;

            /* renamed from: a */
            public Arrow build() {
                Coord coord;
                Long l;
                Float f;
                Coord coord2 = this.f127143a;
                if (coord2 != null && (coord = this.f127144b) != null && (l = this.f127145c) != null && (f = this.f127146d) != null) {
                    return new Arrow(coord2, coord, l, f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(coord2, "origin", this.f127144b, "end", this.f127145c, "color", this.f127146d, "size");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Arrow");
            StringBuilder sb = new StringBuilder();
            sb.append(", origin=");
            sb.append(this.origin);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", size=");
            sb.append(this.size);
            StringBuilder replace = sb.replace(0, 2, "Arrow{");
            replace.append('}');
            return replace.toString();
        }

        public Arrow(Coord coord, Coord coord2, Long l, Float f) {
            this(coord, coord2, l, f, ByteString.EMPTY);
        }

        public Arrow(Coord coord, Coord coord2, Long l, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            this.origin = coord;
            this.end = coord2;
            this.color = l;
            this.size = f;
        }
    }

    public static final class Comet extends Message<Comet, C51062a> {
        public static final ProtoAdapter<Comet> ADAPTER = new C51063b();
        public static final Long DEFAULT_COLOR = 0L;
        public static final Integer DEFAULT_DURATION = 0;
        public static final Boolean DEFAULT_EXIT = false;
        public static final Float DEFAULT_SIZE = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        private static final long serialVersionUID = 0;
        public final Long color;
        public final List<Coord> coords;
        public final Integer duration;
        public final Boolean exit;
        public final Float size;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Comet$b */
        private static final class C51063b extends ProtoAdapter<Comet> {
            C51063b() {
                super(FieldEncoding.LENGTH_DELIMITED, Comet.class);
            }

            /* renamed from: a */
            public int encodedSize(Comet comet) {
                int i;
                int encodedSizeWithTag = Coord.ADAPTER.asRepeated().encodedSizeWithTag(1, comet.coords) + ProtoAdapter.INT32.encodedSizeWithTag(2, comet.duration) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, comet.size) + ProtoAdapter.INT64.encodedSizeWithTag(4, comet.color);
                if (comet.exit != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(5, comet.exit);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + comet.unknownFields().size();
            }

            /* renamed from: a */
            public Comet decode(ProtoReader protoReader) throws IOException {
                C51062a aVar = new C51062a();
                aVar.f127148b = 0;
                aVar.f127149c = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                aVar.f127150d = 0L;
                aVar.f127151e = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127147a.add(Coord.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f127148b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f127149c = ProtoAdapter.FLOAT.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f127150d = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127151e = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Comet comet) throws IOException {
                Coord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, comet.coords);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, comet.duration);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, comet.size);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, comet.color);
                if (comet.exit != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, comet.exit);
                }
                protoWriter.writeBytes(comet.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Comet$a */
        public static final class C51062a extends Message.Builder<Comet, C51062a> {

            /* renamed from: a */
            public List<Coord> f127147a = Internal.newMutableList();

            /* renamed from: b */
            public Integer f127148b;

            /* renamed from: c */
            public Float f127149c;

            /* renamed from: d */
            public Long f127150d;

            /* renamed from: e */
            public Boolean f127151e;

            /* renamed from: a */
            public Comet build() {
                Float f;
                Long l;
                Integer num = this.f127148b;
                if (num != null && (f = this.f127149c) != null && (l = this.f127150d) != null) {
                    return new Comet(this.f127147a, num, f, l, this.f127151e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num, "duration", this.f127149c, "size", this.f127150d, "color");
            }
        }

        @Override // com.squareup.wire.Message
        public C51062a newBuilder() {
            C51062a aVar = new C51062a();
            aVar.f127147a = Internal.copyOf("coords", this.coords);
            aVar.f127148b = this.duration;
            aVar.f127149c = this.size;
            aVar.f127150d = this.color;
            aVar.f127151e = this.exit;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Comet");
            StringBuilder sb = new StringBuilder();
            if (!this.coords.isEmpty()) {
                sb.append(", coords=");
                sb.append(this.coords);
            }
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", size=");
            sb.append(this.size);
            sb.append(", color=");
            sb.append(this.color);
            if (this.exit != null) {
                sb.append(", exit=");
                sb.append(this.exit);
            }
            StringBuilder replace = sb.replace(0, 2, "Comet{");
            replace.append('}');
            return replace.toString();
        }

        public Comet(List<Coord> list, Integer num, Float f, Long l, Boolean bool) {
            this(list, num, f, l, bool, ByteString.EMPTY);
        }

        public Comet(List<Coord> list, Integer num, Float f, Long l, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.coords = Internal.immutableCopyOf("coords", list);
            this.duration = num;
            this.size = f;
            this.color = l;
            this.exit = bool;
        }
    }

    public static final class Coord extends Message<Coord, C51064a> {
        public static final ProtoAdapter<Coord> ADAPTER = new C51065b();
        public static final Float DEFAULT_X;
        public static final Float DEFAULT_Y;
        private static final long serialVersionUID = 0;

        /* renamed from: x */
        public final Float f127152x;

        /* renamed from: y */
        public final Float f127153y;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Coord$b */
        private static final class C51065b extends ProtoAdapter<Coord> {
            C51065b() {
                super(FieldEncoding.LENGTH_DELIMITED, Coord.class);
            }

            /* renamed from: a */
            public int encodedSize(Coord coord) {
                return ProtoAdapter.FLOAT.encodedSizeWithTag(1, coord.f127152x) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, coord.f127153y) + coord.unknownFields().size();
            }

            /* renamed from: a */
            public Coord decode(ProtoReader protoReader) throws IOException {
                C51064a aVar = new C51064a();
                Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                aVar.f127154a = valueOf;
                aVar.f127155b = valueOf;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127154a = ProtoAdapter.FLOAT.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127155b = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Coord coord) throws IOException {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, coord.f127152x);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, coord.f127153y);
                protoWriter.writeBytes(coord.unknownFields());
            }
        }

        static {
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            DEFAULT_X = valueOf;
            DEFAULT_Y = valueOf;
        }

        @Override // com.squareup.wire.Message
        public C51064a newBuilder() {
            C51064a aVar = new C51064a();
            aVar.f127154a = this.f127152x;
            aVar.f127155b = this.f127153y;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Coord$a */
        public static final class C51064a extends Message.Builder<Coord, C51064a> {

            /* renamed from: a */
            public Float f127154a;

            /* renamed from: b */
            public Float f127155b;

            /* renamed from: a */
            public Coord build() {
                Float f;
                Float f2 = this.f127154a;
                if (f2 != null && (f = this.f127155b) != null) {
                    return new Coord(f2, f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(f2, "x", this.f127155b, "y");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Coord");
            StringBuilder sb = new StringBuilder();
            sb.append(", x=");
            sb.append(this.f127152x);
            sb.append(", y=");
            sb.append(this.f127153y);
            StringBuilder replace = sb.replace(0, 2, "Coord{");
            replace.append('}');
            return replace.toString();
        }

        public Coord(Float f, Float f2) {
            this(f, f2, ByteString.EMPTY);
        }

        public Coord(Float f, Float f2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f127152x = f;
            this.f127153y = f2;
        }
    }

    public static final class Line extends Message<Line, C51066a> {
        public static final ProtoAdapter<Line> ADAPTER = new C51067b();
        public static final Long DEFAULT_COLOR = 0L;
        public static final Float DEFAULT_SIZE = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        private static final long serialVersionUID = 0;
        public final Long color;
        public final Coord end;
        public final Coord origin;
        public final Float size;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Line$b */
        private static final class C51067b extends ProtoAdapter<Line> {
            C51067b() {
                super(FieldEncoding.LENGTH_DELIMITED, Line.class);
            }

            /* renamed from: a */
            public int encodedSize(Line line) {
                return Coord.ADAPTER.encodedSizeWithTag(1, line.origin) + Coord.ADAPTER.encodedSizeWithTag(2, line.end) + ProtoAdapter.INT64.encodedSizeWithTag(3, line.color) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, line.size) + line.unknownFields().size();
            }

            /* renamed from: a */
            public Line decode(ProtoReader protoReader) throws IOException {
                C51066a aVar = new C51066a();
                aVar.f127158c = 0L;
                aVar.f127159d = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127156a = Coord.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127157b = Coord.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f127158c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127159d = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Line line) throws IOException {
                Coord.ADAPTER.encodeWithTag(protoWriter, 1, line.origin);
                Coord.ADAPTER.encodeWithTag(protoWriter, 2, line.end);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, line.color);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, line.size);
                protoWriter.writeBytes(line.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51066a newBuilder() {
            C51066a aVar = new C51066a();
            aVar.f127156a = this.origin;
            aVar.f127157b = this.end;
            aVar.f127158c = this.color;
            aVar.f127159d = this.size;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Line$a */
        public static final class C51066a extends Message.Builder<Line, C51066a> {

            /* renamed from: a */
            public Coord f127156a;

            /* renamed from: b */
            public Coord f127157b;

            /* renamed from: c */
            public Long f127158c;

            /* renamed from: d */
            public Float f127159d;

            /* renamed from: a */
            public Line build() {
                Coord coord;
                Long l;
                Float f;
                Coord coord2 = this.f127156a;
                if (coord2 != null && (coord = this.f127157b) != null && (l = this.f127158c) != null && (f = this.f127159d) != null) {
                    return new Line(coord2, coord, l, f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(coord2, "origin", this.f127157b, "end", this.f127158c, "color", this.f127159d, "size");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Line");
            StringBuilder sb = new StringBuilder();
            sb.append(", origin=");
            sb.append(this.origin);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", size=");
            sb.append(this.size);
            StringBuilder replace = sb.replace(0, 2, "Line{");
            replace.append('}');
            return replace.toString();
        }

        public Line(Coord coord, Coord coord2, Long l, Float f) {
            this(coord, coord2, l, f, ByteString.EMPTY);
        }

        public Line(Coord coord, Coord coord2, Long l, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            this.origin = coord;
            this.end = coord2;
            this.color = l;
            this.size = f;
        }
    }

    public static final class Oval extends Message<Oval, C51068a> {
        public static final ProtoAdapter<Oval> ADAPTER = new C51069b();
        public static final Long DEFAULT_COLOR = 0L;
        public static final Float DEFAULT_LONG_AXIS;
        public static final Float DEFAULT_SHORT_AXIS;
        public static final Float DEFAULT_SIZE;
        private static final long serialVersionUID = 0;
        public final Long color;
        public final Float long_axis;
        public final Coord origin;
        public final Float short_axis;
        public final Float size;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Oval$b */
        private static final class C51069b extends ProtoAdapter<Oval> {
            C51069b() {
                super(FieldEncoding.LENGTH_DELIMITED, Oval.class);
            }

            /* renamed from: a */
            public int encodedSize(Oval oval) {
                return Coord.ADAPTER.encodedSizeWithTag(1, oval.origin) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, oval.long_axis) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, oval.short_axis) + ProtoAdapter.INT64.encodedSizeWithTag(4, oval.color) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, oval.size) + oval.unknownFields().size();
            }

            /* renamed from: a */
            public Oval decode(ProtoReader protoReader) throws IOException {
                C51068a aVar = new C51068a();
                Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                aVar.f127161b = valueOf;
                aVar.f127162c = valueOf;
                aVar.f127163d = 0L;
                aVar.f127164e = valueOf;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127160a = Coord.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127161b = ProtoAdapter.FLOAT.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f127162c = ProtoAdapter.FLOAT.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f127163d = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127164e = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Oval oval) throws IOException {
                Coord.ADAPTER.encodeWithTag(protoWriter, 1, oval.origin);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, oval.long_axis);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, oval.short_axis);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, oval.color);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, oval.size);
                protoWriter.writeBytes(oval.unknownFields());
            }
        }

        static {
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            DEFAULT_LONG_AXIS = valueOf;
            DEFAULT_SHORT_AXIS = valueOf;
            DEFAULT_SIZE = valueOf;
        }

        @Override // com.squareup.wire.Message
        public C51068a newBuilder() {
            C51068a aVar = new C51068a();
            aVar.f127160a = this.origin;
            aVar.f127161b = this.long_axis;
            aVar.f127162c = this.short_axis;
            aVar.f127163d = this.color;
            aVar.f127164e = this.size;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Oval$a */
        public static final class C51068a extends Message.Builder<Oval, C51068a> {

            /* renamed from: a */
            public Coord f127160a;

            /* renamed from: b */
            public Float f127161b;

            /* renamed from: c */
            public Float f127162c;

            /* renamed from: d */
            public Long f127163d;

            /* renamed from: e */
            public Float f127164e;

            /* renamed from: a */
            public Oval build() {
                Float f;
                Float f2;
                Long l;
                Float f3;
                Coord coord = this.f127160a;
                if (coord != null && (f = this.f127161b) != null && (f2 = this.f127162c) != null && (l = this.f127163d) != null && (f3 = this.f127164e) != null) {
                    return new Oval(coord, f, f2, l, f3, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(coord, "origin", this.f127161b, "long_axis", this.f127162c, "short_axis", this.f127163d, "color", this.f127164e, "size");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Oval");
            StringBuilder sb = new StringBuilder();
            sb.append(", origin=");
            sb.append(this.origin);
            sb.append(", long_axis=");
            sb.append(this.long_axis);
            sb.append(", short_axis=");
            sb.append(this.short_axis);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", size=");
            sb.append(this.size);
            StringBuilder replace = sb.replace(0, 2, "Oval{");
            replace.append('}');
            return replace.toString();
        }

        public Oval(Coord coord, Float f, Float f2, Long l, Float f3) {
            this(coord, f, f2, l, f3, ByteString.EMPTY);
        }

        public Oval(Coord coord, Float f, Float f2, Long l, Float f3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.origin = coord;
            this.long_axis = f;
            this.short_axis = f2;
            this.color = l;
            this.size = f3;
        }
    }

    public static final class Rect extends Message<Rect, C51072a> {
        public static final ProtoAdapter<Rect> ADAPTER = new C51073b();
        public static final Long DEFAULT_COLOR = 0L;
        public static final Float DEFAULT_SIZE = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        private static final long serialVersionUID = 0;
        public final Long color;
        public final Coord left_top;
        public final Coord right_bottom;
        public final Float size;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Rect$b */
        private static final class C51073b extends ProtoAdapter<Rect> {
            C51073b() {
                super(FieldEncoding.LENGTH_DELIMITED, Rect.class);
            }

            /* renamed from: a */
            public int encodedSize(Rect rect) {
                return Coord.ADAPTER.encodedSizeWithTag(1, rect.left_top) + Coord.ADAPTER.encodedSizeWithTag(2, rect.right_bottom) + ProtoAdapter.INT64.encodedSizeWithTag(3, rect.color) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, rect.size) + rect.unknownFields().size();
            }

            /* renamed from: a */
            public Rect decode(ProtoReader protoReader) throws IOException {
                C51072a aVar = new C51072a();
                aVar.f127174c = 0L;
                aVar.f127175d = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127172a = Coord.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127173b = Coord.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f127174c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127175d = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Rect rect) throws IOException {
                Coord.ADAPTER.encodeWithTag(protoWriter, 1, rect.left_top);
                Coord.ADAPTER.encodeWithTag(protoWriter, 2, rect.right_bottom);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, rect.color);
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, rect.size);
                protoWriter.writeBytes(rect.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51072a newBuilder() {
            C51072a aVar = new C51072a();
            aVar.f127172a = this.left_top;
            aVar.f127173b = this.right_bottom;
            aVar.f127174c = this.color;
            aVar.f127175d = this.size;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$Rect$a */
        public static final class C51072a extends Message.Builder<Rect, C51072a> {

            /* renamed from: a */
            public Coord f127172a;

            /* renamed from: b */
            public Coord f127173b;

            /* renamed from: c */
            public Long f127174c;

            /* renamed from: d */
            public Float f127175d;

            /* renamed from: a */
            public Rect build() {
                Coord coord;
                Long l;
                Float f;
                Coord coord2 = this.f127172a;
                if (coord2 != null && (coord = this.f127173b) != null && (l = this.f127174c) != null && (f = this.f127175d) != null) {
                    return new Rect(coord2, coord, l, f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(coord2, "left_top", this.f127173b, "right_bottom", this.f127174c, "color", this.f127175d, "size");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Rect");
            StringBuilder sb = new StringBuilder();
            sb.append(", left_top=");
            sb.append(this.left_top);
            sb.append(", right_bottom=");
            sb.append(this.right_bottom);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", size=");
            sb.append(this.size);
            StringBuilder replace = sb.replace(0, 2, "Rect{");
            replace.append('}');
            return replace.toString();
        }

        public Rect(Coord coord, Coord coord2, Long l, Float f) {
            this(coord, coord2, l, f, ByteString.EMPTY);
        }

        public Rect(Coord coord, Coord coord2, Long l, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            this.left_top = coord;
            this.right_bottom = coord2;
            this.color = l;
            this.size = f;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$b */
    private static final class C51077b extends ProtoAdapter<SketchDataUnit> {
        C51077b() {
            super(FieldEncoding.LENGTH_DELIMITED, SketchDataUnit.class);
        }

        /* renamed from: a */
        public int encodedSize(SketchDataUnit sketchDataUnit) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ShapeType.ADAPTER.encodedSizeWithTag(1, sketchDataUnit.shape_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, sketchDataUnit.shape_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, sketchDataUnit.current_step);
            int i8 = 0;
            if (sketchDataUnit.user != null) {
                i = ByteviewUser.ADAPTER.encodedSizeWithTag(4, sketchDataUnit.user);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (sketchDataUnit.pencil != null) {
                i2 = Pencil.ADAPTER.encodedSizeWithTag(10, sketchDataUnit.pencil);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (sketchDataUnit.rect != null) {
                i3 = Rect.ADAPTER.encodedSizeWithTag(11, sketchDataUnit.rect);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (sketchDataUnit.comet != null) {
                i4 = Comet.ADAPTER.encodedSizeWithTag(12, sketchDataUnit.comet);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (sketchDataUnit.oval != null) {
                i5 = Oval.ADAPTER.encodedSizeWithTag(13, sketchDataUnit.oval);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (sketchDataUnit.arrow != null) {
                i6 = Arrow.ADAPTER.encodedSizeWithTag(14, sketchDataUnit.arrow);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (sketchDataUnit.text != null) {
                i7 = Text.ADAPTER.encodedSizeWithTag(15, sketchDataUnit.text);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (sketchDataUnit.line != null) {
                i8 = Line.ADAPTER.encodedSizeWithTag(16, sketchDataUnit.line);
            }
            return i15 + i8 + sketchDataUnit.unknownFields().size();
        }

        /* renamed from: a */
        public SketchDataUnit decode(ProtoReader protoReader) throws IOException {
            C51076a aVar = new C51076a();
            aVar.f127184a = ShapeType.PENCIL;
            aVar.f127185b = "";
            aVar.f127186c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127184a = ShapeType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f127185b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127186c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    switch (nextTag) {
                        case 10:
                            aVar.f127188e = Pencil.ADAPTER.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f127189f = Rect.ADAPTER.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127190g = Comet.ADAPTER.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f127191h = Oval.ADAPTER.decode(protoReader);
                            continue;
                        case 14:
                            aVar.f127192i = Arrow.ADAPTER.decode(protoReader);
                            continue;
                        case 15:
                            aVar.f127193j = Text.ADAPTER.decode(protoReader);
                            continue;
                        case 16:
                            aVar.f127194k = Line.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f127187d = ByteviewUser.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SketchDataUnit sketchDataUnit) throws IOException {
            ShapeType.ADAPTER.encodeWithTag(protoWriter, 1, sketchDataUnit.shape_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sketchDataUnit.shape_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sketchDataUnit.current_step);
            if (sketchDataUnit.user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 4, sketchDataUnit.user);
            }
            if (sketchDataUnit.pencil != null) {
                Pencil.ADAPTER.encodeWithTag(protoWriter, 10, sketchDataUnit.pencil);
            }
            if (sketchDataUnit.rect != null) {
                Rect.ADAPTER.encodeWithTag(protoWriter, 11, sketchDataUnit.rect);
            }
            if (sketchDataUnit.comet != null) {
                Comet.ADAPTER.encodeWithTag(protoWriter, 12, sketchDataUnit.comet);
            }
            if (sketchDataUnit.oval != null) {
                Oval.ADAPTER.encodeWithTag(protoWriter, 13, sketchDataUnit.oval);
            }
            if (sketchDataUnit.arrow != null) {
                Arrow.ADAPTER.encodeWithTag(protoWriter, 14, sketchDataUnit.arrow);
            }
            if (sketchDataUnit.text != null) {
                Text.ADAPTER.encodeWithTag(protoWriter, 15, sketchDataUnit.text);
            }
            if (sketchDataUnit.line != null) {
                Line.ADAPTER.encodeWithTag(protoWriter, 16, sketchDataUnit.line);
            }
            protoWriter.writeBytes(sketchDataUnit.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51076a newBuilder() {
        C51076a aVar = new C51076a();
        aVar.f127184a = this.shape_type;
        aVar.f127185b = this.shape_id;
        aVar.f127186c = this.current_step;
        aVar.f127187d = this.user;
        aVar.f127188e = this.pencil;
        aVar.f127189f = this.rect;
        aVar.f127190g = this.comet;
        aVar.f127191h = this.oval;
        aVar.f127192i = this.arrow;
        aVar.f127193j = this.text;
        aVar.f127194k = this.line;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchDataUnit$a */
    public static final class C51076a extends Message.Builder<SketchDataUnit, C51076a> {

        /* renamed from: a */
        public ShapeType f127184a;

        /* renamed from: b */
        public String f127185b;

        /* renamed from: c */
        public Integer f127186c;

        /* renamed from: d */
        public ByteviewUser f127187d;

        /* renamed from: e */
        public Pencil f127188e;

        /* renamed from: f */
        public Rect f127189f;

        /* renamed from: g */
        public Comet f127190g;

        /* renamed from: h */
        public Oval f127191h;

        /* renamed from: i */
        public Arrow f127192i;

        /* renamed from: j */
        public Text f127193j;

        /* renamed from: k */
        public Line f127194k;

        /* renamed from: a */
        public SketchDataUnit build() {
            String str;
            Integer num;
            ShapeType shapeType = this.f127184a;
            if (shapeType != null && (str = this.f127185b) != null && (num = this.f127186c) != null) {
                return new SketchDataUnit(shapeType, str, num, this.f127187d, this.f127188e, this.f127189f, this.f127190g, this.f127191h, this.f127192i, this.f127193j, this.f127194k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(shapeType, "shape_type", this.f127185b, "shape_id", this.f127186c, "current_step");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SketchDataUnit");
        StringBuilder sb = new StringBuilder();
        sb.append(", shape_type=");
        sb.append(this.shape_type);
        sb.append(", shape_id=");
        sb.append(this.shape_id);
        sb.append(", current_step=");
        sb.append(this.current_step);
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.pencil != null) {
            sb.append(", pencil=");
            sb.append(this.pencil);
        }
        if (this.rect != null) {
            sb.append(", rect=");
            sb.append(this.rect);
        }
        if (this.comet != null) {
            sb.append(", comet=");
            sb.append(this.comet);
        }
        if (this.oval != null) {
            sb.append(", oval=");
            sb.append(this.oval);
        }
        if (this.arrow != null) {
            sb.append(", arrow=");
            sb.append(this.arrow);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.line != null) {
            sb.append(", line=");
            sb.append(this.line);
        }
        StringBuilder replace = sb.replace(0, 2, "SketchDataUnit{");
        replace.append('}');
        return replace.toString();
    }

    public SketchDataUnit(ShapeType shapeType, String str, Integer num, ByteviewUser byteviewUser, Pencil pencil2, Rect rect2, Comet comet2, Oval oval2, Arrow arrow2, Text text2, Line line2) {
        this(shapeType, str, num, byteviewUser, pencil2, rect2, comet2, oval2, arrow2, text2, line2, ByteString.EMPTY);
    }

    public SketchDataUnit(ShapeType shapeType, String str, Integer num, ByteviewUser byteviewUser, Pencil pencil2, Rect rect2, Comet comet2, Oval oval2, Arrow arrow2, Text text2, Line line2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shape_type = shapeType;
        this.shape_id = str;
        this.current_step = num;
        this.user = byteviewUser;
        this.pencil = pencil2;
        this.rect = rect2;
        this.comet = comet2;
        this.oval = oval2;
        this.arrow = arrow2;
        this.text = text2;
        this.line = line2;
    }
}
