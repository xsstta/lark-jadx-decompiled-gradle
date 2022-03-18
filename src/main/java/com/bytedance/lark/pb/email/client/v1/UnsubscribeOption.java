package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class UnsubscribeOption extends Message<UnsubscribeOption, C16994a> {
    public static final ProtoAdapter<UnsubscribeOption> ADAPTER = new C16995b();
    public static final UnsubscribeType DEFAULT_UNSUBSCRIBETYPE = UnsubscribeType.NONE;
    private static final long serialVersionUID = 0;
    public final String redirectedUrl;
    public final UnsubscribeType unsubscribeType;

    public enum UnsubscribeType implements WireEnum {
        NONE(0),
        MAILTO(1),
        ONE_CLICK(2),
        REDIRECT(3);
        
        public static final ProtoAdapter<UnsubscribeType> ADAPTER = ProtoAdapter.newEnumAdapter(UnsubscribeType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UnsubscribeType fromValue(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return MAILTO;
            }
            if (i == 2) {
                return ONE_CLICK;
            }
            if (i != 3) {
                return null;
            }
            return REDIRECT;
        }

        private UnsubscribeType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UnsubscribeOption$b */
    private static final class C16995b extends ProtoAdapter<UnsubscribeOption> {
        C16995b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnsubscribeOption.class);
        }

        /* renamed from: a */
        public int encodedSize(UnsubscribeOption unsubscribeOption) {
            int i;
            int i2 = 0;
            if (unsubscribeOption.unsubscribeType != null) {
                i = UnsubscribeType.ADAPTER.encodedSizeWithTag(1, unsubscribeOption.unsubscribeType);
            } else {
                i = 0;
            }
            if (unsubscribeOption.redirectedUrl != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, unsubscribeOption.redirectedUrl);
            }
            return i + i2 + unsubscribeOption.unknownFields().size();
        }

        /* renamed from: a */
        public UnsubscribeOption decode(ProtoReader protoReader) throws IOException {
            C16994a aVar = new C16994a();
            aVar.f43618a = UnsubscribeType.NONE;
            aVar.f43619b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f43618a = UnsubscribeType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43619b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UnsubscribeOption unsubscribeOption) throws IOException {
            if (unsubscribeOption.unsubscribeType != null) {
                UnsubscribeType.ADAPTER.encodeWithTag(protoWriter, 1, unsubscribeOption.unsubscribeType);
            }
            if (unsubscribeOption.redirectedUrl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, unsubscribeOption.redirectedUrl);
            }
            protoWriter.writeBytes(unsubscribeOption.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UnsubscribeOption$a */
    public static final class C16994a extends Message.Builder<UnsubscribeOption, C16994a> {

        /* renamed from: a */
        public UnsubscribeType f43618a;

        /* renamed from: b */
        public String f43619b;

        /* renamed from: a */
        public UnsubscribeOption build() {
            return new UnsubscribeOption(this.f43618a, this.f43619b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16994a mo60048a(UnsubscribeType unsubscribeType) {
            this.f43618a = unsubscribeType;
            return this;
        }

        /* renamed from: a */
        public C16994a mo60049a(String str) {
            this.f43619b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16994a newBuilder() {
        C16994a aVar = new C16994a();
        aVar.f43618a = this.unsubscribeType;
        aVar.f43619b = this.redirectedUrl;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "UnsubscribeOption");
        StringBuilder sb = new StringBuilder();
        if (this.unsubscribeType != null) {
            sb.append(", unsubscribeType=");
            sb.append(this.unsubscribeType);
        }
        if (this.redirectedUrl != null) {
            sb.append(", redirectedUrl=");
            sb.append(this.redirectedUrl);
        }
        StringBuilder replace = sb.replace(0, 2, "UnsubscribeOption{");
        replace.append('}');
        return replace.toString();
    }

    public UnsubscribeOption(UnsubscribeType unsubscribeType2, String str) {
        this(unsubscribeType2, str, ByteString.EMPTY);
    }

    public UnsubscribeOption(UnsubscribeType unsubscribeType2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unsubscribeType = unsubscribeType2;
        this.redirectedUrl = str;
    }
}
