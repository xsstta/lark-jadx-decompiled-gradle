package com.bytedance.lark.pb.sync.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SubscribeTopicResponse extends Message<SubscribeTopicResponse, C19433a> {
    public static final ProtoAdapter<SubscribeTopicResponse> ADAPTER = new C19434b();
    public static final SubscribeStatusCode DEFAULT_CODE = SubscribeStatusCode.SUCCESS;
    private static final long serialVersionUID = 0;
    public final SubscribeStatusCode code;
    public final String msg;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SubscribeTopicResponse$b */
    private static final class C19434b extends ProtoAdapter<SubscribeTopicResponse> {
        C19434b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeTopicResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeTopicResponse subscribeTopicResponse) {
            int i;
            int encodedSizeWithTag = SubscribeStatusCode.ADAPTER.encodedSizeWithTag(1, subscribeTopicResponse.code);
            if (subscribeTopicResponse.msg != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, subscribeTopicResponse.msg);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + subscribeTopicResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeTopicResponse decode(ProtoReader protoReader) throws IOException {
            C19433a aVar = new C19433a();
            aVar.f47761a = SubscribeStatusCode.SUCCESS;
            aVar.f47762b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47761a = SubscribeStatusCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47762b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeTopicResponse subscribeTopicResponse) throws IOException {
            SubscribeStatusCode.ADAPTER.encodeWithTag(protoWriter, 1, subscribeTopicResponse.code);
            if (subscribeTopicResponse.msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subscribeTopicResponse.msg);
            }
            protoWriter.writeBytes(subscribeTopicResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SubscribeTopicResponse$a */
    public static final class C19433a extends Message.Builder<SubscribeTopicResponse, C19433a> {

        /* renamed from: a */
        public SubscribeStatusCode f47761a;

        /* renamed from: b */
        public String f47762b;

        /* renamed from: a */
        public SubscribeTopicResponse build() {
            SubscribeStatusCode subscribeStatusCode = this.f47761a;
            if (subscribeStatusCode != null) {
                return new SubscribeTopicResponse(subscribeStatusCode, this.f47762b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(subscribeStatusCode, "code");
        }
    }

    @Override // com.squareup.wire.Message
    public C19433a newBuilder() {
        C19433a aVar = new C19433a();
        aVar.f47761a = this.code;
        aVar.f47762b = this.msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SubscribeTopicResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", code=");
        sb.append(this.code);
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeTopicResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeTopicResponse(SubscribeStatusCode subscribeStatusCode, String str) {
        this(subscribeStatusCode, str, ByteString.EMPTY);
    }

    public SubscribeTopicResponse(SubscribeStatusCode subscribeStatusCode, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = subscribeStatusCode;
        this.msg = str;
    }
}
