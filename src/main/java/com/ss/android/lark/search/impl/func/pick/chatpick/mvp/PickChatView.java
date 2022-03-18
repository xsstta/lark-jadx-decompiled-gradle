package com.ss.android.lark.search.impl.func.pick.chatpick.mvp;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53634b;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatPicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.params.ChatPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class PickChatView implements AbstractC53655a.AbstractC53657b {

    /* renamed from: a */
    public Context f132420a;

    /* renamed from: b */
    public AbstractC53654a f132421b;

    /* renamed from: c */
    public AbstractC53655a.AbstractC53657b.AbstractC53658a f132422c;

    /* renamed from: d */
    public int f132423d = (DesktopUtil.m144307b() ? 1 : 0);

    /* renamed from: e */
    private TextView f132424e;

    /* renamed from: f */
    private int f132425f = 1;
    @BindView(6734)
    ChatPicker mChatPicker;
    @BindView(7825)
    CommonTitleBar mTitleBar;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InitialSelectStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SelectType {
    }

    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView$a */
    public interface AbstractC53654a {
        /* renamed from: a */
        void mo182966a();

        /* renamed from: a */
        void mo182967a(PickChatView pickChatView);

        /* renamed from: a */
        void mo182968a(List<BasePickViewData> list);
    }

    /* renamed from: b */
    private void m207672b() {
        m207673c();
        m207674d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f132421b.mo182967a(this);
        m207672b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f132422c = null;
        this.f132421b = null;
        this.mChatPicker.mo183601l();
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b
    /* renamed from: a */
    public void mo182970a() {
        if (!DesktopUtil.m144307b()) {
            boolean z = true;
            int i = (this.f132423d + 1) % 2;
            this.f132423d = i;
            ChatPicker chatPicker = this.mChatPicker;
            if (i != 1) {
                z = false;
            }
            chatPicker.mo183503g(z);
        }
    }

    /* renamed from: d */
    private void m207674d() {
        ((ChatPicker) ((ChatPicker) ((ChatPicker) ((ChatPicker) ((ChatPicker) this.mChatPicker.mo183563a(PickerUsePage.SEARCH)).mo183562a(PickerUseCategory.SEARCH)).mo183604p(false)).mo183561a(new BasePicker.OnPickerParamsLoader<ChatPickerParams>() {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.C536535 */

            /* renamed from: b */
            private final List<ChatFilterParam.ChatMode> f132436b = new ArrayList();

            /* renamed from: a */
            public ChatPickerParams onLoadPickerParams() {
                ChatPickerParams cVar = new ChatPickerParams();
                int a = PickChatView.this.f132422c.mo182984a();
                this.f132436b.clear();
                if (a == 0) {
                    this.f132436b.add(ChatFilterParam.ChatMode.UNLIMITED);
                } else if (a == 1) {
                    this.f132436b.add(ChatFilterParam.ChatMode.NORMAL);
                } else if (a == 2) {
                    this.f132436b.add(ChatFilterParam.ChatMode.THREAD);
                }
                cVar.mo183681b(false).mo183680a(true).mo183679a(this.f132436b).mo183682c(true).mo183684d(false).mo183686e(false);
                return cVar;
            }
        })).mo183559a(new BasePicker.IOnPickNotify() {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.C536524 */

            /* renamed from: a */
            final C53634b f132433a = new C53634b();

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: b */
            public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
                if (PickChatView.this.f132422c != null) {
                    PickChatView.this.f132422c.mo182988a(this.f132433a.mo182942a(searchBaseInfo), false);
                }
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
                if (PickChatView.this.f132422c != null) {
                    BasePickViewData a = this.f132433a.mo182942a(searchBaseInfo);
                    if (PickChatView.this.f132423d == 0) {
                        PickChatView.this.f132422c.mo182987a(a);
                    } else {
                        PickChatView.this.f132422c.mo182988a(a, true);
                    }
                }
            }
        })).mo183641a(new IRecommendPageDataPuller() {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.C536493 */

            /* renamed from: a */
            final C53634b f132428a = new C53634b();

            @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
            /* renamed from: a */
            public boolean mo141032a() {
                return false;
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
            public void mo141031a(final IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
                PickChatView.this.f132422c.mo182986a(new IGetDataCallback<List<BasePickViewData>>() {
                    /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.C536493.C536501 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(List<BasePickViewData> list) {
                        iGetDataCallback.onSuccess(C536493.this.f132428a.mo182945a(list));
                        UICallbackExecutor.post(new Runnable() {
                            /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.C536493.C536501.RunnableC536511 */

                            public void run() {
                                PickChatView.this.mo182975c(C536493.this.f132428a.mo182945a(PickChatView.this.f132422c.mo182989b()));
                            }
                        });
                    }
                });
            }
        }).mo183483a();
    }

    /* renamed from: c */
    private void m207673c() {
        this.mTitleBar.setTitle(UIUtils.getString(this.f132420a, R.string.Lark_Legacy_SelectTip));
        this.mTitleBar.setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setLeftImageDrawable(null);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.View$OnClickListenerC536471 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(PickChatView.this.f132420a);
                if (PickChatView.this.f132421b != null) {
                    PickChatView.this.f132421b.mo182966a();
                }
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this.f132420a, R.string.Lark_Legacy_Select)) {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.PickChatView.C536482 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                if (PickChatView.this.f132422c != null) {
                    PickChatView.this.f132422c.mo182985a(PickChatView.this.f132423d);
                }
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f132424e = rightText;
        rightText.setTextColor(UIUtils.getColor(this.f132420a, R.color.text_title));
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC53655a.AbstractC53657b.AbstractC53658a aVar) {
        this.f132422c = aVar;
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b
    /* renamed from: a */
    public void mo182973a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f132425f = i;
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b
    /* renamed from: a */
    public void mo182972a(List<BasePickViewData> list) {
        if (this.f132425f == 1) {
            m207675d(list);
        } else {
            m207676e(list);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b
    /* renamed from: b */
    public void mo182974b(List<BasePickViewData> list) {
        AbstractC53654a aVar = this.f132421b;
        if (aVar != null) {
            aVar.mo182968a(list);
        }
    }

    /* renamed from: c */
    public void mo182975c(List<SearchBaseInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.mChatPicker.mo183577d(list);
        }
    }

    /* renamed from: d */
    private void m207675d(List<BasePickViewData> list) {
        if (this.f132423d != 1) {
            this.f132424e.setEnabled(true);
            this.f132424e.setTextColor(UIUtils.getColor(this.f132420a, R.color.text_title));
            this.f132424e.setText(UIUtils.getString(this.f132420a, R.string.Lark_Legacy_Select));
        } else if (CollectionUtils.isEmpty(list)) {
            this.f132424e.setEnabled(false);
            this.f132424e.setText(UIUtils.getString(this.f132420a, R.string.Lark_Legacy_ConfirmDone));
            this.f132424e.setTextColor(UIUtils.getColor(this.f132420a, R.color.text_disable));
        } else {
            this.f132424e.setEnabled(true);
            this.f132424e.setTextColor(UIUtils.getColor(this.f132420a, R.color.primary_pri_500));
            this.f132424e.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectConfirm, "select_count", Integer.toString(list.size())));
        }
    }

    /* renamed from: e */
    private void m207676e(List<BasePickViewData> list) {
        if (this.f132423d != 1) {
            this.f132424e.setEnabled(true);
            this.f132424e.setTextColor(UIUtils.getColor(this.f132420a, R.color.text_title));
            this.f132424e.setText(UIUtils.getString(this.f132420a, R.string.Lark_Legacy_Select));
        } else if (CollectionUtils.isEmpty(list)) {
            this.f132424e.setEnabled(true);
            this.f132424e.setText(UIUtils.getString(this.f132420a, R.string.Lark_Legacy_ConfirmDone));
            this.f132424e.setTextColor(UIUtils.getColor(this.f132420a, R.color.primary_pri_500));
        } else {
            this.f132424e.setEnabled(true);
            this.f132424e.setTextColor(UIUtils.getColor(this.f132420a, R.color.primary_pri_500));
            this.f132424e.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectConfirm, "select_count", Integer.toString(list.size())));
        }
    }

    public PickChatView(Context context, AbstractC53654a aVar) {
        this.f132420a = context;
        this.f132421b = aVar;
    }
}
