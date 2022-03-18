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

public final class GetAuthorizedEventByUniqueFieldRequest extends Message<GetAuthorizedEventByUniqueFieldRequest, C15644a> {
    public static final ProtoAdapter<GetAuthorizedEventByUniqueFieldRequest> ADAPTER = new C15645b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAuthorizedEventByUniqueFieldRequest$b */
    private static final class C15645b extends ProtoAdapter<GetAuthorizedEventByUniqueFieldRequest> {
        C15645b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAuthorizedEventByUniqueFieldRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAuthorizedEventByUniqueFieldRequest getAuthorizedEventByUniqueFieldRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getAuthorizedEventByUniqueFieldRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getAuthorizedEventByUniqueFieldRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getAuthorizedEventByUniqueFieldRequest.original_time);
            if (getAuthorizedEventByUniqueFieldRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(4, getAuthorizedEventByUniqueFieldRequest.start_time);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getAuthorizedEventByUniqueFieldRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAuthorizedEventByUniqueFieldRequest decode(ProtoReader protoReader) throws IOException {
            C15644a aVar = new C15644a();
            aVar.f41406a = "";
            aVar.f41407b = "";
            aVar.f41408c = 0L;
            aVar.f41409d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41406a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41407b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41408c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41409d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAuthorizedEventByUniqueFieldRequest getAuthorizedEventByUniqueFieldRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAuthorizedEventByUniqueFieldRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getAuthorizedEventByUniqueFieldRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getAuthorizedEventByUniqueFieldRequest.original_time);
            if (getAuthorizedEventByUniqueFieldRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getAuthorizedEventByUniqueFieldRequest.start_time);
            }
            protoWriter.writeBytes(getAuthorizedEventByUniqueFieldRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15644a newBuilder() {
        C15644a aVar = new C15644a();
        aVar.f41406a = this.calendar_id;
        aVar.f41407b = this.key;
        aVar.f41408c = this.original_time;
        aVar.f41409d = this.start_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAuthorizedEventByUniqueFieldRequest$a */
    public static final class C15644a extends Message.Builder<GetAuthorizedEventByUniqueFieldRequest, C15644a> {

        /* renamed from: a */
        public String f41406a;

        /* renamed from: b */
        public String f41407b;

        /* renamed from: c */
        public Long f41408c;

        /* renamed from: d */
        public Long f41409d;

        /* renamed from: a */
        public GetAuthorizedEventByUniqueFieldRequest build() {
            String str;
            Long l;
            String str2 = this.f41406a;
            if (str2 != null && (str = this.f41407b) != null && (l = this.f41408c) != null) {
                return new GetAuthorizedEventByUniqueFieldRequest(str2, str, l, this.f41409d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41407b, "key", this.f41408c, "original_time");
        }

        /* renamed from: a */
        public C15644a mo56680a(Long l) {
            this.f41408c = l;
            return this;
        }

        /* renamed from: b */
        public C15644a mo56683b(Long l) {
            this.f41409d = l;
            return this;
        }

        /* renamed from: a */
        public C15644a mo56681a(String str) {
            this.f41406a = str;
            return this;
        }

        /* renamed from: b */
        public C15644a mo56684b(String str) {
            this.f41407b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAuthorizedEventByUniqueFieldRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAuthorizedEventByUniqueFieldRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAuthorizedEventByUniqueFieldRequest(String str, String str2, Long l, Long l2) {
        this(str, str2, l, l2, ByteString.EMPTY);
    }

    public GetAuthorizedEventByUniqueFieldRequest(String str, String str2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.start_time = l2;
    }
}
