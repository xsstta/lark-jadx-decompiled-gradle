package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class OpenGrootChannelRequest extends Message<OpenGrootChannelRequest, C50892a> {
    public static final ProtoAdapter<OpenGrootChannelRequest> ADAPTER = new C50893b();
    public static final Long DEFAULT_ASSOCIATE_ID = 0L;
    public static final Integer DEFAULT_INIT_DOWN_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Long associate_id;
    public final ChannelMeta channel_meta;
    public final Integer init_down_version;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.OpenGrootChannelRequest$b */
    private static final class C50893b extends ProtoAdapter<OpenGrootChannelRequest> {
        C50893b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenGrootChannelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenGrootChannelRequest openGrootChannelRequest) {
            int i;
            int encodedSizeWithTag = ChannelMeta.ADAPTER.encodedSizeWithTag(1, openGrootChannelRequest.channel_meta);
            int i2 = 0;
            if (openGrootChannelRequest.init_down_version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, openGrootChannelRequest.init_down_version);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (openGrootChannelRequest.associate_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, openGrootChannelRequest.associate_id);
            }
            return i3 + i2 + openGrootChannelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public OpenGrootChannelRequest decode(ProtoReader protoReader) throws IOException {
            C50892a aVar = new C50892a();
            aVar.f126824b = 0;
            aVar.f126825c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126823a = ChannelMeta.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126824b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126825c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OpenGrootChannelRequest openGrootChannelRequest) throws IOException {
            ChannelMeta.ADAPTER.encodeWithTag(protoWriter, 1, openGrootChannelRequest.channel_meta);
            if (openGrootChannelRequest.init_down_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, openGrootChannelRequest.init_down_version);
            }
            if (openGrootChannelRequest.associate_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, openGrootChannelRequest.associate_id);
            }
            protoWriter.writeBytes(openGrootChannelRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50892a newBuilder() {
        C50892a aVar = new C50892a();
        aVar.f126823a = this.channel_meta;
        aVar.f126824b = this.init_down_version;
        aVar.f126825c = this.associate_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.OpenGrootChannelRequest$a */
    public static final class C50892a extends Message.Builder<OpenGrootChannelRequest, C50892a> {

        /* renamed from: a */
        public ChannelMeta f126823a;

        /* renamed from: b */
        public Integer f126824b;

        /* renamed from: c */
        public Long f126825c;

        /* renamed from: a */
        public OpenGrootChannelRequest build() {
            ChannelMeta channelMeta = this.f126823a;
            if (channelMeta != null) {
                return new OpenGrootChannelRequest(channelMeta, this.f126824b, this.f126825c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channelMeta, "channel_meta");
        }

        /* renamed from: a */
        public C50892a mo175824a(ChannelMeta channelMeta) {
            this.f126823a = channelMeta;
            return this;
        }

        /* renamed from: a */
        public C50892a mo175825a(Integer num) {
            this.f126824b = num;
            return this;
        }

        /* renamed from: a */
        public C50892a mo175826a(Long l) {
            this.f126825c = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "OpenGrootChannelRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_meta=");
        sb.append(this.channel_meta);
        if (this.init_down_version != null) {
            sb.append(", init_down_version=");
            sb.append(this.init_down_version);
        }
        if (this.associate_id != null) {
            sb.append(", associate_id=");
            sb.append(this.associate_id);
        }
        StringBuilder replace = sb.replace(0, 2, "OpenGrootChannelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public OpenGrootChannelRequest(ChannelMeta channelMeta, Integer num, Long l) {
        this(channelMeta, num, l, ByteString.EMPTY);
    }

    public OpenGrootChannelRequest(ChannelMeta channelMeta, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_meta = channelMeta;
        this.init_down_version = num;
        this.associate_id = l;
    }
}
