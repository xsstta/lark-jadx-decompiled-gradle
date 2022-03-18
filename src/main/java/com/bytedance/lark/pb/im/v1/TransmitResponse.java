package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class TransmitResponse extends Message<TransmitResponse, C18117a> {
    public static final ProtoAdapter<TransmitResponse> ADAPTER = new C18118b();
    private static final long serialVersionUID = 0;
    public final Map<String, Transmit2ThreadTarget> message2threads;
    public final Map<String, String> message_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.TransmitResponse$a */
    public static final class C18117a extends Message.Builder<TransmitResponse, C18117a> {

        /* renamed from: a */
        public Map<String, String> f45272a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, Transmit2ThreadTarget> f45273b = Internal.newMutableMap();

        /* renamed from: a */
        public TransmitResponse build() {
            return new TransmitResponse(this.f45272a, this.f45273b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TransmitResponse$b */
    private static final class C18118b extends ProtoAdapter<TransmitResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45274a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Transmit2ThreadTarget>> f45275b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Transmit2ThreadTarget.ADAPTER);

        C18118b() {
            super(FieldEncoding.LENGTH_DELIMITED, TransmitResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TransmitResponse transmitResponse) {
            return this.f45274a.encodedSizeWithTag(1, transmitResponse.message_ids) + this.f45275b.encodedSizeWithTag(2, transmitResponse.message2threads) + transmitResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TransmitResponse decode(ProtoReader protoReader) throws IOException {
            C18117a aVar = new C18117a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45272a.putAll(this.f45274a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45273b.putAll(this.f45275b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TransmitResponse transmitResponse) throws IOException {
            this.f45274a.encodeWithTag(protoWriter, 1, transmitResponse.message_ids);
            this.f45275b.encodeWithTag(protoWriter, 2, transmitResponse.message2threads);
            protoWriter.writeBytes(transmitResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18117a newBuilder() {
        C18117a aVar = new C18117a();
        aVar.f45272a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f45273b = Internal.copyOf("message2threads", this.message2threads);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TransmitResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (!this.message2threads.isEmpty()) {
            sb.append(", message2threads=");
            sb.append(this.message2threads);
        }
        StringBuilder replace = sb.replace(0, 2, "TransmitResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TransmitResponse(Map<String, String> map, Map<String, Transmit2ThreadTarget> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public TransmitResponse(Map<String, String> map, Map<String, Transmit2ThreadTarget> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", map);
        this.message2threads = Internal.immutableCopyOf("message2threads", map2);
    }
}
