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

public final class GetCanRenewExpiredVideoMeetingNumberRequest extends Message<GetCanRenewExpiredVideoMeetingNumberRequest, C15676a> {
    public static final ProtoAdapter<GetCanRenewExpiredVideoMeetingNumberRequest> ADAPTER = new C15677b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCanRenewExpiredVideoMeetingNumberRequest$b */
    private static final class C15677b extends ProtoAdapter<GetCanRenewExpiredVideoMeetingNumberRequest> {
        C15677b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCanRenewExpiredVideoMeetingNumberRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCanRenewExpiredVideoMeetingNumberRequest getCanRenewExpiredVideoMeetingNumberRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getCanRenewExpiredVideoMeetingNumberRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getCanRenewExpiredVideoMeetingNumberRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getCanRenewExpiredVideoMeetingNumberRequest.original_time) + getCanRenewExpiredVideoMeetingNumberRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCanRenewExpiredVideoMeetingNumberRequest decode(ProtoReader protoReader) throws IOException {
            C15676a aVar = new C15676a();
            aVar.f41438a = "";
            aVar.f41439b = "";
            aVar.f41440c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41438a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41439b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41440c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCanRenewExpiredVideoMeetingNumberRequest getCanRenewExpiredVideoMeetingNumberRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCanRenewExpiredVideoMeetingNumberRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCanRenewExpiredVideoMeetingNumberRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getCanRenewExpiredVideoMeetingNumberRequest.original_time);
            protoWriter.writeBytes(getCanRenewExpiredVideoMeetingNumberRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15676a newBuilder() {
        C15676a aVar = new C15676a();
        aVar.f41438a = this.calendar_id;
        aVar.f41439b = this.key;
        aVar.f41440c = this.original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCanRenewExpiredVideoMeetingNumberRequest$a */
    public static final class C15676a extends Message.Builder<GetCanRenewExpiredVideoMeetingNumberRequest, C15676a> {

        /* renamed from: a */
        public String f41438a;

        /* renamed from: b */
        public String f41439b;

        /* renamed from: c */
        public Long f41440c;

        /* renamed from: a */
        public GetCanRenewExpiredVideoMeetingNumberRequest build() {
            String str;
            Long l;
            String str2 = this.f41438a;
            if (str2 != null && (str = this.f41439b) != null && (l = this.f41440c) != null) {
                return new GetCanRenewExpiredVideoMeetingNumberRequest(str2, str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41439b, "key", this.f41440c, "original_time");
        }

        /* renamed from: a */
        public C15676a mo56760a(Long l) {
            this.f41440c = l;
            return this;
        }

        /* renamed from: b */
        public C15676a mo56763b(String str) {
            this.f41439b = str;
            return this;
        }

        /* renamed from: a */
        public C15676a mo56761a(String str) {
            this.f41438a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCanRenewExpiredVideoMeetingNumberRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        StringBuilder replace = sb.replace(0, 2, "GetCanRenewExpiredVideoMeetingNumberRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCanRenewExpiredVideoMeetingNumberRequest(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public GetCanRenewExpiredVideoMeetingNumberRequest(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
    }
}
