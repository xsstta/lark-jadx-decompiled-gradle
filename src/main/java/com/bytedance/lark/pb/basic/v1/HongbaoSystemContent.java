package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class HongbaoSystemContent extends Message<HongbaoSystemContent, C15005a> {
    public static final ProtoAdapter<HongbaoSystemContent> ADAPTER = new C15006b();
    private static final long serialVersionUID = 0;
    public final String hongbao_id;
    public final String message_id;
    public final Map<String, String> wallet;

    /* renamed from: com.bytedance.lark.pb.basic.v1.HongbaoSystemContent$a */
    public static final class C15005a extends Message.Builder<HongbaoSystemContent, C15005a> {

        /* renamed from: a */
        public Map<String, String> f39682a = Internal.newMutableMap();

        /* renamed from: b */
        public String f39683b;

        /* renamed from: c */
        public String f39684c;

        /* renamed from: a */
        public HongbaoSystemContent build() {
            return new HongbaoSystemContent(this.f39682a, this.f39683b, this.f39684c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.HongbaoSystemContent$b */
    private static final class C15006b extends ProtoAdapter<HongbaoSystemContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f39685a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15006b() {
            super(FieldEncoding.LENGTH_DELIMITED, HongbaoSystemContent.class);
        }

        /* renamed from: a */
        public int encodedSize(HongbaoSystemContent hongbaoSystemContent) {
            int i;
            int encodedSizeWithTag = this.f39685a.encodedSizeWithTag(1, hongbaoSystemContent.wallet);
            int i2 = 0;
            if (hongbaoSystemContent.hongbao_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, hongbaoSystemContent.hongbao_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (hongbaoSystemContent.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, hongbaoSystemContent.message_id);
            }
            return i3 + i2 + hongbaoSystemContent.unknownFields().size();
        }

        /* renamed from: a */
        public HongbaoSystemContent decode(ProtoReader protoReader) throws IOException {
            C15005a aVar = new C15005a();
            aVar.f39683b = "";
            aVar.f39684c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39682a.putAll(this.f39685a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f39683b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39684c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HongbaoSystemContent hongbaoSystemContent) throws IOException {
            this.f39685a.encodeWithTag(protoWriter, 1, hongbaoSystemContent.wallet);
            if (hongbaoSystemContent.hongbao_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hongbaoSystemContent.hongbao_id);
            }
            if (hongbaoSystemContent.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, hongbaoSystemContent.message_id);
            }
            protoWriter.writeBytes(hongbaoSystemContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15005a newBuilder() {
        C15005a aVar = new C15005a();
        aVar.f39682a = Internal.copyOf("wallet", this.wallet);
        aVar.f39683b = this.hongbao_id;
        aVar.f39684c = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "HongbaoSystemContent");
        StringBuilder sb = new StringBuilder();
        if (!this.wallet.isEmpty()) {
            sb.append(", wallet=");
            sb.append(this.wallet);
        }
        if (this.hongbao_id != null) {
            sb.append(", hongbao_id=");
            sb.append(this.hongbao_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "HongbaoSystemContent{");
        replace.append('}');
        return replace.toString();
    }

    public HongbaoSystemContent(Map<String, String> map, String str, String str2) {
        this(map, str, str2, ByteString.EMPTY);
    }

    public HongbaoSystemContent(Map<String, String> map, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.wallet = Internal.immutableCopyOf("wallet", map);
        this.hongbao_id = str;
        this.message_id = str2;
    }
}
