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

public final class DialTestSuite extends Message<DialTestSuite, C50529a> {
    public static final ProtoAdapter<DialTestSuite> ADAPTER = new C50530b();
    private static final long serialVersionUID = 0;
    public final List<DialTestCase> cases;
    public final String test_suite_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DialTestSuite$b */
    private static final class C50530b extends ProtoAdapter<DialTestSuite> {
        C50530b() {
            super(FieldEncoding.LENGTH_DELIMITED, DialTestSuite.class);
        }

        /* renamed from: a */
        public int encodedSize(DialTestSuite dialTestSuite) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, dialTestSuite.test_suite_id) + DialTestCase.ADAPTER.asRepeated().encodedSizeWithTag(2, dialTestSuite.cases) + dialTestSuite.unknownFields().size();
        }

        /* renamed from: a */
        public DialTestSuite decode(ProtoReader protoReader) throws IOException {
            C50529a aVar = new C50529a();
            aVar.f126135a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126135a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126136b.add(DialTestCase.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DialTestSuite dialTestSuite) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dialTestSuite.test_suite_id);
            DialTestCase.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, dialTestSuite.cases);
            protoWriter.writeBytes(dialTestSuite.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.DialTestSuite$a */
    public static final class C50529a extends Message.Builder<DialTestSuite, C50529a> {

        /* renamed from: a */
        public String f126135a;

        /* renamed from: b */
        public List<DialTestCase> f126136b = Internal.newMutableList();

        /* renamed from: a */
        public DialTestSuite build() {
            String str = this.f126135a;
            if (str != null) {
                return new DialTestSuite(str, this.f126136b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "test_suite_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50529a newBuilder() {
        C50529a aVar = new C50529a();
        aVar.f126135a = this.test_suite_id;
        aVar.f126136b = Internal.copyOf("cases", this.cases);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "DialTestSuite");
        StringBuilder sb = new StringBuilder();
        sb.append(", test_suite_id=");
        sb.append(this.test_suite_id);
        if (!this.cases.isEmpty()) {
            sb.append(", cases=");
            sb.append(this.cases);
        }
        StringBuilder replace = sb.replace(0, 2, "DialTestSuite{");
        replace.append('}');
        return replace.toString();
    }

    public DialTestSuite(String str, List<DialTestCase> list) {
        this(str, list, ByteString.EMPTY);
    }

    public DialTestSuite(String str, List<DialTestCase> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.test_suite_id = str;
        this.cases = Internal.immutableCopyOf("cases", list);
    }
}
