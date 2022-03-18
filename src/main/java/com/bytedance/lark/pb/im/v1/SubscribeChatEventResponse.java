package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SubscribeChatEventResponse extends Message<SubscribeChatEventResponse, C18087a> {
    public static final ProtoAdapter<SubscribeChatEventResponse> ADAPTER = new C18088b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeChatEventResponse$b */
    private static final class C18088b extends ProtoAdapter<SubscribeChatEventResponse> {
        C18088b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeChatEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeChatEventResponse subscribeChatEventResponse) {
            return subscribeChatEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeChatEventResponse decode(ProtoReader protoReader) throws IOException {
            C18087a aVar = new C18087a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeChatEventResponse subscribeChatEventResponse) throws IOException {
            protoWriter.writeBytes(subscribeChatEventResponse.unknownFields());
        }
    }

    public SubscribeChatEventResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeChatEventResponse$a */
    public static final class C18087a extends Message.Builder<SubscribeChatEventResponse, C18087a> {
        /* renamed from: a */
        public SubscribeChatEventResponse build() {
            return new SubscribeChatEventResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18087a newBuilder() {
        C18087a aVar = new C18087a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SubscribeChatEventResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SubscribeChatEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeChatEventResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
