package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateCustomizedStickersRequest extends Message<CreateCustomizedStickersRequest, C17344a> {
    public static final ProtoAdapter<CreateCustomizedStickersRequest> ADAPTER = new C17345b();
    public static final Type DEFAULT_TYPE = Type.KEY;
    private static final long serialVersionUID = 0;
    public final List<ImageKeyData> image_infos;
    public final List<String> image_keys;
    public final List<String> image_paths;
    public final List<Sticker> stickers;
    public final Type type;

    public enum Type implements WireEnum {
        KEY(1),
        IMAGE_PATH(2),
        IMAGE_KEY(3),
        IMAGE_KEY_V1(4);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return KEY;
            }
            if (i == 2) {
                return IMAGE_PATH;
            }
            if (i == 3) {
                return IMAGE_KEY;
            }
            if (i != 4) {
                return null;
            }
            return IMAGE_KEY_V1;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateCustomizedStickersRequest$b */
    private static final class C17345b extends ProtoAdapter<CreateCustomizedStickersRequest> {
        C17345b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateCustomizedStickersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateCustomizedStickersRequest createCustomizedStickersRequest) {
            return Sticker.ADAPTER.asRepeated().encodedSizeWithTag(1, createCustomizedStickersRequest.stickers) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, createCustomizedStickersRequest.image_paths) + Type.ADAPTER.encodedSizeWithTag(3, createCustomizedStickersRequest.type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, createCustomizedStickersRequest.image_keys) + ImageKeyData.ADAPTER.asRepeated().encodedSizeWithTag(5, createCustomizedStickersRequest.image_infos) + createCustomizedStickersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateCustomizedStickersRequest decode(ProtoReader protoReader) throws IOException {
            C17344a aVar = new C17344a();
            aVar.f44220c = Type.KEY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44218a.add(Sticker.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44219b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    try {
                        aVar.f44220c = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f44221d.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44222e.add(ImageKeyData.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateCustomizedStickersRequest createCustomizedStickersRequest) throws IOException {
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, createCustomizedStickersRequest.stickers);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, createCustomizedStickersRequest.image_paths);
            Type.ADAPTER.encodeWithTag(protoWriter, 3, createCustomizedStickersRequest.type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, createCustomizedStickersRequest.image_keys);
            ImageKeyData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, createCustomizedStickersRequest.image_infos);
            protoWriter.writeBytes(createCustomizedStickersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateCustomizedStickersRequest$a */
    public static final class C17344a extends Message.Builder<CreateCustomizedStickersRequest, C17344a> {

        /* renamed from: a */
        public List<Sticker> f44218a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f44219b = Internal.newMutableList();

        /* renamed from: c */
        public Type f44220c;

        /* renamed from: d */
        public List<String> f44221d = Internal.newMutableList();

        /* renamed from: e */
        public List<ImageKeyData> f44222e = Internal.newMutableList();

        /* renamed from: a */
        public CreateCustomizedStickersRequest build() {
            Type type = this.f44220c;
            if (type != null) {
                return new CreateCustomizedStickersRequest(this.f44218a, this.f44219b, type, this.f44221d, this.f44222e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C17344a mo60898a(Type type) {
            this.f44220c = type;
            return this;
        }

        /* renamed from: a */
        public C17344a mo60899a(List<Sticker> list) {
            Internal.checkElementsNotNull(list);
            this.f44218a = list;
            return this;
        }

        /* renamed from: b */
        public C17344a mo60901b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44219b = list;
            return this;
        }

        /* renamed from: c */
        public C17344a mo60902c(List<ImageKeyData> list) {
            Internal.checkElementsNotNull(list);
            this.f44222e = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17344a newBuilder() {
        C17344a aVar = new C17344a();
        aVar.f44218a = Internal.copyOf("stickers", this.stickers);
        aVar.f44219b = Internal.copyOf("image_paths", this.image_paths);
        aVar.f44220c = this.type;
        aVar.f44221d = Internal.copyOf("image_keys", this.image_keys);
        aVar.f44222e = Internal.copyOf("image_infos", this.image_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateCustomizedStickersRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        if (!this.image_paths.isEmpty()) {
            sb.append(", image_paths=");
            sb.append(this.image_paths);
        }
        sb.append(", type=");
        sb.append(this.type);
        if (!this.image_keys.isEmpty()) {
            sb.append(", image_keys=");
            sb.append(this.image_keys);
        }
        if (!this.image_infos.isEmpty()) {
            sb.append(", image_infos=");
            sb.append(this.image_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateCustomizedStickersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateCustomizedStickersRequest(List<Sticker> list, List<String> list2, Type type2, List<String> list3, List<ImageKeyData> list4) {
        this(list, list2, type2, list3, list4, ByteString.EMPTY);
    }

    public CreateCustomizedStickersRequest(List<Sticker> list, List<String> list2, Type type2, List<String> list3, List<ImageKeyData> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stickers = Internal.immutableCopyOf("stickers", list);
        this.image_paths = Internal.immutableCopyOf("image_paths", list2);
        this.type = type2;
        this.image_keys = Internal.immutableCopyOf("image_keys", list3);
        this.image_infos = Internal.immutableCopyOf("image_infos", list4);
    }
}
