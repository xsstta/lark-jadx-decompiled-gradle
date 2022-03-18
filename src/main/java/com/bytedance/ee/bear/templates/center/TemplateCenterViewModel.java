package com.bytedance.ee.bear.templates.center;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020\u0007J\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050<J\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010>\u001a\u00020\tJ\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070<J\u0006\u0010@\u001a\u00020\u0007J\u0006\u0010A\u001a\u00020\u0013J\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050<J\u0012\u0010C\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\u0005H\u0002J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050<J\u000e\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020\rJ\u000e\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020/J\u000e\u0010J\u001a\u0002092\u0006\u0010D\u001a\u00020\u0005J\u000e\u0010K\u001a\u0002092\u0006\u0010D\u001a\u00020\u0005J\u000e\u0010L\u001a\u0002092\u0006\u0010D\u001a\u00020\tJ\u000e\u0010M\u001a\u0002092\u0006\u0010G\u001a\u00020\rJ\u000e\u0010N\u001a\u0002092\u0006\u0010G\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001a\u0010)\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000bR\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "businessFilter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "businessFilterStatus", "", "categoryIndex", "", "getCategoryIndex", "()Landroidx/lifecycle/MutableLiveData;", "currentTab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "getCurrentTab", "currentTabFilterStatus", "customFilter", "customFilterStatus", "deleteToken", "", "getDeleteToken", "enterSource", "getEnterSource", "()Ljava/lang/String;", "setEnterSource", "(Ljava/lang/String;)V", "initFilterType", "getInitFilterType", "()I", "setInitFilterType", "(I)V", "isSpaceV2", "()Z", "setSpaceV2", "(Z)V", "module", "getModule", "setModule", "parentToken", "getParentToken", "setParentToken", "previewABEnable", "getPreviewABEnable", "setPreviewABEnable", "searchContent", "getSearchContent", "selectedTemplate", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "getSelectedTemplate", "()Lcom/bytedance/ee/bear/templates/TemplateV4;", "setSelectedTemplate", "(Lcom/bytedance/ee/bear/templates/TemplateV4;)V", "sp", "Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "systemFilter", "systemFilterStatus", "clearLocalFilterRecord", "", "entryFormCreateNew", "getBusinessFilterLiveData", "Landroidx/lifecycle/LiveData;", "getCurrentTabFilter", "getCurrentTabFilterIndex", "getCurrentTabFilterStatus", "getCurrentTabFilterStatusValue", "getCurrentTabTag", "getCustomFilterLiveData", "getIndexByDocumentType", ShareHitPoint.f121869d, "getSystemFilterLiveData", "hideFilter", "tab", "previewEnable", "template", "saveCurrentTabFilter", "saveCurrentTabFilterForTopic", "saveSystemFilter", "setCurrentTab", "showFilter", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.h */
public final class TemplateCenterViewModel extends AbstractC1142af {
    public static long CATEGORY_ID = -1;
    public static final Companion Companion = new Companion(null);
    public static int LAST_INDEX;
    private final C1177w<C8275a> businessFilter;
    private final C1177w<Boolean> businessFilterStatus;
    private final C1177w<Integer> categoryIndex;
    private final C1177w<Tab2> currentTab = new C1177w<>();
    private final C1177w<Boolean> currentTabFilterStatus;
    private final C1177w<C8275a> customFilter;
    private final C1177w<Boolean> customFilterStatus;
    private final C1177w<String> deleteToken;
    private String enterSource;
    private int initFilterType;
    private boolean isSpaceV2;
    private String module;
    private String parentToken;
    private boolean previewABEnable;
    private final C1177w<String> searchContent;
    private TemplateV4 selectedTemplate;
    private final PersistenceSharedPreference sp;
    private final C1177w<C8275a> systemFilter;
    private final C1177w<Boolean> systemFilterStatus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel$Companion;", "", "()V", "CATEGORY_ID", "", "getCATEGORY_ID", "()J", "setCATEGORY_ID", "(J)V", "LAST_INDEX", "", "getLAST_INDEX", "()I", "setLAST_INDEX", "(I)V", "SP_KEY_BUSINESS_FILTER", "", "SP_KEY_CUSTOM_FILTER", "SP_KEY_SYSTEM_FILTER", "SP_NAME", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo44061a() {
            return TemplateCenterViewModel.LAST_INDEX;
        }

        /* renamed from: b */
        public final long mo44064b() {
            return TemplateCenterViewModel.CATEGORY_ID;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo44062a(int i) {
            TemplateCenterViewModel.LAST_INDEX = i;
        }

        /* renamed from: a */
        public final void mo44063a(long j) {
            TemplateCenterViewModel.CATEGORY_ID = j;
        }
    }

    public final C1177w<Integer> getCategoryIndex() {
        return this.categoryIndex;
    }

    public final C1177w<Tab2> getCurrentTab() {
        return this.currentTab;
    }

    public final C1177w<String> getDeleteToken() {
        return this.deleteToken;
    }

    public final String getEnterSource() {
        return this.enterSource;
    }

    public final int getInitFilterType() {
        return this.initFilterType;
    }

    public final String getModule() {
        return this.module;
    }

    public final String getParentToken() {
        return this.parentToken;
    }

    public final boolean getPreviewABEnable() {
        return this.previewABEnable;
    }

    public final C1177w<String> getSearchContent() {
        return this.searchContent;
    }

    public final TemplateV4 getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public final boolean isSpaceV2() {
        return this.isSpaceV2;
    }

    public final LiveData<C8275a> getBusinessFilterLiveData() {
        return this.businessFilter;
    }

    public final LiveData<Boolean> getCurrentTabFilterStatus() {
        return this.currentTabFilterStatus;
    }

    public final LiveData<C8275a> getCustomFilterLiveData() {
        return this.customFilter;
    }

    public final LiveData<C8275a> getSystemFilterLiveData() {
        return this.systemFilter;
    }

    public final boolean entryFormCreateNew() {
        return Intrinsics.areEqual(this.enterSource, "create_new");
    }

    public final void clearLocalFilterRecord() {
        this.sp.mo34037a("sp_key_system_filter", -1);
        this.sp.mo34037a("sp_key_business_filter", -1);
        this.sp.mo34037a("sp_key_custom_filter", -1);
        this.systemFilter.mo5929b(C8275a.f22369b);
        this.customFilter.mo5929b(C8275a.f22369b);
        this.customFilter.mo5929b(C8275a.f22369b);
    }

    public final String getCurrentTabTag() {
        Tab2 b = this.currentTab.mo5927b();
        if (b != null) {
            int i = C11473i.f30848b[b.ordinal()];
            if (i == 1) {
                return "corporate";
            }
            if (i != 2) {
                return "system";
            }
            return "custom";
        }
        return "system";
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ee.bear.list.dto.C8275a getCurrentTabFilter() {
        /*
            r2 = this;
            androidx.lifecycle.w<com.bytedance.ee.bear.templates.center.Tab2> r0 = r2.currentTab
            java.lang.Object r0 = r0.mo5927b()
            com.bytedance.ee.bear.templates.center.Tab2 r0 = (com.bytedance.ee.bear.templates.center.Tab2) r0
            if (r0 != 0) goto L_0x000b
            goto L_0x001c
        L_0x000b:
            int[] r1 = com.bytedance.ee.bear.templates.center.C11473i.f30849c
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x0037
            r1 = 2
            if (r0 == r1) goto L_0x002e
            r1 = 3
            if (r0 == r1) goto L_0x0025
        L_0x001c:
            androidx.lifecycle.w<com.bytedance.ee.bear.list.dto.a> r0 = r2.systemFilter
            java.lang.Object r0 = r0.mo5927b()
            com.bytedance.ee.bear.list.dto.a r0 = (com.bytedance.ee.bear.list.dto.C8275a) r0
            goto L_0x003f
        L_0x0025:
            androidx.lifecycle.w<com.bytedance.ee.bear.list.dto.a> r0 = r2.customFilter
            java.lang.Object r0 = r0.mo5927b()
            com.bytedance.ee.bear.list.dto.a r0 = (com.bytedance.ee.bear.list.dto.C8275a) r0
            goto L_0x003f
        L_0x002e:
            androidx.lifecycle.w<com.bytedance.ee.bear.list.dto.a> r0 = r2.businessFilter
            java.lang.Object r0 = r0.mo5927b()
            com.bytedance.ee.bear.list.dto.a r0 = (com.bytedance.ee.bear.list.dto.C8275a) r0
            goto L_0x003f
        L_0x0037:
            androidx.lifecycle.w<com.bytedance.ee.bear.list.dto.a> r0 = r2.systemFilter
            java.lang.Object r0 = r0.mo5927b()
            com.bytedance.ee.bear.list.dto.a r0 = (com.bytedance.ee.bear.list.dto.C8275a) r0
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            goto L_0x0049
        L_0x0042:
            com.bytedance.ee.bear.list.dto.a r0 = com.bytedance.ee.bear.list.dto.C8275a.f22369b
            java.lang.String r1 = "DocumentType.UNKNOWN"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.center.TemplateCenterViewModel.getCurrentTabFilter():com.bytedance.ee.bear.list.dto.a");
    }

    public final int getCurrentTabFilterIndex() {
        Tab2 b = this.currentTab.mo5927b();
        if (b != null) {
            int i = C11473i.f30850d[b.ordinal()];
            if (i == 1) {
                return getIndexByDocumentType(this.systemFilter.mo5927b());
            }
            if (i == 2) {
                return getIndexByDocumentType(this.businessFilter.mo5927b());
            }
            if (i == 3) {
                return getIndexByDocumentType(this.customFilter.mo5927b());
            }
        }
        return getIndexByDocumentType(this.systemFilter.mo5927b());
    }

    public final boolean getCurrentTabFilterStatusValue() {
        Tab2 b = this.currentTab.mo5927b();
        Boolean bool = false;
        if (b != null) {
            int i = C11473i.f30853g[b.ordinal()];
            if (i == 1) {
                Boolean b2 = this.systemFilterStatus.mo5927b();
                if (b2 != null) {
                    bool = b2;
                }
                return bool.booleanValue();
            } else if (i == 2) {
                Boolean b3 = this.businessFilterStatus.mo5927b();
                if (b3 != null) {
                    bool = b3;
                }
                return bool.booleanValue();
            } else if (i == 3) {
                Boolean b4 = this.customFilterStatus.mo5927b();
                if (b4 != null) {
                    bool = b4;
                }
                return bool.booleanValue();
            }
        }
        Boolean b5 = this.systemFilterStatus.mo5927b();
        if (b5 != null) {
            bool = b5;
        }
        return bool.booleanValue();
    }

    public TemplateCenterViewModel() {
        C1177w<C8275a> wVar = new C1177w<>();
        this.systemFilter = wVar;
        C1177w<C8275a> wVar2 = new C1177w<>();
        this.customFilter = wVar2;
        C1177w<C8275a> wVar3 = new C1177w<>();
        this.businessFilter = wVar3;
        this.currentTabFilterStatus = new C1177w<>();
        this.systemFilterStatus = new C1177w<>();
        this.customFilterStatus = new C1177w<>();
        this.businessFilterStatus = new C1177w<>();
        this.searchContent = new C1177w<>();
        this.categoryIndex = new C1177w<>();
        this.deleteToken = new C1177w<>();
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("sp_name_template");
        this.sp = aVar;
        this.parentToken = "";
        this.module = "";
        this.enterSource = "";
        this.initFilterType = -1;
        wVar.mo5929b(C8275a.m34052b(aVar.getInt("sp_key_system_filter", -1)));
        wVar2.mo5929b(C8275a.m34052b(aVar.getInt("sp_key_custom_filter", -1)));
        wVar3.mo5929b(C8275a.m34052b(aVar.getInt("sp_key_business_filter", -1)));
    }

    public final void setInitFilterType(int i) {
        this.initFilterType = i;
    }

    public final void setPreviewABEnable(boolean z) {
        this.previewABEnable = z;
    }

    public final void setSelectedTemplate(TemplateV4 templateV4) {
        this.selectedTemplate = templateV4;
    }

    public final void setSpaceV2(boolean z) {
        this.isSpaceV2 = z;
    }

    public final void setEnterSource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.enterSource = str;
    }

    public final void setModule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.module = str;
    }

    public final void setParentToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.parentToken = str;
    }

    public final void saveCurrentTabFilterForTopic(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, ShareHitPoint.f121869d);
        this.systemFilter.mo5929b(aVar);
    }

    public final void setCurrentTab(Tab2 tab2) {
        Intrinsics.checkParameterIsNotNull(tab2, "tab");
        this.currentTab.mo5929b(tab2);
    }

    public final void saveSystemFilter(int i) {
        this.sp.mo34037a("sp_key_system_filter", Integer.valueOf(i));
        this.systemFilter.mo5929b(C8275a.m34052b(i));
    }

    private final int getIndexByDocumentType(C8275a aVar) {
        if (Intrinsics.areEqual(C8275a.f22371d, aVar) || Intrinsics.areEqual(C8275a.f22378k, aVar)) {
            return 1;
        }
        if (Intrinsics.areEqual(C8275a.f22372e, aVar)) {
            return 2;
        }
        if (Intrinsics.areEqual(C8275a.f22374g, aVar)) {
            return 3;
        }
        if (Intrinsics.areEqual(C8275a.f22373f, aVar)) {
            return 4;
        }
        return 0;
    }

    public final void hideFilter(Tab2 tab2) {
        Intrinsics.checkParameterIsNotNull(tab2, "tab");
        if (tab2 == this.currentTab.mo5927b()) {
            this.currentTabFilterStatus.mo5929b((Boolean) false);
        }
        int i = C11473i.f30851e[tab2.ordinal()];
        if (i == 1) {
            this.systemFilterStatus.mo5929b((Boolean) false);
        } else if (i == 2) {
            this.businessFilterStatus.mo5929b((Boolean) false);
        } else if (i == 3) {
            this.customFilterStatus.mo5929b((Boolean) false);
        }
    }

    public final boolean previewEnable(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        if (!this.previewABEnable || !C4211a.m17514a().mo16536a("spacekit.mobile.single_template_preview_enable", false)) {
            return false;
        }
        if (templateV4.isSystemTemplate() || C4211a.m17514a().mo16536a("spacekit.mobile.custom_corporate_preview_enable", false)) {
            return true;
        }
        return false;
    }

    public final void showFilter(Tab2 tab2) {
        Intrinsics.checkParameterIsNotNull(tab2, "tab");
        if (tab2 == this.currentTab.mo5927b()) {
            this.currentTabFilterStatus.mo5929b((Boolean) true);
        }
        int i = C11473i.f30852f[tab2.ordinal()];
        if (i == 1) {
            this.systemFilterStatus.mo5929b((Boolean) true);
        } else if (i == 2) {
            this.businessFilterStatus.mo5929b((Boolean) true);
        } else if (i == 3) {
            this.customFilterStatus.mo5929b((Boolean) true);
        }
    }

    public final void saveCurrentTabFilter(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, ShareHitPoint.f121869d);
        if (Intrinsics.areEqual(aVar, getCurrentTabFilter())) {
            C13479a.m54764b("TemplateCenterViewModel", "saveCurrentTabFilter()...but type not change");
            return;
        }
        Tab2 b = this.currentTab.mo5927b();
        if (b != null) {
            int i = C11473i.f30847a[b.ordinal()];
            if (i == 1) {
                this.systemFilter.mo5929b(aVar);
                this.sp.mo34037a("sp_key_system_filter", Integer.valueOf(aVar.mo32555b()));
                return;
            } else if (i == 2) {
                this.businessFilter.mo5929b(aVar);
                this.sp.mo34037a("sp_key_business_filter", Integer.valueOf(aVar.mo32555b()));
                return;
            } else if (i == 3) {
                this.customFilter.mo5929b(aVar);
                this.sp.mo34037a("sp_key_custom_filter", Integer.valueOf(aVar.mo32555b()));
                return;
            }
        }
        this.systemFilter.mo5929b(aVar);
        this.sp.mo34037a("sp_key_system_filter", Integer.valueOf(aVar.mo32555b()));
    }
}
