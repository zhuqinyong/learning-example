package com.example.config;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 插件持久化
 */
@State(name = "common.persist",storages = {@Storage("$APP_CONFIG$/common.xml")})
public class CommonPersistentEntity implements PersistentStateComponent<CommonPersistentEntity> {

    /**
     * 必须有get set方法  不然不起作用
     */
    private String entity="{}";

    /**
     * 返回配置插件实例
     * @return
     */
    private static CommonPersistentEntity instance() {
        return ServiceManager.getService(CommonPersistentEntity.class);
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    public @Nullable CommonPersistentEntity getState() {
        return null;
    }

    @Override
    public void loadState(@NotNull CommonPersistentEntity state) {
        XmlSerializerUtil.copyBean(state,this);
    }
}
