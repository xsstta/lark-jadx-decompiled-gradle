package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ReachPointMaterial extends Message<ReachPointMaterial, C19797a> {
    public static final ProtoAdapter<ReachPointMaterial> ADAPTER = new C19798b();
    public static final ByteString DEFAULT_MATERIAL = ByteString.EMPTY;
    public static final Long DEFAULT_MATERIAL_ID = 0L;
    private static final long serialVersionUID = 0;
    public final ByteString material;
    public final Long material_id;
    public final String material_key;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointMaterial$b */
    private static final class C19798b extends ProtoAdapter<ReachPointMaterial> {
        C19798b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReachPointMaterial.class);
        }

        /* renamed from: a */
        public int encodedSize(ReachPointMaterial reachPointMaterial) {
            int i;
            int i2;
            int i3 = 0;
            if (reachPointMaterial.material_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, reachPointMaterial.material_id);
            } else {
                i = 0;
            }
            if (reachPointMaterial.material_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, reachPointMaterial.material_key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (reachPointMaterial.material != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, reachPointMaterial.material);
            }
            return i4 + i3 + reachPointMaterial.unknownFields().size();
        }

        /* renamed from: a */
        public ReachPointMaterial decode(ProtoReader protoReader) throws IOException {
            C19797a aVar = new C19797a();
            aVar.f48263a = 0L;
            aVar.f48264b = "";
            aVar.f48265c = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48263a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48264b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48265c = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReachPointMaterial reachPointMaterial) throws IOException {
            if (reachPointMaterial.material_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, reachPointMaterial.material_id);
            }
            if (reachPointMaterial.material_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, reachPointMaterial.material_key);
            }
            if (reachPointMaterial.material != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, reachPointMaterial.material);
            }
            protoWriter.writeBytes(reachPointMaterial.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointMaterial$a */
    public static final class C19797a extends Message.Builder<ReachPointMaterial, C19797a> {

        /* renamed from: a */
        public Long f48263a;

        /* renamed from: b */
        public String f48264b;

        /* renamed from: c */
        public ByteString f48265c;

        /* renamed from: a */
        public ReachPointMaterial build() {
            return new ReachPointMaterial(this.f48263a, this.f48264b, this.f48265c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19797a newBuilder() {
        C19797a aVar = new C19797a();
        aVar.f48263a = this.material_id;
        aVar.f48264b = this.material_key;
        aVar.f48265c = this.material;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "ReachPointMaterial");
        StringBuilder sb = new StringBuilder();
        if (this.material_id != null) {
            sb.append(", material_id=");
            sb.append(this.material_id);
        }
        if (this.material_key != null) {
            sb.append(", material_key=");
            sb.append(this.material_key);
        }
        if (this.material != null) {
            sb.append(", material=");
            sb.append(this.material);
        }
        StringBuilder replace = sb.replace(0, 2, "ReachPointMaterial{");
        replace.append('}');
        return replace.toString();
    }

    public ReachPointMaterial(Long l, String str, ByteString byteString) {
        this(l, str, byteString, ByteString.EMPTY);
    }

    public ReachPointMaterial(Long l, String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.material_id = l;
        this.material_key = str;
        this.material = byteString;
    }
}
