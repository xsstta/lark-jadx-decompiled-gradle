package com.bytedance.lark.pb.statistics.v1;

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

public final class GetMobileCodeResponse extends Message<GetMobileCodeResponse, C19413a> {
    public static final ProtoAdapter<GetMobileCodeResponse> ADAPTER = new C19414b();
    private static final long serialVersionUID = 0;
    public final List<Integer> hot_keys;
    public final List<MobileCode> mobile_codes;

    public static final class MobileCode extends Message<MobileCode, C19411a> {
        public static final ProtoAdapter<MobileCode> ADAPTER = new C19412b();
        public static final Integer DEFAULT_KEY = 0;
        private static final long serialVersionUID = 0;
        public final String code;
        public final String en_name;
        public final Integer key;
        public final String name;

        /* renamed from: com.bytedance.lark.pb.statistics.v1.GetMobileCodeResponse$MobileCode$b */
        private static final class C19412b extends ProtoAdapter<MobileCode> {
            C19412b() {
                super(FieldEncoding.LENGTH_DELIMITED, MobileCode.class);
            }

            /* renamed from: a */
            public int encodedSize(MobileCode mobileCode) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, mobileCode.key) + ProtoAdapter.STRING.encodedSizeWithTag(2, mobileCode.name) + ProtoAdapter.STRING.encodedSizeWithTag(3, mobileCode.en_name) + ProtoAdapter.STRING.encodedSizeWithTag(4, mobileCode.code) + mobileCode.unknownFields().size();
            }

            /* renamed from: a */
            public MobileCode decode(ProtoReader protoReader) throws IOException {
                C19411a aVar = new C19411a();
                aVar.f47733a = 0;
                aVar.f47734b = "";
                aVar.f47735c = "";
                aVar.f47736d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47733a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f47734b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f47735c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47736d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MobileCode mobileCode) throws IOException {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mobileCode.key);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mobileCode.name);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mobileCode.en_name);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mobileCode.code);
                protoWriter.writeBytes(mobileCode.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19411a newBuilder() {
            C19411a aVar = new C19411a();
            aVar.f47733a = this.key;
            aVar.f47734b = this.name;
            aVar.f47735c = this.en_name;
            aVar.f47736d = this.code;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.statistics.v1.GetMobileCodeResponse$MobileCode$a */
        public static final class C19411a extends Message.Builder<MobileCode, C19411a> {

            /* renamed from: a */
            public Integer f47733a;

            /* renamed from: b */
            public String f47734b;

            /* renamed from: c */
            public String f47735c;

            /* renamed from: d */
            public String f47736d;

            /* renamed from: a */
            public MobileCode build() {
                String str;
                String str2;
                String str3;
                Integer num = this.f47733a;
                if (num != null && (str = this.f47734b) != null && (str2 = this.f47735c) != null && (str3 = this.f47736d) != null) {
                    return new MobileCode(num, str, str2, str3, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num, "key", this.f47734b, "name", this.f47735c, "en_name", this.f47736d, "code");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("statistics", "MobileCode");
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", en_name=");
            sb.append(this.en_name);
            sb.append(", code=");
            sb.append(this.code);
            StringBuilder replace = sb.replace(0, 2, "MobileCode{");
            replace.append('}');
            return replace.toString();
        }

        public MobileCode(Integer num, String str, String str2, String str3) {
            this(num, str, str2, str3, ByteString.EMPTY);
        }

        public MobileCode(Integer num, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = num;
            this.name = str;
            this.en_name = str2;
            this.code = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.GetMobileCodeResponse$b */
    private static final class C19414b extends ProtoAdapter<GetMobileCodeResponse> {
        C19414b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMobileCodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMobileCodeResponse getMobileCodeResponse) {
            return MobileCode.ADAPTER.asRepeated().encodedSizeWithTag(1, getMobileCodeResponse.mobile_codes) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getMobileCodeResponse.hot_keys) + getMobileCodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMobileCodeResponse decode(ProtoReader protoReader) throws IOException {
            C19413a aVar = new C19413a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47737a.add(MobileCode.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47738b.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMobileCodeResponse getMobileCodeResponse) throws IOException {
            MobileCode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMobileCodeResponse.mobile_codes);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getMobileCodeResponse.hot_keys);
            protoWriter.writeBytes(getMobileCodeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.GetMobileCodeResponse$a */
    public static final class C19413a extends Message.Builder<GetMobileCodeResponse, C19413a> {

        /* renamed from: a */
        public List<MobileCode> f47737a = Internal.newMutableList();

        /* renamed from: b */
        public List<Integer> f47738b = Internal.newMutableList();

        /* renamed from: a */
        public GetMobileCodeResponse build() {
            return new GetMobileCodeResponse(this.f47737a, this.f47738b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19413a newBuilder() {
        C19413a aVar = new C19413a();
        aVar.f47737a = Internal.copyOf("mobile_codes", this.mobile_codes);
        aVar.f47738b = Internal.copyOf("hot_keys", this.hot_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("statistics", "GetMobileCodeResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.mobile_codes.isEmpty()) {
            sb.append(", mobile_codes=");
            sb.append(this.mobile_codes);
        }
        if (!this.hot_keys.isEmpty()) {
            sb.append(", hot_keys=");
            sb.append(this.hot_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMobileCodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMobileCodeResponse(List<MobileCode> list, List<Integer> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public GetMobileCodeResponse(List<MobileCode> list, List<Integer> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mobile_codes = Internal.immutableCopyOf("mobile_codes", list);
        this.hot_keys = Internal.immutableCopyOf("hot_keys", list2);
    }
}
