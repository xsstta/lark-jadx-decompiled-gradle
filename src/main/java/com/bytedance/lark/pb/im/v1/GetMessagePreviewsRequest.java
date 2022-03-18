package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetMessagePreviewsRequest extends Message<GetMessagePreviewsRequest, C17623a> {
    public static final ProtoAdapter<GetMessagePreviewsRequest> ADAPTER = new C17624b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final Map<String, PreviewPair> message_preview_map;
    public final SyncDataStrategy sync_data_strategy;

    public static final class PreviewPair extends Message<PreviewPair, C17621a> {
        public static final ProtoAdapter<PreviewPair> ADAPTER = new C17622b();
        private static final long serialVersionUID = 0;
        public final List<String> preview_ids;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagePreviewsRequest$PreviewPair$b */
        private static final class C17622b extends ProtoAdapter<PreviewPair> {
            C17622b() {
                super(FieldEncoding.LENGTH_DELIMITED, PreviewPair.class);
            }

            /* renamed from: a */
            public int encodedSize(PreviewPair previewPair) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, previewPair.preview_ids) + previewPair.unknownFields().size();
            }

            /* renamed from: a */
            public PreviewPair decode(ProtoReader protoReader) throws IOException {
                C17621a aVar = new C17621a();
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
                        aVar.f44618a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PreviewPair previewPair) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, previewPair.preview_ids);
                protoWriter.writeBytes(previewPair.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagePreviewsRequest$PreviewPair$a */
        public static final class C17621a extends Message.Builder<PreviewPair, C17621a> {

            /* renamed from: a */
            public List<String> f44618a = Internal.newMutableList();

            /* renamed from: a */
            public PreviewPair build() {
                return new PreviewPair(this.f44618a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17621a mo61629a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f44618a = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C17621a newBuilder() {
            C17621a aVar = new C17621a();
            aVar.f44618a = Internal.copyOf("preview_ids", this.preview_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "PreviewPair");
            StringBuilder sb = new StringBuilder();
            if (!this.preview_ids.isEmpty()) {
                sb.append(", preview_ids=");
                sb.append(this.preview_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "PreviewPair{");
            replace.append('}');
            return replace.toString();
        }

        public PreviewPair(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public PreviewPair(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.preview_ids = Internal.immutableCopyOf("preview_ids", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagePreviewsRequest$a */
    public static final class C17623a extends Message.Builder<GetMessagePreviewsRequest, C17623a> {

        /* renamed from: a */
        public Map<String, PreviewPair> f44619a = Internal.newMutableMap();

        /* renamed from: b */
        public SyncDataStrategy f44620b;

        /* renamed from: a */
        public GetMessagePreviewsRequest build() {
            return new GetMessagePreviewsRequest(this.f44619a, this.f44620b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17623a mo61634a(SyncDataStrategy syncDataStrategy) {
            this.f44620b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17623a mo61635a(Map<String, PreviewPair> map) {
            Internal.checkElementsNotNull(map);
            this.f44619a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagePreviewsRequest$b */
    private static final class C17624b extends ProtoAdapter<GetMessagePreviewsRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, PreviewPair>> f44621a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PreviewPair.ADAPTER);

        C17624b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagePreviewsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessagePreviewsRequest getMessagePreviewsRequest) {
            int i;
            int encodedSizeWithTag = this.f44621a.encodedSizeWithTag(1, getMessagePreviewsRequest.message_preview_map);
            if (getMessagePreviewsRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, getMessagePreviewsRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getMessagePreviewsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessagePreviewsRequest decode(ProtoReader protoReader) throws IOException {
            C17623a aVar = new C17623a();
            aVar.f44620b = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44619a.putAll(this.f44621a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44620b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessagePreviewsRequest getMessagePreviewsRequest) throws IOException {
            this.f44621a.encodeWithTag(protoWriter, 1, getMessagePreviewsRequest.message_preview_map);
            if (getMessagePreviewsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, getMessagePreviewsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getMessagePreviewsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17623a newBuilder() {
        C17623a aVar = new C17623a();
        aVar.f44619a = Internal.copyOf("message_preview_map", this.message_preview_map);
        aVar.f44620b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessagePreviewsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_preview_map.isEmpty()) {
            sb.append(", message_preview_map=");
            sb.append(this.message_preview_map);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessagePreviewsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessagePreviewsRequest(Map<String, PreviewPair> map, SyncDataStrategy syncDataStrategy) {
        this(map, syncDataStrategy, ByteString.EMPTY);
    }

    public GetMessagePreviewsRequest(Map<String, PreviewPair> map, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_preview_map = Internal.immutableCopyOf("message_preview_map", map);
        this.sync_data_strategy = syncDataStrategy;
    }
}
