package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCommentDraftRequest extends Message<GetCommentDraftRequest, C19517a> {
    public static final ProtoAdapter<GetCommentDraftRequest> ADAPTER = new C19518b();
    private static final long serialVersionUID = 0;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetCommentDraftRequest$b */
    private static final class C19518b extends ProtoAdapter<GetCommentDraftRequest> {
        C19518b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCommentDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCommentDraftRequest getCommentDraftRequest) {
            int i;
            if (getCommentDraftRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCommentDraftRequest.todo_guid);
            } else {
                i = 0;
            }
            return i + getCommentDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCommentDraftRequest decode(ProtoReader protoReader) throws IOException {
            C19517a aVar = new C19517a();
            aVar.f47869a = "";
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
                    aVar.f47869a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCommentDraftRequest getCommentDraftRequest) throws IOException {
            if (getCommentDraftRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCommentDraftRequest.todo_guid);
            }
            protoWriter.writeBytes(getCommentDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetCommentDraftRequest$a */
    public static final class C19517a extends Message.Builder<GetCommentDraftRequest, C19517a> {

        /* renamed from: a */
        public String f47869a;

        /* renamed from: a */
        public GetCommentDraftRequest build() {
            return new GetCommentDraftRequest(this.f47869a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19517a newBuilder() {
        C19517a aVar = new C19517a();
        aVar.f47869a = this.todo_guid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetCommentDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCommentDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCommentDraftRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetCommentDraftRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
    }
}
