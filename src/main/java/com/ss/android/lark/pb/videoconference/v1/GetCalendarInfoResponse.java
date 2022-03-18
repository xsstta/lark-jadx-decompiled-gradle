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

public final class GetCalendarInfoResponse extends Message<GetCalendarInfoResponse, C50629a> {
    public static final ProtoAdapter<GetCalendarInfoResponse> ADAPTER = new C50630b();
    private static final long serialVersionUID = 0;
    public final CalendarInfo calendar_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarInfoResponse$b */
    private static final class C50630b extends ProtoAdapter<GetCalendarInfoResponse> {
        C50630b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarInfoResponse getCalendarInfoResponse) {
            return CalendarInfo.ADAPTER.encodedSizeWithTag(1, getCalendarInfoResponse.calendar_info) + getCalendarInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50629a aVar = new C50629a();
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
                    aVar.f126369a = CalendarInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarInfoResponse getCalendarInfoResponse) throws IOException {
            CalendarInfo.ADAPTER.encodeWithTag(protoWriter, 1, getCalendarInfoResponse.calendar_info);
            protoWriter.writeBytes(getCalendarInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarInfoResponse$a */
    public static final class C50629a extends Message.Builder<GetCalendarInfoResponse, C50629a> {

        /* renamed from: a */
        public CalendarInfo f126369a;

        /* renamed from: a */
        public GetCalendarInfoResponse build() {
            CalendarInfo calendarInfo = this.f126369a;
            if (calendarInfo != null) {
                return new GetCalendarInfoResponse(calendarInfo, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(calendarInfo, "calendar_info");
        }
    }

    @Override // com.squareup.wire.Message
    public C50629a newBuilder() {
        C50629a aVar = new C50629a();
        aVar.f126369a = this.calendar_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarInfoResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_info=");
        sb.append(this.calendar_info);
        StringBuilder replace = sb.replace(0, 2, "GetCalendarInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarInfoResponse(CalendarInfo calendarInfo) {
        this(calendarInfo, ByteString.EMPTY);
    }

    public GetCalendarInfoResponse(CalendarInfo calendarInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_info = calendarInfo;
    }
}
