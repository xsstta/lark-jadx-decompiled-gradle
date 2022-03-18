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

public final class MergeForwardMessagesResponse extends Message<MergeForwardMessagesResponse, C17813a> {
    public static final ProtoAdapter<MergeForwardMessagesResponse> ADAPTER = new C17814b();
    private static final long serialVersionUID = 0;
    public final Map<String, Transmit2ThreadTarget> message2threads;
    public final Map<String, String> message_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse$a */
    public static final class C17813a extends Message.Builder<MergeForwardMessagesResponse, C17813a> {

        /* renamed from: a */
        public Map<String, String> f44864a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, Transmit2ThreadTarget> f44865b = Internal.newMutableMap();

        /* renamed from: a */
        public MergeForwardMessagesResponse build() {
            return new MergeForwardMessagesResponse(this.f44864a, this.f44865b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse$b */
    private static final class C17814b extends ProtoAdapter<MergeForwardMessagesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f44866a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Transmit2ThreadTarget>> f44867b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Transmit2ThreadTarget.ADAPTER);

        C17814b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeForwardMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeForwardMessagesResponse mergeForwardMessagesResponse) {
            return this.f44866a.encodedSizeWithTag(1, mergeForwardMessagesResponse.message_ids) + this.f44867b.encodedSizeWithTag(2, mergeForwardMessagesResponse.message2threads) + mergeForwardMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MergeForwardMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C17813a aVar = new C17813a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44864a.putAll(this.f44866a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44865b.putAll(this.f44867b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MergeForwardMessagesResponse mergeForwardMessagesResponse) throws IOException {
            this.f44866a.encodeWithTag(protoWriter, 1, mergeForwardMessagesResponse.message_ids);
            this.f44867b.encodeWithTag(protoWriter, 2, mergeForwardMessagesResponse.message2threads);
            protoWriter.writeBytes(mergeForwardMessagesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17813a newBuilder() {
        C17813a aVar = new C17813a();
        aVar.f44864a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f44865b = Internal.copyOf("message2threads", this.message2threads);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MergeForwardMessagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (!this.message2threads.isEmpty()) {
            sb.append(", message2threads=");
            sb.append(this.message2threads);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeForwardMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MergeForwardMessagesResponse(Map<String, String> map, Map<String, Transmit2ThreadTarget> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public MergeForwardMessagesResponse(Map<String, String> map, Map<String, Transmit2ThreadTarget> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", map);
        this.message2threads = Internal.immutableCopyOf("message2threads", map2);
    }
}
