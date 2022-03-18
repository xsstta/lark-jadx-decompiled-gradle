package com.ss.android.lark.pb.url_preview;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullUrlPreviewChattersListResponse extends Message<PullUrlPreviewChattersListResponse, C50178a> {
    public static final ProtoAdapter<PullUrlPreviewChattersListResponse> ADAPTER = new C50179b();
    private static final long serialVersionUID = 0;
    public final List<String> mchatter_ids;

    /* renamed from: com.ss.android.lark.pb.url_preview.PullUrlPreviewChattersListResponse$b */
    private static final class C50179b extends ProtoAdapter<PullUrlPreviewChattersListResponse> {
        C50179b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullUrlPreviewChattersListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullUrlPreviewChattersListResponse pullUrlPreviewChattersListResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pullUrlPreviewChattersListResponse.mchatter_ids) + pullUrlPreviewChattersListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullUrlPreviewChattersListResponse decode(ProtoReader protoReader) throws IOException {
            C50178a aVar = new C50178a();
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
                    aVar.f125374a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullUrlPreviewChattersListResponse pullUrlPreviewChattersListResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pullUrlPreviewChattersListResponse.mchatter_ids);
            protoWriter.writeBytes(pullUrlPreviewChattersListResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.url_preview.PullUrlPreviewChattersListResponse$a */
    public static final class C50178a extends Message.Builder<PullUrlPreviewChattersListResponse, C50178a> {

        /* renamed from: a */
        public List<String> f125374a = Internal.newMutableList();

        /* renamed from: a */
        public PullUrlPreviewChattersListResponse build() {
            return new PullUrlPreviewChattersListResponse(this.f125374a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50178a newBuilder() {
        C50178a aVar = new C50178a();
        aVar.f125374a = Internal.copyOf("mchatter_ids", this.mchatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mchatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.mchatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PullUrlPreviewChattersListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullUrlPreviewChattersListResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PullUrlPreviewChattersListResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchatter_ids = Internal.immutableCopyOf("mchatter_ids", list);
    }
}
