package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BotInfo extends Message<BotInfo, C18634a> {
    public static final ProtoAdapter<BotInfo> ADAPTER = new C18635b();
    public static final CommonUsageStatus DEFAULT_STATUS = CommonUsageStatus.USABLE;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String bot_id;
    public final String local_name;
    public final CommonUsageStatus status;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.BotInfo$b */
    private static final class C18635b extends ProtoAdapter<BotInfo> {
        C18635b() {
            super(FieldEncoding.LENGTH_DELIMITED, BotInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(BotInfo botInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (botInfo.bot_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, botInfo.bot_id);
            } else {
                i = 0;
            }
            if (botInfo.app_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, botInfo.app_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (botInfo.local_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, botInfo.local_name);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (botInfo.status != null) {
                i4 = CommonUsageStatus.ADAPTER.encodedSizeWithTag(4, botInfo.status);
            }
            return i6 + i4 + botInfo.unknownFields().size();
        }

        /* renamed from: a */
        public BotInfo decode(ProtoReader protoReader) throws IOException {
            C18634a aVar = new C18634a();
            aVar.f46153a = "";
            aVar.f46154b = "";
            aVar.f46155c = "";
            aVar.f46156d = CommonUsageStatus.USABLE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46153a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46154b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46155c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46156d = CommonUsageStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BotInfo botInfo) throws IOException {
            if (botInfo.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, botInfo.bot_id);
            }
            if (botInfo.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, botInfo.app_id);
            }
            if (botInfo.local_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, botInfo.local_name);
            }
            if (botInfo.status != null) {
                CommonUsageStatus.ADAPTER.encodeWithTag(protoWriter, 4, botInfo.status);
            }
            protoWriter.writeBytes(botInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.BotInfo$a */
    public static final class C18634a extends Message.Builder<BotInfo, C18634a> {

        /* renamed from: a */
        public String f46153a;

        /* renamed from: b */
        public String f46154b;

        /* renamed from: c */
        public String f46155c;

        /* renamed from: d */
        public CommonUsageStatus f46156d;

        /* renamed from: a */
        public BotInfo build() {
            return new BotInfo(this.f46153a, this.f46154b, this.f46155c, this.f46156d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18634a newBuilder() {
        C18634a aVar = new C18634a();
        aVar.f46153a = this.bot_id;
        aVar.f46154b = this.app_id;
        aVar.f46155c = this.local_name;
        aVar.f46156d = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "BotInfo");
        StringBuilder sb = new StringBuilder();
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.local_name != null) {
            sb.append(", local_name=");
            sb.append(this.local_name);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "BotInfo{");
        replace.append('}');
        return replace.toString();
    }

    public BotInfo(String str, String str2, String str3, CommonUsageStatus commonUsageStatus) {
        this(str, str2, str3, commonUsageStatus, ByteString.EMPTY);
    }

    public BotInfo(String str, String str2, String str3, CommonUsageStatus commonUsageStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bot_id = str;
        this.app_id = str2;
        this.local_name = str3;
        this.status = commonUsageStatus;
    }
}
