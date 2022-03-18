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

public final class SubscribeTopicRequest extends Message<SubscribeTopicRequest, C19431a> {
    public static final ProtoAdapter<SubscribeTopicRequest> ADAPTER = new C19432b();
    private static final long serialVersionUID = 0;
    public final SyncHeader header;
    public final SubOptions options;
    public final String topic_id;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SubscribeTopicRequest$b */
    private static final class C19432b extends ProtoAdapter<SubscribeTopicRequest> {
        C19432b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeTopicRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeTopicRequest subscribeTopicRequest) {
            int i;
            int encodedSizeWithTag = SyncHeader.ADAPTER.encodedSizeWithTag(1, subscribeTopicRequest.header) + ProtoAdapter.STRING.encodedSizeWithTag(2, subscribeTopicRequest.topic_id);
            if (subscribeTopicRequest.options != null) {
                i = SubOptions.ADAPTER.encodedSizeWithTag(3, subscribeTopicRequest.options);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + subscribeTopicRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeTopicRequest decode(ProtoReader protoReader) throws IOException {
            C19431a aVar = new C19431a();
            aVar.f47759b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47758a = SyncHeader.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47759b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47760c = SubOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeTopicRequest subscribeTopicRequest) throws IOException {
            SyncHeader.ADAPTER.encodeWithTag(protoWriter, 1, subscribeTopicRequest.header);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subscribeTopicRequest.topic_id);
            if (subscribeTopicRequest.options != null) {
                SubOptions.ADAPTER.encodeWithTag(protoWriter, 3, subscribeTopicRequest.options);
            }
            protoWriter.writeBytes(subscribeTopicRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19431a newBuilder() {
        C19431a aVar = new C19431a();
        aVar.f47758a = this.header;
        aVar.f47759b = this.topic_id;
        aVar.f47760c = this.options;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SubscribeTopicRequest$a */
    public static final class C19431a extends Message.Builder<SubscribeTopicRequest, C19431a> {

        /* renamed from: a */
        public SyncHeader f47758a;

        /* renamed from: b */
        public String f47759b;

        /* renamed from: c */
        public SubOptions f47760c;

        /* renamed from: a */
        public SubscribeTopicRequest build() {
            String str;
            SyncHeader syncHeader = this.f47758a;
            if (syncHeader != null && (str = this.f47759b) != null) {
                return new SubscribeTopicRequest(syncHeader, str, this.f47760c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(syncHeader, "header", this.f47759b, "topic_id");
        }

        /* renamed from: a */
        public C19431a mo66141a(SyncHeader syncHeader) {
            this.f47758a = syncHeader;
            return this;
        }

        /* renamed from: a */
        public C19431a mo66142a(String str) {
            this.f47759b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SubscribeTopicRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", topic_id=");
        sb.append(this.topic_id);
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeTopicRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeTopicRequest(SyncHeader syncHeader, String str, SubOptions subOptions) {
        this(syncHeader, str, subOptions, ByteString.EMPTY);
    }

    public SubscribeTopicRequest(SyncHeader syncHeader, String str, SubOptions subOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = syncHeader;
        this.topic_id = str;
        this.options = subOptions;
    }
}
