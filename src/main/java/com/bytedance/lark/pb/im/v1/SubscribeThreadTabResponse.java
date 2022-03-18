package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SubscribeThreadTabResponse extends Message<SubscribeThreadTabResponse, C18091a> {
    public static final ProtoAdapter<SubscribeThreadTabResponse> ADAPTER = new C18092b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeThreadTabResponse$b */
    private static final class C18092b extends ProtoAdapter<SubscribeThreadTabResponse> {
        C18092b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeThreadTabResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeThreadTabResponse subscribeThreadTabResponse) {
            return subscribeThreadTabResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeThreadTabResponse decode(ProtoReader protoReader) throws IOException {
            C18091a aVar = new C18091a();
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
        public void encode(ProtoWriter protoWriter, SubscribeThreadTabResponse subscribeThreadTabResponse) throws IOException {
            protoWriter.writeBytes(subscribeThreadTabResponse.unknownFields());
        }
    }

    public SubscribeThreadTabResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeThreadTabResponse$a */
    public static final class C18091a extends Message.Builder<SubscribeThreadTabResponse, C18091a> {
        /* renamed from: a */
        public SubscribeThreadTabResponse build() {
            return new SubscribeThreadTabResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18091a newBuilder() {
        C18091a aVar = new C18091a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SubscribeThreadTabResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SubscribeThreadTabResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeThreadTabResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
