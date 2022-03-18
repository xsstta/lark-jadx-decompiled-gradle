package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SmartMosaicResponse extends Message<SmartMosaicResponse, C49523a> {
    public static final ProtoAdapter<SmartMosaicResponse> ADAPTER = new C49524b();
    private static final long serialVersionUID = 0;
    public final List<Polygon> mpolygons;

    /* renamed from: com.ss.android.lark.pb.ai.SmartMosaicResponse$b */
    private static final class C49524b extends ProtoAdapter<SmartMosaicResponse> {
        C49524b() {
            super(FieldEncoding.LENGTH_DELIMITED, SmartMosaicResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SmartMosaicResponse smartMosaicResponse) {
            return Polygon.ADAPTER.asRepeated().encodedSizeWithTag(1, smartMosaicResponse.mpolygons) + smartMosaicResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SmartMosaicResponse decode(ProtoReader protoReader) throws IOException {
            C49523a aVar = new C49523a();
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
                    aVar.f124121a.add(Polygon.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SmartMosaicResponse smartMosaicResponse) throws IOException {
            Polygon.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, smartMosaicResponse.mpolygons);
            protoWriter.writeBytes(smartMosaicResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.SmartMosaicResponse$a */
    public static final class C49523a extends Message.Builder<SmartMosaicResponse, C49523a> {

        /* renamed from: a */
        public List<Polygon> f124121a = Internal.newMutableList();

        /* renamed from: a */
        public SmartMosaicResponse build() {
            return new SmartMosaicResponse(this.f124121a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49523a newBuilder() {
        C49523a aVar = new C49523a();
        aVar.f124121a = Internal.copyOf("mpolygons", this.mpolygons);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mpolygons.isEmpty()) {
            sb.append(", polygons=");
            sb.append(this.mpolygons);
        }
        StringBuilder replace = sb.replace(0, 2, "SmartMosaicResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SmartMosaicResponse(List<Polygon> list) {
        this(list, ByteString.EMPTY);
    }

    public SmartMosaicResponse(List<Polygon> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpolygons = Internal.immutableCopyOf("mpolygons", list);
    }
}
