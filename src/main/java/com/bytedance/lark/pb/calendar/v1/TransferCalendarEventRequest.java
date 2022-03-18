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

public final class TransferCalendarEventRequest extends Message<TransferCalendarEventRequest, C16084a> {
    public static final ProtoAdapter<TransferCalendarEventRequest> ADAPTER = new C16085b();
    public static final Boolean DEFAULT_NEEDS_REMOVE_ORIGINAL_ORGANIZER = true;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Boolean needs_remove_original_organizer;
    public final Long original_time;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.TransferCalendarEventRequest$b */
    private static final class C16085b extends ProtoAdapter<TransferCalendarEventRequest> {
        C16085b() {
            super(FieldEncoding.LENGTH_DELIMITED, TransferCalendarEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TransferCalendarEventRequest transferCalendarEventRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, transferCalendarEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, transferCalendarEventRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, transferCalendarEventRequest.original_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, transferCalendarEventRequest.user_id);
            if (transferCalendarEventRequest.needs_remove_original_organizer != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(5, transferCalendarEventRequest.needs_remove_original_organizer);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + transferCalendarEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TransferCalendarEventRequest decode(ProtoReader protoReader) throws IOException {
            C16084a aVar = new C16084a();
            aVar.f42170a = "";
            aVar.f42171b = "";
            aVar.f42172c = 0L;
            aVar.f42173d = "";
            aVar.f42174e = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42170a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42171b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42172c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42173d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42174e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TransferCalendarEventRequest transferCalendarEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, transferCalendarEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, transferCalendarEventRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, transferCalendarEventRequest.original_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, transferCalendarEventRequest.user_id);
            if (transferCalendarEventRequest.needs_remove_original_organizer != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, transferCalendarEventRequest.needs_remove_original_organizer);
            }
            protoWriter.writeBytes(transferCalendarEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16084a newBuilder() {
        C16084a aVar = new C16084a();
        aVar.f42170a = this.calendar_id;
        aVar.f42171b = this.key;
        aVar.f42172c = this.original_time;
        aVar.f42173d = this.user_id;
        aVar.f42174e = this.needs_remove_original_organizer;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.TransferCalendarEventRequest$a */
    public static final class C16084a extends Message.Builder<TransferCalendarEventRequest, C16084a> {

        /* renamed from: a */
        public String f42170a;

        /* renamed from: b */
        public String f42171b;

        /* renamed from: c */
        public Long f42172c;

        /* renamed from: d */
        public String f42173d;

        /* renamed from: e */
        public Boolean f42174e;

        /* renamed from: a */
        public TransferCalendarEventRequest build() {
            String str;
            Long l;
            String str2;
            String str3 = this.f42170a;
            if (str3 != null && (str = this.f42171b) != null && (l = this.f42172c) != null && (str2 = this.f42173d) != null) {
                return new TransferCalendarEventRequest(str3, str, l, str2, this.f42174e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "calendar_id", this.f42171b, "key", this.f42172c, "original_time", this.f42173d, "user_id");
        }

        /* renamed from: a */
        public C16084a mo57802a(Boolean bool) {
            this.f42174e = bool;
            return this;
        }

        /* renamed from: b */
        public C16084a mo57806b(String str) {
            this.f42171b = str;
            return this;
        }

        /* renamed from: c */
        public C16084a mo57807c(String str) {
            this.f42173d = str;
            return this;
        }

        /* renamed from: a */
        public C16084a mo57803a(Long l) {
            this.f42172c = l;
            return this;
        }

        /* renamed from: a */
        public C16084a mo57804a(String str) {
            this.f42170a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "TransferCalendarEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", user_id=");
        sb.append(this.user_id);
        if (this.needs_remove_original_organizer != null) {
            sb.append(", needs_remove_original_organizer=");
            sb.append(this.needs_remove_original_organizer);
        }
        StringBuilder replace = sb.replace(0, 2, "TransferCalendarEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TransferCalendarEventRequest(String str, String str2, Long l, String str3, Boolean bool) {
        this(str, str2, l, str3, bool, ByteString.EMPTY);
    }

    public TransferCalendarEventRequest(String str, String str2, Long l, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.user_id = str3;
        this.needs_remove_original_organizer = bool;
    }
}
