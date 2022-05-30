package com.example.config;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * 通用配置类
 */
public class CommonPersistentConfig implements SearchableConfigurable {
    private CommonPersistentConfigUI ui=new CommonPersistentConfigUI();
    @Override
    public @NotNull @NonNls String getId() {
        return "common.plugin.id";
    }

    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return "LE配置点";
    }

    @Override
    public @Nullable JComponent createComponent() {
        return ui.getRoot();
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }
}
