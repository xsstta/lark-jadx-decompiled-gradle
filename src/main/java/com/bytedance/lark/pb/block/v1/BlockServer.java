package com.bytedance.lark.pb.block.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class BlockServer extends Message<BlockServer, C15472a> {
    public static final ProtoAdapter<BlockServer> ADAPTER = new C15473b();
    public static final Integer DEFAULT_CODE = 0;
    private static final long serialVersionUID = 0;
    public final String block_id;
    public final Integer code;
    public final Map<String, Long> commit_id;
    public final String entity;
    public final Map<String, String> ext_bundles;
    public final String msg;
    public final Map<String, Long> version;

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockServer$a */
    public static final class C15472a extends Message.Builder<BlockServer, C15472a> {

        /* renamed from: a */
        public String f40929a;

        /* renamed from: b */
        public Integer f40930b;

        /* renamed from: c */
        public String f40931c;

        /* renamed from: d */
        public String f40932d;

        /* renamed from: e */
        public Map<String, String> f40933e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, Long> f40934f = Internal.newMutableMap();

        /* renamed from: g */
        public Map<String, Long> f40935g = Internal.newMutableMap();

        /* renamed from: a */
        public BlockServer build() {
            Integer num;
            String str = this.f40929a;
            if (str != null && (num = this.f40930b) != null) {
                return new BlockServer(str, num, this.f40931c, this.f40932d, this.f40933e, this.f40934f, this.f40935g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "block_id", this.f40930b, "code");
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockServer$b */
    private static final class C15473b extends ProtoAdapter<BlockServer> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40936a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Long>> f40937b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, Long>> f40938c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        C15473b() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockServer.class);
        }

        /* renamed from: a */
        public int encodedSize(BlockServer blockServer) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, blockServer.block_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, blockServer.code);
            int i2 = 0;
            if (blockServer.msg != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, blockServer.msg);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (blockServer.entity != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, blockServer.entity);
            }
            return i3 + i2 + this.f40936a.encodedSizeWithTag(5, blockServer.ext_bundles) + this.f40937b.encodedSizeWithTag(6, blockServer.version) + this.f40938c.encodedSizeWithTag(7, blockServer.commit_id) + blockServer.unknownFields().size();
        }

        /* renamed from: a */
        public BlockServer decode(ProtoReader protoReader) throws IOException {
            C15472a aVar = new C15472a();
            aVar.f40929a = "";
            aVar.f40930b = 0;
            aVar.f40931c = "";
            aVar.f40932d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40929a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40930b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40931c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40932d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40933e.putAll(this.f40936a.decode(protoReader));
                            break;
                        case 6:
                            aVar.f40934f.putAll(this.f40937b.decode(protoReader));
                            break;
                        case 7:
                            aVar.f40935g.putAll(this.f40938c.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BlockServer blockServer) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockServer.block_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, blockServer.code);
            if (blockServer.msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, blockServer.msg);
            }
            if (blockServer.entity != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, blockServer.entity);
            }
            this.f40936a.encodeWithTag(protoWriter, 5, blockServer.ext_bundles);
            this.f40937b.encodeWithTag(protoWriter, 6, blockServer.version);
            this.f40938c.encodeWithTag(protoWriter, 7, blockServer.commit_id);
            protoWriter.writeBytes(blockServer.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15472a newBuilder() {
        C15472a aVar = new C15472a();
        aVar.f40929a = this.block_id;
        aVar.f40930b = this.code;
        aVar.f40931c = this.msg;
        aVar.f40932d = this.entity;
        aVar.f40933e = Internal.copyOf("ext_bundles", this.ext_bundles);
        aVar.f40934f = Internal.copyOf(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.version);
        aVar.f40935g = Internal.copyOf("commit_id", this.commit_id);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "BlockServer");
        StringBuilder sb = new StringBuilder();
        sb.append(", block_id=");
        sb.append(this.block_id);
        sb.append(", code=");
        sb.append(this.code);
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.ext_bundles.isEmpty()) {
            sb.append(", ext_bundles=");
            sb.append(this.ext_bundles);
        }
        if (!this.version.isEmpty()) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.commit_id.isEmpty()) {
            sb.append(", commit_id=");
            sb.append(this.commit_id);
        }
        StringBuilder replace = sb.replace(0, 2, "BlockServer{");
        replace.append('}');
        return replace.toString();
    }

    public BlockServer(String str, Integer num, String str2, String str3, Map<String, String> map, Map<String, Long> map2, Map<String, Long> map3) {
        this(str, num, str2, str3, map, map2, map3, ByteString.EMPTY);
    }

    public BlockServer(String str, Integer num, String str2, String str3, Map<String, String> map, Map<String, Long> map2, Map<String, Long> map3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.block_id = str;
        this.code = num;
        this.msg = str2;
        this.entity = str3;
        this.ext_bundles = Internal.immutableCopyOf("ext_bundles", map);
        this.version = Internal.immutableCopyOf(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, map2);
        this.commit_id = Internal.immutableCopyOf("commit_id", map3);
    }
}
