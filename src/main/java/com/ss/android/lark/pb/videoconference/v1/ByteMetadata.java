package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ByteMetadata extends Message<ByteMetadata, C50483a> {
    public static final ProtoAdapter<ByteMetadata> ADAPTER = new C50484b();
    private static final long serialVersionUID = 0;
    public final SketchData sketch_data;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteMetadata$b */
    private static final class C50484b extends ProtoAdapter<ByteMetadata> {
        C50484b() {
            super(FieldEncoding.LENGTH_DELIMITED, ByteMetadata.class);
        }

        /* renamed from: a */
        public int encodedSize(ByteMetadata byteMetadata) {
            int i;
            if (byteMetadata.sketch_data != null) {
                i = SketchData.ADAPTER.encodedSizeWithTag(1, byteMetadata.sketch_data);
            } else {
                i = 0;
            }
            return i + byteMetadata.unknownFields().size();
        }

        /* renamed from: a */
        public ByteMetadata decode(ProtoReader protoReader) throws IOException {
            C50483a aVar = new C50483a();
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
                    aVar.f126036a = SketchData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ByteMetadata byteMetadata) throws IOException {
            if (byteMetadata.sketch_data != null) {
                SketchData.ADAPTER.encodeWithTag(protoWriter, 1, byteMetadata.sketch_data);
            }
            protoWriter.writeBytes(byteMetadata.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteMetadata$a */
    public static final class C50483a extends Message.Builder<ByteMetadata, C50483a> {

        /* renamed from: a */
        public SketchData f126036a;

        /* renamed from: a */
        public ByteMetadata build() {
            return new ByteMetadata(this.f126036a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50483a newBuilder() {
        C50483a aVar = new C50483a();
        aVar.f126036a = this.sketch_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ByteMetadata");
        StringBuilder sb = new StringBuilder();
        if (this.sketch_data != null) {
            sb.append(", sketch_data=");
            sb.append(this.sketch_data);
        }
        StringBuilder replace = sb.replace(0, 2, "ByteMetadata{");
        replace.append('}');
        return replace.toString();
    }

    public ByteMetadata(SketchData sketchData) {
        this(sketchData, ByteString.EMPTY);
    }

    public ByteMetadata(SketchData sketchData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sketch_data = sketchData;
    }
}
