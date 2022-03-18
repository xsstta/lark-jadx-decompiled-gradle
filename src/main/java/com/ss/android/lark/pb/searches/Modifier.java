package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Modifier extends Message<Modifier, C50022a> {
    public static final ProtoAdapter<Modifier> ADAPTER = new C50023b();
    private static final long serialVersionUID = 0;
    public final String mkey;
    public final List<ModifierValue> mmodifier_values;
    public final List<String> mvalues;

    /* renamed from: com.ss.android.lark.pb.searches.Modifier$b */
    private static final class C50023b extends ProtoAdapter<Modifier> {
        C50023b() {
            super(FieldEncoding.LENGTH_DELIMITED, Modifier.class);
        }

        /* renamed from: a */
        public int encodedSize(Modifier modifier) {
            int i;
            if (modifier.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, modifier.mkey);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, modifier.mvalues) + ModifierValue.ADAPTER.asRepeated().encodedSizeWithTag(3, modifier.mmodifier_values) + modifier.unknownFields().size();
        }

        /* renamed from: a */
        public Modifier decode(ProtoReader protoReader) throws IOException {
            C50022a aVar = new C50022a();
            aVar.f125117a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125117a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125118b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125119c.add(ModifierValue.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Modifier modifier) throws IOException {
            if (modifier.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifier.mkey);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, modifier.mvalues);
            ModifierValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, modifier.mmodifier_values);
            protoWriter.writeBytes(modifier.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.Modifier$a */
    public static final class C50022a extends Message.Builder<Modifier, C50022a> {

        /* renamed from: a */
        public String f125117a;

        /* renamed from: b */
        public List<String> f125118b = Internal.newMutableList();

        /* renamed from: c */
        public List<ModifierValue> f125119c = Internal.newMutableList();

        /* renamed from: a */
        public Modifier build() {
            return new Modifier(this.f125117a, this.f125118b, this.f125119c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50022a newBuilder() {
        C50022a aVar = new C50022a();
        aVar.f125117a = this.mkey;
        aVar.f125118b = Internal.copyOf("mvalues", this.mvalues);
        aVar.f125119c = Internal.copyOf("mmodifier_values", this.mmodifier_values);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (!this.mvalues.isEmpty()) {
            sb.append(", values=");
            sb.append(this.mvalues);
        }
        if (!this.mmodifier_values.isEmpty()) {
            sb.append(", modifier_values=");
            sb.append(this.mmodifier_values);
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
        this.mkey = str;
        this.mvalues = Internal.immutableCopyOf("mvalues", list);
        this.mmodifier_values = Internal.immutableCopyOf("mmodifier_values", list2);
    }
}
