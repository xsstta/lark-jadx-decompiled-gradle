package com.bytedance.lark.pb.sync.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SyncMsgResetConfig extends Message<SyncMsgResetConfig, C19441a> {
    public static final ProtoAdapter<SyncMsgResetConfig> ADAPTER = new C19442b();
    public static final Long DEFAULT_FROM_LAST_MSG_VALUE = 0L;
    public static final SyncMsgResetType DEFAULT_RESET_TYPE = SyncMsgResetType.FROM_LAST_MSG;
    private static final long serialVersionUID = 0;
    public final String from_biz_key_value;
    public final Long from_last_msg_value;
    public final SyncMsgResetType reset_type;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncMsgResetConfig$b */
    private static final class C19442b extends ProtoAdapter<SyncMsgResetConfig> {
        C19442b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncMsgResetConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncMsgResetConfig syncMsgResetConfig) {
            int i;
            int encodedSizeWithTag = SyncMsgResetType.ADAPTER.encodedSizeWithTag(1, syncMsgResetConfig.reset_type);
            int i2 = 0;
            if (syncMsgResetConfig.from_last_msg_value != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, syncMsgResetConfig.from_last_msg_value);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (syncMsgResetConfig.from_biz_key_value != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, syncMsgResetConfig.from_biz_key_value);
            }
            return i3 + i2 + syncMsgResetConfig.unknownFields().size();
        }

        /* renamed from: a */
        public SyncMsgResetConfig decode(ProtoReader protoReader) throws IOException {
            C19441a aVar = new C19441a();
            aVar.f47771a = SyncMsgResetType.FROM_LAST_MSG;
            aVar.f47772b = 0L;
            aVar.f47773c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47771a = SyncMsgResetType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f47772b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47773c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncMsgResetConfig syncMsgResetConfig) throws IOException {
            SyncMsgResetType.ADAPTER.encodeWithTag(protoWriter, 1, syncMsgResetConfig.reset_type);
            if (syncMsgResetConfig.from_last_msg_value != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, syncMsgResetConfig.from_last_msg_value);
            }
            if (syncMsgResetConfig.from_biz_key_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, syncMsgResetConfig.from_biz_key_value);
            }
            protoWriter.writeBytes(syncMsgResetConfig.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19441a newBuilder() {
        C19441a aVar = new C19441a();
        aVar.f47771a = this.reset_type;
        aVar.f47772b = this.from_last_msg_value;
        aVar.f47773c = this.from_biz_key_value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncMsgResetConfig$a */
    public static final class C19441a extends Message.Builder<SyncMsgResetConfig, C19441a> {

        /* renamed from: a */
        public SyncMsgResetType f47771a;

        /* renamed from: b */
        public Long f47772b;

        /* renamed from: c */
        public String f47773c;

        /* renamed from: a */
        public SyncMsgResetConfig build() {
            SyncMsgResetType syncMsgResetType = this.f47771a;
            if (syncMsgResetType != null) {
                return new SyncMsgResetConfig(syncMsgResetType, this.f47772b, this.f47773c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(syncMsgResetType, "reset_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SyncMsgResetConfig");
        StringBuilder sb = new StringBuilder();
        sb.append(", reset_type=");
        sb.append(this.reset_type);
        if (this.from_last_msg_value != null) {
            sb.append(", from_last_msg_value=");
            sb.append(this.from_last_msg_value);
        }
        if (this.from_biz_key_value != null) {
            sb.append(", from_biz_key_value=");
            sb.append(this.from_biz_key_value);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncMsgResetConfig{");
        replace.append('}');
        return replace.toString();
    }

    public SyncMsgResetConfig(SyncMsgResetType syncMsgResetType, Long l, String str) {
        this(syncMsgResetType, l, str, ByteString.EMPTY);
    }

    public SyncMsgResetConfig(SyncMsgResetType syncMsgResetType, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reset_type = syncMsgResetType;
        this.from_last_msg_value = l;
        this.from_biz_key_value = str;
    }
}
