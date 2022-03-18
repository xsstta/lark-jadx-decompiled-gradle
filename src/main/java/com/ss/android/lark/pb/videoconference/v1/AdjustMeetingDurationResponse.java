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

public final class AdjustMeetingDurationResponse extends Message<AdjustMeetingDurationResponse, C50459a> {
    public static final ProtoAdapter<AdjustMeetingDurationResponse> ADAPTER = new C50460b();
    public static final Long DEFAULT_MEETING_DURATION = 0L;
    public static final Long DEFAULT_MEETING_START_TIME = 0L;
    public static final Long DEFAULT_REQUEST_BEGIN_TIME = 0L;
    public static final Long DEFAULT_REQUEST_END_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long meeting_duration;
    public final Long meeting_start_time;
    public final Long request_begin_time;
    public final Long request_end_time;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AdjustMeetingDurationResponse$b */
    private static final class C50460b extends ProtoAdapter<AdjustMeetingDurationResponse> {
        C50460b() {
            super(FieldEncoding.LENGTH_DELIMITED, AdjustMeetingDurationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(AdjustMeetingDurationResponse adjustMeetingDurationResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, adjustMeetingDurationResponse.meeting_start_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, adjustMeetingDurationResponse.request_begin_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, adjustMeetingDurationResponse.request_end_time);
            if (adjustMeetingDurationResponse.meeting_duration != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(4, adjustMeetingDurationResponse.meeting_duration);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + adjustMeetingDurationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public AdjustMeetingDurationResponse decode(ProtoReader protoReader) throws IOException {
            C50459a aVar = new C50459a();
            aVar.f125996a = 0L;
            aVar.f125997b = 0L;
            aVar.f125998c = 0L;
            aVar.f125999d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125996a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125997b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125998c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125999d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AdjustMeetingDurationResponse adjustMeetingDurationResponse) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, adjustMeetingDurationResponse.meeting_start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, adjustMeetingDurationResponse.request_begin_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, adjustMeetingDurationResponse.request_end_time);
            if (adjustMeetingDurationResponse.meeting_duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, adjustMeetingDurationResponse.meeting_duration);
            }
            protoWriter.writeBytes(adjustMeetingDurationResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50459a newBuilder() {
        C50459a aVar = new C50459a();
        aVar.f125996a = this.meeting_start_time;
        aVar.f125997b = this.request_begin_time;
        aVar.f125998c = this.request_end_time;
        aVar.f125999d = this.meeting_duration;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AdjustMeetingDurationResponse$a */
    public static final class C50459a extends Message.Builder<AdjustMeetingDurationResponse, C50459a> {

        /* renamed from: a */
        public Long f125996a;

        /* renamed from: b */
        public Long f125997b;

        /* renamed from: c */
        public Long f125998c;

        /* renamed from: d */
        public Long f125999d;

        /* renamed from: a */
        public AdjustMeetingDurationResponse build() {
            Long l;
            Long l2;
            Long l3 = this.f125996a;
            if (l3 != null && (l = this.f125997b) != null && (l2 = this.f125998c) != null) {
                return new AdjustMeetingDurationResponse(l3, l, l2, this.f125999d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l3, "meeting_start_time", this.f125997b, "request_begin_time", this.f125998c, "request_end_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "AdjustMeetingDurationResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_start_time=");
        sb.append(this.meeting_start_time);
        sb.append(", request_begin_time=");
        sb.append(this.request_begin_time);
        sb.append(", request_end_time=");
        sb.append(this.request_end_time);
        if (this.meeting_duration != null) {
            sb.append(", meeting_duration=");
            sb.append(this.meeting_duration);
        }
        StringBuilder replace = sb.replace(0, 2, "AdjustMeetingDurationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public AdjustMeetingDurationResponse(Long l, Long l2, Long l3, Long l4) {
        this(l, l2, l3, l4, ByteString.EMPTY);
    }

    public AdjustMeetingDurationResponse(Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_start_time = l;
        this.request_begin_time = l2;
        this.request_end_time = l3;
        this.meeting_duration = l4;
    }
}
