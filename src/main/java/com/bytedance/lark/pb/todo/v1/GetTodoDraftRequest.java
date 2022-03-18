package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoDraftRequest extends Message<GetTodoDraftRequest, C19543a> {
    public static final ProtoAdapter<GetTodoDraftRequest> ADAPTER = new C19544b();
    private static final long serialVersionUID = 0;
    public final DraftScene scene;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoDraftRequest$b */
    private static final class C19544b extends ProtoAdapter<GetTodoDraftRequest> {
        C19544b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoDraftRequest getTodoDraftRequest) {
            int i;
            if (getTodoDraftRequest.scene != null) {
                i = DraftScene.ADAPTER.encodedSizeWithTag(1, getTodoDraftRequest.scene);
            } else {
                i = 0;
            }
            return i + getTodoDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoDraftRequest decode(ProtoReader protoReader) throws IOException {
            C19543a aVar = new C19543a();
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
                    aVar.f47895a = DraftScene.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoDraftRequest getTodoDraftRequest) throws IOException {
            if (getTodoDraftRequest.scene != null) {
                DraftScene.ADAPTER.encodeWithTag(protoWriter, 1, getTodoDraftRequest.scene);
            }
            protoWriter.writeBytes(getTodoDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoDraftRequest$a */
    public static final class C19543a extends Message.Builder<GetTodoDraftRequest, C19543a> {

        /* renamed from: a */
        public DraftScene f47895a;

        /* renamed from: a */
        public GetTodoDraftRequest build() {
            return new GetTodoDraftRequest(this.f47895a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19543a mo66399a(DraftScene draftScene) {
            this.f47895a = draftScene;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19543a newBuilder() {
        C19543a aVar = new C19543a();
        aVar.f47895a = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoDraftRequest(DraftScene draftScene) {
        this(draftScene, ByteString.EMPTY);
    }

    public GetTodoDraftRequest(DraftScene draftScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = draftScene;
    }
}
