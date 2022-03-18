package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ByteSdkRateConfig extends Message<ByteSdkRateConfig, C50485a> {
    public static final ProtoAdapter<ByteSdkRateConfig> ADAPTER = new C50486b();
    public static final Integer DEFAULT_BITRATE_DOWNGRATE_PARTICIPANT_THRESHOLD = 0;
    public static final Integer DEFAULT_HIGH_BITRATE = 0;
    public static final Integer DEFAULT_LOW_BITRATE = 0;
    public static final Integer DEFAULT_MIDDLE_BITRATE = 0;
    private static final long serialVersionUID = 0;
    public final Integer bitrate_downgrate_participant_threshold;
    public final Integer high_bitrate;
    public final Integer low_bitrate;
    public final Integer middle_bitrate;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteSdkRateConfig$b */
    private static final class C50486b extends ProtoAdapter<ByteSdkRateConfig> {
        C50486b() {
            super(FieldEncoding.LENGTH_DELIMITED, ByteSdkRateConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(ByteSdkRateConfig byteSdkRateConfig) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (byteSdkRateConfig.bitrate_downgrate_participant_threshold != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, byteSdkRateConfig.bitrate_downgrate_participant_threshold);
            } else {
                i = 0;
            }
            if (byteSdkRateConfig.high_bitrate != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, byteSdkRateConfig.high_bitrate);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (byteSdkRateConfig.middle_bitrate != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, byteSdkRateConfig.middle_bitrate);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (byteSdkRateConfig.low_bitrate != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, byteSdkRateConfig.low_bitrate);
            }
            return i6 + i4 + byteSdkRateConfig.unknownFields().size();
        }

        /* renamed from: a */
        public ByteSdkRateConfig decode(ProtoReader protoReader) throws IOException {
            C50485a aVar = new C50485a();
            aVar.f126037a = 0;
            aVar.f126038b = 0;
            aVar.f126039c = 0;
            aVar.f126040d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126037a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126038b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126039c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126040d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ByteSdkRateConfig byteSdkRateConfig) throws IOException {
            if (byteSdkRateConfig.bitrate_downgrate_participant_threshold != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, byteSdkRateConfig.bitrate_downgrate_participant_threshold);
            }
            if (byteSdkRateConfig.high_bitrate != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, byteSdkRateConfig.high_bitrate);
            }
            if (byteSdkRateConfig.middle_bitrate != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, byteSdkRateConfig.middle_bitrate);
            }
            if (byteSdkRateConfig.low_bitrate != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, byteSdkRateConfig.low_bitrate);
            }
            protoWriter.writeBytes(byteSdkRateConfig.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteSdkRateConfig$a */
    public static final class C50485a extends Message.Builder<ByteSdkRateConfig, C50485a> {

        /* renamed from: a */
        public Integer f126037a;

        /* renamed from: b */
        public Integer f126038b;

        /* renamed from: c */
        public Integer f126039c;

        /* renamed from: d */
        public Integer f126040d;

        /* renamed from: a */
        public ByteSdkRateConfig build() {
            return new ByteSdkRateConfig(this.f126037a, this.f126038b, this.f126039c, this.f126040d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50485a newBuilder() {
        C50485a aVar = new C50485a();
        aVar.f126037a = this.bitrate_downgrate_participant_threshold;
        aVar.f126038b = this.high_bitrate;
        aVar.f126039c = this.middle_bitrate;
        aVar.f126040d = this.low_bitrate;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ByteSdkRateConfig");
        StringBuilder sb = new StringBuilder();
        if (this.bitrate_downgrate_participant_threshold != null) {
            sb.append(", bitrate_downgrate_participant_threshold=");
            sb.append(this.bitrate_downgrate_participant_threshold);
        }
        if (this.high_bitrate != null) {
            sb.append(", high_bitrate=");
            sb.append(this.high_bitrate);
        }
        if (this.middle_bitrate != null) {
            sb.append(", middle_bitrate=");
            sb.append(this.middle_bitrate);
        }
        if (this.low_bitrate != null) {
            sb.append(", low_bitrate=");
            sb.append(this.low_bitrate);
        }
        StringBuilder replace = sb.replace(0, 2, "ByteSdkRateConfig{");
        replace.append('}');
        return replace.toString();
    }

    public ByteSdkRateConfig(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public ByteSdkRateConfig(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bitrate_downgrate_participant_threshold = num;
        this.high_bitrate = num2;
        this.middle_bitrate = num3;
        this.low_bitrate = num4;
    }
}
