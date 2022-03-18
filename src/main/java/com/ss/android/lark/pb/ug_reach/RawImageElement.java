package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RawImageElement extends Message<RawImageElement, C50130a> {
    public static final ProtoAdapter<RawImageElement> ADAPTER = new C50131b();
    public static final ByteString DEFAULT_RAW_DATA = ByteString.EMPTY;
    public static final ByteString DEFAULT_SECRETS = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString mraw_data;
    public final ByteString msecrets;

    /* renamed from: com.ss.android.lark.pb.ug_reach.RawImageElement$b */
    private static final class C50131b extends ProtoAdapter<RawImageElement> {
        C50131b() {
            super(FieldEncoding.LENGTH_DELIMITED, RawImageElement.class);
        }

        /* renamed from: a */
        public int encodedSize(RawImageElement rawImageElement) {
            int i;
            int i2 = 0;
            if (rawImageElement.mraw_data != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, rawImageElement.mraw_data);
            } else {
                i = 0;
            }
            if (rawImageElement.msecrets != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, rawImageElement.msecrets);
            }
            return i + i2 + rawImageElement.unknownFields().size();
        }

        /* renamed from: a */
        public RawImageElement decode(ProtoReader protoReader) throws IOException {
            C50130a aVar = new C50130a();
            aVar.f125301a = ByteString.EMPTY;
            aVar.f125302b = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125301a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125302b = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RawImageElement rawImageElement) throws IOException {
            if (rawImageElement.mraw_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, rawImageElement.mraw_data);
            }
            if (rawImageElement.msecrets != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, rawImageElement.msecrets);
            }
            protoWriter.writeBytes(rawImageElement.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.RawImageElement$a */
    public static final class C50130a extends Message.Builder<RawImageElement, C50130a> {

        /* renamed from: a */
        public ByteString f125301a;

        /* renamed from: b */
        public ByteString f125302b;

        /* renamed from: a */
        public RawImageElement build() {
            return new RawImageElement(this.f125301a, this.f125302b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50130a newBuilder() {
        C50130a aVar = new C50130a();
        aVar.f125301a = this.mraw_data;
        aVar.f125302b = this.msecrets;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mraw_data != null) {
            sb.append(", raw_data=");
            sb.append(this.mraw_data);
        }
        if (this.msecrets != null) {
            sb.append(", secrets=");
            sb.append(this.msecrets);
        }
        StringBuilder replace = sb.replace(0, 2, "RawImageElement{");
        replace.append('}');
        return replace.toString();
    }

    public RawImageElement(ByteString byteString, ByteString byteString2) {
        this(byteString, byteString2, ByteString.EMPTY);
    }

    public RawImageElement(ByteString byteString, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.mraw_data = byteString;
        this.msecrets = byteString2;
    }
}
