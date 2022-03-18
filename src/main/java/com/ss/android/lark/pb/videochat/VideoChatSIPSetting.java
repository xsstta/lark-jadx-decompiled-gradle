package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatSIPSetting extends Message<VideoChatSIPSetting, C50433a> {
    public static final ProtoAdapter<VideoChatSIPSetting> ADAPTER = new C50434b();
    private static final long serialVersionUID = 0;
    public final String mdomain;

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatSIPSetting$b */
    private static final class C50434b extends ProtoAdapter<VideoChatSIPSetting> {
        C50434b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatSIPSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatSIPSetting videoChatSIPSetting) {
            int i;
            if (videoChatSIPSetting.mdomain != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatSIPSetting.mdomain);
            } else {
                i = 0;
            }
            return i + videoChatSIPSetting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatSIPSetting decode(ProtoReader protoReader) throws IOException {
            C50433a aVar = new C50433a();
            aVar.f125943a = "";
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
                    aVar.f125943a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatSIPSetting videoChatSIPSetting) throws IOException {
            if (videoChatSIPSetting.mdomain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatSIPSetting.mdomain);
            }
            protoWriter.writeBytes(videoChatSIPSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatSIPSetting$a */
    public static final class C50433a extends Message.Builder<VideoChatSIPSetting, C50433a> {

        /* renamed from: a */
        public String f125943a;

        /* renamed from: a */
        public VideoChatSIPSetting build() {
            return new VideoChatSIPSetting(this.f125943a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50433a newBuilder() {
        C50433a aVar = new C50433a();
        aVar.f125943a = this.mdomain;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mdomain != null) {
            sb.append(", domain=");
            sb.append(this.mdomain);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatSIPSetting{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatSIPSetting(String str) {
        this(str, ByteString.EMPTY);
    }

    public VideoChatSIPSetting(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdomain = str;
    }
}
