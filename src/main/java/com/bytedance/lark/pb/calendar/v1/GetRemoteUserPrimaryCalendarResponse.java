package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.protobuf.MessageOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRemoteUserPrimaryCalendarResponse extends Message<GetRemoteUserPrimaryCalendarResponse, C15764a> {
    public static final ProtoAdapter<GetRemoteUserPrimaryCalendarResponse> ADAPTER = new C15765b();
    public static final MessageOptions MESSAGE_OPTIONS = new MessageOptions.C23078a().mo80177a(true).build();
    private static final long serialVersionUID = 0;
    public final Calendar calendar;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRemoteUserPrimaryCalendarResponse$b */
    private static final class C15765b extends ProtoAdapter<GetRemoteUserPrimaryCalendarResponse> {
        C15765b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRemoteUserPrimaryCalendarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRemoteUserPrimaryCalendarResponse getRemoteUserPrimaryCalendarResponse) {
            int i;
            if (getRemoteUserPrimaryCalendarResponse.calendar != null) {
                i = Calendar.ADAPTER.encodedSizeWithTag(1, getRemoteUserPrimaryCalendarResponse.calendar);
            } else {
                i = 0;
            }
            return i + getRemoteUserPrimaryCalendarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRemoteUserPrimaryCalendarResponse decode(ProtoReader protoReader) throws IOException {
            C15764a aVar = new C15764a();
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
                    aVar.f41526a = Calendar.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRemoteUserPrimaryCalendarResponse getRemoteUserPrimaryCalendarResponse) throws IOException {
            if (getRemoteUserPrimaryCalendarResponse.calendar != null) {
                Calendar.ADAPTER.encodeWithTag(protoWriter, 1, getRemoteUserPrimaryCalendarResponse.calendar);
            }
            protoWriter.writeBytes(getRemoteUserPrimaryCalendarResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRemoteUserPrimaryCalendarResponse$a */
    public static final class C15764a extends Message.Builder<GetRemoteUserPrimaryCalendarResponse, C15764a> {

        /* renamed from: a */
        public Calendar f41526a;

        /* renamed from: a */
        public GetRemoteUserPrimaryCalendarResponse build() {
            return new GetRemoteUserPrimaryCalendarResponse(this.f41526a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15764a newBuilder() {
        C15764a aVar = new C15764a();
        aVar.f41526a = this.calendar;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetRemoteUserPrimaryCalendarResponse");
        StringBuilder sb = new StringBuilder();
        if (this.calendar != null) {
            sb.append(", calendar=");
            sb.append(this.calendar);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRemoteUserPrimaryCalendarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRemoteUserPrimaryCalendarResponse(Calendar calendar2) {
        this(calendar2, ByteString.EMPTY);
    }

    public GetRemoteUserPrimaryCalendarResponse(Calendar calendar2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar = calendar2;
    }
}
