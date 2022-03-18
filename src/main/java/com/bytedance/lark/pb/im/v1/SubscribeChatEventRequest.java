package com.bytedance.lark.pb.im.v1;

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

public final class SubscribeChatEventRequest extends Message<SubscribeChatEventRequest, C18085a> {
    public static final ProtoAdapter<SubscribeChatEventRequest> ADAPTER = new C18086b();
    private static final long serialVersionUID = 0;
    public final List<String> subscribe_chat_ids;
    public final List<String> unsubscribe_chat_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeChatEventRequest$b */
    private static final class C18086b extends ProtoAdapter<SubscribeChatEventRequest> {
        C18086b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeChatEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeChatEventRequest subscribeChatEventRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, subscribeChatEventRequest.subscribe_chat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, subscribeChatEventRequest.unsubscribe_chat_ids) + subscribeChatEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeChatEventRequest decode(ProtoReader protoReader) throws IOException {
            C18085a aVar = new C18085a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45233a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45234b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeChatEventRequest subscribeChatEventRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, subscribeChatEventRequest.subscribe_chat_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, subscribeChatEventRequest.unsubscribe_chat_ids);
            protoWriter.writeBytes(subscribeChatEventRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeChatEventRequest$a */
    public static final class C18085a extends Message.Builder<SubscribeChatEventRequest, C18085a> {

        /* renamed from: a */
        public List<String> f45233a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f45234b = Internal.newMutableList();

        /* renamed from: a */
        public SubscribeChatEventRequest build() {
            return new SubscribeChatEventRequest(this.f45233a, this.f45234b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18085a mo62759a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45233a = list;
            return this;
        }

        /* renamed from: b */
        public C18085a mo62761b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45234b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18085a newBuilder() {
        C18085a aVar = new C18085a();
        aVar.f45233a = Internal.copyOf("subscribe_chat_ids", this.subscribe_chat_ids);
        aVar.f45234b = Internal.copyOf("unsubscribe_chat_ids", this.unsubscribe_chat_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SubscribeChatEventRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.subscribe_chat_ids.isEmpty()) {
            sb.append(", subscribe_chat_ids=");
            sb.append(this.subscribe_chat_ids);
        }
        if (!this.unsubscribe_chat_ids.isEmpty()) {
            sb.append(", unsubscribe_chat_ids=");
            sb.append(this.unsubscribe_chat_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeChatEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeChatEventRequest(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public SubscribeChatEventRequest(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.subscribe_chat_ids = Internal.immutableCopyOf("subscribe_chat_ids", list);
        this.unsubscribe_chat_ids = Internal.immutableCopyOf("unsubscribe_chat_ids", list2);
    }
}
