package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ChannelMeta extends Message<ChannelMeta, C50499a> {
    public static final ProtoAdapter<ChannelMeta> ADAPTER = new C50500b();
    public static final GrootChannel DEFAULT_CHANNEL = GrootChannel.SKETCH;
    public static final AssociateType DEFAULT_ID_TYPE = AssociateType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String associate_id;
    public final GrootChannel channel;
    public final String channel_id;
    public final AssociateType id_type;

    public enum AssociateType implements WireEnum {
        UNKNOWN(0),
        MEETING(1);
        
        public static final ProtoAdapter<AssociateType> ADAPTER = ProtoAdapter.newEnumAdapter(AssociateType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AssociateType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return MEETING;
        }

        private AssociateType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ChannelMeta$b */
    private static final class C50500b extends ProtoAdapter<ChannelMeta> {
        C50500b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChannelMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ChannelMeta channelMeta) {
            int i;
            int encodedSizeWithTag = GrootChannel.ADAPTER.encodedSizeWithTag(1, channelMeta.channel) + ProtoAdapter.STRING.encodedSizeWithTag(2, channelMeta.channel_id);
            int i2 = 0;
            if (channelMeta.associate_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, channelMeta.associate_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (channelMeta.id_type != null) {
                i2 = AssociateType.ADAPTER.encodedSizeWithTag(4, channelMeta.id_type);
            }
            return i3 + i2 + channelMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ChannelMeta decode(ProtoReader protoReader) throws IOException {
            C50499a aVar = new C50499a();
            aVar.f126089a = GrootChannel.SKETCH;
            aVar.f126090b = "";
            aVar.f126091c = "";
            aVar.f126092d = AssociateType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126089a = GrootChannel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126090b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126091c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126092d = AssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChannelMeta channelMeta) throws IOException {
            GrootChannel.ADAPTER.encodeWithTag(protoWriter, 1, channelMeta.channel);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, channelMeta.channel_id);
            if (channelMeta.associate_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, channelMeta.associate_id);
            }
            if (channelMeta.id_type != null) {
                AssociateType.ADAPTER.encodeWithTag(protoWriter, 4, channelMeta.id_type);
            }
            protoWriter.writeBytes(channelMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50499a newBuilder() {
        C50499a aVar = new C50499a();
        aVar.f126089a = this.channel;
        aVar.f126090b = this.channel_id;
        aVar.f126091c = this.associate_id;
        aVar.f126092d = this.id_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ChannelMeta$a */
    public static final class C50499a extends Message.Builder<ChannelMeta, C50499a> {

        /* renamed from: a */
        public GrootChannel f126089a;

        /* renamed from: b */
        public String f126090b;

        /* renamed from: c */
        public String f126091c;

        /* renamed from: d */
        public AssociateType f126092d;

        /* renamed from: a */
        public ChannelMeta build() {
            String str;
            GrootChannel grootChannel = this.f126089a;
            if (grootChannel != null && (str = this.f126090b) != null) {
                return new ChannelMeta(grootChannel, str, this.f126091c, this.f126092d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(grootChannel, "channel", this.f126090b, "channel_id");
        }

        /* renamed from: a */
        public C50499a mo174910a(GrootChannel grootChannel) {
            this.f126089a = grootChannel;
            return this;
        }

        /* renamed from: a */
        public C50499a mo174911a(String str) {
            this.f126090b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ChannelMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        if (this.associate_id != null) {
            sb.append(", associate_id=");
            sb.append(this.associate_id);
        }
        if (this.id_type != null) {
            sb.append(", id_type=");
            sb.append(this.id_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ChannelMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ChannelMeta(GrootChannel grootChannel, String str, String str2, AssociateType associateType) {
        this(grootChannel, str, str2, associateType, ByteString.EMPTY);
    }

    public ChannelMeta(GrootChannel grootChannel, String str, String str2, AssociateType associateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = grootChannel;
        this.channel_id = str;
        this.associate_id = str2;
        this.id_type = associateType;
    }
}
