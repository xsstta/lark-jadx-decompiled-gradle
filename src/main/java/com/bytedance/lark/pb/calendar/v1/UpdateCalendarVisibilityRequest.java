package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateCalendarVisibilityRequest extends Message<UpdateCalendarVisibilityRequest, C16092a> {
    public static final ProtoAdapter<UpdateCalendarVisibilityRequest> ADAPTER = new C16093b();
    public static final Boolean DEFAULT_VISIBILITY = false;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Boolean visibility;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateCalendarVisibilityRequest$b */
    private static final class C16093b extends ProtoAdapter<UpdateCalendarVisibilityRequest> {
        C16093b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateCalendarVisibilityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateCalendarVisibilityRequest updateCalendarVisibilityRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateCalendarVisibilityRequest.id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, updateCalendarVisibilityRequest.visibility) + updateCalendarVisibilityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateCalendarVisibilityRequest decode(ProtoReader protoReader) throws IOException {
            C16092a aVar = new C16092a();
            aVar.f42177a = "";
            aVar.f42178b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42177a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42178b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateCalendarVisibilityRequest updateCalendarVisibilityRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateCalendarVisibilityRequest.id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, updateCalendarVisibilityRequest.visibility);
            protoWriter.writeBytes(updateCalendarVisibilityRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16092a newBuilder() {
        C16092a aVar = new C16092a();
        aVar.f42177a = this.id;
        aVar.f42178b = this.visibility;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateCalendarVisibilityRequest$a */
    public static final class C16092a extends Message.Builder<UpdateCalendarVisibilityRequest, C16092a> {

        /* renamed from: a */
        public String f42177a;

        /* renamed from: b */
        public Boolean f42178b;

        /* renamed from: a */
        public UpdateCalendarVisibilityRequest build() {
            Boolean bool;
            String str = this.f42177a;
            if (str != null && (bool = this.f42178b) != null) {
                return new UpdateCalendarVisibilityRequest(str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f42178b, "visibility");
        }

        /* renamed from: a */
        public C16092a mo57824a(Boolean bool) {
            this.f42178b = bool;
            return this;
        }

        /* renamed from: a */
        public C16092a mo57825a(String str) {
            this.f42177a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpdateCalendarVisibilityRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", visibility=");
        sb.append(this.visibility);
        StringBuilder replace = sb.replace(0, 2, "UpdateCalendarVisibilityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateCalendarVisibilityRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public UpdateCalendarVisibilityRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.visibility = bool;
    }
}
