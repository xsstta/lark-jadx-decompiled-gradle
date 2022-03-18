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

public final class GetCalendarMembersByIdsRequest extends Message<GetCalendarMembersByIdsRequest, C15664a> {
    public static final ProtoAdapter<GetCalendarMembersByIdsRequest> ADAPTER = new C15665b();
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final List<String> chat_ids;
    public final List<String> user_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarMembersByIdsRequest$b */
    private static final class C15665b extends ProtoAdapter<GetCalendarMembersByIdsRequest> {
        C15665b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarMembersByIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarMembersByIdsRequest getCalendarMembersByIdsRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarMembersByIdsRequest.calendar_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getCalendarMembersByIdsRequest.user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, getCalendarMembersByIdsRequest.chat_ids) + getCalendarMembersByIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarMembersByIdsRequest decode(ProtoReader protoReader) throws IOException {
            C15664a aVar = new C15664a();
            aVar.f41431a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41431a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41432b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41433c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarMembersByIdsRequest getCalendarMembersByIdsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarMembersByIdsRequest.calendar_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getCalendarMembersByIdsRequest.user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, getCalendarMembersByIdsRequest.chat_ids);
            protoWriter.writeBytes(getCalendarMembersByIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarMembersByIdsRequest$a */
    public static final class C15664a extends Message.Builder<GetCalendarMembersByIdsRequest, C15664a> {

        /* renamed from: a */
        public String f41431a;

        /* renamed from: b */
        public List<String> f41432b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f41433c = Internal.newMutableList();

        /* renamed from: a */
        public GetCalendarMembersByIdsRequest build() {
            String str = this.f41431a;
            if (str != null) {
                return new GetCalendarMembersByIdsRequest(str, this.f41432b, this.f41433c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "calendar_id");
        }

        /* renamed from: a */
        public C15664a mo56732a(String str) {
            this.f41431a = str;
            return this;
        }

        /* renamed from: a */
        public C15664a mo56733a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41432b = list;
            return this;
        }

        /* renamed from: b */
        public C15664a mo56735b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41433c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15664a newBuilder() {
        C15664a aVar = new C15664a();
        aVar.f41431a = this.calendar_id;
        aVar.f41432b = Internal.copyOf("user_ids", this.user_ids);
        aVar.f41433c = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarMembersByIdsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        if (!this.user_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.user_ids);
        }
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarMembersByIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarMembersByIdsRequest(String str, List<String> list, List<String> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public GetCalendarMembersByIdsRequest(String str, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.user_ids = Internal.immutableCopyOf("user_ids", list);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list2);
    }
}
