package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SendPreviewCardRequest extends Message<SendPreviewCardRequest, C18705a> {
    public static final ProtoAdapter<SendPreviewCardRequest> ADAPTER = new C18706b();
    public static final SendCardVersion DEFAULT_VERSION = SendCardVersion.v1;
    private static final long serialVersionUID = 0;
    public final String card_key;
    public final String chat_id;
    public final List<String> chat_ids;
    public final SendCardVersion version;

    public enum SendCardVersion implements WireEnum {
        v1(1),
        v2(2);
        
        public static final ProtoAdapter<SendCardVersion> ADAPTER = ProtoAdapter.newEnumAdapter(SendCardVersion.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SendCardVersion fromValue(int i) {
            if (i == 1) {
                return v1;
            }
            if (i != 2) {
                return null;
            }
            return v2;
        }

        private SendCardVersion(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SendPreviewCardRequest$b */
    private static final class C18706b extends ProtoAdapter<SendPreviewCardRequest> {
        C18706b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendPreviewCardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendPreviewCardRequest sendPreviewCardRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (sendPreviewCardRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendPreviewCardRequest.chat_id);
            } else {
                i = 0;
            }
            if (sendPreviewCardRequest.card_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sendPreviewCardRequest.card_key);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, sendPreviewCardRequest.chat_ids);
            if (sendPreviewCardRequest.version != null) {
                i3 = SendCardVersion.ADAPTER.encodedSizeWithTag(4, sendPreviewCardRequest.version);
            }
            return encodedSizeWithTag + i3 + sendPreviewCardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendPreviewCardRequest decode(ProtoReader protoReader) throws IOException {
            C18705a aVar = new C18705a();
            aVar.f46246a = "";
            aVar.f46247b = "";
            aVar.f46249d = SendCardVersion.v1;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46246a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46247b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46248c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46249d = SendCardVersion.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendPreviewCardRequest sendPreviewCardRequest) throws IOException {
            if (sendPreviewCardRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendPreviewCardRequest.chat_id);
            }
            if (sendPreviewCardRequest.card_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendPreviewCardRequest.card_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, sendPreviewCardRequest.chat_ids);
            if (sendPreviewCardRequest.version != null) {
                SendCardVersion.ADAPTER.encodeWithTag(protoWriter, 4, sendPreviewCardRequest.version);
            }
            protoWriter.writeBytes(sendPreviewCardRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SendPreviewCardRequest$a */
    public static final class C18705a extends Message.Builder<SendPreviewCardRequest, C18705a> {

        /* renamed from: a */
        public String f46246a;

        /* renamed from: b */
        public String f46247b;

        /* renamed from: c */
        public List<String> f46248c = Internal.newMutableList();

        /* renamed from: d */
        public SendCardVersion f46249d;

        /* renamed from: a */
        public SendPreviewCardRequest build() {
            return new SendPreviewCardRequest(this.f46246a, this.f46247b, this.f46248c, this.f46249d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18705a mo64348a(SendCardVersion sendCardVersion) {
            this.f46249d = sendCardVersion;
            return this;
        }

        /* renamed from: a */
        public C18705a mo64349a(String str) {
            this.f46247b = str;
            return this;
        }

        /* renamed from: a */
        public C18705a mo64350a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f46248c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18705a newBuilder() {
        C18705a aVar = new C18705a();
        aVar.f46246a = this.chat_id;
        aVar.f46247b = this.card_key;
        aVar.f46248c = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f46249d = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "SendPreviewCardRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.card_key != null) {
            sb.append(", card_key=");
            sb.append(this.card_key);
        }
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "SendPreviewCardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendPreviewCardRequest(String str, String str2, List<String> list, SendCardVersion sendCardVersion) {
        this(str, str2, list, sendCardVersion, ByteString.EMPTY);
    }

    public SendPreviewCardRequest(String str, String str2, List<String> list, SendCardVersion sendCardVersion, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.card_key = str2;
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.version = sendCardVersion;
    }
}
