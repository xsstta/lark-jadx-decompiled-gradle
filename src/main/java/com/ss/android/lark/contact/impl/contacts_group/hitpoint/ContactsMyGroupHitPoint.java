package com.ss.android.lark.contact.impl.contacts_group.hitpoint;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007J\u0012\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_group/hitpoint/ContactsMyGroupHitPoint;", "", "()V", "ERROR_CODE", "", "appreciableKey", "", "end", "", "memberCount", "error", "getKey", "setKey", "key", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_group.b.a */
public final class ContactsMyGroupHitPoint {

    /* renamed from: a */
    public static final ContactsMyGroupHitPoint f92084a = new ContactsMyGroupHitPoint();

    /* renamed from: b */
    private static String f92085b;

    /* renamed from: a */
    public final void mo131270a() {
        m139377a(this, 0, 1, null);
    }

    private ContactsMyGroupHitPoint() {
    }

    /* renamed from: a */
    public final void mo131272a(String str) {
        if (str != null) {
            f92085b = str;
        }
    }

    /* renamed from: b */
    public final void mo131273b(int i) {
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Contact, Event.show_my_group, ErrorType.SDK, ErrorLevel.Exception, ParticipantRepo.f117150c, null, null, null, true, null, MapsKt.mapOf(TuplesKt.to("member_count", Integer.valueOf(i))), null, 5568, null));
    }

    /* renamed from: a */
    public final void mo131271a(int i) {
        if (f92085b != null) {
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            String str = f92085b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appreciableKey");
            }
            AppreciableKit.m107396c(a, str, MapsKt.mapOf(TuplesKt.to("sdk_cost", 0), TuplesKt.to("init_view_cost", 0), TuplesKt.to("first_render", 0)), null, MapsKt.mapOf(TuplesKt.to("member_count", Integer.valueOf(i))), null, 20, null);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m139377a(ContactsMyGroupHitPoint aVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        aVar.mo131273b(i);
    }
}
