package com.bytedance.ee.bear.doc.translate;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.doc.translate.f */
public class C5579f extends AbstractC1142af {
    private C1177w<Original> activeOriginal = new C1177w<>();
    private int activeOriginalPanelHeight;
    private C1177w<List<LanguageModel>> chooseLanguages = new C1177w<>();
    private AbstractC5580a onLanguageSelectListener;
    private RecentUsedLanguageModel recentUsedLanguageModel = ((RecentUsedLanguageModel) UserSP.getInstance().getJSONObject("CCM_recent_translate_languages", RecentUsedLanguageModel.class));
    private C1177w<List<LanguageModel>> recentlyLanguages = new C1177w<>();
    private C1177w<LanguageModel> selectedLanguage = new C1177w<>();
    private C1177w<Boolean> showingActiveOriginalPanel = new C1177w<>();
    private C1177w<Boolean> showingChooseLanguagePanel = new C1177w<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.doc.translate.f$a */
    public interface AbstractC5580a {
        void onSelect(String str);
    }

    /* access modifiers changed from: package-private */
    public LiveData<Original> getActiveOriginal() {
        return this.activeOriginal;
    }

    /* access modifiers changed from: package-private */
    public int getActiveOriginalPanelHeight() {
        return this.activeOriginalPanelHeight;
    }

    public C1177w<List<LanguageModel>> getChooseLanguages() {
        return this.chooseLanguages;
    }

    public C1177w<LanguageModel> getSelectedLanguage() {
        return this.selectedLanguage;
    }

    /* access modifiers changed from: package-private */
    public LiveData<Boolean> getShowingActiveOriginalPanel() {
        return this.showingActiveOriginalPanel;
    }

    public C1177w<Boolean> getShowingChooseLanguagePanel() {
        return this.showingChooseLanguagePanel;
    }

    private void storeRecentLanguage() {
        UserSP.getInstance().putJSONObject("CCM_recent_translate_languages", this.recentUsedLanguageModel);
    }

    /* access modifiers changed from: package-private */
    public void onActiveOriginalPanelDismissed() {
        this.activeOriginalPanelHeight = 0;
        this.showingActiveOriginalPanel.mo5929b((Boolean) false);
    }

    public C1177w<List<LanguageModel>> getRecentlyUsedLanguages() {
        if (this.recentUsedLanguageModel == null) {
            this.recentUsedLanguageModel = new RecentUsedLanguageModel();
        }
        List<LanguageModel> languages = this.recentUsedLanguageModel.getLanguages();
        List<LanguageModel> arrayList = new ArrayList<>();
        List<LanguageModel> b = getChooseLanguages().mo5927b();
        if (languages == null) {
            languages = new ArrayList<>();
            arrayList = languages;
        }
        if (!languages.isEmpty() && b != null) {
            for (int i = 0; i < languages.size(); i++) {
                LanguageModel languageModel = languages.get(i);
                if (languageModel == null) {
                    C13479a.m54758a("TranslateViewModel", "Stored recent language model is null!");
                } else {
                    for (int i2 = 0; i2 < b.size(); i2++) {
                        LanguageModel languageModel2 = b.get(i2);
                        if (TextUtils.equals(languageModel.getTag(), languageModel2.getTag())) {
                            languageModel.setDisplayText(languageModel2.getDisplayText());
                            arrayList.add(languageModel);
                        }
                    }
                }
            }
        }
        this.recentUsedLanguageModel.setLanguages(arrayList);
        storeRecentLanguage();
        this.recentlyLanguages.mo5929b(arrayList);
        return this.recentlyLanguages;
    }

    public void setOnLanguageSelectListener(AbstractC5580a aVar) {
        this.onLanguageSelectListener = aVar;
    }

    /* access modifiers changed from: package-private */
    public void setActiveOriginal(Original original) {
        this.activeOriginal.mo5929b(original);
    }

    public void setChooseLanguages(List<LanguageModel> list) {
        this.chooseLanguages.mo5929b(list);
    }

    public void setSelectedLanguage(LanguageModel languageModel) {
        this.selectedLanguage.mo5929b(languageModel);
    }

    public void setShowingChooseLanguageFragment(Boolean bool) {
        this.showingChooseLanguagePanel.mo5929b(bool);
    }

    /* access modifiers changed from: package-private */
    public void onActiveOriginalPanelShown(int i) {
        this.activeOriginalPanelHeight = i;
        this.showingActiveOriginalPanel.mo5929b((Boolean) true);
    }

    /* access modifiers changed from: package-private */
    public void onSelectLanguage(LanguageModel languageModel) {
        setSelectedLanguage(languageModel);
        RecentUsedLanguageModel recentUsedLanguageModel2 = this.recentUsedLanguageModel;
        if (recentUsedLanguageModel2 != null) {
            recentUsedLanguageModel2.insert(languageModel);
            storeRecentLanguage();
            this.recentlyLanguages.mo5929b(this.recentUsedLanguageModel.getLanguages());
        }
        AbstractC5580a aVar = this.onLanguageSelectListener;
        if (aVar != null) {
            aVar.onSelect(languageModel.getTag());
        }
    }
}
