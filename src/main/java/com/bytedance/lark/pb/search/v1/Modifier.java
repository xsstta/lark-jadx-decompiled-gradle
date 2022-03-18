package com.bytedance.lark.pb.search.v1;

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

public final class Modifier extends Message<Modifier, C18843a> {
    public static final ProtoAdapter<Modifier> ADAPTER = new C18844b();
    private static final long serialVersionUID = 0;
    public final String key;
    public final List<ModifierValue> modifier_values;
    public final List<String> values;

    /* renamed from: com.bytedance.lark.pb.search.v1.Modifier$b */
    private static final class C18844b extends ProtoAdapter<Modifier> {
        C18844b() {
            super(FieldEncoding.LENGTH_DELIMITED, Modifier.class);
        }

        /* renamed from: a */
        public int encodedSize(Modifier modifier) {
            int i;
            if (modifier.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, modifier.key);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, modifier.values) + ModifierValue.ADAPTER.asRepeated().encodedSizeWithTag(3, modifier.modifier_values) + modifier.unknownFields().size();
        }

        /* renamed from: a */
        public Modifier decode(ProtoReader protoReader) throws IOException {
            C18843a aVar = new C18843a();
            aVar.f46521a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46521a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46522b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46523c.add(ModifierValue.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Modifier modifier) throws IOException {
            if (modifier.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifier.key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, modifier.values);
            ModifierValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, modifier.modifier_values);
            protoWriter.writeBytes(modifier.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.Modifier$a */
    public static final class C18843a extends Message.Builder<Modifier, C18843a> {

        /* renamed from: a */
        public String f46521a;

        /* renamed from: b */
        public List<String> f46522b = Internal.newMutableList();

        /* renamed from: c */
        public List<ModifierValue> f46523c = Internal.newMutableList();

        /* renamed from: a */
        public Modifier build() {
            return new Modifier(this.f46521a, this.f46522b, this.f46523c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18843a newBuilder() {
        C18843a aVar = new C18843a();
        aVar.f46521a = this.key;
        aVar.f46522b = Internal.copyOf("values", this.values);
        aVar.f46523c = Internal.copyOf("modifier_values", this.modifier_values);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "Modifier");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (!this.values.isEmpty()) {
            sb.append(", values=");
            sb.append(this.values);
        }
        if (!this.modifier_values.isEmpty()) {
            sb.append(", modifier_values=");
            sb.append(this.modifier_values);
        }
        StringBuilder replace = sb.replace(0, 2, "Modifier{");
        replace.append('}');
        return replace.toString();
    }

    public Modifier(String str, List<String> list, List<ModifierValue> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public Modifier(String str, List<String> list, List<ModifierValue> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.values = Internal.immutableCopyOf("values", list);
        this.modifier_values = Internal.immutableCopyOf("modifier_values", list2);
    }
}
