package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCollaborationStructureResponse extends Message<GetCollaborationStructureResponse, C16214a> {
    public static final ProtoAdapter<GetCollaborationStructureResponse> ADAPTER = new C16215b();
    public static final Boolean DEFAULT_SHOW_DEPARTMENT_COUNT = false;
    private static final long serialVersionUID = 0;
    public final CollaborationDepartmentStructure department_structure;
    public final CollaborationExtendFields extend_fields;
    public final Boolean show_department_count;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationStructureResponse$b */
    private static final class C16215b extends ProtoAdapter<GetCollaborationStructureResponse> {
        C16215b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCollaborationStructureResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCollaborationStructureResponse getCollaborationStructureResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getCollaborationStructureResponse.department_structure != null) {
                i = CollaborationDepartmentStructure.ADAPTER.encodedSizeWithTag(1, getCollaborationStructureResponse.department_structure);
            } else {
                i = 0;
            }
            if (getCollaborationStructureResponse.extend_fields != null) {
                i2 = CollaborationExtendFields.ADAPTER.encodedSizeWithTag(2, getCollaborationStructureResponse.extend_fields);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getCollaborationStructureResponse.show_department_count != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getCollaborationStructureResponse.show_department_count);
            }
            return i4 + i3 + getCollaborationStructureResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCollaborationStructureResponse decode(ProtoReader protoReader) throws IOException {
            C16214a aVar = new C16214a();
            aVar.f42388c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42386a = CollaborationDepartmentStructure.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42387b = CollaborationExtendFields.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42388c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCollaborationStructureResponse getCollaborationStructureResponse) throws IOException {
            if (getCollaborationStructureResponse.department_structure != null) {
                CollaborationDepartmentStructure.ADAPTER.encodeWithTag(protoWriter, 1, getCollaborationStructureResponse.department_structure);
            }
            if (getCollaborationStructureResponse.extend_fields != null) {
                CollaborationExtendFields.ADAPTER.encodeWithTag(protoWriter, 2, getCollaborationStructureResponse.extend_fields);
            }
            if (getCollaborationStructureResponse.show_department_count != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getCollaborationStructureResponse.show_department_count);
            }
            protoWriter.writeBytes(getCollaborationStructureResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationStructureResponse$a */
    public static final class C16214a extends Message.Builder<GetCollaborationStructureResponse, C16214a> {

        /* renamed from: a */
        public CollaborationDepartmentStructure f42386a;

        /* renamed from: b */
        public CollaborationExtendFields f42387b;

        /* renamed from: c */
        public Boolean f42388c;

        /* renamed from: a */
        public GetCollaborationStructureResponse build() {
            return new GetCollaborationStructureResponse(this.f42386a, this.f42387b, this.f42388c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16214a newBuilder() {
        C16214a aVar = new C16214a();
        aVar.f42386a = this.department_structure;
        aVar.f42387b = this.extend_fields;
        aVar.f42388c = this.show_department_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetCollaborationStructureResponse");
        StringBuilder sb = new StringBuilder();
        if (this.department_structure != null) {
            sb.append(", department_structure=");
            sb.append(this.department_structure);
        }
        if (this.extend_fields != null) {
            sb.append(", extend_fields=");
            sb.append(this.extend_fields);
        }
        if (this.show_department_count != null) {
            sb.append(", show_department_count=");
            sb.append(this.show_department_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCollaborationStructureResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCollaborationStructureResponse(CollaborationDepartmentStructure collaborationDepartmentStructure, CollaborationExtendFields collaborationExtendFields, Boolean bool) {
        this(collaborationDepartmentStructure, collaborationExtendFields, bool, ByteString.EMPTY);
    }

    public GetCollaborationStructureResponse(CollaborationDepartmentStructure collaborationDepartmentStructure, CollaborationExtendFields collaborationExtendFields, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_structure = collaborationDepartmentStructure;
        this.extend_fields = collaborationExtendFields;
        this.show_department_count = bool;
    }
}
