package com.bytedance.ee.bear.drive.biz.multitask;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
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
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityTaskWrapper;", "Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "intent", "Landroid/content/Intent;", "delegate", "Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityTaskWrapper$MultiTaskWrapperDelegate;", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/Intent;Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityTaskWrapper$MultiTaskWrapperDelegate;)V", "getActivity", "getContainer", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "getStarter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "getWrapped", "Lcom/ss/android/lark/multitask/task/Task;", "Companion", "MultiTaskWrapperDelegate", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.multitask.a */
public final class DriveActivityTaskWrapper implements AbstractC48369g {

    /* renamed from: c */
    public static final Companion f17932c = new Companion(null);

    /* renamed from: a */
    public final AppCompatActivity f17933a;

    /* renamed from: b */
    public final MultiTaskWrapperDelegate f17934b;

    /* renamed from: d */
    private final Intent f17935d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityTaskWrapper$MultiTaskWrapperDelegate;", "", "getDriveViewModel", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.multitask.a$b */
    public interface MultiTaskWrapperDelegate {
        C6937b getDriveViewModel();
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
    public /* synthetic */ EventTracker O_() {
        return AbstractC48369g.CC.$default$O_(this);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48369g
    public /* synthetic */ FragmentActivity p_() {
        return AbstractC48369g.CC.$default$p_(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/multitask/DriveActivityTaskWrapper$Companion;", "", "()V", "MULTI_TASK_EXTRA_OPEN_ENTITIES", "", "TAG", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.multitask.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public AppCompatActivity mo23785d() {
        return this.f17933a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"com/bytedance/ee/bear/drive/biz/multitask/DriveActivityTaskWrapper$getWrapped$1", "Lcom/ss/android/lark/multitask/task/ActivityTask;", "getDrawableIconFactory", "Lcom/ss/android/lark/multitask/task/DrawableIconFactory;", "getDriveName", "", "getDriveUrl", "", "getFileListString", "openEntities", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BaseOpenEntity;", "getIconFactory", "Lcom/ss/android/lark/multitask/task/Task$IconFactory;", "getIdentifier", "getTitle", "getType", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.multitask.a$c */
    public static final class C6505c extends C48366c {

        /* renamed from: a */
        final /* synthetic */ DriveActivityTaskWrapper f17936a;

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: a */
        public Task.IconFactory mo23788a() {
            return m26115g();
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: b */
        public CharSequence mo23790b() {
            return m26116h();
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: c */
        public String mo23791c() {
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            String a = aVar.mo32553a();
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.FILE.type");
            return a;
        }

        /* renamed from: g */
        private final DrawableIconFactory m26115g() {
            boolean z;
            String str;
            AbstractC6946a fileModel;
            AbstractC6947b a;
            C6937b driveViewModel = this.f17936a.f17934b.getDriveViewModel();
            StringBuilder sb = new StringBuilder();
            sb.append("driveVM is null? ");
            if (driveViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("DriveActivityTaskWrapper", sb.toString());
            if (driveViewModel == null || (fileModel = driveViewModel.getFileModel()) == null || (a = fileModel.mo27322a()) == null || (str = a.mo27364g()) == null) {
                str = "";
            }
            Pair<Integer, String> a2 = C7713a.m30845a(this.f17936a.f17933a.getResources(), str);
            Object obj = a2.first;
            Intrinsics.checkExpressionValueIsNotNull(obj, "res.first");
            return new DrawableIconFactory(((Number) obj).intValue(), (String) a2.second);
        }

        /* renamed from: h */
        private final CharSequence m26116h() {
            String str;
            boolean z;
            BaseOpenEntity openEntity;
            String fileName;
            AbstractC6946a fileModel;
            AbstractC6947b a;
            C6937b driveViewModel = this.f17936a.f17934b.getDriveViewModel();
            String str2 = "";
            if (driveViewModel == null || (fileModel = driveViewModel.getFileModel()) == null || (a = fileModel.mo27322a()) == null || (str = a.mo27358a()) == null) {
                str = str2;
            }
            if (TextUtils.isEmpty(str)) {
                if (!(driveViewModel == null || (openEntity = driveViewModel.getOpenEntity()) == null || (fileName = openEntity.getFileName()) == null)) {
                    str2 = fileName;
                }
                str = str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("driveState is null? ");
            if (driveViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", ");
            sb.append("name? ");
            sb.append(C13598b.m55197d(str));
            C13479a.m54764b("DriveActivityTaskWrapper", sb.toString());
            return str;
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: d */
        public String mo23792d() {
            String str;
            boolean z;
            BaseOpenEntity openEntity;
            C6937b driveViewModel = this.f17936a.f17934b.getDriveViewModel();
            if (driveViewModel == null || (openEntity = driveViewModel.getOpenEntity()) == null) {
                str = null;
            } else {
                str = openEntity.getFileId();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("driveState is null? ");
            if (driveViewModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", ");
            sb.append("token? ");
            sb.append(C13598b.m55197d(str));
            C13479a.m54764b("DriveActivityTaskWrapper", sb.toString());
            if (str != null) {
                return str;
            }
            return "";
        }

        /* renamed from: a */
        private final String m26114a(ArrayList<BaseOpenEntity> arrayList) {
            if (arrayList == null) {
                return null;
            }
            try {
                if (arrayList.isEmpty()) {
                    return null;
                }
                return JSON.toJSONString(arrayList);
            } catch (Throwable th) {
                C13479a.m54759a("DriveActivityTaskWrapper", "getFileListString error:", th);
                return null;
            }
        }

        @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
        /* renamed from: a */
        public void mo23789a(Bundle bundle) {
            ArrayList<BaseOpenEntity> arrayList;
            String str;
            Intrinsics.checkParameterIsNotNull(bundle, "outState");
            super.mo23789a(bundle);
            Intent intent = this.f17936a.f17933a.getIntent();
            if (intent != null) {
                arrayList = intent.getParcelableArrayListExtra("extra_drive_sdk_open_entity");
            } else {
                arrayList = null;
            }
            bundle.putString("multi_task_extra_open_entities", m26114a(arrayList));
            C6937b driveViewModel = this.f17936a.f17934b.getDriveViewModel();
            int i = 0;
            if (arrayList != null && driveViewModel != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (driveViewModel != null) {
                        str = driveViewModel.getFileId();
                    } else {
                        str = null;
                    }
                    BaseOpenEntity baseOpenEntity = arrayList.get(i2);
                    Intrinsics.checkExpressionValueIsNotNull(baseOpenEntity, "openEntities[i]");
                    if (TextUtils.equals(str, baseOpenEntity.getFileId())) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            bundle.putInt("extra_drive_sdk_open_index", i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6505c(DriveActivityTaskWrapper aVar, FragmentActivity fragmentActivity, Intent intent) {
            super(fragmentActivity, intent);
            this.f17936a = aVar;
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: a */
    public Task mo23782a() {
        return new C6505c(this, this.f17933a, this.f17935d);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: b */
    public AbstractC48378t mo23783b() {
        return new DriveActivityStarter((Class<? extends AppCompatActivity>) this.f17933a.getClass());
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48379u
    /* renamed from: e */
    public AbstractC48375n mo23786e() {
        if (C13595b.m55176a()) {
            return GlobalTaskContainer.f121801b.mo169221c();
        }
        Context applicationContext = this.f17933a.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "activity.applicationContext");
        return new RemoteTaskContainer(applicationContext);
    }

    public DriveActivityTaskWrapper(AppCompatActivity appCompatActivity, Intent intent, MultiTaskWrapperDelegate bVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f17933a = appCompatActivity;
        this.f17935d = intent;
        this.f17934b = bVar;
    }
}
