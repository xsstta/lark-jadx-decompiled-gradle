package com.bytedance.lark.pb.calendar.v1;

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

public final class ChangedEventCollections extends Message<ChangedEventCollections, C15572a> {
    public static final ProtoAdapter<ChangedEventCollections> ADAPTER = new C15573b();
    private static final long serialVersionUID = 0;
    public final List<CalendarEventUniqueField> added_event_unique_fields;
    public final List<CalendarEventUniqueField> deleted_event_unique_fields;
    public final List<CalendarEventUniqueField> updated_event_unique_fields;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ChangedEventCollections$b */
    private static final class C15573b extends ProtoAdapter<ChangedEventCollections> {
        C15573b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChangedEventCollections.class);
        }

        /* renamed from: a */
        public int encodedSize(ChangedEventCollections changedEventCollections) {
            return CalendarEventUniqueField.ADAPTER.asRepeated().encodedSizeWithTag(1, changedEventCollections.added_event_unique_fields) + CalendarEventUniqueField.ADAPTER.asRepeated().encodedSizeWithTag(2, changedEventCollections.updated_event_unique_fields) + CalendarEventUniqueField.ADAPTER.asRepeated().encodedSizeWithTag(3, changedEventCollections.deleted_event_unique_fields) + changedEventCollections.unknownFields().size();
        }

        /* renamed from: a */
        public ChangedEventCollections decode(ProtoReader protoReader) throws IOException {
            C15572a aVar = new C15572a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41304a.add(CalendarEventUniqueField.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41305b.add(CalendarEventUniqueField.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41306c.add(CalendarEventUniqueField.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChangedEventCollections changedEventCollections) throws IOException {
            CalendarEventUniqueField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, changedEventCollections.added_event_unique_fields);
            CalendarEventUniqueField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, changedEventCollections.updated_event_unique_fields);
            CalendarEventUniqueField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, changedEventCollections.deleted_event_unique_fields);
            protoWriter.writeBytes(changedEventCollections.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ChangedEventCollections$a */
    public static final class C15572a extends Message.Builder<ChangedEventCollections, C15572a> {

        /* renamed from: a */
        public List<CalendarEventUniqueField> f41304a = Internal.newMutableList();

        /* renamed from: b */
        public List<CalendarEventUniqueField> f41305b = Internal.newMutableList();

        /* renamed from: c */
        public List<CalendarEventUniqueField> f41306c = Internal.newMutableList();

        /* renamed from: a */
        public ChangedEventCollections build() {
            return new ChangedEventCollections(this.f41304a, this.f41305b, this.f41306c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15572a newBuilder() {
        C15572a aVar = new C15572a();
        aVar.f41304a = Internal.copyOf("added_event_unique_fields", this.added_event_unique_fields);
        aVar.f41305b = Internal.copyOf("updated_event_unique_fields", this.updated_event_unique_fields);
        aVar.f41306c = Internal.copyOf("deleted_event_unique_fields", this.deleted_event_unique_fields);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ChangedEventCollections");
        StringBuilder sb = new StringBuilder();
        if (!this.added_event_unique_fields.isEmpty()) {
            sb.append(", added_event_unique_fields=");
            sb.append(this.added_event_unique_fields);
        }
        if (!this.updated_event_unique_fields.isEmpty()) {
            sb.append(", updated_event_unique_fields=");
            sb.append(this.updated_event_unique_fields);
        }
        if (!this.deleted_event_unique_fields.isEmpty()) {
            sb.append(", deleted_event_unique_fields=");
            sb.append(this.deleted_event_unique_fields);
        }
        StringBuilder replace = sb.replace(0, 2, "ChangedEventCollections{");
        replace.append('}');
        return replace.toString();
    }

    public ChangedEventCollections(List<CalendarEventUniqueField> list, List<CalendarEventUniqueField> list2, List<CalendarEventUniqueField> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public ChangedEventCollections(List<CalendarEventUniqueField> list, List<CalendarEventUniqueField> list2, List<CalendarEventUniqueField> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.added_event_unique_fields = Internal.immutableCopyOf("added_event_unique_fields", list);
        this.updated_event_unique_fields = Internal.immutableCopyOf("updated_event_unique_fields", list2);
        this.deleted_event_unique_fields = Internal.immutableCopyOf("deleted_event_unique_fields", list3);
    }
}
