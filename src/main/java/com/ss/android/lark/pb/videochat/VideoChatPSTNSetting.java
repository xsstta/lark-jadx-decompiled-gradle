package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatPSTNSetting extends Message<VideoChatPSTNSetting, C50427a> {
    public static final ProtoAdapter<VideoChatPSTNSetting> ADAPTER = new C50428b();
    private static final long serialVersionUID = 0;
    public final List<String> mcall_in_countries;
    public final List<String> mcall_out_countries;
    public final String mdefault_call_in_country;

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatPSTNSetting$b */
    private static final class C50428b extends ProtoAdapter<VideoChatPSTNSetting> {
        C50428b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatPSTNSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatPSTNSetting videoChatPSTNSetting) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, videoChatPSTNSetting.mcall_in_countries) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, videoChatPSTNSetting.mcall_out_countries);
            if (videoChatPSTNSetting.mdefault_call_in_country != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatPSTNSetting.mdefault_call_in_country);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + videoChatPSTNSetting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatPSTNSetting decode(ProtoReader protoReader) throws IOException {
            C50427a aVar = new C50427a();
            aVar.f125936c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125934a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f125935b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125936c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatPSTNSetting videoChatPSTNSetting) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, videoChatPSTNSetting.mcall_in_countries);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, videoChatPSTNSetting.mcall_out_countries);
            if (videoChatPSTNSetting.mdefault_call_in_country != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatPSTNSetting.mdefault_call_in_country);
            }
            protoWriter.writeBytes(videoChatPSTNSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatPSTNSetting$a */
    public static final class C50427a extends Message.Builder<VideoChatPSTNSetting, C50427a> {

        /* renamed from: a */
        public List<String> f125934a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f125935b = Internal.newMutableList();

        /* renamed from: c */
        public String f125936c;

        /* renamed from: a */
        public VideoChatPSTNSetting build() {
            return new VideoChatPSTNSetting(this.f125934a, this.f125935b, this.f125936c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50427a newBuilder() {
        C50427a aVar = new C50427a();
        aVar.f125934a = Internal.copyOf("mcall_in_countries", this.mcall_in_countries);
        aVar.f125935b = Internal.copyOf("mcall_out_countries", this.mcall_out_countries);
        aVar.f125936c = this.mdefault_call_in_country;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mcall_in_countries.isEmpty()) {
            sb.append(", call_in_countries=");
            sb.append(this.mcall_in_countries);
        }
        if (!this.mcall_out_countries.isEmpty()) {
            sb.append(", call_out_countries=");
            sb.append(this.mcall_out_countries);
        }
        if (this.mdefault_call_in_country != null) {
            sb.append(", default_call_in_country=");
            sb.append(this.mdefault_call_in_country);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatPSTNSetting{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatPSTNSetting(List<String> list, List<String> list2, String str) {
        this(list, list2, str, ByteString.EMPTY);
    }

    public VideoChatPSTNSetting(List<String> list, List<String> list2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcall_in_countries = Internal.immutableCopyOf("mcall_in_countries", list);
        this.mcall_out_countries = Internal.immutableCopyOf("mcall_out_countries", list2);
        this.mdefault_call_in_country = str;
    }
}
