package com.bytedance.lark.pb.moments.v1;

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

public final class ListNotificationsResponse extends Message<ListNotificationsResponse, C18432a> {
    public static final ProtoAdapter<ListNotificationsResponse> ADAPTER = new C18433b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final String next_page_token;
    public final List<Notification> notifications;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListNotificationsResponse$b */
    private static final class C18433b extends ProtoAdapter<ListNotificationsResponse> {
        C18433b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListNotificationsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListNotificationsResponse listNotificationsResponse) {
            int i;
            int encodedSizeWithTag = Notification.ADAPTER.asRepeated().encodedSizeWithTag(1, listNotificationsResponse.notifications);
            int i2 = 0;
            if (listNotificationsResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(2, listNotificationsResponse.entities);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (listNotificationsResponse.next_page_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(11, listNotificationsResponse.next_page_token);
            }
            return i3 + i2 + listNotificationsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListNotificationsResponse decode(ProtoReader protoReader) throws IOException {
            C18432a aVar = new C18432a();
            aVar.f45823c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45821a.add(Notification.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45822b = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45823c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListNotificationsResponse listNotificationsResponse) throws IOException {
            Notification.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listNotificationsResponse.notifications);
            if (listNotificationsResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, listNotificationsResponse.entities);
            }
            if (listNotificationsResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, listNotificationsResponse.next_page_token);
            }
            protoWriter.writeBytes(listNotificationsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListNotificationsResponse$a */
    public static final class C18432a extends Message.Builder<ListNotificationsResponse, C18432a> {

        /* renamed from: a */
        public List<Notification> f45821a = Internal.newMutableList();

        /* renamed from: b */
        public Entities f45822b;

        /* renamed from: c */
        public String f45823c;

        /* renamed from: a */
        public ListNotificationsResponse build() {
            return new ListNotificationsResponse(this.f45821a, this.f45822b, this.f45823c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18432a newBuilder() {
        C18432a aVar = new C18432a();
        aVar.f45821a = Internal.copyOf("notifications", this.notifications);
        aVar.f45822b = this.entities;
        aVar.f45823c = this.next_page_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListNotificationsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.notifications.isEmpty()) {
            sb.append(", notifications=");
            sb.append(this.notifications);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        StringBuilder replace = sb.replace(0, 2, "ListNotificationsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListNotificationsResponse(List<Notification> list, Entities entities2, String str) {
        this(list, entities2, str, ByteString.EMPTY);
    }

    public ListNotificationsResponse(List<Notification> list, Entities entities2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notifications = Internal.immutableCopyOf("notifications", list);
        this.entities = entities2;
        this.next_page_token = str;
    }
}
