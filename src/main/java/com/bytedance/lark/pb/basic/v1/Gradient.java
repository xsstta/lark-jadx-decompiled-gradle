package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Gradient extends Message<Gradient, C14997a> {
    public static final ProtoAdapter<Gradient> ADAPTER = new C14998b();
    public static final Type DEFAULT_TYPE = Type.LINEAR;
    private static final long serialVersionUID = 0;
    public final Linear linear;
    public final Type type;

    public enum Type implements WireEnum {
        LINEAR(0);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i != 0) {
                return null;
            }
            return LINEAR;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class Linear extends Message<Linear, C14995a> {
        public static final ProtoAdapter<Linear> ADAPTER = new C14996b();
        public static final Integer DEFAULT_DEG = 0;
        private static final long serialVersionUID = 0;
        public final List<ThemeColor> colors_v2;
        public final Integer deg;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Gradient$Linear$b */
        private static final class C14996b extends ProtoAdapter<Linear> {
            C14996b() {
                super(FieldEncoding.LENGTH_DELIMITED, Linear.class);
            }

            /* renamed from: a */
            public int encodedSize(Linear linear) {
                int i;
                if (linear.deg != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, linear.deg);
                } else {
                    i = 0;
                }
                return i + ThemeColor.ADAPTER.asRepeated().encodedSizeWithTag(3, linear.colors_v2) + linear.unknownFields().size();
            }

            /* renamed from: a */
            public Linear decode(ProtoReader protoReader) throws IOException {
                C14995a aVar = new C14995a();
                aVar.f39660a = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39660a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39661b.add(ThemeColor.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Linear linear) throws IOException {
                if (linear.deg != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, linear.deg);
                }
                ThemeColor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, linear.colors_v2);
                protoWriter.writeBytes(linear.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Gradient$Linear$a */
        public static final class C14995a extends Message.Builder<Linear, C14995a> {

            /* renamed from: a */
            public Integer f39660a;

            /* renamed from: b */
            public List<ThemeColor> f39661b = Internal.newMutableList();

            /* renamed from: a */
            public Linear build() {
                return new Linear(this.f39660a, this.f39661b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14995a newBuilder() {
            C14995a aVar = new C14995a();
            aVar.f39660a = this.deg;
            aVar.f39661b = Internal.copyOf("colors_v2", this.colors_v2);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Linear");
            StringBuilder sb = new StringBuilder();
            if (this.deg != null) {
                sb.append(", deg=");
                sb.append(this.deg);
            }
            if (!this.colors_v2.isEmpty()) {
                sb.append(", colors_v2=");
                sb.append(this.colors_v2);
            }
            StringBuilder replace = sb.replace(0, 2, "Linear{");
            replace.append('}');
            return replace.toString();
        }

        public Linear(Integer num, List<ThemeColor> list) {
            this(num, list, ByteString.EMPTY);
        }

        public Linear(Integer num, List<ThemeColor> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.deg = num;
            this.colors_v2 = Internal.immutableCopyOf("colors_v2", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Gradient$b */
    private static final class C14998b extends ProtoAdapter<Gradient> {
        C14998b() {
            super(FieldEncoding.LENGTH_DELIMITED, Gradient.class);
        }

        /* renamed from: a */
        public int encodedSize(Gradient gradient) {
            int i;
            int i2 = 0;
            if (gradient.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, gradient.type);
            } else {
                i = 0;
            }
            if (gradient.linear != null) {
                i2 = Linear.ADAPTER.encodedSizeWithTag(2, gradient.linear);
            }
            return i + i2 + gradient.unknownFields().size();
        }

        /* renamed from: a */
        public Gradient decode(ProtoReader protoReader) throws IOException {
            C14997a aVar = new C14997a();
            aVar.f39662a = Type.LINEAR;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f39662a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo54820a(Linear.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Gradient gradient) throws IOException {
            if (gradient.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, gradient.type);
            }
            if (gradient.linear != null) {
                Linear.ADAPTER.encodeWithTag(protoWriter, 2, gradient.linear);
            }
            protoWriter.writeBytes(gradient.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Gradient$a */
    public static final class C14997a extends Message.Builder<Gradient, C14997a> {

        /* renamed from: a */
        public Type f39662a;

        /* renamed from: b */
        public Linear f39663b;

        /* renamed from: a */
        public Gradient build() {
            return new Gradient(this.f39662a, this.f39663b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14997a mo54820a(Linear linear) {
            this.f39663b = linear;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14997a newBuilder() {
        C14997a aVar = new C14997a();
        aVar.f39662a = this.type;
        aVar.f39663b = this.linear;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Gradient");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.linear != null) {
            sb.append(", linear=");
            sb.append(this.linear);
        }
        StringBuilder replace = sb.replace(0, 2, "Gradient{");
        replace.append('}');
        return replace.toString();
    }

    public Gradient(Type type2, Linear linear2) {
        this(type2, linear2, ByteString.EMPTY);
    }

    public Gradient(Type type2, Linear linear2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.linear = linear2;
    }
}
