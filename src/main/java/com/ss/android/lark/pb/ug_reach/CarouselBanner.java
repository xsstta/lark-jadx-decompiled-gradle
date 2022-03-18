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

public final class CarouselBanner extends Message<CarouselBanner, C50118a> {
    public static final ProtoAdapter<CarouselBanner> ADAPTER = new C50119b();
    private static final long serialVersionUID = 0;
    public final List<NormalBannerMaterial> mbanners;

    /* renamed from: com.ss.android.lark.pb.ug_reach.CarouselBanner$b */
    private static final class C50119b extends ProtoAdapter<CarouselBanner> {
        C50119b() {
            super(FieldEncoding.LENGTH_DELIMITED, CarouselBanner.class);
        }

        /* renamed from: a */
        public int encodedSize(CarouselBanner carouselBanner) {
            return NormalBannerMaterial.ADAPTER.asRepeated().encodedSizeWithTag(1, carouselBanner.mbanners) + carouselBanner.unknownFields().size();
        }

        /* renamed from: a */
        public CarouselBanner decode(ProtoReader protoReader) throws IOException {
            C50118a aVar = new C50118a();
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
                    aVar.f125272a.add(NormalBannerMaterial.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CarouselBanner carouselBanner) throws IOException {
            NormalBannerMaterial.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, carouselBanner.mbanners);
            protoWriter.writeBytes(carouselBanner.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.CarouselBanner$a */
    public static final class C50118a extends Message.Builder<CarouselBanner, C50118a> {

        /* renamed from: a */
        public List<NormalBannerMaterial> f125272a = Internal.newMutableList();

        /* renamed from: a */
        public CarouselBanner build() {
            return new CarouselBanner(this.f125272a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50118a newBuilder() {
        C50118a aVar = new C50118a();
        aVar.f125272a = Internal.copyOf("mbanners", this.mbanners);
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
        StringBuilder replace = sb.replace(0, 2, "CarouselBanner{");
        replace.append('}');
        return replace.toString();
    }

    public CarouselBanner(List<NormalBannerMaterial> list) {
        this(list, ByteString.EMPTY);
    }

    public CarouselBanner(List<NormalBannerMaterial> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbanners = Internal.immutableCopyOf("mbanners", list);
    }
}
