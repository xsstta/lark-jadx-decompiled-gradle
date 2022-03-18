package com.ss.android.lark.pb.calendars;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarIDByShareTokenResponse extends Message<GetCalendarIDByShareTokenResponse, C49572a> {
    public static final ProtoAdapter<GetCalendarIDByShareTokenResponse> ADAPTER = new C49573b();
    private static final long serialVersionUID = 0;
    public final String mcalendar_id;

    /* renamed from: com.ss.android.lark.pb.calendars.GetCalendarIDByShareTokenResponse$b */
    private static final class C49573b extends ProtoAdapter<GetCalendarIDByShareTokenResponse> {
        C49573b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarIDByShareTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarIDByShareTokenResponse getCalendarIDByShareTokenResponse) {
            int i;
            if (getCalendarIDByShareTokenResponse.mcalendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarIDByShareTokenResponse.mcalendar_id);
            } else {
                i = 0;
            }
            return i + getCalendarIDByShareTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarIDByShareTokenResponse decode(ProtoReader protoReader) throws IOException {
            C49572a aVar = new C49572a();
            aVar.f124187a = "";
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
                    aVar.f124187a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarIDByShareTokenResponse getCalendarIDByShareTokenResponse) throws IOException {
            if (getCalendarIDByShareTokenResponse.mcalendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarIDByShareTokenResponse.mcalendar_id);
            }
            protoWriter.writeBytes(getCalendarIDByShareTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendars.GetCalendarIDByShareTokenResponse$a */
    public static final class C49572a extends Message.Builder<GetCalendarIDByShareTokenResponse, C49572a> {

        /* renamed from: a */
        public String f124187a;

        /* renamed from: a */
        public GetCalendarIDByShareTokenResponse build() {
            return new GetCalendarIDByShareTokenResponse(this.f124187a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49572a newBuilder() {
        C49572a aVar = new C49572a();
        aVar.f124187a = this.mcalendar_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcalendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.mcalendar_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarIDByShareTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarIDByShareTokenResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetCalendarIDByShareTokenResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcalendar_id = str;
    }
}
