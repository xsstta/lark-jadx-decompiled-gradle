package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EquivalentKeys extends Message<EquivalentKeys, C49455a> {
    public static final ProtoAdapter<EquivalentKeys> ADAPTER = new C49456b();
    private static final long serialVersionUID = 0;
    public final List<String> malias;
    public final List<String> mname;

    /* renamed from: com.ss.android.lark.pb.ai.EquivalentKeys$b */
    private static final class C49456b extends ProtoAdapter<EquivalentKeys> {
        C49456b() {
            super(FieldEncoding.LENGTH_DELIMITED, EquivalentKeys.class);
        }

        /* renamed from: a */
        public int encodedSize(EquivalentKeys equivalentKeys) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, equivalentKeys.mname) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, equivalentKeys.malias) + equivalentKeys.unknownFields().size();
        }

        /* renamed from: a */
        public EquivalentKeys decode(ProtoReader protoReader) throws IOException {
            C49455a aVar = new C49455a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124043a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124044b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EquivalentKeys equivalentKeys) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, equivalentKeys.mname);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, equivalentKeys.malias);
            protoWriter.writeBytes(equivalentKeys.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.EquivalentKeys$a */
    public static final class C49455a extends Message.Builder<EquivalentKeys, C49455a> {

        /* renamed from: a */
        public List<String> f124043a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f124044b = Internal.newMutableList();

        /* renamed from: a */
        public EquivalentKeys build() {
            return new EquivalentKeys(this.f124043a, this.f124044b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49455a newBuilder() {
        C49455a aVar = new C49455a();
        aVar.f124043a = Internal.copyOf("mname", this.mname);
        aVar.f124044b = Internal.copyOf("malias", this.malias);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mname.isEmpty()) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (!this.malias.isEmpty()) {
            sb.append(", alias=");
            sb.append(this.malias);
        }
        StringBuilder replace = sb.replace(0, 2, "EquivalentKeys{");
        replace.append('}');
        return replace.toString();
    }

    public EquivalentKeys(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public EquivalentKeys(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = Internal.immutableCopyOf("mname", list);
        this.malias = Internal.immutableCopyOf("malias", list2);
    }
}
