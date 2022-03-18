package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserCalendarInfo extends Message<UserCalendarInfo, C16114a> {
    public static final ProtoAdapter<UserCalendarInfo> ADAPTER = new C16115b();
    public static final Integer DEFAULT_BACKGROUND_COLOR = 0;
    private static final long serialVersionUID = 0;
    public final Integer background_color;
    public final String note;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UserCalendarInfo$b */
    private static final class C16115b extends ProtoAdapter<UserCalendarInfo> {
        C16115b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserCalendarInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UserCalendarInfo userCalendarInfo) {
            int i;
            int i2 = 0;
            if (userCalendarInfo.note != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, userCalendarInfo.note);
            } else {
                i = 0;
            }
            if (userCalendarInfo.background_color != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, userCalendarInfo.background_color);
            }
            return i + i2 + userCalendarInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UserCalendarInfo decode(ProtoReader protoReader) throws IOException {
            C16114a aVar = new C16114a();
            aVar.f42204a = "";
            aVar.f42205b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42204a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42205b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserCalendarInfo userCalendarInfo) throws IOException {
            if (userCalendarInfo.note != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userCalendarInfo.note);
            }
            if (userCalendarInfo.background_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, userCalendarInfo.background_color);
            }
            protoWriter.writeBytes(userCalendarInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UserCalendarInfo$a */
    public static final class C16114a extends Message.Builder<UserCalendarInfo, C16114a> {

        /* renamed from: a */
        public String f42204a;

        /* renamed from: b */
        public Integer f42205b;

        /* renamed from: a */
        public UserCalendarInfo build() {
            return new UserCalendarInfo(this.f42204a, this.f42205b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16114a mo57879a(Integer num) {
            this.f42205b = num;
            return this;
        }

        /* renamed from: a */
        public C16114a mo57880a(String str) {
            this.f42204a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16114a newBuilder() {
        C16114a aVar = new C16114a();
        aVar.f42204a = this.note;
        aVar.f42205b = this.background_color;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UserCalendarInfo");
        StringBuilder sb = new StringBuilder();
        if (this.note != null) {
            sb.append(", note=");
            sb.append(this.note);
        }
        if (this.background_color != null) {
            sb.append(", background_color=");
            sb.append(this.background_color);
        }
        StringBuilder replace = sb.replace(0, 2, "UserCalendarInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UserCalendarInfo(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public UserCalendarInfo(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.note = str;
        this.background_color = num;
    }
}
