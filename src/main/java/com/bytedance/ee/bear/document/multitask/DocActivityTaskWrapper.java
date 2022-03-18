package com.bytedance.ee.bear.document.multitask;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.multitask.task.AbstractC48369g;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.C48366c;
import com.ss.android.lark.multitask.task.DrawableIconFactory;
import com.ss.android.lark.multitask.task.EventTracker;
import com.ss.android.lark.multitask.task.GlobalTaskContainer;
import com.ss.android.lark.multitask.task.RemoteTaskContainer;
import com.ss.android.lark.multitask.task.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/document/multitask/DocActivityTaskWrapper;", "Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "intent", "Landroid/content/Intent;", "delegate", "Lcom/bytedance/ee/bear/document/multitask/DocActivityTaskWrapper$MultiTaskWrapperDelegate;", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/Intent;Lcom/bytedance/ee/bear/document/multitask/DocActivityTaskWrapper$MultiTaskWrapperDelegate;)V", "getActivity", "getContainer", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "getStarter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "getWrapped", "Lcom/ss/android/lark/multitask/task/Task;", "Companion", "MultiTaskWrapperDelegate", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.multitask.a */
public final class DocActivityTaskWrapper implements AbstractC48369g {

    /* renamed from: c */
    public static final Companion f16475c = new Companion(null);

    /* renamed from: a */
    public final AppCompatActivity f16476a;

    /* renamed from: b */
    public final MultiTaskWrapperDelegate f16477b;

    /* renamed from: d */
    private final Intent f16478d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/document/multitask/DocActivityTaskWrapper$MultiTaskWrapperDelegate;", "", "getDocViewModel", "Lcom/bytedance/ee/bear/document/DocViewModel;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.multitask.a$b */
    public interface MultiTaskWrapperDelegate {
        DocViewModel getDocViewModel();
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
    public /* synthetic */ EventTracker O_() {
        return AbstractC48369g.CC.$default$O_(this);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48369g
    public /* synthetic */ FragmentActivity p_() {
        return AbstractC48369g.CC.$default$p_(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/multitask/DocActivityTaskWrapper$Companion;", "", "()V", "MULTI_TASK_EXTRA_NAME", "", "MULTI_TASK_EXTRA_URL", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.multitask.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public AppCompatActivity mo23785d() {
        return this.f16476a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/bytedance/ee/bear/document/multitask/DocActivityTaskWrapper$getWrapped$1", "Lcom/ss/android/lark/multitask/task/ActivityTask;", "getDocName", "", "getDocUrl", "", "getDrawableIconFactory", "Lcom/ss/android/lark/multitask/task/DrawableIconFactory;", "getIconFactory", "Lcom/ss/android/lark/multitask/task/Task$IconFactory;", "getIdentifier", "getTitle", "getType", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.multitask.a$c */
    public static final class C5885c extends C48366c {

        /* renamed from: a */
        final /* synthetic */ DocActivityTaskWrapper f16479a;

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: a */
        public Task.IconFactory mo23788a() {
            return m23676g();
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: b */
        public CharSequence mo23790b() {
            return m23677h();
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: c */
        public String mo23791c() {
            boolean z;
            String documentType;
            DocViewModel docViewModel = this.f16479a.f16477b.getDocViewModel();
            StringBuilder sb = new StringBuilder();
            sb.append("docViewModel is null? ");
            if (docViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("DocActivityTaskWrapper", sb.toString());
            if (docViewModel != null && (documentType = docViewModel.getDocumentType()) != null) {
                return documentType;
            }
            C8275a aVar = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
            String a = aVar.mo32553a();
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.UNKNOWN.type");
            return a;
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: d */
        public String mo23792d() {
            boolean z;
            String token;
            DocViewModel docViewModel = this.f16479a.f16477b.getDocViewModel();
            StringBuilder sb = new StringBuilder();
            sb.append("docViewModel is null? ");
            if (docViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("DocActivityTaskWrapper", sb.toString());
            if (docViewModel == null || (token = docViewModel.getToken()) == null) {
                return "";
            }
            return token;
        }

        /* renamed from: i */
        private final String m23678i() {
            String str;
            boolean z;
            String a;
            DocViewModel docViewModel = this.f16479a.f16477b.getDocViewModel();
            String str2 = null;
            if (docViewModel != null) {
                str = docViewModel.getOriginUrl();
            } else {
                str = null;
            }
            if (Document.m33924M(C6313i.m25327a().mo25399g(str).f17447b)) {
                if (docViewModel != null) {
                    str2 = docViewModel.getUrl();
                }
                str = str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("docViewModel is null? ");
            if (docViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", ");
            sb.append("docUrl is empty? ");
            sb.append(C13598b.m55197d(str));
            C13479a.m54764b("DocActivityTaskWrapper", sb.toString());
            if (str == null || (a = C13681h.m55560a(str, "from", "tasklist")) == null) {
                return "";
            }
            return a;
        }

        /* renamed from: g */
        private final DrawableIconFactory m23676g() {
            boolean z;
            int i;
            Pair<Integer, String> pair;
            String str;
            LiveData<String> docName;
            DocViewModel docViewModel = this.f16479a.f16477b.getDocViewModel();
            StringBuilder sb = new StringBuilder();
            sb.append("docViewModel is null? ");
            boolean z2 = false;
            if (docViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("DocActivityTaskWrapper", sb.toString());
            if (docViewModel != null) {
                i = docViewModel.getDocumentTypeValue();
            } else {
                C8275a aVar = C8275a.f22369b;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
                i = aVar.mo32555b();
            }
            if (docViewModel != null && docViewModel.isType(C8275a.f22377j)) {
                z2 = true;
            }
            if (z2) {
                Resources resources = this.f16479a.f16476a.getResources();
                if (docViewModel == null || (docName = docViewModel.getDocName()) == null) {
                    str = null;
                } else {
                    str = docName.mo5927b();
                }
                pair = C7713a.m30844a(resources, i, str);
            } else {
                pair = C7713a.m30843a(this.f16479a.f16476a.getResources(), i);
            }
            Object obj = pair.first;
            Intrinsics.checkExpressionValueIsNotNull(obj, "res.first");
            return new DrawableIconFactory(((Number) obj).intValue(), (String) pair.second);
        }

        /* renamed from: h */
        private final CharSequence m23677h() {
            String str;
            int i;
            boolean z;
            LiveData<CharSequence> title;
            CharSequence b;
            LiveData<String> docName;
            DocViewModel docViewModel = this.f16479a.f16477b.getDocViewModel();
            if (docViewModel == null || (docName = docViewModel.getDocName()) == null || (str = docName.mo5927b()) == null) {
                if (docViewModel == null || (title = docViewModel.getTitle()) == null || (b = title.mo5927b()) == null) {
                    str = null;
                } else {
                    str = b.toString();
                }
            }
            if (str == null) {
                str = "";
            }
            if (docViewModel != null) {
                i = docViewModel.getDocumentTypeValue();
            } else {
                C8275a aVar = C8275a.f22369b;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
                i = aVar.mo32555b();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("docViewModel is null? ");
            boolean z2 = true;
            if (docViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", ");
            sb.append("name is empty? ");
            sb.append(C13598b.m55197d(str));
            C13479a.m54764b("DocActivityTaskWrapper", sb.toString());
            String str2 = str;
            if (str2.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                return str2;
            }
            String c = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31517c(this.f16479a.f16476a, i);
            Intrinsics.checkExpressionValueIsNotNull(c, "get(IList::class.java).g…faultName(activity, type)");
            return c;
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: a */
        public void mo23789a(Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(bundle, "outState");
            super.mo23789a(bundle);
            bundle.putString("multi_task_extra_url", m23678i());
            bundle.putString("multi_task_extra_name", m23677h().toString());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5885c(DocActivityTaskWrapper aVar, FragmentActivity fragmentActivity, Intent intent) {
            super(fragmentActivity, intent);
            this.f16479a = aVar;
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: a */
    public Task mo23782a() {
        return new C5885c(this, this.f16476a, this.f16478d);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: b */
    public AbstractC48378t mo23783b() {
        return new DocActivityStarter((Class<? extends AppCompatActivity>) this.f16476a.getClass());
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: e */
    public AbstractC48375n mo23786e() {
        if (C13595b.m55176a()) {
            return GlobalTaskContainer.f121801b.mo169221c();
        }
        Context applicationContext = this.f16476a.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "activity.applicationContext");
        return new RemoteTaskContainer(applicationContext);
    }

    public DocActivityTaskWrapper(AppCompatActivity appCompatActivity, Intent intent, MultiTaskWrapperDelegate bVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f16476a = appCompatActivity;
        this.f16478d = intent;
        this.f16477b = bVar;
    }
}
