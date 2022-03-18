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

public final class ParentDisplayNames extends Message<ParentDisplayNames, C16338a> {
    public static final ProtoAdapter<ParentDisplayNames> ADAPTER = new C16339b();
    private static final long serialVersionUID = 0;
    public final List<String> parent_name_via_student_relation;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ParentDisplayNames$b */
    private static final class C16339b extends ProtoAdapter<ParentDisplayNames> {
        C16339b() {
            super(FieldEncoding.LENGTH_DELIMITED, ParentDisplayNames.class);
        }

        /* renamed from: a */
        public int encodedSize(ParentDisplayNames parentDisplayNames) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, parentDisplayNames.parent_name_via_student_relation) + parentDisplayNames.unknownFields().size();
        }

        /* renamed from: a */
        public ParentDisplayNames decode(ProtoReader protoReader) throws IOException {
            C16338a aVar = new C16338a();
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
                    aVar.f42583a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ParentDisplayNames parentDisplayNames) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, parentDisplayNames.parent_name_via_student_relation);
            protoWriter.writeBytes(parentDisplayNames.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ParentDisplayNames$a */
    public static final class C16338a extends Message.Builder<ParentDisplayNames, C16338a> {

        /* renamed from: a */
        public List<String> f42583a = Internal.newMutableList();

        /* renamed from: a */
        public ParentDisplayNames build() {
            return new ParentDisplayNames(this.f42583a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16338a newBuilder() {
        C16338a aVar = new C16338a();
        aVar.f42583a = Internal.copyOf("parent_name_via_student_relation", this.parent_name_via_student_relation);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ParentDisplayNames");
        StringBuilder sb = new StringBuilder();
        if (!this.parent_name_via_student_relation.isEmpty()) {
            sb.append(", parent_name_via_student_relation=");
            sb.append(this.parent_name_via_student_relation);
        }
        StringBuilder replace = sb.replace(0, 2, "ParentDisplayNames{");
        replace.append('}');
        return replace.toString();
    }

    public ParentDisplayNames(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public ParentDisplayNames(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent_name_via_student_relation = Internal.immutableCopyOf("parent_name_via_student_relation", list);
    }
}
