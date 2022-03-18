package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SaveCommentDraftRequest extends Message<SaveCommentDraftRequest, C19625a> {
    public static final ProtoAdapter<SaveCommentDraftRequest> ADAPTER = new C19626b();
    private static final long serialVersionUID = 0;
    public final CreateCommentInfo info;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.SaveCommentDraftRequest$b */
    private static final class C19626b extends ProtoAdapter<SaveCommentDraftRequest> {
        C19626b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveCommentDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveCommentDraftRequest saveCommentDraftRequest) {
            int i;
            int i2 = 0;
            if (saveCommentDraftRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, saveCommentDraftRequest.todo_guid);
            } else {
                i = 0;
            }
            if (saveCommentDraftRequest.info != null) {
                i2 = CreateCommentInfo.ADAPTER.encodedSizeWithTag(2, saveCommentDraftRequest.info);
            }
            return i + i2 + saveCommentDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SaveCommentDraftRequest decode(ProtoReader protoReader) throws IOException {
            C19625a aVar = new C19625a();
            aVar.f47997a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47997a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47998b = CreateCommentInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveCommentDraftRequest saveCommentDraftRequest) throws IOException {
            if (saveCommentDraftRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, saveCommentDraftRequest.todo_guid);
            }
            if (saveCommentDraftRequest.info != null) {
                CreateCommentInfo.ADAPTER.encodeWithTag(protoWriter, 2, saveCommentDraftRequest.info);
            }
            protoWriter.writeBytes(saveCommentDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.SaveCommentDraftRequest$a */
    public static final class C19625a extends Message.Builder<SaveCommentDraftRequest, C19625a> {

        /* renamed from: a */
        public String f47997a;

        /* renamed from: b */
        public CreateCommentInfo f47998b;

        /* renamed from: a */
        public SaveCommentDraftRequest build() {
            return new SaveCommentDraftRequest(this.f47997a, this.f47998b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19625a newBuilder() {
        C19625a aVar = new C19625a();
        aVar.f47997a = this.todo_guid;
        aVar.f47998b = this.info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "SaveCommentDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.info != null) {
            sb.append(", info=");
            sb.append(this.info);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveCommentDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SaveCommentDraftRequest(String str, CreateCommentInfo createCommentInfo) {
        this(str, createCommentInfo, ByteString.EMPTY);
    }

    public SaveCommentDraftRequest(String str, CreateCommentInfo createCommentInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.info = createCommentInfo;
    }
}
