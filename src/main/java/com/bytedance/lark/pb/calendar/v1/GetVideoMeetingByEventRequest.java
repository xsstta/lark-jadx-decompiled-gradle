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

public final class GetVideoMeetingByEventRequest extends Message<GetVideoMeetingByEventRequest, C15808a> {
    public static final ProtoAdapter<GetVideoMeetingByEventRequest> ADAPTER = new C15809b();
    public static final Boolean DEFAULT_FORCE_RENEW = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final Boolean force_renew;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetVideoMeetingByEventRequest$b */
    private static final class C15809b extends ProtoAdapter<GetVideoMeetingByEventRequest> {
        C15809b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVideoMeetingByEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVideoMeetingByEventRequest getVideoMeetingByEventRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getVideoMeetingByEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getVideoMeetingByEventRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getVideoMeetingByEventRequest.original_time);
            if (getVideoMeetingByEventRequest.force_renew != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, getVideoMeetingByEventRequest.force_renew);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getVideoMeetingByEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVideoMeetingByEventRequest decode(ProtoReader protoReader) throws IOException {
            C15808a aVar = new C15808a();
            aVar.f41587a = "";
            aVar.f41588b = "";
            aVar.f41589c = 0L;
            aVar.f41590d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41587a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41588b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41589c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41590d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVideoMeetingByEventRequest getVideoMeetingByEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getVideoMeetingByEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getVideoMeetingByEventRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getVideoMeetingByEventRequest.original_time);
            if (getVideoMeetingByEventRequest.force_renew != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getVideoMeetingByEventRequest.force_renew);
            }
            protoWriter.writeBytes(getVideoMeetingByEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15808a newBuilder() {
        C15808a aVar = new C15808a();
        aVar.f41587a = this.calendar_id;
        aVar.f41588b = this.key;
        aVar.f41589c = this.original_time;
        aVar.f41590d = this.force_renew;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetVideoMeetingByEventRequest$a */
    public static final class C15808a extends Message.Builder<GetVideoMeetingByEventRequest, C15808a> {

        /* renamed from: a */
        public String f41587a;

        /* renamed from: b */
        public String f41588b;

        /* renamed from: c */
        public Long f41589c;

        /* renamed from: d */
        public Boolean f41590d;

        /* renamed from: a */
        public GetVideoMeetingByEventRequest build() {
            String str;
            Long l;
            String str2 = this.f41587a;
            if (str2 != null && (str = this.f41588b) != null && (l = this.f41589c) != null) {
                return new GetVideoMeetingByEventRequest(str2, str, l, this.f41590d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41588b, "key", this.f41589c, "original_time");
        }

        /* renamed from: a */
        public C15808a mo57083a(Boolean bool) {
            this.f41590d = bool;
            return this;
        }

        /* renamed from: b */
        public C15808a mo57087b(String str) {
            this.f41588b = str;
            return this;
        }

        /* renamed from: a */
        public C15808a mo57084a(Long l) {
            this.f41589c = l;
            return this;
        }

        /* renamed from: a */
        public C15808a mo57085a(String str) {
            this.f41587a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetVideoMeetingByEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.force_renew != null) {
            sb.append(", force_renew=");
            sb.append(this.force_renew);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVideoMeetingByEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVideoMeetingByEventRequest(String str, String str2, Long l, Boolean bool) {
        this(str, str2, l, bool, ByteString.EMPTY);
    }

    public GetVideoMeetingByEventRequest(String str, String str2, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.force_renew = bool;
    }
}
