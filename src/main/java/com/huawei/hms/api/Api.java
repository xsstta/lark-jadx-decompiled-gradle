package com.huawei.hms.api;

import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.Collections;
import java.util.List;

public class Api<O extends ApiOptions> {

    /* renamed from: a */
    private final String f57785a;

    /* renamed from: b */
    private final Options<O> f57786b;
    public List<ConnectionPostProcessor> mConnetctPostList;

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public String getApiName() {
        return this.f57785a;
    }

    public Options<O> getOptions() {
        return this.f57786b;
    }

    public List<ConnectionPostProcessor> getmConnetctPostList() {
        return this.mConnetctPostList;
    }

    public void setmConnetctPostList(List<ConnectionPostProcessor> list) {
        this.mConnetctPostList = list;
    }

    public static abstract class Options<O> {
        public List<PermissionInfo> getPermissionInfoList(O o) {
            return Collections.emptyList();
        }

        public List<Scope> getScopeList(O o) {
            return Collections.emptyList();
        }
    }

    public Api(String str) {
        this.f57785a = str;
        this.f57786b = null;
    }

    public Api(String str, Options<O> options) {
        this.f57785a = str;
        this.f57786b = options;
    }
}
