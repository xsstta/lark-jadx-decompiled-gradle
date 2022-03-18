package com.ss.android.lark.forward.dto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardHitPoint;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardTargetSource;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.dto.template.IForwardProxyExecutor;
import com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback;
import com.ss.android.lark.forward.impl.RemoteForwardExecutor;
import com.ss.android.lark.log.Log;
import java.util.List;

public class ForwardTemplate implements Parcelable {
    public static final Parcelable.Creator<ForwardTemplate> CREATOR = new Parcelable.Creator<ForwardTemplate>() {
        /* class com.ss.android.lark.forward.dto.ForwardTemplate.C383873 */

        /* renamed from: a */
        public ForwardTemplate[] newArray(int i) {
            return new ForwardTemplate[i];
        }

        /* renamed from: a */
        public ForwardTemplate createFromParcel(Parcel parcel) {
            return new ForwardTemplate(parcel);
        }
    };

    /* renamed from: a */
    private ForwardFeature f98616a;

    /* renamed from: b */
    private ForwardTargetFilter f98617b;

    /* renamed from: c */
    private ForwardTargetSource f98618c;

    /* renamed from: d */
    private ForwardViewDependency f98619d;

    /* renamed from: e */
    private ForwardHitPoint f98620e;

    /* renamed from: f */
    private Bundle f98621f;

    /* renamed from: g */
    private ForwardLaunchParam f98622g;

    /* renamed from: h */
    private AbstractC38405a f98623h;

    /* renamed from: i */
    private final RemoteForwardExecutor f98624i;

    /* renamed from: j */
    private IForwardProxyExecutor f98625j;

    public int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public ForwardFeature mo140589c() {
        return this.f98616a;
    }

    /* renamed from: d */
    public ForwardTargetFilter mo140590d() {
        return this.f98617b;
    }

    /* renamed from: e */
    public ForwardTargetSource mo140592e() {
        return this.f98618c;
    }

    /* renamed from: f */
    public ForwardViewDependency mo140593f() {
        return this.f98619d;
    }

    /* renamed from: g */
    public ForwardHitPoint mo140594g() {
        return this.f98620e;
    }

    /* renamed from: h */
    public Bundle mo140595h() {
        return this.f98621f;
    }

    /* renamed from: i */
    public ForwardLaunchParam mo140596i() {
        return this.f98622g;
    }

    /* renamed from: b */
    public AbstractC38405a mo140588b() {
        AbstractC38405a aVar = this.f98623h;
        if (aVar != null) {
            return aVar;
        }
        if (this.f98625j != null) {
            this.f98623h = new AbstractC38405a() {
                /* class com.ss.android.lark.forward.dto.$$Lambda$ForwardTemplate$wZQbliyfwAy7_cKPsCTQ1FdBklA */

                @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
                public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                    ForwardTemplate.this.m151209b(list, bundle, aVar);
                }
            };
        } else if (this.f98624i != null) {
            this.f98623h = new AbstractC38405a() {
                /* class com.ss.android.lark.forward.dto.$$Lambda$ForwardTemplate$LlOP4cNaw1rhrxTLYO4KwC0WEc */

                @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
                public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                    ForwardTemplate.this.m151208a(list, bundle, aVar);
                }
            };
        }
        return this.f98623h;
    }

    /* renamed from: a */
    public boolean mo140587a() {
        if (this.f98616a == null || this.f98618c == null || ((this.f98624i == null && this.f98625j == null) || this.f98619d == null || this.f98617b == null || this.f98620e == null || this.f98622g == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.lark.forward.dto.ForwardTemplate$a */
    public static class C38388a {

        /* renamed from: a */
        private ForwardFeature f98628a;

        /* renamed from: b */
        private ForwardTargetFilter f98629b;

        /* renamed from: c */
        private ForwardTargetSource f98630c;

        /* renamed from: d */
        private ForwardViewDependency f98631d;

        /* renamed from: e */
        private ForwardHitPoint f98632e;

        /* renamed from: f */
        private ForwardLaunchParam f98633f;

        /* renamed from: g */
        private Bundle f98634g;

        /* renamed from: a */
        public C38388a mo140609a(Bundle bundle) {
            this.f98634g = bundle;
            return this;
        }

        /* renamed from: a */
        public C38388a mo140610a(ForwardFeature forwardFeature) {
            this.f98628a = forwardFeature;
            return this;
        }

        /* renamed from: a */
        public C38388a mo140611a(ForwardHitPoint forwardHitPoint) {
            this.f98632e = forwardHitPoint;
            return this;
        }

        /* renamed from: a */
        public C38388a mo140612a(ForwardLaunchParam forwardLaunchParam) {
            this.f98633f = forwardLaunchParam;
            return this;
        }

        /* renamed from: a */
        public C38388a mo140613a(ForwardTargetFilter forwardTargetFilter) {
            this.f98629b = forwardTargetFilter;
            return this;
        }

        /* renamed from: a */
        private void m151232a(ForwardTemplate forwardTemplate) {
            if (this.f98628a == null) {
                this.f98628a = ForwardFeature.C38394a.m151360a();
            }
            if (this.f98629b == null) {
                this.f98629b = ForwardTargetFilter.C38400a.m151418a();
            }
            if (this.f98630c == null) {
                this.f98630c = ForwardTargetSource.C38402a.m151436a();
            }
            if (this.f98631d == null) {
                this.f98631d = ForwardViewDependency.C38404a.m151460a();
            }
            if (this.f98632e == null) {
                this.f98632e = ForwardHitPoint.Builder.m151380b();
            }
            if (this.f98633f == null) {
                this.f98633f = ForwardLaunchParam.C38396a.m151394a();
            }
            forwardTemplate.mo140581a(this.f98628a);
            forwardTemplate.mo140584a(this.f98629b);
            forwardTemplate.mo140585a(this.f98630c);
            forwardTemplate.mo140586a(this.f98631d);
            forwardTemplate.mo140582a(this.f98632e);
            forwardTemplate.mo140580a(this.f98634g);
            forwardTemplate.mo140583a(this.f98633f);
        }

        /* renamed from: a */
        public C38388a mo140614a(ForwardTargetSource forwardTargetSource) {
            this.f98630c = forwardTargetSource;
            return this;
        }

        /* renamed from: a */
        public C38388a mo140615a(ForwardViewDependency forwardViewDependency) {
            this.f98631d = forwardViewDependency;
            return this;
        }

        /* renamed from: a */
        public ForwardTemplate mo140616a(IForwardProxyExecutor iForwardProxyExecutor) {
            ForwardTemplate forwardTemplate = new ForwardTemplate(iForwardProxyExecutor);
            m151232a(forwardTemplate);
            return forwardTemplate;
        }

        /* renamed from: a */
        public ForwardTemplate mo140617a(AbstractC38405a aVar) {
            ForwardTemplate forwardTemplate = new ForwardTemplate(aVar);
            m151232a(forwardTemplate);
            return forwardTemplate;
        }
    }

    /* renamed from: a */
    public void mo140580a(Bundle bundle) {
        this.f98621f = bundle;
    }

    private ForwardTemplate(IForwardProxyExecutor iForwardProxyExecutor) {
        this.f98625j = iForwardProxyExecutor;
    }

    /* renamed from: a */
    public void mo140579a(Activity activity) {
        IForwardProxyExecutor iForwardProxyExecutor = this.f98625j;
        if (iForwardProxyExecutor != null) {
            iForwardProxyExecutor.mo140900a(activity);
        }
    }

    private ForwardTemplate(final AbstractC38405a aVar) {
        this.f98623h = aVar;
        this.f98624i = new RemoteForwardExecutor.Stub() {
            /* class com.ss.android.lark.forward.dto.ForwardTemplate.BinderC383841 */

            @Override // com.ss.android.lark.forward.impl.RemoteForwardExecutor
            public void onForward(List<ForwardTarget> list, Bundle bundle, final RemoteForwardExecuteCallback remoteForwardExecuteCallback) throws RemoteException {
                AbstractC38405a aVar = aVar;
                if (aVar != null) {
                    aVar.onForward(list, bundle, new AbstractC38405a.AbstractC38406a() {
                        /* class com.ss.android.lark.forward.dto.ForwardTemplate.BinderC383841.C383851 */

                        @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
                        /* renamed from: a */
                        public void mo140599a(int i, Intent intent) {
                            try {
                                remoteForwardExecuteCallback.onSuccess(i, intent);
                            } catch (RemoteException e) {
                                Log.m165384e("ForwardTemplate", "onForward.onSuccess", e);
                            }
                        }

                        @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
                        /* renamed from: a */
                        public void mo140601a(String str, boolean z) {
                            try {
                                remoteForwardExecuteCallback.onFailedToast(str, z);
                            } catch (RemoteException e) {
                                Log.m165384e("ForwardTemplate", "onForward.onFailed", e);
                            }
                        }

                        @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
                        /* renamed from: a */
                        public void mo140600a(String str, String str2, boolean z) {
                            try {
                                remoteForwardExecuteCallback.onFailedDialog(str, str2, z);
                            } catch (RemoteException e) {
                                Log.m165384e("ForwardTemplate", "onForward.onFailed", e);
                            }
                        }
                    });
                }
            }
        };
    }

    /* renamed from: a */
    public void mo140581a(ForwardFeature forwardFeature) {
        this.f98616a = forwardFeature;
    }

    /* renamed from: a */
    public void mo140582a(ForwardHitPoint forwardHitPoint) {
        this.f98620e = forwardHitPoint;
    }

    protected ForwardTemplate(Parcel parcel) {
        this.f98616a = (ForwardFeature) parcel.readParcelable(ForwardTemplate.class.getClassLoader());
        this.f98617b = (ForwardTargetFilter) parcel.readParcelable(ForwardTemplate.class.getClassLoader());
        this.f98618c = (ForwardTargetSource) parcel.readParcelable(ForwardTemplate.class.getClassLoader());
        this.f98619d = (ForwardViewDependency) parcel.readParcelable(ForwardTemplate.class.getClassLoader());
        this.f98620e = (ForwardHitPoint) parcel.readParcelable(ForwardTemplate.class.getClassLoader());
        this.f98622g = (ForwardLaunchParam) parcel.readParcelable(ForwardTemplate.class.getClassLoader());
        if (parcel.readInt() == 1) {
            this.f98624i = RemoteForwardExecutor.Stub.asInterface(parcel.readStrongBinder());
        } else {
            this.f98624i = null;
        }
        this.f98625j = (IForwardProxyExecutor) parcel.readParcelable(ForwardTemplate.class.getClassLoader());
        this.f98621f = parcel.readBundle(ForwardTemplate.class.getClassLoader());
    }

    /* renamed from: a */
    public void mo140583a(ForwardLaunchParam forwardLaunchParam) {
        this.f98622g = forwardLaunchParam;
    }

    /* renamed from: a */
    public void mo140584a(ForwardTargetFilter forwardTargetFilter) {
        this.f98617b = forwardTargetFilter;
    }

    /* renamed from: a */
    public void mo140585a(ForwardTargetSource forwardTargetSource) {
        this.f98618c = forwardTargetSource;
    }

    /* renamed from: a */
    public void mo140586a(ForwardViewDependency forwardViewDependency) {
        this.f98619d = forwardViewDependency;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f98616a, i);
        parcel.writeParcelable(this.f98617b, i);
        parcel.writeParcelable(this.f98618c, i);
        parcel.writeParcelable(this.f98619d, i);
        parcel.writeParcelable(this.f98620e, i);
        parcel.writeParcelable(this.f98622g, i);
        if (this.f98624i != null) {
            parcel.writeInt(1);
            parcel.writeStrongBinder(this.f98624i.asBinder());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.f98625j, i);
        parcel.writeBundle(this.f98621f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m151209b(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
        this.f98625j.mo140901a(list, bundle, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m151208a(List list, Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        try {
            this.f98624i.onForward(list, bundle, new RemoteForwardExecuteCallback.Stub() {
                /* class com.ss.android.lark.forward.dto.ForwardTemplate.BinderC383862 */

                @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
                public void onFailedToast(String str, boolean z) throws RemoteException {
                    aVar.mo140601a(str, z);
                }

                @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
                public void onSuccess(int i, Intent intent) {
                    aVar.mo140599a(i, intent);
                }

                @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
                public void onFailedDialog(String str, String str2, boolean z) throws RemoteException {
                    aVar.mo140600a(str, str2, z);
                }
            });
        } catch (RemoteException e) {
            Log.m165384e("ForwardTemplate", "IForwardExecutor.onForward", e);
        }
    }
}
