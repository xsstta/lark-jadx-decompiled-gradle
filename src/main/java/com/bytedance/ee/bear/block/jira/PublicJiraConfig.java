package com.bytedance.ee.bear.block.jira;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig;", "", "()V", "value", "Lkotlin/Function0;", "Lcom/bytedance/ee/bear/block/jira/JiraConfig;", "getValue", "()Lkotlin/jvm/functions/Function0;", "setValue", "(Lkotlin/jvm/functions/Function0;)V", "DefaultConfig", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PublicJiraConfig {

    /* renamed from: a */
    private Function0<JiraConfig> f14430a = C4908a.INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "jiraConfig", "Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean;", "getJiraConfig", "()Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean;", "setJiraConfig", "(Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean;)V", "JiraConfigBean", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class DefaultConfig implements NonProguard {
        private JiraConfigBean jiraConfig = new JiraConfigBean();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "linkInterceptConfig", "Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean$LinkInterceptConfigBean;", "getLinkInterceptConfig", "()Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean$LinkInterceptConfigBean;", "setLinkInterceptConfig", "(Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean$LinkInterceptConfigBean;)V", "LinkInterceptConfigBean", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class JiraConfigBean implements NonProguard {
            private LinkInterceptConfigBean linkInterceptConfig = new LinkInterceptConfigBean();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/PublicJiraConfig$DefaultConfig$JiraConfigBean$LinkInterceptConfigBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "domain", "", "", "getDomain", "()Ljava/util/List;", "setDomain", "(Ljava/util/List;)V", "isEnable", "", "()Z", "setEnable", "(Z)V", "packageName", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "topDomain", "getTopDomain", "setTopDomain", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            public static final class LinkInterceptConfigBean implements NonProguard {
                private List<String> domain = CollectionsKt.mutableListOf("atlassian.net", "id.atlassian.com", "id.dev.internal.atlassian.com", "com.atlassian.android.jira.core", "id.stg.internal.atlassian.com");
                private boolean isEnable = true;
                private String packageName = "com.atlassian.android.jira.core";
                private List<String> topDomain = CollectionsKt.mutableListOf("atlassian.net", "jira.com", "jira-dev.com");

                public final List<String> getDomain() {
                    return this.domain;
                }

                public final String getPackageName() {
                    return this.packageName;
                }

                public final List<String> getTopDomain() {
                    return this.topDomain;
                }

                public final boolean isEnable() {
                    return this.isEnable;
                }

                public final void setEnable(boolean z) {
                    this.isEnable = z;
                }

                public final void setDomain(List<String> list) {
                    Intrinsics.checkParameterIsNotNull(list, "<set-?>");
                    this.domain = list;
                }

                public final void setPackageName(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                    this.packageName = str;
                }

                public final void setTopDomain(List<String> list) {
                    Intrinsics.checkParameterIsNotNull(list, "<set-?>");
                    this.topDomain = list;
                }
            }

            public final LinkInterceptConfigBean getLinkInterceptConfig() {
                return this.linkInterceptConfig;
            }

            public final void setLinkInterceptConfig(LinkInterceptConfigBean linkInterceptConfigBean) {
                Intrinsics.checkParameterIsNotNull(linkInterceptConfigBean, "<set-?>");
                this.linkInterceptConfig = linkInterceptConfigBean;
            }
        }

        public final JiraConfigBean getJiraConfig() {
            return this.jiraConfig;
        }

        public final void setJiraConfig(JiraConfigBean jiraConfigBean) {
            Intrinsics.checkParameterIsNotNull(jiraConfigBean, "<set-?>");
            this.jiraConfig = jiraConfigBean;
        }
    }

    /* renamed from: a */
    public final Function0<JiraConfig> mo19264a() {
        return this.f14430a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/block/jira/JiraConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.PublicJiraConfig$a */
    static final class C4908a extends Lambda implements Function0<JiraConfig> {
        public static final C4908a INSTANCE = new C4908a();

        C4908a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JiraConfig invoke() {
            return C4916c.m20228a(C49091.INSTANCE);
        }
    }
}
