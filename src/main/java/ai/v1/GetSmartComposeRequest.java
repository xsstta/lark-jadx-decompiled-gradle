package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetSmartComposeRequest extends Message<GetSmartComposeRequest, C0061a> {
    public static final ProtoAdapter<GetSmartComposeRequest> ADAPTER = new C0062b();
    public static final Scene DEFAULT_SCENE = Scene.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String context;
    public final List<ContextItem> context_v2;
    public final String hidden_state;
    public final String locale;
    public final ClientMessengerContext messenger_context;
    public final String prefix;
    public final Scene scene;
    public final String scene_info;

    public enum Scene implements WireEnum {
        UNKNOWN(0),
        MESSENGER(1);
        
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
            if (i != 1) {
                return null;
            }
            return MESSENGER;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: ai.v1.GetSmartComposeRequest$b */
    private static final class C0062b extends ProtoAdapter<GetSmartComposeRequest> {
        C0062b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartComposeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartComposeRequest getSmartComposeRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = Scene.ADAPTER.encodedSizeWithTag(1, getSmartComposeRequest.scene) + ProtoAdapter.STRING.encodedSizeWithTag(2, getSmartComposeRequest.prefix);
            int i5 = 0;
            if (getSmartComposeRequest.context != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getSmartComposeRequest.context);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (getSmartComposeRequest.locale != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, getSmartComposeRequest.locale);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (getSmartComposeRequest.hidden_state != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, getSmartComposeRequest.hidden_state);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getSmartComposeRequest.scene_info != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, getSmartComposeRequest.scene_info);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i8 + i4 + ContextItem.ADAPTER.asRepeated().encodedSizeWithTag(7, getSmartComposeRequest.context_v2);
            if (getSmartComposeRequest.messenger_context != null) {
                i5 = ClientMessengerContext.ADAPTER.encodedSizeWithTag(8, getSmartComposeRequest.messenger_context);
            }
            return encodedSizeWithTag2 + i5 + getSmartComposeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartComposeRequest decode(ProtoReader protoReader) throws IOException {
            C0061a aVar = new C0061a();
            aVar.f102a = Scene.UNKNOWN;
            aVar.f103b = "";
            aVar.f104c = "";
            aVar.f105d = "";
            aVar.f106e = "";
            aVar.f107f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f102a = Scene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f103b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f104c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f105d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f106e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f107f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f108g.add(ContextItem.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f109h = ClientMessengerContext.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSmartComposeRequest getSmartComposeRequest) throws IOException {
            Scene.ADAPTER.encodeWithTag(protoWriter, 1, getSmartComposeRequest.scene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSmartComposeRequest.prefix);
            if (getSmartComposeRequest.context != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getSmartComposeRequest.context);
            }
            if (getSmartComposeRequest.locale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getSmartComposeRequest.locale);
            }
            if (getSmartComposeRequest.hidden_state != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getSmartComposeRequest.hidden_state);
            }
            if (getSmartComposeRequest.scene_info != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getSmartComposeRequest.scene_info);
            }
            ContextItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, getSmartComposeRequest.context_v2);
            if (getSmartComposeRequest.messenger_context != null) {
                ClientMessengerContext.ADAPTER.encodeWithTag(protoWriter, 8, getSmartComposeRequest.messenger_context);
            }
            protoWriter.writeBytes(getSmartComposeRequest.unknownFields());
        }
    }

    /* renamed from: ai.v1.GetSmartComposeRequest$a */
    public static final class C0061a extends Message.Builder<GetSmartComposeRequest, C0061a> {

        /* renamed from: a */
        public Scene f102a;

        /* renamed from: b */
        public String f103b;

        /* renamed from: c */
        public String f104c;

        /* renamed from: d */
        public String f105d;

        /* renamed from: e */
        public String f106e;

        /* renamed from: f */
        public String f107f;

        /* renamed from: g */
        public List<ContextItem> f108g = Internal.newMutableList();

        /* renamed from: h */
        public ClientMessengerContext f109h;

        /* renamed from: a */
        public GetSmartComposeRequest build() {
            String str;
            Scene scene = this.f102a;
            if (scene != null && (str = this.f103b) != null) {
                return new GetSmartComposeRequest(scene, str, this.f104c, this.f105d, this.f106e, this.f107f, this.f108g, this.f109h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(scene, "scene", this.f103b, "prefix");
        }

        /* renamed from: a */
        public C0061a mo94a(ClientMessengerContext clientMessengerContext) {
            this.f109h = clientMessengerContext;
            return this;
        }

        /* renamed from: b */
        public C0061a mo98b(String str) {
            this.f105d = str;
            return this;
        }

        /* renamed from: a */
        public C0061a mo95a(Scene scene) {
            this.f102a = scene;
            return this;
        }

        /* renamed from: a */
        public C0061a mo96a(String str) {
            this.f103b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C0061a newBuilder() {
        C0061a aVar = new C0061a();
        aVar.f102a = this.scene;
        aVar.f103b = this.prefix;
        aVar.f104c = this.context;
        aVar.f105d = this.locale;
        aVar.f106e = this.hidden_state;
        aVar.f107f = this.scene_info;
        aVar.f108g = Internal.copyOf("context_v2", this.context_v2);
        aVar.f109h = this.messenger_context;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetSmartComposeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", prefix=");
        sb.append(this.prefix);
        if (this.context != null) {
            sb.append(", context=");
            sb.append(this.context);
        }
        if (this.locale != null) {
            sb.append(", locale=");
            sb.append(this.locale);
        }
        if (this.hidden_state != null) {
            sb.append(", hidden_state=");
            sb.append(this.hidden_state);
        }
        if (this.scene_info != null) {
            sb.append(", scene_info=");
            sb.append(this.scene_info);
        }
        if (!this.context_v2.isEmpty()) {
            sb.append(", context_v2=");
            sb.append(this.context_v2);
        }
        if (this.messenger_context != null) {
            sb.append(", messenger_context=");
            sb.append(this.messenger_context);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSmartComposeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartComposeRequest(Scene scene2, String str, String str2, String str3, String str4, String str5, List<ContextItem> list, ClientMessengerContext clientMessengerContext) {
        this(scene2, str, str2, str3, str4, str5, list, clientMessengerContext, ByteString.EMPTY);
    }

    public GetSmartComposeRequest(Scene scene2, String str, String str2, String str3, String str4, String str5, List<ContextItem> list, ClientMessengerContext clientMessengerContext, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = scene2;
        this.prefix = str;
        this.context = str2;
        this.locale = str3;
        this.hidden_state = str4;
        this.scene_info = str5;
        this.context_v2 = Internal.immutableCopyOf("context_v2", list);
        this.messenger_context = clientMessengerContext;
    }
}
