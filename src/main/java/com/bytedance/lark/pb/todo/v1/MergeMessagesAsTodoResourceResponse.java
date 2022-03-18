package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MergeMessagesAsTodoResourceResponse extends Message<MergeMessagesAsTodoResourceResponse, C19591a> {
    public static final ProtoAdapter<MergeMessagesAsTodoResourceResponse> ADAPTER = new C19592b();
    private static final long serialVersionUID = 0;
    public final TodoReferResource resource;

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeMessagesAsTodoResourceResponse$b */
    private static final class C19592b extends ProtoAdapter<MergeMessagesAsTodoResourceResponse> {
        C19592b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeMessagesAsTodoResourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeMessagesAsTodoResourceResponse mergeMessagesAsTodoResourceResponse) {
            int i;
            if (mergeMessagesAsTodoResourceResponse.resource != null) {
                i = TodoReferResource.ADAPTER.encodedSizeWithTag(1, mergeMessagesAsTodoResourceResponse.resource);
            } else {
                i = 0;
            }
            return i + mergeMessagesAsTodoResourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MergeMessagesAsTodoResourceResponse decode(ProtoReader protoReader) throws IOException {
            C19591a aVar = new C19591a();
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
                    aVar.f47943a = TodoReferResource.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MergeMessagesAsTodoResourceResponse mergeMessagesAsTodoResourceResponse) throws IOException {
            if (mergeMessagesAsTodoResourceResponse.resource != null) {
                TodoReferResource.ADAPTER.encodeWithTag(protoWriter, 1, mergeMessagesAsTodoResourceResponse.resource);
            }
            protoWriter.writeBytes(mergeMessagesAsTodoResourceResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeMessagesAsTodoResourceResponse$a */
    public static final class C19591a extends Message.Builder<MergeMessagesAsTodoResourceResponse, C19591a> {

        /* renamed from: a */
        public TodoReferResource f47943a;

        /* renamed from: a */
        public MergeMessagesAsTodoResourceResponse build() {
            return new MergeMessagesAsTodoResourceResponse(this.f47943a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19591a newBuilder() {
        C19591a aVar = new C19591a();
        aVar.f47943a = this.resource;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MergeMessagesAsTodoResourceResponse");
        StringBuilder sb = new StringBuilder();
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeMessagesAsTodoResourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MergeMessagesAsTodoResourceResponse(TodoReferResource todoReferResource) {
        this(todoReferResource, ByteString.EMPTY);
    }

    public MergeMessagesAsTodoResourceResponse(TodoReferResource todoReferResource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource = todoReferResource;
    }
}
