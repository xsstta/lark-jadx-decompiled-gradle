package com.ss.android.lark.forward.impl.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.forward.impl.p1899a.C38413b;
import com.ss.android.lark.forward.impl.statistics.favourite.ForwardHitPointNew;
import com.ss.android.lark.forward.impl.view.listener.OnItemSelectListener;
import com.ss.android.lark.search.widget.ChatPicker;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.ui.CommonTitleBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public abstract class BaseForwardView implements C38413b.AbstractC38414a {

    /* renamed from: a */
    Activity f98835a;

    /* renamed from: b */
    AbstractC38442a f98836b;

    /* renamed from: c */
    C38413b.AbstractC38414a.AbstractC38415a f98837c;

    /* renamed from: d */
    TextView f98838d;

    /* renamed from: e */
    int f98839e;

    /* renamed from: f */
    protected OnItemSelectListener f98840f = new OnItemSelectListener() {
        /* class com.ss.android.lark.forward.impl.view.BaseForwardView.C384401 */

        @Override // com.ss.android.lark.forward.impl.view.listener.OnItemSelectListener
        /* renamed from: c */
        public void mo141028c(SearchBaseInfo searchBaseInfo) {
            BaseForwardView.this.f98837c.mo140953a(searchBaseInfo);
        }

        @Override // com.ss.android.lark.forward.impl.view.listener.OnItemSelectListener
        /* renamed from: a */
        public void mo141026a(SearchBaseInfo searchBaseInfo) {
            BaseForwardView.this.f98837c.mo140954a(searchBaseInfo, true);
        }

        @Override // com.ss.android.lark.forward.impl.view.listener.OnItemSelectListener
        /* renamed from: b */
        public void mo141027b(SearchBaseInfo searchBaseInfo) {
            BaseForwardView.this.f98837c.mo140954a(searchBaseInfo, false);
        }
    };
    @BindView(6879)
    ChatPicker mChatPicker;
    @BindView(7702)
    CommonTitleBar mTitleBar;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DIS_MODE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SELECT_TYPE {
    }

    /* renamed from: com.ss.android.lark.forward.impl.view.BaseForwardView$a */
    public interface AbstractC38442a {
        /* renamed from: a */
        void mo140926a();

        /* renamed from: a */
        void mo140927a(int i, Intent intent);

        /* renamed from: a */
        void mo140928a(C38413b.AbstractC38414a aVar);

        /* renamed from: a */
        void mo140929a(String str, Bundle bundle);

        /* renamed from: b */
        void mo140930b();

        /* renamed from: c */
        FragmentManager mo140931c();
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: a */
    public abstract void mo140945a(List<SearchBaseInfo> list);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo141023e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo141024f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo141025g();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mChatPicker.mo183601l();
    }

    /* renamed from: h */
    private void m151606h() {
        mo141023e();
        mo141024f();
        mo141025g();
        ForwardHitPointNew.f98834a.mo141015a();
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: c */
    public void mo140949c() {
        LKUIToast.show(this.f98835a, (int) R.string.Lark_NewContacts_CantForwardDueToBlockOthers);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f98836b.mo140928a(this);
        m151606h();
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: d */
    public void mo140951d() {
        LKUIToast.show(this.f98835a, (int) R.string.Lark_NewContacts_CantForwardDueToBlock);
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: a */
    public void mo140941a() {
        boolean z = true;
        int i = (this.f98839e + 1) % 2;
        this.f98839e = i;
        ChatPicker chatPicker = this.mChatPicker;
        if (i != 1) {
            z = false;
        }
        chatPicker.mo183503g(z);
    }

    /* renamed from: a */
    public void setViewDelegate(C38413b.AbstractC38414a.AbstractC38415a aVar) {
        this.f98837c = aVar;
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: b */
    public void mo140948b(List<SearchBaseInfo> list) {
        mo140945a(list);
    }

    public BaseForwardView(Activity activity, AbstractC38442a aVar) {
        this.f98835a = activity;
        this.f98836b = aVar;
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: a */
    public void mo140944a(String str, boolean z) {
        LKUIToast.show(this.f98835a, str);
        if (z) {
            this.f98835a.finish();
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: a */
    public void mo140943a(String str, String str2, final boolean z) {
        new C25639g(this.f98835a).mo89246d(true).mo89247e(false).mo89227a(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.forward.impl.view.BaseForwardView.DialogInterface$OnDismissListenerC384412 */

            public void onDismiss(DialogInterface dialogInterface) {
                if (z) {
                    BaseForwardView.this.f98835a.finish();
                }
            }
        }).mo89237b(str).mo89242c(str2).mo89224a(R.id.lkui_dialog_btn_right, R.string.View_G_OkButton, (DialogInterface.OnClickListener) null).mo89239c();
    }
}
