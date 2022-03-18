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

public final class UpdateUpcomingEvents extends Message<UpdateUpcomingEvents, C51134a> {
    public static final ProtoAdapter<UpdateUpcomingEvents> ADAPTER = new C51135b();
    private static final long serialVersionUID = 0;
    public final List<UpcomingEvent> added_events;
    public final List<String> delete_event_ids;
    public final List<UpcomingEvent> updated_events;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateUpcomingEvents$b */
    private static final class C51135b extends ProtoAdapter<UpdateUpcomingEvents> {
        C51135b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUpcomingEvents.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateUpcomingEvents updateUpcomingEvents) {
            return UpcomingEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, updateUpcomingEvents.updated_events) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, updateUpcomingEvents.delete_event_ids) + UpcomingEvent.ADAPTER.asRepeated().encodedSizeWithTag(3, updateUpcomingEvents.added_events) + updateUpcomingEvents.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateUpcomingEvents decode(ProtoReader protoReader) throws IOException {
            C51134a aVar = new C51134a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127248a.add(UpcomingEvent.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f127249b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127250c.add(UpcomingEvent.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateUpcomingEvents updateUpcomingEvents) throws IOException {
            UpcomingEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateUpcomingEvents.updated_events);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, updateUpcomingEvents.delete_event_ids);
            UpcomingEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, updateUpcomingEvents.added_events);
            protoWriter.writeBytes(updateUpcomingEvents.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateUpcomingEvents$a */
    public static final class C51134a extends Message.Builder<UpdateUpcomingEvents, C51134a> {

        /* renamed from: a */
        public List<UpcomingEvent> f127248a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f127249b = Internal.newMutableList();

        /* renamed from: c */
        public List<UpcomingEvent> f127250c = Internal.newMutableList();

        /* renamed from: a */
        public UpdateUpcomingEvents build() {
            return new UpdateUpcomingEvents(this.f127248a, this.f127249b, this.f127250c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51134a newBuilder() {
        C51134a aVar = new C51134a();
        aVar.f127248a = Internal.copyOf("updated_events", this.updated_events);
        aVar.f127249b = Internal.copyOf("delete_event_ids", this.delete_event_ids);
        aVar.f127250c = Internal.copyOf("added_events", this.added_events);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateUpcomingEvents");
        StringBuilder sb = new StringBuilder();
        if (!this.updated_events.isEmpty()) {
            sb.append(", updated_events=");
            sb.append(this.updated_events);
        }
        if (!this.delete_event_ids.isEmpty()) {
            sb.append(", delete_event_ids=");
            sb.append(this.delete_event_ids);
        }
        if (!this.added_events.isEmpty()) {
            sb.append(", added_events=");
            sb.append(this.added_events);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUpcomingEvents{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateUpcomingEvents(List<UpcomingEvent> list, List<String> list2, List<UpcomingEvent> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public UpdateUpcomingEvents(List<UpcomingEvent> list, List<String> list2, List<UpcomingEvent> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.updated_events = Internal.immutableCopyOf("updated_events", list);
        this.delete_event_ids = Internal.immutableCopyOf("delete_event_ids", list2);
        this.added_events = Internal.immutableCopyOf("added_events", list3);
    }
}
