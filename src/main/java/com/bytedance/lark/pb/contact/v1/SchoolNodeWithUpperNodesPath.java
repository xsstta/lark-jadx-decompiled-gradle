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

public final class SchoolNodeWithUpperNodesPath extends Message<SchoolNodeWithUpperNodesPath, C16362a> {
    public static final ProtoAdapter<SchoolNodeWithUpperNodesPath> ADAPTER = new C16363b();
    private static final long serialVersionUID = 0;
    public final SchoolNode node;
    public final List<SchoolNodeLite> upper_node_path;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SchoolNodeWithUpperNodesPath$b */
    private static final class C16363b extends ProtoAdapter<SchoolNodeWithUpperNodesPath> {
        C16363b() {
            super(FieldEncoding.LENGTH_DELIMITED, SchoolNodeWithUpperNodesPath.class);
        }

        /* renamed from: a */
        public int encodedSize(SchoolNodeWithUpperNodesPath schoolNodeWithUpperNodesPath) {
            int i;
            if (schoolNodeWithUpperNodesPath.node != null) {
                i = SchoolNode.ADAPTER.encodedSizeWithTag(1, schoolNodeWithUpperNodesPath.node);
            } else {
                i = 0;
            }
            return i + SchoolNodeLite.ADAPTER.asRepeated().encodedSizeWithTag(2, schoolNodeWithUpperNodesPath.upper_node_path) + schoolNodeWithUpperNodesPath.unknownFields().size();
        }

        /* renamed from: a */
        public SchoolNodeWithUpperNodesPath decode(ProtoReader protoReader) throws IOException {
            C16362a aVar = new C16362a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42622a = SchoolNode.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42623b.add(SchoolNodeLite.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SchoolNodeWithUpperNodesPath schoolNodeWithUpperNodesPath) throws IOException {
            if (schoolNodeWithUpperNodesPath.node != null) {
                SchoolNode.ADAPTER.encodeWithTag(protoWriter, 1, schoolNodeWithUpperNodesPath.node);
            }
            SchoolNodeLite.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, schoolNodeWithUpperNodesPath.upper_node_path);
            protoWriter.writeBytes(schoolNodeWithUpperNodesPath.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SchoolNodeWithUpperNodesPath$a */
    public static final class C16362a extends Message.Builder<SchoolNodeWithUpperNodesPath, C16362a> {

        /* renamed from: a */
        public SchoolNode f42622a;

        /* renamed from: b */
        public List<SchoolNodeLite> f42623b = Internal.newMutableList();

        /* renamed from: a */
        public SchoolNodeWithUpperNodesPath build() {
            return new SchoolNodeWithUpperNodesPath(this.f42622a, this.f42623b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16362a newBuilder() {
        C16362a aVar = new C16362a();
        aVar.f42622a = this.node;
        aVar.f42623b = Internal.copyOf("upper_node_path", this.upper_node_path);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SchoolNodeWithUpperNodesPath");
        StringBuilder sb = new StringBuilder();
        if (this.node != null) {
            sb.append(", node=");
            sb.append(this.node);
        }
        if (!this.upper_node_path.isEmpty()) {
            sb.append(", upper_node_path=");
            sb.append(this.upper_node_path);
        }
        StringBuilder replace = sb.replace(0, 2, "SchoolNodeWithUpperNodesPath{");
        replace.append('}');
        return replace.toString();
    }

    public SchoolNodeWithUpperNodesPath(SchoolNode schoolNode, List<SchoolNodeLite> list) {
        this(schoolNode, list, ByteString.EMPTY);
    }

    public SchoolNodeWithUpperNodesPath(SchoolNode schoolNode, List<SchoolNodeLite> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.node = schoolNode;
        this.upper_node_path = Internal.immutableCopyOf("upper_node_path", list);
    }
}
