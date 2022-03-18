package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ExtraInfoBlockSegment extends Message<ExtraInfoBlockSegment, C50204a> {
    public static final ProtoAdapter<ExtraInfoBlockSegment> ADAPTER = new C50205b();
    public static final Boolean DEFAULT_IS_OMISSIBLE = false;
    private static final long serialVersionUID = 0;
    public final Boolean mis_omissible;
    public final String mtext_highlighted;
    public final SegmentTextType mtype;

    public enum SegmentTextType implements WireEnum {
        UNKNOWN(0),
        TEXT(1),
        TIMESTAMP(2);
        
        public static final ProtoAdapter<SegmentTextType> ADAPTER = ProtoAdapter.newEnumAdapter(SegmentTextType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SegmentTextType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TEXT;
            }
            if (i != 2) {
                return null;
            }
            return TIMESTAMP;
        }

        private SegmentTextType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ExtraInfoBlockSegment$b */
    private static final class C50205b extends ProtoAdapter<ExtraInfoBlockSegment> {
        C50205b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraInfoBlockSegment.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtraInfoBlockSegment extraInfoBlockSegment) {
            int i;
            int i2;
            int i3 = 0;
            if (extraInfoBlockSegment.mtext_highlighted != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, extraInfoBlockSegment.mtext_highlighted);
            } else {
                i = 0;
            }
            if (extraInfoBlockSegment.mis_omissible != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, extraInfoBlockSegment.mis_omissible);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (extraInfoBlockSegment.mtype != null) {
                i3 = SegmentTextType.ADAPTER.encodedSizeWithTag(3, extraInfoBlockSegment.mtype);
            }
            return i4 + i3 + extraInfoBlockSegment.unknownFields().size();
        }

        /* renamed from: a */
        public ExtraInfoBlockSegment decode(ProtoReader protoReader) throws IOException {
            C50204a aVar = new C50204a();
            aVar.f125436a = "";
            aVar.f125437b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125436a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125437b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125438c = SegmentTextType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtraInfoBlockSegment extraInfoBlockSegment) throws IOException {
            if (extraInfoBlockSegment.mtext_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extraInfoBlockSegment.mtext_highlighted);
            }
            if (extraInfoBlockSegment.mis_omissible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, extraInfoBlockSegment.mis_omissible);
            }
            if (extraInfoBlockSegment.mtype != null) {
                SegmentTextType.ADAPTER.encodeWithTag(protoWriter, 3, extraInfoBlockSegment.mtype);
            }
            protoWriter.writeBytes(extraInfoBlockSegment.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ExtraInfoBlockSegment$a */
    public static final class C50204a extends Message.Builder<ExtraInfoBlockSegment, C50204a> {

        /* renamed from: a */
        public String f125436a;

        /* renamed from: b */
        public Boolean f125437b;

        /* renamed from: c */
        public SegmentTextType f125438c;

        /* renamed from: a */
        public ExtraInfoBlockSegment build() {
            return new ExtraInfoBlockSegment(this.f125436a, this.f125437b, this.f125438c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50204a newBuilder() {
        C50204a aVar = new C50204a();
        aVar.f125436a = this.mtext_highlighted;
        aVar.f125437b = this.mis_omissible;
        aVar.f125438c = this.mtype;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtext_highlighted != null) {
            sb.append(", text_highlighted=");
            sb.append(this.mtext_highlighted);
        }
        if (this.mis_omissible != null) {
            sb.append(", is_omissible=");
            sb.append(this.mis_omissible);
        }
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtraInfoBlockSegment{");
        replace.append('}');
        return replace.toString();
    }

    public ExtraInfoBlockSegment(String str, Boolean bool, SegmentTextType segmentTextType) {
        this(str, bool, segmentTextType, ByteString.EMPTY);
    }

    public ExtraInfoBlockSegment(String str, Boolean bool, SegmentTextType segmentTextType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtext_highlighted = str;
        this.mis_omissible = bool;
        this.mtype = segmentTextType;
    }
}
