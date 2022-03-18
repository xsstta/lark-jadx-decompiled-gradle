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

public final class SortChattersInChatResponse extends Message<SortChattersInChatResponse, C16066a> {
    public static final ProtoAdapter<SortChattersInChatResponse> ADAPTER = new C16067b();
    private static final long serialVersionUID = 0;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SortChattersInChatResponse$b */
    private static final class C16067b extends ProtoAdapter<SortChattersInChatResponse> {
        C16067b() {
            super(FieldEncoding.LENGTH_DELIMITED, SortChattersInChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SortChattersInChatResponse sortChattersInChatResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, sortChattersInChatResponse.chatter_ids) + sortChattersInChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SortChattersInChatResponse decode(ProtoReader protoReader) throws IOException {
            C16066a aVar = new C16066a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42157a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SortChattersInChatResponse sortChattersInChatResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, sortChattersInChatResponse.chatter_ids);
            protoWriter.writeBytes(sortChattersInChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SortChattersInChatResponse$a */
    public static final class C16066a extends Message.Builder<SortChattersInChatResponse, C16066a> {

        /* renamed from: a */
        public List<String> f42157a = Internal.newMutableList();

        /* renamed from: a */
        public SortChattersInChatResponse build() {
            return new SortChattersInChatResponse(this.f42157a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16066a newBuilder() {
        C16066a aVar = new C16066a();
        aVar.f42157a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SortChattersInChatResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SortChattersInChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SortChattersInChatResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public SortChattersInChatResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
    }
}
