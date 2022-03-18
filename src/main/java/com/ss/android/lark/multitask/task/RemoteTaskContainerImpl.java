package com.ss.android.lark.multitask.task;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.MultitaskRemoteService;
import com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010-\u001a\u00020,H\u0016J \u0010.\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u0017H\u0016J\u000e\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u00109\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u0017H\u0016J\u0006\u0010:\u001a\u00020\u001dJ\u001c\u0010;\u001a\u00020\u001d2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0<H\u0002J\u0018\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u001fH\u0016J\f\u0010@\u001a\u00020,*\u00020AH\u0002J\u0014\u0010B\u001a\u00020\u001d*\u00020\u00102\u0006\u0010C\u001a\u00020DH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006F"}, d2 = {"Lcom/ss/android/lark/multitask/task/RemoteTaskContainerImpl;", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "Landroid/os/Parcelable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "handle", "", "getHandle", "()J", "setHandle", "(J)V", "remoteInterface", "Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "getRemoteInterface", "()Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "setRemoteInterface", "(Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;)V", "snapshotsFromMainProcess", "", "", "getSnapshotsFromMainProcess", "()Ljava/util/List;", "setSnapshotsFromMainProcess", "(Ljava/util/List;)V", "clearTasks", "", "describeContents", "", "dispatchRestoreInstanceState", "taskSnapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "task", "Lcom/ss/android/lark/multitask/task/Task;", "dispatchSaveInstanceState", "outState", "Landroid/os/Bundle;", "getTaskSnapshotForTask", "callback", "Lcom/ss/android/lark/multitask/task/TaskSnapshotCallback;", "isDuplicatedTask", "", "isFull", "notifyTaskWillEnterBackground", "container", "starter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "notifyTaskWillEnterForeground", "taskIdentifier", "showTaskListAndDoActionIfTaskDeletedByUser", "action", "Lcom/ss/android/lark/multitask/task/RemoteFloatingWindowInterface;", "size", "startTask", "terminateTask", "watchMainTaskChanges", "withRemoteInterface", "Lkotlin/Function1;", "writeToParcel", "dest", "flags", "autoClearRefAfterProcessDied", "Landroid/os/IBinder;", "watch", "mainTaskChangeCallback", "Lcom/ss/android/lark/multitask/task/MainTaskChangeCallback;", "Companion", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RemoteTaskContainerImpl implements Parcelable, AbstractC48375n {
    public static final Parcelable.Creator<RemoteTaskContainerImpl> CREATOR = new C48353b();

    /* renamed from: a */
    public static final Companion f121781a = new Companion(null);

    /* renamed from: b */
    private long f121782b;

    /* renamed from: c */
    private Context f121783c;

    /* renamed from: d */
    private MultitaskRemoteServiceInterface f121784d;

    /* renamed from: e */
    private List<String> f121785e = CollectionsKt.emptyList();

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/multitask/task/RemoteTaskContainerImpl$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/multitask/task/RemoteTaskContainerImpl;", "TAG", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/multitask/task/RemoteTaskContainerImpl$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/multitask/task/RemoteTaskContainerImpl;", "createFromParcel", ShareHitPoint.f121868c, "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/multitask/task/RemoteTaskContainerImpl;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$b */
    public static final class C48353b implements Parcelable.Creator<RemoteTaskContainerImpl> {
        C48353b() {
        }

        /* renamed from: a */
        public RemoteTaskContainerImpl[] newArray(int i) {
            return new RemoteTaskContainerImpl[i];
        }

        /* renamed from: a */
        public RemoteTaskContainerImpl createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, ShareHitPoint.f121868c);
            return new RemoteTaskContainerImpl(parcel);
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169159a(Task task) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        return this.f121785e.contains(task.mo23792d());
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169157a() {
        return this.f121785e.size() >= 100;
    }

    /* renamed from: a */
    public final boolean mo169158a(IBinder iBinder) {
        try {
            iBinder.linkToDeath(new C48354c(this, iBinder), 0);
            return true;
        } catch (RemoteException e) {
            Log.m165384e("MULTITASK-RemoteTaskContainerImpl", "autoClearRefAfterProcessDied", e);
            return false;
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public int mo169160b() {
        return this.f121785e.size();
    }

    /* renamed from: c */
    public final void mo169162c() {
        m190730a(new C48360i(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/multitask/task/RemoteTaskContainerImpl$autoClearRefAfterProcessDied$1", "Landroid/os/IBinder$DeathRecipient;", "binderDied", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$c */
    public static final class C48354c implements IBinder.DeathRecipient {

        /* renamed from: a */
        final /* synthetic */ RemoteTaskContainerImpl f121786a;

        /* renamed from: b */
        final /* synthetic */ IBinder f121787b;

        public void binderDied() {
            this.f121786a.mo169148a((MultitaskRemoteServiceInterface) null);
            this.f121787b.unlinkToDeath(this, 0);
            this.f121786a.mo169162c();
        }

        C48354c(RemoteTaskContainerImpl remoteTaskContainerImpl, IBinder iBinder) {
            this.f121786a = remoteTaskContainerImpl;
            this.f121787b = iBinder;
        }
    }

    /* renamed from: a */
    public final void mo169148a(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
        this.f121784d = multitaskRemoteServiceInterface;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$d */
    static final class C48355d extends Lambda implements Function1<MultitaskRemoteServiceInterface, Unit> {
        final /* synthetic */ AbstractC48377r $callback;
        final /* synthetic */ String $identifier;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48355d(String str, AbstractC48377r rVar) {
            super(1);
            this.$identifier = str;
            this.$callback = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            invoke(multitaskRemoteServiceInterface);
            return Unit.INSTANCE;
        }

        public final void invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            Intrinsics.checkParameterIsNotNull(multitaskRemoteServiceInterface, "it");
            try {
                multitaskRemoteServiceInterface.getTaskSnapshotForTaskId(this.$identifier, new RemoteTaskContainerImpl$getTaskSnapshotForTask$1$1(this));
            } catch (RemoteException e) {
                Log.m165398w("MULTITASK-RemoteTaskContainerImpl", "failed to get task snapshot", e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$e */
    static final class C48356e extends Lambda implements Function1<MultitaskRemoteServiceInterface, Unit> {
        final /* synthetic */ AbstractC48375n $container;
        final /* synthetic */ AbstractC48378t $starter;
        final /* synthetic */ Task $task;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48356e(AbstractC48375n nVar, Task task, AbstractC48378t tVar) {
            super(1);
            this.$container = nVar;
            this.$task = task;
            this.$starter = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            invoke(multitaskRemoteServiceInterface);
            return Unit.INSTANCE;
        }

        public final void invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            Intrinsics.checkParameterIsNotNull(multitaskRemoteServiceInterface, "it");
            Bundle bundle = new Bundle();
            this.$container.mo169151a(this.$task, bundle);
            RemoteTaskSnapshot remoteTaskSnapshot = new RemoteTaskSnapshot();
            remoteTaskSnapshot.mo169235a(this.$task.mo169194e());
            remoteTaskSnapshot.mo169238a(this.$task.mo23792d());
            remoteTaskSnapshot.mo169240b(this.$task.mo23791c());
            remoteTaskSnapshot.mo169236a(bundle);
            remoteTaskSnapshot.mo169180a(this.$task.mo23790b());
            remoteTaskSnapshot.mo169179a(this.$starter);
            remoteTaskSnapshot.mo169178a(this.$container);
            remoteTaskSnapshot.mo169237a(this.$task.mo23788a());
            try {
                multitaskRemoteServiceInterface.notifyTaskWillEnterBackground(remoteTaskSnapshot);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$f */
    static final class C48357f extends Lambda implements Function1<MultitaskRemoteServiceInterface, Unit> {
        final /* synthetic */ String $taskIdentifier;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48357f(String str) {
            super(1);
            this.$taskIdentifier = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            invoke(multitaskRemoteServiceInterface);
            return Unit.INSTANCE;
        }

        public final void invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            Intrinsics.checkParameterIsNotNull(multitaskRemoteServiceInterface, "it");
            try {
                multitaskRemoteServiceInterface.notifyTaskWillEnterForeground(this.$taskIdentifier);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$g */
    public static final class C48358g extends Lambda implements Function1<MultitaskRemoteServiceInterface, Unit> {
        final /* synthetic */ RemoteFloatingWindowInterface $action;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48358g(RemoteFloatingWindowInterface remoteFloatingWindowInterface) {
            super(1);
            this.$action = remoteFloatingWindowInterface;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            invoke(multitaskRemoteServiceInterface);
            return Unit.INSTANCE;
        }

        public final void invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            Intrinsics.checkParameterIsNotNull(multitaskRemoteServiceInterface, "it");
            try {
                multitaskRemoteServiceInterface.showTaskListAndDoActionIfTaskDeletedByUser(this.$action);
            } catch (RemoteException unused) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$h */
    static final class C48359h extends Lambda implements Function1<MultitaskRemoteServiceInterface, Unit> {
        final /* synthetic */ String $taskIdentifier;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48359h(String str) {
            super(1);
            this.$taskIdentifier = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            invoke(multitaskRemoteServiceInterface);
            return Unit.INSTANCE;
        }

        public final void invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            Intrinsics.checkParameterIsNotNull(multitaskRemoteServiceInterface, "it");
            try {
                multitaskRemoteServiceInterface.terminateTask(this.$taskIdentifier);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/multitask/task/MultitaskRemoteServiceInterface;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$i */
    public static final class C48360i extends Lambda implements Function1<MultitaskRemoteServiceInterface, Unit> {
        final /* synthetic */ RemoteTaskContainerImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48360i(RemoteTaskContainerImpl remoteTaskContainerImpl) {
            super(1);
            this.this$0 = remoteTaskContainerImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            invoke(multitaskRemoteServiceInterface);
            return Unit.INSTANCE;
        }

        public final void invoke(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            Intrinsics.checkParameterIsNotNull(multitaskRemoteServiceInterface, "it");
            this.this$0.mo169149a(multitaskRemoteServiceInterface, new RemoteTaskContainerImpl$watchMainTaskChanges$1$1(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/multitask/task/RemoteTaskContainerImpl$withRemoteInterface$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.RemoteTaskContainerImpl$j */
    public static final class ServiceConnectionC48361j implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ RemoteTaskContainerImpl f121788a;

        /* renamed from: b */
        final /* synthetic */ Function1 f121789b;

        public void onServiceDisconnected(ComponentName componentName) {
            this.f121788a.mo169148a((MultitaskRemoteServiceInterface) null);
        }

        ServiceConnectionC48361j(RemoteTaskContainerImpl remoteTaskContainerImpl, Function1 function1) {
            this.f121788a = remoteTaskContainerImpl;
            this.f121789b = function1;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Intrinsics.checkParameterIsNotNull(componentName, "name");
            Intrinsics.checkParameterIsNotNull(iBinder, "service");
            if (this.f121788a.mo169158a(iBinder)) {
                MultitaskRemoteServiceInterface asInterface = MultitaskRemoteServiceInterface.Stub.asInterface(iBinder);
                this.f121788a.mo169148a(asInterface);
                Function1 function1 = this.f121789b;
                Intrinsics.checkExpressionValueIsNotNull(asInterface, "remoteInterface");
                function1.invoke(asInterface);
            }
        }
    }

    /* renamed from: a */
    public final void mo169150a(RemoteFloatingWindowInterface remoteFloatingWindowInterface) {
        Intrinsics.checkParameterIsNotNull(remoteFloatingWindowInterface, "action");
        m190730a(new C48358g(remoteFloatingWindowInterface));
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public void mo169161b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        m190730a(new C48357f(str));
    }

    public RemoteTaskContainerImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f121783c = context;
    }

    protected RemoteTaskContainerImpl(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "in");
        this.f121782b = parcel.readLong();
    }

    /* renamed from: a */
    private final void m190730a(Function1<? super MultitaskRemoteServiceInterface, Unit> function1) {
        MultitaskRemoteServiceInterface multitaskRemoteServiceInterface = this.f121784d;
        if (multitaskRemoteServiceInterface == null) {
            Context context = this.f121783c;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            Intent intent = new Intent(context, MultitaskRemoteService.class);
            intent.setAction(MultitaskRemoteService.class.getName());
            Context context2 = this.f121783c;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            context2.bindService(intent, new ServiceConnectionC48361j(this, function1), 1);
            return;
        }
        function1.invoke(multitaskRemoteServiceInterface);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169155a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        m190730a(new C48359h(str));
    }

    /* renamed from: a */
    public final void mo169156a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f121785e = list;
    }

    /* renamed from: a */
    public final void mo169149a(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface, MainTaskChangeCallback mainTaskChangeCallback) {
        try {
            multitaskRemoteServiceInterface.watchTaskListChange(mainTaskChangeCallback);
        } catch (RemoteException unused) {
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "dest");
        parcel.writeLong(this.f121782b);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169151a(Task task, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        task.mo23789a(bundle);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169153a(Task task, AbstractC48377r rVar) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        m190730a(new C48355d(task.mo23792d(), rVar));
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169154a(C48376q qVar, Task task) {
        Intrinsics.checkParameterIsNotNull(qVar, "taskSnapshot");
        Intrinsics.checkParameterIsNotNull(task, "task");
        task.mo169193b(qVar.mo169246g());
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169152a(Task task, AbstractC48375n nVar, AbstractC48378t tVar) throws RemoteException {
        Intrinsics.checkParameterIsNotNull(task, "task");
        Intrinsics.checkParameterIsNotNull(nVar, "container");
        Intrinsics.checkParameterIsNotNull(tVar, "starter");
        m190730a(new C48356e(nVar, task, tVar));
    }
}
