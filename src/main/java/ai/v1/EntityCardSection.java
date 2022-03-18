package ai.v1;

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

public final class EntityCardSection extends Message<EntityCardSection, C0051a> {
    public static final ProtoAdapter<EntityCardSection> ADAPTER = new C0052b();
    private static final long serialVersionUID = 0;
    public final List<EntityCardElement> elements;
    public final String name;
    public final List<EntityCardSection> sections;
    public final String title;

    /* renamed from: ai.v1.EntityCardSection$b */
    private static final class C0052b extends ProtoAdapter<EntityCardSection> {
        C0052b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCardSection.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCardSection entityCardSection) {
            int i;
            int i2 = 0;
            if (entityCardSection.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, entityCardSection.title);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + EntityCardElement.ADAPTER.asRepeated().encodedSizeWithTag(2, entityCardSection.elements) + EntityCardSection.ADAPTER.asRepeated().encodedSizeWithTag(3, entityCardSection.sections);
            if (entityCardSection.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, entityCardSection.name);
            }
            return encodedSizeWithTag + i2 + entityCardSection.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCardSection decode(ProtoReader protoReader) throws IOException {
            C0051a aVar = new C0051a();
            aVar.f90a = "";
            aVar.f93d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f90a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f91b.add(EntityCardElement.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f92c.add(EntityCardSection.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f93d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntityCardSection entityCardSection) throws IOException {
            if (entityCardSection.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCardSection.title);
            }
            EntityCardElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, entityCardSection.elements);
            EntityCardSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, entityCardSection.sections);
            if (entityCardSection.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, entityCardSection.name);
            }
            protoWriter.writeBytes(entityCardSection.unknownFields());
        }
    }

    /* renamed from: ai.v1.EntityCardSection$a */
    public static final class C0051a extends Message.Builder<EntityCardSection, C0051a> {

        /* renamed from: a */
        public String f90a;

        /* renamed from: b */
        public List<EntityCardElement> f91b = Internal.newMutableList();

        /* renamed from: c */
        public List<EntityCardSection> f92c = Internal.newMutableList();

        /* renamed from: d */
        public String f93d;

        /* renamed from: a */
        public EntityCardSection build() {
            return new EntityCardSection(this.f90a, this.f91b, this.f92c, this.f93d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0051a newBuilder() {
        C0051a aVar = new C0051a();
        aVar.f90a = this.title;
        aVar.f91b = Internal.copyOf("elements", this.elements);
        aVar.f92c = Internal.copyOf("sections", this.sections);
        aVar.f93d = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "EntityCardSection");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (!this.elements.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.elements);
        }
        if (!this.sections.isEmpty()) {
            sb.append(", sections=");
            sb.append(this.sections);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityCardSection{");
        replace.append('}');
        return replace.toString();
    }

    public EntityCardSection(String str, List<EntityCardElement> list, List<EntityCardSection> list2, String str2) {
        this(str, list, list2, str2, ByteString.EMPTY);
    }

    public EntityCardSection(String str, List<EntityCardElement> list, List<EntityCardSection> list2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.elements = Internal.immutableCopyOf("elements", list);
        this.sections = Internal.immutableCopyOf("sections", list2);
        this.name = str2;
    }
}
