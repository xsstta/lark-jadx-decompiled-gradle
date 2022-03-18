package com.bytedance.ee.bear.wiki.wikitree.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.wiki.common.p579a.C11931b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

public final class TreeNode implements Parcelable, NonProguard, Cloneable {
    public static final Parcelable.Creator<TreeNode> CREATOR = new Parcelable.Creator<TreeNode>() {
        /* class com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode.C120741 */

        /* renamed from: a */
        public TreeNode[] newArray(int i) {
            return new TreeNode[i];
        }

        /* renamed from: a */
        public TreeNode createFromParcel(Parcel parcel) {
            return new TreeNode(parcel);
        }
    };
    public String area_id;
    public int child_num;
    public List<TreeNode> child_value;
    public boolean expand;
    public String icon;
    public boolean is_star;
    public int level;
    public NodeType nodeType;
    public String obj_token;
    public int obj_type;
    public String parent;
    public int seq_id;
    public double sort_id;
    public String space_id;
    public String title;
    public String wiki_token;

    public int describeContents() {
        return 0;
    }

    private boolean isNormalNode() {
        if (this.nodeType == NodeType.ROOT || this.nodeType == NodeType.HOME) {
            return false;
        }
        return true;
    }

    public TreeNode() {
        this.child_value = CollectionUtils.checkListNull(this.child_value);
        this.level = -1;
        this.nodeType = NodeType.UNKNOWN;
        this.expand = false;
    }

    public String getDebugStatusString() {
        return String.format(" (L:%s E:%s) ", String.valueOf(this.level), String.valueOf(this.expand));
    }

    public List<TreeNode> removeAllChildren() {
        List<TreeNode> a = C13659d.m55430a((List) this.child_value);
        this.child_num = this.child_value.size();
        updateNodeType();
        return a;
    }

    public String getDebugAreaIdString() {
        String str = this.area_id;
        if (!TextUtils.isEmpty(str) && str.length() > 4) {
            str = str.substring(str.length() - 4);
        }
        return String.format(" (A:%s S:%s) ", str, String.valueOf(this.sort_id));
    }

    public String levelString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.level; i++) {
            sb.append("  ");
        }
        sb.append(" ");
        sb.append("|——");
        sb.append(" ");
        sb.append(toString());
        return sb.toString();
    }

    public void updateNodeType() {
        NodeType nodeType2;
        boolean z;
        if (!isNormalNode()) {
            nodeType2 = this.nodeType;
        } else if (this.child_num > 0) {
            nodeType2 = NodeType.DIR;
        } else {
            nodeType2 = NodeType.LEAF;
        }
        this.nodeType = nodeType2;
        if (nodeType2 == NodeType.LEAF || !this.expand) {
            z = false;
        } else {
            z = true;
        }
        this.expand = z;
    }

    @Override // java.lang.Object
    public TreeNode clone() {
        TreeNode treeNode;
        Exception e;
        TreeNode treeNode2 = new TreeNode();
        try {
            treeNode = (TreeNode) super.clone();
            try {
                List<TreeNode> list = this.child_value;
                if (list != null) {
                    treeNode.child_value = new ArrayList(this.child_value.size());
                    for (TreeNode treeNode3 : list) {
                        treeNode.child_value.add(treeNode3.clone());
                    }
                }
            } catch (Exception e2) {
                e = e2;
                C13479a.m54761a("Wiki_TreeNode", e);
                return treeNode;
            }
        } catch (Exception e3) {
            treeNode = treeNode2;
            e = e3;
            C13479a.m54761a("Wiki_TreeNode", e);
            return treeNode;
        }
        return treeNode;
    }

    public String toString() {
        return "TreeNode{title=" + C13721c.m55650d(this.title) + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", nodeType=" + this.nodeType + ", child_num='" + this.child_num + '\'' + ", level=" + this.level + ", expand=" + this.expand + ", area_id='" + this.area_id + '\'' + ", sort_id=" + this.sort_id + '}';
    }

    public void addChildren(List<TreeNode> list) {
        addChildren(Integer.MAX_VALUE, list);
    }

    public int getChildIndex(String str) {
        return C13659d.m55428a(this.child_value, new C13659d.AbstractC13660a(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.bean.$$Lambda$TreeNode$Sc0QCB6eHKf1TLQcq0BH5JmtE7c */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13660a
            public final boolean accept(Object obj) {
                return TextUtils.equals(((TreeNode) obj).wiki_token, this.f$0);
            }
        });
    }

    public /* synthetic */ void lambda$addChildren$0$TreeNode(TreeNode treeNode) {
        treeNode.parent = this.wiki_token;
        treeNode.level = this.level + 1;
    }

    public void increaseChildNum(int i) {
        if (C13657b.m55421a(this.child_value)) {
            this.child_num += i;
            updateNodeType();
        }
    }

    public TreeNode removeChild(String str) {
        TreeNode treeNode = (TreeNode) C13659d.m55434c(this.child_value, new C13659d.AbstractC13660a(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.bean.$$Lambda$TreeNode$dg2sPpe4IGrllx3GdHRNAkwBTmM */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13660a
            public final boolean accept(Object obj) {
                return TextUtils.equals(((TreeNode) obj).wiki_token, this.f$0);
            }
        });
        this.child_num = this.child_value.size();
        updateNodeType();
        return treeNode;
    }

    public void setExpand(boolean z) {
        if (this.nodeType == NodeType.DIR && !C13657b.m55421a(this.child_value)) {
            this.expand = z;
        }
    }

    public static TreeNode createRoot(String str) {
        return new TreeNode(0, "", 0, 0, str, "", str, "", "", false, "", 0.0d, null, NodeType.ROOT, 0, true);
    }

    protected TreeNode(Parcel parcel) {
        this.child_num = parcel.readInt();
        this.obj_token = parcel.readString();
        this.obj_type = parcel.readInt();
        this.seq_id = parcel.readInt();
        this.space_id = parcel.readString();
        this.title = parcel.readString();
        this.wiki_token = parcel.readString();
        this.parent = parcel.readString();
        this.child_value = parcel.createTypedArrayList(CREATOR);
    }

    public void addChildren(int i, List<TreeNode> list) {
        C13659d.m55432a(list, new C13659d.AbstractC13661b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.bean.$$Lambda$TreeNode$77ynBnlYyNRcwaACW1IrQqkVg */

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
            public final void accept(Object obj) {
                TreeNode.this.lambda$addChildren$0$TreeNode((TreeNode) obj);
            }
        });
        List<TreeNode> list2 = this.child_value;
        list2.addAll(C11931b.m49467a(i, 0, list2.size()), list);
        this.child_num = this.child_value.size();
        updateNodeType();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.child_num);
        parcel.writeString(this.obj_token);
        parcel.writeInt(this.obj_type);
        parcel.writeInt(this.seq_id);
        parcel.writeString(this.space_id);
        parcel.writeString(this.title);
        parcel.writeString(this.wiki_token);
        parcel.writeString(this.parent);
        parcel.writeTypedList(this.child_value);
    }

    public static TreeNode createHome(String str, int i, String str2, String str3) {
        return new TreeNode(0, str2, i, 0, str3, "", str, "", "", false, "", 0.0d, null, NodeType.HOME, 1, false);
    }

    public static TreeNode create(int i, String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, double d, List<TreeNode> list) {
        NodeType nodeType2;
        if (i > 0) {
            nodeType2 = NodeType.DIR;
        } else {
            nodeType2 = NodeType.LEAF;
        }
        return new TreeNode(i, str, i2, i3, str2, str3, str4, str5, str6, z, str7, d, list, nodeType2, -1, false);
    }

    private TreeNode(int i, String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, double d, List<TreeNode> list, NodeType nodeType2, int i4, boolean z2) {
        this.child_num = i;
        this.obj_token = str;
        this.obj_type = i2;
        this.seq_id = i3;
        this.space_id = str2;
        this.title = str3;
        this.wiki_token = str4;
        this.parent = str5;
        this.icon = str6;
        this.is_star = z;
        this.area_id = str7;
        this.sort_id = d;
        this.child_value = CollectionUtils.checkListNull(list);
        this.nodeType = nodeType2;
        this.level = i4;
        this.expand = z2;
    }
}
