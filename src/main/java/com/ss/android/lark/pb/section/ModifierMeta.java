package com.ss.android.lark.pb.section;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ModifierMeta extends Message<ModifierMeta, C50052a> {
    public static final ProtoAdapter<ModifierMeta> ADAPTER = new C50053b();
    private static final long serialVersionUID = 0;
    public final String mattachment;
    public final ModifierType mtype;

    /* renamed from: com.ss.android.lark.pb.section.ModifierMeta$b */
    private static final class C50053b extends ProtoAdapter<ModifierMeta> {
        C50053b() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifierMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ModifierMeta modifierMeta) {
            int i;
            int i2 = 0;
            if (modifierMeta.mtype != null) {
                i = ModifierType.ADAPTER.encodedSizeWithTag(1, modifierMeta.mtype);
            } else {
                i = 0;
            }
            if (modifierMeta.mattachment != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, modifierMeta.mattachment);
            }
            return i + i2 + modifierMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ModifierMeta decode(ProtoReader protoReader) throws IOException {
            C50052a aVar = new C50052a();
            aVar.f125171b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f125170a = ModifierType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125171b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ModifierMeta modifierMeta) throws IOException {
            if (modifierMeta.mtype != null) {
                ModifierType.ADAPTER.encodeWithTag(protoWriter, 1, modifierMeta.mtype);
            }
            if (modifierMeta.mattachment != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifierMeta.mattachment);
            }
            protoWriter.writeBytes(modifierMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.section.ModifierMeta$a */
    public static final class C50052a extends Message.Builder<ModifierMeta, C50052a> {

        /* renamed from: a */
        public ModifierType f125170a;

        /* renamed from: b */
        public String f125171b;

        /* renamed from: a */
        public ModifierMeta build() {
            return new ModifierMeta(this.f125170a, this.f125171b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50052a newBuilder() {
        C50052a aVar = new C50052a();
        aVar.f125170a = this.mtype;
        aVar.f125171b = this.mattachment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mattachment != null) {
            sb.append(", attachment=");
            sb.append(this.mattachment);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifierMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ModifierMeta(ModifierType modifierType, String str) {
        this(modifierType, str, ByteString.EMPTY);
    }

    public ModifierMeta(ModifierType modifierType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = modifierType;
        this.mattachment = str;
    }
}
