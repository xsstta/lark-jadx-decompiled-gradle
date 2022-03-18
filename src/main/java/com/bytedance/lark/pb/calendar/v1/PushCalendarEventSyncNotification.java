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

public final class PushCalendarEventSyncNotification extends Message<PushCalendarEventSyncNotification, C15948a> {
    public static final ProtoAdapter<PushCalendarEventSyncNotification> ADAPTER = new C15949b();
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventSyncNotification$b */
    private static final class C15949b extends ProtoAdapter<PushCalendarEventSyncNotification> {
        C15949b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCalendarEventSyncNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCalendarEventSyncNotification pushCalendarEventSyncNotification) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pushCalendarEventSyncNotification.calendar_ids) + pushCalendarEventSyncNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushCalendarEventSyncNotification decode(ProtoReader protoReader) throws IOException {
            C15948a aVar = new C15948a();
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
                    aVar.f41942a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCalendarEventSyncNotification pushCalendarEventSyncNotification) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pushCalendarEventSyncNotification.calendar_ids);
            protoWriter.writeBytes(pushCalendarEventSyncNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventSyncNotification$a */
    public static final class C15948a extends Message.Builder<PushCalendarEventSyncNotification, C15948a> {

        /* renamed from: a */
        public List<String> f41942a = Internal.newMutableList();

        /* renamed from: a */
        public PushCalendarEventSyncNotification build() {
            return new PushCalendarEventSyncNotification(this.f41942a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15948a newBuilder() {
        C15948a aVar = new C15948a();
        aVar.f41942a = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushCalendarEventSyncNotification");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushCalendarEventSyncNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushCalendarEventSyncNotification(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PushCalendarEventSyncNotification(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
    }
}
