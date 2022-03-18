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

public final class ShareCalendarRequest extends Message<ShareCalendarRequest, C16054a> {
    public static final ProtoAdapter<ShareCalendarRequest> ADAPTER = new C16055b();
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final List<String> group_ids;
    public final List<String> user_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarRequest$b */
    private static final class C16055b extends ProtoAdapter<ShareCalendarRequest> {
        C16055b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareCalendarRequest shareCalendarRequest) {
            int i;
            if (shareCalendarRequest.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareCalendarRequest.calendar_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, shareCalendarRequest.user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, shareCalendarRequest.group_ids) + shareCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C16054a aVar = new C16054a();
            aVar.f42131a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42131a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42132b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42133c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareCalendarRequest shareCalendarRequest) throws IOException {
            if (shareCalendarRequest.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareCalendarRequest.calendar_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, shareCalendarRequest.user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, shareCalendarRequest.group_ids);
            protoWriter.writeBytes(shareCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarRequest$a */
    public static final class C16054a extends Message.Builder<ShareCalendarRequest, C16054a> {

        /* renamed from: a */
        public String f42131a;

        /* renamed from: b */
        public List<String> f42132b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f42133c = Internal.newMutableList();

        /* renamed from: a */
        public ShareCalendarRequest build() {
            return new ShareCalendarRequest(this.f42131a, this.f42132b, this.f42133c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16054a mo57729a(String str) {
            this.f42131a = str;
            return this;
        }

        /* renamed from: a */
        public C16054a mo57730a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42132b = list;
            return this;
        }

        /* renamed from: b */
        public C16054a mo57732b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42133c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16054a newBuilder() {
        C16054a aVar = new C16054a();
        aVar.f42131a = this.calendar_id;
        aVar.f42132b = Internal.copyOf("user_ids", this.user_ids);
        aVar.f42133c = Internal.copyOf("group_ids", this.group_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ShareCalendarRequest");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (!this.user_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.user_ids);
        }
        if (!this.group_ids.isEmpty()) {
            sb.append(", group_ids=");
            sb.append(this.group_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ShareCalendarRequest(String str, List<String> list, List<String> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public ShareCalendarRequest(String str, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.user_ids = Internal.immutableCopyOf("user_ids", list);
        this.group_ids = Internal.immutableCopyOf("group_ids", list2);
    }
}
