package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetEnterpriseTopicRequest extends Message<GetEnterpriseTopicRequest, C0057a> {
    public static final ProtoAdapter<GetEnterpriseTopicRequest> ADAPTER = new C0058b();
    public static final Scene DEFAULT_SCENE = Scene.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String abbr_id;
    public final String locale;
    public final String query;
    public final Scene scene;

    public enum Scene implements WireEnum {
        UNKNOWN(0),
        MESSENGER(1),
        EMAIL(2),
        DOCS(3);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MESSENGER;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i != 3) {
                return null;
            }
            return DOCS;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: ai.v1.GetEnterpriseTopicRequest$b */
    private static final class C0058b extends ProtoAdapter<GetEnterpriseTopicRequest> {
        C0058b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEnterpriseTopicRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEnterpriseTopicRequest getEnterpriseTopicRequest) {
            int i;
            int encodedSizeWithTag = Scene.ADAPTER.encodedSizeWithTag(1, getEnterpriseTopicRequest.scene) + ProtoAdapter.STRING.encodedSizeWithTag(2, getEnterpriseTopicRequest.query);
            int i2 = 0;
            if (getEnterpriseTopicRequest.locale != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getEnterpriseTopicRequest.locale);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getEnterpriseTopicRequest.abbr_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, getEnterpriseTopicRequest.abbr_id);
            }
            return i3 + i2 + getEnterpriseTopicRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetEnterpriseTopicRequest decode(ProtoReader protoReader) throws IOException {
            C0057a aVar = new C0057a();
            aVar.f97a = Scene.UNKNOWN;
            aVar.f98b = "";
            aVar.f99c = "";
            aVar.f100d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f97a = Scene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f98b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f99c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f100d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEnterpriseTopicRequest getEnterpriseTopicRequest) throws IOException {
            Scene.ADAPTER.encodeWithTag(protoWriter, 1, getEnterpriseTopicRequest.scene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getEnterpriseTopicRequest.query);
            if (getEnterpriseTopicRequest.locale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getEnterpriseTopicRequest.locale);
            }
            if (getEnterpriseTopicRequest.abbr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getEnterpriseTopicRequest.abbr_id);
            }
            protoWriter.writeBytes(getEnterpriseTopicRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0057a newBuilder() {
        C0057a aVar = new C0057a();
        aVar.f97a = this.scene;
        aVar.f98b = this.query;
        aVar.f99c = this.locale;
        aVar.f100d = this.abbr_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: ai.v1.GetEnterpriseTopicRequest$a */
    public static final class C0057a extends Message.Builder<GetEnterpriseTopicRequest, C0057a> {

        /* renamed from: a */
        public Scene f97a;

        /* renamed from: b */
        public String f98b;

        /* renamed from: c */
        public String f99c;

        /* renamed from: d */
        public String f100d;

        /* renamed from: a */
        public GetEnterpriseTopicRequest build() {
            String str;
            Scene scene = this.f97a;
            if (scene != null && (str = this.f98b) != null) {
                return new GetEnterpriseTopicRequest(scene, str, this.f99c, this.f100d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(scene, "scene", this.f98b, SearchIntents.EXTRA_QUERY);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetEnterpriseTopicRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", query=");
        sb.append(this.query);
        if (this.locale != null) {
            sb.append(", locale=");
            sb.append(this.locale);
        }
        if (this.abbr_id != null) {
            sb.append(", abbr_id=");
            sb.append(this.abbr_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEnterpriseTopicRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetEnterpriseTopicRequest(Scene scene2, String str, String str2, String str3) {
        this(scene2, str, str2, str3, ByteString.EMPTY);
    }

    public GetEnterpriseTopicRequest(Scene scene2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = scene2;
        this.query = str;
        this.locale = str2;
        this.abbr_id = str3;
    }
}
