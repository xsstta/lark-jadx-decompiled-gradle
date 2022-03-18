package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetBotControlInfoResponse extends Message<GetBotControlInfoResponse, C18655a> {
    public static final ProtoAdapter<GetBotControlInfoResponse> ADAPTER = new C18656b();
    public static final DataFrom DEFAULT_DATA_FROM = DataFrom.Local;
    private static final long serialVersionUID = 0;
    public final BotInfo bot_info;
    public final DataFrom data_from;
    public final GuideTips tips;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse$b */
    private static final class C18656b extends ProtoAdapter<GetBotControlInfoResponse> {
        C18656b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBotControlInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBotControlInfoResponse getBotControlInfoResponse) {
            int i;
            int encodedSizeWithTag = DataFrom.ADAPTER.encodedSizeWithTag(1, getBotControlInfoResponse.data_from);
            int i2 = 0;
            if (getBotControlInfoResponse.bot_info != null) {
                i = BotInfo.ADAPTER.encodedSizeWithTag(2, getBotControlInfoResponse.bot_info);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getBotControlInfoResponse.tips != null) {
                i2 = GuideTips.ADAPTER.encodedSizeWithTag(3, getBotControlInfoResponse.tips);
            }
            return i3 + i2 + getBotControlInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBotControlInfoResponse decode(ProtoReader protoReader) throws IOException {
            C18655a aVar = new C18655a();
            aVar.f46180a = DataFrom.Local;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46180a = DataFrom.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46181b = BotInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46182c = GuideTips.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBotControlInfoResponse getBotControlInfoResponse) throws IOException {
            DataFrom.ADAPTER.encodeWithTag(protoWriter, 1, getBotControlInfoResponse.data_from);
            if (getBotControlInfoResponse.bot_info != null) {
                BotInfo.ADAPTER.encodeWithTag(protoWriter, 2, getBotControlInfoResponse.bot_info);
            }
            if (getBotControlInfoResponse.tips != null) {
                GuideTips.ADAPTER.encodeWithTag(protoWriter, 3, getBotControlInfoResponse.tips);
            }
            protoWriter.writeBytes(getBotControlInfoResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18655a newBuilder() {
        C18655a aVar = new C18655a();
        aVar.f46180a = this.data_from;
        aVar.f46181b = this.bot_info;
        aVar.f46182c = this.tips;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse$a */
    public static final class C18655a extends Message.Builder<GetBotControlInfoResponse, C18655a> {

        /* renamed from: a */
        public DataFrom f46180a;

        /* renamed from: b */
        public BotInfo f46181b;

        /* renamed from: c */
        public GuideTips f46182c;

        /* renamed from: a */
        public GetBotControlInfoResponse build() {
            DataFrom dataFrom = this.f46180a;
            if (dataFrom != null) {
                return new GetBotControlInfoResponse(dataFrom, this.f46181b, this.f46182c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(dataFrom, "data_from");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetBotControlInfoResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", data_from=");
        sb.append(this.data_from);
        if (this.bot_info != null) {
            sb.append(", bot_info=");
            sb.append(this.bot_info);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBotControlInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBotControlInfoResponse(DataFrom dataFrom, BotInfo botInfo, GuideTips guideTips) {
        this(dataFrom, botInfo, guideTips, ByteString.EMPTY);
    }

    public GetBotControlInfoResponse(DataFrom dataFrom, BotInfo botInfo, GuideTips guideTips, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_from = dataFrom;
        this.bot_info = botInfo;
        this.tips = guideTips;
    }
}
