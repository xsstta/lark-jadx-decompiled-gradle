package com.ss.android.lark.calendar.impl.framework.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001c\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J$\u0010\u0007\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStack;", "Lcom/ss/android/lark/calendar/impl/framework/fragment/HandleBackPress;", "getTop", "Landroidx/fragment/app/Fragment;", "pop", "", "fragment", "push", "args", "Landroid/os/Bundle;", "fragmentClass", "Ljava/lang/Class;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.fragment.a */
public interface FragmentStack extends HandleBackPress {

    /* renamed from: a */
    public static final Companion f83315a = Companion.f83316a;

    /* renamed from: a */
    void mo118661a(Fragment fragment);

    /* renamed from: a */
    void mo118662a(Class<? extends Fragment> cls, Bundle bundle);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0006\u001a\u00020\u0007*\u00020\bJ\n\u0010\t\u001a\u00020\u0007*\u00020\bJ\u0014\u0010\n\u001a\u00020\b*\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\b*\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStack$Companion;", "", "()V", "FRAGMENT_ENTER_ANIM", "", "FRAGMENT_EXIT_ANIM", "getEnterAnim", "", "Landroid/os/Bundle;", "getExitAnim", "putEnterAnim", "animId", "putExitAnim", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.fragment.a$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f83316a = new Companion();

        private Companion() {
        }

        /* renamed from: a */
        public final int mo118663a(Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(bundle, "$this$getEnterAnim");
            return bundle.getInt("FRAGMENT_ENTER_ANIM", 0);
        }

        /* renamed from: b */
        public final int mo118665b(Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(bundle, "$this$getExitAnim");
            return bundle.getInt("FRAGMENT_EXIT_ANIM", 0);
        }

        /* renamed from: a */
        public final Bundle mo118664a(Bundle bundle, int i) {
            Intrinsics.checkParameterIsNotNull(bundle, "$this$putEnterAnim");
            bundle.putInt("FRAGMENT_ENTER_ANIM", i);
            return bundle;
        }

        /* renamed from: b */
        public final Bundle mo118666b(Bundle bundle, int i) {
            Intrinsics.checkParameterIsNotNull(bundle, "$this$putExitAnim");
            bundle.putInt("FRAGMENT_EXIT_ANIM", i);
            return bundle;
        }
    }
}
