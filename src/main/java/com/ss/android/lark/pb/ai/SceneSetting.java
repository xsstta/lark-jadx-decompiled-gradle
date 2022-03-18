package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SceneSetting extends Message<SceneSetting, C49509a> {
    public static final ProtoAdapter<SceneSetting> ADAPTER = new C49510b();
    public static final Boolean DEFAULT_IS_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mis_enabled;

    /* renamed from: com.ss.android.lark.pb.ai.SceneSetting$b */
    private static final class C49510b extends ProtoAdapter<SceneSetting> {
        C49510b() {
            super(FieldEncoding.LENGTH_DELIMITED, SceneSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(SceneSetting sceneSetting) {
            int i;
            if (sceneSetting.mis_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, sceneSetting.mis_enabled);
            } else {
                i = 0;
            }
            return i + sceneSetting.unknownFields().size();
        }

        /* renamed from: a */
        public SceneSetting decode(ProtoReader protoReader) throws IOException {
            C49509a aVar = new C49509a();
            aVar.f124111a = false;
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
                    aVar.f124111a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SceneSetting sceneSetting) throws IOException {
            if (sceneSetting.mis_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sceneSetting.mis_enabled);
            }
            protoWriter.writeBytes(sceneSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.SceneSetting$a */
    public static final class C49509a extends Message.Builder<SceneSetting, C49509a> {

        /* renamed from: a */
        public Boolean f124111a;

        /* renamed from: a */
        public SceneSetting build() {
            return new SceneSetting(this.f124111a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49509a newBuilder() {
        C49509a aVar = new C49509a();
        aVar.f124111a = this.mis_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mis_enabled != null) {
            sb.append(", is_enabled=");
            sb.append(this.mis_enabled);
        }
        StringBuilder replace = sb.replace(0, 2, "SceneSetting{");
        replace.append('}');
        return replace.toString();
    }

    public SceneSetting(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public SceneSetting(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_enabled = bool;
    }
}
