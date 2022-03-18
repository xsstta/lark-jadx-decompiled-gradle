package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatPstnIncomingSetting extends Message<VideoChatPstnIncomingSetting, C51280a> {
    public static final ProtoAdapter<VideoChatPstnIncomingSetting> ADAPTER = new C51281b();
    public static final Boolean DEFAULT_PSTN_ENABLE_INCOMING_CALL = false;
    private static final long serialVersionUID = 0;
    public final Boolean pstn_enable_incoming_call;
    public final List<String> pstn_incoming_call_country_default;
    public final List<PSTNPhone> pstn_incoming_call_phone_list;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatPstnIncomingSetting$b */
    private static final class C51281b extends ProtoAdapter<VideoChatPstnIncomingSetting> {
        C51281b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatPstnIncomingSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatPstnIncomingSetting videoChatPstnIncomingSetting) {
            int i;
            if (videoChatPstnIncomingSetting.pstn_enable_incoming_call != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, videoChatPstnIncomingSetting.pstn_enable_incoming_call);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, videoChatPstnIncomingSetting.pstn_incoming_call_country_default) + PSTNPhone.ADAPTER.asRepeated().encodedSizeWithTag(3, videoChatPstnIncomingSetting.pstn_incoming_call_phone_list) + videoChatPstnIncomingSetting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatPstnIncomingSetting decode(ProtoReader protoReader) throws IOException {
            C51280a aVar = new C51280a();
            aVar.f127707a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127707a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127708b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127709c.add(PSTNPhone.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatPstnIncomingSetting videoChatPstnIncomingSetting) throws IOException {
            if (videoChatPstnIncomingSetting.pstn_enable_incoming_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, videoChatPstnIncomingSetting.pstn_enable_incoming_call);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, videoChatPstnIncomingSetting.pstn_incoming_call_country_default);
            PSTNPhone.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, videoChatPstnIncomingSetting.pstn_incoming_call_phone_list);
            protoWriter.writeBytes(videoChatPstnIncomingSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatPstnIncomingSetting$a */
    public static final class C51280a extends Message.Builder<VideoChatPstnIncomingSetting, C51280a> {

        /* renamed from: a */
        public Boolean f127707a;

        /* renamed from: b */
        public List<String> f127708b = Internal.newMutableList();

        /* renamed from: c */
        public List<PSTNPhone> f127709c = Internal.newMutableList();

        /* renamed from: a */
        public VideoChatPstnIncomingSetting build() {
            return new VideoChatPstnIncomingSetting(this.f127707a, this.f127708b, this.f127709c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51280a newBuilder() {
        C51280a aVar = new C51280a();
        aVar.f127707a = this.pstn_enable_incoming_call;
        aVar.f127708b = Internal.copyOf("pstn_incoming_call_country_default", this.pstn_incoming_call_country_default);
        aVar.f127709c = Internal.copyOf("pstn_incoming_call_phone_list", this.pstn_incoming_call_phone_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatPstnIncomingSetting");
        StringBuilder sb = new StringBuilder();
        if (this.pstn_enable_incoming_call != null) {
            sb.append(", pstn_enable_incoming_call=");
            sb.append(this.pstn_enable_incoming_call);
        }
        if (!this.pstn_incoming_call_country_default.isEmpty()) {
            sb.append(", pstn_incoming_call_country_default=");
            sb.append(this.pstn_incoming_call_country_default);
        }
        if (!this.pstn_incoming_call_phone_list.isEmpty()) {
            sb.append(", pstn_incoming_call_phone_list=");
            sb.append(this.pstn_incoming_call_phone_list);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatPstnIncomingSetting{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatPstnIncomingSetting(Boolean bool, List<String> list, List<PSTNPhone> list2) {
        this(bool, list, list2, ByteString.EMPTY);
    }

    public VideoChatPstnIncomingSetting(Boolean bool, List<String> list, List<PSTNPhone> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pstn_enable_incoming_call = bool;
        this.pstn_incoming_call_country_default = Internal.immutableCopyOf("pstn_incoming_call_country_default", list);
        this.pstn_incoming_call_phone_list = Internal.immutableCopyOf("pstn_incoming_call_phone_list", list2);
    }
}
