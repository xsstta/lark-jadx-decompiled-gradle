package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class CreateDocRequest extends Message<CreateDocRequest, C19239a> {
    public static final ProtoAdapter<CreateDocRequest> ADAPTER = new C19240b();
    public static final CreateDocType DEFAULT_CREATE_TYPE = CreateDocType.UNKNOWN;
    public static final CreateDocSource DEFAULT_SOURCE = CreateDocSource.VIDEO_CONFERECNE;
    public static final Doc.Type DEFAULT_TYPE = Doc.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final CreateDocType create_type;
    public final String name;
    public final String parent_token;
    public final CreateDocSource source;
    public final String template_name;
    public final Doc.Type type;

    public enum CreateDocSource implements WireEnum {
        VIDEO_CONFERECNE(19);
        
        public static final ProtoAdapter<CreateDocSource> ADAPTER = ProtoAdapter.newEnumAdapter(CreateDocSource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CreateDocSource fromValue(int i) {
            if (i != 19) {
                return null;
            }
            return VIDEO_CONFERECNE;
        }

        private CreateDocSource(int i) {
            this.value = i;
        }
    }

    public enum CreateDocType implements WireEnum {
        UNKNOWN(0),
        DOC(1),
        SHEET(2),
        BITABLE(7),
        MINDNOTE(10),
        FILE(11),
        SLIDE(14),
        WIKI(15),
        DOCX(21);
        
        public static final ProtoAdapter<CreateDocType> ADAPTER = ProtoAdapter.newEnumAdapter(CreateDocType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CreateDocType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DOC;
            }
            if (i == 2) {
                return SHEET;
            }
            if (i == 7) {
                return BITABLE;
            }
            if (i == 21) {
                return DOCX;
            }
            if (i == 10) {
                return MINDNOTE;
            }
            if (i == 11) {
                return FILE;
            }
            if (i == 14) {
                return SLIDE;
            }
            if (i != 15) {
                return null;
            }
            return WIKI;
        }

        private CreateDocType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocRequest$b */
    private static final class C19240b extends ProtoAdapter<CreateDocRequest> {
        C19240b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDocRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDocRequest createDocRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = Doc.Type.ADAPTER.encodedSizeWithTag(1, createDocRequest.type);
            int i5 = 0;
            if (createDocRequest.parent_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, createDocRequest.parent_token);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (createDocRequest.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, createDocRequest.name);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (createDocRequest.template_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, createDocRequest.template_name);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (createDocRequest.source != null) {
                i4 = CreateDocSource.ADAPTER.encodedSizeWithTag(5, createDocRequest.source);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (createDocRequest.create_type != null) {
                i5 = CreateDocType.ADAPTER.encodedSizeWithTag(6, createDocRequest.create_type);
            }
            return i9 + i5 + createDocRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDocRequest decode(ProtoReader protoReader) throws IOException {
            C19239a aVar = new C19239a();
            aVar.f47412a = Doc.Type.UNKNOWN;
            aVar.f47413b = "";
            aVar.f47414c = "";
            aVar.f47415d = "";
            aVar.f47416e = CreateDocSource.VIDEO_CONFERECNE;
            aVar.f47417f = CreateDocType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f47412a = Doc.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f47413b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47414c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47415d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f47416e = CreateDocSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f47417f = CreateDocType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, CreateDocRequest createDocRequest) throws IOException {
            Doc.Type.ADAPTER.encodeWithTag(protoWriter, 1, createDocRequest.type);
            if (createDocRequest.parent_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createDocRequest.parent_token);
            }
            if (createDocRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createDocRequest.name);
            }
            if (createDocRequest.template_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createDocRequest.template_name);
            }
            if (createDocRequest.source != null) {
                CreateDocSource.ADAPTER.encodeWithTag(protoWriter, 5, createDocRequest.source);
            }
            if (createDocRequest.create_type != null) {
                CreateDocType.ADAPTER.encodeWithTag(protoWriter, 6, createDocRequest.create_type);
            }
            protoWriter.writeBytes(createDocRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocRequest$a */
    public static final class C19239a extends Message.Builder<CreateDocRequest, C19239a> {

        /* renamed from: a */
        public Doc.Type f47412a;

        /* renamed from: b */
        public String f47413b;

        /* renamed from: c */
        public String f47414c;

        /* renamed from: d */
        public String f47415d;

        /* renamed from: e */
        public CreateDocSource f47416e;

        /* renamed from: f */
        public CreateDocType f47417f;

        /* renamed from: a */
        public CreateDocRequest build() {
            Doc.Type type = this.f47412a;
            if (type != null) {
                return new CreateDocRequest(type, this.f47413b, this.f47414c, this.f47415d, this.f47416e, this.f47417f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C19239a mo65666a(Doc.Type type) {
            this.f47412a = type;
            return this;
        }

        /* renamed from: a */
        public C19239a mo65667a(CreateDocSource createDocSource) {
            this.f47416e = createDocSource;
            return this;
        }

        /* renamed from: a */
        public C19239a mo65668a(CreateDocType createDocType) {
            this.f47417f = createDocType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19239a newBuilder() {
        C19239a aVar = new C19239a();
        aVar.f47412a = this.type;
        aVar.f47413b = this.parent_token;
        aVar.f47414c = this.name;
        aVar.f47415d = this.template_name;
        aVar.f47416e = this.source;
        aVar.f47417f = this.create_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CreateDocRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.parent_token != null) {
            sb.append(", parent_token=");
            sb.append(this.parent_token);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.template_name != null) {
            sb.append(", template_name=");
            sb.append(this.template_name);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.create_type != null) {
            sb.append(", create_type=");
            sb.append(this.create_type);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateDocRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDocRequest(Doc.Type type2, String str, String str2, String str3, CreateDocSource createDocSource, CreateDocType createDocType) {
        this(type2, str, str2, str3, createDocSource, createDocType, ByteString.EMPTY);
    }

    public CreateDocRequest(Doc.Type type2, String str, String str2, String str3, CreateDocSource createDocSource, CreateDocType createDocType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.parent_token = str;
        this.name = str2;
        this.template_name = str3;
        this.source = createDocSource;
        this.create_type = createDocType;
    }
}
