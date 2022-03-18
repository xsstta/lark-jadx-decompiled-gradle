package com.bytedance.ee.bear.doc.cover;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.doc.cover.selectcover.local.LocalImageItem;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverData;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverLoader;
import com.bytedance.ee.bear.thread.C11678b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000245B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020!2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010'\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\b\u0010(\u001a\u00020\u001eH\u0014J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020#J&\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\u0006\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0016\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/J \u00100\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\b\u00101\u001a\u0004\u0018\u00010!J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0013R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\b¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CoverViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "coverSeriesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverSeries;", "getCoverSeriesList", "()Landroidx/lifecycle/MutableLiveData;", "currentCoverData", "Lcom/bytedance/ee/bear/doc/cover/CurrentCoverData;", "getCurrentCoverData", "delegate", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$Delegate;)V", "isEnterAnimationShowing", "", "isRemoteLoading", "()Z", "setRemoteLoading", "(Z)V", "isVCFollowMode", "mFetchCoverDisposable", "Lio/reactivex/disposables/Disposable;", "selectCoverActive", "getSelectCoverActive", "deleteCover", "", "fetchOfficialCoverData", "token", "", "docType", "", "fetchCoverListener", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$IFetchCoverListener;", "getSeriesName", "isCoverDataNotExist", "onCleared", "randomCover", "entrance", "documentType", "selectLocalImage", ShareHitPoint.f121868c, "image", "Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalImageItem;", "selectOfficialCover", "mimeType", "setVCFollowMode", "VCFollowMode", "Delegate", "IFetchCoverListener", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.cover.a */
public final class CoverViewModel extends AbstractC1142af {
    private final C1177w<List<OfficialCoverData.CoverSeries>> coverSeriesList = new C1177w<>();
    private final C1177w<CurrentCoverData> currentCoverData = new C1177w<>();
    private Delegate delegate;
    private final C1177w<Boolean> isEnterAnimationShowing = new C1177w<>();
    private boolean isRemoteLoading;
    private boolean isVCFollowMode;
    private Disposable mFetchCoverDisposable;
    private final C1177w<Boolean> selectCoverActive = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J2\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$Delegate;", "", "deleteCover", "", "selectLocalImage", ShareHitPoint.f121868c, "", "image", "Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalImageItem;", "selectOfficialCover", "entrance", "", "token", "seriesName", "mimeType", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.a$a */
    public interface Delegate {
        /* renamed from: a */
        void mo21503a();

        /* renamed from: a */
        void mo21504a(int i, String str, String str2, String str3, String str4);

        /* renamed from: a */
        void mo21505a(String str, LocalImageItem localImageItem);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/CoverViewModel$IFetchCoverListener;", "", "onFailure", "", "throwable", "", "onSuccess", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.a$b */
    public interface IFetchCoverListener {
        /* renamed from: a */
        void mo21506a();

        /* renamed from: a */
        void mo21507a(Throwable th);
    }

    public final C1177w<List<OfficialCoverData.CoverSeries>> getCoverSeriesList() {
        return this.coverSeriesList;
    }

    public final C1177w<CurrentCoverData> getCurrentCoverData() {
        return this.currentCoverData;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<Boolean> getSelectCoverActive() {
        return this.selectCoverActive;
    }

    public final C1177w<Boolean> isEnterAnimationShowing() {
        return this.isEnterAnimationShowing;
    }

    public final boolean isRemoteLoading() {
        return this.isRemoteLoading;
    }

    public final boolean isVCFollowMode() {
        return this.isVCFollowMode;
    }

    public final void deleteCover() {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21503a();
        }
    }

    public final boolean isCoverDataNotExist() {
        List<OfficialCoverData.CoverSeries> b = this.coverSeriesList.mo5927b();
        if (b == null || b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        Disposable disposable;
        Disposable disposable2 = this.mFetchCoverDisposable;
        if (disposable2 != null) {
            if (disposable2 == null) {
                Intrinsics.throwNpe();
            }
            if (!disposable2.isDisposed() && (disposable = this.mFetchCoverDisposable) != null) {
                disposable.dispose();
            }
        }
    }

    public final void setDelegate(Delegate aVar) {
        this.delegate = aVar;
    }

    public final void setRemoteLoading(boolean z) {
        this.isRemoteLoading = z;
    }

    public final void setVCFollowMode(boolean z) {
        this.isVCFollowMode = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.a$d */
    public static final class C5388d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ CoverViewModel f15388a;

        /* renamed from: b */
        final /* synthetic */ IFetchCoverListener f15389b;

        C5388d(CoverViewModel aVar, IFetchCoverListener bVar) {
            this.f15388a = aVar;
            this.f15389b = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f15388a.setRemoteLoading(false);
            IFetchCoverListener bVar = this.f15389b;
            Intrinsics.checkExpressionValueIsNotNull(th, "throwable");
            bVar.mo21507a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.a$c */
    public static final class C5387c<T> implements Consumer<OfficialCoverData> {

        /* renamed from: a */
        final /* synthetic */ CoverViewModel f15386a;

        /* renamed from: b */
        final /* synthetic */ IFetchCoverListener f15387b;

        C5387c(CoverViewModel aVar, IFetchCoverListener bVar) {
            this.f15386a = aVar;
            this.f15387b = bVar;
        }

        /* renamed from: a */
        public final void accept(OfficialCoverData officialCoverData) {
            List<OfficialCoverData.CoverSeries> list;
            officialCoverData.handlePrioritize();
            C1177w<List<OfficialCoverData.CoverSeries>> coverSeriesList = this.f15386a.getCoverSeriesList();
            OfficialCoverData.Data data = (OfficialCoverData.Data) officialCoverData.data;
            if (data != null) {
                list = data.getCoverSeriesList();
            } else {
                list = null;
            }
            coverSeriesList.mo5929b(list);
            this.f15386a.setRemoteLoading(false);
            this.f15387b.mo21506a();
        }
    }

    private final String getSeriesName(String str) {
        String seriesId;
        List<OfficialCoverData.CoverSeries> b = this.coverSeriesList.mo5927b();
        if (b == null) {
            return "";
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "list");
        for (T t : b) {
            List<OfficialCoverData.CoverItem> candidateCovers = t.getCandidateCovers();
            if (candidateCovers != null) {
                Iterator<T> it = candidateCovers.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(str, it.next().getToken())) {
                        OfficialCoverData.Series series = t.getSeries();
                        if (series == null || (seriesId = series.getSeriesId()) == null) {
                            return "";
                        }
                        return seriesId;
                    }
                }
                continue;
            }
        }
        return "";
    }

    public final void randomCover(int i) {
        OfficialCoverData.CoverItem coverItem;
        String token;
        Delegate aVar;
        ArrayList arrayList = new ArrayList();
        List<OfficialCoverData.CoverSeries> b = this.coverSeriesList.mo5927b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "list");
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                List<OfficialCoverData.CoverItem> candidateCovers = it.next().getCandidateCovers();
                if (candidateCovers != null) {
                    Iterator<T> it2 = candidateCovers.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if ((!arrayList2.isEmpty()) && (token = (coverItem = (OfficialCoverData.CoverItem) CollectionsKt.random(arrayList2, Random.f173148c)).getToken()) != null && (aVar = this.delegate) != null) {
            aVar.mo21504a(i, "random", token, getSeriesName(token), coverItem.getMimeType());
        }
    }

    public final void selectLocalImage(String str, LocalImageItem localImageItem) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(localImageItem, "image");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21505a(str, localImageItem);
        }
    }

    public final void selectOfficialCover(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21504a(i, "gallery", str, getSeriesName(str), str2);
        }
    }

    public final void fetchOfficialCoverData(String str, int i, IFetchCoverListener bVar) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(bVar, "fetchCoverListener");
        this.isRemoteLoading = true;
        this.mFetchCoverDisposable = OfficialCoverLoader.m21970a(str, i).mo237985a(C11678b.m48481e()).mo238001b(new C5387c(this, bVar), new C5388d(this, bVar));
    }

    public final void randomCover(int i, String str, int i2, IFetchCoverListener bVar) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(bVar, "fetchCoverListener");
        if (!isCoverDataNotExist() || this.isRemoteLoading) {
            randomCover(i);
        } else {
            fetchOfficialCoverData(str, i2, bVar);
        }
    }
}
