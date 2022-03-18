package as_setting;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SceneSetting extends Message<SceneSetting, C1639a> {
    public static final ProtoAdapter<SceneSetting> ADAPTER = new C1640b();
    public static final Boolean DEFAULT_IS_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_enabled;

    /* renamed from: as_setting.SceneSetting$b */
    private static final class C1640b extends ProtoAdapter<SceneSetting> {
        C1640b() {
            super(FieldEncoding.LENGTH_DELIMITED, SceneSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(SceneSetting sceneSetting) {
            int i;
            if (sceneSetting.is_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, sceneSetting.is_enabled);
            } else {
                i = 0;
            }
            return i + sceneSetting.unknownFields().size();
        }

        /* renamed from: a */
        public SceneSetting decode(ProtoReader protoReader) throws IOException {
            C1639a aVar = new C1639a();
            aVar.f5620a = false;
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
                    aVar.f5620a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SceneSetting sceneSetting) throws IOException {
            if (sceneSetting.is_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sceneSetting.is_enabled);
            }
            protoWriter.writeBytes(sceneSetting.unknownFields());
        }
    }

    /* renamed from: as_setting.SceneSetting$a */
    public static final class C1639a extends Message.Builder<SceneSetting, C1639a> {

        /* renamed from: a */
        public Boolean f5620a;

        /* renamed from: a */
        public SceneSetting build() {
            return new SceneSetting(this.f5620a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C1639a newBuilder() {
        C1639a aVar = new C1639a();
        aVar.f5620a = this.is_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "SceneSetting");
        StringBuilder sb = new StringBuilder();
        if (this.is_enabled != null) {
            sb.append(", is_enabled=");
            sb.append(this.is_enabled);
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
        this.is_enabled = bool;
    }
}
