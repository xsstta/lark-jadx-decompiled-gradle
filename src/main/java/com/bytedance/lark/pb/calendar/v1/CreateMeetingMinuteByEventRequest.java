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

public final class CreateMeetingMinuteByEventRequest extends Message<CreateMeetingMinuteByEventRequest, C15584a> {
    public static final ProtoAdapter<CreateMeetingMinuteByEventRequest> ADAPTER = new C15585b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByEventRequest$b */
    private static final class C15585b extends ProtoAdapter<CreateMeetingMinuteByEventRequest> {
        C15585b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateMeetingMinuteByEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateMeetingMinuteByEventRequest createMeetingMinuteByEventRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createMeetingMinuteByEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, createMeetingMinuteByEventRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, createMeetingMinuteByEventRequest.original_time) + createMeetingMinuteByEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateMeetingMinuteByEventRequest decode(ProtoReader protoReader) throws IOException {
            C15584a aVar = new C15584a();
            aVar.f41316a = "";
            aVar.f41317b = "";
            aVar.f41318c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41316a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41317b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41318c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateMeetingMinuteByEventRequest createMeetingMinuteByEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createMeetingMinuteByEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createMeetingMinuteByEventRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, createMeetingMinuteByEventRequest.original_time);
            protoWriter.writeBytes(createMeetingMinuteByEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15584a newBuilder() {
        C15584a aVar = new C15584a();
        aVar.f41316a = this.calendar_id;
        aVar.f41317b = this.key;
        aVar.f41318c = this.original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CreateMeetingMinuteByEventRequest$a */
    public static final class C15584a extends Message.Builder<CreateMeetingMinuteByEventRequest, C15584a> {

        /* renamed from: a */
        public String f41316a;

        /* renamed from: b */
        public String f41317b;

        /* renamed from: c */
        public Long f41318c;

        /* renamed from: a */
        public CreateMeetingMinuteByEventRequest build() {
            String str;
            Long l;
            String str2 = this.f41316a;
            if (str2 != null && (str = this.f41317b) != null && (l = this.f41318c) != null) {
                return new CreateMeetingMinuteByEventRequest(str2, str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41317b, "key", this.f41318c, "original_time");
        }

        /* renamed from: a */
        public C15584a mo56528a(Long l) {
            this.f41318c = l;
            return this;
        }

        /* renamed from: b */
        public C15584a mo56531b(String str) {
            this.f41317b = str;
            return this;
        }

        /* renamed from: a */
        public C15584a mo56529a(String str) {
            this.f41316a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CreateMeetingMinuteByEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        StringBuilder replace = sb.replace(0, 2, "CreateMeetingMinuteByEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateMeetingMinuteByEventRequest(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public CreateMeetingMinuteByEventRequest(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
    }
}
