package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SketchGrootCellPayload extends Message<SketchGrootCellPayload, C51078a> {
    public static final ProtoAdapter<SketchGrootCellPayload> ADAPTER = new C51079b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final List<SketchOperationUnit> units;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchGrootCellPayload$b */
    private static final class C51079b extends ProtoAdapter<SketchGrootCellPayload> {
        C51079b() {
            super(FieldEncoding.LENGTH_DELIMITED, SketchGrootCellPayload.class);
        }

        /* renamed from: a */
        public int encodedSize(SketchGrootCellPayload sketchGrootCellPayload) {
            int i;
            int encodedSizeWithTag = SketchOperationUnit.ADAPTER.asRepeated().encodedSizeWithTag(1, sketchGrootCellPayload.units);
            if (sketchGrootCellPayload.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, sketchGrootCellPayload.meeting_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + sketchGrootCellPayload.unknownFields().size();
        }

        /* renamed from: a */
        public SketchGrootCellPayload decode(ProtoReader protoReader) throws IOException {
            C51078a aVar = new C51078a();
            aVar.f127196b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127195a.add(SketchOperationUnit.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127196b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SketchGrootCellPayload sketchGrootCellPayload) throws IOException {
            SketchOperationUnit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sketchGrootCellPayload.units);
            if (sketchGrootCellPayload.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sketchGrootCellPayload.meeting_id);
            }
            protoWriter.writeBytes(sketchGrootCellPayload.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchGrootCellPayload$a */
    public static final class C51078a extends Message.Builder<SketchGrootCellPayload, C51078a> {

        /* renamed from: a */
        public List<SketchOperationUnit> f127195a = Internal.newMutableList();

        /* renamed from: b */
        public String f127196b;

        /* renamed from: a */
        public SketchGrootCellPayload build() {
            return new SketchGrootCellPayload(this.f127195a, this.f127196b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51078a mo176298a(String str) {
            this.f127196b = str;
            return this;
        }

        /* renamed from: a */
        public C51078a mo176299a(List<SketchOperationUnit> list) {
            Internal.checkElementsNotNull(list);
            this.f127195a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51078a newBuilder() {
        C51078a aVar = new C51078a();
        aVar.f127195a = Internal.copyOf("units", this.units);
        aVar.f127196b = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SketchGrootCellPayload");
        StringBuilder sb = new StringBuilder();
        if (!this.units.isEmpty()) {
            sb.append(", units=");
            sb.append(this.units);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SketchGrootCellPayload{");
        replace.append('}');
        return replace.toString();
    }

    public SketchGrootCellPayload(List<SketchOperationUnit> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public SketchGrootCellPayload(List<SketchOperationUnit> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.units = Internal.immutableCopyOf("units", list);
        this.meeting_id = str;
    }
}
