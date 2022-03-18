package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarVchatStatusResponse extends Message<GetCalendarVchatStatusResponse, C50316a> {
    public static final ProtoAdapter<GetCalendarVchatStatusResponse> ADAPTER = new C50317b();
    private static final long serialVersionUID = 0;
    public final CalendarVideoChatStatus mvideo_chat_status;

    /* renamed from: com.ss.android.lark.pb.videochat.GetCalendarVchatStatusResponse$b */
    private static final class C50317b extends ProtoAdapter<GetCalendarVchatStatusResponse> {
        C50317b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarVchatStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarVchatStatusResponse getCalendarVchatStatusResponse) {
            int i;
            if (getCalendarVchatStatusResponse.mvideo_chat_status != null) {
                i = CalendarVideoChatStatus.ADAPTER.encodedSizeWithTag(1, getCalendarVchatStatusResponse.mvideo_chat_status);
            } else {
                i = 0;
            }
            return i + getCalendarVchatStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarVchatStatusResponse decode(ProtoReader protoReader) throws IOException {
            C50316a aVar = new C50316a();
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
                    aVar.f125700a = CalendarVideoChatStatus.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarVchatStatusResponse getCalendarVchatStatusResponse) throws IOException {
            if (getCalendarVchatStatusResponse.mvideo_chat_status != null) {
                CalendarVideoChatStatus.ADAPTER.encodeWithTag(protoWriter, 1, getCalendarVchatStatusResponse.mvideo_chat_status);
            }
            protoWriter.writeBytes(getCalendarVchatStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetCalendarVchatStatusResponse$a */
    public static final class C50316a extends Message.Builder<GetCalendarVchatStatusResponse, C50316a> {

        /* renamed from: a */
        public CalendarVideoChatStatus f125700a;

        /* renamed from: a */
        public GetCalendarVchatStatusResponse build() {
            return new GetCalendarVchatStatusResponse(this.f125700a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50316a newBuilder() {
        C50316a aVar = new C50316a();
        aVar.f125700a = this.mvideo_chat_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mvideo_chat_status != null) {
            sb.append(", video_chat_status=");
            sb.append(this.mvideo_chat_status);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarVchatStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarVchatStatusResponse(CalendarVideoChatStatus calendarVideoChatStatus) {
        this(calendarVideoChatStatus, ByteString.EMPTY);
    }

    public GetCalendarVchatStatusResponse(CalendarVideoChatStatus calendarVideoChatStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mvideo_chat_status = calendarVideoChatStatus;
    }
}
