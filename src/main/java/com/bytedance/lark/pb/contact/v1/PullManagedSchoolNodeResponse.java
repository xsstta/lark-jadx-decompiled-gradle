package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullManagedSchoolNodeResponse extends Message<PullManagedSchoolNodeResponse, C16344a> {
    public static final ProtoAdapter<PullManagedSchoolNodeResponse> ADAPTER = new C16345b();
    private static final long serialVersionUID = 0;
    public final List<SchoolNodeWithUpperNodesPath> school_nodes;
    public final SchoolNode superAdminNode;

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullManagedSchoolNodeResponse$b */
    private static final class C16345b extends ProtoAdapter<PullManagedSchoolNodeResponse> {
        C16345b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullManagedSchoolNodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullManagedSchoolNodeResponse pullManagedSchoolNodeResponse) {
            int i;
            int encodedSizeWithTag = SchoolNodeWithUpperNodesPath.ADAPTER.asRepeated().encodedSizeWithTag(1, pullManagedSchoolNodeResponse.school_nodes);
            if (pullManagedSchoolNodeResponse.superAdminNode != null) {
                i = SchoolNode.ADAPTER.encodedSizeWithTag(2, pullManagedSchoolNodeResponse.superAdminNode);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pullManagedSchoolNodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullManagedSchoolNodeResponse decode(ProtoReader protoReader) throws IOException {
            C16344a aVar = new C16344a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42587a.add(SchoolNodeWithUpperNodesPath.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42588b = SchoolNode.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullManagedSchoolNodeResponse pullManagedSchoolNodeResponse) throws IOException {
            SchoolNodeWithUpperNodesPath.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullManagedSchoolNodeResponse.school_nodes);
            if (pullManagedSchoolNodeResponse.superAdminNode != null) {
                SchoolNode.ADAPTER.encodeWithTag(protoWriter, 2, pullManagedSchoolNodeResponse.superAdminNode);
            }
            protoWriter.writeBytes(pullManagedSchoolNodeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullManagedSchoolNodeResponse$a */
    public static final class C16344a extends Message.Builder<PullManagedSchoolNodeResponse, C16344a> {

        /* renamed from: a */
        public List<SchoolNodeWithUpperNodesPath> f42587a = Internal.newMutableList();

        /* renamed from: b */
        public SchoolNode f42588b;

        /* renamed from: a */
        public PullManagedSchoolNodeResponse build() {
            return new PullManagedSchoolNodeResponse(this.f42587a, this.f42588b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16344a newBuilder() {
        C16344a aVar = new C16344a();
        aVar.f42587a = Internal.copyOf("school_nodes", this.school_nodes);
        aVar.f42588b = this.superAdminNode;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PullManagedSchoolNodeResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.school_nodes.isEmpty()) {
            sb.append(", school_nodes=");
            sb.append(this.school_nodes);
        }
        if (this.superAdminNode != null) {
            sb.append(", superAdminNode=");
            sb.append(this.superAdminNode);
        }
        StringBuilder replace = sb.replace(0, 2, "PullManagedSchoolNodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullManagedSchoolNodeResponse(List<SchoolNodeWithUpperNodesPath> list, SchoolNode schoolNode) {
        this(list, schoolNode, ByteString.EMPTY);
    }

    public PullManagedSchoolNodeResponse(List<SchoolNodeWithUpperNodesPath> list, SchoolNode schoolNode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.school_nodes = Internal.immutableCopyOf("school_nodes", list);
        this.superAdminNode = schoolNode;
    }
}
