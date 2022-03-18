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

public final class PushCalendarBindGoogleNotification extends Message<PushCalendarBindGoogleNotification, C15942a> {
    public static final ProtoAdapter<PushCalendarBindGoogleNotification> ADAPTER = new C15943b();
    public static final Boolean DEFAULT_IS_BOUND = false;
    private static final long serialVersionUID = 0;
    public final String external_account_email;
    public final Boolean is_bound;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarBindGoogleNotification$b */
    private static final class C15943b extends ProtoAdapter<PushCalendarBindGoogleNotification> {
        C15943b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCalendarBindGoogleNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCalendarBindGoogleNotification pushCalendarBindGoogleNotification) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, pushCalendarBindGoogleNotification.is_bound) + ProtoAdapter.STRING.encodedSizeWithTag(2, pushCalendarBindGoogleNotification.external_account_email) + pushCalendarBindGoogleNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushCalendarBindGoogleNotification decode(ProtoReader protoReader) throws IOException {
            C15942a aVar = new C15942a();
            aVar.f41926a = false;
            aVar.f41927b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41926a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41927b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCalendarBindGoogleNotification pushCalendarBindGoogleNotification) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pushCalendarBindGoogleNotification.is_bound);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushCalendarBindGoogleNotification.external_account_email);
            protoWriter.writeBytes(pushCalendarBindGoogleNotification.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15942a newBuilder() {
        C15942a aVar = new C15942a();
        aVar.f41926a = this.is_bound;
        aVar.f41927b = this.external_account_email;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarBindGoogleNotification$a */
    public static final class C15942a extends Message.Builder<PushCalendarBindGoogleNotification, C15942a> {

        /* renamed from: a */
        public Boolean f41926a;

        /* renamed from: b */
        public String f41927b;

        /* renamed from: a */
        public PushCalendarBindGoogleNotification build() {
            String str;
            Boolean bool = this.f41926a;
            if (bool != null && (str = this.f41927b) != null) {
                return new PushCalendarBindGoogleNotification(bool, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_bound", this.f41927b, "external_account_email");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushCalendarBindGoogleNotification");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_bound=");
        sb.append(this.is_bound);
        sb.append(", external_account_email=");
        sb.append(this.external_account_email);
        StringBuilder replace = sb.replace(0, 2, "PushCalendarBindGoogleNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushCalendarBindGoogleNotification(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public PushCalendarBindGoogleNotification(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_bound = bool;
        this.external_account_email = str;
    }
}
