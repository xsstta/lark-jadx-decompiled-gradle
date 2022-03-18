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

public final class UnsubscribeSyncTopicResponse extends Message<UnsubscribeSyncTopicResponse, C19449a> {
    public static final ProtoAdapter<UnsubscribeSyncTopicResponse> ADAPTER = new C19450b();
    public static final SubscribeStatusCode DEFAULT_CODE = SubscribeStatusCode.SUCCESS;
    private static final long serialVersionUID = 0;
    public final SubscribeStatusCode code;
    public final String msg;

    /* renamed from: com.bytedance.lark.pb.sync.v1.UnsubscribeSyncTopicResponse$b */
    private static final class C19450b extends ProtoAdapter<UnsubscribeSyncTopicResponse> {
        C19450b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnsubscribeSyncTopicResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UnsubscribeSyncTopicResponse unsubscribeSyncTopicResponse) {
            int i;
            int encodedSizeWithTag = SubscribeStatusCode.ADAPTER.encodedSizeWithTag(1, unsubscribeSyncTopicResponse.code);
            if (unsubscribeSyncTopicResponse.msg != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, unsubscribeSyncTopicResponse.msg);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + unsubscribeSyncTopicResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UnsubscribeSyncTopicResponse decode(ProtoReader protoReader) throws IOException {
            C19449a aVar = new C19449a();
            aVar.f47781a = SubscribeStatusCode.SUCCESS;
            aVar.f47782b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47781a = SubscribeStatusCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47782b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UnsubscribeSyncTopicResponse unsubscribeSyncTopicResponse) throws IOException {
            SubscribeStatusCode.ADAPTER.encodeWithTag(protoWriter, 1, unsubscribeSyncTopicResponse.code);
            if (unsubscribeSyncTopicResponse.msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, unsubscribeSyncTopicResponse.msg);
            }
            protoWriter.writeBytes(unsubscribeSyncTopicResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.UnsubscribeSyncTopicResponse$a */
    public static final class C19449a extends Message.Builder<UnsubscribeSyncTopicResponse, C19449a> {

        /* renamed from: a */
        public SubscribeStatusCode f47781a;

        /* renamed from: b */
        public String f47782b;

        /* renamed from: a */
        public UnsubscribeSyncTopicResponse build() {
            SubscribeStatusCode subscribeStatusCode = this.f47781a;
            if (subscribeStatusCode != null) {
                return new UnsubscribeSyncTopicResponse(subscribeStatusCode, this.f47782b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(subscribeStatusCode, "code");
        }
    }

    @Override // com.squareup.wire.Message
    public C19449a newBuilder() {
        C19449a aVar = new C19449a();
        aVar.f47781a = this.code;
        aVar.f47782b = this.msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "UnsubscribeSyncTopicResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", code=");
        sb.append(this.code);
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        StringBuilder replace = sb.replace(0, 2, "UnsubscribeSyncTopicResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UnsubscribeSyncTopicResponse(SubscribeStatusCode subscribeStatusCode, String str) {
        this(subscribeStatusCode, str, ByteString.EMPTY);
    }

    public UnsubscribeSyncTopicResponse(SubscribeStatusCode subscribeStatusCode, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = subscribeStatusCode;
        this.msg = str;
    }
}
