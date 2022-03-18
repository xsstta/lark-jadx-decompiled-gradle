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

public final class VCTabMeetingGrootCellPayload extends Message<VCTabMeetingGrootCellPayload, C51200a> {
    public static final ProtoAdapter<VCTabMeetingGrootCellPayload> ADAPTER = new C51201b();
    private static final long serialVersionUID = 0;
    public final List<VCTabMeetingChangeInfo> changes;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingGrootCellPayload$b */
    private static final class C51201b extends ProtoAdapter<VCTabMeetingGrootCellPayload> {
        C51201b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabMeetingGrootCellPayload.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabMeetingGrootCellPayload vCTabMeetingGrootCellPayload) {
            return VCTabMeetingChangeInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, vCTabMeetingGrootCellPayload.changes) + vCTabMeetingGrootCellPayload.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabMeetingGrootCellPayload decode(ProtoReader protoReader) throws IOException {
            C51200a aVar = new C51200a();
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
                    aVar.f127451a.add(VCTabMeetingChangeInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabMeetingGrootCellPayload vCTabMeetingGrootCellPayload) throws IOException {
            VCTabMeetingChangeInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, vCTabMeetingGrootCellPayload.changes);
            protoWriter.writeBytes(vCTabMeetingGrootCellPayload.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingGrootCellPayload$a */
    public static final class C51200a extends Message.Builder<VCTabMeetingGrootCellPayload, C51200a> {

        /* renamed from: a */
        public List<VCTabMeetingChangeInfo> f127451a = Internal.newMutableList();

        /* renamed from: a */
        public VCTabMeetingGrootCellPayload build() {
            return new VCTabMeetingGrootCellPayload(this.f127451a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51200a newBuilder() {
        C51200a aVar = new C51200a();
        aVar.f127451a = Internal.copyOf("changes", this.changes);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabMeetingGrootCellPayload");
        StringBuilder sb = new StringBuilder();
        if (!this.changes.isEmpty()) {
            sb.append(", changes=");
            sb.append(this.changes);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabMeetingGrootCellPayload{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabMeetingGrootCellPayload(List<VCTabMeetingChangeInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public VCTabMeetingGrootCellPayload(List<VCTabMeetingChangeInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.changes = Internal.immutableCopyOf("changes", list);
    }
}
