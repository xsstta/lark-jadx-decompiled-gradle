package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;", "", "isPickChatterEnable", "", "isPickDepartmentEnable", "isPickExternalChatterEnable", "isSelectMode", "isSelected", "id", "", ShareHitPoint.f121869d, "", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.a.c */
public interface ISelectDependency {

    /* renamed from: b */
    public static final Companion f92726b = Companion.f92727a;

    /* renamed from: a */
    boolean mo131997a(String str, int i);

    /* renamed from: e */
    boolean mo131998e();

    /* renamed from: f */
    boolean mo131999f();

    /* renamed from: g */
    boolean mo132000g();

    /* renamed from: h */
    boolean mo132001h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency$Companion;", "", "()V", "TYPE_DEP", "", "TYPE_MEMBER", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.a.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f92727a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.a.c$b */
    public static final class C35857b {
        /* renamed from: a */
        public static /* synthetic */ boolean m140465a(ISelectDependency cVar, String str, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 2;
                }
                return cVar.mo131997a(str, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isSelected");
        }
    }
}
