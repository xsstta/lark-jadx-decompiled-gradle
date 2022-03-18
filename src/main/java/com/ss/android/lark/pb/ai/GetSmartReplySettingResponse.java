package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetSmartReplySettingResponse extends Message<GetSmartReplySettingResponse, C49477a> {
    public static final ProtoAdapter<GetSmartReplySettingResponse> ADAPTER = new C49478b();
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final SmartReplySetting msmart_reply_setting;
    public final Long mupdate_time;

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartReplySettingResponse$b */
    private static final class C49478b extends ProtoAdapter<GetSmartReplySettingResponse> {
        C49478b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartReplySettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartReplySettingResponse getSmartReplySettingResponse) {
            int i;
            int i2 = 0;
            if (getSmartReplySettingResponse.msmart_reply_setting != null) {
                i = SmartReplySetting.ADAPTER.encodedSizeWithTag(1, getSmartReplySettingResponse.msmart_reply_setting);
            } else {
                i = 0;
            }
            if (getSmartReplySettingResponse.mupdate_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getSmartReplySettingResponse.mupdate_time);
            }
            return i + i2 + getSmartReplySettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartReplySettingResponse decode(ProtoReader protoReader) throws IOException {
            C49477a aVar = new C49477a();
            aVar.f124073b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124072a = SmartReplySetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124073b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSmartReplySettingResponse getSmartReplySettingResponse) throws IOException {
            if (getSmartReplySettingResponse.msmart_reply_setting != null) {
                SmartReplySetting.ADAPTER.encodeWithTag(protoWriter, 1, getSmartReplySettingResponse.msmart_reply_setting);
            }
            if (getSmartReplySettingResponse.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getSmartReplySettingResponse.mupdate_time);
            }
            protoWriter.writeBytes(getSmartReplySettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartReplySettingResponse$a */
    public static final class C49477a extends Message.Builder<GetSmartReplySettingResponse, C49477a> {

        /* renamed from: a */
        public SmartReplySetting f124072a;

        /* renamed from: b */
        public Long f124073b;

        /* renamed from: a */
        public GetSmartReplySettingResponse build() {
            return new GetSmartReplySettingResponse(this.f124072a, this.f124073b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49477a newBuilder() {
        C49477a aVar = new C49477a();
        aVar.f124072a = this.msmart_reply_setting;
        aVar.f124073b = this.mupdate_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msmart_reply_setting != null) {
            sb.append(", smart_reply_setting=");
            sb.append(this.msmart_reply_setting);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSmartReplySettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartReplySettingResponse(SmartReplySetting smartReplySetting, Long l) {
        this(smartReplySetting, l, ByteString.EMPTY);
    }

    public GetSmartReplySettingResponse(SmartReplySetting smartReplySetting, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msmart_reply_setting = smartReplySetting;
        this.mupdate_time = l;
    }
}
