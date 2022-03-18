package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatCombinedInfo extends Message<VideoChatCombinedInfo, C51224a> {
    public static final ProtoAdapter<VideoChatCombinedInfo> ADAPTER = new C51225b();
    private static final long serialVersionUID = 0;
    public final CalendarInfo calendar_info;
    public final VideoChatExtraInfo extra_info;
    public final VideoChatInMeetingInfo in_meeting_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatCombinedInfo$b */
    private static final class C51225b extends ProtoAdapter<VideoChatCombinedInfo> {
        C51225b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatCombinedInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatCombinedInfo videoChatCombinedInfo) {
            int i;
            int encodedSizeWithTag = VideoChatInMeetingInfo.ADAPTER.encodedSizeWithTag(1, videoChatCombinedInfo.in_meeting_info);
            int i2 = 0;
            if (videoChatCombinedInfo.extra_info != null) {
                i = VideoChatExtraInfo.ADAPTER.encodedSizeWithTag(2, videoChatCombinedInfo.extra_info);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (videoChatCombinedInfo.calendar_info != null) {
                i2 = CalendarInfo.ADAPTER.encodedSizeWithTag(3, videoChatCombinedInfo.calendar_info);
            }
            return i3 + i2 + videoChatCombinedInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatCombinedInfo decode(ProtoReader protoReader) throws IOException {
            C51224a aVar = new C51224a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127517a = VideoChatInMeetingInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127518b = VideoChatExtraInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127519c = CalendarInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatCombinedInfo videoChatCombinedInfo) throws IOException {
            VideoChatInMeetingInfo.ADAPTER.encodeWithTag(protoWriter, 1, videoChatCombinedInfo.in_meeting_info);
            if (videoChatCombinedInfo.extra_info != null) {
                VideoChatExtraInfo.ADAPTER.encodeWithTag(protoWriter, 2, videoChatCombinedInfo.extra_info);
            }
            if (videoChatCombinedInfo.calendar_info != null) {
                CalendarInfo.ADAPTER.encodeWithTag(protoWriter, 3, videoChatCombinedInfo.calendar_info);
            }
            protoWriter.writeBytes(videoChatCombinedInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51224a newBuilder() {
        C51224a aVar = new C51224a();
        aVar.f127517a = this.in_meeting_info;
        aVar.f127518b = this.extra_info;
        aVar.f127519c = this.calendar_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatCombinedInfo$a */
    public static final class C51224a extends Message.Builder<VideoChatCombinedInfo, C51224a> {

        /* renamed from: a */
        public VideoChatInMeetingInfo f127517a;

        /* renamed from: b */
        public VideoChatExtraInfo f127518b;

        /* renamed from: c */
        public CalendarInfo f127519c;

        /* renamed from: a */
        public VideoChatCombinedInfo build() {
            VideoChatInMeetingInfo videoChatInMeetingInfo = this.f127517a;
            if (videoChatInMeetingInfo != null) {
                return new VideoChatCombinedInfo(videoChatInMeetingInfo, this.f127518b, this.f127519c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(videoChatInMeetingInfo, "in_meeting_info");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatCombinedInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", in_meeting_info=");
        sb.append(this.in_meeting_info);
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.calendar_info != null) {
            sb.append(", calendar_info=");
            sb.append(this.calendar_info);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatCombinedInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatCombinedInfo(VideoChatInMeetingInfo videoChatInMeetingInfo, VideoChatExtraInfo videoChatExtraInfo, CalendarInfo calendarInfo) {
        this(videoChatInMeetingInfo, videoChatExtraInfo, calendarInfo, ByteString.EMPTY);
    }

    public VideoChatCombinedInfo(VideoChatInMeetingInfo videoChatInMeetingInfo, VideoChatExtraInfo videoChatExtraInfo, CalendarInfo calendarInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.in_meeting_info = videoChatInMeetingInfo;
        this.extra_info = videoChatExtraInfo;
        this.calendar_info = calendarInfo;
    }
}
