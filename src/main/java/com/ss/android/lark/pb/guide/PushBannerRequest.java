package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushBannerRequest extends Message<PushBannerRequest, C49794a> {
    public static final ProtoAdapter<PushBannerRequest> ADAPTER = new C49795b();
    private static final long serialVersionUID = 0;
    public final BannerScene mscene;

    /* renamed from: com.ss.android.lark.pb.guide.PushBannerRequest$b */
    private static final class C49795b extends ProtoAdapter<PushBannerRequest> {
        C49795b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushBannerRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushBannerRequest pushBannerRequest) {
            return BannerScene.ADAPTER.encodedSizeWithTag(1, pushBannerRequest.mscene) + pushBannerRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushBannerRequest decode(ProtoReader protoReader) throws IOException {
            C49794a aVar = new C49794a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124727a = BannerScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushBannerRequest pushBannerRequest) throws IOException {
            BannerScene.ADAPTER.encodeWithTag(protoWriter, 1, pushBannerRequest.mscene);
            protoWriter.writeBytes(pushBannerRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.PushBannerRequest$a */
    public static final class C49794a extends Message.Builder<PushBannerRequest, C49794a> {

        /* renamed from: a */
        public BannerScene f124727a;

        /* renamed from: a */
        public PushBannerRequest build() {
            BannerScene bannerScene = this.f124727a;
            if (bannerScene != null) {
                return new PushBannerRequest(bannerScene, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bannerScene, "mscene");
        }
    }

    @Override // com.squareup.wire.Message
    public C49794a newBuilder() {
        C49794a aVar = new C49794a();
        aVar.f124727a = this.mscene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.mscene);
        StringBuilder replace = sb.replace(0, 2, "PushBannerRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushBannerRequest(BannerScene bannerScene) {
        this(bannerScene, ByteString.EMPTY);
    }

    public PushBannerRequest(BannerScene bannerScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mscene = bannerScene;
    }
}
