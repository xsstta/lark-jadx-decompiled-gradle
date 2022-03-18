package com.bytedance.lark.pb.onboarding.v1;

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

public final class DeleteProductGuideRequest extends Message<DeleteProductGuideRequest, C18574a> {
    public static final ProtoAdapter<DeleteProductGuideRequest> ADAPTER = new C18575b();
    public static final Boolean DEFAULT_CHECK_DONT_RESHOW = false;
    private static final long serialVersionUID = 0;
    public final Boolean check_dont_reshow;
    public final List<String> guides;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.DeleteProductGuideRequest$b */
    private static final class C18575b extends ProtoAdapter<DeleteProductGuideRequest> {
        C18575b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteProductGuideRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteProductGuideRequest deleteProductGuideRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteProductGuideRequest.guides);
            if (deleteProductGuideRequest.check_dont_reshow != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, deleteProductGuideRequest.check_dont_reshow);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + deleteProductGuideRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteProductGuideRequest decode(ProtoReader protoReader) throws IOException {
            C18574a aVar = new C18574a();
            aVar.f46071b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46070a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46071b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteProductGuideRequest deleteProductGuideRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteProductGuideRequest.guides);
            if (deleteProductGuideRequest.check_dont_reshow != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, deleteProductGuideRequest.check_dont_reshow);
            }
            protoWriter.writeBytes(deleteProductGuideRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.DeleteProductGuideRequest$a */
    public static final class C18574a extends Message.Builder<DeleteProductGuideRequest, C18574a> {

        /* renamed from: a */
        public List<String> f46070a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f46071b;

        /* renamed from: a */
        public DeleteProductGuideRequest build() {
            return new DeleteProductGuideRequest(this.f46070a, this.f46071b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18574a newBuilder() {
        C18574a aVar = new C18574a();
        aVar.f46070a = Internal.copyOf("guides", this.guides);
        aVar.f46071b = this.check_dont_reshow;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "DeleteProductGuideRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.guides.isEmpty()) {
            sb.append(", guides=");
            sb.append(this.guides);
        }
        if (this.check_dont_reshow != null) {
            sb.append(", check_dont_reshow=");
            sb.append(this.check_dont_reshow);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteProductGuideRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteProductGuideRequest(List<String> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public DeleteProductGuideRequest(List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guides = Internal.immutableCopyOf("guides", list);
        this.check_dont_reshow = bool;
    }
}
