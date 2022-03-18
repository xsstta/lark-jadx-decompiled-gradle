package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ThirdPartyCalendarSetting extends Message<ThirdPartyCalendarSetting, C16080a> {
    public static final ProtoAdapter<ThirdPartyCalendarSetting> ADAPTER = new C16081b();
    public static final Boolean DEFAULT_VISIBLE = true;
    private static final long serialVersionUID = 0;
    public final String email;
    public final Boolean visible;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ThirdPartyCalendarSetting$b */
    private static final class C16081b extends ProtoAdapter<ThirdPartyCalendarSetting> {
        C16081b() {
            super(FieldEncoding.LENGTH_DELIMITED, ThirdPartyCalendarSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(ThirdPartyCalendarSetting thirdPartyCalendarSetting) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, thirdPartyCalendarSetting.email);
            if (thirdPartyCalendarSetting.visible != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, thirdPartyCalendarSetting.visible);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + thirdPartyCalendarSetting.unknownFields().size();
        }

        /* renamed from: a */
        public ThirdPartyCalendarSetting decode(ProtoReader protoReader) throws IOException {
            C16080a aVar = new C16080a();
            aVar.f42165a = "";
            aVar.f42166b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42165a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42166b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ThirdPartyCalendarSetting thirdPartyCalendarSetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, thirdPartyCalendarSetting.email);
            if (thirdPartyCalendarSetting.visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, thirdPartyCalendarSetting.visible);
            }
            protoWriter.writeBytes(thirdPartyCalendarSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ThirdPartyCalendarSetting$a */
    public static final class C16080a extends Message.Builder<ThirdPartyCalendarSetting, C16080a> {

        /* renamed from: a */
        public String f42165a;

        /* renamed from: b */
        public Boolean f42166b;

        /* renamed from: a */
        public ThirdPartyCalendarSetting build() {
            String str = this.f42165a;
            if (str != null) {
                return new ThirdPartyCalendarSetting(str, this.f42166b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "email");
        }
    }

    @Override // com.squareup.wire.Message
    public C16080a newBuilder() {
        C16080a aVar = new C16080a();
        aVar.f42165a = this.email;
        aVar.f42166b = this.visible;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ThirdPartyCalendarSetting");
        StringBuilder sb = new StringBuilder();
        sb.append(", email=");
        sb.append(this.email);
        if (this.visible != null) {
            sb.append(", visible=");
            sb.append(this.visible);
        }
        StringBuilder replace = sb.replace(0, 2, "ThirdPartyCalendarSetting{");
        replace.append('}');
        return replace.toString();
    }

    public ThirdPartyCalendarSetting(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public ThirdPartyCalendarSetting(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.email = str;
        this.visible = bool;
    }
}
