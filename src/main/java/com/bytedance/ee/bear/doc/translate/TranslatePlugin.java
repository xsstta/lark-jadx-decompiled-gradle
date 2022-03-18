package com.bytedance.ee.bear.doc.translate;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.doc.translate.C5579f;
import com.bytedance.ee.bear.doc.translate.TranslatePlugin;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.menu.AbstractC5872a;
import com.bytedance.ee.bear.document.menu.MenuData;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class TranslatePlugin extends DocumentPlugin {
    public Animation dismissAnimation;
    private boolean enableTranslate;
    public GestureDetector gestureDetector;
    public C5564b languageSwitchHandler;
    public View languageViewGroup;
    private ChooseLanguageFragment mChooseLanguageFragment;
    private View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        /* class com.bytedance.ee.bear.doc.translate.TranslatePlugin.View$OnTouchListenerC55571 */

        public boolean onTouch(View view, MotionEvent motionEvent) {
            TranslatePlugin.this.gestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    };
    private TextView originalLanguageView;
    private int restoredLanguageSwitchVisible;
    public Animation showAnimation;
    private View switchLangugeView;
    private ImageView translateChooseIcon;
    private TextView translateLanguageView;
    private ImageView translateSwitchIcon;
    public C5579f translateViewModel;

    public static class EnableData implements NonProguard {
        public boolean enable;
    }

    public static class Translation implements BaseJSModel {
        public boolean enableTranslate;
    }

    public static class VisibleData implements NonProguard {
        public boolean visible;
    }

    public View getLanguageViewGroup() {
        return this.languageViewGroup;
    }

    /* access modifiers changed from: package-private */
    public boolean isEnableTranslate() {
        return this.enableTranslate;
    }

    private void showLanguageSwitcherIfNeed() {
        View view = this.languageViewGroup;
        if (view != null) {
            view.setVisibility(this.restoredLanguageSwitchVisible);
        }
    }

    /* access modifiers changed from: package-private */
    public void translate() {
        getWeb().mo19428a("javascript:window.lark.biz.translate.translate", new JSONObject());
    }

    private void hideLanguageSwitcherIfNeed() {
        View view = this.languageViewGroup;
        if (view != null) {
            this.restoredLanguageSwitchVisible = view.getVisibility();
            if (this.languageViewGroup.getVisibility() == 0) {
                this.languageViewGroup.setVisibility(4);
            }
        }
    }

    private void ensureChooseLanguageFragment() {
        if (this.mChooseLanguageFragment == null) {
            ChooseLanguageFragment cVar = (ChooseLanguageFragment) Fragment.instantiate(getActivity(), ChooseLanguageFragment.class.getName());
            this.mChooseLanguageFragment = cVar;
            cVar.mo22227a(getHost());
        }
        this.mChooseLanguageFragment.mo5511a(getActivity().getSupportFragmentManager(), ChooseLanguageFragment.class.getName());
    }

    private void registerObservers() {
        this.translateViewModel.getActiveOriginal().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.translate.$$Lambda$TranslatePlugin$DmX9ZiHcIKQ_dQGJARLp3FTlf8o */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                TranslatePlugin.this.lambda$registerObservers$0$TranslatePlugin((Original) obj);
            }
        });
        this.translateViewModel.getShowingChooseLanguagePanel().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.translate.$$Lambda$TranslatePlugin$pz19iRYd9VtZYBJlhVV5r0sKWU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                TranslatePlugin.this.lambda$registerObservers$1$TranslatePlugin((Boolean) obj);
            }
        });
        this.translateViewModel.getShowingActiveOriginalPanel().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.translate.$$Lambda$TranslatePlugin$fnYNboprzXXCkbF3zJyCJyxPtsw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                TranslatePlugin.this.lambda$registerObservers$2$TranslatePlugin((Boolean) obj);
            }
        });
    }

    public void dismissLanguageSwitcher() {
        View view = this.languageViewGroup;
        if (view != null && view.getVisibility() == 0) {
            Animation animation = this.dismissAnimation;
            if (animation == null || animation.hasEnded()) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.translate_top_to_bottom);
                this.dismissAnimation = loadAnimation;
                loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC5578e() {
                    /* class com.bytedance.ee.bear.doc.translate.TranslatePlugin.C55626 */

                    @Override // com.bytedance.ee.bear.doc.translate.animationAnimation$AnimationListenerC5578e
                    public void onAnimationEnd(Animation animation) {
                        TranslatePlugin.this.dismissAnimation = null;
                        TranslatePlugin.this.languageViewGroup.setVisibility(4);
                    }
                });
                this.languageViewGroup.startAnimation(this.dismissAnimation);
            }
        }
    }

    public boolean hasShowOriginalMenu() {
        List<MenuItem> b = this.languageSwitchHandler.mo23589b();
        if (b == null || b.isEmpty() || !"SWITCH_LANG_ORIGINAL".equals(b.get(0).getId())) {
            return false;
        }
        return true;
    }

    private void ensureLanguageSwitcherView() {
        if (this.languageViewGroup == null) {
            AbstractC4958n uIContainer = getUIContainer();
            View a = uIContainer.mo19584a(this, R.layout.docs_translate_language_switch);
            this.languageViewGroup = a;
            C13747j.m55726a(a, (int) R.color.bg_body);
            this.switchLangugeView = uIContainer.mo19583a(R.id.doc_translate_switch);
            this.originalLanguageView = (TextView) uIContainer.mo19583a(R.id.originalLanguage);
            this.translateLanguageView = (TextView) uIContainer.mo19583a(R.id.translateLanguage);
            this.translateChooseIcon = (ImageView) uIContainer.mo19583a(R.id.doc_translate_choose_icon);
            this.translateSwitchIcon = (ImageView) uIContainer.mo19583a(R.id.doc_translate_switch_icon);
            C13747j.m55728a(this.translateChooseIcon, (int) R.color.icon_n1);
            C13747j.m55728a(this.translateSwitchIcon, (int) R.color.icon_n1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.translate.TranslatePlugin$b */
    public class C5564b extends AbstractC5872a<TranslateMenuData> {
        /* renamed from: a */
        public void mo22212a() {
            if (mo23590c() != null && (mo23590c() instanceof TranslateMenuData)) {
                TranslateMenuData translateMenuData = (TranslateMenuData) mo23590c();
                List<String> languages = translateMenuData.getLanguages();
                List<String> display_languages = translateMenuData.getDisplay_languages();
                if (languages == null || display_languages == null || languages.isEmpty() || languages.size() != display_languages.size()) {
                    C13479a.m54775e("TranslatePlugin", "Failed to show ChooseTranslateLanguageFragment. TranslateData:" + translateMenuData);
                    return;
                }
                TranslatePlugin.this.translateViewModel.setShowingChooseLanguageFragment(true);
                TranslatePlugin.this.translateViewModel.setChooseLanguages(LanguageModel.buildLanguageModelList((String[]) languages.toArray(new String[0]), (String[]) display_languages.toArray(new String[0])));
                int display_language_index = translateMenuData.getDisplay_language_index();
                if (display_language_index < 0 || display_language_index >= display_languages.size()) {
                    C13479a.m54758a("TranslatePlugin", "Displaying language index[ " + display_language_index + "] is invalid ! listSize=" + display_languages.size());
                } else {
                    TranslatePlugin.this.translateViewModel.setSelectedLanguage(LanguageModel.buildLanguageModel(languages.get(display_language_index), display_languages.get(display_language_index)));
                }
                TranslatePlugin.this.translateViewModel.setOnLanguageSelectListener(new C5579f.AbstractC5580a() {
                    /* class com.bytedance.ee.bear.doc.translate.$$Lambda$TranslatePlugin$b$akRgoJIqaljn3huyGWrUVH6JtRU */

                    @Override // com.bytedance.ee.bear.doc.translate.C5579f.AbstractC5580a
                    public final void onSelect(String str) {
                        TranslatePlugin.C5564b.this.m22560c((TranslatePlugin.C5564b) str);
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.document.menu.AbstractC5872a
        /* renamed from: b */
        public void mo22213b(List<MenuItem> list) {
            super.mo22213b(list);
            if (!TranslatePlugin.this.hasShowOriginalMenu()) {
                TranslatePlugin.this.dismissLanguageSwitcher();
            } else {
                TranslatePlugin.this.showLanguageSwitcher();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m22560c(String str) {
            C13479a.m54772d("TranslatePlugin", "Choose language: " + str);
            if (this.f16435b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) "SWITCH_LANG_TRANSLATE");
                jSONObject.put("target_lang", (Object) str);
                this.f16435b.mo17188a(jSONObject);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.document.menu.AbstractC5872a
        /* renamed from: a */
        public List<MenuItem> mo22211a(List<MenuItem> list) {
            if (list != null) {
                Iterator<MenuItem> it = list.iterator();
                while (it.hasNext()) {
                    String id = it.next().getId();
                    if (!"SWITCH_LANG_ORIGINAL".equals(id) && !"SWITCH_LANG_TRANSLATE".equals(id)) {
                        it.remove();
                    }
                }
            }
            return list;
        }

        C5564b(C6095s sVar) {
            super(sVar.mo19562e(), sVar.mo24598m());
        }
    }

    public void showLanguageSwitcher() {
        if (hasShowOriginalMenu()) {
            ensureLanguageSwitcherView();
            List<MenuItem> b = this.languageSwitchHandler.mo23589b();
            if (b != null && !b.isEmpty()) {
                final MenuItem menuItem = b.get(0);
                MenuData c = this.languageSwitchHandler.mo23590c();
                if (!(c instanceof TranslateMenuData)) {
                    C13479a.m54758a("TranslatePlugin", "showLanguageSwitcher()... is not translate");
                    return;
                }
                setTranslateSwitchText((TranslateMenuData) c);
                this.languageViewGroup.setOnClickListener(null);
                this.originalLanguageView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.doc.translate.TranslatePlugin.C55593 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        TranslatePlugin.this.languageSwitchHandler.mo23584a(menuItem, view);
                    }
                });
                this.switchLangugeView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.doc.translate.TranslatePlugin.C55604 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        TranslatePlugin.this.languageSwitchHandler.mo22212a();
                    }
                });
                if (this.languageViewGroup.getVisibility() != 0) {
                    this.languageViewGroup.setVisibility(0);
                    Animation animation = this.showAnimation;
                    if (animation == null || animation.hasEnded()) {
                        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.translate_to_top_in);
                        this.showAnimation = loadAnimation;
                        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC5578e() {
                            /* class com.bytedance.ee.bear.doc.translate.TranslatePlugin.C55615 */

                            @Override // com.bytedance.ee.bear.doc.translate.animationAnimation$AnimationListenerC5578e
                            public void onAnimationEnd(Animation animation) {
                                TranslatePlugin.this.showAnimation = null;
                            }
                        });
                        this.languageViewGroup.startAnimation(this.showAnimation);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.translate.TranslatePlugin$a */
    public class C5563a implements AbstractC7945d<ChooseLanguageData> {

        /* renamed from: b */
        private AbstractC7947h f15791b;

        private C5563a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m22558a(String str) {
            C13479a.m54772d("TranslatePlugin", "Choose language: " + str);
            if (this.f15791b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("language", (Object) str);
                this.f15791b.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(ChooseLanguageData chooseLanguageData, AbstractC7947h hVar) {
            C13479a.m54764b("TranslatePlugin", "choose language:" + chooseLanguageData);
            this.f15791b = hVar;
            if (ChooseLanguageData.validate(chooseLanguageData)) {
                TranslatePlugin.this.translateViewModel.setShowingChooseLanguageFragment(true);
                TranslatePlugin.this.translateViewModel.setChooseLanguages(LanguageModel.buildLanguageModelList(chooseLanguageData.languages, chooseLanguageData.display_languages));
                TranslatePlugin.this.translateViewModel.setSelectedLanguage(null);
                TranslatePlugin.this.translateViewModel.setOnLanguageSelectListener(new C5579f.AbstractC5580a() {
                    /* class com.bytedance.ee.bear.doc.translate.$$Lambda$TranslatePlugin$a$k78nOLyvvJEA5pwx4Oyhjch8Gk */

                    @Override // com.bytedance.ee.bear.doc.translate.C5579f.AbstractC5580a
                    public final void onSelect(String str) {
                        TranslatePlugin.C5563a.this.m22558a(str);
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.translate.TranslatePlugin$c */
    private class C5565c implements AbstractC7945d<EnableData> {
        private C5565c() {
        }

        /* renamed from: a */
        public void handle(EnableData enableData, AbstractC7947h hVar) {
            boolean z;
            if (enableData == null || !enableData.enable) {
                z = false;
            } else {
                z = true;
            }
            TranslatePlugin.this.getWeb().mo19435b().setNestedScrollingEnabled(z);
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.translate.TranslatePlugin$d */
    private class C5566d implements AbstractC7945d<Translation> {
        private C5566d() {
        }

        /* renamed from: a */
        public void handle(Translation translation, AbstractC7947h hVar) {
            boolean z;
            TranslatePlugin translatePlugin = TranslatePlugin.this;
            if (translation == null || !translation.enableTranslate) {
                z = false;
            } else {
                z = true;
            }
            translatePlugin.updateTranslateMenu(z);
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.translate.TranslatePlugin$e */
    private class C5567e implements AbstractC7945d<VisibleData> {
        private C5567e() {
        }

        /* renamed from: a */
        public void handle(VisibleData visibleData, AbstractC7947h hVar) {
            boolean z;
            int i = 0;
            if (visibleData == null || !visibleData.visible) {
                z = false;
            } else {
                z = true;
            }
            if (TranslatePlugin.this.languageViewGroup != null) {
                View view = TranslatePlugin.this.languageViewGroup;
                if (!z) {
                    i = 4;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.translate.TranslatePlugin$f */
    private class C5568f implements AbstractC7945d<Original> {
        private C5568f() {
        }

        /* renamed from: a */
        public void handle(Original original, AbstractC7947h hVar) {
            TranslatePlugin.this.translateViewModel.setActiveOriginal(original);
        }
    }

    public /* synthetic */ void lambda$registerObservers$1$TranslatePlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            ensureChooseLanguageFragment();
            hideLanguageSwitcherIfNeed();
            return;
        }
        ChooseLanguageFragment cVar = this.mChooseLanguageFragment;
        if (cVar != null) {
            cVar.mo5513b();
        }
        showLanguageSwitcherIfNeed();
    }

    public void updateTranslateMenu(boolean z) {
        this.enableTranslate = z;
        C13479a.m54764b("TranslatePlugin", "Update translate enable:" + z);
    }

    private void notifyOriginalPanelHeight(int i) {
        int b = C13749l.m55749b(i);
        C13479a.m54772d("TranslatePlugin", "notifyOriginalPanelHeight:" + b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("height", (Object) Integer.valueOf(b));
        execJS(String.format(Locale.US, "javascript:lark.biz.util.setPanelHeight", new Object[0]), jSONObject);
    }

    public /* synthetic */ void lambda$registerObservers$0$TranslatePlugin(Original original) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("onAttachToUIContainer.observe()... original =");
        if (original == null) {
            str = "";
        } else {
            str = original.text;
        }
        sb.append(str);
        C13479a.m54764b("TranslatePlugin", sb.toString());
        if (original != null) {
            ensureLanguageSwitcherView();
            addOrReplaceFragment(View$OnLayoutChangeListenerC5577d.class, null, C4957m.m20520a(R.anim.dialog_in_from_bottom, R.anim.dialog_out_to_bottom));
            return;
        }
        removeFragment();
    }

    public /* synthetic */ void lambda$registerObservers$2$TranslatePlugin(Boolean bool) {
        if (bool != null) {
            if (bool.booleanValue()) {
                getTitleBar().mo19524d(true);
            } else {
                getTitleBar().mo19522c(true);
            }
            notifyOriginalPanelHeight(this.translateViewModel.getActiveOriginalPanelHeight());
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.gestureDetector = new GestureDetector(getContext(), new AbstractC5569a(getContext()) {
            /* class com.bytedance.ee.bear.doc.translate.TranslatePlugin.C55582 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.doc.translate.AbstractC5569a
            /* renamed from: a */
            public void mo22207a() {
                if (TranslatePlugin.this.getWeb().mo19435b().isNestedScrollingEnabled()) {
                    TranslatePlugin.this.showLanguageSwitcher();
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.doc.translate.AbstractC5569a
            /* renamed from: b */
            public void mo22208b() {
                if (TranslatePlugin.this.getWeb().mo19435b().isNestedScrollingEnabled()) {
                    TranslatePlugin.this.dismissLanguageSwitcher();
                }
            }
        });
        this.translateViewModel = (C5579f) viewModel(C5579f.class);
        registerObservers();
    }

    private void setTranslateSwitchText(TranslateMenuData translateMenuData) {
        List<String> display_languages = translateMenuData.getDisplay_languages();
        int display_language_index = translateMenuData.getDisplay_language_index();
        if (display_languages == null || display_language_index < 0 || display_language_index >= display_languages.size()) {
            C13606d.m55245a("TranslatePlugin", new Throwable("Received wrong translateMenuData[displayLanguages:  " + display_languages + ", displayLanguageIndex: " + display_language_index + "]"));
            this.translateLanguageView.setText(getContext().getString(R.string.Doc_Translate_ChangeLanguage));
            return;
        }
        this.translateLanguageView.setText(translateMenuData.getDisplay_languages().get(display_language_index));
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.translate.setupTranslation", new C5566d());
        map.put("biz.translate.showOriginalLanguage", new C5568f());
        C5564b bVar = new C5564b((C6095s) getHost());
        this.languageSwitchHandler = bVar;
        map.put("biz.translate.setLangMenus", bVar);
        map.put("biz.translate.setTranslateLanguageSwitchVisible", new C5567e());
        map.put("biz.util.setEnableScroll", new C5565c());
        map.put("biz.translate.chooseLanguage", new C5563a());
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        ((DocBridgeWebViewV2) getWeb().mo19435b()).mo30807a(this.onTouchListener);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        ((DocBridgeWebViewV2) getWeb().mo19435b()).mo30812b(this.onTouchListener);
        View view = this.languageViewGroup;
        if (view != null) {
            nVar.mo19594b(this, view);
            this.languageViewGroup = null;
        }
        this.translateViewModel.setShowingChooseLanguageFragment(false);
    }
}
