package com.bytedance.ee.bear.bitable.pro;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r0\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/bytedance/ee/bear/bitable/pro/BitableProRepository;", "(Lcom/bytedance/ee/bear/bitable/pro/BitableProRepository;)V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "roleListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "Lkotlin/collections/ArrayList;", "fetchRoleResult", "", "getRoleListLiveData", "Landroidx/lifecycle/LiveData;", "onCleared", "removeMember", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "role", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.e */
public final class BitableProViewModel extends AbstractC1142af {
    public final String TAG = "BitableProViewModel";
    private final C68289a compositeDisposable = new C68289a();
    private final BitableProRepository repository;
    public final C1177w<ArrayList<Role>> roleListLiveData = new C1177w<>();

    public final LiveData<ArrayList<Role>> getRoleListLiveData() {
        return this.roleListLiveData;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.mo237935a();
    }

    public final void fetchRoleResult() {
        this.compositeDisposable.mo237937a(this.repository.mo18941a().mo238001b(new C4839a(this), new C4841b(this)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.e$b */
    public static final class C4841b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableProViewModel f14212a;

        C4841b(BitableProViewModel eVar) {
            this.f14212a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f14212a.TAG, "fetchRoleResult()...error", th);
            this.f14212a.roleListLiveData.mo5929b((ArrayList<Role>) null);
        }
    }

    public BitableProViewModel(BitableProRepository dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "repository");
        this.repository = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/bitable/pro/RoleResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.e$a */
    public static final class C4839a<T> implements Consumer<RoleResult> {

        /* renamed from: a */
        final /* synthetic */ BitableProViewModel f14210a;

        C4839a(BitableProViewModel eVar) {
            this.f14210a = eVar;
        }

        /* renamed from: a */
        public final void accept(RoleResult roleResult) {
            ArrayList<Role> arrayList = new ArrayList<>();
            if (roleResult.getDefaultReadRole() != null) {
                arrayList.add(roleResult.getDefaultReadRole());
            }
            if (roleResult.getDefaultEditRole() != null) {
                arrayList.add(roleResult.getDefaultEditRole());
            }
            arrayList.addAll(roleResult.getOtherRole());
            CollectionsKt.sortWith(arrayList, C48401.f14211a);
            this.f14210a.roleListLiveData.mo5929b(arrayList);
        }
    }

    public final AbstractC68307f<SimpleRequestResult> removeMember(Role role, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(role, "role");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        return this.repository.mo18942a(role, userInfo);
    }
}
