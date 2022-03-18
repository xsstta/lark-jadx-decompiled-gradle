package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class BotCheckStatus extends Message<BotCheckStatus, C49644a> {
    public static final ProtoAdapter<BotCheckStatus> ADAPTER = new C49645b();
    public static final Long DEFAULT_BOT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long mbot_id;
    public final BotUsageStatus mstatus;
    public final BotTipsContent mtips;

    public enum BotUsageStatus implements WireEnum {
        BOT_USABLE(1),
        BOT_TENANT_FORBIDDEN(2),
        BOT_PLATFORM_FORBIDDEN(3),
        BOT_DEVELOPER_FORBIDDEN(4),
        BOT_OFFLINE(5),
        BOT_USER_UNVISIBLE(6);
        
        public static final ProtoAdapter<BotUsageStatus> ADAPTER = ProtoAdapter.newEnumAdapter(BotUsageStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static BotUsageStatus fromValue(int i) {
            switch (i) {
                case 1:
                    return BOT_USABLE;
                case 2:
                    return BOT_TENANT_FORBIDDEN;
                case 3:
                    return BOT_PLATFORM_FORBIDDEN;
                case 4:
                    return BOT_DEVELOPER_FORBIDDEN;
                case 5:
                    return BOT_OFFLINE;
                case 6:
                    return BOT_USER_UNVISIBLE;
                default:
                    return null;
            }
        }

        private BotUsageStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.BotCheckStatus$b */
    private static final class C49645b extends ProtoAdapter<BotCheckStatus> {
        C49645b() {
            super(FieldEncoding.LENGTH_DELIMITED, BotCheckStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(BotCheckStatus botCheckStatus) {
            int i;
            int i2;
            int i3 = 0;
            if (botCheckStatus.mbot_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, botCheckStatus.mbot_id);
            } else {
                i = 0;
            }
            if (botCheckStatus.mstatus != null) {
                i2 = BotUsageStatus.ADAPTER.encodedSizeWithTag(2, botCheckStatus.mstatus);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (botCheckStatus.mtips != null) {
                i3 = BotTipsContent.ADAPTER.encodedSizeWithTag(3, botCheckStatus.mtips);
            }
            return i4 + i3 + botCheckStatus.unknownFields().size();
        }

        /* renamed from: a */
        public BotCheckStatus decode(ProtoReader protoReader) throws IOException {
            C49644a aVar = new C49644a();
            aVar.f124314a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124314a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f124315b = BotUsageStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124316c = BotTipsContent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BotCheckStatus botCheckStatus) throws IOException {
            if (botCheckStatus.mbot_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, botCheckStatus.mbot_id);
            }
            if (botCheckStatus.mstatus != null) {
                BotUsageStatus.ADAPTER.encodeWithTag(protoWriter, 2, botCheckStatus.mstatus);
            }
            if (botCheckStatus.mtips != null) {
                BotTipsContent.ADAPTER.encodeWithTag(protoWriter, 3, botCheckStatus.mtips);
            }
            protoWriter.writeBytes(botCheckStatus.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.BotCheckStatus$a */
    public static final class C49644a extends Message.Builder<BotCheckStatus, C49644a> {

        /* renamed from: a */
        public Long f124314a;

        /* renamed from: b */
        public BotUsageStatus f124315b;

        /* renamed from: c */
        public BotTipsContent f124316c;

        /* renamed from: a */
        public BotCheckStatus build() {
            return new BotCheckStatus(this.f124314a, this.f124315b, this.f124316c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49644a newBuilder() {
        C49644a aVar = new C49644a();
        aVar.f124314a = this.mbot_id;
        aVar.f124315b = this.mstatus;
        aVar.f124316c = this.mtips;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mbot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.mbot_id);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mtips != null) {
            sb.append(", tips=");
            sb.append(this.mtips);
        }
        StringBuilder replace = sb.replace(0, 2, "BotCheckStatus{");
        replace.append('}');
        return replace.toString();
    }

    public BotCheckStatus(Long l, BotUsageStatus botUsageStatus, BotTipsContent botTipsContent) {
        this(l, botUsageStatus, botTipsContent, ByteString.EMPTY);
    }

    public BotCheckStatus(Long l, BotUsageStatus botUsageStatus, BotTipsContent botTipsContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbot_id = l;
        this.mstatus = botUsageStatus;
        this.mtips = botTipsContent;
    }
}
