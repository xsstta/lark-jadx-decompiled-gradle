package com.bytedance.lark.pb.statistics.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushHideChannelRequest extends Message<PushHideChannelRequest, C19415a> {
    public static final ProtoAdapter<PushHideChannelRequest> ADAPTER = new C19416b();
    public static final Reason DEFAULT_REASON = Reason.UNKNOWN;
    public static final FeedCard.EntityType DEFAULT_TYPE = FeedCard.EntityType.CHAT;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final Reason reason;
    public final FeedCard.EntityType type;

    public enum Reason implements WireEnum {
        UNKNOWN(0),
        DELETE_CHATTER(1),
        GROUP_DISBANDED(2),
        CRYPTO_CHAT_DISBANDED(3),
        FROM_CLIENT(4);
        
        public static final ProtoAdapter<Reason> ADAPTER = ProtoAdapter.newEnumAdapter(Reason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Reason fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DELETE_CHATTER;
            }
            if (i == 2) {
                return GROUP_DISBANDED;
            }
            if (i == 3) {
                return CRYPTO_CHAT_DISBANDED;
            }
            if (i != 4) {
                return null;
            }
            return FROM_CLIENT;
        }

        private Reason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.PushHideChannelRequest$b */
    private static final class C19416b extends ProtoAdapter<PushHideChannelRequest> {
        C19416b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushHideChannelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushHideChannelRequest pushHideChannelRequest) {
            int i;
            int encodedSizeWithTag = Channel.ADAPTER.encodedSizeWithTag(1, pushHideChannelRequest.channel);
            int i2 = 0;
            if (pushHideChannelRequest.type != null) {
                i = FeedCard.EntityType.ADAPTER.encodedSizeWithTag(2, pushHideChannelRequest.type);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pushHideChannelRequest.reason != null) {
                i2 = Reason.ADAPTER.encodedSizeWithTag(3, pushHideChannelRequest.reason);
            }
            return i3 + i2 + pushHideChannelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushHideChannelRequest decode(ProtoReader protoReader) throws IOException {
            C19415a aVar = new C19415a();
            aVar.f47740b = FeedCard.EntityType.CHAT;
            aVar.f47741c = Reason.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47739a = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f47740b = FeedCard.EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47741c = Reason.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushHideChannelRequest pushHideChannelRequest) throws IOException {
            Channel.ADAPTER.encodeWithTag(protoWriter, 1, pushHideChannelRequest.channel);
            if (pushHideChannelRequest.type != null) {
                FeedCard.EntityType.ADAPTER.encodeWithTag(protoWriter, 2, pushHideChannelRequest.type);
            }
            if (pushHideChannelRequest.reason != null) {
                Reason.ADAPTER.encodeWithTag(protoWriter, 3, pushHideChannelRequest.reason);
            }
            protoWriter.writeBytes(pushHideChannelRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19415a newBuilder() {
        C19415a aVar = new C19415a();
        aVar.f47739a = this.channel;
        aVar.f47740b = this.type;
        aVar.f47741c = this.reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.PushHideChannelRequest$a */
    public static final class C19415a extends Message.Builder<PushHideChannelRequest, C19415a> {

        /* renamed from: a */
        public Channel f47739a;

        /* renamed from: b */
        public FeedCard.EntityType f47740b;

        /* renamed from: c */
        public Reason f47741c;

        /* renamed from: a */
        public PushHideChannelRequest build() {
            Channel channel = this.f47739a;
            if (channel != null) {
                return new PushHideChannelRequest(channel, this.f47740b, this.f47741c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channel, "channel");
        }

        /* renamed from: a */
        public C19415a mo66104a(Channel channel) {
            this.f47739a = channel;
            return this;
        }

        /* renamed from: a */
        public C19415a mo66105a(FeedCard.EntityType entityType) {
            this.f47740b = entityType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("statistics", "PushHideChannelRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        StringBuilder replace = sb.replace(0, 2, "PushHideChannelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushHideChannelRequest(Channel channel2, FeedCard.EntityType entityType, Reason reason2) {
        this(channel2, entityType, reason2, ByteString.EMPTY);
    }

    public PushHideChannelRequest(Channel channel2, FeedCard.EntityType entityType, Reason reason2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = channel2;
        this.type = entityType;
        this.reason = reason2;
    }
}
