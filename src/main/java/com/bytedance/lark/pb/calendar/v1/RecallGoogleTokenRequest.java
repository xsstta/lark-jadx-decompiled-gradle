package com.bytedance.lark.pb.calendar.v1;

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

public final class RecallGoogleTokenRequest extends Message<RecallGoogleTokenRequest, C15972a> {
    public static final ProtoAdapter<RecallGoogleTokenRequest> ADAPTER = new C15973b();
    private static final long serialVersionUID = 0;
    public final List<String> external_account_emails;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RecallGoogleTokenRequest$b */
    private static final class C15973b extends ProtoAdapter<RecallGoogleTokenRequest> {
        C15973b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecallGoogleTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RecallGoogleTokenRequest recallGoogleTokenRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, recallGoogleTokenRequest.external_account_emails) + recallGoogleTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RecallGoogleTokenRequest decode(ProtoReader protoReader) throws IOException {
            C15972a aVar = new C15972a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41972a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecallGoogleTokenRequest recallGoogleTokenRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, recallGoogleTokenRequest.external_account_emails);
            protoWriter.writeBytes(recallGoogleTokenRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RecallGoogleTokenRequest$a */
    public static final class C15972a extends Message.Builder<RecallGoogleTokenRequest, C15972a> {

        /* renamed from: a */
        public List<String> f41972a = Internal.newMutableList();

        /* renamed from: a */
        public RecallGoogleTokenRequest build() {
            return new RecallGoogleTokenRequest(this.f41972a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15972a mo57511a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41972a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15972a newBuilder() {
        C15972a aVar = new C15972a();
        aVar.f41972a = Internal.copyOf("external_account_emails", this.external_account_emails);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "RecallGoogleTokenRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.external_account_emails.isEmpty()) {
            sb.append(", external_account_emails=");
            sb.append(this.external_account_emails);
        }
        StringBuilder replace = sb.replace(0, 2, "RecallGoogleTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RecallGoogleTokenRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public RecallGoogleTokenRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.external_account_emails = Internal.immutableCopyOf("external_account_emails", list);
    }
}
