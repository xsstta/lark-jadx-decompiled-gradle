package com.ss.android.lark.mm.module.detail.main;

import android.os.Parcelable;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.contentdetail.MmContentDetailFragment;
import com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesFragment;
import com.ss.android.lark.mm.module.detail.summary.MmSummaryFragment;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/MmDetailTabFragmentAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "hasSummary", "", "(Landroidx/fragment/app/FragmentManager;Z)V", "contentDetailFragment", "Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailFragment;", "getHasSummary", "()Z", "subtitlesFragment", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesFragment;", "summaryFragment", "Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryFragment;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "saveState", "Landroid/os/Parcelable;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.g */
public final class MmDetailTabFragmentAdapter extends AbstractC1045n {

    /* renamed from: a */
    private final MmSubtitlesFragment f116124a = new MmSubtitlesFragment();

    /* renamed from: b */
    private final MmSummaryFragment f116125b = new MmSummaryFragment();

    /* renamed from: c */
    private final MmContentDetailFragment f116126c = new MmContentDetailFragment();

    /* renamed from: d */
    private final boolean f116127d;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        if (this.f116127d) {
            return 3;
        }
        return 2;
    }

    @Override // androidx.fragment.app.AbstractC1045n, androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        C45855f.m181664c("MmDetailTabFragmentAdapter", "saveState");
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1045n
    /* renamed from: a */
    public Fragment mo5615a(int i) {
        Fragment fragment;
        Fragment fragment2;
        if (i == 0) {
            return this.f116124a;
        }
        if (i == 1) {
            if (this.f116127d) {
                fragment = this.f116125b;
            } else {
                fragment = this.f116126c;
            }
            return fragment;
        } else if (i != 2) {
            return this.f116124a;
        } else {
            if (this.f116127d) {
                fragment2 = this.f116126c;
            } else {
                fragment2 = this.f116124a;
            }
            return fragment2;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        Fragment a = mo5615a(i);
        if (a instanceof MmSubtitlesFragment) {
            return C45851c.m181646a().getString(R.string.MMWeb_G_Transcription);
        }
        if (a instanceof MmSummaryFragment) {
            return C45851c.m181646a().getString(R.string.MMWeb_G_MinutesTitle);
        }
        if (a instanceof MmContentDetailFragment) {
            return C45851c.m181646a().getString(R.string.MMWeb_G_Details);
        }
        return C45851c.m181646a().getString(R.string.MMWeb_G_Transcription);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailTabFragmentAdapter(FragmentManager fragmentManager, boolean z) {
        super(fragmentManager);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        this.f116127d = z;
    }
}
