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

public final class UpgradeToMeetingRequest extends Message<UpgradeToMeetingRequest, C16104a> {
    public static final ProtoAdapter<UpgradeToMeetingRequest> ADAPTER = new C16105b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Boolean DEFAULT_SHOULD_ADD_TO_ATTENDEE_LIST = false;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;
    public final Boolean should_add_to_attendee_list;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpgradeToMeetingRequest$b */
    private static final class C16105b extends ProtoAdapter<UpgradeToMeetingRequest> {
        C16105b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpgradeToMeetingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpgradeToMeetingRequest upgradeToMeetingRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, upgradeToMeetingRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, upgradeToMeetingRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, upgradeToMeetingRequest.original_time);
            if (upgradeToMeetingRequest.should_add_to_attendee_list != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, upgradeToMeetingRequest.should_add_to_attendee_list);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + upgradeToMeetingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpgradeToMeetingRequest decode(ProtoReader protoReader) throws IOException {
            C16104a aVar = new C16104a();
            aVar.f42189a = "";
            aVar.f42190b = "";
            aVar.f42191c = 0L;
            aVar.f42192d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42189a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42190b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42191c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42192d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpgradeToMeetingRequest upgradeToMeetingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upgradeToMeetingRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, upgradeToMeetingRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upgradeToMeetingRequest.original_time);
            if (upgradeToMeetingRequest.should_add_to_attendee_list != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, upgradeToMeetingRequest.should_add_to_attendee_list);
            }
            protoWriter.writeBytes(upgradeToMeetingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16104a newBuilder() {
        C16104a aVar = new C16104a();
        aVar.f42189a = this.calendar_id;
        aVar.f42190b = this.key;
        aVar.f42191c = this.original_time;
        aVar.f42192d = this.should_add_to_attendee_list;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpgradeToMeetingRequest$a */
    public static final class C16104a extends Message.Builder<UpgradeToMeetingRequest, C16104a> {

        /* renamed from: a */
        public String f42189a;

        /* renamed from: b */
        public String f42190b;

        /* renamed from: c */
        public Long f42191c;

        /* renamed from: d */
        public Boolean f42192d;

        /* renamed from: a */
        public UpgradeToMeetingRequest build() {
            String str;
            Long l;
            String str2 = this.f42189a;
            if (str2 != null && (str = this.f42190b) != null && (l = this.f42191c) != null) {
                return new UpgradeToMeetingRequest(str2, str, l, this.f42192d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f42190b, "key", this.f42191c, "original_time");
        }

        /* renamed from: a */
        public C16104a mo57854a(Boolean bool) {
            this.f42192d = bool;
            return this;
        }

        /* renamed from: b */
        public C16104a mo57858b(String str) {
            this.f42190b = str;
            return this;
        }

        /* renamed from: a */
        public C16104a mo57855a(Long l) {
            this.f42191c = l;
            return this;
        }

        /* renamed from: a */
        public C16104a mo57856a(String str) {
            this.f42189a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpgradeToMeetingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.should_add_to_attendee_list != null) {
            sb.append(", should_add_to_attendee_list=");
            sb.append(this.should_add_to_attendee_list);
        }
        StringBuilder replace = sb.replace(0, 2, "UpgradeToMeetingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpgradeToMeetingRequest(String str, String str2, Long l, Boolean bool) {
        this(str, str2, l, bool, ByteString.EMPTY);
    }

    public UpgradeToMeetingRequest(String str, String str2, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.should_add_to_attendee_list = bool;
    }
}
