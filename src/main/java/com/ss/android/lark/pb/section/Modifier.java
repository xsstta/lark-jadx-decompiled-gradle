package com.ss.android.lark.pb.section;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Modifier extends Message<Modifier, C50050a> {
    public static final ProtoAdapter<Modifier> ADAPTER = new C50051b();
    public static final Integer DEFAULT_END_INDEX = 0;
    public static final Integer DEFAULT_START_INDEX = 0;
    private static final long serialVersionUID = 0;
    public final Integer mend_index;
    public final List<ModifierMeta> mmetas;
    public final Integer mstart_index;

    /* renamed from: com.ss.android.lark.pb.section.Modifier$b */
    private static final class C50051b extends ProtoAdapter<Modifier> {
        C50051b() {
            super(FieldEncoding.LENGTH_DELIMITED, Modifier.class);
        }

        /* renamed from: a */
        public int encodedSize(Modifier modifier) {
            int i;
            int i2 = 0;
            if (modifier.mstart_index != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, modifier.mstart_index);
            } else {
                i = 0;
            }
            if (modifier.mend_index != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, modifier.mend_index);
            }
            return i + i2 + ModifierMeta.ADAPTER.asRepeated().encodedSizeWithTag(3, modifier.mmetas) + modifier.unknownFields().size();
        }

        /* renamed from: a */
        public Modifier decode(ProtoReader protoReader) throws IOException {
            C50050a aVar = new C50050a();
            aVar.f125167a = 0;
            aVar.f125168b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125167a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125168b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125169c.add(ModifierMeta.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Modifier modifier) throws IOException {
            if (modifier.mstart_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, modifier.mstart_index);
            }
            if (modifier.mend_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, modifier.mend_index);
            }
            ModifierMeta.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, modifier.mmetas);
            protoWriter.writeBytes(modifier.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.section.Modifier$a */
    public static final class C50050a extends Message.Builder<Modifier, C50050a> {

        /* renamed from: a */
        public Integer f125167a;

        /* renamed from: b */
        public Integer f125168b;

        /* renamed from: c */
        public List<ModifierMeta> f125169c = Internal.newMutableList();

        /* renamed from: a */
        public Modifier build() {
            return new Modifier(this.f125167a, this.f125168b, this.f125169c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50050a newBuilder() {
        C50050a aVar = new C50050a();
        aVar.f125167a = this.mstart_index;
        aVar.f125168b = this.mend_index;
        aVar.f125169c = Internal.copyOf("mmetas", this.mmetas);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mstart_index != null) {
            sb.append(", start_index=");
            sb.append(this.mstart_index);
        }
        if (this.mend_index != null) {
            sb.append(", end_index=");
            sb.append(this.mend_index);
        }
        if (!this.mmetas.isEmpty()) {
            sb.append(", metas=");
            sb.append(this.mmetas);
        }
        StringBuilder replace = sb.replace(0, 2, "Modifier{");
        replace.append('}');
        return replace.toString();
    }

    public Modifier(Integer num, Integer num2, List<ModifierMeta> list) {
        this(num, num2, list, ByteString.EMPTY);
    }

    public Modifier(Integer num, Integer num2, List<ModifierMeta> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstart_index = num;
        this.mend_index = num2;
        this.mmetas = Internal.immutableCopyOf("mmetas", list);
    }
}
