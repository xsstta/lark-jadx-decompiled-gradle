package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AddSubscribeRecentListRep extends Message<AddSubscribeRecentListRep, C19295a> {
    public static final ProtoAdapter<AddSubscribeRecentListRep> ADAPTER = new C19296b();
    public static final Boolean DEFAULT_RESULT = false;
    public static final ResultType DEFAULT_RESULT_TYPE = ResultType.ResultType_SUCCESS;
    private static final long serialVersionUID = 0;
    public final Boolean result;
    public final String result_msg;
    public final ResultType result_type;
    public final String subsc_sign;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.AddSubscribeRecentListRep$b */
    private static final class C19296b extends ProtoAdapter<AddSubscribeRecentListRep> {
        C19296b() {
            super(FieldEncoding.LENGTH_DELIMITED, AddSubscribeRecentListRep.class);
        }

        /* renamed from: a */
        public int encodedSize(AddSubscribeRecentListRep addSubscribeRecentListRep) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, addSubscribeRecentListRep.subsc_sign) + ProtoAdapter.BOOL.encodedSizeWithTag(2, addSubscribeRecentListRep.result) + ResultType.ADAPTER.encodedSizeWithTag(3, addSubscribeRecentListRep.result_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, addSubscribeRecentListRep.result_msg) + addSubscribeRecentListRep.unknownFields().size();
        }

        /* renamed from: a */
        public AddSubscribeRecentListRep decode(ProtoReader protoReader) throws IOException {
            C19295a aVar = new C19295a();
            aVar.f47481a = "";
            aVar.f47482b = false;
            aVar.f47483c = ResultType.ResultType_SUCCESS;
            aVar.f47484d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47481a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47482b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f47483c = ResultType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47484d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AddSubscribeRecentListRep addSubscribeRecentListRep) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, addSubscribeRecentListRep.subsc_sign);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, addSubscribeRecentListRep.result);
            ResultType.ADAPTER.encodeWithTag(protoWriter, 3, addSubscribeRecentListRep.result_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, addSubscribeRecentListRep.result_msg);
            protoWriter.writeBytes(addSubscribeRecentListRep.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19295a newBuilder() {
        C19295a aVar = new C19295a();
        aVar.f47481a = this.subsc_sign;
        aVar.f47482b = this.result;
        aVar.f47483c = this.result_type;
        aVar.f47484d = this.result_msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.AddSubscribeRecentListRep$a */
    public static final class C19295a extends Message.Builder<AddSubscribeRecentListRep, C19295a> {

        /* renamed from: a */
        public String f47481a;

        /* renamed from: b */
        public Boolean f47482b;

        /* renamed from: c */
        public ResultType f47483c;

        /* renamed from: d */
        public String f47484d;

        /* renamed from: a */
        public AddSubscribeRecentListRep build() {
            Boolean bool;
            ResultType resultType;
            String str;
            String str2 = this.f47481a;
            if (str2 != null && (bool = this.f47482b) != null && (resultType = this.f47483c) != null && (str = this.f47484d) != null) {
                return new AddSubscribeRecentListRep(str2, bool, resultType, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "subsc_sign", this.f47482b, "result", this.f47483c, "result_type", this.f47484d, "result_msg");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "AddSubscribeRecentListRep");
        StringBuilder sb = new StringBuilder();
        sb.append(", subsc_sign=");
        sb.append(this.subsc_sign);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", result_type=");
        sb.append(this.result_type);
        sb.append(", result_msg=");
        sb.append(this.result_msg);
        StringBuilder replace = sb.replace(0, 2, "AddSubscribeRecentListRep{");
        replace.append('}');
        return replace.toString();
    }

    public AddSubscribeRecentListRep(String str, Boolean bool, ResultType resultType, String str2) {
        this(str, bool, resultType, str2, ByteString.EMPTY);
    }

    public AddSubscribeRecentListRep(String str, Boolean bool, ResultType resultType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.subsc_sign = str;
        this.result = bool;
        this.result_type = resultType;
        this.result_msg = str2;
    }
}
