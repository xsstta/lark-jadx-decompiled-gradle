package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListArgs;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "Landroidx/lifecycle/ViewModel;", "args", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;)V", "getArgs", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "searchInput", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchInput", "()Landroidx/lifecycle/MutableLiveData;", "searching", "", "getSearching", "title", "", "getTitle", "clearSearchInput", "", "init", "setInSearching", "inSearching", "setSearchInput", "input", "Companion", "Factory", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.g */
public final class WikiSpaceTabViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final WikiSpaceListArgs args;
    private final C1177w<String> searchInput = new C1177w<>();
    private final C1177w<Boolean> searching = new C1177w<>();
    private final C1177w<Integer> title = new C1177w<>();

    @JvmStatic
    public static final WikiSpaceTabViewModel newInstance(Fragment fragment) {
        return Companion.mo47024a(fragment);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel;", "owner", "Landroidx/fragment/app/Fragment;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiSpaceTabViewModel mo47024a(Fragment fragment) {
            WikiSpaceListArgs wikiSpaceListArgs;
            Intrinsics.checkParameterIsNotNull(fragment, "owner");
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                wikiSpaceListArgs = (WikiSpaceListArgs) arguments.getParcelable(WikiSpaceListArgs.class.getName());
            } else {
                wikiSpaceListArgs = null;
            }
            AbstractC1142af a = new C1144ai(fragment, new Factory(wikiSpaceListArgs)).mo6005a(WikiSpaceTabViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(owner,…TabViewModel::class.java)");
            return (WikiSpaceTabViewModel) a;
        }
    }

    public final WikiSpaceListArgs getArgs() {
        return this.args;
    }

    public final C1177w<String> getSearchInput() {
        return this.searchInput;
    }

    public final C1177w<Boolean> getSearching() {
        return this.searching;
    }

    public final C1177w<Integer> getTitle() {
        return this.title;
    }

    public final void clearSearchInput() {
        this.searchInput.mo5929b("");
    }

    private final void init() {
        int i;
        Integer num;
        this.searching.mo5929b((Boolean) false);
        this.searchInput.mo5929b("");
        C1177w<Integer> wVar = this.title;
        WikiSpaceListArgs wikiSpaceListArgs = this.args;
        if (wikiSpaceListArgs != null) {
            i = wikiSpaceListArgs.getPageMode();
        } else {
            i = -1;
        }
        if (i == 1) {
            num = Integer.valueOf((int) R.string.Doc_Wiki_CreatePage);
        } else if (i == 2 || i == 3) {
            num = Integer.valueOf((int) R.string.CreationMobile_Wiki_Shortcuts_SelectWorkspace_Title);
        } else if (i != 4) {
            num = Integer.valueOf((int) R.string.Doc_Wiki_Home_WorkspaceTitle);
        } else {
            num = Integer.valueOf((int) R.string.CreationMobile_Wiki_CreateCopy_CreateCopyTo_Title);
        }
        wVar.mo5929b(num);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "args", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;)V", "getArgs", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListArgs;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.g$b */
    public static final class Factory implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        private final WikiSpaceListArgs f33113a;

        public Factory(WikiSpaceListArgs wikiSpaceListArgs) {
            this.f33113a = wikiSpaceListArgs;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return cls.getConstructor(WikiSpaceListArgs.class).newInstance(this.f33113a);
        }
    }

    public final void setInSearching(boolean z) {
        this.searching.mo5929b(Boolean.valueOf(z));
    }

    public final void setSearchInput(String str) {
        Intrinsics.checkParameterIsNotNull(str, "input");
        this.searchInput.mo5929b(str);
    }

    public WikiSpaceTabViewModel(WikiSpaceListArgs wikiSpaceListArgs) {
        this.args = wikiSpaceListArgs;
        init();
    }
}
