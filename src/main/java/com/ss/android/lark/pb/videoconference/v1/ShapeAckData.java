package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ShapeAckData extends Message<ShapeAckData, C51030a> {
    public static final ProtoAdapter<ShapeAckData> ADAPTER = new C51031b();
    private static final long serialVersionUID = 0;
    public final String shape_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShapeAckData$b */
    private static final class C51031b extends ProtoAdapter<ShapeAckData> {
        C51031b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShapeAckData.class);
        }

        /* renamed from: a */
        public int encodedSize(ShapeAckData shapeAckData) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, shapeAckData.shape_id) + shapeAckData.unknownFields().size();
        }

        /* renamed from: a */
        public ShapeAckData decode(ProtoReader protoReader) throws IOException {
            C51030a aVar = new C51030a();
            aVar.f127088a = "";
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
                    aVar.f127088a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShapeAckData shapeAckData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shapeAckData.shape_id);
            protoWriter.writeBytes(shapeAckData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShapeAckData$a */
    public static final class C51030a extends Message.Builder<ShapeAckData, C51030a> {

        /* renamed from: a */
        public String f127088a;

        /* renamed from: a */
        public ShapeAckData build() {
            String str = this.f127088a;
            if (str != null) {
                return new ShapeAckData(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "shape_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C51030a newBuilder() {
        C51030a aVar = new C51030a();
        aVar.f127088a = this.shape_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShapeAckData");
        StringBuilder sb = new StringBuilder();
        sb.append(", shape_id=");
        sb.append(this.shape_id);
        StringBuilder replace = sb.replace(0, 2, "ShapeAckData{");
        replace.append('}');
        return replace.toString();
    }

    public ShapeAckData(String str) {
        this(str, ByteString.EMPTY);
    }

    public ShapeAckData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shape_id = str;
    }
}
