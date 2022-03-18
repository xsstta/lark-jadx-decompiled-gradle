package com.ss.android.lark.member_manage.impl.atselector.list;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.C44972b;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.list.C44980a;
import com.ss.android.lark.utils.UIHelper;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.b */
public class C44988b implements C44972b.AbstractC44975b {

    /* renamed from: a */
    public final AutoCompleteTextView f113905a;

    /* renamed from: b */
    public C44980a f113906b;

    /* renamed from: c */
    public C44972b.AbstractC44975b.AbstractC44976a f113907c;

    /* renamed from: d */
    public C44997b f113908d;

    /* renamed from: e */
    public ListPopupWindow f113909e;

    /* renamed from: f */
    public int f113910f;

    /* renamed from: g */
    private final int f113911g;

    /* renamed from: h */
    private final PreferenceManager.OnActivityResultListener f113912h;

    /* renamed from: i */
    private TextWatcher f113913i;

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public int mo159136a() {
        return 0;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159140a(Map<String, BaseAtBean> map) {
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159141a(Map<String, BaseAtBean> map, boolean z) {
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: b */
    public void mo159144b(List<BaseAtBean> list) {
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: c */
    public void mo159145c(List<BaseAtBean> list) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        AutoCompleteTextView autoCompleteTextView = this.f113905a;
        if (autoCompleteTextView != null) {
            try {
                autoCompleteTextView.dismissDropDown();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private boolean m178429e() {
        try {
            return this.f113905a.isPopupShowing();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private void m178425c() {
        C449891 r0 = new TextWatcher() {
            /* class com.ss.android.lark.member_manage.impl.atselector.list.C44988b.C449891 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                int selectionStart;
                if (editable != null && (selectionStart = C44988b.this.f113905a.getSelectionStart()) == C44988b.this.f113905a.getSelectionEnd()) {
                    Layout layout = C44988b.this.f113905a.getLayout();
                    C44988b.this.f113910f = layout.getLineBaseline(layout.getLineForOffset(C44988b.this.f113905a.getSelectionStart())) - C44988b.this.f113905a.getHeight();
                    String obj = editable.toString();
                    if (obj.length() >= selectionStart) {
                        obj = obj.substring(0, selectionStart);
                    }
                    int lastIndexOf = obj.lastIndexOf(64);
                    if (lastIndexOf != -1) {
                        String substring = obj.substring(lastIndexOf + 1);
                        if (TextUtils.isEmpty(substring)) {
                            C44988b.this.f113907c.mo159101a();
                        } else if (C44988b.this.f113907c != null && !substring.contains("\n")) {
                            C44988b.this.f113907c.mo159104a(substring);
                        }
                    } else if (C44988b.this.f113908d.isShowing()) {
                        C44988b.this.f113908d.dismiss();
                    }
                }
            }
        };
        this.f113913i = r0;
        this.f113905a.addTextChangedListener(r0);
        this.f113908d = new C44997b(this.f113905a.getContext());
    }

    /* renamed from: d */
    private void m178427d() {
        int i = 0;
        while (true) {
            if (i >= this.f113906b.getCount()) {
                i = 0;
                break;
            } else if (this.f113906b.isEnabled(i)) {
                break;
            } else {
                i++;
            }
        }
        this.f113906b.mo159202a(i);
        m178426c(this.f113905a, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo159223b() {
        AutoCompleteTextView autoCompleteTextView = this.f113905a;
        if (autoCompleteTextView != null) {
            TextWatcher textWatcher = this.f113913i;
            if (textWatcher != null) {
                autoCompleteTextView.removeTextChangedListener(textWatcher);
                this.f113913i = null;
            }
            this.f113905a.setOnItemClickListener(null);
            this.f113905a.setAdapter(null);
            this.f113905a.setOnDismissListener(null);
        }
        C44980a aVar = this.f113906b;
        if (aVar != null) {
            aVar.mo159201a();
            this.f113906b.mo159204a((C44980a.AbstractC44986a) null);
            this.f113906b.mo159205a((C44980a.AbstractC44987b) null);
            this.f113906b = null;
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C44972b.AbstractC44975b.AbstractC44976a aVar) {
        this.f113907c = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: b */
    public void mo159142b(String str) {
        this.f113905a.dismissDropDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m178422a(BaseAtBean baseAtBean) {
        this.f113907c.mo159112f();
        this.f113907c.mo159107c(baseAtBean);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.b$b */
    public static class C44997b extends PopupWindow {
        C44997b(Context context) {
            super(context);
            setInputMethodMode(1);
            setSoftInputMode(16);
            setBackgroundDrawable(context.getDrawable(R.drawable.desktop_shadow_bg));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159137a(String str) {
        this.f113905a.dismissDropDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.b$a */
    public static class C44995a extends ListPopupWindow {

        /* renamed from: a */
        AbstractC44996a f113923a;

        /* renamed from: b */
        int f113924b;

        /* renamed from: c */
        boolean f113925c;

        /* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.b$a$a */
        public interface AbstractC44996a {
            /* renamed from: a */
            void mo159228a(int i);

            /* renamed from: a */
            boolean mo159229a();
        }

        public void setSelection(int i) {
            try {
                Field declaredField = ListPopupWindow.class.getDeclaredField("mDropDownList");
                declaredField.setAccessible(true);
                ListView listView = (ListView) declaredField.get(this);
                if (listView != null && isShowing()) {
                    listView.smoothScrollToPosition(i);
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
                super.setSelection(i);
            }
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            AbstractC44996a aVar = this.f113923a;
            if (aVar != null && (i == 20 || i == 19)) {
                this.f113925c = true;
                aVar.mo159228a(keyEvent.getKeyCode());
            }
            AbstractC44996a aVar2 = this.f113923a;
            if (aVar2 == null || i != 66 || this.f113925c || !aVar2.mo159229a()) {
                boolean onKeyDown = super.onKeyDown(i, keyEvent);
                if (((i == 20 || i == 19 || i == 66) && isShowing()) || onKeyDown) {
                    return true;
                }
                return false;
            }
            this.f113925c = true;
            return true;
        }

        public C44995a(Context context, AbstractC44996a aVar, int i) {
            super(context);
            this.f113923a = aVar;
            this.f113924b = i;
        }
    }

    /* renamed from: a */
    private void m178421a(int i) {
        int i2;
        AutoCompleteTextView autoCompleteTextView = this.f113905a;
        if (i > 8) {
            i2 = UIHelper.dp2px(300.0f);
        } else {
            i2 = -2;
        }
        m178423a(autoCompleteTextView, i2);
        m178424b(this.f113905a, i);
        if (!m178429e()) {
            this.f113905a.showDropDown();
        }
    }

    /* renamed from: d */
    private void m178428d(List<BaseAtBean> list) {
        if (this.f113906b == null) {
            C44980a aVar = new C44980a();
            this.f113906b = aVar;
            aVar.mo159204a(new C44980a.AbstractC44986a() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.$$Lambda$b$AxVOO9wrL0TWRb00Xyi6YnmUDzc */

                @Override // com.ss.android.lark.member_manage.impl.atselector.list.C44980a.AbstractC44986a
                public final void onItemClickListener(BaseAtBean baseAtBean) {
                    C44988b.lambda$AxVOO9wrL0TWRb00Xyi6YnmUDzc(C44988b.this, baseAtBean);
                }
            });
            this.f113906b.mo159205a(new C44980a.AbstractC44987b() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.C44988b.C449902 */

                @Override // com.ss.android.lark.member_manage.impl.atselector.list.C44980a.AbstractC44987b
                /* renamed from: a */
                public void mo159221a(int i) {
                    C44988b.this.f113905a.setListSelection(i);
                }
            });
            this.f113909e = m178420a(this.f113905a, this.f113908d, list.size());
            this.f113905a.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.C44988b.C449913 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    view.performClick();
                }
            });
            this.f113905a.setAdapter(this.f113906b);
        }
        this.f113906b.mo159206a(list);
        m178421a(this.f113906b.getCount());
        this.f113906b.notifyDataSetChanged();
        m178427d();
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159139a(List<BaseAtBean> list) {
        m178428d(list);
    }

    /* renamed from: c */
    private void m178426c(AutoCompleteTextView autoCompleteTextView, final int i) {
        try {
            Field declaredField = AutoCompleteTextView.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            Field declaredField2 = ListPopupWindow.class.getDeclaredField("mDropDownList");
            declaredField2.setAccessible(true);
            final ListView listView = (ListView) declaredField2.get((ListPopupWindow) declaredField.get(autoCompleteTextView));
            listView.clearFocus();
            listView.requestFocusFromTouch();
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.C44988b.RunnableC449946 */

                public void run() {
                    listView.setSelection(i);
                    listView.setItemChecked(i, true);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m178424b(AutoCompleteTextView autoCompleteTextView, int i) {
        int i2;
        try {
            Field declaredField = AutoCompleteTextView.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            ListPopupWindow listPopupWindow = (ListPopupWindow) declaredField.get(autoCompleteTextView);
            listPopupWindow.setDropDownGravity(0);
            Context context = autoCompleteTextView.getContext();
            if (i > 8) {
                i2 = UIUtils.dp2px(context, 300.0f);
            } else {
                i2 = i * UIUtils.dp2px(context, 40.0f);
            }
            int i3 = this.f113910f;
            if (Math.abs(i3) <= i2) {
                i3 = -(Math.abs(this.f113910f) + i2 + UIUtils.dp2px(context, 20.0f));
            }
            listPopupWindow.setVerticalOffset(i3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private boolean m178423a(AutoCompleteTextView autoCompleteTextView, int i) {
        try {
            Field declaredField = AutoCompleteTextView.class.getDeclaredField("mPopup");
            boolean z = true;
            declaredField.setAccessible(true);
            ListPopupWindow listPopupWindow = (ListPopupWindow) declaredField.get(autoCompleteTextView);
            if (listPopupWindow.getHeight() == i) {
                z = false;
            }
            listPopupWindow.setHeight(i);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: b */
    public void mo159143b(String str, List<ChatChatter> list) {
        this.f113905a.removeTextChangedListener(this.f113913i);
        this.f113913i = null;
        this.f113905a.setOnItemClickListener(null);
        this.f113905a.dismissDropDown();
        if (str != null) {
            int length = this.f113905a.getEditableText().length();
            this.f113905a.getEditableText().delete((length - str.length()) - 1, length);
        }
        if (this.f113912h != null) {
            Intent intent = new Intent();
            GroupMemberManageModule.m177902a().getChatDependency().mo143747a(intent, list);
            this.f113912h.onActivityResult(this.f113911g, -1, intent);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159138a(String str, List<BaseAtBean> list) {
        m178428d(list);
    }

    C44988b(int i, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
        this.f113911g = i;
        this.f113905a = autoCompleteTextView;
        if (m178429e()) {
            autoCompleteTextView.dismissDropDown();
        }
        this.f113912h = onActivityResultListener;
        autoCompleteTextView.setThreshold(1);
        m178425c();
    }

    /* renamed from: a */
    private ListPopupWindow m178420a(final AutoCompleteTextView autoCompleteTextView, PopupWindow popupWindow, int i) {
        Exception e;
        C44995a aVar = null;
        try {
            Field declaredField = AutoCompleteTextView.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            C44995a aVar2 = new C44995a(autoCompleteTextView.getContext(), new C44995a.AbstractC44996a() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.C44988b.C449924 */

                @Override // com.ss.android.lark.member_manage.impl.atselector.list.C44988b.C44995a.AbstractC44996a
                /* renamed from: a */
                public boolean mo159229a() {
                    if (!(!C44988b.this.f113909e.isShowing() || C44988b.this.f113906b == null || C44988b.this.f113909e == null)) {
                        int i = -1;
                        int i2 = 0;
                        while (true) {
                            if (i2 < C44988b.this.f113906b.getCount()) {
                                if ((C44988b.this.f113906b.getItem(i2) instanceof BaseAtBean) && ((BaseAtBean) C44988b.this.f113906b.getItem(i2)).isSelected()) {
                                    i = i2;
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                        if (i >= 0 && i < C44988b.this.f113906b.getCount()) {
                            BaseAtBean baseAtBean = (BaseAtBean) C44988b.this.f113906b.getItem(i);
                            C44988b.this.f113907c.mo159107c(baseAtBean);
                            baseAtBean.setSelected(false);
                            C44988b.this.f113909e.dismiss();
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.ss.android.lark.member_manage.impl.atselector.list.C44988b.C44995a.AbstractC44996a
                /* renamed from: a */
                public void mo159228a(int i) {
                    if (C44988b.this.f113906b != null) {
                        C44988b.this.f113906b.mo159209c();
                    }
                }
            }, i);
            try {
                aVar2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    /* class com.ss.android.lark.member_manage.impl.atselector.list.C44988b.C449935 */

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        autoCompleteTextView.performCompletion();
                    }
                });
                declaredField.set(autoCompleteTextView, aVar2);
                Field declaredField2 = ListPopupWindow.class.getDeclaredField("mPopup");
                declaredField2.setAccessible(true);
                declaredField2.set(aVar2, popupWindow);
                aVar2.setWidth(this.f113905a.getWidth());
                Drawable background = popupWindow.getBackground();
                if (background == null) {
                    return aVar2;
                }
                Rect rect = new Rect();
                background.getPadding(rect);
                aVar2.setHorizontalOffset(-rect.left);
                return aVar2;
            } catch (Exception e2) {
                e = e2;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return aVar;
        }
    }
}
