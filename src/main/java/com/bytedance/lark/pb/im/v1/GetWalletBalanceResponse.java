package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetWalletBalanceResponse extends Message<GetWalletBalanceResponse, C17769a> {
    public static final ProtoAdapter<GetWalletBalanceResponse> ADAPTER = new C17770b();
    public static final Long DEFAULT_BALANCE = 0L;
    public static final CurrencyType DEFAULT_CURRENCY = CurrencyType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long balance;
    public final CurrencyType currency;

    public enum CurrencyType implements WireEnum {
        UNKNOWN(0),
        CNY(1),
        USD(2),
        VIR(3);
        
        public static final ProtoAdapter<CurrencyType> ADAPTER = ProtoAdapter.newEnumAdapter(CurrencyType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CurrencyType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CNY;
            }
            if (i == 2) {
                return USD;
            }
            if (i != 3) {
                return null;
            }
            return VIR;
        }

        private CurrencyType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWalletBalanceResponse$b */
    private static final class C17770b extends ProtoAdapter<GetWalletBalanceResponse> {
        C17770b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetWalletBalanceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetWalletBalanceResponse getWalletBalanceResponse) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getWalletBalanceResponse.balance) + CurrencyType.ADAPTER.encodedSizeWithTag(2, getWalletBalanceResponse.currency) + getWalletBalanceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetWalletBalanceResponse decode(ProtoReader protoReader) throws IOException {
            C17769a aVar = new C17769a();
            aVar.f44812a = 0L;
            aVar.f44813b = CurrencyType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44812a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44813b = CurrencyType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetWalletBalanceResponse getWalletBalanceResponse) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getWalletBalanceResponse.balance);
            CurrencyType.ADAPTER.encodeWithTag(protoWriter, 2, getWalletBalanceResponse.currency);
            protoWriter.writeBytes(getWalletBalanceResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17769a newBuilder() {
        C17769a aVar = new C17769a();
        aVar.f44812a = this.balance;
        aVar.f44813b = this.currency;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetWalletBalanceResponse$a */
    public static final class C17769a extends Message.Builder<GetWalletBalanceResponse, C17769a> {

        /* renamed from: a */
        public Long f44812a;

        /* renamed from: b */
        public CurrencyType f44813b;

        /* renamed from: a */
        public GetWalletBalanceResponse build() {
            CurrencyType currencyType;
            Long l = this.f44812a;
            if (l != null && (currencyType = this.f44813b) != null) {
                return new GetWalletBalanceResponse(l, currencyType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "balance", this.f44813b, "currency");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetWalletBalanceResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", currency=");
        sb.append(this.currency);
        StringBuilder replace = sb.replace(0, 2, "GetWalletBalanceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetWalletBalanceResponse(Long l, CurrencyType currencyType) {
        this(l, currencyType, ByteString.EMPTY);
    }

    public GetWalletBalanceResponse(Long l, CurrencyType currencyType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.balance = l;
        this.currency = currencyType;
    }
}
