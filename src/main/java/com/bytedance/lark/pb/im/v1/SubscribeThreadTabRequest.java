package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SubscribeThreadTabRequest extends Message<SubscribeThreadTabRequest, C18089a> {
    public static final ProtoAdapter<SubscribeThreadTabRequest> ADAPTER = new C18090b();
    public static final Boolean DEFAULT_SUBSCRIBE = true;
    private static final long serialVersionUID = 0;
    public final Boolean subscribe;

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeThreadTabRequest$b */
    private static final class C18090b extends ProtoAdapter<SubscribeThreadTabRequest> {
        C18090b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeThreadTabRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeThreadTabRequest subscribeThreadTabRequest) {
            int i;
            if (subscribeThreadTabRequest.subscribe != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, subscribeThreadTabRequest.subscribe);
            } else {
                i = 0;
            }
            return i + subscribeThreadTabRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeThreadTabRequest decode(ProtoReader protoReader) throws IOException {
            C18089a aVar = new C18089a();
            aVar.f45235a = true;
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
                    aVar.f45235a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeThreadTabRequest subscribeThreadTabRequest) throws IOException {
            if (subscribeThreadTabRequest.subscribe != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, subscribeThreadTabRequest.subscribe);
            }
            protoWriter.writeBytes(subscribeThreadTabRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SubscribeThreadTabRequest$a */
    public static final class C18089a extends Message.Builder<SubscribeThreadTabRequest, C18089a> {

        /* renamed from: a */
        public Boolean f45235a;

        /* renamed from: a */
        public SubscribeThreadTabRequest build() {
            return new SubscribeThreadTabRequest(this.f45235a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18089a newBuilder() {
        C18089a aVar = new C18089a();
        aVar.f45235a = this.subscribe;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SubscribeThreadTabRequest");
        StringBuilder sb = new StringBuilder();
        if (this.subscribe != null) {
            sb.append(", subscribe=");
            sb.append(this.subscribe);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeThreadTabRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeThreadTabRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public SubscribeThreadTabRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.subscribe = bool;
    }
}
