package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AccessInfos extends Message<AccessInfos, C50453a> {
    public static final ProtoAdapter<AccessInfos> ADAPTER = new C50454b();
    private static final long serialVersionUID = 0;
    public final VideoChatH323Setting h323_setting;
    public final VideoChatPstnIncomingSetting pstn_incoming_setting;
    public final VideoChatSIPSetting sip_setting;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AccessInfos$b */
    private static final class C50454b extends ProtoAdapter<AccessInfos> {
        C50454b() {
            super(FieldEncoding.LENGTH_DELIMITED, AccessInfos.class);
        }

        /* renamed from: a */
        public int encodedSize(AccessInfos accessInfos) {
            int i;
            int i2;
            int i3 = 0;
            if (accessInfos.pstn_incoming_setting != null) {
                i = VideoChatPstnIncomingSetting.ADAPTER.encodedSizeWithTag(1, accessInfos.pstn_incoming_setting);
            } else {
                i = 0;
            }
            if (accessInfos.sip_setting != null) {
                i2 = VideoChatSIPSetting.ADAPTER.encodedSizeWithTag(2, accessInfos.sip_setting);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (accessInfos.h323_setting != null) {
                i3 = VideoChatH323Setting.ADAPTER.encodedSizeWithTag(3, accessInfos.h323_setting);
            }
            return i4 + i3 + accessInfos.unknownFields().size();
        }

        /* renamed from: a */
        public AccessInfos decode(ProtoReader protoReader) throws IOException {
            C50453a aVar = new C50453a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125989a = VideoChatPstnIncomingSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125990b = VideoChatSIPSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125991c = VideoChatH323Setting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AccessInfos accessInfos) throws IOException {
            if (accessInfos.pstn_incoming_setting != null) {
                VideoChatPstnIncomingSetting.ADAPTER.encodeWithTag(protoWriter, 1, accessInfos.pstn_incoming_setting);
            }
            if (accessInfos.sip_setting != null) {
                VideoChatSIPSetting.ADAPTER.encodeWithTag(protoWriter, 2, accessInfos.sip_setting);
            }
            if (accessInfos.h323_setting != null) {
                VideoChatH323Setting.ADAPTER.encodeWithTag(protoWriter, 3, accessInfos.h323_setting);
            }
            protoWriter.writeBytes(accessInfos.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AccessInfos$a */
    public static final class C50453a extends Message.Builder<AccessInfos, C50453a> {

        /* renamed from: a */
        public VideoChatPstnIncomingSetting f125989a;

        /* renamed from: b */
        public VideoChatSIPSetting f125990b;

        /* renamed from: c */
        public VideoChatH323Setting f125991c;

        /* renamed from: a */
        public AccessInfos build() {
            return new AccessInfos(this.f125989a, this.f125990b, this.f125991c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50453a newBuilder() {
        C50453a aVar = new C50453a();
        aVar.f125989a = this.pstn_incoming_setting;
        aVar.f125990b = this.sip_setting;
        aVar.f125991c = this.h323_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "AccessInfos");
        StringBuilder sb = new StringBuilder();
        if (this.pstn_incoming_setting != null) {
            sb.append(", pstn_incoming_setting=");
            sb.append(this.pstn_incoming_setting);
        }
        if (this.sip_setting != null) {
            sb.append(", sip_setting=");
            sb.append(this.sip_setting);
        }
        if (this.h323_setting != null) {
            sb.append(", h323_setting=");
            sb.append(this.h323_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "AccessInfos{");
        replace.append('}');
        return replace.toString();
    }

    public AccessInfos(VideoChatPstnIncomingSetting videoChatPstnIncomingSetting, VideoChatSIPSetting videoChatSIPSetting, VideoChatH323Setting videoChatH323Setting) {
        this(videoChatPstnIncomingSetting, videoChatSIPSetting, videoChatH323Setting, ByteString.EMPTY);
    }

    public AccessInfos(VideoChatPstnIncomingSetting videoChatPstnIncomingSetting, VideoChatSIPSetting videoChatSIPSetting, VideoChatH323Setting videoChatH323Setting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pstn_incoming_setting = videoChatPstnIncomingSetting;
        this.sip_setting = videoChatSIPSetting;
        this.h323_setting = videoChatH323Setting;
    }
}
