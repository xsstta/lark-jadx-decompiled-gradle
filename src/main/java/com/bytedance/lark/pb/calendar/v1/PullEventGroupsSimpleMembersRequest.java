package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullEventGroupsSimpleMembersRequest extends Message<PullEventGroupsSimpleMembersRequest, C15930a> {
    public static final ProtoAdapter<PullEventGroupsSimpleMembersRequest> ADAPTER = new C15931b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupsSimpleMembersRequest$b */
    private static final class C15931b extends ProtoAdapter<PullEventGroupsSimpleMembersRequest> {
        C15931b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullEventGroupsSimpleMembersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullEventGroupsSimpleMembersRequest pullEventGroupsSimpleMembersRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (pullEventGroupsSimpleMembersRequest.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullEventGroupsSimpleMembersRequest.calendar_id);
            } else {
                i = 0;
            }
            if (pullEventGroupsSimpleMembersRequest.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pullEventGroupsSimpleMembersRequest.key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pullEventGroupsSimpleMembersRequest.original_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, pullEventGroupsSimpleMembersRequest.original_time);
            }
            return i4 + i3 + pullEventGroupsSimpleMembersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullEventGroupsSimpleMembersRequest decode(ProtoReader protoReader) throws IOException {
            C15930a aVar = new C15930a();
            aVar.f41905a = "";
            aVar.f41906b = "";
            aVar.f41907c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41905a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41906b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41907c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullEventGroupsSimpleMembersRequest pullEventGroupsSimpleMembersRequest) throws IOException {
            if (pullEventGroupsSimpleMembersRequest.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullEventGroupsSimpleMembersRequest.calendar_id);
            }
            if (pullEventGroupsSimpleMembersRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullEventGroupsSimpleMembersRequest.key);
            }
            if (pullEventGroupsSimpleMembersRequest.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullEventGroupsSimpleMembersRequest.original_time);
            }
            protoWriter.writeBytes(pullEventGroupsSimpleMembersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupsSimpleMembersRequest$a */
    public static final class C15930a extends Message.Builder<PullEventGroupsSimpleMembersRequest, C15930a> {

        /* renamed from: a */
        public String f41905a;

        /* renamed from: b */
        public String f41906b;

        /* renamed from: c */
        public Long f41907c;

        /* renamed from: a */
        public PullEventGroupsSimpleMembersRequest build() {
            return new PullEventGroupsSimpleMembersRequest(this.f41905a, this.f41906b, this.f41907c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15930a mo57415a(Long l) {
            this.f41907c = l;
            return this;
        }

        /* renamed from: b */
        public C15930a mo57418b(String str) {
            this.f41906b = str;
            return this;
        }

        /* renamed from: a */
        public C15930a mo57416a(String str) {
            this.f41905a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15930a newBuilder() {
        C15930a aVar = new C15930a();
        aVar.f41905a = this.calendar_id;
        aVar.f41906b = this.key;
        aVar.f41907c = this.original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullEventGroupsSimpleMembersRequest");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PullEventGroupsSimpleMembersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullEventGroupsSimpleMembersRequest(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public PullEventGroupsSimpleMembersRequest(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
    }
}
