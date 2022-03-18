package com.ss.android.lark.contact.impl.contacts_selector.school;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.SchoolContactStructureResponse;
import com.ss.android.lark.contact.entity.EduDepartmentLevel;
import com.ss.android.lark.contact.entity.SchoolNodeLite;
import com.ss.android.lark.contact.entity.SchoolNodeWithUpperNodesPath;
import com.ss.android.lark.contact.entity.SchoolParent;
import com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactListener;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\u001e\u0010%\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020 0'2\u0006\u0010(\u001a\u00020\u000eH\u0002J \u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\bH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\u0012\u0010/\u001a\u00020\u00012\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u00102\u001a\u00020\u00012\b\u00100\u001a\u0004\u0018\u00010\u0019H\u0016J\u0016\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u0002052\u0006\u0010(\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactController;", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactController;", "mContext", "Landroid/content/Context;", "mContainer", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "TAG", "", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mCounter", "", "mFetchCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/SchoolContactStructureResponse;", "mLoginDependency", "Lcom/ss/android/lark/contact/dependency/IContactModuleDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "mMaxSize", "mModel", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactModel;", "mReadyListener", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactListener$IViewReady;", "mTargetView", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/SchoolContactView;", "bindListener", "", "createViewAndBindListener", "schoolNodeWithUpperNodesPath", "Lcom/ss/android/lark/contact/entity/SchoolNodeWithUpperNodesPath;", "inflater", "Landroid/view/LayoutInflater;", "fetch", "getDepartmentCount", "handleAppendSchoolElement", "schoolInfoList", "", "memberCount", "handleItemClick", "view", "Landroid/view/View;", "id", "schoolNodePreName", "init", "setOnItemClickListener", "listener", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactListener;", "setOnViewReadyListener", "updateTvDepartmentHeader", "textView", "Landroid/widget/TextView;", "InnerOnClickListener", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.d */
public final class SchoolParentContactController implements ISchoolParentContactController {

    /* renamed from: a */
    public final ISchoolParentContactModel f92475a = new SchoolParentContactModel();

    /* renamed from: b */
    public ISchoolParentContactListener.IViewReady f92476b;

    /* renamed from: c */
    private final String f92477c = "SchoolParentContactController";

    /* renamed from: d */
    private SchoolContactView f92478d;

    /* renamed from: e */
    private final AbstractC35361b.AbstractC35376o f92479e;

    /* renamed from: f */
    private int f92480f;

    /* renamed from: g */
    private final int f92481g;

    /* renamed from: h */
    private final IGetDataCallback<SchoolContactStructureResponse> f92482h;

    /* renamed from: i */
    private Context f92483i;

    /* renamed from: j */
    private ViewGroup f92484j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactController$InnerOnClickListener;", "Landroid/view/View$OnClickListener;", "identifier", "", "schoolNodePreName", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getSchoolNodePreName", "onClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.d$a */
    public static class InnerOnClickListener implements View.OnClickListener {

        /* renamed from: a */
        private final String f92485a;

        /* renamed from: b */
        private final String f92486b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
        }

        /* renamed from: a */
        public final String mo131665a() {
            return this.f92485a;
        }

        /* renamed from: b */
        public final String mo131666b() {
            return this.f92486b;
        }

        public InnerOnClickListener(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "identifier");
            Intrinsics.checkParameterIsNotNull(str2, "schoolNodePreName");
            this.f92485a = str;
            this.f92486b = str2;
        }
    }

    /* renamed from: c */
    public final Context mo131664c() {
        return this.f92483i;
    }

    /* renamed from: e */
    private final void m140007e() {
        ViewGroup headerViewGroup;
        SchoolContactView schoolContactView = this.f92478d;
        if (schoolContactView != null && (headerViewGroup = schoolContactView.getHeaderViewGroup()) != null) {
            headerViewGroup.setOnClickListener(new C35768b(this, "0", ""));
        }
    }

    /* renamed from: b */
    public SchoolParentContactController mo131655a() {
        if (this.f92478d == null) {
            Log.m165389i(this.f92477c, "fetch targetView is null");
            return this;
        }
        AbstractC35361b.AbstractC35376o oVar = this.f92479e;
        Intrinsics.checkExpressionValueIsNotNull(oVar, "mLoginDependency");
        if (oVar.mo130230b()) {
            Log.m165389i(this.f92477c, "fetch is smallB account");
            return this;
        }
        this.f92475a.mo131658a(this.f92482h);
        return this;
    }

    /* renamed from: d */
    private final void m140006d() {
        ViewGroup headerViewGroup;
        TextView textView;
        AbstractC35361b.AbstractC35376o oVar = this.f92479e;
        Intrinsics.checkExpressionValueIsNotNull(oVar, "mLoginDependency");
        if (!oVar.mo130230b()) {
            SchoolContactView schoolContactView = new SchoolContactView(this.f92483i, null, 0, 6, null);
            this.f92478d = schoolContactView;
            if (!(schoolContactView == null || (headerViewGroup = schoolContactView.getHeaderViewGroup()) == null || (textView = (TextView) headerViewGroup.findViewById(R.id.tv_school_header)) == null)) {
                DesktopUtil.m144299a(textView);
            }
            this.f92484j.addView(this.f92478d, new ViewGroup.LayoutParams(-1, -2));
            m140007e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactController$mFetchCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/SchoolContactStructureResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "structure", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.d$d */
    public static final class C35770d implements IGetDataCallback<SchoolContactStructureResponse> {

        /* renamed from: a */
        final /* synthetic */ SchoolParentContactController f92492a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35770d(SchoolParentContactController dVar) {
            this.f92492a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(SchoolContactStructureResponse fVar) {
            int i;
            if (!UIUtils.isActivityRunning((Activity) this.f92492a.mo131664c())) {
                this.f92492a.f92475a.mo131657a();
            } else if (fVar == null) {
            } else {
                if (fVar.mo130395b() != null || fVar.mo130392a() != null) {
                    List<SchoolNodeWithUpperNodesPath> a = fVar.mo130392a();
                    if (a != null) {
                        SchoolParentContactController dVar = this.f92492a;
                        List<SchoolNodeWithUpperNodesPath> a2 = fVar.mo130392a();
                        if (a2 != null) {
                            i = a2.size();
                        } else {
                            i = -1;
                        }
                        dVar.mo131662a(a, i);
                    }
                    ISchoolParentContactListener.IViewReady aVar = this.f92492a.f92476b;
                    if (aVar != null) {
                        aVar.mo131544a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public ISchoolParentContactController mo131659a(ISchoolParentContactListener.IViewReady aVar) {
        this.f92476b = aVar;
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactController$bindListener$1", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactController$InnerOnClickListener;", "onClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.d$b */
    public static final class C35768b extends InnerOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SchoolParentContactController f92487a;

        @Override // com.ss.android.lark.contact.impl.contacts_selector.school.SchoolParentContactController.InnerOnClickListener
        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f92487a.mo131660a(view, mo131665a(), mo131666b());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35768b(SchoolParentContactController dVar, String str, String str2) {
            super(str, str2);
            this.f92487a = dVar;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactController
    /* renamed from: a */
    public ISchoolParentContactController mo131656a(ISchoolParentContactListener bVar) {
        SchoolContactView schoolContactView = this.f92478d;
        if (schoolContactView != null) {
            schoolContactView.setOnItemClickListener(bVar);
        }
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactController$createViewAndBindListener$2", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactController$InnerOnClickListener;", "onClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.d$c */
    public static final class C35769c extends InnerOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SchoolParentContactController f92488a;

        /* renamed from: b */
        final /* synthetic */ SchoolNodeWithUpperNodesPath f92489b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f92490c;

        /* renamed from: d */
        final /* synthetic */ Ref.ObjectRef f92491d;

        @Override // com.ss.android.lark.contact.impl.contacts_selector.school.SchoolParentContactController.InnerOnClickListener
        public void onClick(View view) {
            int i;
            EduDepartmentLevel eduDepartmentLevel;
            Intrinsics.checkParameterIsNotNull(view, "v");
            SchoolParent a = this.f92489b.mo130592a();
            if (a == null || (eduDepartmentLevel = a.getEduDepartmentLevel()) == null) {
                i = 0;
            } else {
                i = eduDepartmentLevel.getValue();
            }
            ContactHitPoint.m140784a(i);
            this.f92488a.mo131660a(view, mo131665a(), this.f92490c.element);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35769c(SchoolParentContactController dVar, SchoolNodeWithUpperNodesPath cVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, String str, String str2) {
            super(str, str2);
            this.f92488a = dVar;
            this.f92489b = cVar;
            this.f92490c = objectRef;
            this.f92491d = objectRef2;
        }
    }

    public SchoolParentContactController(Context context, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(viewGroup, "mContainer");
        this.f92483i = context;
        this.f92484j = viewGroup;
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        this.f92479e = a.mo130163h();
        this.f92481g = 10;
        this.f92482h = new C35770d(this);
        m140006d();
    }

    /* renamed from: a */
    public final void mo131661a(TextView textView, int i) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        textView.setText(UIHelper.getString(R.string.Lark_Education_SchoolParentContacts));
    }

    /* renamed from: a */
    private final void m140005a(SchoolNodeWithUpperNodesPath cVar, LayoutInflater layoutInflater) {
        T t;
        String str;
        ViewGroup schoolParentContactContainer;
        if (this.f92478d != null) {
            String str2 = null;
            int i = 0;
            View inflate = layoutInflater.inflate(R.layout.sub_edu_contact_depitem, (ViewGroup) null, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…act_depitem, null, false)");
            DesktopUtil.m144299a((TextView) inflate.findViewById(R.id.department_info));
            SchoolContactView schoolContactView = this.f92478d;
            if (!(schoolContactView == null || (schoolParentContactContainer = schoolContactView.getSchoolParentContactContainer()) == null)) {
                schoolParentContactContainer.addView(inflate);
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            SchoolParent a = cVar.mo130592a();
            objectRef.element = a != null ? (T) a.getId() : null;
            SchoolParent a2 = cVar.mo130592a();
            if (a2 != null && a2.isVirtualNode()) {
                SchoolParent a3 = cVar.mo130592a();
                objectRef.element = a3 != null ? (T) a3.getParentId() : null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            List<SchoolNodeLite> b = cVar.mo130595b();
            if (b != null) {
                for (T t2 : b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) objectRef2.element);
                    sb.append(t2.mo130586a());
                    List<SchoolNodeLite> b2 = cVar.mo130595b();
                    if (b2 == null || i2 != b2.size()) {
                        str = "-";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    objectRef2.element = (T) sb.toString();
                    i = i2;
                }
            }
            T t3 = objectRef.element;
            if (t3 != null) {
                t = t3;
            } else {
                t = "";
            }
            inflate.setOnClickListener(new C35769c(this, cVar, objectRef2, objectRef, t, objectRef2.element));
            TextView textView = (TextView) inflate.findViewById(R.id.department_info);
            if (textView != null) {
                SchoolParent a4 = cVar.mo130592a();
                if (a4 != null) {
                    str2 = a4.getName();
                }
                textView.setText(str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo131662a(List<SchoolNodeWithUpperNodesPath> list, int i) {
        ViewGroup headerViewGroup;
        TextView textView;
        SchoolContactView schoolContactView = this.f92478d;
        if (schoolContactView != null) {
            schoolContactView.mo131650a();
        }
        LayoutInflater from = LayoutInflater.from(this.f92483i);
        int i2 = 0;
        for (SchoolNodeWithUpperNodesPath cVar : list) {
            if (i2 < this.f92481g) {
                Intrinsics.checkExpressionValueIsNotNull(from, "inflater");
                m140005a(cVar, from);
            }
            i2++;
        }
        SchoolContactView schoolContactView2 = this.f92478d;
        if (schoolContactView2 != null) {
            if (!(schoolContactView2 == null || (headerViewGroup = schoolContactView2.getHeaderViewGroup()) == null || (textView = (TextView) headerViewGroup.findViewById(R.id.tv_school_header)) == null)) {
                mo131661a(textView, i);
            }
            this.f92480f = list.size();
        }
        ISchoolParentContactListener.IViewReady aVar = this.f92476b;
        if (aVar != null) {
            aVar.mo131544a();
        }
    }

    /* renamed from: a */
    public final void mo131660a(View view, String str, String str2) {
        ISchoolParentContactListener onItemClickListener;
        SchoolContactView schoolContactView = this.f92478d;
        if (schoolContactView != null && (onItemClickListener = schoolContactView.getOnItemClickListener()) != null) {
            onItemClickListener.mo131545a(view, str, str2);
        }
    }
}
