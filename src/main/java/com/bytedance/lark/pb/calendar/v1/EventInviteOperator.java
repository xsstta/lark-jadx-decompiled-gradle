package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class EventInviteOperator extends Message<EventInviteOperator, C15616a> {
    public static final ProtoAdapter<EventInviteOperator> ADAPTER = new C15617b();
    private static final long serialVersionUID = 0;
    public final String user_invite_operator_id;
    public final String user_invite_operator_localized_name;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventInviteOperator$b */
    private static final class C15617b extends ProtoAdapter<EventInviteOperator> {
        C15617b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventInviteOperator.class);
        }

        /* renamed from: a */
        public int encodedSize(EventInviteOperator eventInviteOperator) {
            int i;
            int i2 = 0;
            if (eventInviteOperator.user_invite_operator_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, eventInviteOperator.user_invite_operator_id);
            } else {
                i = 0;
            }
            if (eventInviteOperator.user_invite_operator_localized_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, eventInviteOperator.user_invite_operator_localized_name);
            }
            return i + i2 + eventInviteOperator.unknownFields().size();
        }

        /* renamed from: a */
        public EventInviteOperator decode(ProtoReader protoReader) throws IOException {
            C15616a aVar = new C15616a();
            aVar.f41370a = "";
            aVar.f41371b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41370a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41371b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EventInviteOperator eventInviteOperator) throws IOException {
            if (eventInviteOperator.user_invite_operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eventInviteOperator.user_invite_operator_id);
            }
            if (eventInviteOperator.user_invite_operator_localized_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eventInviteOperator.user_invite_operator_localized_name);
            }
            protoWriter.writeBytes(eventInviteOperator.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventInviteOperator$a */
    public static final class C15616a extends Message.Builder<EventInviteOperator, C15616a> {

        /* renamed from: a */
        public String f41370a;

        /* renamed from: b */
        public String f41371b;

        /* renamed from: a */
        public EventInviteOperator build() {
            return new EventInviteOperator(this.f41370a, this.f41371b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15616a mo56612a(String str) {
            this.f41370a = str;
            return this;
        }

        /* renamed from: b */
        public C15616a mo56614b(String str) {
            this.f41371b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15616a newBuilder() {
        C15616a aVar = new C15616a();
        aVar.f41370a = this.user_invite_operator_id;
        aVar.f41371b = this.user_invite_operator_localized_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EventInviteOperator");
        StringBuilder sb = new StringBuilder();
        if (this.user_invite_operator_id != null) {
            sb.append(", user_invite_operator_id=");
            sb.append(this.user_invite_operator_id);
        }
        if (this.user_invite_operator_localized_name != null) {
            sb.append(", user_invite_operator_localized_name=");
            sb.append(this.user_invite_operator_localized_name);
        }
        StringBuilder replace = sb.replace(0, 2, "EventInviteOperator{");
        replace.append('}');
        return replace.toString();
    }

    public EventInviteOperator(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public EventInviteOperator(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_invite_operator_id = str;
        this.user_invite_operator_localized_name = str2;
    }
}
