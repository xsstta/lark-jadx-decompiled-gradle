package com.bytedance.lark.pb.behavior.v1;

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

public final class GetABExperimentVersionRequest extends Message<GetABExperimentVersionRequest, C15456a> {
    public static final ProtoAdapter<GetABExperimentVersionRequest> ADAPTER = new C15457b();
    public static final Boolean DEFAULT_NEED_ALL_TEA_EVENT_KEY_MAP = false;
    public static final Boolean DEFAULT_NEED_FEATURE_MAP = false;
    private static final long serialVersionUID = 0;
    public final Boolean need_all_tea_event_key_map;
    public final Boolean need_feature_map;
    public final List<String> tea_event_key_vec;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentVersionRequest$b */
    private static final class C15457b extends ProtoAdapter<GetABExperimentVersionRequest> {
        C15457b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetABExperimentVersionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetABExperimentVersionRequest getABExperimentVersionRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getABExperimentVersionRequest.tea_event_key_vec);
            int i2 = 0;
            if (getABExperimentVersionRequest.need_feature_map != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getABExperimentVersionRequest.need_feature_map);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getABExperimentVersionRequest.need_all_tea_event_key_map != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getABExperimentVersionRequest.need_all_tea_event_key_map);
            }
            return i3 + i2 + getABExperimentVersionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetABExperimentVersionRequest decode(ProtoReader protoReader) throws IOException {
            C15456a aVar = new C15456a();
            aVar.f40910b = false;
            aVar.f40911c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40909a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f40910b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40911c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetABExperimentVersionRequest getABExperimentVersionRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getABExperimentVersionRequest.tea_event_key_vec);
            if (getABExperimentVersionRequest.need_feature_map != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getABExperimentVersionRequest.need_feature_map);
            }
            if (getABExperimentVersionRequest.need_all_tea_event_key_map != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getABExperimentVersionRequest.need_all_tea_event_key_map);
            }
            protoWriter.writeBytes(getABExperimentVersionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentVersionRequest$a */
    public static final class C15456a extends Message.Builder<GetABExperimentVersionRequest, C15456a> {

        /* renamed from: a */
        public List<String> f40909a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f40910b;

        /* renamed from: c */
        public Boolean f40911c;

        /* renamed from: a */
        public GetABExperimentVersionRequest build() {
            return new GetABExperimentVersionRequest(this.f40909a, this.f40910b, this.f40911c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15456a mo56016a(Boolean bool) {
            this.f40911c = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15456a newBuilder() {
        C15456a aVar = new C15456a();
        aVar.f40909a = Internal.copyOf("tea_event_key_vec", this.tea_event_key_vec);
        aVar.f40910b = this.need_feature_map;
        aVar.f40911c = this.need_all_tea_event_key_map;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "GetABExperimentVersionRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.tea_event_key_vec.isEmpty()) {
            sb.append(", tea_event_key_vec=");
            sb.append(this.tea_event_key_vec);
        }
        if (this.need_feature_map != null) {
            sb.append(", need_feature_map=");
            sb.append(this.need_feature_map);
        }
        if (this.need_all_tea_event_key_map != null) {
            sb.append(", need_all_tea_event_key_map=");
            sb.append(this.need_all_tea_event_key_map);
        }
        StringBuilder replace = sb.replace(0, 2, "GetABExperimentVersionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetABExperimentVersionRequest(List<String> list, Boolean bool, Boolean bool2) {
        this(list, bool, bool2, ByteString.EMPTY);
    }

    public GetABExperimentVersionRequest(List<String> list, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tea_event_key_vec = Internal.immutableCopyOf("tea_event_key_vec", list);
        this.need_feature_map = bool;
        this.need_all_tea_event_key_map = bool2;
    }
}
