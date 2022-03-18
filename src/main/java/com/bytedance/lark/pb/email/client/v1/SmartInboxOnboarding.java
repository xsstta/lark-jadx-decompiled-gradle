package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SmartInboxOnboarding extends Message<SmartInboxOnboarding, C16986a> {
    public static final ProtoAdapter<SmartInboxOnboarding> ADAPTER = new C16987b();
    public static final Boolean DEFAULT_SMART_INBOX_ALERT_RENDERED = true;
    public static final Boolean DEFAULT_SMART_INBOX_PROMPT_RENDERED = true;
    private static final long serialVersionUID = 0;
    public final Boolean smart_inbox_alert_rendered;
    public final Boolean smart_inbox_prompt_rendered;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SmartInboxOnboarding$b */
    private static final class C16987b extends ProtoAdapter<SmartInboxOnboarding> {
        C16987b() {
            super(FieldEncoding.LENGTH_DELIMITED, SmartInboxOnboarding.class);
        }

        /* renamed from: a */
        public int encodedSize(SmartInboxOnboarding smartInboxOnboarding) {
            int i;
            int i2 = 0;
            if (smartInboxOnboarding.smart_inbox_prompt_rendered != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, smartInboxOnboarding.smart_inbox_prompt_rendered);
            } else {
                i = 0;
            }
            if (smartInboxOnboarding.smart_inbox_alert_rendered != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, smartInboxOnboarding.smart_inbox_alert_rendered);
            }
            return i + i2 + smartInboxOnboarding.unknownFields().size();
        }

        /* renamed from: a */
        public SmartInboxOnboarding decode(ProtoReader protoReader) throws IOException {
            C16986a aVar = new C16986a();
            aVar.f43592a = true;
            aVar.f43593b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43592a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43593b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SmartInboxOnboarding smartInboxOnboarding) throws IOException {
            if (smartInboxOnboarding.smart_inbox_prompt_rendered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, smartInboxOnboarding.smart_inbox_prompt_rendered);
            }
            if (smartInboxOnboarding.smart_inbox_alert_rendered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, smartInboxOnboarding.smart_inbox_alert_rendered);
            }
            protoWriter.writeBytes(smartInboxOnboarding.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SmartInboxOnboarding$a */
    public static final class C16986a extends Message.Builder<SmartInboxOnboarding, C16986a> {

        /* renamed from: a */
        public Boolean f43592a;

        /* renamed from: b */
        public Boolean f43593b;

        /* renamed from: a */
        public SmartInboxOnboarding build() {
            return new SmartInboxOnboarding(this.f43592a, this.f43593b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16986a newBuilder() {
        C16986a aVar = new C16986a();
        aVar.f43592a = this.smart_inbox_prompt_rendered;
        aVar.f43593b = this.smart_inbox_alert_rendered;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "SmartInboxOnboarding");
        StringBuilder sb = new StringBuilder();
        if (this.smart_inbox_prompt_rendered != null) {
            sb.append(", smart_inbox_prompt_rendered=");
            sb.append(this.smart_inbox_prompt_rendered);
        }
        if (this.smart_inbox_alert_rendered != null) {
            sb.append(", smart_inbox_alert_rendered=");
            sb.append(this.smart_inbox_alert_rendered);
        }
        StringBuilder replace = sb.replace(0, 2, "SmartInboxOnboarding{");
        replace.append('}');
        return replace.toString();
    }

    public SmartInboxOnboarding(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public SmartInboxOnboarding(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.smart_inbox_prompt_rendered = bool;
        this.smart_inbox_alert_rendered = bool2;
    }
}
