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

public final class GetInstancesRequest extends Message<GetInstancesRequest, C15720a> {
    public static final ProtoAdapter<GetInstancesRequest> ADAPTER = new C15721b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_FILTER_HIDDEN = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final Boolean filter_hidden;
    public final Long start_time;
    public final String timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesRequest$b */
    private static final class C15721b extends ProtoAdapter<GetInstancesRequest> {
        C15721b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInstancesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInstancesRequest getInstancesRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, getInstancesRequest.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, getInstancesRequest.end_time);
            int i2 = 0;
            if (getInstancesRequest.filter_hidden != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, getInstancesRequest.filter_hidden);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getInstancesRequest.timezone != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, getInstancesRequest.timezone);
            }
            return i3 + i2 + getInstancesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetInstancesRequest decode(ProtoReader protoReader) throws IOException {
            C15720a aVar = new C15720a();
            aVar.f41477a = 0L;
            aVar.f41478b = 0L;
            aVar.f41479c = false;
            aVar.f41480d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41477a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41478b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41479c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41480d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInstancesRequest getInstancesRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getInstancesRequest.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getInstancesRequest.end_time);
            if (getInstancesRequest.filter_hidden != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getInstancesRequest.filter_hidden);
            }
            if (getInstancesRequest.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getInstancesRequest.timezone);
            }
            protoWriter.writeBytes(getInstancesRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15720a newBuilder() {
        C15720a aVar = new C15720a();
        aVar.f41477a = this.start_time;
        aVar.f41478b = this.end_time;
        aVar.f41479c = this.filter_hidden;
        aVar.f41480d = this.timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesRequest$a */
    public static final class C15720a extends Message.Builder<GetInstancesRequest, C15720a> {

        /* renamed from: a */
        public Long f41477a;

        /* renamed from: b */
        public Long f41478b;

        /* renamed from: c */
        public Boolean f41479c;

        /* renamed from: d */
        public String f41480d;

        /* renamed from: a */
        public GetInstancesRequest build() {
            Long l;
            Long l2 = this.f41477a;
            if (l2 != null && (l = this.f41478b) != null) {
                return new GetInstancesRequest(l2, l, this.f41479c, this.f41480d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "start_time", this.f41478b, "end_time");
        }

        /* renamed from: a */
        public C15720a mo56863a(Boolean bool) {
            this.f41479c = bool;
            return this;
        }

        /* renamed from: b */
        public C15720a mo56867b(Long l) {
            this.f41478b = l;
            return this;
        }

        /* renamed from: a */
        public C15720a mo56864a(Long l) {
            this.f41477a = l;
            return this;
        }

        /* renamed from: a */
        public C15720a mo56865a(String str) {
            this.f41480d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetInstancesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", end_time=");
        sb.append(this.end_time);
        if (this.filter_hidden != null) {
            sb.append(", filter_hidden=");
            sb.append(this.filter_hidden);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInstancesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetInstancesRequest(Long l, Long l2, Boolean bool, String str) {
        this(l, l2, bool, str, ByteString.EMPTY);
    }

    public GetInstancesRequest(Long l, Long l2, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.filter_hidden = bool;
        this.timezone = str;
    }
}
