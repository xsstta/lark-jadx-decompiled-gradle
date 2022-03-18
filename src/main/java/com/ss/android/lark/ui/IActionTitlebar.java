package com.ss.android.lark.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

public interface IActionTitlebar {

    public interface Action {
        int getBackground();

        int getDrawableRes();

        Object getTag();

        String getText();

        void performAction(View view);

        Action setTag(Object obj);
    }

    View addAction(Action action);

    void removeAllActions();

    void setTitle(CharSequence charSequence);

    public static class BaseAction implements Action {
        private Object mTag;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action
        public int getBackground() {
            return 0;
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action
        public int getDrawableRes() {
            return 0;
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action
        public String getText() {
            return null;
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action
        public void performAction(View view) {
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action
        public Object getTag() {
            return this.mTag;
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action
        public Action setTag(Object obj) {
            this.mTag = obj;
            return this;
        }
    }

    public static class TextAction extends BaseAction {
        private int mColor = -1;
        private final String mText;
        private int mTextSize = CommonTitleBarConstants.DEFAULT_ACTION_TEXT_SIZE;

        public int getColor() {
            return this.mColor;
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public String getText() {
            return this.mText;
        }

        public int getTextSize() {
            return this.mTextSize;
        }

        public TextAction(String str) {
            this.mText = str;
        }

        public TextAction(String str, int i) {
            this.mText = str;
            this.mColor = i;
        }

        public TextAction(String str, int i, int i2) {
            this.mText = str;
            this.mColor = i;
            this.mTextSize = i2;
        }
    }

    /* renamed from: com.ss.android.lark.ui.IActionTitlebar$a */
    public static class C57573a extends BaseAction {

        /* renamed from: a */
        private int f141893a;

        /* renamed from: b */
        private Drawable f141894b;

        /* renamed from: c */
        private AbstractC57574a f141895c;

        /* renamed from: d */
        private int f141896d;

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.lark.ui.IActionTitlebar$a$a */
        public interface AbstractC57574a {
            /* renamed from: a */
            void mo195541a(int i);
        }

        /* renamed from: a */
        public int mo195537a() {
            return this.f141896d;
        }

        /* renamed from: b */
        public Drawable mo195540b() {
            return this.f141894b;
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public int getDrawableRes() {
            return this.f141893a;
        }

        public C57573a(int i) {
            this(i, 0);
        }

        /* renamed from: a */
        public void mo195539a(AbstractC57574a aVar) {
            this.f141895c = aVar;
        }

        /* renamed from: a */
        public void mo195538a(int i) {
            this.f141893a = i;
            this.f141894b = null;
            AbstractC57574a aVar = this.f141895c;
            if (aVar != null) {
                aVar.mo195541a(i);
            }
        }

        public C57573a(Drawable drawable) {
            this.f141894b = drawable;
        }

        public C57573a(int i, int i2) {
            this.f141893a = i;
            this.f141896d = i2;
        }
    }

    /* renamed from: com.ss.android.lark.ui.IActionTitlebar$b */
    public static class C57575b extends BaseAction {

        /* renamed from: a */
        private View f141897a;

        /* renamed from: a */
        public View mo195542a() {
            return this.f141897a;
        }

        public C57575b(View view) {
            this.f141897a = view;
        }
    }
}
