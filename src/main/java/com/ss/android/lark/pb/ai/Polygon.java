package com.ss.android.lark.pb.ai;

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

public final class Polygon extends Message<Polygon, C49501a> {
    public static final ProtoAdapter<Polygon> ADAPTER = new C49502b();
    private static final long serialVersionUID = 0;
    public final List<Point> mpoints;
    public final ContentType mtype;

    public enum ContentType implements WireEnum {
        UNKNOWN(0),
        TEXT(1),
        AVATAR(2);
        
        public static final ProtoAdapter<ContentType> ADAPTER = ProtoAdapter.newEnumAdapter(ContentType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ContentType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TEXT;
            }
            if (i != 2) {
                return null;
            }
            return AVATAR;
        }

        private ContentType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.Polygon$b */
    private static final class C49502b extends ProtoAdapter<Polygon> {
        C49502b() {
            super(FieldEncoding.LENGTH_DELIMITED, Polygon.class);
        }

        /* renamed from: a */
        public int encodedSize(Polygon polygon) {
            return Point.ADAPTER.asRepeated().encodedSizeWithTag(1, polygon.mpoints) + ContentType.ADAPTER.encodedSizeWithTag(2, polygon.mtype) + polygon.unknownFields().size();
        }

        /* renamed from: a */
        public Polygon decode(ProtoReader protoReader) throws IOException {
            C49501a aVar = new C49501a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124099a.add(Point.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124100b = ContentType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Polygon polygon) throws IOException {
            Point.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, polygon.mpoints);
            ContentType.ADAPTER.encodeWithTag(protoWriter, 2, polygon.mtype);
            protoWriter.writeBytes(polygon.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.Polygon$a */
    public static final class C49501a extends Message.Builder<Polygon, C49501a> {

        /* renamed from: a */
        public List<Point> f124099a = Internal.newMutableList();

        /* renamed from: b */
        public ContentType f124100b;

        /* renamed from: a */
        public Polygon build() {
            ContentType contentType = this.f124100b;
            if (contentType != null) {
                return new Polygon(this.f124099a, contentType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(contentType, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public C49501a newBuilder() {
        C49501a aVar = new C49501a();
        aVar.f124099a = Internal.copyOf("mpoints", this.mpoints);
        aVar.f124100b = this.mtype;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mpoints.isEmpty()) {
            sb.append(", points=");
            sb.append(this.mpoints);
        }
        sb.append(", type=");
        sb.append(this.mtype);
        StringBuilder replace = sb.replace(0, 2, "Polygon{");
        replace.append('}');
        return replace.toString();
    }

    public Polygon(List<Point> list, ContentType contentType) {
        this(list, contentType, ByteString.EMPTY);
    }

    public Polygon(List<Point> list, ContentType contentType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpoints = Internal.immutableCopyOf("mpoints", list);
        this.mtype = contentType;
    }
}
