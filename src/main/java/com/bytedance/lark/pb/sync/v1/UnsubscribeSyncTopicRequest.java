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

public final class UnsubscribeSyncTopicRequest extends Message<UnsubscribeSyncTopicRequest, C19447a> {
    public static final ProtoAdapter<UnsubscribeSyncTopicRequest> ADAPTER = new C19448b();
    private static final long serialVersionUID = 0;
    public final SyncHeader header;
    public final String topic_id;

    /* renamed from: com.bytedance.lark.pb.sync.v1.UnsubscribeSyncTopicRequest$b */
    private static final class C19448b extends ProtoAdapter<UnsubscribeSyncTopicRequest> {
        C19448b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnsubscribeSyncTopicRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UnsubscribeSyncTopicRequest unsubscribeSyncTopicRequest) {
            return SyncHeader.ADAPTER.encodedSizeWithTag(1, unsubscribeSyncTopicRequest.header) + ProtoAdapter.STRING.encodedSizeWithTag(2, unsubscribeSyncTopicRequest.topic_id) + unsubscribeSyncTopicRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UnsubscribeSyncTopicRequest decode(ProtoReader protoReader) throws IOException {
            C19447a aVar = new C19447a();
            aVar.f47780b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47779a = SyncHeader.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47780b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UnsubscribeSyncTopicRequest unsubscribeSyncTopicRequest) throws IOException {
            SyncHeader.ADAPTER.encodeWithTag(protoWriter, 1, unsubscribeSyncTopicRequest.header);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, unsubscribeSyncTopicRequest.topic_id);
            protoWriter.writeBytes(unsubscribeSyncTopicRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19447a newBuilder() {
        C19447a aVar = new C19447a();
        aVar.f47779a = this.header;
        aVar.f47780b = this.topic_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.UnsubscribeSyncTopicRequest$a */
    public static final class C19447a extends Message.Builder<UnsubscribeSyncTopicRequest, C19447a> {

        /* renamed from: a */
        public SyncHeader f47779a;

        /* renamed from: b */
        public String f47780b;

        /* renamed from: a */
        public UnsubscribeSyncTopicRequest build() {
            String str;
            SyncHeader syncHeader = this.f47779a;
            if (syncHeader != null && (str = this.f47780b) != null) {
                return new UnsubscribeSyncTopicRequest(syncHeader, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(syncHeader, "header", this.f47780b, "topic_id");
        }

        /* renamed from: a */
        public C19447a mo66175a(SyncHeader syncHeader) {
            this.f47779a = syncHeader;
            return this;
        }

        /* renamed from: a */
        public C19447a mo66176a(String str) {
            this.f47780b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "UnsubscribeSyncTopicRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", topic_id=");
        sb.append(this.topic_id);
        StringBuilder replace = sb.replace(0, 2, "UnsubscribeSyncTopicRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UnsubscribeSyncTopicRequest(SyncHeader syncHeader, String str) {
        this(syncHeader, str, ByteString.EMPTY);
    }

    public UnsubscribeSyncTopicRequest(SyncHeader syncHeader, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = syncHeader;
        this.topic_id = str;
    }
}
