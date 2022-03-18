package com.ss.android.lark.pb.ad;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullSplashADRequest extends Message<PullSplashADRequest, C49411a> {
    public static final ProtoAdapter<PullSplashADRequest> ADAPTER = new C49412b();
    public static final Integer DEFAULT_DISPLAY_HEIGHT = 0;
    public static final Integer DEFAULT_DISPLAY_WIDTH = 0;
    public static final Long DEFAULT_LAST_SPLASH_AD_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Integer mdisplay_height;
    public final Integer mdisplay_width;
    public final Long mlast_splash_ad_id;

    /* renamed from: com.ss.android.lark.pb.ad.PullSplashADRequest$b */
    private static final class C49412b extends ProtoAdapter<PullSplashADRequest> {
        C49412b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullSplashADRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullSplashADRequest pullSplashADRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (pullSplashADRequest.mlast_splash_ad_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, pullSplashADRequest.mlast_splash_ad_id);
            } else {
                i = 0;
            }
            if (pullSplashADRequest.mdisplay_width != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pullSplashADRequest.mdisplay_width);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pullSplashADRequest.mdisplay_height != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, pullSplashADRequest.mdisplay_height);
            }
            return i4 + i3 + pullSplashADRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullSplashADRequest decode(ProtoReader protoReader) throws IOException {
            C49411a aVar = new C49411a();
            aVar.f123939a = 0L;
            aVar.f123940b = 0;
            aVar.f123941c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123939a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f123940b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123941c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullSplashADRequest pullSplashADRequest) throws IOException {
            if (pullSplashADRequest.mlast_splash_ad_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pullSplashADRequest.mlast_splash_ad_id);
            }
            if (pullSplashADRequest.mdisplay_width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullSplashADRequest.mdisplay_width);
            }
            if (pullSplashADRequest.mdisplay_height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, pullSplashADRequest.mdisplay_height);
            }
            protoWriter.writeBytes(pullSplashADRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ad.PullSplashADRequest$a */
    public static final class C49411a extends Message.Builder<PullSplashADRequest, C49411a> {

        /* renamed from: a */
        public Long f123939a;

        /* renamed from: b */
        public Integer f123940b;

        /* renamed from: c */
        public Integer f123941c;

        /* renamed from: a */
        public PullSplashADRequest build() {
            return new PullSplashADRequest(this.f123939a, this.f123940b, this.f123941c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49411a mo172455a(Integer num) {
            this.f123940b = num;
            return this;
        }

        /* renamed from: b */
        public C49411a mo172458b(Integer num) {
            this.f123941c = num;
            return this;
        }

        /* renamed from: a */
        public C49411a mo172456a(Long l) {
            this.f123939a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49411a newBuilder() {
        C49411a aVar = new C49411a();
        aVar.f123939a = this.mlast_splash_ad_id;
        aVar.f123940b = this.mdisplay_width;
        aVar.f123941c = this.mdisplay_height;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mlast_splash_ad_id != null) {
            sb.append(", last_splash_ad_id=");
            sb.append(this.mlast_splash_ad_id);
        }
        if (this.mdisplay_width != null) {
            sb.append(", display_width=");
            sb.append(this.mdisplay_width);
        }
        if (this.mdisplay_height != null) {
            sb.append(", display_height=");
            sb.append(this.mdisplay_height);
        }
        StringBuilder replace = sb.replace(0, 2, "PullSplashADRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullSplashADRequest(Long l, Integer num, Integer num2) {
        this(l, num, num2, ByteString.EMPTY);
    }

    public PullSplashADRequest(Long l, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlast_splash_ad_id = l;
        this.mdisplay_width = num;
        this.mdisplay_height = num2;
    }
}
