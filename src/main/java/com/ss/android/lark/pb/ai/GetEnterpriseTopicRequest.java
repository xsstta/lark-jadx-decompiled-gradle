package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetEnterpriseTopicRequest extends Message<GetEnterpriseTopicRequest, C49471a> {
    public static final ProtoAdapter<GetEnterpriseTopicRequest> ADAPTER = new C49472b();
    private static final long serialVersionUID = 0;
    public final String mabbr_id;
    public final String mlocale;
    public final Method mmethod;
    public final String mquery;
    public final Scene mscene;

    public enum Method implements WireEnum {
        CLICK(0),
        QUERY(1);
        
        public static final ProtoAdapter<Method> ADAPTER = ProtoAdapter.newEnumAdapter(Method.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Method fromValue(int i) {
            if (i == 0) {
                return CLICK;
            }
            if (i != 1) {
                return null;
            }
            return QUERY;
        }

        private Method(int i) {
            this.value = i;
        }
    }

    public enum Scene implements WireEnum {
        UNKNOWN(0),
        MESSENGER(1),
        EMAIL(2),
        DOCS(3),
        BROWSER(4),
        VC(5),
        SEARCH(6);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return MESSENGER;
                case 2:
                    return EMAIL;
                case 3:
                    return DOCS;
                case 4:
                    return BROWSER;
                case 5:
                    return VC;
                case 6:
                    return SEARCH;
                default:
                    return null;
            }
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$b */
    private static final class C49472b extends ProtoAdapter<GetEnterpriseTopicRequest> {
        C49472b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEnterpriseTopicRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEnterpriseTopicRequest getEnterpriseTopicRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = Scene.ADAPTER.encodedSizeWithTag(1, getEnterpriseTopicRequest.mscene) + ProtoAdapter.STRING.encodedSizeWithTag(2, getEnterpriseTopicRequest.mquery);
            int i3 = 0;
            if (getEnterpriseTopicRequest.mlocale != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getEnterpriseTopicRequest.mlocale);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getEnterpriseTopicRequest.mabbr_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, getEnterpriseTopicRequest.mabbr_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getEnterpriseTopicRequest.mmethod != null) {
                i3 = Method.ADAPTER.encodedSizeWithTag(5, getEnterpriseTopicRequest.mmethod);
            }
            return i5 + i3 + getEnterpriseTopicRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetEnterpriseTopicRequest decode(ProtoReader protoReader) throws IOException {
            C49471a aVar = new C49471a();
            aVar.f124062b = "";
            aVar.f124063c = "";
            aVar.f124064d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124061a = Scene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124062b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124063c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124064d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124065e = Method.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEnterpriseTopicRequest getEnterpriseTopicRequest) throws IOException {
            Scene.ADAPTER.encodeWithTag(protoWriter, 1, getEnterpriseTopicRequest.mscene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getEnterpriseTopicRequest.mquery);
            if (getEnterpriseTopicRequest.mlocale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getEnterpriseTopicRequest.mlocale);
            }
            if (getEnterpriseTopicRequest.mabbr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getEnterpriseTopicRequest.mabbr_id);
            }
            if (getEnterpriseTopicRequest.mmethod != null) {
                Method.ADAPTER.encodeWithTag(protoWriter, 5, getEnterpriseTopicRequest.mmethod);
            }
            protoWriter.writeBytes(getEnterpriseTopicRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$a */
    public static final class C49471a extends Message.Builder<GetEnterpriseTopicRequest, C49471a> {

        /* renamed from: a */
        public Scene f124061a;

        /* renamed from: b */
        public String f124062b;

        /* renamed from: c */
        public String f124063c;

        /* renamed from: d */
        public String f124064d;

        /* renamed from: e */
        public Method f124065e;

        /* renamed from: a */
        public GetEnterpriseTopicRequest build() {
            String str;
            Scene scene = this.f124061a;
            if (scene != null && (str = this.f124062b) != null) {
                return new GetEnterpriseTopicRequest(scene, str, this.f124063c, this.f124064d, this.f124065e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(scene, "mscene", this.f124062b, "mquery");
        }

        /* renamed from: a */
        public C49471a mo172602a(Method method) {
            this.f124065e = method;
            return this;
        }

        /* renamed from: b */
        public C49471a mo172606b(String str) {
            this.f124063c = str;
            return this;
        }

        /* renamed from: c */
        public C49471a mo172607c(String str) {
            this.f124064d = str;
            return this;
        }

        /* renamed from: a */
        public C49471a mo172603a(Scene scene) {
            this.f124061a = scene;
            return this;
        }

        /* renamed from: a */
        public C49471a mo172604a(String str) {
            this.f124062b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49471a newBuilder() {
        C49471a aVar = new C49471a();
        aVar.f124061a = this.mscene;
        aVar.f124062b = this.mquery;
        aVar.f124063c = this.mlocale;
        aVar.f124064d = this.mabbr_id;
        aVar.f124065e = this.mmethod;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.mscene);
        sb.append(", query=");
        sb.append(this.mquery);
        if (this.mlocale != null) {
            sb.append(", locale=");
            sb.append(this.mlocale);
        }
        if (this.mabbr_id != null) {
            sb.append(", abbr_id=");
            sb.append(this.mabbr_id);
        }
        if (this.mmethod != null) {
            sb.append(", method=");
            sb.append(this.mmethod);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEnterpriseTopicRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetEnterpriseTopicRequest(Scene scene, String str, String str2, String str3, Method method) {
        this(scene, str, str2, str3, method, ByteString.EMPTY);
    }

    public GetEnterpriseTopicRequest(Scene scene, String str, String str2, String str3, Method method, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mscene = scene;
        this.mquery = str;
        this.mlocale = str2;
        this.mabbr_id = str3;
        this.mmethod = method;
    }
}
