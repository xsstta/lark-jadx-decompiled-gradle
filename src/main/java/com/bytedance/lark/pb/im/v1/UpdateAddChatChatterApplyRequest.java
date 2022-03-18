package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AddChatChatterApply;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateAddChatChatterApplyRequest extends Message<UpdateAddChatChatterApplyRequest, C18129a> {
    public static final ProtoAdapter<UpdateAddChatChatterApplyRequest> ADAPTER = new C18130b();
    public static final Boolean DEFAULT_SHOW_BANNER = false;
    public static final AddChatChatterApply.Status DEFAULT_STATUS = AddChatChatterApply.Status.UNKNOWN_STATUS;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String invitee_id;
    public final Boolean show_banner;
    public final AddChatChatterApply.Status status;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateAddChatChatterApplyRequest$b */
    private static final class C18130b extends ProtoAdapter<UpdateAddChatChatterApplyRequest> {
        C18130b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateAddChatChatterApplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateAddChatChatterApplyRequest updateAddChatChatterApplyRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateAddChatChatterApplyRequest.chat_id);
            int i3 = 0;
            if (updateAddChatChatterApplyRequest.show_banner != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, updateAddChatChatterApplyRequest.show_banner);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (updateAddChatChatterApplyRequest.invitee_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, updateAddChatChatterApplyRequest.invitee_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (updateAddChatChatterApplyRequest.status != null) {
                i3 = AddChatChatterApply.Status.ADAPTER.encodedSizeWithTag(4, updateAddChatChatterApplyRequest.status);
            }
            return i5 + i3 + updateAddChatChatterApplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateAddChatChatterApplyRequest decode(ProtoReader protoReader) throws IOException {
            C18129a aVar = new C18129a();
            aVar.f45288a = "";
            aVar.f45289b = false;
            aVar.f45290c = "";
            aVar.f45291d = AddChatChatterApply.Status.UNKNOWN_STATUS;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45288a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45289b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45290c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45291d = AddChatChatterApply.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateAddChatChatterApplyRequest updateAddChatChatterApplyRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateAddChatChatterApplyRequest.chat_id);
            if (updateAddChatChatterApplyRequest.show_banner != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, updateAddChatChatterApplyRequest.show_banner);
            }
            if (updateAddChatChatterApplyRequest.invitee_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateAddChatChatterApplyRequest.invitee_id);
            }
            if (updateAddChatChatterApplyRequest.status != null) {
                AddChatChatterApply.Status.ADAPTER.encodeWithTag(protoWriter, 4, updateAddChatChatterApplyRequest.status);
            }
            protoWriter.writeBytes(updateAddChatChatterApplyRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18129a newBuilder() {
        C18129a aVar = new C18129a();
        aVar.f45288a = this.chat_id;
        aVar.f45289b = this.show_banner;
        aVar.f45290c = this.invitee_id;
        aVar.f45291d = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateAddChatChatterApplyRequest$a */
    public static final class C18129a extends Message.Builder<UpdateAddChatChatterApplyRequest, C18129a> {

        /* renamed from: a */
        public String f45288a;

        /* renamed from: b */
        public Boolean f45289b;

        /* renamed from: c */
        public String f45290c;

        /* renamed from: d */
        public AddChatChatterApply.Status f45291d;

        /* renamed from: a */
        public UpdateAddChatChatterApplyRequest build() {
            String str = this.f45288a;
            if (str != null) {
                return new UpdateAddChatChatterApplyRequest(str, this.f45289b, this.f45290c, this.f45291d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C18129a mo62871a(AddChatChatterApply.Status status) {
            this.f45291d = status;
            return this;
        }

        /* renamed from: b */
        public C18129a mo62875b(String str) {
            this.f45290c = str;
            return this;
        }

        /* renamed from: a */
        public C18129a mo62872a(Boolean bool) {
            this.f45289b = bool;
            return this;
        }

        /* renamed from: a */
        public C18129a mo62873a(String str) {
            this.f45288a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateAddChatChatterApplyRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.show_banner != null) {
            sb.append(", show_banner=");
            sb.append(this.show_banner);
        }
        if (this.invitee_id != null) {
            sb.append(", invitee_id=");
            sb.append(this.invitee_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateAddChatChatterApplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateAddChatChatterApplyRequest(String str, Boolean bool, String str2, AddChatChatterApply.Status status2) {
        this(str, bool, str2, status2, ByteString.EMPTY);
    }

    public UpdateAddChatChatterApplyRequest(String str, Boolean bool, String str2, AddChatChatterApply.Status status2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.show_banner = bool;
        this.invitee_id = str2;
        this.status = status2;
    }
}
