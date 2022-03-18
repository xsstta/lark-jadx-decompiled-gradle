package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.moments_entities.Notification;
import java.io.IOException;
import okio.ByteString;

public final class PutReadNotificationsRequest extends Message<PutReadNotificationsRequest, C49948a> {
    public static final ProtoAdapter<PutReadNotificationsRequest> ADAPTER = new C49949b();
    private static final long serialVersionUID = 0;
    public final Notification.Category mnotification_category;
    public final String mnotification_id;

    /* renamed from: com.ss.android.lark.pb.moments.PutReadNotificationsRequest$b */
    private static final class C49949b extends ProtoAdapter<PutReadNotificationsRequest> {
        C49949b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutReadNotificationsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutReadNotificationsRequest putReadNotificationsRequest) {
            int i;
            int i2 = 0;
            if (putReadNotificationsRequest.mnotification_category != null) {
                i = Notification.Category.ADAPTER.encodedSizeWithTag(1, putReadNotificationsRequest.mnotification_category);
            } else {
                i = 0;
            }
            if (putReadNotificationsRequest.mnotification_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, putReadNotificationsRequest.mnotification_id);
            }
            return i + i2 + putReadNotificationsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutReadNotificationsRequest decode(ProtoReader protoReader) throws IOException {
            C49948a aVar = new C49948a();
            aVar.f124953b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124952a = Notification.Category.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124953b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutReadNotificationsRequest putReadNotificationsRequest) throws IOException {
            if (putReadNotificationsRequest.mnotification_category != null) {
                Notification.Category.ADAPTER.encodeWithTag(protoWriter, 1, putReadNotificationsRequest.mnotification_category);
            }
            if (putReadNotificationsRequest.mnotification_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, putReadNotificationsRequest.mnotification_id);
            }
            protoWriter.writeBytes(putReadNotificationsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.PutReadNotificationsRequest$a */
    public static final class C49948a extends Message.Builder<PutReadNotificationsRequest, C49948a> {

        /* renamed from: a */
        public Notification.Category f124952a;

        /* renamed from: b */
        public String f124953b;

        /* renamed from: a */
        public PutReadNotificationsRequest build() {
            return new PutReadNotificationsRequest(this.f124952a, this.f124953b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49948a mo173674a(Notification.Category category) {
            this.f124952a = category;
            return this;
        }

        /* renamed from: a */
        public C49948a mo173675a(String str) {
            this.f124953b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49948a newBuilder() {
        C49948a aVar = new C49948a();
        aVar.f124952a = this.mnotification_category;
        aVar.f124953b = this.mnotification_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mnotification_category != null) {
            sb.append(", notification_category=");
            sb.append(this.mnotification_category);
        }
        if (this.mnotification_id != null) {
            sb.append(", notification_id=");
            sb.append(this.mnotification_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PutReadNotificationsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutReadNotificationsRequest(Notification.Category category, String str) {
        this(category, str, ByteString.EMPTY);
    }

    public PutReadNotificationsRequest(Notification.Category category, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mnotification_category = category;
        this.mnotification_id = str;
    }
}
