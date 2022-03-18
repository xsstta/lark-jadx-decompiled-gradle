package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullAllOncallTagsResponse extends Message<PullAllOncallTagsResponse, C17270a> {
    public static final ProtoAdapter<PullAllOncallTagsResponse> ADAPTER = new C17271b();
    private static final long serialVersionUID = 0;
    public final List<OncallTag> tags;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullAllOncallTagsResponse$b */
    private static final class C17271b extends ProtoAdapter<PullAllOncallTagsResponse> {
        C17271b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllOncallTagsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllOncallTagsResponse pullAllOncallTagsResponse) {
            return OncallTag.ADAPTER.asRepeated().encodedSizeWithTag(1, pullAllOncallTagsResponse.tags) + pullAllOncallTagsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllOncallTagsResponse decode(ProtoReader protoReader) throws IOException {
            C17270a aVar = new C17270a();
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
                    aVar.f44099a.add(OncallTag.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAllOncallTagsResponse pullAllOncallTagsResponse) throws IOException {
            OncallTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullAllOncallTagsResponse.tags);
            protoWriter.writeBytes(pullAllOncallTagsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullAllOncallTagsResponse$a */
    public static final class C17270a extends Message.Builder<PullAllOncallTagsResponse, C17270a> {

        /* renamed from: a */
        public List<OncallTag> f44099a = Internal.newMutableList();

        /* renamed from: a */
        public PullAllOncallTagsResponse build() {
            return new PullAllOncallTagsResponse(this.f44099a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17270a newBuilder() {
        C17270a aVar = new C17270a();
        aVar.f44099a = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "PullAllOncallTagsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAllOncallTagsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllOncallTagsResponse(List<OncallTag> list) {
        this(list, ByteString.EMPTY);
    }

    public PullAllOncallTagsResponse(List<OncallTag> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
