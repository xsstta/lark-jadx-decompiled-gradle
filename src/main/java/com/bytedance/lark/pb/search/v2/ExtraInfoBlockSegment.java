package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ExtraInfoBlockSegment extends Message<ExtraInfoBlockSegment, C18987a> {
    public static final ProtoAdapter<ExtraInfoBlockSegment> ADAPTER = new C18988b();
    public static final Boolean DEFAULT_IS_OMISSIBLE = false;
    public static final SegmentTextType DEFAULT_TYPE = SegmentTextType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean is_omissible;
    public final String text_highlighted;
    public final SegmentTextType type;

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

    /* renamed from: com.bytedance.lark.pb.search.v2.ExtraInfoBlockSegment$b */
    private static final class C18988b extends ProtoAdapter<ExtraInfoBlockSegment> {
        C18988b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraInfoBlockSegment.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtraInfoBlockSegment extraInfoBlockSegment) {
            int i;
            int i2;
            int i3 = 0;
            if (extraInfoBlockSegment.text_highlighted != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, extraInfoBlockSegment.text_highlighted);
            } else {
                i = 0;
            }
            if (extraInfoBlockSegment.is_omissible != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, extraInfoBlockSegment.is_omissible);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (extraInfoBlockSegment.type != null) {
                i3 = SegmentTextType.ADAPTER.encodedSizeWithTag(3, extraInfoBlockSegment.type);
            }
            return i4 + i3 + extraInfoBlockSegment.unknownFields().size();
        }

        /* renamed from: a */
        public ExtraInfoBlockSegment decode(ProtoReader protoReader) throws IOException {
            C18987a aVar = new C18987a();
            aVar.f46959a = "";
            aVar.f46960b = false;
            aVar.f46961c = SegmentTextType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46959a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46960b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46961c = SegmentTextType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtraInfoBlockSegment extraInfoBlockSegment) throws IOException {
            if (extraInfoBlockSegment.text_highlighted != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extraInfoBlockSegment.text_highlighted);
            }
            if (extraInfoBlockSegment.is_omissible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, extraInfoBlockSegment.is_omissible);
            }
            if (extraInfoBlockSegment.type != null) {
                SegmentTextType.ADAPTER.encodeWithTag(protoWriter, 3, extraInfoBlockSegment.type);
            }
            protoWriter.writeBytes(extraInfoBlockSegment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ExtraInfoBlockSegment$a */
    public static final class C18987a extends Message.Builder<ExtraInfoBlockSegment, C18987a> {

        /* renamed from: a */
        public String f46959a;

        /* renamed from: b */
        public Boolean f46960b;

        /* renamed from: c */
        public SegmentTextType f46961c;

        /* renamed from: a */
        public ExtraInfoBlockSegment build() {
            return new ExtraInfoBlockSegment(this.f46959a, this.f46960b, this.f46961c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18987a newBuilder() {
        C18987a aVar = new C18987a();
        aVar.f46959a = this.text_highlighted;
        aVar.f46960b = this.is_omissible;
        aVar.f46961c = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ExtraInfoBlockSegment");
        StringBuilder sb = new StringBuilder();
        if (this.text_highlighted != null) {
            sb.append(", text_highlighted=");
            sb.append(this.text_highlighted);
        }
        if (this.is_omissible != null) {
            sb.append(", is_omissible=");
            sb.append(this.is_omissible);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
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
        this.text_highlighted = str;
        this.is_omissible = bool;
        this.type = segmentTextType;
    }
}
