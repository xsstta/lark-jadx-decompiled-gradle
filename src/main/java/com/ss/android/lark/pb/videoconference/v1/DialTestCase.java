package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DialTestCase extends Message<DialTestCase, C50527a> {
    public static final ProtoAdapter<DialTestCase> ADAPTER = new C50528b();
    public static final Long DEFAULT_DURATION = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String callee_avatar;
    public final String callee_id;
    public final String callee_name;
    public final String caller_id;
    public final Long duration;
    public final Long start_time;
    public final String test_case_id;
    public final String test_suite_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DialTestCase$b */
    private static final class C50528b extends ProtoAdapter<DialTestCase> {
        C50528b() {
            super(FieldEncoding.LENGTH_DELIMITED, DialTestCase.class);
        }

        /* renamed from: a */
        public int encodedSize(DialTestCase dialTestCase) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, dialTestCase.test_suite_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, dialTestCase.test_case_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, dialTestCase.caller_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, dialTestCase.callee_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, dialTestCase.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(6, dialTestCase.duration) + ProtoAdapter.STRING.encodedSizeWithTag(7, dialTestCase.callee_name) + ProtoAdapter.STRING.encodedSizeWithTag(8, dialTestCase.callee_avatar) + dialTestCase.unknownFields().size();
        }

        /* renamed from: a */
        public DialTestCase decode(ProtoReader protoReader) throws IOException {
            C50527a aVar = new C50527a();
            aVar.f126127a = "";
            aVar.f126128b = "";
            aVar.f126129c = "";
            aVar.f126130d = "";
            aVar.f126131e = 0L;
            aVar.f126132f = 0L;
            aVar.f126133g = "";
            aVar.f126134h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126127a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126128b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126129c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126130d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126131e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126132f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126133g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126134h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DialTestCase dialTestCase) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dialTestCase.test_suite_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, dialTestCase.test_case_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, dialTestCase.caller_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, dialTestCase.callee_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, dialTestCase.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, dialTestCase.duration);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, dialTestCase.callee_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, dialTestCase.callee_avatar);
            protoWriter.writeBytes(dialTestCase.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50527a newBuilder() {
        C50527a aVar = new C50527a();
        aVar.f126127a = this.test_suite_id;
        aVar.f126128b = this.test_case_id;
        aVar.f126129c = this.caller_id;
        aVar.f126130d = this.callee_id;
        aVar.f126131e = this.start_time;
        aVar.f126132f = this.duration;
        aVar.f126133g = this.callee_name;
        aVar.f126134h = this.callee_avatar;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "DialTestCase");
        StringBuilder sb = new StringBuilder();
        sb.append(", test_suite_id=");
        sb.append(this.test_suite_id);
        sb.append(", test_case_id=");
        sb.append(this.test_case_id);
        sb.append(", caller_id=");
        sb.append(this.caller_id);
        sb.append(", callee_id=");
        sb.append(this.callee_id);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", callee_name=");
        sb.append(this.callee_name);
        sb.append(", callee_avatar=");
        sb.append(this.callee_avatar);
        StringBuilder replace = sb.replace(0, 2, "DialTestCase{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DialTestCase$a */
    public static final class C50527a extends Message.Builder<DialTestCase, C50527a> {

        /* renamed from: a */
        public String f126127a;

        /* renamed from: b */
        public String f126128b;

        /* renamed from: c */
        public String f126129c;

        /* renamed from: d */
        public String f126130d;

        /* renamed from: e */
        public Long f126131e;

        /* renamed from: f */
        public Long f126132f;

        /* renamed from: g */
        public String f126133g;

        /* renamed from: h */
        public String f126134h;

        /* renamed from: a */
        public DialTestCase build() {
            String str;
            String str2;
            String str3;
            Long l;
            Long l2;
            String str4;
            String str5;
            String str6 = this.f126127a;
            if (str6 != null && (str = this.f126128b) != null && (str2 = this.f126129c) != null && (str3 = this.f126130d) != null && (l = this.f126131e) != null && (l2 = this.f126132f) != null && (str4 = this.f126133g) != null && (str5 = this.f126134h) != null) {
                return new DialTestCase(str6, str, str2, str3, l, l2, str4, str5, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str6, "test_suite_id", this.f126128b, "test_case_id", this.f126129c, "caller_id", this.f126130d, "callee_id", this.f126131e, "start_time", this.f126132f, "duration", this.f126133g, "callee_name", this.f126134h, "callee_avatar");
        }
    }

    public DialTestCase(String str, String str2, String str3, String str4, Long l, Long l2, String str5, String str6) {
        this(str, str2, str3, str4, l, l2, str5, str6, ByteString.EMPTY);
    }

    public DialTestCase(String str, String str2, String str3, String str4, Long l, Long l2, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.test_suite_id = str;
        this.test_case_id = str2;
        this.caller_id = str3;
        this.callee_id = str4;
        this.start_time = l;
        this.duration = l2;
        this.callee_name = str5;
        this.callee_avatar = str6;
    }
}
