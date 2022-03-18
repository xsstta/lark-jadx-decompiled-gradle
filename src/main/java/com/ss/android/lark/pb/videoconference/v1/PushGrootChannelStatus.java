package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushGrootChannelStatus extends Message<PushGrootChannelStatus, C50950a> {
    public static final ProtoAdapter<PushGrootChannelStatus> ADAPTER = new C50951b();
    public static final Status DEFAULT_STATUS = Status.CONNECTING;
    public static final UnavailableReason DEFAULT_UNAVAILABLE_REASON = UnavailableReason.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ChannelMeta channel_meta;
    public final Status status;
    public final UnavailableReason unavailable_reason;

    public enum Status implements WireEnum {
        CONNECTING(1),
        CONNECTED(2),
        UNALAILABLE(3),
        WILL_BE_CLOSED(4),
        CLOSED(5);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return CONNECTING;
            }
            if (i == 2) {
                return CONNECTED;
            }
            if (i == 3) {
                return UNALAILABLE;
            }
            if (i == 4) {
                return WILL_BE_CLOSED;
            }
            if (i != 5) {
                return null;
            }
            return CLOSED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum UnavailableReason implements WireEnum {
        UNKNOWN(0),
        SERVER_CLOSED(1);
        
        public static final ProtoAdapter<UnavailableReason> ADAPTER = ProtoAdapter.newEnumAdapter(UnavailableReason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UnavailableReason fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return SERVER_CLOSED;
        }

        private UnavailableReason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushGrootChannelStatus$b */
    private static final class C50951b extends ProtoAdapter<PushGrootChannelStatus> {
        C50951b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushGrootChannelStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(PushGrootChannelStatus pushGrootChannelStatus) {
            int i;
            int encodedSizeWithTag = ChannelMeta.ADAPTER.encodedSizeWithTag(1, pushGrootChannelStatus.channel_meta) + Status.ADAPTER.encodedSizeWithTag(2, pushGrootChannelStatus.status);
            if (pushGrootChannelStatus.unavailable_reason != null) {
                i = UnavailableReason.ADAPTER.encodedSizeWithTag(3, pushGrootChannelStatus.unavailable_reason);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushGrootChannelStatus.unknownFields().size();
        }

        /* renamed from: a */
        public PushGrootChannelStatus decode(ProtoReader protoReader) throws IOException {
            C50950a aVar = new C50950a();
            aVar.f126971b = Status.CONNECTING;
            aVar.f126972c = UnavailableReason.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126970a = ChannelMeta.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126971b = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126972c = UnavailableReason.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushGrootChannelStatus pushGrootChannelStatus) throws IOException {
            ChannelMeta.ADAPTER.encodeWithTag(protoWriter, 1, pushGrootChannelStatus.channel_meta);
            Status.ADAPTER.encodeWithTag(protoWriter, 2, pushGrootChannelStatus.status);
            if (pushGrootChannelStatus.unavailable_reason != null) {
                UnavailableReason.ADAPTER.encodeWithTag(protoWriter, 3, pushGrootChannelStatus.unavailable_reason);
            }
            protoWriter.writeBytes(pushGrootChannelStatus.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50950a newBuilder() {
        C50950a aVar = new C50950a();
        aVar.f126970a = this.channel_meta;
        aVar.f126971b = this.status;
        aVar.f126972c = this.unavailable_reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushGrootChannelStatus$a */
    public static final class C50950a extends Message.Builder<PushGrootChannelStatus, C50950a> {

        /* renamed from: a */
        public ChannelMeta f126970a;

        /* renamed from: b */
        public Status f126971b;

        /* renamed from: c */
        public UnavailableReason f126972c;

        /* renamed from: a */
        public PushGrootChannelStatus build() {
            Status status;
            ChannelMeta channelMeta = this.f126970a;
            if (channelMeta != null && (status = this.f126971b) != null) {
                return new PushGrootChannelStatus(channelMeta, status, this.f126972c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channelMeta, "channel_meta", this.f126971b, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PushGrootChannelStatus");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_meta=");
        sb.append(this.channel_meta);
        sb.append(", status=");
        sb.append(this.status);
        if (this.unavailable_reason != null) {
            sb.append(", unavailable_reason=");
            sb.append(this.unavailable_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "PushGrootChannelStatus{");
        replace.append('}');
        return replace.toString();
    }

    public PushGrootChannelStatus(ChannelMeta channelMeta, Status status2, UnavailableReason unavailableReason) {
        this(channelMeta, status2, unavailableReason, ByteString.EMPTY);
    }

    public PushGrootChannelStatus(ChannelMeta channelMeta, Status status2, UnavailableReason unavailableReason, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_meta = channelMeta;
        this.status = status2;
        this.unavailable_reason = unavailableReason;
    }
}
