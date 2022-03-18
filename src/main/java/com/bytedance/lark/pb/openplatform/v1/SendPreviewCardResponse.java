package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SendPreviewCardResponse extends Message<SendPreviewCardResponse, C18709a> {
    public static final ProtoAdapter<SendPreviewCardResponse> ADAPTER = new C18710b();
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, Integer> batch_send_status;
    public final Map<String, SendCardInfo> send_card_infos;
    public final Integer status;

    public static final class SendCardInfo extends Message<SendCardInfo, C18707a> {
        public static final ProtoAdapter<SendCardInfo> ADAPTER = new C18708b();
        public static final Integer DEFAULT_STATUS = 0;
        private static final long serialVersionUID = 0;
        public final String open_chat_id;
        public final String open_message_id;
        public final Integer status;

        /* renamed from: com.bytedance.lark.pb.openplatform.v1.SendPreviewCardResponse$SendCardInfo$b */
        private static final class C18708b extends ProtoAdapter<SendCardInfo> {
            C18708b() {
                super(FieldEncoding.LENGTH_DELIMITED, SendCardInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(SendCardInfo sendCardInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (sendCardInfo.status != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, sendCardInfo.status);
                } else {
                    i = 0;
                }
                if (sendCardInfo.open_chat_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sendCardInfo.open_chat_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (sendCardInfo.open_message_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sendCardInfo.open_message_id);
                }
                return i4 + i3 + sendCardInfo.unknownFields().size();
            }

            /* renamed from: a */
            public SendCardInfo decode(ProtoReader protoReader) throws IOException {
                C18707a aVar = new C18707a();
                aVar.f46250a = 0;
                aVar.f46251b = "";
                aVar.f46252c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46250a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f46251b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46252c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SendCardInfo sendCardInfo) throws IOException {
                if (sendCardInfo.status != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, sendCardInfo.status);
                }
                if (sendCardInfo.open_chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendCardInfo.open_chat_id);
                }
                if (sendCardInfo.open_message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sendCardInfo.open_message_id);
                }
                protoWriter.writeBytes(sendCardInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.openplatform.v1.SendPreviewCardResponse$SendCardInfo$a */
        public static final class C18707a extends Message.Builder<SendCardInfo, C18707a> {

            /* renamed from: a */
            public Integer f46250a;

            /* renamed from: b */
            public String f46251b;

            /* renamed from: c */
            public String f46252c;

            /* renamed from: a */
            public SendCardInfo build() {
                return new SendCardInfo(this.f46250a, this.f46251b, this.f46252c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18707a newBuilder() {
            C18707a aVar = new C18707a();
            aVar.f46250a = this.status;
            aVar.f46251b = this.open_chat_id;
            aVar.f46252c = this.open_message_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("openplatform", "SendCardInfo");
            StringBuilder sb = new StringBuilder();
            if (this.status != null) {
                sb.append(", status=");
                sb.append(this.status);
            }
            if (this.open_chat_id != null) {
                sb.append(", open_chat_id=");
                sb.append(this.open_chat_id);
            }
            if (this.open_message_id != null) {
                sb.append(", open_message_id=");
                sb.append(this.open_message_id);
            }
            StringBuilder replace = sb.replace(0, 2, "SendCardInfo{");
            replace.append('}');
            return replace.toString();
        }

        public SendCardInfo(Integer num, String str, String str2) {
            this(num, str, str2, ByteString.EMPTY);
        }

        public SendCardInfo(Integer num, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.status = num;
            this.open_chat_id = str;
            this.open_message_id = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SendPreviewCardResponse$a */
    public static final class C18709a extends Message.Builder<SendPreviewCardResponse, C18709a> {

        /* renamed from: a */
        public Integer f46253a;

        /* renamed from: b */
        public Map<String, Integer> f46254b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, SendCardInfo> f46255c = Internal.newMutableMap();

        /* renamed from: a */
        public SendPreviewCardResponse build() {
            return new SendPreviewCardResponse(this.f46253a, this.f46254b, this.f46255c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SendPreviewCardResponse$b */
    private static final class C18710b extends ProtoAdapter<SendPreviewCardResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f46256a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SendCardInfo>> f46257b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SendCardInfo.ADAPTER);

        C18710b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendPreviewCardResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendPreviewCardResponse sendPreviewCardResponse) {
            int i;
            if (sendPreviewCardResponse.status != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, sendPreviewCardResponse.status);
            } else {
                i = 0;
            }
            return i + this.f46256a.encodedSizeWithTag(2, sendPreviewCardResponse.batch_send_status) + this.f46257b.encodedSizeWithTag(3, sendPreviewCardResponse.send_card_infos) + sendPreviewCardResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendPreviewCardResponse decode(ProtoReader protoReader) throws IOException {
            C18709a aVar = new C18709a();
            aVar.f46253a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46253a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46254b.putAll(this.f46256a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46255c.putAll(this.f46257b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendPreviewCardResponse sendPreviewCardResponse) throws IOException {
            if (sendPreviewCardResponse.status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, sendPreviewCardResponse.status);
            }
            this.f46256a.encodeWithTag(protoWriter, 2, sendPreviewCardResponse.batch_send_status);
            this.f46257b.encodeWithTag(protoWriter, 3, sendPreviewCardResponse.send_card_infos);
            protoWriter.writeBytes(sendPreviewCardResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18709a newBuilder() {
        C18709a aVar = new C18709a();
        aVar.f46253a = this.status;
        aVar.f46254b = Internal.copyOf("batch_send_status", this.batch_send_status);
        aVar.f46255c = Internal.copyOf("send_card_infos", this.send_card_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "SendPreviewCardResponse");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (!this.batch_send_status.isEmpty()) {
            sb.append(", batch_send_status=");
            sb.append(this.batch_send_status);
        }
        if (!this.send_card_infos.isEmpty()) {
            sb.append(", send_card_infos=");
            sb.append(this.send_card_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "SendPreviewCardResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendPreviewCardResponse(Integer num, Map<String, Integer> map, Map<String, SendCardInfo> map2) {
        this(num, map, map2, ByteString.EMPTY);
    }

    public SendPreviewCardResponse(Integer num, Map<String, Integer> map, Map<String, SendCardInfo> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = num;
        this.batch_send_status = Internal.immutableCopyOf("batch_send_status", map);
        this.send_card_infos = Internal.immutableCopyOf("send_card_infos", map2);
    }
}
