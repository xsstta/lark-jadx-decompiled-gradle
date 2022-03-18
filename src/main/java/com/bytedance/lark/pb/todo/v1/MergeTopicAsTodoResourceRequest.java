package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MergeTopicAsTodoResourceRequest extends Message<MergeTopicAsTodoResourceRequest, C19593a> {
    public static final ProtoAdapter<MergeTopicAsTodoResourceRequest> ADAPTER = new C19594b();
    private static final long serialVersionUID = 0;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeTopicAsTodoResourceRequest$b */
    private static final class C19594b extends ProtoAdapter<MergeTopicAsTodoResourceRequest> {
        C19594b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeTopicAsTodoResourceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeTopicAsTodoResourceRequest mergeTopicAsTodoResourceRequest) {
            int i;
            if (mergeTopicAsTodoResourceRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mergeTopicAsTodoResourceRequest.thread_id);
            } else {
                i = 0;
            }
            return i + mergeTopicAsTodoResourceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MergeTopicAsTodoResourceRequest decode(ProtoReader protoReader) throws IOException {
            C19593a aVar = new C19593a();
            aVar.f47944a = "";
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
                    aVar.f47944a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MergeTopicAsTodoResourceRequest mergeTopicAsTodoResourceRequest) throws IOException {
            if (mergeTopicAsTodoResourceRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mergeTopicAsTodoResourceRequest.thread_id);
            }
            protoWriter.writeBytes(mergeTopicAsTodoResourceRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeTopicAsTodoResourceRequest$a */
    public static final class C19593a extends Message.Builder<MergeTopicAsTodoResourceRequest, C19593a> {

        /* renamed from: a */
        public String f47944a;

        /* renamed from: a */
        public MergeTopicAsTodoResourceRequest build() {
            return new MergeTopicAsTodoResourceRequest(this.f47944a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19593a mo66525a(String str) {
            this.f47944a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19593a newBuilder() {
        C19593a aVar = new C19593a();
        aVar.f47944a = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MergeTopicAsTodoResourceRequest");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeTopicAsTodoResourceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MergeTopicAsTodoResourceRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MergeTopicAsTodoResourceRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
    }
}
