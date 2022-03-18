package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarGuestListByMeetingIDRequest extends Message<GetCalendarGuestListByMeetingIDRequest, C50613a> {
    public static final ProtoAdapter<GetCalendarGuestListByMeetingIDRequest> ADAPTER = new C50614b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDRequest$b */
    private static final class C50614b extends ProtoAdapter<GetCalendarGuestListByMeetingIDRequest> {
        C50614b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarGuestListByMeetingIDRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarGuestListByMeetingIDRequest getCalendarGuestListByMeetingIDRequest) {
            int i;
            if (getCalendarGuestListByMeetingIDRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarGuestListByMeetingIDRequest.meeting_id);
            } else {
                i = 0;
            }
            return i + getCalendarGuestListByMeetingIDRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarGuestListByMeetingIDRequest decode(ProtoReader protoReader) throws IOException {
            C50613a aVar = new C50613a();
            aVar.f126347a = "";
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
                    aVar.f126347a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarGuestListByMeetingIDRequest getCalendarGuestListByMeetingIDRequest) throws IOException {
            if (getCalendarGuestListByMeetingIDRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarGuestListByMeetingIDRequest.meeting_id);
            }
            protoWriter.writeBytes(getCalendarGuestListByMeetingIDRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDRequest$a */
    public static final class C50613a extends Message.Builder<GetCalendarGuestListByMeetingIDRequest, C50613a> {

        /* renamed from: a */
        public String f126347a;

        /* renamed from: a */
        public GetCalendarGuestListByMeetingIDRequest build() {
            return new GetCalendarGuestListByMeetingIDRequest(this.f126347a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50613a newBuilder() {
        C50613a aVar = new C50613a();
        aVar.f126347a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarGuestListByMeetingIDRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarGuestListByMeetingIDRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarGuestListByMeetingIDRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetCalendarGuestListByMeetingIDRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
