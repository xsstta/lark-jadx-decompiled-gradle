package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetPhoneQueryDailyQuotaRequest extends Message<GetPhoneQueryDailyQuotaRequest, C16260a> {
    public static final ProtoAdapter<GetPhoneQueryDailyQuotaRequest> ADAPTER = new C16261b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;
    public final String target_user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPhoneQueryDailyQuotaRequest$b */
    private static final class C16261b extends ProtoAdapter<GetPhoneQueryDailyQuotaRequest> {
        C16261b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPhoneQueryDailyQuotaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPhoneQueryDailyQuotaRequest getPhoneQueryDailyQuotaRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getPhoneQueryDailyQuotaRequest.target_user_id);
            if (getPhoneQueryDailyQuotaRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getPhoneQueryDailyQuotaRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getPhoneQueryDailyQuotaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPhoneQueryDailyQuotaRequest decode(ProtoReader protoReader) throws IOException {
            C16260a aVar = new C16260a();
            aVar.f42460a = "";
            aVar.f42461b = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42460a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42461b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPhoneQueryDailyQuotaRequest getPhoneQueryDailyQuotaRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPhoneQueryDailyQuotaRequest.target_user_id);
            if (getPhoneQueryDailyQuotaRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getPhoneQueryDailyQuotaRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getPhoneQueryDailyQuotaRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPhoneQueryDailyQuotaRequest$a */
    public static final class C16260a extends Message.Builder<GetPhoneQueryDailyQuotaRequest, C16260a> {

        /* renamed from: a */
        public String f42460a;

        /* renamed from: b */
        public SyncDataStrategy f42461b;

        /* renamed from: a */
        public GetPhoneQueryDailyQuotaRequest build() {
            String str = this.f42460a;
            if (str != null) {
                return new GetPhoneQueryDailyQuotaRequest(str, this.f42461b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "target_user_id");
        }

        /* renamed from: a */
        public C16260a mo58235a(String str) {
            this.f42460a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16260a newBuilder() {
        C16260a aVar = new C16260a();
        aVar.f42460a = this.target_user_id;
        aVar.f42461b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetPhoneQueryDailyQuotaRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", target_user_id=");
        sb.append(this.target_user_id);
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPhoneQueryDailyQuotaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPhoneQueryDailyQuotaRequest(String str, SyncDataStrategy syncDataStrategy) {
        this(str, syncDataStrategy, ByteString.EMPTY);
    }

    public GetPhoneQueryDailyQuotaRequest(String str, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_user_id = str;
        this.sync_data_strategy = syncDataStrategy;
    }
}
