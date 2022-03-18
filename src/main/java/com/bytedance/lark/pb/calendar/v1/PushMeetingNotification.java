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

public final class PushMeetingNotification extends Message<PushMeetingNotification, C15960a> {
    public static final ProtoAdapter<PushMeetingNotification> ADAPTER = new C15961b();
    private static final long serialVersionUID = 0;
    public final List<MeetingEventRef> meeting_event_refs;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushMeetingNotification$b */
    private static final class C15961b extends ProtoAdapter<PushMeetingNotification> {
        C15961b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMeetingNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMeetingNotification pushMeetingNotification) {
            return MeetingEventRef.ADAPTER.asRepeated().encodedSizeWithTag(1, pushMeetingNotification.meeting_event_refs) + pushMeetingNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushMeetingNotification decode(ProtoReader protoReader) throws IOException {
            C15960a aVar = new C15960a();
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
                    aVar.f41960a.add(MeetingEventRef.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMeetingNotification pushMeetingNotification) throws IOException {
            MeetingEventRef.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushMeetingNotification.meeting_event_refs);
            protoWriter.writeBytes(pushMeetingNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushMeetingNotification$a */
    public static final class C15960a extends Message.Builder<PushMeetingNotification, C15960a> {

        /* renamed from: a */
        public List<MeetingEventRef> f41960a = Internal.newMutableList();

        /* renamed from: a */
        public PushMeetingNotification build() {
            return new PushMeetingNotification(this.f41960a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15960a newBuilder() {
        C15960a aVar = new C15960a();
        aVar.f41960a = Internal.copyOf("meeting_event_refs", this.meeting_event_refs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushMeetingNotification");
        StringBuilder sb = new StringBuilder();
        if (!this.meeting_event_refs.isEmpty()) {
            sb.append(", meeting_event_refs=");
            sb.append(this.meeting_event_refs);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMeetingNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushMeetingNotification(List<MeetingEventRef> list) {
        this(list, ByteString.EMPTY);
    }

    public PushMeetingNotification(List<MeetingEventRef> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_event_refs = Internal.immutableCopyOf("meeting_event_refs", list);
    }
}
