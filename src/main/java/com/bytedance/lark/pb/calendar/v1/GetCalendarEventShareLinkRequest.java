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

public final class GetCalendarEventShareLinkRequest extends Message<GetCalendarEventShareLinkRequest, C15660a> {
    public static final ProtoAdapter<GetCalendarEventShareLinkRequest> ADAPTER = new C15661b();
    public static final Boolean DEFAULT_NEED_IMG = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Boolean need_img;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventShareLinkRequest$b */
    private static final class C15661b extends ProtoAdapter<GetCalendarEventShareLinkRequest> {
        C15661b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarEventShareLinkRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarEventShareLinkRequest getCalendarEventShareLinkRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarEventShareLinkRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getCalendarEventShareLinkRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getCalendarEventShareLinkRequest.original_time);
            if (getCalendarEventShareLinkRequest.need_img != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, getCalendarEventShareLinkRequest.need_img);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getCalendarEventShareLinkRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarEventShareLinkRequest decode(ProtoReader protoReader) throws IOException {
            C15660a aVar = new C15660a();
            aVar.f41423a = "";
            aVar.f41424b = "";
            aVar.f41425c = 0L;
            aVar.f41426d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41423a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41424b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41425c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41426d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarEventShareLinkRequest getCalendarEventShareLinkRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarEventShareLinkRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCalendarEventShareLinkRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getCalendarEventShareLinkRequest.original_time);
            if (getCalendarEventShareLinkRequest.need_img != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getCalendarEventShareLinkRequest.need_img);
            }
            protoWriter.writeBytes(getCalendarEventShareLinkRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15660a newBuilder() {
        C15660a aVar = new C15660a();
        aVar.f41423a = this.calendar_id;
        aVar.f41424b = this.key;
        aVar.f41425c = this.original_time;
        aVar.f41426d = this.need_img;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventShareLinkRequest$a */
    public static final class C15660a extends Message.Builder<GetCalendarEventShareLinkRequest, C15660a> {

        /* renamed from: a */
        public String f41423a;

        /* renamed from: b */
        public String f41424b;

        /* renamed from: c */
        public Long f41425c;

        /* renamed from: d */
        public Boolean f41426d;

        /* renamed from: a */
        public GetCalendarEventShareLinkRequest build() {
            String str;
            Long l;
            String str2 = this.f41423a;
            if (str2 != null && (str = this.f41424b) != null && (l = this.f41425c) != null) {
                return new GetCalendarEventShareLinkRequest(str2, str, l, this.f41426d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41424b, "key", this.f41425c, "original_time");
        }

        /* renamed from: a */
        public C15660a mo56720a(Boolean bool) {
            this.f41426d = bool;
            return this;
        }

        /* renamed from: b */
        public C15660a mo56724b(String str) {
            this.f41424b = str;
            return this;
        }

        /* renamed from: a */
        public C15660a mo56721a(Long l) {
            this.f41425c = l;
            return this;
        }

        /* renamed from: a */
        public C15660a mo56722a(String str) {
            this.f41423a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarEventShareLinkRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.need_img != null) {
            sb.append(", need_img=");
            sb.append(this.need_img);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarEventShareLinkRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarEventShareLinkRequest(String str, String str2, Long l, Boolean bool) {
        this(str, str2, l, bool, ByteString.EMPTY);
    }

    public GetCalendarEventShareLinkRequest(String str, String str2, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.need_img = bool;
    }
}
