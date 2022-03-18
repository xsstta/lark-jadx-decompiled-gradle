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

public final class UpdateHistoryCalls extends Message<UpdateHistoryCalls, C51130a> {
    public static final ProtoAdapter<UpdateHistoryCalls> ADAPTER = new C51131b();
    private static final long serialVersionUID = 0;
    public final List<VCMeetingAbbrInfo> added_meetings;
    public final List<String> delete_call_ids;
    public final List<VCMeetingAbbrInfo> updated_meetings;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateHistoryCalls$b */
    private static final class C51131b extends ProtoAdapter<UpdateHistoryCalls> {
        C51131b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateHistoryCalls.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateHistoryCalls updateHistoryCalls) {
            return VCMeetingAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, updateHistoryCalls.updated_meetings) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, updateHistoryCalls.delete_call_ids) + VCMeetingAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, updateHistoryCalls.added_meetings) + updateHistoryCalls.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateHistoryCalls decode(ProtoReader protoReader) throws IOException {
            C51130a aVar = new C51130a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127242a.add(VCMeetingAbbrInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f127243b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127244c.add(VCMeetingAbbrInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateHistoryCalls updateHistoryCalls) throws IOException {
            VCMeetingAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateHistoryCalls.updated_meetings);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, updateHistoryCalls.delete_call_ids);
            VCMeetingAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, updateHistoryCalls.added_meetings);
            protoWriter.writeBytes(updateHistoryCalls.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateHistoryCalls$a */
    public static final class C51130a extends Message.Builder<UpdateHistoryCalls, C51130a> {

        /* renamed from: a */
        public List<VCMeetingAbbrInfo> f127242a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f127243b = Internal.newMutableList();

        /* renamed from: c */
        public List<VCMeetingAbbrInfo> f127244c = Internal.newMutableList();

        /* renamed from: a */
        public UpdateHistoryCalls build() {
            return new UpdateHistoryCalls(this.f127242a, this.f127243b, this.f127244c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51130a newBuilder() {
        C51130a aVar = new C51130a();
        aVar.f127242a = Internal.copyOf("updated_meetings", this.updated_meetings);
        aVar.f127243b = Internal.copyOf("delete_call_ids", this.delete_call_ids);
        aVar.f127244c = Internal.copyOf("added_meetings", this.added_meetings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateHistoryCalls");
        StringBuilder sb = new StringBuilder();
        if (!this.updated_meetings.isEmpty()) {
            sb.append(", updated_meetings=");
            sb.append(this.updated_meetings);
        }
        if (!this.delete_call_ids.isEmpty()) {
            sb.append(", delete_call_ids=");
            sb.append(this.delete_call_ids);
        }
        if (!this.added_meetings.isEmpty()) {
            sb.append(", added_meetings=");
            sb.append(this.added_meetings);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateHistoryCalls{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateHistoryCalls(List<VCMeetingAbbrInfo> list, List<String> list2, List<VCMeetingAbbrInfo> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public UpdateHistoryCalls(List<VCMeetingAbbrInfo> list, List<String> list2, List<VCMeetingAbbrInfo> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.updated_meetings = Internal.immutableCopyOf("updated_meetings", list);
        this.delete_call_ids = Internal.immutableCopyOf("delete_call_ids", list2);
        this.added_meetings = Internal.immutableCopyOf("added_meetings", list3);
    }
}
