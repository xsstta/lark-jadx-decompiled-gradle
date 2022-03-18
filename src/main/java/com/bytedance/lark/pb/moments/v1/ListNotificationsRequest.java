package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.moments.v1.Notification;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListNotificationsRequest extends Message<ListNotificationsRequest, C18430a> {
    public static final ProtoAdapter<ListNotificationsRequest> ADAPTER = new C18431b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Notification.Category DEFAULT_NOTIFICATION_CATEGORY = Notification.Category.UNKNOWN_CATEGORY;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Notification.Category notification_category;
    public final String page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListNotificationsRequest$b */
    private static final class C18431b extends ProtoAdapter<ListNotificationsRequest> {
        C18431b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListNotificationsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListNotificationsRequest listNotificationsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (listNotificationsRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listNotificationsRequest.page_token);
            } else {
                i = 0;
            }
            if (listNotificationsRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, listNotificationsRequest.count);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (listNotificationsRequest.notification_category != null) {
                i3 = Notification.Category.ADAPTER.encodedSizeWithTag(3, listNotificationsRequest.notification_category);
            }
            return i4 + i3 + listNotificationsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListNotificationsRequest decode(ProtoReader protoReader) throws IOException {
            C18430a aVar = new C18430a();
            aVar.f45818a = "";
            aVar.f45819b = 0;
            aVar.f45820c = Notification.Category.UNKNOWN_CATEGORY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45818a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45819b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45820c = Notification.Category.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListNotificationsRequest listNotificationsRequest) throws IOException {
            if (listNotificationsRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listNotificationsRequest.page_token);
            }
            if (listNotificationsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, listNotificationsRequest.count);
            }
            if (listNotificationsRequest.notification_category != null) {
                Notification.Category.ADAPTER.encodeWithTag(protoWriter, 3, listNotificationsRequest.notification_category);
            }
            protoWriter.writeBytes(listNotificationsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListNotificationsRequest$a */
    public static final class C18430a extends Message.Builder<ListNotificationsRequest, C18430a> {

        /* renamed from: a */
        public String f45818a;

        /* renamed from: b */
        public Integer f45819b;

        /* renamed from: c */
        public Notification.Category f45820c;

        /* renamed from: a */
        public ListNotificationsRequest build() {
            return new ListNotificationsRequest(this.f45818a, this.f45819b, this.f45820c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18430a mo63695a(Notification.Category category) {
            this.f45820c = category;
            return this;
        }

        /* renamed from: a */
        public C18430a mo63696a(Integer num) {
            this.f45819b = num;
            return this;
        }

        /* renamed from: a */
        public C18430a mo63697a(String str) {
            this.f45818a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18430a newBuilder() {
        C18430a aVar = new C18430a();
        aVar.f45818a = this.page_token;
        aVar.f45819b = this.count;
        aVar.f45820c = this.notification_category;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListNotificationsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.page_token != null) {
            sb.append(", page_token=");
            sb.append(this.page_token);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.notification_category != null) {
            sb.append(", notification_category=");
            sb.append(this.notification_category);
        }
        StringBuilder replace = sb.replace(0, 2, "ListNotificationsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListNotificationsRequest(String str, Integer num, Notification.Category category) {
        this(str, num, category, ByteString.EMPTY);
    }

    public ListNotificationsRequest(String str, Integer num, Notification.Category category, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.count = num;
        this.notification_category = category;
    }
}
