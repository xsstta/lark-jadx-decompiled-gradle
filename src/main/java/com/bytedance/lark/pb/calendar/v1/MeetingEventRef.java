package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MeetingEventRef extends Message<MeetingEventRef, C15868a> {
    public static final ProtoAdapter<MeetingEventRef> ADAPTER = new C15869b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String key;
    public final String meeting_id;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingEventRef$b */
    private static final class C15869b extends ProtoAdapter<MeetingEventRef> {
        C15869b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingEventRef.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingEventRef meetingEventRef) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, meetingEventRef.key) + ProtoAdapter.INT64.encodedSizeWithTag(2, meetingEventRef.original_time) + ProtoAdapter.STRING.encodedSizeWithTag(3, meetingEventRef.meeting_id) + meetingEventRef.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingEventRef decode(ProtoReader protoReader) throws IOException {
            C15868a aVar = new C15868a();
            aVar.f41695a = "";
            aVar.f41696b = 0L;
            aVar.f41697c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41695a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41696b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41697c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingEventRef meetingEventRef) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingEventRef.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, meetingEventRef.original_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, meetingEventRef.meeting_id);
            protoWriter.writeBytes(meetingEventRef.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15868a newBuilder() {
        C15868a aVar = new C15868a();
        aVar.f41695a = this.key;
        aVar.f41696b = this.original_time;
        aVar.f41697c = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingEventRef$a */
    public static final class C15868a extends Message.Builder<MeetingEventRef, C15868a> {

        /* renamed from: a */
        public String f41695a;

        /* renamed from: b */
        public Long f41696b;

        /* renamed from: c */
        public String f41697c;

        /* renamed from: a */
        public MeetingEventRef build() {
            Long l;
            String str;
            String str2 = this.f41695a;
            if (str2 != null && (l = this.f41696b) != null && (str = this.f41697c) != null) {
                return new MeetingEventRef(str2, l, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "key", this.f41696b, "original_time", this.f41697c, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MeetingEventRef");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        StringBuilder replace = sb.replace(0, 2, "MeetingEventRef{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingEventRef(String str, Long l, String str2) {
        this(str, l, str2, ByteString.EMPTY);
    }

    public MeetingEventRef(String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.original_time = l;
        this.meeting_id = str2;
    }
}
