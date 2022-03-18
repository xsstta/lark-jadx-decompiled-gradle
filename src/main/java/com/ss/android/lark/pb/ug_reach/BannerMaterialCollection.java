package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BannerMaterialCollection extends Message<BannerMaterialCollection, C50110a> {
    public static final ProtoAdapter<BannerMaterialCollection> ADAPTER = new C50111b();
    private static final long serialVersionUID = 0;
    public final List<BannerMaterial> mbanners;

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerMaterialCollection$b */
    private static final class C50111b extends ProtoAdapter<BannerMaterialCollection> {
        C50111b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerMaterialCollection.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerMaterialCollection bannerMaterialCollection) {
            return BannerMaterial.ADAPTER.asRepeated().encodedSizeWithTag(1, bannerMaterialCollection.mbanners) + bannerMaterialCollection.unknownFields().size();
        }

        /* renamed from: a */
        public BannerMaterialCollection decode(ProtoReader protoReader) throws IOException {
            C50110a aVar = new C50110a();
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
                    aVar.f125248a.add(BannerMaterial.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BannerMaterialCollection bannerMaterialCollection) throws IOException {
            BannerMaterial.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bannerMaterialCollection.mbanners);
            protoWriter.writeBytes(bannerMaterialCollection.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerMaterialCollection$a */
    public static final class C50110a extends Message.Builder<BannerMaterialCollection, C50110a> {

        /* renamed from: a */
        public List<BannerMaterial> f125248a = Internal.newMutableList();

        /* renamed from: a */
        public BannerMaterialCollection build() {
            return new BannerMaterialCollection(this.f125248a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50110a newBuilder() {
        C50110a aVar = new C50110a();
        aVar.f125248a = Internal.copyOf("mbanners", this.mbanners);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mbanners.isEmpty()) {
            sb.append(", banners=");
            sb.append(this.mbanners);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerMaterialCollection{");
        replace.append('}');
        return replace.toString();
    }

    public BannerMaterialCollection(List<BannerMaterial> list) {
        this(list, ByteString.EMPTY);
    }

    public BannerMaterialCollection(List<BannerMaterial> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbanners = Internal.immutableCopyOf("mbanners", list);
    }
}
