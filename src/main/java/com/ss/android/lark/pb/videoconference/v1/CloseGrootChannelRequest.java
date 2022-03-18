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

public final class CloseGrootChannelRequest extends Message<CloseGrootChannelRequest, C50509a> {
    public static final ProtoAdapter<CloseGrootChannelRequest> ADAPTER = new C50510b();
    public static final Boolean DEFAULT_FORCE_CLOSE = false;
    private static final long serialVersionUID = 0;
    public final ChannelMeta channel_meta;
    public final Boolean force_close;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CloseGrootChannelRequest$b */
    private static final class C50510b extends ProtoAdapter<CloseGrootChannelRequest> {
        C50510b() {
            super(FieldEncoding.LENGTH_DELIMITED, CloseGrootChannelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CloseGrootChannelRequest closeGrootChannelRequest) {
            int i;
            int encodedSizeWithTag = ChannelMeta.ADAPTER.encodedSizeWithTag(1, closeGrootChannelRequest.channel_meta);
            if (closeGrootChannelRequest.force_close != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, closeGrootChannelRequest.force_close);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + closeGrootChannelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CloseGrootChannelRequest decode(ProtoReader protoReader) throws IOException {
            C50509a aVar = new C50509a();
            aVar.f126100b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126099a = ChannelMeta.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126100b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CloseGrootChannelRequest closeGrootChannelRequest) throws IOException {
            ChannelMeta.ADAPTER.encodeWithTag(protoWriter, 1, closeGrootChannelRequest.channel_meta);
            if (closeGrootChannelRequest.force_close != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, closeGrootChannelRequest.force_close);
            }
            protoWriter.writeBytes(closeGrootChannelRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CloseGrootChannelRequest$a */
    public static final class C50509a extends Message.Builder<CloseGrootChannelRequest, C50509a> {

        /* renamed from: a */
        public ChannelMeta f126099a;

        /* renamed from: b */
        public Boolean f126100b;

        /* renamed from: a */
        public CloseGrootChannelRequest build() {
            ChannelMeta channelMeta = this.f126099a;
            if (channelMeta != null) {
                return new CloseGrootChannelRequest(channelMeta, this.f126100b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channelMeta, "channel_meta");
        }

        /* renamed from: a */
        public C50509a mo174935a(ChannelMeta channelMeta) {
            this.f126099a = channelMeta;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50509a newBuilder() {
        C50509a aVar = new C50509a();
        aVar.f126099a = this.channel_meta;
        aVar.f126100b = this.force_close;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CloseGrootChannelRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_meta=");
        sb.append(this.channel_meta);
        if (this.force_close != null) {
            sb.append(", force_close=");
            sb.append(this.force_close);
        }
        StringBuilder replace = sb.replace(0, 2, "CloseGrootChannelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CloseGrootChannelRequest(ChannelMeta channelMeta, Boolean bool) {
        this(channelMeta, bool, ByteString.EMPTY);
    }

    public CloseGrootChannelRequest(ChannelMeta channelMeta, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_meta = channelMeta;
        this.force_close = bool;
    }
}
