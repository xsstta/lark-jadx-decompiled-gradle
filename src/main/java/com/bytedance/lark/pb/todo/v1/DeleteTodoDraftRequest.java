package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteTodoDraftRequest extends Message<DeleteTodoDraftRequest, C19493a> {
    public static final ProtoAdapter<DeleteTodoDraftRequest> ADAPTER = new C19494b();
    private static final long serialVersionUID = 0;
    public final DraftScene scene;

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteTodoDraftRequest$b */
    private static final class C19494b extends ProtoAdapter<DeleteTodoDraftRequest> {
        C19494b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteTodoDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteTodoDraftRequest deleteTodoDraftRequest) {
            int i;
            if (deleteTodoDraftRequest.scene != null) {
                i = DraftScene.ADAPTER.encodedSizeWithTag(1, deleteTodoDraftRequest.scene);
            } else {
                i = 0;
            }
            return i + deleteTodoDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteTodoDraftRequest decode(ProtoReader protoReader) throws IOException {
            C19493a aVar = new C19493a();
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
                    aVar.f47847a = DraftScene.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteTodoDraftRequest deleteTodoDraftRequest) throws IOException {
            if (deleteTodoDraftRequest.scene != null) {
                DraftScene.ADAPTER.encodeWithTag(protoWriter, 1, deleteTodoDraftRequest.scene);
            }
            protoWriter.writeBytes(deleteTodoDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteTodoDraftRequest$a */
    public static final class C19493a extends Message.Builder<DeleteTodoDraftRequest, C19493a> {

        /* renamed from: a */
        public DraftScene f47847a;

        /* renamed from: a */
        public DeleteTodoDraftRequest build() {
            return new DeleteTodoDraftRequest(this.f47847a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19493a mo66278a(DraftScene draftScene) {
            this.f47847a = draftScene;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19493a newBuilder() {
        C19493a aVar = new C19493a();
        aVar.f47847a = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "DeleteTodoDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteTodoDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteTodoDraftRequest(DraftScene draftScene) {
        this(draftScene, ByteString.EMPTY);
    }

    public DeleteTodoDraftRequest(DraftScene draftScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = draftScene;
    }
}
