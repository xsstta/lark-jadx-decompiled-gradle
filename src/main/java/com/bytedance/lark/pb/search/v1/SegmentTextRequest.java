package com.bytedance.lark.pb.search.v1;

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

public final class SegmentTextRequest extends Message<SegmentTextRequest, C18921a> {
    public static final ProtoAdapter<SegmentTextRequest> ADAPTER = new C18922b();
    private static final long serialVersionUID = 0;
    public final List<String> texts;

    /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextRequest$b */
    private static final class C18922b extends ProtoAdapter<SegmentTextRequest> {
        C18922b() {
            super(FieldEncoding.LENGTH_DELIMITED, SegmentTextRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SegmentTextRequest segmentTextRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, segmentTextRequest.texts) + segmentTextRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SegmentTextRequest decode(ProtoReader protoReader) throws IOException {
            C18921a aVar = new C18921a();
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
                    aVar.f46807a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SegmentTextRequest segmentTextRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, segmentTextRequest.texts);
            protoWriter.writeBytes(segmentTextRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextRequest$a */
    public static final class C18921a extends Message.Builder<SegmentTextRequest, C18921a> {

        /* renamed from: a */
        public List<String> f46807a = Internal.newMutableList();

        /* renamed from: a */
        public SegmentTextRequest build() {
            return new SegmentTextRequest(this.f46807a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18921a newBuilder() {
        C18921a aVar = new C18921a();
        aVar.f46807a = Internal.copyOf("texts", this.texts);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SegmentTextRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.texts.isEmpty()) {
            sb.append(", texts=");
            sb.append(this.texts);
        }
        StringBuilder replace = sb.replace(0, 2, "SegmentTextRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SegmentTextRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public SegmentTextRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.texts = Internal.immutableCopyOf("texts", list);
    }
}
