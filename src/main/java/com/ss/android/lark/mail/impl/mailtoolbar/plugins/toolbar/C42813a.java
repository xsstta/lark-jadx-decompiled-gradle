package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.toolbar.AbstractC6208d;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.fileselector.FileSelectFragment;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42795a;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.a */
public class C42813a extends AbstractC6208d<MailToolbar> {

    /* renamed from: g */
    private final String f108991g = "MailToolbarFragment";

    /* renamed from: h */
    private ViewGroup f108992h;

    /* renamed from: i */
    private MailToolbar f108993i;

    /* renamed from: j */
    private boolean f108994j;

    /* renamed from: k */
    private boolean f108995k;

    /* renamed from: b */
    public boolean mo153699b() {
        return this.f108995k;
    }

    /* renamed from: c */
    public MailToolbar mo153700c() {
        return this.f108993i;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.m165389i("MailToolbarFragment", "onDestroyView");
        super.onDestroyView();
        this.f108995k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public int mo22139a(ItemId itemId) {
        return MailItemId.mailToolbarIcon((MailItemId) itemId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C42815b mo22140a(FragmentActivity fragmentActivity) {
        return (C42815b) aj.m5366a(fragmentActivity).mo6005a(C42815b.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: b */
    public Class<? extends DialogInterface$OnCancelListenerC1021b> mo22141b(ItemId itemId) {
        if (itemId == MailItemId.signature) {
            C10548d.m43697a(getView());
            mo22140a(getActivity()).hideToolbar();
        }
        return MailItemId.getSubToolbarFragmentClass(itemId);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: c */
    public void mo153701c(boolean z) {
        Log.m165389i("MailToolbarFragment", "resetToolbarState enableAttribution: " + z);
        this.f108994j = z;
    }

    /* renamed from: d */
    public void mo153702d(boolean z) {
        Log.m165389i("MailToolbarFragment", "updateToolbarState enableAttribution: " + z);
        this.f108994j = z;
        MailToolbar mailToolbar = this.f108993i;
        if (mailToolbar != null) {
            Item[] children = mailToolbar.getChildren();
            for (int i = 0; i < children.length; i++) {
                Item item = children[i];
                if (item != null && item.id() == MailItemId.attribution) {
                    m170619a(item, i);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m170620b(int i) {
        View view;
        int i2;
        int i3;
        ViewGroup viewGroup = this.f108992h;
        if (viewGroup == null) {
            view = null;
        } else {
            view = viewGroup.getChildAt(i);
        }
        if (view != null) {
            int dimens = UIHelper.getDimens(R.dimen.mail_toolbar_item_group_horizontal_margin);
            int dimens2 = UIHelper.getDimens(R.dimen.mail_toolbar_item_group_children_padding) / 2;
            if (i == 0) {
                i2 = dimens;
            } else {
                i2 = dimens2;
            }
            if (i == this.f108992h.getChildCount() - 1) {
                i3 = dimens;
            } else {
                i3 = dimens2;
            }
            m170618a(view, -2, -1, i2, i3, 0, 0);
            int dimens3 = UIHelper.getDimens(R.dimen.mail_toolbar_item_icon_size);
            m170617a((AppCompatImageView) view.findViewById(R.id.toolbarItemImg), dimens3, dimens3, UIHelper.getDimens(R.dimen.mail_toolbar_item_icon_padding));
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: c */
    public void mo25104c(ItemId itemId) {
        if (itemId == MailItemId.insertImage) {
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            String name = itemId.name();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(name);
            Log.m165389i("MailToolbarFragment", "showSubToolbar tag=" + name + ", f=" + findFragmentByTag);
            if (!(findFragmentByTag instanceof DialogInterface$OnCancelListenerC1021b)) {
                C42795a.m170578a(requireActivity(), mo22140a(requireActivity()));
                return;
            }
            Dialog v_ = ((DialogInterface$OnCancelListenerC1021b) findFragmentByTag).v_();
            if (v_ != null && !v_.isShowing() && getActivity() != null && !getActivity().isFinishing() && !getActivity().isDestroyed()) {
                v_.show();
                return;
            }
            return;
        }
        super.mo25104c(itemId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25100a(MailToolbar mailToolbar) {
        Log.m165389i("MailToolbarFragment", "updateToolbarItems");
        super.mo25100a((Toolbar) mailToolbar);
        this.f108993i = mailToolbar;
        Item[] children = mailToolbar.getChildren();
        for (int i = 0; i < children.length; i++) {
            Item item = children[i];
            if (!(item == null || item.getId() == null)) {
                m170620b(i);
                if (item.id() == MailItemId.attribution && !this.f108994j) {
                    m170619a(item, i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public void mo25102a(boolean z) {
        super.mo25102a(z);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            for (Fragment fragment : supportFragmentManager.getFragments()) {
                if (fragment instanceof FileSelectFragment) {
                    Log.m165389i("MailToolbarFragment", "FileSelectorManager.dismiss");
                    FileSelectorManager.m31233a(supportFragmentManager, MailItemId.insertImage.name());
                }
            }
        }
    }

    /* renamed from: a */
    private void m170619a(Item item, int i) {
        C42815b b;
        View childAt = this.f108992h.getChildAt(i);
        if (childAt != null) {
            childAt.setEnabled(this.f108994j);
            ((AppCompatImageView) childAt.findViewById(R.id.toolbarItemImg)).setEnabled(this.f108994j);
            item.setEnable(this.f108994j);
        }
        if (!this.f108994j && getActivity() != null && (b = mo22140a(getActivity())) != null) {
            b.clearAttrSubToolbars();
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        Log.m165389i("MailToolbarFragment", "onViewCreated");
        super.onViewCreated(view, bundle);
        this.f108995k = false;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42813a.ViewTreeObserver$OnGlobalLayoutListenerC428141 */

            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (C42813a.this.getContext() != null) {
                    C42813a aVar = C42813a.this;
                    C42815b b = aVar.mo22140a((FragmentActivity) aVar.getContext());
                    if (b != null && DeviceUtils.getScreenHeight(C42813a.this.getContext()) - C43785p.m173530a(150) > iArr[1]) {
                        b.updateToolbarPos(iArr[1]);
                    }
                }
            }
        });
        this.f108992h = (ViewGroup) view.findViewById(R.id.topLevelItems);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m165389i("MailToolbarFragment", "onCreateView");
        return layoutInflater.inflate(R.layout.mail_toolbar_fragment, viewGroup, false);
    }

    /* renamed from: a */
    private void m170617a(View view, int i, int i2, int i3) {
        m170618a(view, i, i2, i3, i3, i3, i3);
    }

    /* renamed from: a */
    private void m170618a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        view.setPadding(i3, i5, i4, i6);
    }
}
