package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CardAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutActionResponse extends Message<PutActionResponse, C17971a> {
    public static final ProtoAdapter<PutActionResponse> ADAPTER = new C17972b();
    public static final CardAction.Method DEFAULT_METHOD = CardAction.Method.GET;
    private static final long serialVersionUID = 0;
    public final CardAction.Method method;
    public final CardAction.Url open_url;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutActionResponse$b */
    private static final class C17972b extends ProtoAdapter<PutActionResponse> {
        C17972b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutActionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutActionResponse putActionResponse) {
            int i;
            int i2 = 0;
            if (putActionResponse.method != null) {
                i = CardAction.Method.ADAPTER.encodedSizeWithTag(1, putActionResponse.method);
            } else {
                i = 0;
            }
            if (putActionResponse.open_url != null) {
                i2 = CardAction.Url.ADAPTER.encodedSizeWithTag(2, putActionResponse.open_url);
            }
            return i + i2 + putActionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutActionResponse decode(ProtoReader protoReader) throws IOException {
            C17971a aVar = new C17971a();
            aVar.f45069a = CardAction.Method.GET;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45069a = CardAction.Method.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45070b = CardAction.Url.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutActionResponse putActionResponse) throws IOException {
            if (putActionResponse.method != null) {
                CardAction.Method.ADAPTER.encodeWithTag(protoWriter, 1, putActionResponse.method);
            }
            if (putActionResponse.open_url != null) {
                CardAction.Url.ADAPTER.encodeWithTag(protoWriter, 2, putActionResponse.open_url);
            }
            protoWriter.writeBytes(putActionResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutActionResponse$a */
    public static final class C17971a extends Message.Builder<PutActionResponse, C17971a> {

        /* renamed from: a */
        public CardAction.Method f45069a;

        /* renamed from: b */
        public CardAction.Url f45070b;

        /* renamed from: a */
        public PutActionResponse build() {
            return new PutActionResponse(this.f45069a, this.f45070b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17971a newBuilder() {
        C17971a aVar = new C17971a();
        aVar.f45069a = this.method;
        aVar.f45070b = this.open_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutActionResponse");
        StringBuilder sb = new StringBuilder();
        if (this.method != null) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        StringBuilder replace = sb.replace(0, 2, "PutActionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutActionResponse(CardAction.Method method2, CardAction.Url url) {
        this(method2, url, ByteString.EMPTY);
    }

    public PutActionResponse(CardAction.Method method2, CardAction.Url url, ByteString byteString) {
        super(ADAPTER, byteString);
        this.method = method2;
        this.open_url = url;
    }
}
