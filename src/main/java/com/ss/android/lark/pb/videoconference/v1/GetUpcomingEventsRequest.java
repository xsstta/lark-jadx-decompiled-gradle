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

public final class GetUpcomingEventsRequest extends Message<GetUpcomingEventsRequest, C50683a> {
    public static final ProtoAdapter<GetUpcomingEventsRequest> ADAPTER = new C50684b();
    public static final Long DEFAULT_LIMIT = 0L;
    public static final Long DEFAULT_PAGE_NUM = 1L;
    public static final Boolean DEFAULT_REFRESH = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long limit;
    public final Long page_num;
    public final Boolean refresh;
    public final Long start_time;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUpcomingEventsRequest$b */
    private static final class C50684b extends ProtoAdapter<GetUpcomingEventsRequest> {
        C50684b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUpcomingEventsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUpcomingEventsRequest getUpcomingEventsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, getUpcomingEventsRequest.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, getUpcomingEventsRequest.limit);
            int i2 = 0;
            if (getUpcomingEventsRequest.page_num != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, getUpcomingEventsRequest.page_num);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getUpcomingEventsRequest.refresh != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getUpcomingEventsRequest.refresh);
            }
            return i3 + i2 + getUpcomingEventsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUpcomingEventsRequest decode(ProtoReader protoReader) throws IOException {
            C50683a aVar = new C50683a();
            aVar.f126409a = 0L;
            aVar.f126410b = 0L;
            aVar.f126411c = 1L;
            aVar.f126412d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126409a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126410b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126411c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126412d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUpcomingEventsRequest getUpcomingEventsRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getUpcomingEventsRequest.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getUpcomingEventsRequest.limit);
            if (getUpcomingEventsRequest.page_num != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getUpcomingEventsRequest.page_num);
            }
            if (getUpcomingEventsRequest.refresh != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getUpcomingEventsRequest.refresh);
            }
            protoWriter.writeBytes(getUpcomingEventsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50683a newBuilder() {
        C50683a aVar = new C50683a();
        aVar.f126409a = this.start_time;
        aVar.f126410b = this.limit;
        aVar.f126411c = this.page_num;
        aVar.f126412d = this.refresh;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUpcomingEventsRequest$a */
    public static final class C50683a extends Message.Builder<GetUpcomingEventsRequest, C50683a> {

        /* renamed from: a */
        public Long f126409a;

        /* renamed from: b */
        public Long f126410b;

        /* renamed from: c */
        public Long f126411c;

        /* renamed from: d */
        public Boolean f126412d;

        /* renamed from: a */
        public GetUpcomingEventsRequest build() {
            Long l;
            Long l2 = this.f126409a;
            if (l2 != null && (l = this.f126410b) != null) {
                return new GetUpcomingEventsRequest(l2, l, this.f126411c, this.f126412d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "start_time", this.f126410b, "limit");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetUpcomingEventsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", limit=");
        sb.append(this.limit);
        if (this.page_num != null) {
            sb.append(", page_num=");
            sb.append(this.page_num);
        }
        if (this.refresh != null) {
            sb.append(", refresh=");
            sb.append(this.refresh);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUpcomingEventsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUpcomingEventsRequest(Long l, Long l2, Long l3, Boolean bool) {
        this(l, l2, l3, bool, ByteString.EMPTY);
    }

    public GetUpcomingEventsRequest(Long l, Long l2, Long l3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.limit = l2;
        this.page_num = l3;
        this.refresh = bool;
    }
}
