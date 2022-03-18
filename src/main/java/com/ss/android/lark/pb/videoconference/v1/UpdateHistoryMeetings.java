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

public final class UpdateHistoryMeetings extends Message<UpdateHistoryMeetings, C51132a> {
    public static final ProtoAdapter<UpdateHistoryMeetings> ADAPTER = new C51133b();
    private static final long serialVersionUID = 0;
    public final List<HistoryMeeting> added_meetings;
    public final List<String> delete_history_ids;
    public final List<HistoryMeeting> updated_meetings;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateHistoryMeetings$b */
    private static final class C51133b extends ProtoAdapter<UpdateHistoryMeetings> {
        C51133b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateHistoryMeetings.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateHistoryMeetings updateHistoryMeetings) {
            return HistoryMeeting.ADAPTER.asRepeated().encodedSizeWithTag(1, updateHistoryMeetings.updated_meetings) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, updateHistoryMeetings.delete_history_ids) + HistoryMeeting.ADAPTER.asRepeated().encodedSizeWithTag(3, updateHistoryMeetings.added_meetings) + updateHistoryMeetings.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateHistoryMeetings decode(ProtoReader protoReader) throws IOException {
            C51132a aVar = new C51132a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127245a.add(HistoryMeeting.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f127246b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127247c.add(HistoryMeeting.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateHistoryMeetings updateHistoryMeetings) throws IOException {
            HistoryMeeting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateHistoryMeetings.updated_meetings);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, updateHistoryMeetings.delete_history_ids);
            HistoryMeeting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, updateHistoryMeetings.added_meetings);
            protoWriter.writeBytes(updateHistoryMeetings.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateHistoryMeetings$a */
    public static final class C51132a extends Message.Builder<UpdateHistoryMeetings, C51132a> {

        /* renamed from: a */
        public List<HistoryMeeting> f127245a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f127246b = Internal.newMutableList();

        /* renamed from: c */
        public List<HistoryMeeting> f127247c = Internal.newMutableList();

        /* renamed from: a */
        public UpdateHistoryMeetings build() {
            return new UpdateHistoryMeetings(this.f127245a, this.f127246b, this.f127247c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51132a newBuilder() {
        C51132a aVar = new C51132a();
        aVar.f127245a = Internal.copyOf("updated_meetings", this.updated_meetings);
        aVar.f127246b = Internal.copyOf("delete_history_ids", this.delete_history_ids);
        aVar.f127247c = Internal.copyOf("added_meetings", this.added_meetings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateHistoryMeetings");
        StringBuilder sb = new StringBuilder();
        if (!this.updated_meetings.isEmpty()) {
            sb.append(", updated_meetings=");
            sb.append(this.updated_meetings);
        }
        if (!this.delete_history_ids.isEmpty()) {
            sb.append(", delete_history_ids=");
            sb.append(this.delete_history_ids);
        }
        if (!this.added_meetings.isEmpty()) {
            sb.append(", added_meetings=");
            sb.append(this.added_meetings);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateHistoryMeetings{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateHistoryMeetings(List<HistoryMeeting> list, List<String> list2, List<HistoryMeeting> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public UpdateHistoryMeetings(List<HistoryMeeting> list, List<String> list2, List<HistoryMeeting> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.updated_meetings = Internal.immutableCopyOf("updated_meetings", list);
        this.delete_history_ids = Internal.immutableCopyOf("delete_history_ids", list2);
        this.added_meetings = Internal.immutableCopyOf("added_meetings", list3);
    }
}
