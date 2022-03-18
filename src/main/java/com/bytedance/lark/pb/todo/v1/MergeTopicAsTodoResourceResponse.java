package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MergeTopicAsTodoResourceResponse extends Message<MergeTopicAsTodoResourceResponse, C19595a> {
    public static final ProtoAdapter<MergeTopicAsTodoResourceResponse> ADAPTER = new C19596b();
    private static final long serialVersionUID = 0;
    public final TodoReferResource resource;

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeTopicAsTodoResourceResponse$b */
    private static final class C19596b extends ProtoAdapter<MergeTopicAsTodoResourceResponse> {
        C19596b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeTopicAsTodoResourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeTopicAsTodoResourceResponse mergeTopicAsTodoResourceResponse) {
            int i;
            if (mergeTopicAsTodoResourceResponse.resource != null) {
                i = TodoReferResource.ADAPTER.encodedSizeWithTag(1, mergeTopicAsTodoResourceResponse.resource);
            } else {
                i = 0;
            }
            return i + mergeTopicAsTodoResourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MergeTopicAsTodoResourceResponse decode(ProtoReader protoReader) throws IOException {
            C19595a aVar = new C19595a();
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
                    aVar.f47945a = TodoReferResource.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MergeTopicAsTodoResourceResponse mergeTopicAsTodoResourceResponse) throws IOException {
            if (mergeTopicAsTodoResourceResponse.resource != null) {
                TodoReferResource.ADAPTER.encodeWithTag(protoWriter, 1, mergeTopicAsTodoResourceResponse.resource);
            }
            protoWriter.writeBytes(mergeTopicAsTodoResourceResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeTopicAsTodoResourceResponse$a */
    public static final class C19595a extends Message.Builder<MergeTopicAsTodoResourceResponse, C19595a> {

        /* renamed from: a */
        public TodoReferResource f47945a;

        /* renamed from: a */
        public MergeTopicAsTodoResourceResponse build() {
            return new MergeTopicAsTodoResourceResponse(this.f47945a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19595a newBuilder() {
        C19595a aVar = new C19595a();
        aVar.f47945a = this.resource;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MergeTopicAsTodoResourceResponse");
        StringBuilder sb = new StringBuilder();
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeTopicAsTodoResourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MergeTopicAsTodoResourceResponse(TodoReferResource todoReferResource) {
        this(todoReferResource, ByteString.EMPTY);
    }

    public MergeTopicAsTodoResourceResponse(TodoReferResource todoReferResource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource = todoReferResource;
    }
}
