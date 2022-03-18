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

public final class GetCanRenewExpiredVideoMeetingNumberResponse extends Message<GetCanRenewExpiredVideoMeetingNumberResponse, C15678a> {
    public static final ProtoAdapter<GetCanRenewExpiredVideoMeetingNumberResponse> ADAPTER = new C15679b();
    public static final Boolean DEFAULT_CAN_RENEW = false;
    private static final long serialVersionUID = 0;
    public final Boolean can_renew;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCanRenewExpiredVideoMeetingNumberResponse$b */
    private static final class C15679b extends ProtoAdapter<GetCanRenewExpiredVideoMeetingNumberResponse> {
        C15679b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCanRenewExpiredVideoMeetingNumberResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCanRenewExpiredVideoMeetingNumberResponse getCanRenewExpiredVideoMeetingNumberResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getCanRenewExpiredVideoMeetingNumberResponse.can_renew) + getCanRenewExpiredVideoMeetingNumberResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCanRenewExpiredVideoMeetingNumberResponse decode(ProtoReader protoReader) throws IOException {
            C15678a aVar = new C15678a();
            aVar.f41441a = false;
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
                    aVar.f41441a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCanRenewExpiredVideoMeetingNumberResponse getCanRenewExpiredVideoMeetingNumberResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getCanRenewExpiredVideoMeetingNumberResponse.can_renew);
            protoWriter.writeBytes(getCanRenewExpiredVideoMeetingNumberResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCanRenewExpiredVideoMeetingNumberResponse$a */
    public static final class C15678a extends Message.Builder<GetCanRenewExpiredVideoMeetingNumberResponse, C15678a> {

        /* renamed from: a */
        public Boolean f41441a;

        /* renamed from: a */
        public GetCanRenewExpiredVideoMeetingNumberResponse build() {
            Boolean bool = this.f41441a;
            if (bool != null) {
                return new GetCanRenewExpiredVideoMeetingNumberResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "can_renew");
        }
    }

    @Override // com.squareup.wire.Message
    public C15678a newBuilder() {
        C15678a aVar = new C15678a();
        aVar.f41441a = this.can_renew;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCanRenewExpiredVideoMeetingNumberResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", can_renew=");
        sb.append(this.can_renew);
        StringBuilder replace = sb.replace(0, 2, "GetCanRenewExpiredVideoMeetingNumberResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCanRenewExpiredVideoMeetingNumberResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetCanRenewExpiredVideoMeetingNumberResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_renew = bool;
    }
}
