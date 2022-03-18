package com.bytedance.ee.bear.templates.center.list.system;

import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListPresenter;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListPresenter;", "Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListPresenter;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListModel;", "view", "Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListView;", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListModel;Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListView;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getModel", "()Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListModel;", "getView", "()Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListView;", "loadMore", "", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.d.c */
public final class SystemTemplateListPresenter extends BaseTemplateListPresenter {

    /* renamed from: e */
    public static final Companion f30981e = new Companion(null);

    /* renamed from: f */
    private final Fragment f30982f;

    /* renamed from: g */
    private final SystemTemplateListModel f30983g;

    /* renamed from: h */
    private final SystemTemplateListView f30984h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateListPresenter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListPresenter
    /* renamed from: i */
    public Fragment mo44161i() {
        return this.f30982f;
    }

    /* renamed from: m */
    public SystemTemplateListModel mo44162j() {
        return this.f30983g;
    }

    /* renamed from: n */
    public SystemTemplateListView mo44163k() {
        return this.f30984h;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate, com.bytedance.ee.bear.templates.center.list.base.BaseTemplateListPresenter
    /* renamed from: f */
    public void mo44158f() {
        long j;
        int i;
        CategoryTab h = mo44163k().mo44193h();
        if (h != null) {
            j = h.getCategoryId();
        } else {
            j = -1;
        }
        if (h != null) {
            i = h.getPageNumber();
        } else {
            i = 1;
        }
        C13479a.m54764b("SystemTemplateListPresenter", "loadMore()...index = " + mo44153b() + " pageNumber=" + i + " categoryId=" + j);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        mo44146a().mo237937a(mo44162j().mo44136a(mo44153b(), mo44159g(), j, i).mo238001b(new C11513b(this, h, i, booleanRef), new C11514c(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.c$c */
    static final class C11514c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ SystemTemplateListPresenter f30989a;

        C11514c(SystemTemplateListPresenter cVar) {
            this.f30989a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("SystemTemplateListPresenter", "loadMoreError()...", th);
            this.f30989a.mo44163k().mo44184a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.c$b */
    static final class C11513b<T> implements Consumer<TemplateGroupTab> {

        /* renamed from: a */
        final /* synthetic */ SystemTemplateListPresenter f30985a;

        /* renamed from: b */
        final /* synthetic */ CategoryTab f30986b;

        /* renamed from: c */
        final /* synthetic */ int f30987c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f30988d;

        C11513b(SystemTemplateListPresenter cVar, CategoryTab categoryTab, int i, Ref.BooleanRef booleanRef) {
            this.f30985a = cVar;
            this.f30986b = categoryTab;
            this.f30987c = i;
            this.f30988d = booleanRef;
        }

        /* renamed from: a */
        public final void accept(TemplateGroupTab templateGroupTab) {
            if (!(!Intrinsics.areEqual(this.f30986b, this.f30985a.mo44163k().mo44193h()))) {
                this.f30985a.mo44152a(templateGroupTab.getShareIndex());
                this.f30985a.mo44163k().mo44183a(templateGroupTab.getCategoryTabList(), this.f30987c, templateGroupTab.getSource());
                this.f30985a.mo44163k().mo44184a(templateGroupTab.getHasMore());
                if (templateGroupTab.getHasData() && templateGroupTab.getHasMore() && !this.f30988d.element) {
                    CategoryTab categoryTab = this.f30986b;
                    if (categoryTab != null) {
                        categoryTab.setPageNumber(this.f30987c + 1);
                    }
                    this.f30988d.element = true;
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SystemTemplateListPresenter(androidx.fragment.app.Fragment r5, com.bytedance.ee.bear.templates.center.list.system.SystemTemplateListModel r6, com.bytedance.ee.bear.templates.center.list.system.SystemTemplateListView r7) {
        /*
            r4 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "model"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            r0 = r6
            com.bytedance.ee.bear.templates.center.list.a.e r0 = (com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel) r0
            r1 = r7
            com.bytedance.ee.bear.templates.center.list.a.f r1 = (com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView) r1
            r2 = 2131825764(0x7f111464, float:1.9284393E38)
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = "fragment.getString(R.str…c_List_v4TemplateGallery)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r4.<init>(r5, r0, r1, r2)
            r4.f30982f = r5
            r4.f30983g = r6
            r4.f30984h = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.center.list.system.SystemTemplateListPresenter.<init>(androidx.fragment.app.Fragment, com.bytedance.ee.bear.templates.center.list.d.b, com.bytedance.ee.bear.templates.center.list.d.d):void");
    }
}
