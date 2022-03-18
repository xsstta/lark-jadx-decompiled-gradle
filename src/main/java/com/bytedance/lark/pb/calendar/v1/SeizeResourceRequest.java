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

public final class SeizeResourceRequest extends Message<SeizeResourceRequest, C16032a> {
    public static final ProtoAdapter<SeizeResourceRequest> ADAPTER = new C16033b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final String resource_calendar_id;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SeizeResourceRequest$b */
    private static final class C16033b extends ProtoAdapter<SeizeResourceRequest> {
        C16033b() {
            super(FieldEncoding.LENGTH_DELIMITED, SeizeResourceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SeizeResourceRequest seizeResourceRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, seizeResourceRequest.resource_calendar_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, seizeResourceRequest.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, seizeResourceRequest.end_time) + seizeResourceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SeizeResourceRequest decode(ProtoReader protoReader) throws IOException {
            C16032a aVar = new C16032a();
            aVar.f42110a = "";
            aVar.f42111b = 0L;
            aVar.f42112c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42110a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42111b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42112c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SeizeResourceRequest seizeResourceRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, seizeResourceRequest.resource_calendar_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, seizeResourceRequest.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, seizeResourceRequest.end_time);
            protoWriter.writeBytes(seizeResourceRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16032a newBuilder() {
        C16032a aVar = new C16032a();
        aVar.f42110a = this.resource_calendar_id;
        aVar.f42111b = this.start_time;
        aVar.f42112c = this.end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SeizeResourceRequest$a */
    public static final class C16032a extends Message.Builder<SeizeResourceRequest, C16032a> {

        /* renamed from: a */
        public String f42110a;

        /* renamed from: b */
        public Long f42111b;

        /* renamed from: c */
        public Long f42112c;

        /* renamed from: a */
        public SeizeResourceRequest build() {
            Long l;
            Long l2;
            String str = this.f42110a;
            if (str != null && (l = this.f42111b) != null && (l2 = this.f42112c) != null) {
                return new SeizeResourceRequest(str, l, l2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "resource_calendar_id", this.f42111b, "start_time", this.f42112c, "end_time");
        }

        /* renamed from: a */
        public C16032a mo57671a(Long l) {
            this.f42111b = l;
            return this;
        }

        /* renamed from: b */
        public C16032a mo57674b(Long l) {
            this.f42112c = l;
            return this;
        }

        /* renamed from: a */
        public C16032a mo57672a(String str) {
            this.f42110a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SeizeResourceRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", resource_calendar_id=");
        sb.append(this.resource_calendar_id);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", end_time=");
        sb.append(this.end_time);
        StringBuilder replace = sb.replace(0, 2, "SeizeResourceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SeizeResourceRequest(String str, Long l, Long l2) {
        this(str, l, l2, ByteString.EMPTY);
    }

    public SeizeResourceRequest(String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_calendar_id = str;
        this.start_time = l;
        this.end_time = l2;
    }
}
