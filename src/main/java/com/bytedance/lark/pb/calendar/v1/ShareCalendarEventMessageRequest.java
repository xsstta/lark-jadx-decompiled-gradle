package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShareCalendarEventMessageRequest extends Message<ShareCalendarEventMessageRequest, C16048a> {
    public static final ProtoAdapter<ShareCalendarEventMessageRequest> ADAPTER = new C16049b();
    public static final Long DEFAULT_EVENT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final List<String> chat_ids;
    public final String event_key;
    public final Long event_original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageRequest$b */
    private static final class C16049b extends ProtoAdapter<ShareCalendarEventMessageRequest> {
        C16049b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareCalendarEventMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareCalendarEventMessageRequest shareCalendarEventMessageRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, shareCalendarEventMessageRequest.chat_ids) + ProtoAdapter.STRING.encodedSizeWithTag(2, shareCalendarEventMessageRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, shareCalendarEventMessageRequest.event_key) + ProtoAdapter.INT64.encodedSizeWithTag(4, shareCalendarEventMessageRequest.event_original_time) + shareCalendarEventMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareCalendarEventMessageRequest decode(ProtoReader protoReader) throws IOException {
            C16048a aVar = new C16048a();
            aVar.f42124b = "";
            aVar.f42125c = "";
            aVar.f42126d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42123a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42124b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42125c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42126d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareCalendarEventMessageRequest shareCalendarEventMessageRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, shareCalendarEventMessageRequest.chat_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareCalendarEventMessageRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareCalendarEventMessageRequest.event_key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, shareCalendarEventMessageRequest.event_original_time);
            protoWriter.writeBytes(shareCalendarEventMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageRequest$a */
    public static final class C16048a extends Message.Builder<ShareCalendarEventMessageRequest, C16048a> {

        /* renamed from: a */
        public List<String> f42123a = Internal.newMutableList();

        /* renamed from: b */
        public String f42124b;

        /* renamed from: c */
        public String f42125c;

        /* renamed from: d */
        public Long f42126d;

        /* renamed from: a */
        public ShareCalendarEventMessageRequest build() {
            String str;
            Long l;
            String str2 = this.f42124b;
            if (str2 != null && (str = this.f42125c) != null && (l = this.f42126d) != null) {
                return new ShareCalendarEventMessageRequest(this.f42123a, str2, str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f42125c, "event_key", this.f42126d, "event_original_time");
        }

        /* renamed from: a */
        public C16048a mo57713a(Long l) {
            this.f42126d = l;
            return this;
        }

        /* renamed from: b */
        public C16048a mo57717b(String str) {
            this.f42125c = str;
            return this;
        }

        /* renamed from: a */
        public C16048a mo57714a(String str) {
            this.f42124b = str;
            return this;
        }

        /* renamed from: a */
        public C16048a mo57715a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42123a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16048a newBuilder() {
        C16048a aVar = new C16048a();
        aVar.f42123a = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f42124b = this.calendar_id;
        aVar.f42125c = this.event_key;
        aVar.f42126d = this.event_original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ShareCalendarEventMessageRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", event_key=");
        sb.append(this.event_key);
        sb.append(", event_original_time=");
        sb.append(this.event_original_time);
        StringBuilder replace = sb.replace(0, 2, "ShareCalendarEventMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ShareCalendarEventMessageRequest(List<String> list, String str, String str2, Long l) {
        this(list, str, str2, l, ByteString.EMPTY);
    }

    public ShareCalendarEventMessageRequest(List<String> list, String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.calendar_id = str;
        this.event_key = str2;
        this.event_original_time = l;
    }
}
