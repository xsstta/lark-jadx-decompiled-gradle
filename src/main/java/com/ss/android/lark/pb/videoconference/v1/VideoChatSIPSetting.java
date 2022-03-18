package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatSIPSetting extends Message<VideoChatSIPSetting, C51282a> {
    public static final ProtoAdapter<VideoChatSIPSetting> ADAPTER = new C51283b();
    private static final long serialVersionUID = 0;
    public final String domain;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatSIPSetting$b */
    private static final class C51283b extends ProtoAdapter<VideoChatSIPSetting> {
        C51283b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatSIPSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatSIPSetting videoChatSIPSetting) {
            int i;
            if (videoChatSIPSetting.domain != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatSIPSetting.domain);
            } else {
                i = 0;
            }
            return i + videoChatSIPSetting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatSIPSetting decode(ProtoReader protoReader) throws IOException {
            C51282a aVar = new C51282a();
            aVar.f127710a = "";
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
                    aVar.f127710a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatSIPSetting videoChatSIPSetting) throws IOException {
            if (videoChatSIPSetting.domain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatSIPSetting.domain);
            }
            protoWriter.writeBytes(videoChatSIPSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatSIPSetting$a */
    public static final class C51282a extends Message.Builder<VideoChatSIPSetting, C51282a> {

        /* renamed from: a */
        public String f127710a;

        /* renamed from: a */
        public VideoChatSIPSetting build() {
            return new VideoChatSIPSetting(this.f127710a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51282a newBuilder() {
        C51282a aVar = new C51282a();
        aVar.f127710a = this.domain;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatSIPSetting");
        StringBuilder sb = new StringBuilder();
        if (this.domain != null) {
            sb.append(", domain=");
            sb.append(this.domain);
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
        this.domain = str;
    }
}
