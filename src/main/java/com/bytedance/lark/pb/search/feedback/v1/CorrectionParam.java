package com.bytedance.lark.pb.search.feedback.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CorrectionParam extends Message<CorrectionParam, C18743a> {
    public static final ProtoAdapter<CorrectionParam> ADAPTER = new C18744b();
    public static final Scene DEFAULT_SCENE = Scene.IM;
    private static final long serialVersionUID = 0;
    public final String context;
    public final String correction_id;
    public final String matches;
    public final Scene scene;

    public enum Scene implements WireEnum {
        IM(0);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i != 0) {
                return null;
            }
            return IM;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.CorrectionParam$b */
    private static final class C18744b extends ProtoAdapter<CorrectionParam> {
        C18744b() {
            super(FieldEncoding.LENGTH_DELIMITED, CorrectionParam.class);
        }

        /* renamed from: a */
        public int encodedSize(CorrectionParam correctionParam) {
            return Scene.ADAPTER.encodedSizeWithTag(1, correctionParam.scene) + ProtoAdapter.STRING.encodedSizeWithTag(2, correctionParam.context) + ProtoAdapter.STRING.encodedSizeWithTag(3, correctionParam.correction_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, correctionParam.matches) + correctionParam.unknownFields().size();
        }

        /* renamed from: a */
        public CorrectionParam decode(ProtoReader protoReader) throws IOException {
            C18743a aVar = new C18743a();
            aVar.f46287a = Scene.IM;
            aVar.f46288b = "";
            aVar.f46289c = "";
            aVar.f46290d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46287a = Scene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46288b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46289c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46290d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CorrectionParam correctionParam) throws IOException {
            Scene.ADAPTER.encodeWithTag(protoWriter, 1, correctionParam.scene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, correctionParam.context);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, correctionParam.correction_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, correctionParam.matches);
            protoWriter.writeBytes(correctionParam.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18743a newBuilder() {
        C18743a aVar = new C18743a();
        aVar.f46287a = this.scene;
        aVar.f46288b = this.context;
        aVar.f46289c = this.correction_id;
        aVar.f46290d = this.matches;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.CorrectionParam$a */
    public static final class C18743a extends Message.Builder<CorrectionParam, C18743a> {

        /* renamed from: a */
        public Scene f46287a;

        /* renamed from: b */
        public String f46288b;

        /* renamed from: c */
        public String f46289c;

        /* renamed from: d */
        public String f46290d;

        /* renamed from: a */
        public CorrectionParam build() {
            String str;
            String str2;
            String str3;
            Scene scene = this.f46287a;
            if (scene != null && (str = this.f46288b) != null && (str2 = this.f46289c) != null && (str3 = this.f46290d) != null) {
                return new CorrectionParam(scene, str, str2, str3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(scene, "scene", this.f46288b, "context", this.f46289c, "correction_id", this.f46290d, "matches");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "CorrectionParam");
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", correction_id=");
        sb.append(this.correction_id);
        sb.append(", matches=");
        sb.append(this.matches);
        StringBuilder replace = sb.replace(0, 2, "CorrectionParam{");
        replace.append('}');
        return replace.toString();
    }

    public CorrectionParam(Scene scene2, String str, String str2, String str3) {
        this(scene2, str, str2, str3, ByteString.EMPTY);
    }

    public CorrectionParam(Scene scene2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = scene2;
        this.context = str;
        this.correction_id = str2;
        this.matches = str3;
    }
}
