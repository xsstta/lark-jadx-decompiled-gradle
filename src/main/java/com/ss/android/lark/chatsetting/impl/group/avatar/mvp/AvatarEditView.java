package com.ss.android.lark.chatsetting.impl.group.avatar.mvp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d;
import com.ss.android.lark.chatsetting.impl.group.avatar.p1699a.C34565a;
import com.ss.android.lark.chatsetting.impl.group.avatar.view.C34602a;
import com.ss.android.lark.chatsetting.impl.group.avatar.view.C34603b;
import com.ss.android.lark.chatsetting.impl.group.avatar.view.CancelableRadioButton;
import com.ss.android.lark.chatsetting.impl.group.avatar.view.DefaultAvatarView;
import com.ss.android.lark.chatsetting.impl.group.avatar.view.LineBreakRadioGroup;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57811b;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class AvatarEditView implements AbstractC34597d.AbstractC34600b {

    /* renamed from: b */
    public static final String[] f89307b = {"B500", "P500", "T600", "G600", "L600", "Y600", "O600", "C500"};

    /* renamed from: a */
    private TextView f89308a;

    /* renamed from: c */
    public final Activity f89309c;

    /* renamed from: d */
    protected final AbstractC34588a f89310d;

    /* renamed from: e */
    protected AbstractC34597d.AbstractC34600b.AbstractC34601a f89311e;

    /* renamed from: f */
    public C34565a f89312f;

    /* renamed from: g */
    public C34602a f89313g;

    /* renamed from: h */
    public String f89314h;

    /* renamed from: i */
    public final Dialog f89315i;

    /* renamed from: j */
    protected int f89316j = -1;

    /* renamed from: k */
    protected int f89317k = -1;

    /* renamed from: l */
    public int f89318l = 2;

    /* renamed from: m */
    private boolean f89319m;
    @BindView(6831)
    ImageView mCameraBtn;
    @BindView(6567)
    GridView mColorList;
    @BindView(6603)
    TextView mCustomizedTextTv;
    @BindView(7551)
    protected DefaultAvatarView mDefaultAvatar;
    @BindView(6676)
    EditText mEditText;
    @BindView(7280)
    LineBreakRadioGroup mRecommendTitleGroup;
    @BindView(6828)
    LKUIRoundedImageView mRoundedAvatar;
    @BindView(7410)
    TextView mSelectColorTv;
    @BindView(7590)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView$a */
    public interface AbstractC34588a {
        /* renamed from: a */
        void mo127747a();

        /* renamed from: a */
        void mo127748a(Bundle bundle);

        /* renamed from: a */
        void mo127749a(ImageView imageView, String str);

        /* renamed from: a */
        void mo127750a(AvatarEditView avatarEditView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo127765a() {
        return "";
    }

    /* renamed from: a */
    public void mo127777a(AvatarMeta avatarMeta, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo127767b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo127779c() {
        return "";
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b
    /* renamed from: e */
    public void mo127800e() {
        this.f89310d.mo127747a();
    }

    /* renamed from: k */
    private void m134384k() {
        this.f89311e.mo127808g();
        this.mRecommendTitleGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.C345864 */

            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                AvatarEditView.this.mo127793a(i);
                ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.CUSTOM_TEXT_AVATAR;
                ChatSettingExtraParams.Status status = ChatSettingExtraParams.Status.UNCHOOSE_TO_CHOOSE;
                TARGET_NONE eVar = TARGET_NONE.f135700a;
                if (i == -1) {
                    AvatarEditView.this.mDefaultAvatar.mo127826a();
                    C34565a.C34567a aVar = new C34565a.C34567a();
                    aVar.mo127737a(AvatarEditView.this.f89311e.mo127806a(AvatarEditView.this.mDefaultAvatar.getColor()));
                    AvatarEditView.this.mo127795a(aVar.mo127739a());
                    ChatSettingExtraParams.Status status2 = ChatSettingExtraParams.Status.CHOOSE_TO_UNCHOOSE;
                    if (AvatarEditView.this.f89318l == 2) {
                        ChatSettingHitPointNew.m136634d(click.plus(status2).plus(eVar));
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(AvatarEditView.this.mEditText.getText())) {
                    AvatarEditView.this.mEditText.setText("");
                }
                String charSequence = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
                if (TextUtils.equals(charSequence, AvatarEditView.this.f89312f.mo127732c())) {
                    AvatarEditView avatarEditView = AvatarEditView.this;
                    avatarEditView.mo127795a(avatarEditView.f89312f);
                    return;
                }
                C34565a.C34567a aVar2 = new C34565a.C34567a();
                aVar2.mo127741c(charSequence);
                AvatarEditView.this.mo127795a(aVar2.mo127739a());
                if (AvatarEditView.this.f89318l == 2) {
                    ChatSettingHitPointNew.m136634d(click.plus(status).plus(eVar));
                }
            }
        });
    }

    /* renamed from: l */
    private void m134385l() {
        this.mCameraBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.View$OnClickListenerC345875 */

            public void onClick(View view) {
                ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.AVATAR_IMAGE;
                TARGET_NONE eVar = TARGET_NONE.f135700a;
                if (AvatarEditView.this.f89318l == 2) {
                    ChatSettingHitPointNew.m136634d(click.plus(eVar));
                }
                AvatarEditView.this.f89310d.mo127749a(AvatarEditView.this.mCameraBtn, AvatarEditView.this.mo127779c());
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b
    /* renamed from: d */
    public void mo127799d() {
        if (this.f89315i.isShowing()) {
            this.f89315i.hide();
        }
    }

    /* renamed from: g */
    private void m134380g() {
        m134381h();
        m134382i();
        m134383j();
        m134384k();
        m134385l();
        mo127767b();
    }

    /* renamed from: i */
    private void m134382i() {
        EditText editText = this.mEditText;
        editText.addTextChangedListener(new C34603b(8, editText) {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.C345842 */

            @Override // com.ss.android.lark.chatsetting.impl.group.avatar.view.C34603b
            public void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                AvatarEditView.this.f89317k = -1;
                String obj = editable.toString();
                if (TextUtils.isEmpty(editable)) {
                    AvatarEditView.this.mDefaultAvatar.mo127826a();
                    C34565a.C34567a aVar = new C34565a.C34567a();
                    aVar.mo127737a(AvatarEditView.this.f89311e.mo127806a(AvatarEditView.this.mDefaultAvatar.getColor()));
                    AvatarEditView.this.mo127795a(aVar.mo127739a());
                } else if (TextUtils.equals(obj, AvatarEditView.this.f89312f.mo127732c())) {
                    AvatarEditView avatarEditView = AvatarEditView.this;
                    avatarEditView.mo127795a(avatarEditView.f89312f);
                } else {
                    C34565a.C34567a aVar2 = new C34565a.C34567a();
                    aVar2.mo127741c(obj);
                    AvatarEditView.this.mo127795a(aVar2.mo127739a());
                }
            }
        });
        this.mEditText.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.$$Lambda$AvatarEditView$M5tTrVGQEmGOA3TiEzdUcAHJvYw */

            public final void onClick(View view) {
                AvatarEditView.this.m134375c((AvatarEditView) view);
            }
        });
    }

    /* renamed from: n */
    private void m134387n() {
        ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.CANCEL;
        ChatSettingExtraParams.Target target = ChatSettingExtraParams.Target.IM_EDIT_GROUP_INFO_VIEW;
        if (this.f89318l == 2) {
            ChatSettingHitPointNew.m136634d(click.plus(target));
        }
        this.f89310d.mo127747a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC34588a aVar = this.f89310d;
        if (aVar != null) {
            aVar.mo127750a(this);
        }
        m134380g();
        m134386m();
        if (this.f89318l == 2) {
            ChatSettingHitPointNew.m136631c();
        }
    }

    /* renamed from: j */
    private void m134383j() {
        this.f89313g = new C34602a(this.f89311e.mo127807f());
        this.mColorList.setSelector(new ColorDrawable(0));
        this.mColorList.setAdapter((ListAdapter) this.f89313g);
        this.mColorList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.C345853 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                String str;
                AvatarEditView.this.f89316j = i;
                int a = AvatarEditView.this.f89313g.mo127840a(i);
                C34565a.C34567a aVar = new C34565a.C34567a();
                aVar.mo127737a(a);
                AvatarEditView.this.mo127795a(aVar.mo127739a());
                ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.AVATAR_COLOR;
                TARGET_NONE eVar = TARGET_NONE.f135700a;
                HashMap hashMap = new HashMap();
                if (i < 0 || i >= AvatarEditView.f89307b.length) {
                    str = "";
                } else {
                    str = AvatarEditView.f89307b[i];
                }
                hashMap.put("color", str);
                if (AvatarEditView.this.f89318l == 2) {
                    ChatSettingHitPointNew.m136634d(C54952a.m213205a(hashMap, click.plus(eVar)));
                }
            }
        });
    }

    /* renamed from: h */
    private void m134381h() {
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.$$Lambda$AvatarEditView$hRRbPCpzP6D0TRDywdCaTXsjh9w */

            public final void onClick(View view) {
                AvatarEditView.this.m134377d((AvatarEditView) view);
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Save)) {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView.C345831 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                boolean z;
                AvatarEditView.this.f89315i.show();
                AvatarMeta f = AvatarEditView.this.mo127801f();
                if (AvatarEditView.this.mRoundedAvatar.getVisibility() != 0 || TextUtils.isEmpty(AvatarEditView.this.f89314h)) {
                    z = false;
                } else {
                    z = true;
                }
                AvatarEditView.this.mo127777a(f, z);
                if (AvatarEditView.this.mDefaultAvatar.getVisibility() == 0) {
                    AbstractC34597d.AbstractC34600b.AbstractC34601a aVar = AvatarEditView.this.f89311e;
                    Activity activity = AvatarEditView.this.f89309c;
                    AvatarEditView avatarEditView = AvatarEditView.this;
                    aVar.mo127752a(activity, avatarEditView.mo127792a(avatarEditView.mDefaultAvatar), f);
                } else if (z) {
                    AvatarEditView.this.f89311e.mo127753a(AvatarEditView.this.f89314h, f);
                }
                ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.SAVE;
                ChatSettingExtraParams.Target target = ChatSettingExtraParams.Target.IM_EDIT_GROUP_INFO_VIEW;
                if (AvatarEditView.this.f89318l == 2) {
                    ChatSettingHitPointNew.m136634d(click.plus(target));
                }
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f89308a = rightText;
        rightText.setEnabled(false);
        this.f89308a.setTextColor(C57582a.m223616d(this.f89309c, R.color.text_disable));
        this.f89308a.setVisibility(0);
    }

    /* renamed from: m */
    private void m134386m() {
        if (DesktopUtil.m144301a((Context) this.f89309c)) {
            m134370a(this.mCustomizedTextTv, this.mSelectColorTv);
            this.mEditText.setBackground(UIHelper.getDrawable(R.drawable.group_desktop_edit_title_word_bg));
            this.mEditText.setTextSize(14.0f);
            this.mEditText.getLayoutParams().height = UIHelper.dp2px(36.0f);
            this.mEditText.setHintTextColor(C57582a.m223616d(this.f89309c, R.color.text_placeholder));
            this.mEditText.setTextColor(C57582a.m223616d(this.f89309c, R.color.text_title));
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.$$Lambda$AvatarEditView$_iu9Tl7tlY5V2WzAQab_WPgI */

                public final void onClick(View view) {
                    AvatarEditView.this.m134372b((AvatarEditView) view);
                }
            });
            this.mTitleBar.setMainTitleTextStyle(1);
        }
    }

    /* renamed from: f */
    public AvatarMeta mo127801f() {
        AvatarMeta avatarMeta = new AvatarMeta();
        if (this.mDefaultAvatar.getVisibility() == 0) {
            String text = this.mDefaultAvatar.getText();
            avatarMeta.setColor(m134373c(this.mDefaultAvatar.getColor()));
            avatarMeta.setBorderColor(m134373c(this.mDefaultAvatar.getBorderColor()));
            avatarMeta.setBackgroundColor(m134373c(this.mDefaultAvatar.getBackgroundColor()));
            avatarMeta.setCenterColor(m134373c(this.mDefaultAvatar.getCenterColor()));
            if (text == null) {
                avatarMeta.setText("");
                avatarMeta.setType(AvatarMeta.Type.RANDOM);
            } else {
                avatarMeta.setText(text);
                avatarMeta.setType(AvatarMeta.Type.WORDS);
            }
        } else if (this.mRoundedAvatar.getVisibility() == 0) {
            avatarMeta.setType(AvatarMeta.Type.UPLOAD);
        }
        return avatarMeta;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m134372b(View view) {
        m134387n();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m134377d(View view) {
        m134387n();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC34597d.AbstractC34600b.AbstractC34601a aVar) {
        this.f89311e = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b
    /* renamed from: b */
    public void mo127798b(String str) {
        LKUIToast.show(this.f89309c, str);
    }

    /* renamed from: b */
    private void m134371b(int i) {
        int[] f = this.f89311e.mo127807f();
        int i2 = 0;
        while (i2 < f.length && f[i2] != m134379e(i)) {
            i2++;
        }
        this.f89313g.mo127840a(i2);
        this.f89316j = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m134375c(View view) {
        ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.AVATAR_TEXT;
        TARGET_NONE eVar = TARGET_NONE.f135700a;
        if (this.f89318l == 2) {
            ChatSettingHitPointNew.m136634d(click.plus(eVar));
        }
    }

    /* renamed from: d */
    private String m134376d(int i) {
        String hexString = Integer.toHexString(i);
        if (hexString.length() != 1) {
            return hexString;
        }
        return "0" + hexString;
    }

    /* renamed from: a */
    public Bitmap mo127792a(View view) {
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createBitmap;
    }

    /* renamed from: a */
    private void m134370a(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setTextColor(C57582a.m223616d(this.f89309c, R.color.text_title));
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextSize(16.0f);
        }
    }

    /* renamed from: c */
    private int m134373c(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m134376d(Color.red(i)));
        stringBuffer.append(m134376d(Color.green(i)));
        stringBuffer.append(m134376d(Color.blue(i)));
        return Integer.valueOf(stringBuffer.toString(), 16).intValue();
    }

    /* renamed from: c */
    private CancelableRadioButton m134374c(String str) {
        float f;
        float f2;
        CancelableRadioButton cancelableRadioButton = new CancelableRadioButton(this.f89309c);
        cancelableRadioButton.setButtonDrawable(17170445);
        cancelableRadioButton.setBackgroundResource(R.drawable.group_recommend_tv_bg_selector);
        cancelableRadioButton.setText(str);
        cancelableRadioButton.setTextSize(16.0f);
        cancelableRadioButton.setTextColor(this.f89309c.getResources().getColorStateList(R.color.recommend_title_bg));
        if (DesktopUtil.m144301a((Context) this.f89309c)) {
            f = 20.0f;
        } else {
            f = 18.5f;
        }
        float f3 = 4.0f;
        if (DesktopUtil.m144301a((Context) this.f89309c)) {
            f2 = 4.0f;
        } else {
            f2 = 5.0f;
        }
        if (!DesktopUtil.m144301a((Context) this.f89309c)) {
            f3 = 4.5f;
        }
        cancelableRadioButton.setPadding(UIHelper.dp2px(f), UIHelper.dp2px(f2), UIHelper.dp2px(f), UIHelper.dp2px(f3));
        return cancelableRadioButton;
    }

    /* renamed from: d */
    private void m134378d(String str) {
        int childCount = this.mRecommendTitleGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mRecommendTitleGroup.getChildAt(i);
            if ((childAt instanceof CancelableRadioButton) && TextUtils.equals(str, ((CancelableRadioButton) childAt).getText())) {
                this.mRecommendTitleGroup.check(childAt.getId());
                this.f89317k = i;
                return;
            }
        }
        CancelableRadioButton c = m134374c(str);
        this.mRecommendTitleGroup.addView(c, 0);
        this.mRecommendTitleGroup.check(c.getId());
    }

    /* renamed from: e */
    private int m134379e(int i) {
        String hexString = Integer.toHexString(i);
        if (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        try {
            return this.f89311e.mo127806a(Color.parseColor("#" + hexString));
        } catch (Exception unused) {
            return this.f89311e.mo127807f()[0];
        }
    }

    /* renamed from: a */
    public void mo127793a(int i) {
        if (i == -1) {
            this.f89317k = -1;
            return;
        }
        int childCount = this.mRecommendTitleGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (this.mRecommendTitleGroup.getChildAt(i2).getId() == i) {
                this.f89317k = i2;
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo127795a(C34565a aVar) {
        if (this.f89312f.equals(aVar)) {
            this.f89308a.setEnabled(false);
            this.f89308a.setTextColor(C57582a.m223616d(this.f89309c, R.color.text_disable));
        } else {
            this.f89308a.setEnabled(true);
            this.f89308a.setTextColor(C57582a.m223616d(this.f89309c, R.color.primary_pri_500));
        }
        if (!TextUtils.isEmpty(aVar.mo127730a())) {
            this.mRoundedAvatar.setVisibility(0);
            this.mDefaultAvatar.setVisibility(4);
            ChatSettingModule.m133639a().mo127279i().mo127409a(this.f89309c, aVar.mo127730a(), aVar.mo127731b(), this.mRoundedAvatar, UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f));
        } else if (!TextUtils.isEmpty(aVar.mo127736f())) {
            this.mRoundedAvatar.setVisibility(0);
            this.mDefaultAvatar.setVisibility(4);
            ChatSettingModule.m133639a().mo127279i().mo127408a(this.f89309c, aVar.mo127736f(), this.mRoundedAvatar, UIHelper.getDimens(R.dimen.text_avatar_size), UIHelper.getDimens(R.dimen.text_avatar_size));
        } else {
            this.mRoundedAvatar.setVisibility(4);
            this.mDefaultAvatar.setVisibility(0);
            if (aVar.mo127734d() != -1) {
                this.f89319m = true;
                if (TextUtils.isEmpty(this.mDefaultAvatar.getText())) {
                    this.mDefaultAvatar.setIconWithColor(aVar.mo127734d());
                } else if (aVar.mo127735e()) {
                    this.mDefaultAvatar.setTextWithColor(aVar.mo127734d());
                }
            }
            if (!TextUtils.isEmpty(aVar.mo127732c())) {
                this.mDefaultAvatar.setText(aVar.mo127732c());
                if (!this.f89319m) {
                    int nextInt = new Random().nextInt(8);
                    this.f89313g.mo127840a(nextInt);
                    this.mDefaultAvatar.setTextWithColor(this.f89311e.mo127807f()[nextInt]);
                    this.f89319m = true;
                }
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b
    /* renamed from: a */
    public void mo127796a(String str) {
        this.f89314h = str;
        mo127795a(new C34565a.C34567a().mo127742d(str).mo127739a());
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b
    /* renamed from: a */
    public void mo127797a(List<String> list) {
        for (String str : list) {
            if (!TextUtils.equals(this.f89312f.mo127732c(), str)) {
                this.mRecommendTitleGroup.addView(m134374c(str));
            }
        }
    }

    public AvatarEditView(AbstractC34588a aVar, Activity activity, int i) {
        this.f89310d = aVar;
        this.f89309c = activity;
        this.f89318l = i;
        this.f89312f = new C34565a.C34567a().mo127739a();
        this.f89315i = C57811b.m224340a((Context) activity, (int) R.drawable.modify_avatar_loading, UIHelper.getString(R.string.Lark_Legacy_Uploading), true);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b
    /* renamed from: a */
    public void mo127794a(int i, String str, AvatarMeta.Type type) {
        if (type == AvatarMeta.Type.UPLOAD || type == AvatarMeta.Type.UNKNOWN) {
            C34565a.C34567a aVar = new C34565a.C34567a();
            aVar.mo127738a(mo127765a());
            aVar.mo127740b(mo127779c());
            C34565a a = aVar.mo127739a();
            this.f89312f = a;
            mo127795a(a);
        } else if (type == AvatarMeta.Type.RANDOM) {
            C34565a a2 = new C34565a.C34567a().mo127737a(m134379e(i)).mo127739a();
            this.f89312f = a2;
            mo127795a(a2);
            m134371b(i);
        } else if (type == AvatarMeta.Type.WORDS) {
            C34565a a3 = new C34565a.C34567a().mo127737a(m134379e(i)).mo127741c(str).mo127739a();
            this.f89312f = a3;
            mo127795a(a3);
            m134371b(i);
            m134378d(str);
        }
    }
}
