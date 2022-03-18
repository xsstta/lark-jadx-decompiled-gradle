package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FollowTodoRequest extends Message<FollowTodoRequest, C19501a> {
    public static final ProtoAdapter<FollowTodoRequest> ADAPTER = new C19502b();
    public static final Boolean DEFAULT_IS_FOLLOW = false;
    private static final long serialVersionUID = 0;
    public final AuthScene auth_scene;
    public final Boolean is_follow;
    public final String message_id;
    public final String todo_guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.FollowTodoRequest$b */
    private static final class C19502b extends ProtoAdapter<FollowTodoRequest> {
        C19502b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowTodoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowTodoRequest followTodoRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (followTodoRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, followTodoRequest.todo_guid);
            } else {
                i = 0;
            }
            if (followTodoRequest.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, followTodoRequest.message_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (followTodoRequest.is_follow != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, followTodoRequest.is_follow);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (followTodoRequest.auth_scene != null) {
                i4 = AuthScene.ADAPTER.encodedSizeWithTag(4, followTodoRequest.auth_scene);
            }
            return i6 + i4 + followTodoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FollowTodoRequest decode(ProtoReader protoReader) throws IOException {
            C19501a aVar = new C19501a();
            aVar.f47853a = "";
            aVar.f47854b = "";
            aVar.f47855c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47853a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47854b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47855c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47856d = AuthScene.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowTodoRequest followTodoRequest) throws IOException {
            if (followTodoRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followTodoRequest.todo_guid);
            }
            if (followTodoRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followTodoRequest.message_id);
            }
            if (followTodoRequest.is_follow != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, followTodoRequest.is_follow);
            }
            if (followTodoRequest.auth_scene != null) {
                AuthScene.ADAPTER.encodeWithTag(protoWriter, 4, followTodoRequest.auth_scene);
            }
            protoWriter.writeBytes(followTodoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.FollowTodoRequest$a */
    public static final class C19501a extends Message.Builder<FollowTodoRequest, C19501a> {

        /* renamed from: a */
        public String f47853a;

        /* renamed from: b */
        public String f47854b;

        /* renamed from: c */
        public Boolean f47855c;

        /* renamed from: d */
        public AuthScene f47856d;

        /* renamed from: a */
        public FollowTodoRequest build() {
            return new FollowTodoRequest(this.f47853a, this.f47854b, this.f47855c, this.f47856d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19501a mo66298a(AuthScene authScene) {
            this.f47856d = authScene;
            return this;
        }

        /* renamed from: a */
        public C19501a mo66299a(Boolean bool) {
            this.f47855c = bool;
            return this;
        }

        /* renamed from: a */
        public C19501a mo66300a(String str) {
            this.f47853a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19501a newBuilder() {
        C19501a aVar = new C19501a();
        aVar.f47853a = this.todo_guid;
        aVar.f47854b = this.message_id;
        aVar.f47855c = this.is_follow;
        aVar.f47856d = this.auth_scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "FollowTodoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.is_follow != null) {
            sb.append(", is_follow=");
            sb.append(this.is_follow);
        }
        if (this.auth_scene != null) {
            sb.append(", auth_scene=");
            sb.append(this.auth_scene);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowTodoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FollowTodoRequest(String str, String str2, Boolean bool, AuthScene authScene) {
        this(str, str2, bool, authScene, ByteString.EMPTY);
    }

    public FollowTodoRequest(String str, String str2, Boolean bool, AuthScene authScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.message_id = str2;
        this.is_follow = bool;
        this.auth_scene = authScene;
    }
}
