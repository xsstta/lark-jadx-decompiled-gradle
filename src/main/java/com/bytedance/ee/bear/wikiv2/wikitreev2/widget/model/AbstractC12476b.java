package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.b */
public interface AbstractC12476b {
    void collapse(String str);

    void expand(String str);

    void favorite(String str);

    String getFocus();

    TreeNode getNode(String str);

    String getRootToken();

    SpaceInfo getSpaceInfo();

    LiveData<Result> getWikiUIList();

    C12504l getWorkspace();

    void insert(String str, int i, boolean z, String str2);

    boolean isContainInParent(String str, String str2);

    boolean isFavorite(String str);

    void load(String str, String str2, boolean z);

    void moveTo(String str, String str2, String str3, boolean z, String str4);

    void remove(String str);

    AbstractC68307f<WikNodePerm> requestNodePerm(String str);

    void setDataFilter(Function<TreeNode, Boolean> function);

    void setFavoriteEnable(boolean z);

    void setFocus(String str);

    void setPushEnable(boolean z);

    void setTagSuffix(String str);

    void shortcutTo(String str, String str2, String str3);

    void unfavorite(String str);
}
