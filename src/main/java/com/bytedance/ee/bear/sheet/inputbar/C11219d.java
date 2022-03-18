package com.bytedance.ee.bear.sheet.inputbar;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.edit.component.document.AbstractC7593a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetInputData;
import com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.d */
public class C11219d extends AbstractC7593a {
    private C1177w<ToolbarItemEnum> mClickedToolbarItem = new C1177w<>();
    private C1177w<Integer> mCustomKeyboardHeight = new C1177w<>();
    private String mDateKeyboardCurType = "date";
    private C1177w<String> mDateType = new C1177w<>();
    private AbstractC11188a mEditDelegate;
    private C1177w<Editable> mEditable = new C1177w<>();
    private C1177w<String> mFormat = new C1177w<>();
    private C1177w<SheetInputData.InputData> mInput = new C1177w<>();
    private int mInputHeight;
    private C1177w<Boolean> mIsExpand = new C1177w<>();
    private C1177w<Boolean> mIsHideFab = new C1177w<>();
    private List<BaseSegment> mSegment;
    private int mSystemKeyboardHeight;
    private C1177w<SheetInputData.SheetToolbarItem[]> mToolbarItems = new C1177w<>();

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "sheet_editor";
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return true;
    }

    public C1177w<Integer> getCustomKeyboardHeight() {
        return this.mCustomKeyboardHeight;
    }

    public String getDateKeyboardCurType() {
        return this.mDateKeyboardCurType;
    }

    public C1177w<String> getDateType() {
        return this.mDateType;
    }

    public AbstractC11188a getEditDelegate() {
        return this.mEditDelegate;
    }

    public C1177w<Editable> getEditable() {
        return this.mEditable;
    }

    public C1177w<String> getFormat() {
        return this.mFormat;
    }

    public C1177w<SheetInputData.InputData> getInputData() {
        return this.mInput;
    }

    public int getInputHeight() {
        return this.mInputHeight;
    }

    public List<BaseSegment> getSegment() {
        return this.mSegment;
    }

    public C1177w<SheetInputData.SheetToolbarItem[]> getToolbarItems() {
        return this.mToolbarItems;
    }

    public C1177w<Boolean> isExpand() {
        return this.mIsExpand;
    }

    public C1177w<Boolean> isHideFab() {
        return this.mIsHideFab;
    }

    public C1177w<ToolbarItemEnum> onToolbarItemClicked() {
        return this.mClickedToolbarItem;
    }

    public String[] getBadges() {
        ArrayList arrayList = new ArrayList();
        SheetInputData.SheetToolbarItem[] b = this.mToolbarItems.mo5927b();
        if (b != null) {
            for (SheetInputData.SheetToolbarItem sheetToolbarItem : b) {
                if (sheetToolbarItem.isBadged()) {
                    arrayList.add(sheetToolbarItem.getId());
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void setDateKeyboardCurType(String str) {
        this.mDateKeyboardCurType = str;
    }

    public void setEditDelegate(AbstractC11188a aVar) {
        this.mEditDelegate = aVar;
    }

    public void setInputHeight(int i) {
        this.mInputHeight = i;
    }

    public void setSegment(List<BaseSegment> list) {
        this.mSegment = list;
    }

    public void setSystemKeyboardHeight(int i) {
        this.mSystemKeyboardHeight = i;
    }

    public void notifyToolbarItemClicked(ToolbarItemEnum toolbarItemEnum) {
        this.mClickedToolbarItem.mo5929b(toolbarItemEnum);
    }

    public void setEditable(Editable editable) {
        this.mEditable.mo5929b(editable);
    }

    public void setExpand(Boolean bool) {
        this.mIsExpand.mo5929b(bool);
    }

    public void setHideFab(Boolean bool) {
        this.mIsHideFab.mo5929b(bool);
    }

    public void setToolbarItems(SheetInputData.SheetToolbarItem[] sheetToolbarItemArr) {
        this.mToolbarItems.mo5929b(sheetToolbarItemArr);
    }

    public void updateInput(SheetInputData.InputData inputData) {
        this.mInput.mo5929b(inputData);
        this.mFormat.mo5929b(inputData.getFormat());
    }

    public int getSheetKeyboardFixedHeight(Activity activity) {
        float j = (float) AbstractC10550f.AbstractC10551a.m43717b(activity).mo39936j();
        float dimensionPixelSize = (float) activity.getResources().getDimensionPixelSize(R.dimen.sheet_keyboard_height);
        if (dimensionPixelSize > j || j > 1.1f * dimensionPixelSize) {
            j = dimensionPixelSize;
        }
        return (int) j;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        int i;
        String str;
        boolean equals = "text".equals(this.mFormat.mo5927b());
        if (equals || this.mCustomKeyboardHeight.mo5927b() == null || this.mSystemKeyboardHeight != 0) {
            i = 0;
        } else {
            i = this.mCustomKeyboardHeight.mo5927b().intValue();
        }
        int i2 = this.mInputHeight;
        if (i2 == 0) {
            i2 = context.getResources().getDimensionPixelSize(R.dimen.sheet_edit_inputbar_height);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.sheet_edit_toolbar_height);
        StringBuilder sb = new StringBuilder();
        sb.append("isKeyboardShowing: ");
        if (equals) {
            str = "true";
        } else {
            str = "false";
        }
        sb.append(str);
        sb.append(" marginBottom: ");
        sb.append(i);
        C13479a.m54772d("SheetEditViewModel", sb.toString());
        return dimensionPixelSize + i2 + i;
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
        C13479a.m54772d("SheetEditViewModel", "requestUpdateWebContentHeight");
        bVar.requestUpdateWebContentHeight(200);
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
        setActive(false);
        this.mInputHeight = 0;
        this.mSystemKeyboardHeight = 0;
    }
}
