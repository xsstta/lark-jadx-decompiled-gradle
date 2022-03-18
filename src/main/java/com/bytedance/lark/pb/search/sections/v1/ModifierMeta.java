package com.bytedance.lark.pb.search.sections.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ModifierMeta extends Message<ModifierMeta, C18793a> {
    public static final ProtoAdapter<ModifierMeta> ADAPTER = new C18794b();
    public static final ModifierType DEFAULT_TYPE = ModifierType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String attachment;
    public final ModifierType type;

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.ModifierMeta$b */
    private static final class C18794b extends ProtoAdapter<ModifierMeta> {
        C18794b() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifierMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ModifierMeta modifierMeta) {
            int i;
            int i2 = 0;
            if (modifierMeta.type != null) {
                i = ModifierType.ADAPTER.encodedSizeWithTag(1, modifierMeta.type);
            } else {
                i = 0;
            }
            if (modifierMeta.attachment != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, modifierMeta.attachment);
            }
            return i + i2 + modifierMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ModifierMeta decode(ProtoReader protoReader) throws IOException {
            C18793a aVar = new C18793a();
            aVar.f46355a = ModifierType.UNKNOWN;
            aVar.f46356b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46355a = ModifierType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46356b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ModifierMeta modifierMeta) throws IOException {
            if (modifierMeta.type != null) {
                ModifierType.ADAPTER.encodeWithTag(protoWriter, 1, modifierMeta.type);
            }
            if (modifierMeta.attachment != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifierMeta.attachment);
            }
            protoWriter.writeBytes(modifierMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.ModifierMeta$a */
    public static final class C18793a extends Message.Builder<ModifierMeta, C18793a> {

        /* renamed from: a */
        public ModifierType f46355a;

        /* renamed from: b */
        public String f46356b;

        /* renamed from: a */
        public ModifierMeta build() {
            return new ModifierMeta(this.f46355a, this.f46356b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18793a newBuilder() {
        C18793a aVar = new C18793a();
        aVar.f46355a = this.type;
        aVar.f46356b = this.attachment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ModifierMeta");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.attachment != null) {
            sb.append(", attachment=");
            sb.append(this.attachment);
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
        this.type = modifierType;
        this.attachment = str;
    }
}
