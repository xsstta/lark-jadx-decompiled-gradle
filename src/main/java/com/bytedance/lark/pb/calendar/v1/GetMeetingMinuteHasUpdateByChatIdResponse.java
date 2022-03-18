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

public final class GetMeetingMinuteHasUpdateByChatIdResponse extends Message<GetMeetingMinuteHasUpdateByChatIdResponse, C15734a> {
    public static final ProtoAdapter<GetMeetingMinuteHasUpdateByChatIdResponse> ADAPTER = new C15735b();
    public static final Boolean DEFAULT_HAS_UPDATE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_update;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingMinuteHasUpdateByChatIdResponse$b */
    private static final class C15735b extends ProtoAdapter<GetMeetingMinuteHasUpdateByChatIdResponse> {
        C15735b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingMinuteHasUpdateByChatIdResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingMinuteHasUpdateByChatIdResponse getMeetingMinuteHasUpdateByChatIdResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getMeetingMinuteHasUpdateByChatIdResponse.has_update) + getMeetingMinuteHasUpdateByChatIdResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingMinuteHasUpdateByChatIdResponse decode(ProtoReader protoReader) throws IOException {
            C15734a aVar = new C15734a();
            aVar.f41494a = false;
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
                    aVar.f41494a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingMinuteHasUpdateByChatIdResponse getMeetingMinuteHasUpdateByChatIdResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getMeetingMinuteHasUpdateByChatIdResponse.has_update);
            protoWriter.writeBytes(getMeetingMinuteHasUpdateByChatIdResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingMinuteHasUpdateByChatIdResponse$a */
    public static final class C15734a extends Message.Builder<GetMeetingMinuteHasUpdateByChatIdResponse, C15734a> {

        /* renamed from: a */
        public Boolean f41494a;

        /* renamed from: a */
        public GetMeetingMinuteHasUpdateByChatIdResponse build() {
            Boolean bool = this.f41494a;
            if (bool != null) {
                return new GetMeetingMinuteHasUpdateByChatIdResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_update");
        }
    }

    @Override // com.squareup.wire.Message
    public C15734a newBuilder() {
        C15734a aVar = new C15734a();
        aVar.f41494a = this.has_update;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingMinuteHasUpdateByChatIdResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", has_update=");
        sb.append(this.has_update);
        StringBuilder replace = sb.replace(0, 2, "GetMeetingMinuteHasUpdateByChatIdResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingMinuteHasUpdateByChatIdResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetMeetingMinuteHasUpdateByChatIdResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_update = bool;
    }
}
