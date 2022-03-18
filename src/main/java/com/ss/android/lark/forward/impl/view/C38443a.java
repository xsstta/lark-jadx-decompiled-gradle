package com.ss.android.lark.forward.impl.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.IForwardCancelListener;
import com.ss.android.lark.forward.impl.model.C38437b;
import com.ss.android.lark.forward.impl.model.packer.ForwardTargetParser;
import com.ss.android.lark.forward.impl.p1899a.C38413b;
import com.ss.android.lark.forward.impl.p1901c.C38419b;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import com.ss.android.lark.forward.impl.statistics.favourite.ForwardHitPointNew;
import com.ss.android.lark.forward.impl.statistics.favourite.ForwardHitpointExtraParams;
import com.ss.android.lark.forward.impl.view.BaseForwardView;
import com.ss.android.lark.forward.impl.view.p1906b.AbstractC38454a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatPicker;
import com.ss.android.lark.search.widget.params.ChatPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.ss.android.lark.forward.impl.view.a */
public class C38443a extends BaseForwardView implements C38413b.AbstractC38416b {

    /* renamed from: g */
    public final ForwardTemplate f98845g;

    /* renamed from: h */
    public final int f98846h;

    /* renamed from: i */
    private final boolean f98847i;

    /* renamed from: j */
    private final ForwardEnhancedView f98848j;

    /* renamed from: k */
    private final boolean f98849k;

    /* renamed from: l */
    private final boolean f98850l;

    /* renamed from: m */
    private Bundle f98851m;

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38416b
    /* renamed from: e */
    public void mo140959e(List<SearchBaseInfo> list) {
    }

    @Override // com.ss.android.lark.forward.impl.view.BaseForwardView, com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: a */
    public void mo140945a(List<SearchBaseInfo> list) {
        if (this.f98839e != 1) {
            m151631a(UIUtils.getString(this.f98835a, R.string.Lark_Legacy_Select), R.color.text_title);
        } else if (!CollectionUtils.isEmpty(list)) {
            m151631a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerConfirmWithCount, "count", Integer.toString(list.size())), R.color.primary_pri_500);
        } else if (this.f98850l) {
            m151631a("", R.color.text_title);
        } else {
            m151631a(UIUtils.getString(this.f98835a, R.string.Lark_Legacy_SelectSingle), R.color.text_title);
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: a */
    public void mo140946a(List<SearchBaseInfo> list, String str) {
        Log.m165389i("TemplateForwardView", "on showForwardDialog");
        List<ForwardTarget> a = ForwardTargetParser.m151570a(list);
        if (!this.f98847i || !this.f98848j.mo140743a(a, this.f98851m)) {
            m151633a(a, list, str);
        } else {
            this.f98848j.mo140740a(this.f98835a, a, this.f98851m, new ForwardEnhancedView.AbstractC38392a(list) {
                /* class com.ss.android.lark.forward.impl.view.$$Lambda$a$r0kK45Bx4ZwsK8Xl6nVXAdjRWw */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView.AbstractC38392a
                public final void proceed() {
                    C38443a.this.m151639h(this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: a */
    public void mo140942a(C38437b bVar) {
        Log.m165389i("TemplateForwardView", "on finishForward");
        KeyboardUtils.hideKeyboard(this.f98835a);
        AppreciablePerformance.f98815c.mo140989a();
        if (bVar == null) {
            this.f98836b.mo140926a();
            return;
        }
        this.f98836b.mo140927a(bVar.mo140984a(), bVar.mo140987b());
        this.f98836b.mo140926a();
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: b */
    public void mo140947b() {
        this.f98837c.mo140952a(this.f98839e);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.forward.impl.view.BaseForwardView
    /* renamed from: f */
    public void mo141024f() {
        if (this.f98849k && this.f98850l) {
            this.f98837c.mo140952a(this.f98839e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ ChatPickerParams m151640i() {
        return new ChatPickerParams().mo183681b(true).mo183680a(true).mo183682c(false).mo183684d(true).mo183686e(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.forward.impl.view.BaseForwardView
    /* renamed from: e */
    public void mo141023e() {
        if (!this.f98845g.mo140593f().mo140871a()) {
            this.mTitleBar.setVisibility(8);
            return;
        }
        this.mTitleBar.setVisibility(0);
        m151638h();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.forward.impl.view.BaseForwardView
    /* renamed from: g */
    public void mo141025g() {
        ((ChatPicker) ((ChatPicker) ((ChatPicker) ((ChatPicker) ((ChatPicker) this.mChatPicker.mo183604p(this.f98850l)).mo183561a($$Lambda$a$mNkf7VKsge1lqqhqG0om_amfieo.INSTANCE)).mo183560a(new BasePicker.IViewDependency() {
            /* class com.ss.android.lark.forward.impl.view.C38443a.C384463 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: b */
            public Activity mo110056b() {
                return C38443a.this.f98835a;
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: c */
            public FragmentManager mo110057c() {
                return C38443a.this.f98836b.mo140931c();
            }
        })).mo183559a(new BasePicker.IOnPickNotify() {
            /* class com.ss.android.lark.forward.impl.view.C38443a.C384452 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: b */
            public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
                if (C38443a.this.f98839e == 1) {
                    C38443a.this.f98840f.mo141027b(searchBaseInfo);
                }
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
                if (C38443a.this.f98839e == 0) {
                    C38443a.this.f98840f.mo141028c(searchBaseInfo);
                } else {
                    C38443a.this.f98840f.mo141026a(searchBaseInfo);
                }
            }
        })).mo183565a(new SearchResultView.IOnBusinessConsumeItem() {
            /* class com.ss.android.lark.forward.impl.view.C38443a.C384441 */

            /* renamed from: c */
            private boolean m151652c(SearchBaseInfo searchBaseInfo) {
                if (!(searchBaseInfo instanceof SearchChatInfo) || !((SearchChatInfo) searchBaseInfo).isSecretChat()) {
                    return false;
                }
                return true;
            }

            /* renamed from: d */
            private boolean m151653d(SearchBaseInfo searchBaseInfo) {
                if (C38443a.this.f98839e != 1 || searchBaseInfo.isSelected() || !C38443a.this.f98837c.mo140957b(C38443a.this.f98846h)) {
                    return false;
                }
                return true;
            }

            /* renamed from: e */
            private boolean m151654e(SearchBaseInfo searchBaseInfo) {
                if (C38443a.this.f98845g.mo140589c().mo140761e() || !(searchBaseInfo instanceof SearchChatInfo) || !((SearchChatInfo) searchBaseInfo).isThread()) {
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            private boolean m151655f(SearchBaseInfo searchBaseInfo) {
                if (C38443a.this.f98845g.mo140589c().mo140763f() || !(searchBaseInfo instanceof SearchThreadInfo)) {
                    return false;
                }
                return true;
            }

            /* renamed from: g */
            private boolean m151656g(SearchBaseInfo searchBaseInfo) {
                if (m151652c(searchBaseInfo) || m151653d(searchBaseInfo) || m151654e(searchBaseInfo) || m151655f(searchBaseInfo)) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: a */
            public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
                boolean z;
                if (m151652c(searchBaseInfo) || m151654e(searchBaseInfo) || m151655f(searchBaseInfo)) {
                    z = false;
                } else {
                    z = true;
                }
                return new SearchResultView.CheckBoxBindStatus(m151656g(searchBaseInfo), false, z);
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: b */
            public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
                if (!m151656g(searchBaseInfo)) {
                    return false;
                }
                if (m151652c(searchBaseInfo)) {
                    LKUIToast.show(C38443a.this.f98835a, (int) R.string.Lark_Forward_CantForwardToSecretChat);
                    return true;
                } else if (m151654e(searchBaseInfo)) {
                    LKUIToast.show(C38443a.this.f98835a, (int) R.string.Lark_Chat_CantOneByOneForwardToTopicGroupToast);
                    return true;
                } else if (m151655f(searchBaseInfo)) {
                    LKUIToast.show(C38443a.this.f98835a, (int) R.string.Lark_Share_ShareToTopicsNotSupported);
                    return true;
                } else if (!m151653d(searchBaseInfo)) {
                    return true;
                } else {
                    LKUIToast.show(C38443a.this.f98835a, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectMax, "select_count", Integer.toString(C38443a.this.f98846h)));
                    return true;
                }
            }
        })).mo183579f("msg_forward");
        if (this.f98845g.mo140589c().mo140754b()) {
            View inflate = View.inflate(this.f98835a, R.layout.activity_forward_func_panel_item, null);
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.forward.impl.view.$$Lambda$a$QSuYuFrk2La77VTjXmat9NUc1q8 */

                public final void onClick(View view) {
                    C38443a.this.m151628a((C38443a) view);
                }
            });
            this.mChatPicker.mo183571b(inflate);
        }
    }

    /* renamed from: h */
    private void m151638h() {
        this.mTitleBar.setMainTitleColor(UIUtils.getColor(this.f98835a, R.color.text_title));
        String b = this.f98845g.mo140593f().mo140872b();
        if (TextUtils.isEmpty(b)) {
            b = UIUtils.getString(this.f98835a, R.string.Lark_Legacy_SelectTip);
        }
        this.mTitleBar.setTitle(b);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.forward.impl.view.C38443a.View$OnClickListenerC384474 */

            public void onClick(View view) {
                IForwardCancelListener iForwardCancelListener;
                ForwardFeature c = C38443a.this.f98845g.mo140589c();
                if (c == null) {
                    iForwardCancelListener = null;
                } else {
                    iForwardCancelListener = c.mo140767i();
                }
                if (iForwardCancelListener != null) {
                    iForwardCancelListener.mo140899a();
                }
                if (c == null || !c.mo140766h()) {
                    KeyboardUtils.hideKeyboard(C38443a.this.f98835a);
                    C38443a.this.f98836b.mo140926a();
                    return;
                }
                KeyboardUtils.hideKeyboard(C38443a.this.f98835a);
                C38443a.this.f98836b.mo140926a();
                C38443a.this.f98835a.moveTaskToBack(true);
            }
        });
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        if (this.f98849k) {
            this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this.f98835a, R.string.Lark_Legacy_Select)) {
                /* class com.ss.android.lark.forward.impl.view.C38443a.C384485 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    C38443a.this.f98837c.mo140952a(C38443a.this.f98839e);
                }
            });
            this.f98838d = this.mTitleBar.getRightText();
            this.f98838d.setPadding(0, 0, UIUtils.dp2px(this.f98835a, 15.0f), 0);
            if (DesktopUtil.m144307b()) {
                this.f98838d.setTextColor(ContextCompat.getColor(this.f98835a, R.color.primary_pri_500));
            }
        }
        mo140945a((List<SearchBaseInfo>) null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m151628a(View view) {
        this.f98836b.mo140930b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m151637g(List list) {
        this.f98837c.mo140955a(list);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m151639h(List list) {
        m151636b(list, (String) null);
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a
    /* renamed from: c */
    public void mo140950c(List<SearchBaseInfo> list) {
        mo140946a(list, "");
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38416b
    /* renamed from: d */
    public void mo140958d(final List<SearchBaseInfo> list) {
        this.mChatPicker.mo183641a(new IRecommendPageDataPuller() {
            /* class com.ss.android.lark.forward.impl.view.C38443a.C384496 */

            @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
            /* renamed from: a */
            public boolean mo141032a() {
                return true;
            }

            @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
            /* renamed from: b */
            public void mo141033b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
            }

            @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
            /* renamed from: b */
            public boolean mo141034b() {
                return false;
            }

            @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
            /* renamed from: a */
            public void mo141031a(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
                iGetDataCallback.onSuccess(list);
            }
        }).mo183483a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m151630a(IForwardCancelListener iForwardCancelListener) {
        if (iForwardCancelListener != null) {
            Bundle bundle = this.f98851m;
            if (bundle != null && bundle.getBoolean("sdkshare")) {
                this.f98836b.mo140926a();
            }
            iForwardCancelListener.mo140899a();
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38416b
    /* renamed from: f */
    public void mo140960f(List<ForwardTarget> list) {
        $$Lambda$a$XBV2SumvAXENHfzumS17GhkqLY r4 = new ForwardEnhancedView.AbstractC38392a(list) {
            /* class com.ss.android.lark.forward.impl.view.$$Lambda$a$XBV2SumvAXENHfzumS17GhkqLY */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView.AbstractC38392a
            public final void proceed() {
                C38443a.this.m151637g(this.f$1);
            }
        };
        if (!this.f98847i || !this.f98848j.mo140746d(list, this.f98851m)) {
            r4.proceed();
        } else {
            this.f98848j.mo140741a(this.f98835a, list, this.f98851m, r4, this.f98845g);
        }
    }

    /* renamed from: a */
    private void m151631a(String str, int i) {
        if (this.f98838d != null) {
            if (TextUtils.isEmpty(str)) {
                this.f98838d.setVisibility(8);
            } else {
                this.f98838d.setVisibility(0);
                this.f98838d.setText(str);
                this.f98838d.setTextColor(UIUtils.getColor(this.f98835a, i));
            }
        }
        if (this.f98836b != null) {
            Bundle bundle = new Bundle();
            bundle.putString("actionName", str);
            this.f98836b.mo140929a("updateTitleBar", bundle);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151636b(java.util.List<com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo> r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "TemplateForwardView"
            java.lang.String r1 = "on proceedForward"
            com.ss.android.lark.log.Log.m165389i(r0, r1)
            android.os.Bundle r0 = r5.f98851m
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = "key_message"
            java.io.Serializable r0 = r0.getSerializable(r2)
            boolean r2 = r0 instanceof com.ss.android.lark.chat.entity.message.Message
            if (r2 == 0) goto L_0x002a
            r1 = r0
            com.ss.android.lark.chat.entity.message.Message r1 = (com.ss.android.lark.chat.entity.message.Message) r1
            com.ss.android.lark.forward.a.a r0 = com.ss.android.lark.forward.C38364a.m151054a()
            com.ss.android.lark.forward.a.a$c r0 = r0.mo140442d()
            java.lang.String r2 = r1.getChatId()
            com.ss.android.lark.chat.entity.chat.Chat r0 = r0.mo140469a(r2)
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            com.ss.android.lark.forward.impl.statistics.AppreciablePerformance$a r2 = com.ss.android.lark.forward.impl.statistics.AppreciablePerformance.f98815c
            r3 = 0
            if (r1 == 0) goto L_0x0038
            boolean r4 = r1.isSecret()
            if (r4 == 0) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r1 == 0) goto L_0x0044
            com.ss.android.lark.chat.entity.message.Message$Type r1 = r1.getType()
            int r1 = r1.getNumber()
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x004f
            com.ss.android.lark.chat.entity.chat.Chat$Type r0 = r0.getType()
            int r3 = r0.getNumber()
        L_0x004f:
            r2.mo140994a(r4, r1, r3)
            com.ss.android.lark.forward.impl.a.b$a$a r0 = r5.f98837c
            r0.mo140956a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.forward.impl.view.C38443a.m151636b(java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m151635b(List<ForwardTarget> list, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById = view.findViewById(R.id.confirm_layout);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.custom_layout);
        boolean z4 = false;
        if (!this.f98847i || !this.f98848j.mo140745c(list, this.f98851m)) {
            GifImageView gifImageView = (GifImageView) findViewById.findViewById(R.id.confirm_thumbnail_iv);
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.confirm_subscript_iv);
            TextView textView = (TextView) findViewById.findViewById(R.id.confirm_msg_title);
            TextView textView2 = (TextView) findViewById.findViewById(R.id.confirm_msg_content);
            TextView textView3 = (TextView) findViewById.findViewById(R.id.confirm_msg_desc);
            if (!this.f98847i || !this.f98848j.mo140744b(list, this.f98851m)) {
                m151629a(this.f98845g.mo140593f().mo140883f(), gifImageView, imageView, textView, textView2, textView3);
            } else {
                this.f98848j.mo140742a(list, gifImageView, textView, textView2, textView3, this.f98851m);
            }
            if (gifImageView.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (textView.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (textView2.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (textView3.getVisibility() == 0) {
                z4 = true;
            }
            int dp2px = UIUtils.dp2px(this.f98835a, 10.0f);
            int dp2px2 = UIUtils.dp2px(this.f98835a, 5.0f);
            if (z && z2) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.leftMargin = dp2px;
                textView.setLayoutParams(layoutParams);
            }
            if (z3) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView2.getLayoutParams();
                if (z) {
                    layoutParams2.leftMargin = dp2px;
                }
                if (z2) {
                    layoutParams2.topMargin = dp2px2;
                    textView2.setTextColor(UIUtils.getColor(this.f98835a, R.color.text_placeholder));
                    textView2.setMaxLines(2);
                }
                if (z4) {
                    layoutParams2.bottomMargin = dp2px2;
                }
                textView2.setLayoutParams(layoutParams2);
            }
            if (z4 && z) {
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) textView3.getLayoutParams();
                layoutParams3.leftMargin = dp2px;
                textView3.setLayoutParams(layoutParams3);
            }
            if (!z && !z2 && !z3 && !z4) {
                findViewById.setVisibility(8);
                return;
            }
            return;
        }
        this.f98848j.mo140739a(this.f98835a, constraintLayout, list, this.f98851m);
        findViewById.setVisibility(8);
        constraintLayout.setVisibility(0);
    }

    public C38443a(Activity activity, BaseForwardView.AbstractC38442a aVar, ForwardTemplate forwardTemplate) {
        super(activity, aVar);
        boolean z;
        this.f98845g = forwardTemplate;
        ForwardEnhancedView g = forwardTemplate.mo140593f().mo140884g();
        this.f98848j = g;
        if (g != null) {
            z = true;
        } else {
            z = false;
        }
        this.f98847i = z;
        this.f98851m = forwardTemplate.mo140595h();
        this.f98849k = forwardTemplate.mo140589c().mo140756c();
        this.f98850l = forwardTemplate.mo140589c().mo140752a();
        this.f98846h = forwardTemplate.mo140589c().mo140757d();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m151634a(List list, boolean z, String str) {
        ForwardHitpointExtraParams.LeaveAMessage leaveAMessage;
        if (this.f98851m == null) {
            Bundle bundle = new Bundle();
            this.f98851m = bundle;
            this.f98845g.mo140580a(bundle);
        }
        this.f98851m.putString("key_param_addition_note", str);
        m151636b(list, str);
        if (z) {
            ForwardHitpointExtraParams.Click click = ForwardHitpointExtraParams.Click.Send;
            ForwardHitpointExtraParams.Scene scene = ForwardHitpointExtraParams.Scene.GROUP_CREATE_FROM_FORWARD;
            TARGET_NONE eVar = TARGET_NONE.f135700a;
            if (!TextUtils.isEmpty(str)) {
                leaveAMessage = ForwardHitpointExtraParams.LeaveAMessage.True;
            } else {
                leaveAMessage = ForwardHitpointExtraParams.LeaveAMessage.False;
            }
            ForwardHitPointNew.f98834a.mo141019b(click.plus(scene).plus(eVar).plus(leaveAMessage));
        }
    }

    /* renamed from: a */
    private void m151633a(List<ForwardTarget> list, List<SearchBaseInfo> list2, String str) {
        String str2;
        if (!list2.isEmpty()) {
            IForwardCancelListener iForwardCancelListener = null;
            if (!this.f98845g.mo140593f().mo140885h()) {
                m151636b(list2, (String) null);
                return;
            }
            boolean equals = str.equals(ForwardHitpointExtraParams.Scene.GROUP_CREATE_FROM_FORWARD.getValue());
            if (equals) {
                ForwardHitPointNew.f98834a.mo141016a(ForwardHitpointExtraParams.Scene.GROUP_CREATE_FROM_FORWARD);
            }
            ForwardHitPointNew.f98834a.mo141018b();
            String e = this.f98845g.mo140593f().mo140881e();
            String c = this.f98845g.mo140593f().mo140875c();
            String d = this.f98845g.mo140593f().mo140878d();
            if (TextUtils.isEmpty(c)) {
                c = C57582a.m223604a((Context) this.f98835a, (int) R.string.Lark_Legacy_Send);
            }
            if (TextUtils.isEmpty(d)) {
                str2 = UIUtils.getString(this.f98835a, R.string.Lark_Legacy_Cancel);
            } else {
                str2 = d;
            }
            boolean g = this.f98845g.mo140589c().mo140765g();
            int a = this.f98845g.mo140596i().mo140805a();
            if (this.f98845g.mo140589c() != null) {
                iForwardCancelListener = this.f98845g.mo140589c().mo140767i();
            }
            C38419b.m151533a(this.f98835a, e, g, a, list2, new C38419b.AbstractC38424b(list2, equals) {
                /* class com.ss.android.lark.forward.impl.view.$$Lambda$a$6nnD3CCciPeF4MVTYFvUVy8MU */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.forward.impl.p1901c.C38419b.AbstractC38424b
                public final void onConfirmForward(String str) {
                    C38443a.this.m151634a((C38443a) this.f$1, (List) this.f$2, (boolean) str);
                }
            }, new C38419b.AbstractC38423a(iForwardCancelListener) {
                /* class com.ss.android.lark.forward.impl.view.$$Lambda$a$WAPbXwXxj3_wMxeBAZuWt1OQFuU */
                public final /* synthetic */ IForwardCancelListener f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.forward.impl.p1901c.C38419b.AbstractC38423a
                public final void onCancelForward() {
                    C38443a.this.m151630a((C38443a) this.f$1);
                }
            }, new AbstractC38454a(list) {
                /* class com.ss.android.lark.forward.impl.view.$$Lambda$a$GhhJthFV4qcgEWOf014j_7_2XE */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.forward.impl.view.p1906b.AbstractC38454a
                public final void onSetupForwardContent(View view) {
                    C38443a.this.m151635b((C38443a) this.f$1, (List) view);
                }
            }, c, str2);
        }
    }

    /* renamed from: a */
    private void m151627a(Context context, ImageView imageView, boolean z, Image image, boolean z2) {
        int i;
        Object obj;
        if (z) {
            i = R.color.bg_filler;
        } else {
            i = R.drawable.common_failed_chat_picture;
        }
        if (image != null) {
            String key = image.getKey();
            if (TextUtils.isEmpty(key)) {
                List<String> urls = image.getUrls();
                if (!CollectionUtils.isEmpty(urls)) {
                    key = urls.get(0);
                    if (!URLUtil.isNetworkUrl(key) && new File(key).exists()) {
                        ImageLoader.with(context).placeholder(R.color.bg_filler).error(i).load(key).override(UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f)).into(imageView);
                        return;
                    }
                }
            }
            if (!TextUtils.isEmpty(key)) {
                if (z2) {
                    obj = new C38824b(key);
                } else {
                    obj = AvatarImage.Builder.obtain(key, image.getToken(), imageView.getWidth(), imageView.getHeight()).build();
                }
                ImageLoader.with(context).load(obj).asBitmap().placeholder(R.color.bg_filler).error(i).centerCrop().into(imageView);
                return;
            }
            ImageLoader.with(context).load(Integer.valueOf(i)).centerCrop().into(imageView);
            return;
        }
        imageView.setImageResource(R.color.bg_filler);
    }

    /* renamed from: a */
    private void m151629a(BasicDialogContent basicDialogContent, GifImageView gifImageView, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        if (basicDialogContent != null) {
            if (basicDialogContent.mo140714d() > 0) {
                gifImageView.setVisibility(0);
                gifImageView.setImageResource(basicDialogContent.mo140714d());
            } else if (basicDialogContent.mo140717e() != null) {
                gifImageView.setVisibility(0);
                m151627a(this.f98835a, gifImageView, basicDialogContent.mo140721i(), basicDialogContent.mo140717e(), false);
            } else if (basicDialogContent.mo140718f() != null) {
                gifImageView.setVisibility(0);
                m151627a(this.f98835a, gifImageView, basicDialogContent.mo140721i(), basicDialogContent.mo140718f(), true);
            } else if (basicDialogContent.mo140719g() != null) {
                gifImageView.setVisibility(0);
                C38364a.m151054a().mo140436a(this.f98835a, gifImageView, basicDialogContent.mo140719g());
            } else {
                gifImageView.setVisibility(8);
            }
            if (gifImageView.getVisibility() != 8 && basicDialogContent.mo140720h() > 0) {
                imageView.setVisibility(0);
                imageView.setImageResource(basicDialogContent.mo140720h());
            }
            if (!TextUtils.isEmpty(basicDialogContent.mo140702a())) {
                textView.setText(basicDialogContent.mo140702a());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if (!TextUtils.isEmpty(basicDialogContent.mo140708b())) {
                textView2.setText(basicDialogContent.mo140708b());
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            if (!TextUtils.isEmpty(basicDialogContent.mo140712c())) {
                textView3.setText(basicDialogContent.mo140712c());
                textView3.setVisibility(0);
                return;
            }
            textView3.setVisibility(8);
        }
    }
}
