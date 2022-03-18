package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class DraftScene extends Message<DraftScene, C19499a> {
    public static final ProtoAdapter<DraftScene> ADAPTER = new C19500b();
    public static final Scene DEFAULT_SCENE = Scene.UNKNOWN_SCENE;
    private static final long serialVersionUID = 0;
    public final Scene scene;
    public final String scene_id;

    public enum Scene implements WireEnum {
        UNKNOWN_SCENE(0),
        TODO_CENTER(1),
        CHAT(2),
        CHAT_SIDEBAR(3);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_SCENE;
            }
            if (i == 1) {
                return TODO_CENTER;
            }
            if (i == 2) {
                return CHAT;
            }
            if (i != 3) {
                return null;
            }
            return CHAT_SIDEBAR;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.DraftScene$b */
    private static final class C19500b extends ProtoAdapter<DraftScene> {
        C19500b() {
            super(FieldEncoding.LENGTH_DELIMITED, DraftScene.class);
        }

        /* renamed from: a */
        public int encodedSize(DraftScene draftScene) {
            int i;
            int i2 = 0;
            if (draftScene.scene != null) {
                i = Scene.ADAPTER.encodedSizeWithTag(1, draftScene.scene);
            } else {
                i = 0;
            }
            if (draftScene.scene_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, draftScene.scene_id);
            }
            return i + i2 + draftScene.unknownFields().size();
        }

        /* renamed from: a */
        public DraftScene decode(ProtoReader protoReader) throws IOException {
            C19499a aVar = new C19499a();
            aVar.f47851a = Scene.UNKNOWN_SCENE;
            aVar.f47852b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47851a = Scene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47852b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DraftScene draftScene) throws IOException {
            if (draftScene.scene != null) {
                Scene.ADAPTER.encodeWithTag(protoWriter, 1, draftScene.scene);
            }
            if (draftScene.scene_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, draftScene.scene_id);
            }
            protoWriter.writeBytes(draftScene.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.DraftScene$a */
    public static final class C19499a extends Message.Builder<DraftScene, C19499a> {

        /* renamed from: a */
        public Scene f47851a;

        /* renamed from: b */
        public String f47852b;

        /* renamed from: a */
        public DraftScene build() {
            return new DraftScene(this.f47851a, this.f47852b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19499a mo66292a(Scene scene) {
            this.f47851a = scene;
            return this;
        }

        /* renamed from: a */
        public C19499a mo66293a(String str) {
            this.f47852b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19499a newBuilder() {
        C19499a aVar = new C19499a();
        aVar.f47851a = this.scene;
        aVar.f47852b = this.scene_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "DraftScene");
        StringBuilder sb = new StringBuilder();
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.scene_id != null) {
            sb.append(", scene_id=");
            sb.append(this.scene_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DraftScene{");
        replace.append('}');
        return replace.toString();
    }

    public DraftScene(Scene scene2, String str) {
        this(scene2, str, ByteString.EMPTY);
    }

    public DraftScene(Scene scene2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = scene2;
        this.scene_id = str;
    }
}
