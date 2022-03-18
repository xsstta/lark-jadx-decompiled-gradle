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

public final class PushCalendarEventChangedNotification extends Message<PushCalendarEventChangedNotification, C15944a> {
    public static final ProtoAdapter<PushCalendarEventChangedNotification> ADAPTER = new C15945b();
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;
    public final ChangedEventCollections changed_event_collections;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventChangedNotification$b */
    private static final class C15945b extends ProtoAdapter<PushCalendarEventChangedNotification> {
        C15945b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCalendarEventChangedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCalendarEventChangedNotification pushCalendarEventChangedNotification) {
            return ChangedEventCollections.ADAPTER.encodedSizeWithTag(1, pushCalendarEventChangedNotification.changed_event_collections) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pushCalendarEventChangedNotification.calendar_ids) + pushCalendarEventChangedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushCalendarEventChangedNotification decode(ProtoReader protoReader) throws IOException {
            C15944a aVar = new C15944a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41928a = ChangedEventCollections.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41929b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCalendarEventChangedNotification pushCalendarEventChangedNotification) throws IOException {
            ChangedEventCollections.ADAPTER.encodeWithTag(protoWriter, 1, pushCalendarEventChangedNotification.changed_event_collections);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pushCalendarEventChangedNotification.calendar_ids);
            protoWriter.writeBytes(pushCalendarEventChangedNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventChangedNotification$a */
    public static final class C15944a extends Message.Builder<PushCalendarEventChangedNotification, C15944a> {

        /* renamed from: a */
        public ChangedEventCollections f41928a;

        /* renamed from: b */
        public List<String> f41929b = Internal.newMutableList();

        /* renamed from: a */
        public PushCalendarEventChangedNotification build() {
            ChangedEventCollections changedEventCollections = this.f41928a;
            if (changedEventCollections != null) {
                return new PushCalendarEventChangedNotification(changedEventCollections, this.f41929b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(changedEventCollections, "changed_event_collections");
        }
    }

    @Override // com.squareup.wire.Message
    public C15944a newBuilder() {
        C15944a aVar = new C15944a();
        aVar.f41928a = this.changed_event_collections;
        aVar.f41929b = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushCalendarEventChangedNotification");
        StringBuilder sb = new StringBuilder();
        sb.append(", changed_event_collections=");
        sb.append(this.changed_event_collections);
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushCalendarEventChangedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushCalendarEventChangedNotification(ChangedEventCollections changedEventCollections, List<String> list) {
        this(changedEventCollections, list, ByteString.EMPTY);
    }

    public PushCalendarEventChangedNotification(ChangedEventCollections changedEventCollections, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.changed_event_collections = changedEventCollections;
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
    }
}
