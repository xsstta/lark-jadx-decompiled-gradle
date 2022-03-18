package com.bytedance.ee.bear.fileselector;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/FileSelectorManager;", "", "()V", "Companion", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.fileselector.b */
public final class FileSelectorManager {

    /* renamed from: a */
    public static final Companion f21081a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final DialogInterface$OnCancelListenerC1021b m31232a(Context context, FragmentManager fragmentManager, FileSelectConfig fileSelectConfig, String str) {
        return f21081a.mo30481a(context, fragmentManager, fileSelectConfig, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m31233a(FragmentManager fragmentManager, String str) {
        f21081a.mo30482a(fragmentManager, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/FileSelectorManager$Companion;", "", "()V", "SELECT_TYPE", "", "dismiss", "", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "selectFile", "Landroidx/fragment/app/DialogFragment;", "context", "Landroid/content/Context;", "fm", "config", "Lcom/bytedance/ee/bear/fileselector/api/FileSelectConfig;", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo30482a(FragmentManager fragmentManager, String str) {
            Intrinsics.checkParameterIsNotNull(fragmentManager, "manager");
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (findFragmentByTag != null && findFragmentByTag.isAdded()) {
                fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final DialogInterface$OnCancelListenerC1021b mo30481a(Context context, FragmentManager fragmentManager, FileSelectConfig fileSelectConfig, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(fileSelectConfig, "config");
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Bundle bundle = new Bundle();
            bundle.putInt("select_type", fileSelectConfig.selectType);
            Fragment instantiate = Fragment.instantiate(context, FileSelectFragment.class.getName(), bundle);
            if (instantiate != null) {
                FileSelectFragment aVar = (FileSelectFragment) instantiate;
                aVar.mo30423a(fileSelectConfig);
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fm.beginTransaction()");
                beginTransaction.add(aVar, str);
                beginTransaction.commitAllowingStateLoss();
                return aVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.fileselector.FileSelectFragment");
        }
    }
}
