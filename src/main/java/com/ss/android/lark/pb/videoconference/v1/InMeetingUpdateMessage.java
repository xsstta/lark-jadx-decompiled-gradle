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

public final class InMeetingUpdateMessage extends Message<InMeetingUpdateMessage, C50799a> {
    public static final ProtoAdapter<InMeetingUpdateMessage> ADAPTER = new C50800b();
    private static final long serialVersionUID = 0;
    public final VideoChatInMeetingInfo in_meeting_info;
    public final String meeting_id;
    public final List<Participant> participants;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingUpdateMessage$b */
    private static final class C50800b extends ProtoAdapter<InMeetingUpdateMessage> {
        C50800b() {
            super(FieldEncoding.LENGTH_DELIMITED, InMeetingUpdateMessage.class);
        }

        /* renamed from: a */
        public int encodedSize(InMeetingUpdateMessage inMeetingUpdateMessage) {
            int i;
            int i2 = 0;
            if (inMeetingUpdateMessage.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, inMeetingUpdateMessage.meeting_id);
            } else {
                i = 0;
            }
            if (inMeetingUpdateMessage.in_meeting_info != null) {
                i2 = VideoChatInMeetingInfo.ADAPTER.encodedSizeWithTag(3, inMeetingUpdateMessage.in_meeting_info);
            }
            return i + i2 + Participant.ADAPTER.asRepeated().encodedSizeWithTag(4, inMeetingUpdateMessage.participants) + inMeetingUpdateMessage.unknownFields().size();
        }

        /* renamed from: a */
        public InMeetingUpdateMessage decode(ProtoReader protoReader) throws IOException {
            C50799a aVar = new C50799a();
            aVar.f126649a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f126649a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126650b = VideoChatInMeetingInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126651c.add(Participant.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InMeetingUpdateMessage inMeetingUpdateMessage) throws IOException {
            if (inMeetingUpdateMessage.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, inMeetingUpdateMessage.meeting_id);
            }
            if (inMeetingUpdateMessage.in_meeting_info != null) {
                VideoChatInMeetingInfo.ADAPTER.encodeWithTag(protoWriter, 3, inMeetingUpdateMessage.in_meeting_info);
            }
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, inMeetingUpdateMessage.participants);
            protoWriter.writeBytes(inMeetingUpdateMessage.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingUpdateMessage$a */
    public static final class C50799a extends Message.Builder<InMeetingUpdateMessage, C50799a> {

        /* renamed from: a */
        public String f126649a;

        /* renamed from: b */
        public VideoChatInMeetingInfo f126650b;

        /* renamed from: c */
        public List<Participant> f126651c = Internal.newMutableList();

        /* renamed from: a */
        public InMeetingUpdateMessage build() {
            return new InMeetingUpdateMessage(this.f126649a, this.f126650b, this.f126651c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50799a newBuilder() {
        C50799a aVar = new C50799a();
        aVar.f126649a = this.meeting_id;
        aVar.f126650b = this.in_meeting_info;
        aVar.f126651c = Internal.copyOf("participants", this.participants);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InMeetingUpdateMessage");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.in_meeting_info != null) {
            sb.append(", in_meeting_info=");
            sb.append(this.in_meeting_info);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        StringBuilder replace = sb.replace(0, 2, "InMeetingUpdateMessage{");
        replace.append('}');
        return replace.toString();
    }

    public InMeetingUpdateMessage(String str, VideoChatInMeetingInfo videoChatInMeetingInfo, List<Participant> list) {
        this(str, videoChatInMeetingInfo, list, ByteString.EMPTY);
    }

    public InMeetingUpdateMessage(String str, VideoChatInMeetingInfo videoChatInMeetingInfo, List<Participant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.in_meeting_info = videoChatInMeetingInfo;
        this.participants = Internal.immutableCopyOf("participants", list);
    }
}
