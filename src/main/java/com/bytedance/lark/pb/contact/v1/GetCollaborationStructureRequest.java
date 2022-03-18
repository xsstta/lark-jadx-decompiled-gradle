package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetCollaborationStructureRequest extends Message<GetCollaborationStructureRequest, C16212a> {
    public static final ProtoAdapter<GetCollaborationStructureRequest> ADAPTER = new C16213b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String department_id;
    public final CollaborationExtendParam extend_param;
    public final Integer offset;
    public final String tenant_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationStructureRequest$b */
    private static final class C16213b extends ProtoAdapter<GetCollaborationStructureRequest> {
        C16213b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCollaborationStructureRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCollaborationStructureRequest getCollaborationStructureRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getCollaborationStructureRequest.tenant_id);
            int i4 = 0;
            if (getCollaborationStructureRequest.department_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getCollaborationStructureRequest.department_id);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (getCollaborationStructureRequest.extend_param != null) {
                i2 = CollaborationExtendParam.ADAPTER.encodedSizeWithTag(4, getCollaborationStructureRequest.extend_param);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (getCollaborationStructureRequest.offset != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, getCollaborationStructureRequest.offset);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getCollaborationStructureRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, getCollaborationStructureRequest.count);
            }
            return i7 + i4 + getCollaborationStructureRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCollaborationStructureRequest decode(ProtoReader protoReader) throws IOException {
            C16212a aVar = new C16212a();
            aVar.f42381a = "";
            aVar.f42382b = "";
            aVar.f42384d = 0;
            aVar.f42385e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42381a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42382b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42383c = CollaborationExtendParam.ADAPTER.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f42384d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42385e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCollaborationStructureRequest getCollaborationStructureRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCollaborationStructureRequest.tenant_id);
            if (getCollaborationStructureRequest.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCollaborationStructureRequest.department_id);
            }
            if (getCollaborationStructureRequest.extend_param != null) {
                CollaborationExtendParam.ADAPTER.encodeWithTag(protoWriter, 4, getCollaborationStructureRequest.extend_param);
            }
            if (getCollaborationStructureRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getCollaborationStructureRequest.offset);
            }
            if (getCollaborationStructureRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getCollaborationStructureRequest.count);
            }
            protoWriter.writeBytes(getCollaborationStructureRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationStructureRequest$a */
    public static final class C16212a extends Message.Builder<GetCollaborationStructureRequest, C16212a> {

        /* renamed from: a */
        public String f42381a;

        /* renamed from: b */
        public String f42382b;

        /* renamed from: c */
        public CollaborationExtendParam f42383c;

        /* renamed from: d */
        public Integer f42384d;

        /* renamed from: e */
        public Integer f42385e;

        /* renamed from: a */
        public GetCollaborationStructureRequest build() {
            String str = this.f42381a;
            if (str != null) {
                return new GetCollaborationStructureRequest(str, this.f42382b, this.f42383c, this.f42384d, this.f42385e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "tenant_id");
        }

        /* renamed from: a */
        public C16212a mo58106a(CollaborationExtendParam collaborationExtendParam) {
            this.f42383c = collaborationExtendParam;
            return this;
        }

        /* renamed from: b */
        public C16212a mo58110b(Integer num) {
            this.f42385e = num;
            return this;
        }

        /* renamed from: a */
        public C16212a mo58107a(Integer num) {
            this.f42384d = num;
            return this;
        }

        /* renamed from: b */
        public C16212a mo58111b(String str) {
            this.f42382b = str;
            return this;
        }

        /* renamed from: a */
        public C16212a mo58108a(String str) {
            this.f42381a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16212a newBuilder() {
        C16212a aVar = new C16212a();
        aVar.f42381a = this.tenant_id;
        aVar.f42382b = this.department_id;
        aVar.f42383c = this.extend_param;
        aVar.f42384d = this.offset;
        aVar.f42385e = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetCollaborationStructureRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", tenant_id=");
        sb.append(this.tenant_id);
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.extend_param != null) {
            sb.append(", extend_param=");
            sb.append(this.extend_param);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCollaborationStructureRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCollaborationStructureRequest(String str, String str2, CollaborationExtendParam collaborationExtendParam, Integer num, Integer num2) {
        this(str, str2, collaborationExtendParam, num, num2, ByteString.EMPTY);
    }

    public GetCollaborationStructureRequest(String str, String str2, CollaborationExtendParam collaborationExtendParam, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_id = str;
        this.department_id = str2;
        this.extend_param = collaborationExtendParam;
        this.offset = num;
        this.count = num2;
    }
}
