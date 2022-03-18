package com.bytedance.ee.bear.wikiv2.extension;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u0003H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper;", "Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "intent", "Landroid/content/Intent;", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/Intent;)V", "multiTaskInfoCallback", "Lcom/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper$IMultiTaskInfoCallback;", "getMultiTaskInfoCallback", "()Lcom/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper$IMultiTaskInfoCallback;", "setMultiTaskInfoCallback", "(Lcom/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper$IMultiTaskInfoCallback;)V", "getActivity", "getBearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "getContainer", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "getStarter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "getUrlObjType", "", "getUrlToken", "", "getUrlType", "getWrapped", "Lcom/ss/android/lark/multitask/task/Task;", "Companion", "IMultiTaskInfoCallback", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.extension.a */
public final class ActivityMultiTaskWrapper implements AbstractC48369g {

    /* renamed from: b */
    public static final Companion f32924b = new Companion(null);

    /* renamed from: a */
    public final AppCompatActivity f32925a;

    /* renamed from: c */
    private IMultiTaskInfoCallback f32926c;

    /* renamed from: d */
    private final Intent f32927d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper$IMultiTaskInfoCallback;", "", "docName", "", "getDocName", "()Ljava/lang/String;", "objType", "", "getObjType", "()Ljava/lang/Integer;", "url", "getUrl", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.extension.a$b */
    public interface IMultiTaskInfoCallback {
        /* renamed from: a */
        String mo46696a();

        /* renamed from: b */
        String mo46697b();

        /* renamed from: c */
        Integer mo46698c();
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
    public /* synthetic */ EventTracker O_() {
        return AbstractC48369g.CC.$default$O_(this);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48369g
    public /* synthetic */ FragmentActivity p_() {
        return AbstractC48369g.CC.$default$p_(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.extension.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final IMultiTaskInfoCallback mo46803c() {
        return this.f32926c;
    }

    /* renamed from: f */
    public AppCompatActivity mo23785d() {
        return this.f32925a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper$getWrapped$1", "Lcom/ss/android/lark/multitask/task/ActivityTask;", "getIconFactory", "Lcom/ss/android/lark/multitask/task/Task$IconFactory;", "getIdentifier", "", "getTitle", "", "getType", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.extension.a$c */
    public static final class C12248c extends C48366c {

        /* renamed from: a */
        final /* synthetic */ ActivityMultiTaskWrapper f32928a;

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: d */
        public String mo23792d() {
            C13479a.m54764b("DocActivityTaskWrapper", "getIdentifier");
            return this.f32928a.mo46805g();
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: c */
        public String mo23791c() {
            C13479a.m54764b("DocActivityTaskWrapper", "getType. ");
            String a = C8275a.m34050a(this.f32928a.mo46806h());
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(getUrlType())");
            return a;
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: a */
        public Task.IconFactory mo23788a() {
            String str;
            Pair<Integer, String> pair;
            IMultiTaskInfoCallback c = this.f32928a.mo46803c();
            if (c != null) {
                str = c.mo46697b();
            } else {
                str = null;
            }
            int h = this.f32928a.mo46806h();
            C8275a aVar = C8275a.f22377j;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.WIKI");
            if (h == aVar.mo32555b()) {
                pair = C7713a.m30844a(this.f32928a.f32925a.getResources(), this.f32928a.mo46807i(), str);
            } else {
                C8275a aVar2 = C8275a.f22375h;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FILE");
                if (h == aVar2.mo32555b()) {
                    pair = C7713a.m30845a(this.f32928a.f32925a.getResources(), C13672c.m55481b(str));
                } else {
                    pair = C7713a.m30843a(this.f32928a.f32925a.getResources(), h);
                }
            }
            Object obj = pair.first;
            Intrinsics.checkExpressionValueIsNotNull(obj, "extraIcon.first");
            return new DrawableIconFactory(((Number) obj).intValue(), (String) pair.second);
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: b */
        public CharSequence mo23790b() {
            String str;
            boolean z;
            IMultiTaskInfoCallback c = this.f32928a.mo46803c();
            if (c != null) {
                str = c.mo46697b();
            } else {
                str = null;
            }
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31517c(this.f32928a.f32925a, this.f32928a.mo46807i());
            }
            C13479a.m54764b("DocActivityTaskWrapper", "getTitle, extra: " + C13598b.m55197d(str));
            Intrinsics.checkExpressionValueIsNotNull(str, "extraTitle");
            return str;
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: a */
        public void mo23789a(Bundle bundle) {
            String str;
            String a;
            Intrinsics.checkParameterIsNotNull(bundle, "outState");
            super.mo23789a(bundle);
            IMultiTaskInfoCallback c = this.f32928a.mo46803c();
            if (c == null || (a = c.mo46696a()) == null || (str = C13681h.m55560a(a, "from", "tasklist")) == null) {
                str = "";
            }
            C13479a.m54764b("DocActivityTaskWrapper", "onSaveInstanceState, extra: " + C13598b.m55197d(str));
            bundle.putString("url", str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12248c(ActivityMultiTaskWrapper aVar, FragmentActivity fragmentActivity, Intent intent) {
            super(fragmentActivity, intent);
            this.f32928a = aVar;
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: a */
    public Task mo23782a() {
        return new C12248c(this, this.f32925a, this.f32927d);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: b */
    public AbstractC48378t mo23783b() {
        return new ActivityStarter((Class<? extends AppCompatActivity>) this.f32925a.getClass());
    }

    /* renamed from: g */
    public final String mo46805g() {
        String str;
        BearUrl j = m50969j();
        if (j == null || (str = j.f17447b) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: j */
    private final BearUrl m50969j() {
        String a;
        IMultiTaskInfoCallback bVar = this.f32926c;
        if (bVar == null || (a = bVar.mo46696a()) == null) {
            return null;
        }
        return C6313i.m25327a().mo25399g(a);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: e */
    public AbstractC48375n mo23786e() {
        if (C13595b.m55176a()) {
            return GlobalTaskContainer.f121801b.mo169221c();
        }
        Context applicationContext = this.f32925a.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "activity.applicationContext");
        return new RemoteTaskContainer(applicationContext);
    }

    /* renamed from: h */
    public final int mo46806h() {
        String str;
        BearUrl j = m50969j();
        if (j == null || (str = j.f17446a) == null) {
            C8275a aVar = C8275a.f22369b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
            str = aVar.mo32553a();
        }
        return C8275a.m34051b(str);
    }

    /* renamed from: i */
    public final int mo46807i() {
        Integer c;
        IMultiTaskInfoCallback bVar = this.f32926c;
        if (bVar != null && (c = bVar.mo46698c()) != null) {
            return c.intValue();
        }
        C8275a aVar = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
        return aVar.mo32555b();
    }

    /* renamed from: a */
    public final void mo46802a(IMultiTaskInfoCallback bVar) {
        this.f32926c = bVar;
    }

    public ActivityMultiTaskWrapper(AppCompatActivity appCompatActivity, Intent intent) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        this.f32925a = appCompatActivity;
        this.f32927d = intent;
    }
}
