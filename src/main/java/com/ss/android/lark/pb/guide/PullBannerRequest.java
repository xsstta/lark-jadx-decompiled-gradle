package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PullBannerRequest extends Message<PullBannerRequest, C49786a> {
    public static final ProtoAdapter<PullBannerRequest> ADAPTER = new C49787b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> mextra;
    public final BannerScene mscene;

    /* renamed from: com.ss.android.lark.pb.guide.PullBannerRequest$a */
    public static final class C49786a extends Message.Builder<PullBannerRequest, C49786a> {

        /* renamed from: a */
        public BannerScene f124720a;

        /* renamed from: b */
        public Map<String, String> f124721b = Internal.newMutableMap();

        /* renamed from: a */
        public PullBannerRequest build() {
            BannerScene bannerScene = this.f124720a;
            if (bannerScene != null) {
                return new PullBannerRequest(bannerScene, this.f124721b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bannerScene, "mscene");
        }

        /* renamed from: a */
        public C49786a mo173314a(BannerScene bannerScene) {
            this.f124720a = bannerScene;
            return this;
        }

        /* renamed from: a */
        public C49786a mo173315a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f124721b = map;
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.PullBannerRequest$b */
    private static final class C49787b extends ProtoAdapter<PullBannerRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124722a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49787b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullBannerRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullBannerRequest pullBannerRequest) {
            return BannerScene.ADAPTER.encodedSizeWithTag(1, pullBannerRequest.mscene) + this.f124722a.encodedSizeWithTag(2, pullBannerRequest.mextra) + pullBannerRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullBannerRequest decode(ProtoReader protoReader) throws IOException {
            C49786a aVar = new C49786a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124720a = BannerScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124721b.putAll(this.f124722a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullBannerRequest pullBannerRequest) throws IOException {
            BannerScene.ADAPTER.encodeWithTag(protoWriter, 1, pullBannerRequest.mscene);
            this.f124722a.encodeWithTag(protoWriter, 2, pullBannerRequest.mextra);
            protoWriter.writeBytes(pullBannerRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49786a newBuilder() {
        C49786a aVar = new C49786a();
        aVar.f124720a = this.mscene;
        aVar.f124721b = Internal.copyOf("mextra", this.mextra);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.mscene);
        if (!this.mextra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.mextra);
        }
        StringBuilder replace = sb.replace(0, 2, "PullBannerRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullBannerRequest(BannerScene bannerScene, Map<String, String> map) {
        this(bannerScene, map, ByteString.EMPTY);
    }

    public PullBannerRequest(BannerScene bannerScene, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mscene = bannerScene;
        this.mextra = Internal.immutableCopyOf("mextra", map);
    }
}
