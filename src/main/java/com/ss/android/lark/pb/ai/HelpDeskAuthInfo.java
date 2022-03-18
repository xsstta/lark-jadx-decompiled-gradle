package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class HelpDeskAuthInfo extends Message<HelpDeskAuthInfo, C49487a> {
    public static final ProtoAdapter<HelpDeskAuthInfo> ADAPTER = new C49488b();
    private static final long serialVersionUID = 0;
    public final String mhelpdesk_id;

    /* renamed from: com.ss.android.lark.pb.ai.HelpDeskAuthInfo$b */
    private static final class C49488b extends ProtoAdapter<HelpDeskAuthInfo> {
        C49488b() {
            super(FieldEncoding.LENGTH_DELIMITED, HelpDeskAuthInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(HelpDeskAuthInfo helpDeskAuthInfo) {
            int i;
            if (helpDeskAuthInfo.mhelpdesk_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, helpDeskAuthInfo.mhelpdesk_id);
            } else {
                i = 0;
            }
            return i + helpDeskAuthInfo.unknownFields().size();
        }

        /* renamed from: a */
        public HelpDeskAuthInfo decode(ProtoReader protoReader) throws IOException {
            C49487a aVar = new C49487a();
            aVar.f124080a = "";
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
                    aVar.f124080a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HelpDeskAuthInfo helpDeskAuthInfo) throws IOException {
            if (helpDeskAuthInfo.mhelpdesk_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, helpDeskAuthInfo.mhelpdesk_id);
            }
            protoWriter.writeBytes(helpDeskAuthInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.HelpDeskAuthInfo$a */
    public static final class C49487a extends Message.Builder<HelpDeskAuthInfo, C49487a> {

        /* renamed from: a */
        public String f124080a;

        /* renamed from: a */
        public HelpDeskAuthInfo build() {
            return new HelpDeskAuthInfo(this.f124080a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49487a newBuilder() {
        C49487a aVar = new C49487a();
        aVar.f124080a = this.mhelpdesk_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mhelpdesk_id != null) {
            sb.append(", helpdesk_id=");
            sb.append(this.mhelpdesk_id);
        }
        StringBuilder replace = sb.replace(0, 2, "HelpDeskAuthInfo{");
        replace.append('}');
        return replace.toString();
    }

    public HelpDeskAuthInfo(String str) {
        this(str, ByteString.EMPTY);
    }

    public HelpDeskAuthInfo(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mhelpdesk_id = str;
    }
}
