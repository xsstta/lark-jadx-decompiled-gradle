package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.InMeetingData;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SketchData extends Message<SketchData, C51058a> {
    public static final ProtoAdapter<SketchData> ADAPTER = new C51059b();
    public static final InMeetingData.ScreenSharedData.SketchTransferMode DEFAULT_SKETCH_TRANSFER_MODE = InMeetingData.ScreenSharedData.SketchTransferMode.BY_DATA;
    private static final long serialVersionUID = 0;
    public final List<ShapeAckData> ack_datas;
    public final InMeetingData.ScreenSharedData.SketchTransferMode sketch_transfer_mode;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchData$b */
    private static final class C51059b extends ProtoAdapter<SketchData> {
        C51059b() {
            super(FieldEncoding.LENGTH_DELIMITED, SketchData.class);
        }

        /* renamed from: a */
        public int encodedSize(SketchData sketchData) {
            return ShapeAckData.ADAPTER.asRepeated().encodedSizeWithTag(1, sketchData.ack_datas) + InMeetingData.ScreenSharedData.SketchTransferMode.ADAPTER.encodedSizeWithTag(2, sketchData.sketch_transfer_mode) + sketchData.unknownFields().size();
        }

        /* renamed from: a */
        public SketchData decode(ProtoReader protoReader) throws IOException {
            C51058a aVar = new C51058a();
            aVar.f127142b = InMeetingData.ScreenSharedData.SketchTransferMode.BY_DATA;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127141a.add(ShapeAckData.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f127142b = InMeetingData.ScreenSharedData.SketchTransferMode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SketchData sketchData) throws IOException {
            ShapeAckData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sketchData.ack_datas);
            InMeetingData.ScreenSharedData.SketchTransferMode.ADAPTER.encodeWithTag(protoWriter, 2, sketchData.sketch_transfer_mode);
            protoWriter.writeBytes(sketchData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SketchData$a */
    public static final class C51058a extends Message.Builder<SketchData, C51058a> {

        /* renamed from: a */
        public List<ShapeAckData> f127141a = Internal.newMutableList();

        /* renamed from: b */
        public InMeetingData.ScreenSharedData.SketchTransferMode f127142b;

        /* renamed from: a */
        public SketchData build() {
            InMeetingData.ScreenSharedData.SketchTransferMode sketchTransferMode = this.f127142b;
            if (sketchTransferMode != null) {
                return new SketchData(this.f127141a, sketchTransferMode, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(sketchTransferMode, "sketch_transfer_mode");
        }
    }

    @Override // com.squareup.wire.Message
    public C51058a newBuilder() {
        C51058a aVar = new C51058a();
        aVar.f127141a = Internal.copyOf("ack_datas", this.ack_datas);
        aVar.f127142b = this.sketch_transfer_mode;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SketchData");
        StringBuilder sb = new StringBuilder();
        if (!this.ack_datas.isEmpty()) {
            sb.append(", ack_datas=");
            sb.append(this.ack_datas);
        }
        sb.append(", sketch_transfer_mode=");
        sb.append(this.sketch_transfer_mode);
        StringBuilder replace = sb.replace(0, 2, "SketchData{");
        replace.append('}');
        return replace.toString();
    }

    public SketchData(List<ShapeAckData> list, InMeetingData.ScreenSharedData.SketchTransferMode sketchTransferMode) {
        this(list, sketchTransferMode, ByteString.EMPTY);
    }

    public SketchData(List<ShapeAckData> list, InMeetingData.ScreenSharedData.SketchTransferMode sketchTransferMode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ack_datas = Internal.immutableCopyOf("ack_datas", list);
        this.sketch_transfer_mode = sketchTransferMode;
    }
}
