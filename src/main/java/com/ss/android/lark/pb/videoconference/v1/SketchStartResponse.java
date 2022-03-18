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

public final class SketchStartResponse extends Message<SketchStartResponse, C51086a> {
    public static final ProtoAdapter<SketchStartResponse> ADAPTER = new C51087b();
    public static final Boolean DEFAULT_CAN_OTHER_SKETCH = false;
    private static final long serialVersionUID = 0;
    public final Boolean can_other_sketch;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchStartResponse$b */
    private static final class C51087b extends ProtoAdapter<SketchStartResponse> {
        C51087b() {
            super(FieldEncoding.LENGTH_DELIMITED, SketchStartResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SketchStartResponse sketchStartResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, sketchStartResponse.can_other_sketch) + sketchStartResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SketchStartResponse decode(ProtoReader protoReader) throws IOException {
            C51086a aVar = new C51086a();
            aVar.f127209a = false;
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
                    aVar.f127209a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SketchStartResponse sketchStartResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sketchStartResponse.can_other_sketch);
            protoWriter.writeBytes(sketchStartResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchStartResponse$a */
    public static final class C51086a extends Message.Builder<SketchStartResponse, C51086a> {

        /* renamed from: a */
        public Boolean f127209a;

        /* renamed from: a */
        public SketchStartResponse build() {
            Boolean bool = this.f127209a;
            if (bool != null) {
                return new SketchStartResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "can_other_sketch");
        }
    }

    @Override // com.squareup.wire.Message
    public C51086a newBuilder() {
        C51086a aVar = new C51086a();
        aVar.f127209a = this.can_other_sketch;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SketchStartResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", can_other_sketch=");
        sb.append(this.can_other_sketch);
        StringBuilder replace = sb.replace(0, 2, "SketchStartResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SketchStartResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public SketchStartResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_other_sketch = bool;
    }
}
