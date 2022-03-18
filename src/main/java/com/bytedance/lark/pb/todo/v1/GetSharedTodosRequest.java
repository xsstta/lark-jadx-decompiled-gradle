package com.bytedance.lark.pb.todo.v1;

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

public final class GetSharedTodosRequest extends Message<GetSharedTodosRequest, C19531a> {
    public static final ProtoAdapter<GetSharedTodosRequest> ADAPTER = new C19532b();
    private static final long serialVersionUID = 0;
    public final AuthScene auth_scene;
    public final List<String> guids;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetSharedTodosRequest$b */
    private static final class C19532b extends ProtoAdapter<GetSharedTodosRequest> {
        C19532b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSharedTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSharedTodosRequest getSharedTodosRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getSharedTodosRequest.guids);
            if (getSharedTodosRequest.auth_scene != null) {
                i = AuthScene.ADAPTER.encodedSizeWithTag(2, getSharedTodosRequest.auth_scene);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getSharedTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSharedTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19531a aVar = new C19531a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47889a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47890b = AuthScene.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSharedTodosRequest getSharedTodosRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getSharedTodosRequest.guids);
            if (getSharedTodosRequest.auth_scene != null) {
                AuthScene.ADAPTER.encodeWithTag(protoWriter, 2, getSharedTodosRequest.auth_scene);
            }
            protoWriter.writeBytes(getSharedTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetSharedTodosRequest$a */
    public static final class C19531a extends Message.Builder<GetSharedTodosRequest, C19531a> {

        /* renamed from: a */
        public List<String> f47889a = Internal.newMutableList();

        /* renamed from: b */
        public AuthScene f47890b;

        /* renamed from: a */
        public GetSharedTodosRequest build() {
            return new GetSharedTodosRequest(this.f47889a, this.f47890b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19531a mo66372a(AuthScene authScene) {
            this.f47890b = authScene;
            return this;
        }

        /* renamed from: a */
        public C19531a mo66373a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47889a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19531a newBuilder() {
        C19531a aVar = new C19531a();
        aVar.f47889a = Internal.copyOf("guids", this.guids);
        aVar.f47890b = this.auth_scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetSharedTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.guids.isEmpty()) {
            sb.append(", guids=");
            sb.append(this.guids);
        }
        if (this.auth_scene != null) {
            sb.append(", auth_scene=");
            sb.append(this.auth_scene);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSharedTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSharedTodosRequest(List<String> list, AuthScene authScene) {
        this(list, authScene, ByteString.EMPTY);
    }

    public GetSharedTodosRequest(List<String> list, AuthScene authScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guids = Internal.immutableCopyOf("guids", list);
        this.auth_scene = authScene;
    }
}
