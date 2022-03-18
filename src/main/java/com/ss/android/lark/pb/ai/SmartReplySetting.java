package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SmartReplySetting extends Message<SmartReplySetting, C49525a> {
    public static final ProtoAdapter<SmartReplySetting> ADAPTER = new C49526b();
    public static final Boolean DEFAULT_SMART_ACTION_ENABLED = false;
    public static final Boolean DEFAULT_SMART_REPLY_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final Boolean msmart_action_enabled;
    public final Boolean msmart_reply_enabled;

    /* renamed from: com.ss.android.lark.pb.ai.SmartReplySetting$b */
    private static final class C49526b extends ProtoAdapter<SmartReplySetting> {
        C49526b() {
            super(FieldEncoding.LENGTH_DELIMITED, SmartReplySetting.class);
        }

        /* renamed from: a */
        public int encodedSize(SmartReplySetting smartReplySetting) {
            int i;
            int i2 = 0;
            if (smartReplySetting.msmart_reply_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, smartReplySetting.msmart_reply_enabled);
            } else {
                i = 0;
            }
            if (smartReplySetting.msmart_action_enabled != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, smartReplySetting.msmart_action_enabled);
            }
            return i + i2 + smartReplySetting.unknownFields().size();
        }

        /* renamed from: a */
        public SmartReplySetting decode(ProtoReader protoReader) throws IOException {
            C49525a aVar = new C49525a();
            aVar.f124122a = false;
            aVar.f124123b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124122a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124123b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SmartReplySetting smartReplySetting) throws IOException {
            if (smartReplySetting.msmart_reply_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, smartReplySetting.msmart_reply_enabled);
            }
            if (smartReplySetting.msmart_action_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, smartReplySetting.msmart_action_enabled);
            }
            protoWriter.writeBytes(smartReplySetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.SmartReplySetting$a */
    public static final class C49525a extends Message.Builder<SmartReplySetting, C49525a> {

        /* renamed from: a */
        public Boolean f124122a;

        /* renamed from: b */
        public Boolean f124123b;

        /* renamed from: a */
        public SmartReplySetting build() {
            return new SmartReplySetting(this.f124122a, this.f124123b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49525a mo172730a(Boolean bool) {
            this.f124122a = bool;
            return this;
        }

        /* renamed from: b */
        public C49525a mo172732b(Boolean bool) {
            this.f124123b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49525a newBuilder() {
        C49525a aVar = new C49525a();
        aVar.f124122a = this.msmart_reply_enabled;
        aVar.f124123b = this.msmart_action_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msmart_reply_enabled != null) {
            sb.append(", smart_reply_enabled=");
            sb.append(this.msmart_reply_enabled);
        }
        if (this.msmart_action_enabled != null) {
            sb.append(", smart_action_enabled=");
            sb.append(this.msmart_action_enabled);
        }
        StringBuilder replace = sb.replace(0, 2, "SmartReplySetting{");
        replace.append('}');
        return replace.toString();
    }

    public SmartReplySetting(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public SmartReplySetting(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msmart_reply_enabled = bool;
        this.msmart_action_enabled = bool2;
    }
}
