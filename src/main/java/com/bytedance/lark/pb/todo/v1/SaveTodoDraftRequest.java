package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SaveTodoDraftRequest extends Message<SaveTodoDraftRequest, C19627a> {
    public static final ProtoAdapter<SaveTodoDraftRequest> ADAPTER = new C19628b();
    private static final long serialVersionUID = 0;
    public final DraftScene scene;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.SaveTodoDraftRequest$b */
    private static final class C19628b extends ProtoAdapter<SaveTodoDraftRequest> {
        C19628b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveTodoDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveTodoDraftRequest saveTodoDraftRequest) {
            int i;
            int i2 = 0;
            if (saveTodoDraftRequest.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, saveTodoDraftRequest.todo);
            } else {
                i = 0;
            }
            if (saveTodoDraftRequest.scene != null) {
                i2 = DraftScene.ADAPTER.encodedSizeWithTag(2, saveTodoDraftRequest.scene);
            }
            return i + i2 + saveTodoDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SaveTodoDraftRequest decode(ProtoReader protoReader) throws IOException {
            C19627a aVar = new C19627a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47999a = Todo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48000b = DraftScene.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveTodoDraftRequest saveTodoDraftRequest) throws IOException {
            if (saveTodoDraftRequest.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, saveTodoDraftRequest.todo);
            }
            if (saveTodoDraftRequest.scene != null) {
                DraftScene.ADAPTER.encodeWithTag(protoWriter, 2, saveTodoDraftRequest.scene);
            }
            protoWriter.writeBytes(saveTodoDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.SaveTodoDraftRequest$a */
    public static final class C19627a extends Message.Builder<SaveTodoDraftRequest, C19627a> {

        /* renamed from: a */
        public Todo f47999a;

        /* renamed from: b */
        public DraftScene f48000b;

        /* renamed from: a */
        public SaveTodoDraftRequest build() {
            return new SaveTodoDraftRequest(this.f47999a, this.f48000b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19627a mo66596a(DraftScene draftScene) {
            this.f48000b = draftScene;
            return this;
        }

        /* renamed from: a */
        public C19627a mo66597a(Todo todo) {
            this.f47999a = todo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19627a newBuilder() {
        C19627a aVar = new C19627a();
        aVar.f47999a = this.todo;
        aVar.f48000b = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "SaveTodoDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveTodoDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SaveTodoDraftRequest(Todo todo2, DraftScene draftScene) {
        this(todo2, draftScene, ByteString.EMPTY);
    }

    public SaveTodoDraftRequest(Todo todo2, DraftScene draftScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
        this.scene = draftScene;
    }
}
