package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetSmartReplySettingRequest extends Message<SetSmartReplySettingRequest, C49515a> {
    public static final ProtoAdapter<SetSmartReplySettingRequest> ADAPTER = new C49516b();
    private static final long serialVersionUID = 0;
    public final SmartReplySetting msmart_reply_setting;

    /* renamed from: com.ss.android.lark.pb.ai.SetSmartReplySettingRequest$b */
    private static final class C49516b extends ProtoAdapter<SetSmartReplySettingRequest> {
        C49516b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSmartReplySettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSmartReplySettingRequest setSmartReplySettingRequest) {
            return SmartReplySetting.ADAPTER.encodedSizeWithTag(1, setSmartReplySettingRequest.msmart_reply_setting) + setSmartReplySettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetSmartReplySettingRequest decode(ProtoReader protoReader) throws IOException {
            C49515a aVar = new C49515a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124115a = SmartReplySetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetSmartReplySettingRequest setSmartReplySettingRequest) throws IOException {
            SmartReplySetting.ADAPTER.encodeWithTag(protoWriter, 1, setSmartReplySettingRequest.msmart_reply_setting);
            protoWriter.writeBytes(setSmartReplySettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.SetSmartReplySettingRequest$a */
    public static final class C49515a extends Message.Builder<SetSmartReplySettingRequest, C49515a> {

        /* renamed from: a */
        public SmartReplySetting f124115a;

        /* renamed from: a */
        public SetSmartReplySettingRequest build() {
            SmartReplySetting smartReplySetting = this.f124115a;
            if (smartReplySetting != null) {
                return new SetSmartReplySettingRequest(smartReplySetting, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(smartReplySetting, "msmart_reply_setting");
        }

        /* renamed from: a */
        public C49515a mo172706a(SmartReplySetting smartReplySetting) {
            this.f124115a = smartReplySetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49515a newBuilder() {
        C49515a aVar = new C49515a();
        aVar.f124115a = this.msmart_reply_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", smart_reply_setting=");
        sb.append(this.msmart_reply_setting);
        StringBuilder replace = sb.replace(0, 2, "SetSmartReplySettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetSmartReplySettingRequest(SmartReplySetting smartReplySetting) {
        this(smartReplySetting, ByteString.EMPTY);
    }

    public SetSmartReplySettingRequest(SmartReplySetting smartReplySetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msmart_reply_setting = smartReplySetting;
    }
}
