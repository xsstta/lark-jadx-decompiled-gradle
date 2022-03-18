package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MappingColor extends Message<MappingColor, C15856a> {
    public static final ProtoAdapter<MappingColor> ADAPTER = new C15857b();
    public static final Integer DEFAULT_BACKGROUND_COLOR = 0;
    public static final Integer DEFAULT_EVENT_CARD_COLOR = 0;
    public static final Integer DEFAULT_FOREGROUND_COLOR = 0;
    private static final long serialVersionUID = 0;
    public final Integer background_color;
    public final Integer event_card_color;
    public final String event_color_index;
    public final Integer foreground_color;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MappingColor$b */
    private static final class C15857b extends ProtoAdapter<MappingColor> {
        C15857b() {
            super(FieldEncoding.LENGTH_DELIMITED, MappingColor.class);
        }

        /* renamed from: a */
        public int encodedSize(MappingColor mappingColor) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mappingColor.background_color != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, mappingColor.background_color);
            } else {
                i = 0;
            }
            if (mappingColor.foreground_color != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, mappingColor.foreground_color);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mappingColor.event_card_color != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, mappingColor.event_card_color);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mappingColor.event_color_index != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mappingColor.event_color_index);
            }
            return i6 + i4 + mappingColor.unknownFields().size();
        }

        /* renamed from: a */
        public MappingColor decode(ProtoReader protoReader) throws IOException {
            C15856a aVar = new C15856a();
            aVar.f41677a = 0;
            aVar.f41678b = 0;
            aVar.f41679c = 0;
            aVar.f41680d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41677a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41678b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41679c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41680d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MappingColor mappingColor) throws IOException {
            if (mappingColor.background_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mappingColor.background_color);
            }
            if (mappingColor.foreground_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mappingColor.foreground_color);
            }
            if (mappingColor.event_card_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, mappingColor.event_card_color);
            }
            if (mappingColor.event_color_index != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mappingColor.event_color_index);
            }
            protoWriter.writeBytes(mappingColor.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MappingColor$a */
    public static final class C15856a extends Message.Builder<MappingColor, C15856a> {

        /* renamed from: a */
        public Integer f41677a;

        /* renamed from: b */
        public Integer f41678b;

        /* renamed from: c */
        public Integer f41679c;

        /* renamed from: d */
        public String f41680d;

        /* renamed from: a */
        public MappingColor build() {
            return new MappingColor(this.f41677a, this.f41678b, this.f41679c, this.f41680d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15856a mo57219a(Integer num) {
            this.f41677a = num;
            return this;
        }

        /* renamed from: b */
        public C15856a mo57222b(Integer num) {
            this.f41678b = num;
            return this;
        }

        /* renamed from: c */
        public C15856a mo57223c(Integer num) {
            this.f41679c = num;
            return this;
        }

        /* renamed from: a */
        public C15856a mo57220a(String str) {
            this.f41680d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15856a newBuilder() {
        C15856a aVar = new C15856a();
        aVar.f41677a = this.background_color;
        aVar.f41678b = this.foreground_color;
        aVar.f41679c = this.event_card_color;
        aVar.f41680d = this.event_color_index;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MappingColor");
        StringBuilder sb = new StringBuilder();
        if (this.background_color != null) {
            sb.append(", background_color=");
            sb.append(this.background_color);
        }
        if (this.foreground_color != null) {
            sb.append(", foreground_color=");
            sb.append(this.foreground_color);
        }
        if (this.event_card_color != null) {
            sb.append(", event_card_color=");
            sb.append(this.event_card_color);
        }
        if (this.event_color_index != null) {
            sb.append(", event_color_index=");
            sb.append(this.event_color_index);
        }
        StringBuilder replace = sb.replace(0, 2, "MappingColor{");
        replace.append('}');
        return replace.toString();
    }

    public MappingColor(Integer num, Integer num2, Integer num3, String str) {
        this(num, num2, num3, str, ByteString.EMPTY);
    }

    public MappingColor(Integer num, Integer num2, Integer num3, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.background_color = num;
        this.foreground_color = num2;
        this.event_card_color = num3;
        this.event_color_index = str;
    }
}
