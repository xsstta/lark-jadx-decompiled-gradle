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

public final class SortChattersInChatRequest extends Message<SortChattersInChatRequest, C16064a> {
    public static final ProtoAdapter<SortChattersInChatRequest> ADAPTER = new C16065b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SortChattersInChatRequest$b */
    private static final class C16065b extends ProtoAdapter<SortChattersInChatRequest> {
        C16065b() {
            super(FieldEncoding.LENGTH_DELIMITED, SortChattersInChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SortChattersInChatRequest sortChattersInChatRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, sortChattersInChatRequest.chatter_ids) + ProtoAdapter.STRING.encodedSizeWithTag(2, sortChattersInChatRequest.chat_id) + sortChattersInChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SortChattersInChatRequest decode(ProtoReader protoReader) throws IOException {
            C16064a aVar = new C16064a();
            aVar.f42156b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42155a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42156b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SortChattersInChatRequest sortChattersInChatRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, sortChattersInChatRequest.chatter_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sortChattersInChatRequest.chat_id);
            protoWriter.writeBytes(sortChattersInChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SortChattersInChatRequest$a */
    public static final class C16064a extends Message.Builder<SortChattersInChatRequest, C16064a> {

        /* renamed from: a */
        public List<String> f42155a = Internal.newMutableList();

        /* renamed from: b */
        public String f42156b;

        /* renamed from: a */
        public SortChattersInChatRequest build() {
            String str = this.f42156b;
            if (str != null) {
                return new SortChattersInChatRequest(this.f42155a, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C16064a mo57755a(String str) {
            this.f42156b = str;
            return this;
        }

        /* renamed from: a */
        public C16064a mo57756a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42155a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16064a newBuilder() {
        C16064a aVar = new C16064a();
        aVar.f42155a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f42156b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SortChattersInChatRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "SortChattersInChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SortChattersInChatRequest(List<String> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public SortChattersInChatRequest(List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.chat_id = str;
    }
}
