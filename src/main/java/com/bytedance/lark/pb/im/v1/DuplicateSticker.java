package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DuplicateSticker extends Message<DuplicateSticker, C17448a> {
    public static final ProtoAdapter<DuplicateSticker> ADAPTER = new C17449b();
    public static final Type DEFAULT_DUPLICATE_TYPE = Type.STICKER_ID;
    private static final long serialVersionUID = 0;
    public final String duplicate_key;
    public final Type duplicate_type;

    public enum Type implements WireEnum {
        STICKER_ID(1),
        STICKER_KEY(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return STICKER_ID;
            }
            if (i != 2) {
                return null;
            }
            return STICKER_KEY;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DuplicateSticker$b */
    private static final class C17449b extends ProtoAdapter<DuplicateSticker> {
        C17449b() {
            super(FieldEncoding.LENGTH_DELIMITED, DuplicateSticker.class);
        }

        /* renamed from: a */
        public int encodedSize(DuplicateSticker duplicateSticker) {
            return Type.ADAPTER.encodedSizeWithTag(1, duplicateSticker.duplicate_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, duplicateSticker.duplicate_key) + duplicateSticker.unknownFields().size();
        }

        /* renamed from: a */
        public DuplicateSticker decode(ProtoReader protoReader) throws IOException {
            C17448a aVar = new C17448a();
            aVar.f44338a = Type.STICKER_ID;
            aVar.f44339b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44338a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44339b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DuplicateSticker duplicateSticker) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, duplicateSticker.duplicate_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, duplicateSticker.duplicate_key);
            protoWriter.writeBytes(duplicateSticker.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17448a newBuilder() {
        C17448a aVar = new C17448a();
        aVar.f44338a = this.duplicate_type;
        aVar.f44339b = this.duplicate_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DuplicateSticker$a */
    public static final class C17448a extends Message.Builder<DuplicateSticker, C17448a> {

        /* renamed from: a */
        public Type f44338a;

        /* renamed from: b */
        public String f44339b;

        /* renamed from: a */
        public DuplicateSticker build() {
            String str;
            Type type = this.f44338a;
            if (type != null && (str = this.f44339b) != null) {
                return new DuplicateSticker(type, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, "duplicate_type", this.f44339b, "duplicate_key");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DuplicateSticker");
        StringBuilder sb = new StringBuilder();
        sb.append(", duplicate_type=");
        sb.append(this.duplicate_type);
        sb.append(", duplicate_key=");
        sb.append(this.duplicate_key);
        StringBuilder replace = sb.replace(0, 2, "DuplicateSticker{");
        replace.append('}');
        return replace.toString();
    }

    public DuplicateSticker(Type type, String str) {
        this(type, str, ByteString.EMPTY);
    }

    public DuplicateSticker(Type type, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.duplicate_type = type;
        this.duplicate_key = str;
    }
}
