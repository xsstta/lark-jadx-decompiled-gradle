package com.bytedance.lark.pb.search.sections.v1;

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

public final class Modifier extends Message<Modifier, C18791a> {
    public static final ProtoAdapter<Modifier> ADAPTER = new C18792b();
    public static final Integer DEFAULT_END_INDEX = 0;
    public static final Integer DEFAULT_START_INDEX = 0;
    private static final long serialVersionUID = 0;
    public final Integer end_index;
    public final List<ModifierMeta> metas;
    public final Integer start_index;

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.Modifier$b */
    private static final class C18792b extends ProtoAdapter<Modifier> {
        C18792b() {
            super(FieldEncoding.LENGTH_DELIMITED, Modifier.class);
        }

        /* renamed from: a */
        public int encodedSize(Modifier modifier) {
            int i;
            int i2 = 0;
            if (modifier.start_index != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, modifier.start_index);
            } else {
                i = 0;
            }
            if (modifier.end_index != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, modifier.end_index);
            }
            return i + i2 + ModifierMeta.ADAPTER.asRepeated().encodedSizeWithTag(3, modifier.metas) + modifier.unknownFields().size();
        }

        /* renamed from: a */
        public Modifier decode(ProtoReader protoReader) throws IOException {
            C18791a aVar = new C18791a();
            aVar.f46352a = 0;
            aVar.f46353b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46352a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46353b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46354c.add(ModifierMeta.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Modifier modifier) throws IOException {
            if (modifier.start_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, modifier.start_index);
            }
            if (modifier.end_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, modifier.end_index);
            }
            ModifierMeta.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, modifier.metas);
            protoWriter.writeBytes(modifier.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.Modifier$a */
    public static final class C18791a extends Message.Builder<Modifier, C18791a> {

        /* renamed from: a */
        public Integer f46352a;

        /* renamed from: b */
        public Integer f46353b;

        /* renamed from: c */
        public List<ModifierMeta> f46354c = Internal.newMutableList();

        /* renamed from: a */
        public Modifier build() {
            return new Modifier(this.f46352a, this.f46353b, this.f46354c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18791a newBuilder() {
        C18791a aVar = new C18791a();
        aVar.f46352a = this.start_index;
        aVar.f46353b = this.end_index;
        aVar.f46354c = Internal.copyOf("metas", this.metas);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "Modifier");
        StringBuilder sb = new StringBuilder();
        if (this.start_index != null) {
            sb.append(", start_index=");
            sb.append(this.start_index);
        }
        if (this.end_index != null) {
            sb.append(", end_index=");
            sb.append(this.end_index);
        }
        if (!this.metas.isEmpty()) {
            sb.append(", metas=");
            sb.append(this.metas);
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
        this.start_index = num;
        this.end_index = num2;
        this.metas = Internal.immutableCopyOf("metas", list);
    }
}
